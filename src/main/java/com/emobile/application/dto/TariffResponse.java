package com.emobile.application.dto;

public class TariffResponse {

	private Integer planId;
	private String planName;
	private String planDesc;
	private Integer planAmount;
	private Integer planServicCharges;
	private String planValidity;
	private String planStatus;
	
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanDesc() {
		return planDesc;
	}
	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}
	public Integer getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(Integer planAmount) {
		this.planAmount = planAmount;
	}
	public Integer getPlanServicCharges() {
		return planServicCharges;
	}
	public void setPlanServicCharges(Integer planServicCharges) {
		this.planServicCharges = planServicCharges;
	}
	public String getPlanValidity() {
		return planValidity;
	}
	public void setPlanValidity(String planValidity) {
		this.planValidity = planValidity;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	
}
