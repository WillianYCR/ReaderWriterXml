package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProfileDrivers {

	@XmlElement(name = "river-id")
	private List<String> riverId;

	public ProfileDrivers() {

	}

	public ProfileDrivers(List<String> riverId) {
		super();
		this.riverId = riverId;
	}

	public List<String> getRiverId() {
		return riverId;
	}

	public void setRiverId(List<String> riverId) {
		this.riverId = riverId;
	}

	@Override
	public String toString() {
		return "ProfileDrivers [riverId=" + riverId + "]";
	}

}
