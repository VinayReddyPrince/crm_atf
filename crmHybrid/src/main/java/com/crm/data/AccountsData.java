package com.crm.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "accountdata")
@XmlAccessorType(XmlAccessType.FIELD)

public class AccountsData {
	
	private String id;
	private String accountUserName;
	private String accountPhoneNumber;
	private String accountEmail;
	private String accountWebsite;
	private String accountStreet;
	private String accountCity;
	private String accountState;
	private String accountPostalCode;
	private String accountCountry;
	private String accountShippingStreet;
	private String accountShippingCity;
	private String accountShippingState;
	private String accountShippingPostalCode;
	private String accountShippingCountry;
	
// contacts 
	private String contactSalutation;
	private String contactFirstName;
	private String contactLastName;
	private String contactEmail;
	private String contactPhoneNumber;
	private String contactStreet;
	private String contactCity;
	private String contactState;
	private String contactPostalcode;
	private String contactCountry;
	
	
//private String editcontactSalutation;
	
	private String editContactFirstName;
	private String editContactLastName;
	private String editContactEmail;
	private String editContactPhoneNumber;
	private String editContactStreet;
	private String editContactCity;
	private String editContactState;
	private String editContactPostalcode;
	private String editContactCountry;
	
	
	//lead creation:
	
	private String leadFirstName;
	private String leadLastName;
	private String leadAccountName;
	private String leadEmail;
	private String leadPhoneNumber;
	private String leadTitle;
	private String leadStreet;
	private String leadCity;
	private String leadState;
	private String leadPostalCode;
	private String leadCountry;
	private String leadWebsite;
	private String leadOpportunityAmount;
	private String leadDescription;
	private String leadPhoneType;
	
	//email creation
	
	private String emailTo;
	private String emailSubject;
	private String emailBody;
	
	
	// cases creation
	private String caseName;
	private String caseStatus;
	private String casePriority;
	private String caseType;
	private String caseDescription;
	
	// oppurtunities creation
	private String oppoName;
	private String oppoStage;
	private String oppoAmount;
	private String oppoProbability;
	private String oppoCloseDate;
	private String oppoLeadsource;
	private String oppoDescription;
	
	
	public String getOppoName() {
		return oppoName;
	}

	public void setOppoName(String oppoName) {
		this.oppoName = oppoName;
	}

	public String getOppoStage() {
		return oppoStage;
	}

	public void setOppoStage(String oppoStage) {
		this.oppoStage = oppoStage;
	}

	public String getOppoAmount() {
		return oppoAmount;
	}

	public void setOppoAmount(String oppoAmount) {
		this.oppoAmount = oppoAmount;
	}

	public String getOppoProbability() {
		return oppoProbability;
	}

	public void setOppoProbability(String oppoProbability) {
		this.oppoProbability = oppoProbability;
	}

	public String getOppoCloseDate() {
		return oppoCloseDate;
	}

	public void setOppoCloseDate(String oppoCloseDate) {
		this.oppoCloseDate = oppoCloseDate;
	}

	public String getOppoLeadsource() {
		return oppoLeadsource;
	}

	public void setOppoLeadsource(String oppoLeadsource) {
		this.oppoLeadsource = oppoLeadsource;
	}

	public String getOppoDescription() {
		return oppoDescription;
	}

	public void setOppoDescription(String oppoDescription) {
		this.oppoDescription = oppoDescription;
	}
	
	
	
	
	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCasePriority() {
		return casePriority;
	}

	public void setCasePriority(String casePriority) {
		this.casePriority = casePriority;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseDescription() {
		return caseDescription;
	}

	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}
	

	
	
	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
	
	
	public String getLeadPhoneType() {
		return leadPhoneType;
	}

	public void setLeadPhoneType(String leadPhoneType) {
		this.leadPhoneType = leadPhoneType;
	}

	public String getLeadFirstName() {
		return leadFirstName;
	}

	public void setLeadFirstName(String leadFirstName) {
		this.leadFirstName = leadFirstName;
	}

	public String getLeadLastName() {
		return leadLastName;
	}

	public void setLeadLastName(String leadLastName) {
		this.leadLastName = leadLastName;
	}

	public String getLeadAccountName() {
		return leadAccountName;
	}

	public void setLeadAccountName(String leadAccountName) {
		this.leadAccountName = leadAccountName;
	}

	public String getLeadEmail() {
		return leadEmail;
	}

	public void setLeadEmail(String leadEmail) {
		this.leadEmail = leadEmail;
	}

	public String getLeadPhoneNumber() {
		return leadPhoneNumber;
	}

	public void setLeadPhoneNumber(String leadPhoneNumber) {
		this.leadPhoneNumber = leadPhoneNumber;
	}

	public String getLeadTitle() {
		return leadTitle;
	}

	public void setLeadTitle(String leadTitle) {
		this.leadTitle = leadTitle;
	}

	public String getLeadStreet() {
		return leadStreet;
	}

	public void setLeadStreet(String leadStreet) {
		this.leadStreet = leadStreet;
	}

	public String getLeadCity() {
		return leadCity;
	}

	public void setLeadCity(String leadCity) {
		this.leadCity = leadCity;
	}

	public String getLeadState() {
		return leadState;
	}

	public void setLeadState(String leadState) {
		this.leadState = leadState;
	}

	public String getLeadPostalCode() {
		return leadPostalCode;
	}

	public void setLeadPostalCode(String leadPostalCode) {
		this.leadPostalCode = leadPostalCode;
	}

	public String getLeadCountry() {
		return leadCountry;
	}

