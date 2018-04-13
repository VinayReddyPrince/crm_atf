package com.crm.validators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bytedeco.javacpp.opencv_core.CvAllocFunc;
import org.testng.Assert;

import com.crm.data.AccountsData;
import com.crm.data.CrmAccountData;
import com.crm.data.CrmCsvFile;
import com.crm.data.CrmDbData;
import com.crm.data.CrmTestData;
import com.crm.services.CrmService;
import com.crm.utils.CommonUtils;


public class CrmValidator {
	CrmAccountData cadata = null;
	List<AccountsData> crmaccountsdata = null;
	
//	public void validateHomePage(CrmService cservice){
//		Assert.assertTrue(cservice.checkHomePageHeader());
//	}
	
	
	public void validateUserLogin(CrmService cservice){
		Assert.assertEquals("Admin", cservice.getLoginUserAccount());
	}
		
	public void validateGivenUserAccountDetails(CrmService cservice){
		cadata = CrmTestData.accountTestData();
		crmaccountsdata = cadata.getCaccountdata();
//		cservice.clickAccountDashboard().clickExistingNameLink(username);
//		String uname = cservice.getFirstUserName();
//		if(username.equals(uname)){
//			Assert.assertEquals("testuser", cservice.getExistingUserName());
//			Assert.assertEquals("958214527", cservice.getUserMobileNumber());
		String uname = cservice.getCreatedAccountUserName();
		Assert.assertEquals(crmaccountsdata.get(0).getAccountUserName(), uname);
		
		String mobilenumber = cservice.getCreatedAccountMobileNumber();
		Assert.assertEquals(crmaccountsdata.get(0).getAccountPhoneNumber(), mobilenumber);
		
		String emailaddress = cservice.getCreatedAccountEmailAddress();
		Assert.assertEquals(crmaccountsdata.get(0).getAccountEmail(), emailaddress);
	
		String website = cservice.getCreatedAccountWebsite();
		Assert.assertEquals(crmaccountsdata.get(0).getAccountWebsite(), website);
		
		ArrayList<String> ubillingaddress = cservice.getBillingAddress();  //copy billing
		Assert.assertEquals(crmaccountsdata.get(0).getAccountStreet(), ubillingaddress.get(0));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountCity()+",", ubillingaddress.get(1));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountState(), ubillingaddress.get(2));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountPostalCode(), ubillingaddress.get(3));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountCountry(), ubillingaddress.get(4));
		
		if(cservice.isBillingAddressCopied()){
		ArrayList<String> ushippingaddress = cservice.getShipingAddress();
		Assert.assertEquals(crmaccountsdata.get(0).getAccountStreet(), ushippingaddress.get(0));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountCity()+",", ushippingaddress.get(1));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountState(), ushippingaddress.get(2));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountPostalCode(), ushippingaddress.get(3));
		Assert.assertEquals(crmaccountsdata.get(0).getAccountCountry(), ushippingaddress.get(4));
		Assert.assertEquals(ubillingaddress, ushippingaddress);  //copy billing
		}
		
		else{
			ArrayList<String> ushippingaddress1 = cservice.getShipingAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getAccountShippingStreet(), ushippingaddress1.get(0));
			Assert.assertEquals(crmaccountsdata.get(0).getAccountShippingCity()+",", ushippingaddress1.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getAccountShippingState(), ushippingaddress1.get(2));
			Assert.assertEquals(crmaccountsdata.get(0).getAccountShippingPostalCode(), ushippingaddress1.get(3));
			Assert.assertEquals(crmaccountsdata.get(0).getAccountShippingCountry(), ushippingaddress1.get(4));
				
	
		}
	
	}
	
