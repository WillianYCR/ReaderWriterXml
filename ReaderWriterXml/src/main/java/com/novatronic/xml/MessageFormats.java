package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class MessageFormats {

	@XmlElement(name = "message-format")
	private List<MessageFormat> listaMessageFormat;

	public MessageFormats() {
	}

	public MessageFormats(List<MessageFormat> listaMessageFormat) {
		super();
		this.listaMessageFormat = listaMessageFormat;
	}

	public List<MessageFormat> getListaMessageFormat() {
		return listaMessageFormat;
	}

	public void setListaMessageFormat(List<MessageFormat> listaMessageFormat) {
		this.listaMessageFormat = listaMessageFormat;
	}

	@Override
	public String toString() {
		return "MessageFormats [listaMessageFormat=" + listaMessageFormat + "]";
	}

}
