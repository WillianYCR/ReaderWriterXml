package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceChannels {

	@XmlElement(name = "service-channel")
	private List<ServiceChannel> serviceChannel;

	public ServiceChannels() {

	}

	public ServiceChannels(List<ServiceChannel> serviceChannel) {
		super();
		this.serviceChannel = serviceChannel;
	}

	public List<ServiceChannel> getServiceChannel() {
		return serviceChannel;
	}

	public void setServiceChannel(List<ServiceChannel> serviceChannel) {
		this.serviceChannel = serviceChannel;
	}

	@Override
	public String toString() {
		return "ServiceChannels [serviceChannel=" + serviceChannel + "]";
	}

}