//	
		
		public void validateListAfterRemovingElement(CrmService cservice) throws InterruptedException{
			String removeFirstItem = cservice.getTextOfFirstItemFromTabList();
			Assert.assertFalse(cservice.getItemInTabList().contains(removeFirstItem));
			cservice.clickAccountDashboard();
			Assert.assertFalse(cservice.getDashboardItemList().contains(removeFirstItem));
		}
		
		

		public void validateListAfterAddingElement(CrmService cservice) throws InterruptedException{
			Assert.assertTrue(cservice.getItemInTabList().contains("calender"));
			cservice.clickAccountDashboard();
			Assert.assertTrue(cservice.getDashboardItemList().contains("calender"));
		}
		
	
		public void validateCreateContactDetails(CrmService cservice){
			cadata = CrmTestData.accountTestData();
			crmaccountsdata = cadata.getCaccountdata();
			
////			ArrayList<String> contactFName = cservice.getCreatedContactName();
////			Assert.assertEquals(crmaccountsdata.get(0).getContactFirstName(), contactFName);
//			ArrayList<String> contactaddr = cservice.getCreatedContactName();
//			Assert.assertEquals(crmaccountsdata.get(0).getContactFirstName(), contactaddr.get(1));
//			Assert.assertEquals(crmaccountsdata.get(0).getContactLastName(), contactaddr.get(2));
			
//			ArrayList<String> contactLName = cservice.getCreatedContactName();
//			Assert.assertEquals(crmaccountsdata.get(0).getContactLastName(), contactLName);
			
			String phonenumber = cservice.getCreatedContactMobileNumber();
			Assert.assertEquals(crmaccountsdata.get(0).getContactPhoneNumber(), phonenumber);
			
			String emailaddress = cservice.getCreatedContactEmailAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getContactEmail(), emailaddress);
		
			ArrayList<String> ContactDetails = cservice.getContactAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getContactStreet(), ContactDetails.get(0));
			Assert.assertEquals(crmaccountsdata.get(0).getContactCity()+",", ContactDetails.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getContactState(), ContactDetails.get(2));
			Assert.assertEquals(crmaccountsdata.get(0).getContactPostalcode(), ContactDetails.get(3));
			Assert.assertEquals(crmaccountsdata.get(0).getContactCountry(), ContactDetails.get(4));
		}
		
		
		
		public void validateEditContactDetails(CrmService cservice){
			cadata = CrmTestData.accountTestData();
			crmaccountsdata = cadata.getCaccountdata();
		
//			String editContactFirstName = cservice.getCreatedContactName();
//			Assert.assertEquals(crmaccountsdata.get(0).getEditContactFirstName(), editContactFirstName);
//			
//			String editContactLastName = cservice.getCreatedContactName();
//			Assert.assertEquals(crmaccountsdata.get(0).getEditContactLastName(), editContactLastName);
			ArrayList<String> contactaddr = cservice.getCreatedContactName();
			Assert.assertEquals(crmaccountsdata.get(0).getContactFirstName(), contactaddr.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getContactLastName(), contactaddr.get(2));
			
			String editPhonenumber = cservice.getEditContactMobilenumber();
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactPhoneNumber(), editPhonenumber);
			
			String editEmailaddress = cservice.getEditContactEmail();
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactEmail(), editEmailaddress);
		
			ArrayList<String> editContactDetails = cservice.getContactAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactStreet(), editContactDetails.get(0));
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactCity()+",", editContactDetails.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactState(), editContactDetails.get(2));
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactPostalcode(), editContactDetails.get(3));
			Assert.assertEquals(crmaccountsdata.get(0).getEditContactCountry(), editContactDetails.get(4));
			
			
		}
		
		
		public void validateCreateLeads(CrmService cservice){
			
			cadata = CrmTestData.accountTestData();
			crmaccountsdata = cadata.getCaccountdata();
			
			ArrayList<String> leadname = cservice.getCreatedLeadNameList();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadFirstName(), leadname.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadLastName(), leadname.get(2));
			
			String leadaccountname = cservice.getCreatedAccountEmailAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadAccountName(), leadaccountname);
			
			String lemail = cservice.getCreatedLeadEmail();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadEmail(), lemail);
			
			String lphone = cservice.getCreatedLeadPhone();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadPhoneNumber(), lphone);
			
			String ltitle = cservice.getcreatedleadtitle();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadTitle(), ltitle);
			
			ArrayList<String> leadaddr = cservice.getCreatedLeadAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadStreet(), leadaddr.get(0));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadCity()+",", leadaddr.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadState(), leadaddr.get(2));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadPostalCode(), leadaddr.get(3));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadCountry(), leadaddr.get(4));
			
			
			String lwebsite = cservice.getCreatedLeadWebsite();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadWebsite(), lwebsite);
			
		}

		public void validateCreateLeadWithDetails(CrmService cservice){
			
			cadata = CrmTestData.accountTestData();
			crmaccountsdata = cadata.getCaccountdata();
			
			ArrayList<String> leadname = cservice.getCreatedLeadNameListWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadFirstName(), leadname.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadLastName(), leadname.get(2));
			
			String leadaccountname = cservice.getCreatedLeadAccountNameWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadAccountName(), leadaccountname);
			
			String lemail = cservice.getCreatedLeadEmailWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadEmail(), lemail);
			
			String lphone = cservice.getCreatedLeadPhoneWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadPhoneNumber(), lphone);
			
			String ltitle = cservice.getcreatedleadtitleWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadTitle(), ltitle);
			
			ArrayList<String> leadaddr = cservice.getCreatedLeadAddress();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadStreet(), leadaddr.get(0));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadCity()+",", leadaddr.get(1));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadState(), leadaddr.get(2));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadPostalCode(), leadaddr.get(3));
			Assert.assertEquals(crmaccountsdata.get(0).getLeadCountry(), leadaddr.get(4));
			
			
			String lwebsite = cservice.getCreatedLeadWebsite();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadWebsite(), lwebsite);
			
			String loppurtunityAmount = cservice.getCreatedLeadOpportunityAmountWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadOpportunityAmount(), loppurtunityAmount);
			
			String ldescription = cservice.getCreatedLeadDescriptionWithDetails();
			Assert.assertEquals(crmaccountsdata.get(0).getLeadDescription(), ldescription);
			
		}
		

		// DB VALIDATIONS/////////////////////////////////////////////////////////////////////////////////////////
		
		public void validateAccountWithCopyBillingAgainstDb(String qpath, CrmService cservice){
			List<String> accountlist= CrmDbData.getDbData(qpath, 2);
			System.out.println(accountlist);
			Assert.assertTrue(accountlist.contains(cservice.getCreatedAccountUserName()));
			
			List<String> accountlistWeb= CrmDbData.getDbData(qpath,4);
			System.out.println(accountlistWeb);
			Assert.assertTrue(accountlistWeb.contains(cservice.getCreatedAccountWebsite()));
			
			List<String> accountlistBilAdd= CrmDbData.getDbDataOfAccountBillingAddress(qpath,8,9,10,11,12);
			System.out.println(accountlistBilAdd);
			List<String> billingAddress = cservice.getBillingAddress();
			Assert.assertEquals(accountlistBilAdd,billingAddress);
			
			List<String> accountlistShipAdd= CrmDbData.getDbDataOfAccountBillingAddress(qpath,13,14,15,16,17);
			System.out.println(accountlistShipAdd);
			List<String> shippingAddress = cservice.getShipingAddress();
			Assert.assertEquals(accountlistShipAdd,shippingAddress);
			
		}
		
		public void validateAccountWithOutCopyBillingAgainstDb(String qpath, CrmService cservice){
			List<String> accountlist= CrmDbData.getDbData(qpath, 2);
			System.out.println(accountlist);
			Assert.assertTrue(accountlist.contains(cservice.getCreatedAccountUserName()));
			
			List<String> accountlistWeb= CrmDbData.getDbData(qpath,4);
			System.out.println(accountlistWeb);
			Assert.assertTrue(accountlistWeb.contains(cservice.getCreatedAccountWebsite()));
			
			List<String> accountlistBilAdd= CrmDbData.getDbDataOfAccountBillingAddress(qpath,8,9,10,11,12);
			System.out.println(accountlistBilAdd);
			List<String> billingAddress = cservice.getBillingAddress();
			Assert.assertEquals(accountlistBilAdd,billingAddress);
			
			List<String> accountlistShipAdd= CrmDbData.getDbDataOfAccountBillingAddress(qpath,13,14,15,16,17);
			System.out.println(accountlistShipAdd);
			List<String> shippingAddress = cservice.getShipingAddress();
			Assert.assertEquals(accountlistShipAdd,shippingAddress);
			
		}
		
		public void validateContactAgainstDb(String qpath, CrmService cservice){
			
			List<String> contactName = CrmDbData.getDbDataOfContactsName(qpath, 3,4,5);
			System.out.println(contactName);
			List<String> contName = cservice.getCreatedContactName();
			Assert.assertEquals(contactName, contName);
			
			List<String> contactAddress= CrmDbData.getDbDataOfAccountBillingAddress(qpath,9,10,11,12,13);
			System.out.println(contactAddress);
			List<String> contAddress = cservice.getContactAddress();
			Assert.assertEquals(contactAddress,contAddress);
			
		}
		
		
			
		
		
		public void validateEditContactAgainstDb(String qpath, CrmService cservice){
			
			List<String> contactName = CrmDbData.getDbDataOfContactsName(qpath, 3,4,5);
			System.out.println(contactName);
			List<String> contName = cservice.getCreatedContactName();
			Assert.assertEquals(contactName, contName);
			
			List<String> contactAddress= CrmDbData.getDbDataOfAccountBillingAddress(qpath,9,10,11,12,13);
			System.out.println(contactAddress);
			List<String> contAddress = cservice.getContactAddress();
			Assert.assertEquals(contactAddress,contAddress);
			
		}
		
		public void validateCasesAgainstDb(String qpath, CrmService cservice) throws InterruptedException{
			
			List<String> casename = CrmDbData.getDbData(qpath, 2);
			System.out.println(casename);
			Assert.assertTrue(casename.contains(cservice.getCreatedCaseNameField()));
			
			List<String> casestatus = CrmDbData.getDbData(qpath, 5);
			System.out.println(casestatus);
			Assert.assertTrue(casestatus.contains(cservice.getCreatedCaseStatusdd()));
			
			List<String> casespriority = CrmDbData.getDbData(qpath, 6);
			System.out.println(casespriority);
			Assert.assertTrue(casespriority.contains(cservice.getCreatedCasePrioritydd()));
			
			List<String> casesdescription = CrmDbData.getDbData(qpath, 8);
			System.out.println(casesdescription);
			Assert.assertTrue(casesdescription.contains(cservice.getCreatedCaseDescription()));	
		}
		
		
		public void validateOppurtunityAgainstDb(String qpath, CrmService cservice){
		
			List<String> oppname = CrmDbData.getDbData(qpath, 2);
			System.out.println(oppname);
			Assert.assertTrue(oppname.contains(cservice.getCreatedOppoName()));	
			
			List<String> oppamount = CrmDbData.getDbData(qpath, 4);
			System.out.println(oppamount);
			Assert.assertTrue(oppamount.contains(cservice.getCreatedOppoAmount()));	
			
			List<String> oppstage = CrmDbData.getDbData(qpath, 5);
			System.out.println(oppstage);
			Assert.assertTrue(oppstage.contains(cservice.getCreatedOppoStage()));
			
			List<String> oppprobability = CrmDbData.getDbData(qpath, 6);
			System.out.println(oppprobability);
			Assert.assertTrue(oppprobability.contains(cservice.getCreatedOppoProbability()));
			
			List<String> oppleadsource = CrmDbData.getDbData(qpath, 7);
			System.out.println(oppleadsource);
			Assert.assertTrue(oppleadsource.contains(cservice.getCreatedOppoLoadSource()));
			
			List<String> oppdescription= CrmDbData.getDbData(qpath, 9);
			System.out.println(oppdescription);
			Assert.assertTrue(oppdescription.contains(cservice.getCreatedOppodescription()));
		}
		
		
		public void validateLeadsWithDetailsAgainstDb(String qpath, CrmService cservice){
			
			List<String> leadname = CrmDbData.getDbDataOfLeadsName(qpath, 3, 4, 5);
			System.out.println(leadname);
			List<String> serviceLeadname = cservice.getCreatedLeadNameListWithDetails();
			Assert.assertEquals(leadname, serviceLeadname);
			
			List<String> leadtitle = CrmDbData.getDbDataOfLeadtitle(qpath, 6);
			System.out.println(leadtitle);
			Assert.assertTrue(leadtitle.contains(cservice.getcreatedleadtitleWithDetails()));
			
			List<String> leadstatus = CrmDbData.getDbDataOfLeadStatus(qpath, 7);
			System.out.println(leadstatus);
			Assert.assertTrue(leadstatus.contains(cservice.getCreatedLeadStatusWithDetails()));
			
			List<String> leadsource = CrmDbData.getDbDataOfLeadSource(qpath, 8);
			System.out.println(leadsource);
			Assert.assertTrue(leadsource.contains(cservice.getCreatedLeadSourceWithDetails()));
			;
			List<String> leadindustry= CrmDbData.getDbDataOfLeadSource(qpath, 9);
			System.out.println(leadindustry);
			Assert.assertTrue(leadindustry.contains(cservice.getCreatedLeadIndustryWithDetails()));
			
//			List<String> leadamount = CrmDbData.getDbDataOfLeadSource(qpath, 10);
//			System.out.println(leadamount);
//			Assert.assertTrue(leadamount.contains(cservice.getCreatedLeadOpportunityAmountWithDetails()));
			
			List<String> leadwebsite = CrmDbData.getDbDataOfLeadSource(qpath, 11);
			System.out.println(leadwebsite);
			Assert.assertTrue(leadwebsite.contains(cservice.getCreatedLeadWebsiteWithDetails()));
			
//			List<String> leadAddress= CrmDbData.getDbDataOfLeadAddress(qpath,12,13,14,16,15);
//			System.out.println(leadAddress);
//			List<String> uiLeadAddress = cservice.getCreatedLeadAddressWithDetails();
//			Assert.assertEquals(leadAddress,uiLeadAddress);
			
			List<String> leadDescription = CrmDbData.getDbDataOfLeadSource(qpath, 18);
			System.out.println(leadDescription);
			Assert.assertTrue(leadDescription.contains(cservice.getCreatedLeadDescriptionWithDetails()));
			
		}
		
		
		public void validateLeadsWithOutDetailsAgainstDb(String qpath, CrmService cservice){
			
			List<String> leadname = CrmDbData.getDbDataOfLeadsName(qpath, 3, 4, 5);
			System.out.println(leadname);
			List<String> serviceLeadname = cservice.getCreatedLeadNameListWithDetails();
			Assert.assertEquals(leadname, serviceLeadname);
			
			List<String> leadtitle = CrmDbData.getDbDataOfLeadtitle(qpath, 6);
			System.out.println(leadtitle);
			Assert.assertTrue(leadtitle.contains(cservice.getcreatedleadtitleWithDetails()));
			
			List<String> leadwebsite = CrmDbData.getDbDataOfLeadSource(qpath, 11);
			System.out.println(leadwebsite);
			Assert.assertTrue(leadwebsite.contains(cservice.getCreatedLeadWebsiteWithDetails()));
			
			List<String> leadAddress= CrmDbData.getDbDataOfLeadAddress(qpath,12,13,14,16,15);
			System.out.println(leadAddress);
			List<String> uiLeadAddress = cservice.getCreatedLeadAddressWithDetails();
			Assert.assertEquals(leadAddress,uiLeadAddress);
			
		}
		
		public void validateEmailAgainstDb(String qpath, CrmService cservice){
			
			List<String> emailSubject = CrmDbData.getDbDataOfEmailSubject(qpath, 2);
			System.out.println(emailSubject);
			Assert.assertTrue(emailSubject.contains(cservice.getCreatedEmailSubject()));
			
			List<String> emailBody = CrmDbData.getDbDataOfEmailSubject(qpath, 10);
			System.out.println(emailBody);
			Assert.assertTrue(emailBody.contains(cservice.getCreatedEmailBody()));
			
	
			
			
		}
		
		
		}		
		
		
		
		

	
	
	