package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Profiles {

	@XmlElement(name = "profile")
	private List<Profile> profile;

	public Profiles() {

	}

	public Profiles(List<Profile> profile) {
		super();
		this.profile = profile;
	}

	public List<Profile> getProfile() {
		return profile;
	}

	public void setProfile(List<Profile> profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Profiles [profile=" + profile + "]";
	}
}
