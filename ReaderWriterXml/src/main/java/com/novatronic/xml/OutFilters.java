package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class OutFilters {

	@XmlElement(name = "out-filter")
	private List<String> outFilter;

	public OutFilters() {
	}

	public OutFilters(List<String> outFilter) {
		super();
		this.outFilter = outFilter;
	}

	public List<String> getOutFilter() {
		return outFilter;
	}

	public void setOutFilter(List<String> outFilter) {
		this.outFilter = outFilter;
	}

	@Override
	public String toString() {
		return "OutFilters [outFilter=" + outFilter + "]";
	}

}
