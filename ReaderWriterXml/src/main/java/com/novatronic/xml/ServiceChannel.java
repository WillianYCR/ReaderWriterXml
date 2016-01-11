package com.novatronic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceChannel {

	@XmlAttribute
	private String connectTimeOut;
	@XmlAttribute
	private String readTimeOut;
	@XmlAttribute
	private String timeOutQueueRead;
	@XmlAttribute
	private String poolSize;
	@XmlAttribute
	private String sleepTime;
	@XmlAttribute
	private String refreshTime;
	@XmlAttribute
	private String maxReconnect;
	@XmlAttribute
	private String reconnectPause;

	@XmlElement(name = "service-channel-id")
	private String serviceChannelId;
	@XmlElement(name = "service-channel-status")
	private String serviceChannelStatus;
	@XmlElement(name = "service-channel-port")
	private String serviceChannelPort;
	@XmlElement(name = "worker-threads-count")
	private String workerThreadsCount;
	@XmlElement(name = "authorized-services")
	private AuthorizedServices authorizedServices;
	@XmlElement(name = "useCorrelationID")
	private String useCorrelationID;
	@XmlElement(name = "timeoutReceive")
	private String timeoutReceive;
	@XmlElement(name = "lagTimeReceive")
	private String lagTimeReceive;
	@XmlElement(name = "timeoutSend")
	private String timeoutSend;
	@XmlElement(name = "lagTimeSend")
	private String lagTimeSend;
	@XmlElement(name = "umbralWarning")
	private String umbralWarning;
	@XmlElement(name = "umbralReconnect")
	private String umbralReconnect;

	public ServiceChannel() {
	}

	public ServiceChannel(String serviceChannelId, String serviceChannelStatus,
			String serviceChannelPort, String workerThreadsCount,
			AuthorizedServices authorizedServices, String useCorrelationID,
			String timeoutReceive, String lagTimeReceive, String timeoutSend,
			String lagTimeSend, String umbralWarning, String umbralReconnect) {
		super();
		this.serviceChannelId = serviceChannelId;
		this.serviceChannelStatus = serviceChannelStatus;
		this.serviceChannelPort = serviceChannelPort;
		this.workerThreadsCount = workerThreadsCount;
		this.authorizedServices = authorizedServices;
		this.useCorrelationID = useCorrelationID;
		this.timeoutReceive = timeoutReceive;
		this.lagTimeReceive = lagTimeReceive;
		this.timeoutSend = timeoutSend;
		this.lagTimeSend = lagTimeSend;
		this.umbralWarning = umbralWarning;
		this.umbralReconnect = umbralReconnect;
	}

	public ServiceChannel(String connectTimeOut, String readTimeOut,
			String timeOutQueueRead, String poolSize, String sleepTime,
			String refreshTime, String maxReconnect, String reconnectPause,
			String serviceChannelId, String serviceChannelStatus,
			String serviceChannelPort, String workerThreadsCount,
			AuthorizedServices authorizedServices, String useCorrelationID,
			String timeoutReceive, String lagTimeReceive, String timeoutSend,
			String lagTimeSend, String umbralWarning, String umbralReconnect) {
		super();
		this.connectTimeOut = connectTimeOut;
		this.readTimeOut = readTimeOut;
		this.timeOutQueueRead = timeOutQueueRead;
		this.poolSize = poolSize;
		this.sleepTime = sleepTime;
		this.refreshTime = refreshTime;
		this.maxReconnect = maxReconnect;
		this.reconnectPause = reconnectPause;
		this.serviceChannelId = serviceChannelId;
		this.serviceChannelStatus = serviceChannelStatus;
		this.serviceChannelPort = serviceChannelPort;
		this.workerThreadsCount = workerThreadsCount;
		this.authorizedServices = authorizedServices;
		this.useCorrelationID = useCorrelationID;
		this.timeoutReceive = timeoutReceive;
		this.lagTimeReceive = lagTimeReceive;
		this.timeoutSend = timeoutSend;
		this.lagTimeSend = lagTimeSend;
		this.umbralWarning = umbralWarning;
		this.umbralReconnect = umbralReconnect;
	}

	public String getConnectTimeOut() {
		return connectTimeOut;
	}

	public void setConnectTimeOut(String connectTimeOut) {
		this.connectTimeOut = connectTimeOut;
	}

	public String getReadTimeOut() {
		return readTimeOut;
	}

	public void setReadTimeOut(String readTimeOut) {
		this.readTimeOut = readTimeOut;
	}

	public String getTimeOutQueueRead() {
		return timeOutQueueRead;
	}

	public void setTimeOutQueueRead(String timeOutQueueRead) {
		this.timeOutQueueRead = timeOutQueueRead;
	}

	public String getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(String poolSize) {
		this.poolSize = poolSize;
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

	public String getMaxReconnect() {
		return maxReconnect;
	}

	public void setMaxReconnect(String maxReconnect) {
		this.maxReconnect = maxReconnect;
	}

	public String getReconnectPause() {
		return reconnectPause;
	}

	public void setReconnectPause(String reconnectPause) {
		this.reconnectPause = reconnectPause;
	}

	public String getServiceChannelId() {
		return serviceChannelId;
	}

	public void setServiceChannelId(String serviceChannelId) {
		this.serviceChannelId = serviceChannelId;
	}

	public String getServiceChannelStatus() {
		return serviceChannelStatus;
	}

	public void setServiceChannelStatus(String serviceChannelStatus) {
		this.serviceChannelStatus = serviceChannelStatus;
	}

	public String getServiceChannelPort() {
		return serviceChannelPort;
	}

	public void setServiceChannelPort(String serviceChannelPort) {
		this.serviceChannelPort = serviceChannelPort;
	}

	public String getWorkerThreadsCount() {
		return workerThreadsCount;
	}

	public void setWorkerThreadsCount(String workerThreadsCount) {
		this.workerThreadsCount = workerThreadsCount;
	}

	public AuthorizedServices getAuthorizedServices() {
		return authorizedServices;
	}

	public void setAuthorizedServices(AuthorizedServices authorizedServices) {
		this.authorizedServices = authorizedServices;
	}

	public String getUseCorrelationID() {
		return useCorrelationID;
	}

	public void setUseCorrelationID(String useCorrelationID) {
		this.useCorrelationID = useCorrelationID;
	}

	public String getTimeoutReceive() {
		return timeoutReceive;
	}

	public void setTimeoutReceive(String timeoutReceive) {
		this.timeoutReceive = timeoutReceive;
	}

	public String getLagTimeReceive() {
		return lagTimeReceive;
	}

	public void setLagTimeReceive(String lagTimeReceive) {
		this.lagTimeReceive = lagTimeReceive;
	}

	public String getTimeoutSend() {
		return timeoutSend;
	}

	public void setTimeoutSend(String timeoutSend) {
		this.timeoutSend = timeoutSend;
	}

	public String getLagTimeSend() {
		return lagTimeSend;
	}

	public void setLagTimeSend(String lagTimeSend) {
		this.lagTimeSend = lagTimeSend;
	}

	public String getUmbralWarning() {
		return umbralWarning;
	}

	public void setUmbralWarning(String umbralWarning) {
		this.umbralWarning = umbralWarning;
	}

	public String getUmbralReconnect() {
		return umbralReconnect;
	}

	public void setUmbralReconnect(String umbralReconnect) {
		this.umbralReconnect = umbralReconnect;
	}

	@Override
	public String toString() {
		return "ServiceChannel [connectTimeOut=" + connectTimeOut
				+ ", readTimeOut=" + readTimeOut + ", timeOutQueueRead="
				+ timeOutQueueRead + ", poolSize=" + poolSize + ", sleepTime="
				+ sleepTime + ", refreshTime=" + refreshTime
				+ ", maxReconnect=" + maxReconnect + ", reconnectPause="
				+ reconnectPause + ", serviceChannelId=" + serviceChannelId
				+ ", serviceChannelStatus=" + serviceChannelStatus
				+ ", serviceChannelPort=" + serviceChannelPort
				+ ", workerThreadsCount=" + workerThreadsCount
				+ ", authorizedServices=" + authorizedServices
				+ ", useCorrelationID=" + useCorrelationID
				+ ", timeoutReceive=" + timeoutReceive + ", lagTimeReceive="
				+ lagTimeReceive + ", timeoutSend=" + timeoutSend
				+ ", lagTimeSend=" + lagTimeSend + ", umbralWarning="
				+ umbralWarning + ", umbralReconnect=" + umbralReconnect + "]";
	}

}
