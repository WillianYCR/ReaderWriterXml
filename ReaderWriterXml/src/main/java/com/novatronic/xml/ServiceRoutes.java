package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRoutes {

	@XmlElement(name = "route-id")
	private List<String> routeId;

	public ServiceRoutes() {

	}

	public ServiceRoutes(List<String> routeId) {
		super();
		this.routeId = routeId;
	}

	public List<String> getRouteId() {
		return routeId;
	}

	public void setRouteId(List<String> routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "ServiceRoutes [routeId=" + routeId + "]";
	}

}
