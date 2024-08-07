package com.test1;

public class ContainerOrchestration {
	private String aptGetCode;
	private String aptGetUrl;
	private String aptMark;
	private String defaultContainer;
	private String containerRuntime;
	private String coreDNS;
	private String kubeVirt;
	private Integer applicationInterface;
	private String calico;
	private String podsList;
	private String status;

	public ContainerOrchestration() {

	}

	public ContainerOrchestration(String aptGetCode, String aptGetUrl, String aptMark, String defaultContainer,
			String containerRuntime, String coreDNS, String kubeVirt, Integer applicationInterface, String calico,
			String podsList, String status) {
		super();
		this.aptGetCode = aptGetCode;
		this.aptGetUrl = aptGetUrl;
		this.aptMark = aptMark;
		this.defaultContainer = defaultContainer;
		this.containerRuntime = containerRuntime;
		this.coreDNS = coreDNS;
		this.kubeVirt = kubeVirt;
		this.applicationInterface = applicationInterface;
		this.calico = calico;
		this.podsList = podsList;
		this.status = status;
	}

	public String getAptGetCode() {
		return aptGetCode;
	}

	public void setAptGetCode(String aptGetCode) {
		this.aptGetCode = aptGetCode;
	}

	public String getAptGetUrl() {
		return aptGetUrl;
	}

	public void setAptGetUrl(String aptGetUrl) {
		this.aptGetUrl = aptGetUrl;
	}

	public String getAptMark() {
		return aptMark;
	}

	public void setAptMark(String aptMark) {
		this.aptMark = aptMark;
	}

	public String getDefaultContainer() {
		return defaultContainer;
	}

	public void setDefaultContainer(String defaultContainer) {
		this.defaultContainer = defaultContainer;
	}

	public String getContainerRuntime() {
		return containerRuntime;
	}

	public void setContainerRuntime(String containerRuntime) {
		this.containerRuntime = containerRuntime;
	}

	public String getCoreDNS() {
		return coreDNS;
	}

	public void setCoreDNS(String coreDNS) {
		this.coreDNS = coreDNS;
	}

	public String getKubeVirt() {
		return kubeVirt;
	}

	public void setKubeVirt(String kubeVirt) {
		this.kubeVirt = kubeVirt;
	}

	public Integer getApplicationInterface() {
		return applicationInterface;
	}

	public void setApplicationInterface(Integer applicationInterface) {
		this.applicationInterface = applicationInterface;
	}

	public String getCalico() {
		return calico;
	}

	public void setCalico(String calico) {
		this.calico = calico;
	}

	public String getPodsList() {
		return podsList;
	}

	public void setPodsList(String podsList) {
		this.podsList = podsList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
