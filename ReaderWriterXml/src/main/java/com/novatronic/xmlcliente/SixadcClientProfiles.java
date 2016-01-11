package com.novatronic.xmlcliente;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SixadcClientProfiles {

	@XmlElement(name = "profile-id")
	private List<String> profileId;

	public SixadcClientProfiles() {

	}

	public SixadcClientProfiles(List<String> profileId) {
		super();
		this.profileId = profileId;
	}

	public List<String> getProfileId() {
		return profileId;
	}

	public void setProfileId(List<String> profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "SixadcClientProfiles [profileId=" + profileId + "]";
	}

}
