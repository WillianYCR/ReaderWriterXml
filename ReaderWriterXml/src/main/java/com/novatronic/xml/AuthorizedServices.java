package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AuthorizedServices {

	@XmlElement(name = "servicio-id")
	private List<String> servicioId;

	public AuthorizedServices() {

	}

	public AuthorizedServices(List<String> servicioId) {
		super();
		this.servicioId = servicioId;
	}

	public List<String> getServicioId() {
		return servicioId;
	}

	public void setServicioId(List<String> servicioId) {
		this.servicioId = servicioId;
	}

	@Override
	public String toString() {
		return "AuthorizedServices [servicioId=" + servicioId + "]";
	}

}
