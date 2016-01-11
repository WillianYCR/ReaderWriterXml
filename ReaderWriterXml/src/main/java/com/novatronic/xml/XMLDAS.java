package com.novatronic.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.novatronic.util.Constante;

@XmlRootElement(name = "sixadc-config")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLDAS {
    
    @XmlElement(name = "message-formats")
    private List<MessageFormats> messageFormats;
    @XmlElement(name = "admin-queues")
    private List<AdminQueues> adminQueues;
    @XmlElement(name = "drivers")
    private List<Drivers> drivers;
    @XmlElement(name = "balancers")
    private List<Balancers> balancers;
    @XmlElement(name = "routes")
    private List<Routes> routes;
    @XmlElement(name = "services")
    private List<Services> services;
    @XmlElement(name = "service-nodes")
    private List<ServiceNodes> serviceNodes;
    @XmlElement(name = "profiles")
    private List<Profiles> profiles;
    
    public XMLDAS() {
    	messageFormats = new ArrayList<MessageFormats>();
    	adminQueues = new ArrayList<AdminQueues>();
    	drivers = new ArrayList<Drivers>();
    	balancers = new ArrayList<Balancers>();
    	routes = new ArrayList<Routes>();
    	services = new ArrayList<Services>();
    	serviceNodes = new ArrayList<ServiceNodes>();
    	profiles = new ArrayList<Profiles>();
    }
    
    public void addMessageFormats(MessageFormats messageFormats) {
    	this.messageFormats.add(messageFormats);
    }

    public void addAdminQueues(AdminQueues adminQueues) {
    	this.adminQueues.add(adminQueues);
    }
    
    public void addDrivers(Drivers drivers) {
    	this.drivers.add(drivers);
    }
    
    public void addBalancers(Balancers balancers) {
    	this.balancers.add(balancers);
    }
    
    public void addRoutes(Routes routes) {
    	this.routes.add(routes);
    }
    
    public void addServices(Services services) {
    	this.services.add(services);
    }
    
    public void addServiceNodes(ServiceNodes serviceNodes) {
    	this.serviceNodes.add(serviceNodes);
    }
    
    public void addProfiles(Profiles profiles) {
    	this.profiles.add(profiles);
    }
    
    private static XMLDAS cargarMessageFormats(XMLDAS xmldas){
    	List<MessageFormat> listMessageFormat;

    	listMessageFormat = new ArrayList<MessageFormat>();
    	listMessageFormat.add(new MessageFormat("ISOINTST", "Tramas ISO", "transformerConfig.xml", "routerConfig.xml", "ISO8583"));
    	listMessageFormat.add(new MessageFormat("UNIINTER", "Tramas Planas", "transformer-canal-interno.xml", "configRuteo-canal-interno.xml", "PLAIN"));
    	xmldas.addMessageFormats(new MessageFormats(listMessageFormat));
    	
        return xmldas;
    }
    
    private static XMLDAS cargarAdminQueues(XMLDAS xmldas){
        
    	List<SupportedMessageFormats> listSupportedMessageFormats; 
    	List<AdminQueue> listAdminQueue;
    	MessageType messageType;
    	
    	listAdminQueue = new ArrayList<AdminQueue>();
    	//Cargar AdminQueues 1
    	listSupportedMessageFormats = new ArrayList<SupportedMessageFormats>();
    	listSupportedMessageFormats.add(new SupportedMessageFormats("ISOINTST"));
    	messageType = new MessageType("tipoMensajeSIX","Tipos de mensaje via Driver SIX",listSupportedMessageFormats);
    	listAdminQueue.add(new AdminQueue("adminCola1", "10", messageType));
    	//Cargar AdminQueues 2
    	listSupportedMessageFormats = new ArrayList<SupportedMessageFormats>();
    	listSupportedMessageFormats.add(new SupportedMessageFormats("ISOINTST"));
    	messageType = new MessageType("tipoMensajeSIX","Tipos de mensaje via Driver SIX",listSupportedMessageFormats);
    	listAdminQueue.add(new AdminQueue("adminCola2", "15", messageType));
    	
    	xmldas.addAdminQueues(new AdminQueues(Constante.Atributo.CLASS_MANAGER_ROUTERS,
    			Constante.Generico.QUEUE_LOCATION, "10", "30",listAdminQueue));
    	//n colas
        return xmldas;
    }
    
    private static XMLDAS cargarDrivers(XMLDAS xmldas){
        
    	List<String> listInfilter;
    	List<String> listOutfilter;
    	InFilters inFilters;
    	OutFilters outFilters;
    	Filters filters;
    	List<Driver> listDriver;
    	
    	listDriver = new ArrayList<Driver>();
    	//Cargar Driver 1
    	listInfilter = new ArrayList<String>();
    	listInfilter.add(new String("com.novatronic.loadbalancer.driver.filters.FromBinaryFrameFilter"));
    	listOutfilter = new ArrayList<String>();
    	listOutfilter.add(new String("com.novatronic.loadbalancer.driver.filters.ToBinaryFrameFilter"));
    	inFilters = new InFilters(listInfilter);
    	outFilters = new OutFilters(listOutfilter);
    	filters = new Filters(inFilters,outFilters);
    	listDriver.add(new Driver("driver1", "adminCola1", Constante.Type.ASYNCRONOUS, "5", "5", "5", 
    			"28","tcp_drvVISA", "4230", "50", "ISOINTST", "true", "false", filters));
    	//Cargar Driver 2
    	listInfilter = new ArrayList<String>();
    	listInfilter.add(new String("com.novatronic.loadbalancer.driver.filters.PutBinAdqFilter"));
    	listOutfilter = new ArrayList<String>();
    	listOutfilter.add(new String(""));
    	inFilters = new InFilters(listInfilter);
    	outFilters = new OutFilters(listOutfilter);
    	filters = new Filters(inFilters,outFilters);
    	listDriver.add(new Driver("driver2", "adminCola2", Constante.Type.ASYNCRONOUS, "5", "5", "5", 
    			"28","tcp_drvswi", "4220", "100", "ISOINTST", "true", "false", filters));
    	
    	xmldas.addDrivers(new Drivers(Constante.Atributo.CLASS_MANAGER_DRIVERS,
    			Constante.Generico.QUEUE_LOCATION, "10", "30", listDriver));
    	//n driver
        return xmldas;
    }
    
    private static XMLDAS cargarBalancers(XMLDAS xmldas){
    	List<Balancer> balancer;

    	balancer = new ArrayList<Balancer>();
    	balancer.add(new Balancer("balancerPPV", "ROUND_ROBIN", "15"));
    	balancer.add(new Balancer("balancerOLC", "ROUND_ROBIN", "15"));
    	balancer.add(new Balancer("balancerDefault", "ROUND_ROBIN", "5"));
    	xmldas.addBalancers(new Balancers(Constante.Atributo.CLASS_MANAGER_BALANCERS,
    			Constante.Generico.QUEUE_LOCATION, "10", "30", balancer));
        return xmldas;
    }

    private static XMLDAS cargarRoutes(XMLDAS xmldas){
    	List<Route> listRoute;

    	listRoute = new ArrayList<Route>();
    	listRoute.add(new Route("rutaServicio1", "Ruta de prueba PPV", "balancerPPV", "AVAILABLE"));
    	listRoute.add(new Route("rutaServicio2", "Ruta de prueba OLC", "balancerOLC", "AVAILABLE"));
    	xmldas.addRoutes(new Routes(listRoute));
        return xmldas;
    }
    
    private static XMLDAS cargarServices(XMLDAS xmldas){
        
    	List<Bin> listBin;
    	AuthorizationBins authorizationBins;
    	List<String> listRoutesId;
    	ServiceRoutes serviceRoutes;
    	List<Service> listService;
    	
    	listService = new ArrayList<Service>();
    	//Cargar Driver 1
    	listBin = new ArrayList<Bin>();
    	listBin.add(new Bin("808080", "AVAILABLE"));
    	authorizationBins = new AuthorizationBins(listBin);
    	listRoutesId = new ArrayList<String>();
    	listRoutesId.add("rutaServicio1");
    	serviceRoutes = new ServiceRoutes(listRoutesId);
    	listService.add(new Service("servicio1", "Servicio Prepago Virtual", "", authorizationBins, serviceRoutes));
    	
    	//Cargar Driver 2
    	listBin = new ArrayList<Bin>();
    	listBin.add(new Bin("808080", "AVAILABLE"));
    	authorizationBins = new AuthorizationBins(listBin);
    	listRoutesId = new ArrayList<String>();
    	listRoutesId.add("rutaServicio2");
    	serviceRoutes = new ServiceRoutes(listRoutesId);
    	listService.add(new Service("servicio2", "OLC", "", authorizationBins, serviceRoutes));
    	
    	xmldas.addServices(new Services(listService));
    	//n driver
        return xmldas;
    }
    
    private static XMLDAS cargarServiceNodes(XMLDAS xmldas){
        
    	AdminChannel adminChannel;
    	DefaultChannel defaultChannel;
		List<String> serviceId;
    	AuthorizedServices authorizedServices;
    	List<ServiceChannel> listServiceChannel;
    	ServiceChannels serviceChannels;
    	List<ServiceNode> listServiceNode;
    	
    	listServiceNode = new ArrayList<ServiceNode>();
    	//Cargar ServiceNodes1
    	adminChannel = new AdminChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"AQ_Node1_AdminChannel", "6660", "AVAILABLE", "120", "10", "120", "10");
     	defaultChannel = new DefaultChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"defaultChannel1", "6660", "AVAILABLE", "15", "true", "120", "10", "120", "10", "40", "100");
    	listServiceChannel = new ArrayList<ServiceChannel>();
    	serviceId = new ArrayList<String>();
    	serviceId.add(new String("servicio1"));
    	authorizedServices = new AuthorizedServices(serviceId);
    	listServiceChannel.add(new ServiceChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"servChanel1", "AVAILABLE", "6660", "15", 
    			authorizedServices, "true", "120", "10", "120", "10", "40", "100"));
    	serviceId = new ArrayList<String>();
    	serviceId.add(new String("servicio2"));
    	authorizedServices = new AuthorizedServices(serviceId);
    	listServiceChannel.add(new ServiceChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"servChanel2", "AVAILABLE", "6660", "15", 
    			authorizedServices, "true", "120", "10", "120", "10", "40", "100"));
    	serviceChannels = new ServiceChannels(listServiceChannel);
    	listServiceNode.add(new ServiceNode("Node1", "172.19.72.108", "42", adminChannel, defaultChannel, serviceChannels));
    	//Cargar ServiceNodes2
    	adminChannel = new AdminChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"AQ_Node1_AdminChanne2", "6660", "AVAILABLE", "120", "10", "120", "10");
     	defaultChannel = new DefaultChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"defaultChannel2", "6660", "AVAILABLE", "15", "true", "120", "10", "120", "10", "40", "100");
    	listServiceChannel = new ArrayList<ServiceChannel>();
    	serviceId = new ArrayList<String>();
    	serviceId.add(new String("servicio1"));
    	authorizedServices = new AuthorizedServices(serviceId);
    	listServiceChannel.add(new ServiceChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"servChanel3", "AVAILABLE", "6660", "15", 
    			authorizedServices, "true", "120", "10", "120", "10", "40", "100"));
    	serviceId = new ArrayList<String>();
    	serviceId.add(new String("servicio2"));
    	authorizedServices = new AuthorizedServices(serviceId);
    	listServiceChannel.add(new ServiceChannel("5", "130", "120", "1", "10", "30", "999", "10"
    			,"servChanel4", "AVAILABLE", "6660", "15", 
    			authorizedServices, "true", "120", "10", "120", "10", "40", "100"));
    	serviceChannels = new ServiceChannels(listServiceChannel);
    	listServiceNode.add(new ServiceNode("Node2", "172.19.76.73", "42", adminChannel, defaultChannel, serviceChannels));
    	
    	xmldas.addServiceNodes(new ServiceNodes(Constante.Atributo.CLASS_MANAGER_CHANNEL,
    			Constante.Generico.QUEUE_LOCATION, "10", "30",listServiceNode));
        return xmldas;
    }
    
    private static XMLDAS cargarProfiles(XMLDAS xmldas){
    	List<String> driverId;
    	List<String> serviceId;
    	ProfileDrivers profileDrivers;
    	AuthServices authServices;
    	List<Profile> listProfile;

    	listProfile = new ArrayList<Profile>();
    	driverId = new ArrayList<String>();
    	driverId.add("driver1");
    	driverId.add("driver2");
    	profileDrivers = new ProfileDrivers(driverId);
    	serviceId = new ArrayList<String>();
    	serviceId.add("servicio1");
    	serviceId.add("servicio2");
    	authServices = new AuthServices(serviceId);
    	listProfile.add(new Profile("perfil1", "Perfil de prueba 2", profileDrivers, authServices));
    	
    	xmldas.addProfiles(new Profiles(listProfile));
        return xmldas;
    }
    
    public static void main(String[] args) {
        XMLDAS xmldas = new XMLDAS();
        xmldas = cargarMessageFormats(xmldas);
        xmldas = cargarAdminQueues(xmldas);
        xmldas = cargarDrivers(xmldas);
        xmldas = cargarBalancers(xmldas);
        xmldas = cargarRoutes(xmldas);
        xmldas = cargarServices(xmldas);
        xmldas = cargarServiceNodes(xmldas);
        xmldas = cargarProfiles(xmldas);
        try {

            File file = new File("sixadc-config.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLDAS.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(xmldas, file);
            jaxbMarshaller.marshal(xmldas, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
