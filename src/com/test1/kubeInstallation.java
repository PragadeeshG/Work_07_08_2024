package com.test1;

public class kubeInstallation {
	private Integer unixBoxId;
	private Integer onDemandHostCode;
	private String playWitjK8s;
	private String miniKube;
	private String kubeAdmin;
	private String ec2Instance;
	private boolean ec2Status;
	private String securityGroupCode;
	private String kubeMasterNode;
	private String workerNodeState;
	private String networkInstallationState;
	private String kubeProxyState;
	private String modProbe;
	private String ipForwardCapability;

	public kubeInstallation() {

	}

	public kubeInstallation(Integer unixBoxId, Integer onDemandHostCode, String playWitjK8s, String miniKube,
			String kubeAdmin, String ec2Instance, boolean ec2Status, String securityGroupCode, String kubeMasterNode,
			String workerNodeState, String networkInstallationState, String kubeProxyState, String modProbe,
			String ipForwardCapability) {
		super();
		this.unixBoxId = unixBoxId;
		this.onDemandHostCode = onDemandHostCode;
		this.playWitjK8s = playWitjK8s;
		this.miniKube = miniKube;
		this.kubeAdmin = kubeAdmin;
		this.ec2Instance = ec2Instance;
		this.ec2Status = ec2Status;
		this.securityGroupCode = securityGroupCode;
		this.kubeMasterNode = kubeMasterNode;
		this.workerNodeState = workerNodeState;
		this.networkInstallationState = networkInstallationState;
		this.kubeProxyState = kubeProxyState;
		this.modProbe = modProbe;
		this.ipForwardCapability = ipForwardCapability;
	}

	public Integer getUnixBoxId() {
		return unixBoxId;
	}

	public void setUnixBoxId(Integer unixBoxId) {
		this.unixBoxId = unixBoxId;
	}

	public Integer getOnDemandHostCode() {
		return onDemandHostCode;
	}

	public void setOnDemandHostCode(Integer onDemandHostCode) {
		this.onDemandHostCode = onDemandHostCode;
	}

	public String getPlayWitjK8s() {
		return playWitjK8s;
	}

	public void setPlayWitjK8s(String playWitjK8s) {
		this.playWitjK8s = playWitjK8s;
	}

	public String getMiniKube() {
		return miniKube;
	}

	public void setMiniKube(String miniKube) {
		this.miniKube = miniKube;
	}

	public String getKubeAdmin() {
		return kubeAdmin;
	}

	public void setKubeAdmin(String kubeAdmin) {
		this.kubeAdmin = kubeAdmin;
	}

	public String getEc2Instance() {
		return ec2Instance;
	}

	public void setEc2Instance(String ec2Instance) {
		this.ec2Instance = ec2Instance;
	}

	public boolean isEc2Status() {
		return ec2Status;
	}

	public void setEc2Status(boolean ec2Status) {
		this.ec2Status = ec2Status;
	}

	public String getSecurityGroupCode() {
		return securityGroupCode;
	}

	public void setSecurityGroupCode(String securityGroupCode) {
		this.securityGroupCode = securityGroupCode;
	}

	public String getKubeMasterNode() {
		return kubeMasterNode;
	}

	public void setKubeMasterNode(String kubeMasterNode) {
		this.kubeMasterNode = kubeMasterNode;
	}

	public String getWorkerNodeState() {
		return workerNodeState;
	}

	public void setWorkerNodeState(String workerNodeState) {
		this.workerNodeState = workerNodeState;
	}

	public String getNetworkInstallationState() {
		return networkInstallationState;
	}

	public void setNetworkInstallationState(String networkInstallationState) {
		this.networkInstallationState = networkInstallationState;
	}

	public String getKubeProxyState() {
		return kubeProxyState;
	}

	public void setKubeProxyState(String kubeProxyState) {
		this.kubeProxyState = kubeProxyState;
	}

	public String getModProbe() {
		return modProbe;
	}

	public void setModProbe(String modProbe) {
		this.modProbe = modProbe;
	}

	public String getIpForwardCapability() {
		return ipForwardCapability;
	}

	public void setIpForwardCapability(String ipForwardCapability) {
		this.ipForwardCapability = ipForwardCapability;
	}

}