	public void setLeadCountry(String leadCountry) {
		this.leadCountry = leadCountry;
	}

	public String getLeadWebsite() {
		return leadWebsite;
	}

	public void setLeadWebsite(String leadWebsite) {
		this.leadWebsite = leadWebsite;
	}

	public String getLeadOpportunityAmount() {
		return leadOpportunityAmount;
	}

	public void setLeadOpportunityAmount(String leadOpportunityAmount) {
		this.leadOpportunityAmount = leadOpportunityAmount;
	}

	public String getLeadDescription() {
		return leadDescription;
	}

	public void setLeadDescription(String leadDescription) {
		this.leadDescription = leadDescription;
	}

	
	
	public String getEditContactFirstName() {
		return editContactFirstName;
	}

	public void setEditContactFirstName(String editContactFirstName) {
		this.editContactFirstName = editContactFirstName;
	}

	public String getEditContactLastName() {
		return editContactLastName;
	}

	public void setEditContactLastName(String editContactLastName) {
		this.editContactLastName = editContactLastName;
	}

	public String getEditContactEmail() {
		return editContactEmail;
	}

	public void setEditContactEmail(String editContactEmail) {
		this.editContactEmail = editContactEmail;
	}

	public String getEditContactPhoneNumber() {
		return editContactPhoneNumber;
	}

	public void setEditContactPhoneNumber(String editContactPhoneNumber) {
		this.editContactPhoneNumber = editContactPhoneNumber;
	}

	public String getEditContactStreet() {
		return editContactStreet;
	}

	public void setEditContactStreet(String editContactStreet) {
		this.editContactStreet = editContactStreet;
	}

	public String getEditContactCity() {
		return editContactCity;
	}

	public void setEditContactCity(String editContactCity) {
		this.editContactCity = editContactCity;
	}

	public String getEditContactState() {
		return editContactState;
	}

	public void setEditContactState(String editContactState) {
		this.editContactState = editContactState;
	}

	public String getEditContactPostalcode() {
		return editContactPostalcode;
	}

	public void setEditContactPostalcode(String editContactPostalcode) {
		this.editContactPostalcode = editContactPostalcode;
	}

	public String getEditContactCountry() {
		return editContactCountry;
	}

	public void setEditContactCountry(String editContactCountry) {
		this.editContactCountry = editContactCountry;
	}
	
	
	
	public String getContactSalutation() {
		return contactSalutation;
	}

	public void setContactSalutation(String contactSalutation) {
		this.contactSalutation = contactSalutation;
	}
	
	public String getContactFirstName() {
		return contactFirstName;
	}
	
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	
	public String getContactLastName() {
		return contactLastName;
	}
	
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	
	public String getContactEmail() {
		return contactEmail;
	}
	
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}
	
	public String getContactStreet() {
		return contactStreet;
	}
	
	public void setContactStreet(String contactStreet) {
		this.contactStreet = contactStreet;
	}
	
	public String getContactCity() {
		return contactCity;
	}
	
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}
	
	public String getContactState() {
		return contactState;
	}
	
	public void setContactState(String contactState) {
		this.contactState = contactState;
	}
	
	public String getContactPostalcode() {
		return contactPostalcode;
	}
	
	public void setContactPostalcode(String contactPostalcode) {
		this.contactPostalcode = contactPostalcode;
	}
	
	public String getContactCountry() {
		return contactCountry;
	}
	
	public void setContactCountry(String contactCountry) {
		this.contactCountry = contactCountry;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAccountUserName() {
		return accountUserName;
	}
	public void setAccountUserName(String accountUserName) {
		this.accountUserName = accountUserName;
	}
	public String getAccountPhoneNumber() {
		return accountPhoneNumber;
	}
	public void setAccountPhoneNumber(String accountPhoneNumber) {
		this.accountPhoneNumber = accountPhoneNumber;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	public String getAccountWebsite() {
		return accountWebsite;
	}
	public void setAccountWebsite(String accountWebsite) {
		this.accountWebsite = accountWebsite;
	}
	public String getAccountStreet() {
		return accountStreet;
	}
	public void setAccountStreet(String accountStreet) {
		this.accountStreet = accountStreet;
	}
	public String getAccountCity() {
		return accountCity;
	}
	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}
	public String getAccountState() {
		return accountState;
	}
	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}
	public String getAccountPostalCode() {
		return accountPostalCode;
	}
	public void setAccountPostalCode(String accountPostalCode) {
		this.accountPostalCode = accountPostalCode;
	}
	public String getAccountCountry() {
		return accountCountry;
	}
	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}
	
	
	
	public String getAccountShippingStreet() {
		return accountShippingStreet;
	}
	public void setAccountShippingStreet(String accountShippingStreet) {
		this.accountShippingStreet = accountShippingStreet;
	}
	public String getAccountShippingCity() {
		return accountShippingCity;
	}
	public void setAccounShippingCity(String accountShippingCity) {
		this.accountShippingCity = accountShippingCity;
	}
	public String getAccountShippingState() {
		return accountShippingState;
	}
	public void setAccountShippingState(String accountShippingState) {
		this.accountShippingState = accountShippingState;
	}
	public String getAccountShippingPostalCode() {
		return accountShippingPostalCode;
	}
	public void setAccountShippingPostalCode(String accountShippingPostalCode) {
		this.accountShippingPostalCode = accountShippingPostalCode;
	}
	public String getAccountShippingCountry() {
		return accountShippingCountry;
	}
	public void setAccountShippingCountry(String accountShippingCountry) {
		this.accountShippingCountry = accountShippingCountry;
	}

}
