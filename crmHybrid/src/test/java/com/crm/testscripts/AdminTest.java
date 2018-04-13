package com.crm.testscripts;



import java.util.List;

import org.sikuli.api.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.SikuliException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.data.AccountsData;
import com.crm.data.CrmAccountData;
import com.crm.data.CrmTestData;
import com.crm.services.CrmService;
import com.crm.utils.CommonUtils;
import com.crm.validators.CrmValidator;

public class AdminTest {
	CrmService cservice = new CrmService();
	CrmValidator cvalid = new CrmValidator();
	CrmAccountData cadata = null;
	List<AccountsData> crmaccountsdata = null;
	
	
	
	@BeforeClass
	public void init() throws InterruptedException{
		cadata = CrmTestData.accountTestData();
		crmaccountsdata = cadata.getCaccountdata();
		
		cservice.openCrmApplication();
		cservice.loginCrmApplication("admin", "admin");
	} 
	
//	@Test (description = "Create an Account with copybilling & without details" , priority = 0)
	public void loginCrmWithCopyBliing() throws InterruptedException, FindFailed{
		cservice.clickAccountDashboard().clickCreateAccount();
		cservice.enterAccountName(crmaccountsdata.get(0).getAccountUserName());
		cservice.enterAccountEmail(crmaccountsdata.get(0).getAccountEmail());
		cservice.enterAccountPHoneNumber(crmaccountsdata.get(0).getAccountPhoneNumber());
		cservice.enterAccountWebsite(crmaccountsdata.get(0).getAccountWebsite());
		cservice.enterBillingAddress(crmaccountsdata.get(0).getAccountStreet(),crmaccountsdata.get(0).getAccountCity(), crmaccountsdata.get(0).getAccountState(), crmaccountsdata.get(0).getAccountPostalCode(), crmaccountsdata.get(0).getAccountCountry());
	    cservice.copyBilling().clickSavebutton();
	    cservice.navigateToHomePage();
	    
	   // cvalid.validateGivenUserAccountDetails(cservice);
	   // cvalid.validateAccountWithCopyBillingAgainstDb("src\\test\\db_queries\\tc_001.sql", cservice);
	   
	}
	
	
	
//	@Test (description = "Create an Account with out copybilling & without details" , priority = 1)
	public void loginCrmWithOutCopyBilling() throws InterruptedException {
		cservice.clickAccountDashboard().clickCreateAccount();
		cservice.enterAccountName(crmaccountsdata.get(0).getAccountUserName());
		cservice.enterAccountEmail(crmaccountsdata.get(0).getAccountEmail());
		cservice.enterAccountPHoneNumber(crmaccountsdata.get(0).getAccountPhoneNumber());
		cservice.enterAccountWebsite(crmaccountsdata.get(0).getAccountWebsite());
		cservice.enterBillingAddress(crmaccountsdata.get(0).getAccountStreet(),crmaccountsdata.get(0).getAccountCity(), crmaccountsdata.get(0).getAccountState(), crmaccountsdata.get(0).getAccountPostalCode(), crmaccountsdata.get(0).getAccountCountry());
	    cservice.enterShippingAddress(crmaccountsdata.get(0).getAccountShippingStreet(), crmaccountsdata.get(0).getAccountShippingCity(), crmaccountsdata.get(0).getAccountShippingState(), crmaccountsdata.get(0).getAccountShippingPostalCode(), crmaccountsdata.get(0).getAccountShippingCountry());
	    cservice.clickSavebutton();
	   // cvalid.validateGivenUserAccountDetails(cservice);
	    cvalid.validateAccountWithOutCopyBillingAgainstDb("src\\test\\db_queries\\tc_001.sql", cservice);
	}
////	    
		
//	@Test (description = "clear saved account details", priority = 2)
//	public void clearSavedAccountDetails() throws InterruptedException{
//		Thread.sleep(2000);
//		cservice.clickAccountDashboard().nameCheckBox().actionsButton().actionsButtonremove();
//	
//		
////		cservice.clickEditButton();
////		
//		//cvalid.validateUserLogin(cservice);
	//}
////	
//	@Test (description = "create an account without copyblilling & without details", priority = 0)
//	public void createAccountWithOutCOpyBilling() throws InterruptedException{
//		cservice.clickAccountDashboard().clickCreateAccount().enterAccountName().enterAccountEmail().enterAccountPHoneNumber().enterAccountWebsite().enterBillingAddress().enterShippingAddress().clickSavebutton();
//		//cservice.clickOnSavedUserNameButton();
//		Thread.sleep(2000);
//		//cservice.getCreatedAccountEmailAddress();
//		//cservice.getCreatedAccountMobileNumber();
////		cservice.getBillingAddress();
////		cservice.getShipingAddress();
//		cvalid.validateGivenUserAccountWithoutCopyBilling(cservice);
//	}
//	
	
//	@Test (description = "create an account and edit that account without copybilling", priority =0)
//	public void editAccountDetails() throws InterruptedException{
//		cservice.clickAccountDashboard().clickCreateAccount().enterAccountName().enterAccountEmail().enterAccountPHoneNumber().enterAccountWebsite().enterBillingAddress().enterShippingAddress().clickSavebutton();
//		
//		cservice.clickAccountDashboard().clickExistingNameLink().clickEditButton().editAccountBillingAddressWithClearingAndInsertingText().editAccountShippingAddressWithClearingAndInsertingText().clickSavebuttonAfterEdit();
//		cvalid.validateTheEditedAccountWithoutCopyBilling(cservice);
//		}
	
//	@Test (description = "clear saved account details", priority = 1)
	public void clearSavedAccountDetails() throws InterruptedException{
		Thread.sleep(2000);
		cservice.clickAccountDashboard().nameCheckBox().actionsButton().actionsButtonremove();
	}
//	
//	
//	
////	public void enterUserDetails(){
////		cservice.clickAccountDashboard().clickCreateAccount();
////		cservice.enterAccountName(ctd.accountTestData().getCaccountdata().get(0).getAccountUserName());
////		
////	}
//	


//	@Test (description   = "creating a contact", priority = 0)
	public void createContact() throws InterruptedException{
		cservice.clickContactsInDashboard().clickCreateContact().enterContactName().enterContactFirstName(crmaccountsdata.get(0).getContactFirstName()).enterContactLastName(crmaccountsdata.get(0).getContactLastName()).enterContactEmail(crmaccountsdata.get(0).getContactEmail());
		cservice.enterContactPhoneNUmber(crmaccountsdata.get(0).getContactPhoneNumber()).enterContactStreet(crmaccountsdata.get(0).getContactStreet()).enterContactCity(crmaccountsdata.get(0).getContactCity()).enterContactState(crmaccountsdata.get(0).getContactState());
		cservice.enterContactPostalCode(crmaccountsdata.get(0).getContactPostalcode()).enterContactCountry(crmaccountsdata.get(0).getContactCountry()).clickSavebutton();
		//cvalid.validateCreateContactDetails(cservice);
		cvalid.validateContactAgainstDb("src\\test\\db_queries\\tc_002.sql", cservice);
	
	}
	
//	@Test(description = "editing contact details", priority = 1)
		public void editContact() throws InterruptedException{
			cservice.clickContactsInDashboard().clickCreateContact().enterContactName().enterContactFirstName(crmaccountsdata.get(0).getContactFirstName()).enterContactLastName(crmaccountsdata.get(0).getContactLastName()).enterContactEmail(crmaccountsdata.get(0).getContactEmail());
			cservice.enterContactPhoneNUmber(crmaccountsdata.get(0).getContactPhoneNumber()).enterContactStreet(crmaccountsdata.get(0).getContactStreet()).enterContactCity(crmaccountsdata.get(0).getContactCity()).enterContactState(crmaccountsdata.get(0).getContactState());
			cservice.enterContactPostalCode(crmaccountsdata.get(0).getContactPostalcode()).enterContactCountry(crmaccountsdata.get(0).getContactCountry()).clickSavebutton();
			cservice.clickContactEditButton();
			cservice.editContactFirstName(crmaccountsdata.get(0).getEditContactFirstName()).editContactLastName(crmaccountsdata.get(0).getEditContactLastName()).editContactEmail(crmaccountsdata.get(0).getEditContactEmail()).editContactMobilenumber(crmaccountsdata.get(0).getEditContactPhoneNumber());
			cservice.editContactStreet(crmaccountsdata.get(0).getEditContactStreet()).editContactCity(crmaccountsdata.get(0).getEditContactCity()).editContactState(crmaccountsdata.get(0).getEditContactState()).editContactPostalcode(crmaccountsdata.get(0).getEditContactPostalcode()).editContactCountry(crmaccountsdata.get(0).getEditContactCountry());
			cservice.clickSavebuttonAfterEdit();
		//	cvalid.validateEditContactDetails(cservice);
			cvalid.validateEditContactAgainstDb("src\\test\\db_queries\\tc_002.sql", cservice);
		}
		
		
		
		
	//	@Test (description = "removing calendar from tab list" , priority = 0)
		public void removeCalendarFromTabList() throws InterruptedException{
	//		cservice.clickDashboardMenuBar().clickOnAdministrationInMenu().clickOnUserInterfaceLink().removeCalendarFromTabList().clickOnSaveAfterRemoving();
			cservice.pageRefresh();
	}
	
	
	
//	@Test
	public void removingAnItemFromTAbList() throws InterruptedException{
		cservice.clickDashboardMenuBar().clickOnAdministrationInMenu().clickOnUserInterfaceLink().getTextOfFirstItemFromTabList();
		cservice.removeFirstItemFromTabList().clickSavebutton().pageRefresh();
		cservice.getItemInTabList();
		cvalid.validateListAfterRemovingElement(cservice);
	}

//	@Test
	public void addItemToList() throws InterruptedException{
		cservice.clickDashboardMenuBar().clickOnAdministrationInMenu().clickOnUserInterfaceLink().addItemToList();//.clickSavebutton().pageRefresh();
		cservice.getItemInTabList();
		
	}
		
//	@Test (description = "Creating Lead without details section", priority = 0)
	public void creatingLead() throws InterruptedException{
		cservice.clickOnDashboardLead().clickOnCreateLead().enterLeadDetails(crmaccountsdata.get(0).getLeadFirstName(),crmaccountsdata.get(0).getLeadLastName(),crmaccountsdata.get(0).getLeadAccountName(),crmaccountsdata.get(0).getLeadEmail(),crmaccountsdata.get(0).getLeadPhoneType(),crmaccountsdata.get(0).getLeadPhoneNumber(),crmaccountsdata.get(0).getLeadTitle());
		cservice.enterLeadAddressDetails(crmaccountsdata.get(0).getLeadStreet(), crmaccountsdata.get(0).getLeadCity(), crmaccountsdata.get(0).getLeadState(), crmaccountsdata.get(0).getLeadPostalCode(), crmaccountsdata.get(0).getLeadCountry());
		cservice.enterLeadWebsite(crmaccountsdata.get(0).getLeadWebsite());
		cservice.clickSavebutton();
	//	cvalid.validateCreateLeads(cservice);
		cvalid.validateLeadsWithOutDetailsAgainstDb("src\\test\\db_queries\\tc_lead.sql", cservice);
		
	}
	

//	@Test (description = "Creating Lead with details section", priority = 0)
	public void creatingLeadWithDetails() throws InterruptedException{
		cservice.clickOnDashboardLead().clickOnCreateLead().enterLeadDetails(crmaccountsdata.get(0).getLeadFirstName(), crmaccountsdata.get(0).getLeadLastName(), crmaccountsdata.get(0).getLeadAccountName(), crmaccountsdata.get(0).getLeadEmail(),crmaccountsdata.get(0).getLeadPhoneType(), crmaccountsdata.get(0).getLeadPhoneNumber(), crmaccountsdata.get(0).getLeadTitle());
		cservice.enterLeadAddressDetails(crmaccountsdata.get(0).getLeadStreet(), crmaccountsdata.get(0).getLeadCity(), crmaccountsdata.get(0).getLeadState(), crmaccountsdata.get(0).getLeadPostalCode(), crmaccountsdata.get(0).getLeadCountry());
		cservice.enterLeadWebsite(crmaccountsdata.get(0).getLeadWebsite());
		cservice.enterLeadDetailsFields(crmaccountsdata.get(0).getLeadOpportunityAmount(), crmaccountsdata.get(0).getLeadDescription());
		cservice.clickSaveButtonAfterEnteringLeadDetails();
		cvalid.validateLeadsWithDetailsAgainstDb("src\\test\\db_queries\\tc_lead.sql", cservice);
	}
	
	
	
//	@Test
	public void createEmail() throws InterruptedException{
		cservice.clickOnEmailDAshboard().clickOnComposeEmailButton();
		cservice.clickOnUpperArrowbutton().clickExistingNameLinkForEmail().enterEmailSubject(crmaccountsdata.get(0).getEmailSubject());
		cservice.enterEmailBody(crmaccountsdata.get(0).getEmailBody()).emailTo(crmaccountsdata.get(0).getEmailTo()).clickDraftsButton();
		cservice.clickCancelButton().clickDraftsButtonInEmailDashboard().clickSubjectButtonInEmailDashboard();
		cvalid.validateEmailAgainstDb("src\\test\\db_queries\\tc_email.sql", cservice);
		
	}
	
//	@Test(description = "opportunities" , priority = 0) 
	   public void enterOpportunitiesDetails() throws InterruptedException {
		   cservice.clickOpportunitiesInDashboard();
		   cservice.clickCreateOpportunities();
		   cservice.enterOpportunitiesName(crmaccountsdata.get(0).getOppoName());
		   cservice.enterOppoAmount(crmaccountsdata.get(0).getOppoAmount());
		   cservice.enterProbability(crmaccountsdata.get(0).getOppoProbability());
		   cservice.enteroppoDate(crmaccountsdata.get(0).getOppoCloseDate());
		   cservice.enterCloseDate();
		   cservice.enterLoadSource();
		   cservice.enterOppoDescription(crmaccountsdata.get(0).getOppoDescription());
		   cservice.clickSavebutton();
		   cvalid.validateOppurtunityAgainstDb("src\\test\\db_queries\\tc_oppo.sql", cservice);
}
	
//	@Test (description = " create cases functionality with out accounts and contacts section", priority = 0)
	public void createCasesFunctionalityWithOutAccountsAndContactSection() throws InterruptedException{
        cservice.clickOnDashboardCases().clickOnCreateCase();
        cservice.enterTextInCaseNameField(crmaccountsdata.get(0).getCaseName()).selectCasesStatusdd(crmaccountsdata.get(0).getCaseStatus());
	    cservice.selectCasesPrioritydd(crmaccountsdata.get(0).getCasePriority()).selectCasesTypedd(crmaccountsdata.get(0).getCaseType()).enterCasesDescription(crmaccountsdata.get(0).getCaseDescription());
	    cservice.clickSavebutton();
	    cvalid.validateCasesAgainstDb("src\\test\\db_queries\\tc_cases.sql", cservice);
	
	}
		
//	@Test(description = "adding fields from addfields")
		public void addingFieldsFromAddFields() throws FindFailed, InterruptedException{
		cservice.addFields();
	}
//	@Test
		public void createContactUsingSikuli() throws FindFailed, InterruptedException{
		cservice.contactUsingSikuli().contactFieldDropDown();
		cservice.clickOnRunIMport().clickOnImportedName();
		
		
	}
	@Test
	public void createLeadsUsingSikuli() throws FindFailed, InterruptedException{
		cservice.leadsUsingSikuli().leadsFieldDropDown().clickOnRunIMport().clickOnImportedName();
	}
	
//	@Test
	public void createTasksUsingSikuli() throws FindFailed, InterruptedException{
		cservice.tasksUsingSikuli().tasksFieldDropdown().clickOnRunIMport().clickOnImportedName();
	}
	
	}
	
	
	


