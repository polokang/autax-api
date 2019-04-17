package com.zhk.autaxapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//54 fields
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ConfigurationProperties(prefix = "com.zhk.autaxapi.autaxorder")
@PropertySource(value = "classpath:autaxorder-application.properties", encoding = "utf-8")
@Component
@Entity
public class OrderIndv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String secondName;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String taxNum;
	@Column(nullable = false)
	private String bornDate;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String taxYear;
	@Column(nullable = false)
	private String incomeTypes;
	@Column(nullable = false)
	private String taxResidency;
	@Column(nullable = false)
	private String isLast;
	
	private String addr;
	private String bankName;
	private String bankBSB;
	private String bankAccount;
	private String govAllowance;
	private String govRetirement;
	private String govSuper;
	private String invinterest;
	private String invStock;
	private String invOversea;
	private String invOtherName;
	private String invOtherSum;
	private String carCostKilo;
	private String carCostPercent;
	private String ticketPlane;
	private String ticketTrans;
	private String ticketPark;
	private String ticketToll;
	private String ticketHotel;
	private String ticketOther;
	private String uniformBuy;
	private String uniformWash;
	private String anyNetwork;
	private String anyDevice;
	private String anyExtrawork;
	private String anyTelephone;
	private String anyStationery;
	private String anyHomework;
	private String anyAnnualfee;
	private String anyInformation;
	private String anyTraining;
	private String anyProtection;
	private String anyOther;
	private String taxfee;
	private String prepayment;
	private String family;
	private String spouseSuper;
	private String privateSuperName;
	private String privateSuper;
	private String remoteRegion;
	private String nursingName;
	private String nursingFee;
	private String otherbackName;
	private String otherbackFee;
	
	private String applyTime;
	private String state;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getTaxNum() {
		return taxNum;
	}
	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum;
	}
	public String getBornDate() {
		return bornDate;
	}
	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(String taxYear) {
		this.taxYear = taxYear;
	}
	public String getIncomeTypes() {
		return incomeTypes;
	}
	public void setIncomeTypes(String incomeTypes) {
		this.incomeTypes = incomeTypes;
	}
	public String getTaxResidency() {
		return taxResidency;
	}
	public void setTaxResidency(String taxResidency) {
		this.taxResidency = taxResidency;
	}
	public String getIsLast() {
		return isLast;
	}
	public void setIsLast(String isLast) {
		this.isLast = isLast;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBSB() {
		return bankBSB;
	}
	public void setBankBSB(String bankBSB) {
		this.bankBSB = bankBSB;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getGovAllowance() {
		return govAllowance;
	}
	public void setGovAllowance(String govAllowance) {
		this.govAllowance = govAllowance;
	}
	public String getGovRetirement() {
		return govRetirement;
	}
	public void setGovRetirement(String govRetirement) {
		this.govRetirement = govRetirement;
	}
	public String getGovSuper() {
		return govSuper;
	}
	public void setGovSuper(String govSuper) {
		this.govSuper = govSuper;
	}
	public String getInvinterest() {
		return invinterest;
	}
	public void setInvinterest(String invinterest) {
		this.invinterest = invinterest;
	}
	public String getInvStock() {
		return invStock;
	}
	public void setInvStock(String invStock) {
		this.invStock = invStock;
	}
	public String getInvOversea() {
		return invOversea;
	}
	public void setInvOversea(String invOversea) {
		this.invOversea = invOversea;
	}
	public String getInvOtherName() {
		return invOtherName;
	}
	public void setInvOtherName(String invOtherName) {
		this.invOtherName = invOtherName;
	}
	public String getInvOtherSum() {
		return invOtherSum;
	}
	public void setInvOtherSum(String invOtherSum) {
		this.invOtherSum = invOtherSum;
	}
	public String getCarCostKilo() {
		return carCostKilo;
	}
	public void setCarCostKilo(String carCostKilo) {
		this.carCostKilo = carCostKilo;
	}
	public String getCarCostPercent() {
		return carCostPercent;
	}
	public void setCarCostPercent(String carCostPercent) {
		this.carCostPercent = carCostPercent;
	}
	public String getTicketPlane() {
		return ticketPlane;
	}
	public void setTicketPlane(String ticketPlane) {
		this.ticketPlane = ticketPlane;
	}
	public String getTicketTrans() {
		return ticketTrans;
	}
	public void setTicketTrans(String ticketTrans) {
		this.ticketTrans = ticketTrans;
	}
	public String getTicketPark() {
		return ticketPark;
	}
	public void setTicketPark(String ticketPark) {
		this.ticketPark = ticketPark;
	}
	public String getTicketToll() {
		return ticketToll;
	}
	public void setTicketToll(String ticketToll) {
		this.ticketToll = ticketToll;
	}
	public String getTicketHotel() {
		return ticketHotel;
	}
	public void setTicketHotel(String ticketHotel) {
		this.ticketHotel = ticketHotel;
	}
	public String getTicketOther() {
		return ticketOther;
	}
	public void setTicketOther(String ticketOther) {
		this.ticketOther = ticketOther;
	}
	public String getUniformBuy() {
		return uniformBuy;
	}
	public void setUniformBuy(String uniformBuy) {
		this.uniformBuy = uniformBuy;
	}
	public String getUniformWash() {
		return uniformWash;
	}
	public void setUniformWash(String uniformWash) {
		this.uniformWash = uniformWash;
	}
	public String getAnyNetwork() {
		return anyNetwork;
	}
	public void setAnyNetwork(String anyNetwork) {
		this.anyNetwork = anyNetwork;
	}
	public String getAnyDevice() {
		return anyDevice;
	}
	public void setAnyDevice(String anyDevice) {
		this.anyDevice = anyDevice;
	}
	public String getAnyExtrawork() {
		return anyExtrawork;
	}
	public void setAnyExtrawork(String anyExtrawork) {
		this.anyExtrawork = anyExtrawork;
	}
	public String getAnyTelephone() {
		return anyTelephone;
	}
	public void setAnyTelephone(String anyTelephone) {
		this.anyTelephone = anyTelephone;
	}
	public String getAnyStationery() {
		return anyStationery;
	}
	public void setAnyStationery(String anyStationery) {
		this.anyStationery = anyStationery;
	}
	public String getAnyHomework() {
		return anyHomework;
	}
	public void setAnyHomework(String anyHomework) {
		this.anyHomework = anyHomework;
	}
	public String getAnyAnnualfee() {
		return anyAnnualfee;
	}
	public void setAnyAnnualfee(String anyAnnualfee) {
		this.anyAnnualfee = anyAnnualfee;
	}
	public String getAnyInformation() {
		return anyInformation;
	}
	public void setAnyInformation(String anyInformation) {
		this.anyInformation = anyInformation;
	}
	public String getAnyTraining() {
		return anyTraining;
	}
	public void setAnyTraining(String anyTraining) {
		this.anyTraining = anyTraining;
	}
	public String getAnyProtection() {
		return anyProtection;
	}
	public void setAnyProtection(String anyProtection) {
		this.anyProtection = anyProtection;
	}
	public String getAnyOther() {
		return anyOther;
	}
	public void setAnyOther(String anyOther) {
		this.anyOther = anyOther;
	}
	public String getTaxfee() {
		return taxfee;
	}
	public void setTaxfee(String taxfee) {
		this.taxfee = taxfee;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getSpouseSuper() {
		return spouseSuper;
	}
	public void setSpouseSuper(String spouseSuper) {
		this.spouseSuper = spouseSuper;
	}
	public String getPrepayment() {
		return prepayment;
	}
	public void setPrepayment(String prepayment) {
		this.prepayment = prepayment;
	}
	public String getPrivateSuperName() {
		return privateSuperName;
	}
	public void setPrivateSuperName(String privateSuperName) {
		this.privateSuperName = privateSuperName;
	}
	public String getPrivateSuper() {
		return privateSuper;
	}
	public void setPrivateSuper(String privateSuper) {
		this.privateSuper = privateSuper;
	}
	public String getRemoteRegion() {
		return remoteRegion;
	}
	public void setRemoteRegion(String remoteRegion) {
		this.remoteRegion = remoteRegion;
	}
	public String getNursingName() {
		return nursingName;
	}
	public void setNursingName(String nursingName) {
		this.nursingName = nursingName;
	}
	public String getNursingFee() {
		return nursingFee;
	}
	public void setNursingFee(String nursingFee) {
		this.nursingFee = nursingFee;
	}
	public String getOtherbackName() {
		return otherbackName;
	}
	public void setOtherbackName(String otherbackName) {
		this.otherbackName = otherbackName;
	}
	public String getOtherbackFee() {
		return otherbackFee;
	}
	public void setOtherbackFee(String otherbackFee) {
		this.otherbackFee = otherbackFee;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
