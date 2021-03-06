package com.netmng.websvc.soap.svc.param.requester;

import java.util.List;

public class ForcedEnd {
	private String correlationId;
	private String requesterNSA;
	private String providerNSA;
	private List<Object> attributeOrEncryptedAttribute;
	private String connectionId;

	public String getCorrelationId() {
		return this.correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getRequesterNSA() {
		return this.requesterNSA;
	}
	public void setRequesterNSA(String requesterNSA) {
		this.requesterNSA = requesterNSA;
	}
	public String getProviderNSA() {
		return this.providerNSA;
	}
	public void setProviderNSA(String providerNSA) {
		this.providerNSA = providerNSA;
	}
	public String getConnectionId() {
		return this.connectionId;
	}
	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}
	public List<Object> getAttributeOrEncryptedAttribute() {
		return this.attributeOrEncryptedAttribute;
	}
	public void setAttributeOrEncryptedAttribute(
			List<Object> attributeOrEncryptedAttribute) {
		this.attributeOrEncryptedAttribute = attributeOrEncryptedAttribute;
	}
}
