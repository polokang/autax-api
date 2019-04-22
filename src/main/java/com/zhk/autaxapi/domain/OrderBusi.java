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

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@ConfigurationProperties(prefix = "com.zhk.autaxapi.busiorder")
@PropertySource(value = "classpath:autaxorder-application.properties", encoding = "utf-8")
@Component
@Entity
public class OrderBusi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String coName;
	
	private String coTFN;
	
	private String coABN;
	
	private String coType;
	
	private String isKP;
	@Column(nullable = false)
	private String contactName;
	
	private String contactPosition;
	@Column(nullable = false)
	private String contactPhone;
	@Column(nullable = false)
	private String contactEmail;
	
	private String coTaxYear;
	
	private String coSales;
	
	private String coOtherIncomeList;
	
	private String exCostOfGoods;
	
	private String exAccountantFee;
	
	private String exMarketing;
	
	private String exBankCharges;
	
	private String exBankInterest;
	
	private String exElectricGas;
	
	private String exWater;
	
	private String exTelInter;
	
	private String exRent;
	
	private String exRepairs;
	
	private String exPrinting;
	
	private String exInsurance;
	
	private String exWages;
	
	private String exSuper;
	
	private String exTravel;
	
	private String exMotorVehicle;
	
	private String exOtherList;
	
	private String curCash;
	
	private String curDeposite;
	
	private String curInventory;
	
	private String curPrePaid;
	
	private String curOtherList;
	
	private String fixPropertyLand;
	
	private String fixVehicle;
	
	private String fixEquimentTools;
	
	private String fixFurnitureFitout;
	
	private String fixOtherList;
	
	private String liabPayable;
	
	private String liaCreditPay;
	
	private String liaTax;
	
	private String curOtherLias;
	
	private String liaLoans;
	
	private String fixOtherLias;
	
	private String ownerEquity;
	
	private String applyTime;
	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCoTFN() {
		return coTFN;
	}

	public void setCoTFN(String coTFN) {
		this.coTFN = coTFN;
	}

	public String getCoABN() {
		return coABN;
	}

	public void setCoABN(String coABN) {
		this.coABN = coABN;
	}

	public String getCoType() {
		return coType;
	}

	public void setCoType(String coType) {
		this.coType = coType;
	}

	public String getIsKP() {
		return isKP;
	}

	public void setIsKP(String isKP) {
		this.isKP = isKP;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPosition() {
		return contactPosition;
	}

	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getCoTaxYear() {
		return coTaxYear;
	}

	public void setCoTaxYear(String coTaxYear) {
		this.coTaxYear = coTaxYear;
	}

	public String getCoSales() {
		return coSales;
	}

	public void setCoSales(String coSales) {
		this.coSales = coSales;
	}

	public String getCoOtherIncomeList() {
		return coOtherIncomeList;
	}

	public void setCoOtherIncomeList(String coOtherIncomeList) {
		this.coOtherIncomeList = coOtherIncomeList;
	}

	public String getExCostOfGoods() {
		return exCostOfGoods;
	}

	public void setExCostOfGoods(String exCostOfGoods) {
		this.exCostOfGoods = exCostOfGoods;
	}

	public String getExAccountantFee() {
		return exAccountantFee;
	}

	public void setExAccountantFee(String exAccountantFee) {
		this.exAccountantFee = exAccountantFee;
	}

	public String getExMarketing() {
		return exMarketing;
	}

	public void setExMarketing(String exMarketing) {
		this.exMarketing = exMarketing;
	}

	public String getExBankCharges() {
		return exBankCharges;
	}

	public void setExBankCharges(String exBankCharges) {
		this.exBankCharges = exBankCharges;
	}

	public String getExBankInterest() {
		return exBankInterest;
	}

	public void setExBankInterest(String exBankInterest) {
		this.exBankInterest = exBankInterest;
	}

	public String getExElectricGas() {
		return exElectricGas;
	}

	public void setExElectricGas(String exElectricGas) {
		this.exElectricGas = exElectricGas;
	}

	public String getExWater() {
		return exWater;
	}

	public void setExWater(String exWater) {
		this.exWater = exWater;
	}

	public String getExTelInter() {
		return exTelInter;
	}

	public void setExTelInter(String exTelInter) {
		this.exTelInter = exTelInter;
	}

	public String getExRent() {
		return exRent;
	}

	public void setExRent(String exRent) {
		this.exRent = exRent;
	}

	public String getExRepairs() {
		return exRepairs;
	}

	public void setExRepairs(String exRepairs) {
		this.exRepairs = exRepairs;
	}

	public String getExPrinting() {
		return exPrinting;
	}

	public void setExPrinting(String exPrinting) {
		this.exPrinting = exPrinting;
	}

	public String getExInsurance() {
		return exInsurance;
	}

	public void setExInsurance(String exInsurance) {
		this.exInsurance = exInsurance;
	}

	public String getExWages() {
		return exWages;
	}

	public void setExWages(String exWages) {
		this.exWages = exWages;
	}

	public String getExSuper() {
		return exSuper;
	}

	public void setExSuper(String exSuper) {
		this.exSuper = exSuper;
	}

	public String getExTravel() {
		return exTravel;
	}

	public void setExTravel(String exTravel) {
		this.exTravel = exTravel;
	}

	public String getExMotorVehicle() {
		return exMotorVehicle;
	}

	public void setExMotorVehicle(String exMotorVehicle) {
		this.exMotorVehicle = exMotorVehicle;
	}

	public String getExOtherList() {
		return exOtherList;
	}

	public void setExOtherList(String exOtherList) {
		this.exOtherList = exOtherList;
	}

	public String getCurCash() {
		return curCash;
	}

	public void setCurCash(String curCash) {
		this.curCash = curCash;
	}

	public String getCurDeposite() {
		return curDeposite;
	}

	public void setCurDeposite(String curDeposite) {
		this.curDeposite = curDeposite;
	}

	public String getCurInventory() {
		return curInventory;
	}

	public void setCurInventory(String curInventory) {
		this.curInventory = curInventory;
	}

	public String getCurPrePaid() {
		return curPrePaid;
	}

	public void setCurPrePaid(String curPrePaid) {
		this.curPrePaid = curPrePaid;
	}

	public String getCurOtherList() {
		return curOtherList;
	}

	public void setCurOtherList(String curOtherList) {
		this.curOtherList = curOtherList;
	}

	public String getFixPropertyLand() {
		return fixPropertyLand;
	}

	public void setFixPropertyLand(String fixPropertyLand) {
		this.fixPropertyLand = fixPropertyLand;
	}

	public String getFixVehicle() {
		return fixVehicle;
	}

	public void setFixVehicle(String fixVehicle) {
		this.fixVehicle = fixVehicle;
	}

	public String getFixEquimentTools() {
		return fixEquimentTools;
	}

	public void setFixEquimentTools(String fixEquimentTools) {
		this.fixEquimentTools = fixEquimentTools;
	}

	public String getFixFurnitureFitout() {
		return fixFurnitureFitout;
	}

	public void setFixFurnitureFitout(String fixFurnitureFitout) {
		this.fixFurnitureFitout = fixFurnitureFitout;
	}

	public String getFixOtherList() {
		return fixOtherList;
	}

	public void setFixOtherList(String fixOtherList) {
		this.fixOtherList = fixOtherList;
	}

	public String getLiabPayable() {
		return liabPayable;
	}

	public void setLiabPayable(String liabPayable) {
		this.liabPayable = liabPayable;
	}

	public String getLiaCreditPay() {
		return liaCreditPay;
	}

	public void setLiaCreditPay(String liaCreditPay) {
		this.liaCreditPay = liaCreditPay;
	}

	public String getLiaTax() {
		return liaTax;
	}

	public void setLiaTax(String liaTax) {
		this.liaTax = liaTax;
	}

	public String getCurOtherLias() {
		return curOtherLias;
	}

	public void setCurOtherLias(String curOtherLias) {
		this.curOtherLias = curOtherLias;
	}

	public String getLiaLoans() {
		return liaLoans;
	}

	public void setLiaLoans(String liaLoans) {
		this.liaLoans = liaLoans;
	}

	public String getFixOtherLias() {
		return fixOtherLias;
	}

	public void setFixOtherLias(String fixOtherLias) {
		this.fixOtherLias = fixOtherLias;
	}

	public String getOwnerEquity() {
		return ownerEquity;
	}

	public void setOwnerEquity(String ownerEquity) {
		this.ownerEquity = ownerEquity;
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

	@Override
	public String toString() {
		return "OrderBusi [id=" + id + ", coName=" + coName + ", coTFN=" + coTFN + ", coABN=" + coABN + ", coType="
				+ coType + ", isKP=" + isKP + ", contactName=" + contactName + ", contactPosition=" + contactPosition
				+ ", contactPhone=" + contactPhone + ", contactEmail=" + contactEmail + ", coTaxYear=" + coTaxYear
				+ ", coSales=" + coSales + ", coOtherIncomeList=" + coOtherIncomeList + ", exCostOfGoods="
				+ exCostOfGoods + ", exAccountantFee=" + exAccountantFee + ", exMarketing=" + exMarketing
				+ ", exBankCharges=" + exBankCharges + ", exBankInterest=" + exBankInterest + ", exElectricGas="
				+ exElectricGas + ", exWater=" + exWater + ", exTelInter=" + exTelInter + ", exRent=" + exRent
				+ ", exRepairs=" + exRepairs + ", exPrinting=" + exPrinting + ", exInsurance=" + exInsurance
				+ ", exWages=" + exWages + ", exSuper=" + exSuper + ", exTravel=" + exTravel + ", exMotorVehicle="
				+ exMotorVehicle + ", exOtherList=" + exOtherList + ", curCash=" + curCash + ", curDeposite="
				+ curDeposite + ", curInventory=" + curInventory + ", curPrePaid=" + curPrePaid + ", curOtherList="
				+ curOtherList + ", fixPropertyLand=" + fixPropertyLand + ", fixVehicle=" + fixVehicle
				+ ", fixEquimentTools=" + fixEquimentTools + ", fixFurnitureFitout=" + fixFurnitureFitout
				+ ", fixOtherList=" + fixOtherList + ", liabPayable=" + liabPayable + ", liaCreditPay=" + liaCreditPay
				+ ", liaTax=" + liaTax + ", curOtherLias=" + curOtherLias + ", liaLoans=" + liaLoans + ", fixOtherLias="
				+ fixOtherLias + ", ownerEquity=" + ownerEquity + "]";
	}

	
}
