package com.novatronic.xmlcliente;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sixadc-clients")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLDAS {
    
    @XmlElement(name = "sixadc-client")
    private List<SixadcClient> sixadcClient;
    
    public List<SixadcClient> getSixadcClient() {
		return sixadcClient;
	}

	public XMLDAS() {
    	sixadcClient = new ArrayList<SixadcClient>();
    }
    
    public void addSixadcClient(SixadcClient sixadcClient) {
    	this.sixadcClient.add(sixadcClient);
    }

    
    private static XMLDAS cargarSixadcClient(XMLDAS xmldas){
    	
    	List<Atributo> atributo;
    	List<String> ipAddress;
    	List<String> profileId;
    	Atributos atributos;
    	IpAddresses ipAddresses;
    	SixadcClientProfiles sixadcClientProfiles;
    	SixadcClient sixadcClient;
    	//SixadcClient1
    	atributo = new ArrayList<Atributo>();
    	atributo.add(new Atributo("binAdq", "222185", ""));
    	atributos = new Atributos(atributo);
    	ipAddress = new ArrayList<String>();
    	ipAddress.add(new String("172.19.103.29"));
    	ipAddresses = new IpAddresses(ipAddress);
    	profileId = new ArrayList<String>();
    	profileId.add(new String("perfil1"));
    	profileId.add(new String("perfil2"));
    	sixadcClientProfiles = new SixadcClientProfiles(profileId);
    	sixadcClient = new SixadcClient("adc100", "CONEXION NAVSAT", atributos, ipAddresses, "none100", "none100", "", "true", sixadcClientProfiles);
    	xmldas.addSixadcClient(sixadcClient);
    	//SixadcClient2
    	atributo = new ArrayList<Atributo>();
    	atributo.add(new Atributo("binAdq", "222185", ""));
    	atributos = new Atributos(atributo);
    	ipAddress = new ArrayList<String>();
    	ipAddress.add(new String("172.19.103.45"));
    	ipAddresses = new IpAddresses(ipAddress);
    	profileId = new ArrayList<String>();
    	profileId.add(new String("perfil1"));
    	profileId.add(new String("perfil2"));
    	sixadcClientProfiles = new SixadcClientProfiles(profileId);
    	sixadcClient = new SixadcClient("adc100B", "CONEXION NAVSAT 2", atributos, ipAddresses, "none100", "none100b", "", "true", sixadcClientProfiles);
    	xmldas.addSixadcClient(sixadcClient);
        return xmldas;
    }
        
    private static void crearArchivoXmlDesdePojo(){
    	XMLDAS xmldas = new XMLDAS();
        xmldas = cargarSixadcClient(xmldas);
        try {

            
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLDAS.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File file = new File("sixadc-clients-config.xml");
            jaxbMarshaller.marshal(xmldas, file);
            jaxbMarshaller.marshal(xmldas, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    private static void crearPojoDesdeArchivoXml(){
    	try {

        	JAXBContext jc = JAXBContext.newInstance (XMLDAS.class);
            Unmarshaller u = jc.createUnmarshaller ();
            File f = new File ("sixadc-clients-config.xml");
            XMLDAS xmldass = (XMLDAS)u.unmarshal(f);
            
            //***************
            System.out.println("SALIDA DE XML");
            System.out.println(xmldass.getSixadcClient());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    	//crearArchivoXmlDesdePojo();
    	crearPojoDesdeArchivoXml();
    }
}
