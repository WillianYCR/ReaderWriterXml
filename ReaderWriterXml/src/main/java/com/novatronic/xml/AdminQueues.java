package com.novatronic.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AdminQueues {

	@XmlAttribute
	private String classManager;
	@XmlAttribute
	private String queueLocation;
	@XmlAttribute
	private String sleepTime;
	@XmlAttribute
	private String refreshTime;

	@XmlElement(name = "admin-queue")
	private List<AdminQueue> adminQueue;

	public AdminQueues() {

	}

	public AdminQueues(List<AdminQueue> adminQueue) {
		super();
		this.adminQueue = adminQueue;
	}

	public AdminQueues(String classManager, String queueLocation,
			String sleepTime, String refreshTime, List<AdminQueue> adminQueue) {
		super();
		this.classManager = classManager;
		this.queueLocation = queueLocation;
		this.sleepTime = sleepTime;
		this.refreshTime = refreshTime;
		this.adminQueue = adminQueue;
	}

	public String getClassManager() {
		return classManager;
	}

	public void setClassManager(String classManager) {
		this.classManager = classManager;
	}

	public String getQueueLocation() {
		return queueLocation;
	}

	public void setQueueLocation(String queueLocation) {
		this.queueLocation = queueLocation;
	}

	public String getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}

	public String getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(String refreshTime) {
		this.refreshTime = refreshTime;
	}

	public List<AdminQueue> getAdminQueue() {
		return adminQueue;
	}

	public void setAdminQueue(List<AdminQueue> adminQueue) {
		this.adminQueue = adminQueue;
	}

	@Override
	public String toString() {
		return "AdminQueues [classManager=" + classManager + ", queueLocation="
				+ queueLocation + ", sleepTime=" + sleepTime + ", refreshTime="
				+ refreshTime + ", adminQueue=" + adminQueue + "]";
	}

}
