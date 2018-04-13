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


public class CrmValidators2 {
	CrmAccountData cadata = null;
	List<AccountsData> crmaccountsdata = null;
	
	
	
	public void validateContactCsvDataAgainstUiDataAndDbData(CrmService cservice, String qpath) throws IOException{
		
		
		List<String> contactCsvDataList = CrmCsvFile.getCsvData();  ////// csv and ui
		List<String> contactUiDataList = cservice.getCreatedContactDetails();
		Assert.assertEquals(contactCsvDataList, contactUiDataList);
		System.out.println("Succesfully validated csv and ui data");
		
		
		List<String> contactCsvDataList1 = new ArrayList<String>(CrmCsvFile.getCsvData());    //// csv and db
		String removecsvphone = contactCsvDataList1.remove(2);
		String removecsvemail = contactCsvDataList1.remove(2);
		System.out.println(contactCsvDataList1);
		List<String> contactDbDataList = CrmDbData.getDbDataListOfContacts(qpath);
		Assert.assertEquals(contactCsvDataList1, contactDbDataList);
		System.out.println("Succesfully validated csv and db data");
		
		List<String> contactUiDataList1 = cservice.getCreatedContactDetailsOfDb();	// ui and db
		List<String> contactDbDataList1 = CrmDbData.getDbDataListOfContacts(qpath);
		Assert.assertEquals(contactUiDataList1, contactDbDataList1);
		System.out.println("Succesfully validated ui and db data");
		
}
	
	
	public void validateLeadsCsvDataAgainstUiDataAndDbData(CrmService cservice, String qpath) throws IOException, InterruptedException{
		
//		List<String> leadsCsvDataList = CrmCsvFile.getLeadCsvData();		////// csv and ui
//		List<String> leadsUiDataList = cservice.getCreatedLeadDetailsList();
//		Assert.assertEquals(leadsCsvDataList, leadsUiDataList);
//		System.out.println("Succesfully validated leads csv and ui data");
		
//		List<String> leadsCsvDataList1 = new ArrayList<String>(CrmCsvFile.getCsvData());   // csv and db
//		String removeleadcsvphone = leadsCsvDataList1.remove(2);
//		String removeleadcsvemail = leadsCsvDataList1.remove(2);
		List<String> leadsDbDataList = CrmDbData.getDbDataListOfLeads(qpath);
//		Assert.assertEquals(leadsCsvDataList1, leadsDbDataList);
		
		
//		List<String> leadsDbDataList1 = CrmDbData.getDbDataListOfLeads(qpath);	// ui and db
//		List<String> leadsUiDataList1 = cservice.getCreatedLeadDetailsOfUiList();
//		Assert.assertEquals(leadsDbDataList1, leadsUiDataList1);
		
	}
	
	
	
////	public void validateTaskFromCSV(CrmService cservice) throws IOException, InterruptedException {
//		List<String> taskcsvdata = CrmCsvFile.getTaskCsvData();
//		System.out.println("This is from CSV :"+taskcsvdata);
//		ArrayList<String> taskdetails = cservice.getCreatedTaskDetails();
//		System.out.println("This is from UI :"+taskdetails);
//		Assert.assertEquals(taskcsvdata, taskdetails);
//		System.out.println("Successfully validated CSV with UI");
//		}
//
//		public void validateTaskAgainstDB(String qpath, CrmService cservice) throws InterruptedException {
//		ArrayList<String> taskdetails = cservice.getCreatedTaskDetails();
//		System.out.println("This is from UI :"+taskdetails);
//		List<String> tasklist = CrmDbData.getMulDBList(qpath, 2, 4, 5, 11);
//		System.out.println("This is from DB :"+tasklist);
//		Assert.assertEquals(taskdetails, tasklist);
//		System.out.println("Successfully validated UI with DB");
//		}
//
//		public void validateTaskFromDBToCSV(String qpath, CrmService cservice) throws IOException {
//		List<String> tasklist = CrmDbData.getMulDBList(qpath, 2, 4, 5, 11);
//		System.out.println("This is from DB :"+tasklist);
//		List<String> taskcsvdata = CrmCsvFile.getTaskCsvData();
//		System.out.println("This is from CSV :"+taskcsvdata);
//		Assert.assertEquals(tasklist, taskcsvdata);
//		System.out.println("Successfully validated DB with CSV");
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}	