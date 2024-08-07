package com.test1;

public class KubeArchitecture {
	private Integer archId;
	private String clientServer;
	private boolean clusterBased;
	private Integer masterNodeId;
	private String workerNodes;
	private String apiServer;
	private Integer controller;
	private Integer managerCode;
	private String scheduler;
	private Integer stageStorage;
	private String buildImage;
	private String status;
	private String dockerContainerArtifactUrl;

	public KubeArchitecture() {

	}

	public KubeArchitecture(Integer archId, String clientServer, boolean clusterBased, Integer masterNodeId,
			String workerNodes, String apiServer, Integer controller, Integer managerCode, String scheduler,
			Integer stageStorage, String buildImage, String status, String dockerContainerArtifactUrl) {
		super();
		this.archId = archId;
		this.clientServer = clientServer;
		this.clusterBased = clusterBased;
		this.masterNodeId = masterNodeId;
		this.workerNodes = workerNodes;
		this.apiServer = apiServer;
		this.controller = controller;
		this.managerCode = managerCode;
		this.scheduler = scheduler;
		this.stageStorage = stageStorage;
		this.buildImage = buildImage;
		this.status = status;
		this.dockerContainerArtifactUrl = dockerContainerArtifactUrl;
	}

	public Integer getArchId() {
		return archId;
	}

	public void setArchId(Integer archId) {
		this.archId = archId;
	}

	public String getClientServer() {
		return clientServer;
	}

	public void setClientServer(String clientServer) {
		this.clientServer = clientServer;
	}

	public boolean isClusterBased() {
		return clusterBased;
	}

	public void setClusterBased(boolean clusterBased) {
		this.clusterBased = clusterBased;
	}

	public Integer getMasterNodeId() {
		return masterNodeId;
	}

	public void setMasterNodeId(Integer masterNodeId) {
		this.masterNodeId = masterNodeId;
	}

	public String getWorkerNodes() {
		return workerNodes;
	}

	public void setWorkerNodes(String workerNodes) {
		this.workerNodes = workerNodes;
	}

	public String getApiServer() {
		return apiServer;
	}

	public void setApiServer(String apiServer) {
		this.apiServer = apiServer;
	}

	public Integer getController() {
		return controller;
	}

	public void setController(Integer controller) {
		this.controller = controller;
	}

	public Integer getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(Integer managerCode) {
		this.managerCode = managerCode;
	}

	public String getScheduler() {
		return scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public Integer getStageStorage() {
		return stageStorage;
	}

	public void setStageStorage(Integer stageStorage) {
		this.stageStorage = stageStorage;
	}

	public String getBuildImage() {
		return buildImage;
	}

	public void setBuildImage(String buildImage) {
		this.buildImage = buildImage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDockerContainerArtifactUrl() {
		return dockerContainerArtifactUrl;
	}

	public void setDockerContainerArtifactUrl(String dockerContainerArtifactUrl) {
		this.dockerContainerArtifactUrl = dockerContainerArtifactUrl;
	}

}
