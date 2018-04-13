package com.crm.testscripts;



import java.io.IOException;
import java.util.List;

import org.sikuli.api.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.SikuliException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.data.AccountsData;
import com.crm.data.CrmAccountData;
import com.crm.data.CrmCsvFile;
import com.crm.data.CrmTestData;
import com.crm.services.CrmService;
import com.crm.utils.CommonUtils;
import com.crm.validators.CrmValidator;
import com.crm.validators.CrmValidators2;

public class AdminTest2 {
	CrmService cservice = new CrmService();
	CrmValidator cvalid = new CrmValidator();
	CrmValidators2 cvalid2 = new CrmValidators2();
	CrmAccountData cadata = null;
	List<AccountsData> crmaccountsdata = null;
	
	
	
	@BeforeClass
	public void init() throws InterruptedException{
		cadata = CrmTestData.accountTestData();
		crmaccountsdata = cadata.getCaccountdata();
		
		cservice.openCrmApplication();
		cservice.loginCrmApplication("admin", "admin");
	} 
	
	
//	@Test(description = "adding fields from addfields")
	public void addingFieldsFromAddFields() throws FindFailed, InterruptedException{
	cservice.addFields();
}
	
	
//	@Test
//	public void createContactUsingSikuli() throws FindFailed, InterruptedException, IOException{
//	cservice.contactUsingSikuli().nextButtonAfterSelectingFile().contactFieldDropDown().clickOnRunIMport().clickOnImportedName();//.clickContactsInDashboard();
//	cvalid2.validateContactCsvDataAgainstUiDataAndDbData(cservice, "src/test/db_queries/tc_002.sql");
//	
////	cservice.getCreatedContactDetails();
//}
		

	
	
	@Test
	public void createLeadsUsingSikuli() throws FindFailed, InterruptedException, IOException{
		cservice.leadsUsingSikuli().nextButtonAfterSelectingFile().leadsFieldDropDown().clickOnRunIMport().clickOnImportedName();
		cvalid2.validateLeadsCsvDataAgainstUiDataAndDbData(cservice,"src/test/db_queries/tc_lead.sql");
	}


//@Test
public void createTasksUsingSikuli() throws FindFailed, InterruptedException{
	cservice.tasksUsingSikuli().tasksFieldDropdown().clickOnRunIMport().clickOnImportedName();
}
}

