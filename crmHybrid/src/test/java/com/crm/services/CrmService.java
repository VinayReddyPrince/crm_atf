package com.crm.services;

import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;


import com.crm.configuration.BaseConfiguration;
import com.crm.objectrepo.CrmOr;
import com.crm.utils.CommonUtils;


public class CrmService extends BaseConfiguration {
	private static Logger log = Logger.getLogger(CrmService.class.getName());
	public CrmOr cro = new CrmOr();
	public Screen sc =  new Screen();
	
	
	private String streetname;
	
	public void openCrmApplication(){
		
		invokeBrowser();
	}	
	
	public CrmService loginCrmApplication(String username, String password) throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_login_username"), wd, username);
		CommonUtils.inserttext("id", cro.getObjects().getProperty("crm_login_password"), wd, password);
		CommonUtils.clickButton("id", cro.getObjects().getProperty("crm_loginbutton"), wd);
		log.info("user loggedin succesfully");
		return this;
	}
	
	public String getLoginUserAccount(){
		
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menu"), wd);
		String uname = CommonUtils.getText("css", cro.getObjects().getProperty("crm_dashboard_menu_username"), wd);
		System.out.println(uname);
		return uname;
	}
	
	public CrmService clickAccountDashboard(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_module_css"), wd);
		return this;
	}
	
	public CrmService navigateToHome(){
		
		return this;
	}
	
///////CRM DASHBOARD  ///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService clickDashboardMenuBar(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menu"), wd);
		return this;
	}
	
	
	public CrmService clickOnAdministrationInMenu(){
		CommonUtils.clicklink("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration"), wd);
		return this;
	}
	
	public CrmService clickOnUserInterfaceLink() throws InterruptedException{
		CommonUtils.clicklink("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface"), wd);
		CommonUtils.wait(2);
		return this;
	}
	
	 public String getTextOfFirstItemFromTabList(){
	    	String removeFirstItem = CommonUtils.getText("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_getextoffirstitem"), wd);
			System.out.println(removeFirstItem);
	    	return removeFirstItem;
	    }
	
	public CrmService removeFirstItemFromTabList() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_removefirstitem"), wd);
		return this;
	}
	
	public CrmService clickOnSaveAfterRemoving() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_removecalender_savebutton"), wd);
		return this;
	}
	
	// CREATE ACCOUNT ////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService clickCreateAccount(){
		
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_createaccount_css"), wd);
		return this;
	}
	
	public CrmService enterAccountName(String name){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_name_css"), wd, name);
		return this;
	}
	
	public CrmService enterAccountEmail(String email){
     	CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_email_css"), wd, email);
     	return this;
	}
	
	public CrmService enterAccountPHoneNumber(String phonenumber){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_phonenumber_css"), wd, phonenumber);
		return this;
	}
	
	public CrmService enterAccountWebsite(String website){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_website_css"), wd,  website);
		
		return this;
		
	}
	
//	public CrmService editedAccountName() throws InterruptedException{
//		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_name_css"), wd, "testuser2");
//		CommonUtils.wait(2);
//		return this;
//	}
//	
	public  CrmService editAccountBillingAddressWithClearingAndInsertingText() throws InterruptedException{
		
		CommonUtils.clearText("css",  cro.getObjects().getProperty("crm_accounts_createaccount_name_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_name_css"), wd, "testuser2");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_email_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_email_css"), wd, "abc@espocrm2.com");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_phonenumber_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_phonenumber_css"), wd, "9581852556");

		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_website_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_website_css"), wd, "www.google.com");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_street_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_street_css"), wd, "st.Annscolony");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_city_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_city_css"), wd, "policelane");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_state_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_state_css"), wd, "telangana");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_postal_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_postal_css"), wd, "505416");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_country_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_country_css"), wd, "jkl");
		return this;
	}
	

	public  CrmService editAccountShippingAddressWithClearingAndInsertingText() throws InterruptedException{

		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_street_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_street_css"), wd, "vinayaknagar");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_city_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_city_css"), wd, "nearbridge");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_state_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_state_css"), wd, "telangana");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_postal_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_postal_css"), wd, "505526");
		
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_country_css"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_country_css"), wd, "bharathadesham");
		return this;
	}
	
	public CrmService enterBillingAddress(String street, String city, String state, String postalcode, String country ){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_street_css"), wd, street);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_city_css"), wd, city);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_state_css"), wd, state);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_postal_css"), wd, postalcode);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_billingaddress_country_css"), wd, country);
		
		return this;
	}
	
	public CrmService enterShippingAddress(String street, String city, String state, String postalcode, String country){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_street_css"), wd, street);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_city_css"), wd, city);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_state_css"), wd, state);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_postal_css"), wd, postalcode);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_accounts_createaccount_shippingaddress_country_css"), wd, country);
		copyBillingAddress = false;
		return	 this;

	}
	
	
	public CrmService copyBilling(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_createaccount_copybilling_css"), wd);
		copyBillingAddress = true;
		
		return this;
	}
	
	public boolean isBillingAddressCopied(){
		return copyBillingAddress;
	}
	
	public CrmService clickSavebutton() throws InterruptedException{
		
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_createaccount_savebutton_css"), wd);
		CommonUtils.wait(4);
		log.info("account created succesfully");
		return this;
	}
	
	public CrmService clickSavebuttonAfterEdit() throws InterruptedException{
		CommonUtils.wait(3);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_createaccount_savebutton_afteredit_css"), wd);
		log.info("Saved Successful");
		
		return this;
	}
	
	public CrmService clickEditButton(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_createaccount_editbutton_css"), wd);
		return this;
	}
	public CrmService clickOnExistingUserName(){
		 CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_login_clicksaveonsavedusername"), wd);
		return this;
	}
		
	public String getCreatedAccountUserName() {
		//CommonUtils.clicklink("css", cro.getObjects().getProperty("account_created_username"), wd);
		String txt = CommonUtils.getText("css", "#main>div:nth-child(2)>div>div:nth-child(5)>div:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(2)>div:nth-child(1)>div:nth-child(1)>div", wd);
		System.out.println(txt);
		return txt;
		
	}
	
//	public CrmService clickExistingNameLink(String username){
//		CommonUtils.clicklink("css", cro.getObjects().getProperty("crm_existingaccount_firstusername"), wd);
//		String uname = getFirstUserName();
//		if(username.equals(uname)){
//			CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_existingaccount_firstusername"), wd);
//		}
//		
//		else{
//			System.out.println("invalid username");
//		}
//		return this;
//	}
//	
//	
//	
//	public String getFirstUserName(){
//		String uname = CommonUtils.getText("css", cro.getObjects().getProperty("crm_existingaccount_firstusername"), wd);
//		return uname;
//	}
	
//	public String getExistingUserName(){
//		String uname = CommonUtils.getText("css", cro.getObjects().getProperty("crm_existingaccount_username_css"), wd);
//		return uname;
//	}
	
	
	public String getCreatedAccountMobileNumber(){
		String mobilenumber = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_mobilenumber"), wd);
		System.out.println(mobilenumber);
		return mobilenumber;
	}
	
	public String getCreatedAccountEmailAddress(){
		String emailaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_emailaddress"), wd);
		System.out.println(emailaddress);
		return emailaddress;
		}
	
	public String getCreatedAccountWebsite(){
		String website = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_website"), wd);
		System.out.println(website);
		return website;
		}
	
//	public String[] getCreatedAccountBillingAddress(){
//		String billingaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_billingaddress"), wd);
//		 System.out.println(billingaddress);
//		String baddress[] = billingaddress.split(" ");
//		System.out.println(baddress[0]);
//		System.out.println(baddress[1]);
//		System.out.println(baddress[2]);
//		return baddress;
//	}
	
	public String getIndividualBilling(){
		List<String> individualList = getBillingAddress();
		ArrayList<String> ind1 = new ArrayList<String>();
		String ind2 = individualList.get(0);
		individualList.add(streetname);
		
		return ind2;
	}
	
	public ArrayList<String> getBillingAddress(){
		String billaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_billingaddress"), wd);
		 //System.out.println(billingaddress);
		String address[] = billaddress.split(" ");
		ArrayList<String> baddress=new ArrayList<String>();
		String [] a1 = address;
		String [] a11 = a1[0].split("\n");
		String streetname = a11[0];
		String city = a11[1];
		String state = a1[1];
		String [] a12 = a1[2].split("\n");
		String postal = a12[0];
		String country = a12[1];
		
//		System.out.println(streetname);
//		System.out.println(city);
//		System.out.println(state);
//		System.out.println(postal);
//		System.out.println(country);
		baddress.add(streetname);
		baddress.add(city);
		baddress.add(state);
		baddress.add(postal);
		baddress.add(country);
		System.out.println(baddress);
		
		return baddress;
	}
	boolean copyBillingAddress = false;
	private String value;
	public ArrayList<String> getShipingAddress(){
		String shipaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_shippingaddress"), wd);
		 //System.out.println(billingaddress);
		String address[] = shipaddress.split(" ");
		ArrayList<String> saddress = new ArrayList<String>();
		String [] a1 = address;
		String [] a11 = a1[0].split("\n");
		String streetname = a11[0];
		String city = a11[1];
		String state = a1[1];
		String [] a12 = a1[2].split("\n");
		String postal = a12[0];
		String country = a12[1];
		
//		System.out.println(streetname);
//		System.out.println(city);
//		System.out.println(state);
//		System.out.println(postal);
//		System.out.println(country);
		saddress.add(streetname);
		saddress.add(city);
		saddress.add(state);
		saddress.add(postal);
		saddress.add(country);
		System.out.println(saddress);
		copyBillingAddress = true;
		return saddress;
	}
	
	
	
	
		//String string = "ayodhyanagarcolony-mp-telangana-500028-jk";
		//String [] parts = billingaddress.split("-");
//		String part1= parts[0];
//		String part2= parts[1];
//		String part3= parts[2];
//		String part4= parts[3];
//		String part5= parts[4];
		//for (int x=0; x<parts.length; x++) {
			 // Sysbillingaddresstem.out.println(parts[x]);
		
		
			
		
		//System.out.println(billingaddress); 
	//METHOD -2
	
//	public List<String> getBillingAddress1(){
//		String billingAddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_account_billingaddress"), wd);
//		List<String> list = new ArrayList<String>();
//		String baddress[] = billingAddress.split(" ");
//		System.out.println(baddress.length);
//		for(int i=0; i<baddress.length; i++){
//			Scanner scanner = new Scanner(baddress[i]);
//			while (scanner.hasNextLine()){
//				String line = scanner.nextLine();
//				list.add(line);
//				
//			}
//		}
//		return list;
//		
//		
//	}
//	
	
		
	public CrmService editDropDown(){
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("crm_accounts_createaccount_editbuttondropdown_css"), "String", "Remove", wd);
		return this;
	}
	
	// CLEAR RECORDS/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService nameCheckBox(){
		CommonUtils.radiobutton("css", cro.getObjects().getProperty("crm_accounts_module_actionsnamecheckbox_css"), wd);
		return this;
	}
	
	public CrmService actionsButton(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_module_actions_css"), wd);
		return this;
	}
	
	public CrmService actionsButtonremove(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_module_actions_remove_css"), wd);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_accounts_module_actions_removealert_css"), wd);
		return this;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService clickExistingNameLink() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clicklink("css", cro.getObjects().getProperty("crm_accounts_createaccount_existingnamelink_css"), wd);
		return this;
	}
	
	
//	public boolean checkHomePageHeader(){
//		return CommonUtils.isElementPresent("css", cro.getObjects().getProperty("homepageheader"), wd);
//	}
    public CrmService pageRefresh(){
	CommonUtils.pageRefresh(wd);
	return this;
	
    }	
	
    
   
    
    public ArrayList<String> getItemInTabList() throws InterruptedException{
    	ArrayList<String> list = new ArrayList<String>();
    	CommonUtils.wait(2);
    	list= CommonUtils.getItemsFromList("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_tablist"), wd);
		System.out.println(list);
    	 return list;
    			
    }
    
    public ArrayList<String> getDashboardItemList() throws InterruptedException{
    	ArrayList<String> list = new ArrayList<String>();
    	CommonUtils.wait(2);
    	list= CommonUtils.getItemsFromList("css", cro.getObjects().getProperty("crm_dashboard_modules"), wd);
		System.out.println(list);
    	 return list;
    			
    }
    
    public CrmService addItemToList() throws InterruptedException{
    	CommonUtils.wait(2);
    	CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_addbutton"), wd);
    	//CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_menubar_administration_userinterface_addbutton_additemtab"), wd);
		return this;
    	
    }
    
    
    //#CONTACTS :///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public CrmService clickOnExistingContactUserName() throws InterruptedException{
    	CommonUtils.wait(2);
		 CommonUtils.clickButton("css", cro.getObjects().getProperty("created_contact_existingusername"), wd);
		return this;
	}
    
	public CrmService clickContactsInDashboard() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_contacts_module"), wd);
		return this;
	}
	
	public CrmService clickCreateContact(){
		
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_contacts_createcontact"), wd);
		return this;
	}
	
	public CrmService enterContactName() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("crm_contacts_name_field"), "value", "Mr.", wd);
		return this;
	}

	public CrmService enterContactFirstName(String name){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_firstname"), wd, name);
		return this;
	}
	
	public CrmService enterContactLastName(String lastname){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_lastname"), wd, lastname);
		return this;
	}
	
	public CrmService enterContactEmail(String email){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_email"), wd, email);
		return this;
	}
	
	public CrmService enterContactPhoneNUmber(String Phonenumber){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_phonenumber"), wd, Phonenumber );
		return this;
	}
	
	public CrmService enterContactStreet(String Street){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_street"), wd, Street);
		return this;
	}
	
	public CrmService enterContactCity(String City){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_city"), wd, City);
		return this;
	}
	
	public CrmService enterContactState(String State){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_state"), wd, State);
		return this;
	}
	
	public CrmService enterContactPostalCode(String Postalcode){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_postalcode"), wd, Postalcode);
		return this;
	}
	
	public CrmService enterContactCountry(String Country){
		
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_country"), wd, Country);
		return this;
	}
	
//	public String getCreatedContactName(){
//		String mobilenumber = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_name"), wd);
//		System.out.println(mobilenumber);
//		return mobilenumber;
//	}
	
// CREATED CONTACT ############################################################################################################
	
	
	public ArrayList<String> getCreatedContactName(){
		String contactName = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_name"), wd);
		String cName[] = contactName.split(" ");
		
		ArrayList<String> contName = new ArrayList<String>();
		String c1[] = cName;
	//	String[] c11 = c1[0].split("\n");
	//	String salutation = cName[0];
		String firstName = c1[0];
		String lastName = c1[1];
	//	contName.add(salutation);
		contName.add(firstName);
		contName.add(lastName);
		System.out.println(contName);
		return contName;
		
	}
	
	public String getContactName() {
		String contactName = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_name"), wd);
		System.out.println(contactName);
		return contactName;
	}
	
	public String getCreatedContactMobileNumber(){
		String mobilenumber = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_mobilenumber"), wd);
		System.out.println(mobilenumber);
		return mobilenumber;
	}
	
	public String getCreatedContactEmailAddress(){
		String emailaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_email"), wd);
		System.out.println(emailaddress);
		return emailaddress;
		}
	
	public ArrayList<String> getContactAddress(){
		String contactaddress = CommonUtils.getText("css", cro.getObjects().getProperty("created_contact_address"), wd);
		 //System.out.println(billingaddress);
		String address[] = contactaddress.split(" ");
		ArrayList<String> contaddress = new ArrayList<String>();
		String [] a1 = address;
		
		String [] a11 = a1[0].split("\n");
		String streetname = a11[0];
		String city = a11[1];
		String[] citySeperate = city.split(",");
		String c1 = citySeperate[0];
		
		String state = a1[1];
		
		String [] a12 = a1[2].split("\n");
		String postal = a12[0];
		String country = a12[1];
		
//		System.out.println(streetname);
//		System.out.println(city);
//		System.out.println(state);
//		System.out.println(postal);
//		System.out.println(country);
		contaddress.add(streetname);
		contaddress.add(c1);
		
		contaddress.add(state);
		contaddress.add(postal);
		contaddress.add(country);
		System.out.println(contaddress);
		
		return contaddress;
	}
	
	public ArrayList<String> getCreatedContactDetails(){    ///////// all created contact methods are kept in an arraylist
		ArrayList<String> contactDetails =  new ArrayList<String>();
		contactDetails.addAll(getCreatedContactName());
		contactDetails.add(getCreatedContactEmailAddress());
		contactDetails.add(getCreatedContactMobileNumber());
		contactDetails.addAll(getContactAddress());
		
		ArrayList<String> abcd = new ArrayList<String>();
		ArrayList<String> abcde = contactDetails;
		System.out.println(abcde);
		return abcd;
		
	}
	
	public ArrayList<String> getCreatedContactDetailsOfDb(){    ///////// all created contact methods are kept in an arraylist
		ArrayList<String> contactDetails =  new ArrayList<String>();
		contactDetails.addAll(getCreatedContactName());
	//	contactDetails.add(getCreatedContactEmailAddress());
	//	contactDetails.add(getCreatedContactMobileNumber());
		contactDetails.addAll(getContactAddress());
		return contactDetails;
		
	}
	
//	ArrayList<String> getCreatedContactDetails = new ArrayList<String>();
//
//	public void remove()
//	{
//	    System.out.println(getCreatedContactDetails.size());
//
//	    for(String ce : getCreatedContactDetails)
//	    {
//	        if(ce.getpId() == pId)
//	        {
//	            items.remove(ce);
//	            //System.out.println(items.get(1));             
//	        }
//	    }   
//	    items.add(new CartEntry(pId));
//	}
//	
	
	
//	#####################################################################################################################
		public CrmService clickContactEditButton() throws InterruptedException{
			CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("created_contact_editbutton"), wd);
		return this;
		}

		public  CrmService editContactFirstName(String FirstName){
		CommonUtils.clearText("css",  cro.getObjects().getProperty("crm_contacts_firstname"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_firstname"), wd, FirstName);
		return this;
		}
		
		public  CrmService editContactLastName(String LastName){
		CommonUtils.clearText("css",  cro.getObjects().getProperty("crm_contacts_lastname"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_lastname"), wd, LastName);
		return this;
		}
		
		public  CrmService editContactEmail(String Email){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_email"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_email"), wd, Email);
		return this;
		}
		
		public  CrmService editContactMobilenumber(String Mobilenumber){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_phonenumber"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_phonenumber"), wd, Mobilenumber);
		return this;
		}
		
		public  CrmService editContactStreet(String Street){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_street"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_street"), wd, Street);
		return this;
		}
		
		public  CrmService editContactCity(String City){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_city"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_city"), wd, City);
		return this;
		}
		
		public  CrmService editContactState(String State){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_state"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_state"), wd, State);
		return this;
		}
		
		public  CrmService editContactPostalcode(String Postalcode){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_postalcode"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_postalcode"), wd, Postalcode);
		return this;
		}
		
		public  CrmService editContactCountry(String Country){
		CommonUtils.clearText("css", cro.getObjects().getProperty("crm_contacts_country"), wd);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_contacts_country"), wd, Country);
		return this;
		}
		
		
		
		public  String getEditContactEmail(){
			//CommonUtils.clearText("css", cro.getObjects().getProperty("edit_created_contact_email"), wd);
			String editedContactEmail = CommonUtils.getText("css", cro.getObjects().getProperty("edit_created_contact_email"), wd);
			System.out.println(editedContactEmail);
			return editedContactEmail;
			}
			
		public  String getEditContactMobilenumber(){
			//CommonUtils.clearText("css", cro.getObjects().getProperty("edit_created_contact_mobilenumber"), wd);
			String editedContactMobile = CommonUtils.getText("css", cro.getObjects().getProperty("edit_created_contact_mobilenumber"), wd);
			System.out.println(editedContactMobile);
			return editedContactMobile;
			
			}
			
		public ArrayList<String> getEditContactAddress(){
			String editcontactaddress = CommonUtils.getText("css", cro.getObjects().getProperty("edit_created_contact_address"), wd);
			 //System.out.println(billingaddress);
			String address[] = editcontactaddress.split(" ");
			ArrayList<String> contaddress = new ArrayList<String>();
			String [] a1 = address;
			String [] a11 = a1[0].split("\n");
			String streetname = a11[0];
			String city = a11[1];
			
			String state = a1[1];
			String [] a12 = a1[2].split("\n");
			String postal = a12[0];
			String country = a12[1];
			
//			System.out.println(streetname);
//			System.out.println(city);
//			System.out.println(state);
//			System.out.println(postal);
//			System.out.println(country);
			contaddress.add(streetname);
			contaddress.add(city);
			contaddress.add(state);
			contaddress.add(postal);
			contaddress.add(country);
			System.out.println(contaddress);
			
			return contaddress;
		}
		
		
		//LEADS CREATION:
		
		
		public CrmService clickOnDashboardLead() throws InterruptedException{
			CommonUtils.wait(1);
			CommonUtils.clickButton("css",  cro.getObjects().getProperty("login_dashboard_leads"), wd);
			return this;
		}
		
		public CrmService clickOnCreateLead() throws InterruptedException{
			CommonUtils.wait(1);
			CommonUtils.clickButton("css", cro.getObjects().getProperty("login_dashboard_contacts_createlead"), wd);
			return this;
		}
		
		public CrmService enterLeadDetails(String firstname, String lastname,String accountname, String email, String phonetype, String phonenumber, String title) throws InterruptedException{
			CommonUtils.wait(1);
			CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_leads_createlead_name"), "value", "Mr.", wd);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_firstname"), wd, firstname);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_lastname"), wd, lastname);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_accountname"), wd, accountname);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_email"), wd, email);
			CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_leads_createlead_phonedd"), "value", phonetype, wd);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_phonetab"), wd, phonenumber);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_title"), wd, title);
			return this;
		}
		
		public CrmService enterLeadAddressDetails(String street, String city, String state, String postalcode, String country){
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_street"), wd, street);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_city"), wd, city);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_state"), wd, state);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_postalcode"), wd, postalcode);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_country"), wd, country);
			return this;
		}
		
		public CrmService enterLeadWebsite(String website){
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_website"), wd, website);
			return this;
		}
		
		public CrmService clickSaveButtonAfterEnteringLeadDetails() throws InterruptedException{
			CommonUtils.clickButton("css", cro.getObjects().getProperty("login_leads_createlead_save"), wd);
			return this;
		}
		
		public CrmService enterLeadDetailsFields(String opportunityamount, String description ){
			CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_leads_createlead_details_status"), "value", "Assigned", wd);
			CommonUtils.selectDropDownItem("css",  cro.getObjects().getProperty("login_leads_createlead_details_source"), "value","Call", wd);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_details_opportunityamount"), wd, opportunityamount);
			CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_leads_createlead_details_industry"),"value", "Advertising", wd);
			CommonUtils.inserttext("css", cro.getObjects().getProperty("login_leads_createlead_details_description"), wd, description);
			return this;
		}
		
		
		//VALIDATING CREATEd LEAD WITHOUT DETAILS FIELD//////////////////////////////////////////////////////////
		
		public ArrayList<String> getCreatedLeadNameList(){
			String contactnamelist = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_name"), wd);
			ArrayList<String> contactname = new ArrayList<String>();
			String[] cname = contactnamelist.split(" ");
		//	String name = cname[0];
			String firstname = cname[0];
			String lastname = cname[1];
		//	contactname.add(name);
			contactname.add(firstname);
			contactname.add(lastname);
			System.out.println(contactname);
			return contactname;
			}
		

		public String getCreatedLeadAccountName(){
			String leadaccountname = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_accountname"), wd);
			System.out.println(leadaccountname);
			return leadaccountname;
		}
		
		public String getCreatedLeadEmail(){
			String contactemail = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_email"), wd);
			System.out.println(contactemail);
			return contactemail;
		}
		
		public String getCreatedLeadPhone(){
			String contactphone = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_phone"), wd);
			System.out.println(contactphone);
			return contactphone;
		}
		
	public ArrayList<String> getCreatedLeadAddress(){
			
			ArrayList<String> contaddress = new ArrayList<String>();
			String caddress = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_address"), wd);
			String[] contactaddress = caddress.split(" ");
			String[] a11 = contactaddress[0].split("\n");
			String street = a11[0];
			
			String c1 = a11[1];
			String[] c2 = c1.split(",");
			String city = c2[0];
			
			String state = contactaddress[1];
			String[] a12 = contactaddress[2].split("\n");
			String postal = a12[0];
			String country = a12[1];
			contaddress.add(street);
			contaddress.add(city);
			contaddress.add(state);
			contaddress.add(postal);
			contaddress.add(country);
			System.out.println(contaddress);
			return contaddress;
		}
		
	public String getcreatedleadtitle(){
		String contacttitle = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_title"), wd);
		System.out.println(contacttitle);
		return contacttitle;

	}


	public String getCreatedLeadWebsite(){
			String leadwebsite = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_website"), wd);
			System.out.println(leadwebsite);
			return leadwebsite;
		}
	
	
	public ArrayList<String> getCreatedLeadDetailsList() throws InterruptedException {
		ArrayList<String> leadinfo = new ArrayList<String>();
		leadinfo.add(getCreatedLeadNameList().get(0));
		leadinfo.add(getCreatedLeadNameList().get(1));
		leadinfo.add(getCreatedLeadAccountName());
		leadinfo.add(getCreatedLeadEmail());
		leadinfo.add(getCreatedLeadPhone());
		leadinfo.add(getcreatedleadtitle());
		leadinfo.addAll(getCreatedLeadAddress());
		leadinfo.add(getCreatedLeadWebsite());

		return leadinfo;
		}
	
	public ArrayList<String> getCreatedLeadDetailsOfUiList() throws InterruptedException {
		ArrayList<String> leadinfo = new ArrayList<String>();
		leadinfo.add(getCreatedLeadNameList().get(0));
		leadinfo.add(getCreatedLeadNameList().get(1));
		leadinfo.add(getCreatedLeadAccountName());
//		leadinfo.add(getCreatedLeadEmail());
//		leadinfo.add(getCreatedLeadPhone());
		leadinfo.add(getcreatedleadtitle());
		leadinfo.addAll(getCreatedLeadAddress());
		leadinfo.add(getCreatedLeadWebsite());

		return leadinfo;
		}
	
		
//VALIDATING CREATELEAD WITH DETAILS FIELDS///////////////////////////////////////////////////////////////////////

	public ArrayList<String> getCreatedLeadNameListWithDetails(){
		String contactnamelist = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_name"), wd);
		ArrayList<String> contactname = new ArrayList<String>();
		String[] cname = contactnamelist.split(" ");
		String name = cname[0];
		String firstname = cname[1];
		String lastname = cname[2];
		contactname.add(name);
		contactname.add(firstname);
		contactname.add(lastname);
		System.out.println(contactname);
		return contactname;
	}


	public String getCreatedLeadAccountNameWithDetails(){
		String leadaccountname = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_accountname"), wd);
		System.out.println(leadaccountname);
		return leadaccountname;
	}

	public String getCreatedLeadEmailWithDetails(){
		String contactemail = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_email"), wd);
		System.out.println(contactemail);
		return contactemail;
	}

	public String getCreatedLeadPhoneWithDetails(){
		String contactphone = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_phone"), wd);
		System.out.println(contactphone);
		return contactphone;
	}
	
	
	public String getcreatedleadtitleWithDetails(){
		String contacttitle = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_title"), wd);
		System.out.println(contacttitle);
		return contacttitle;

	}

	public ArrayList<String> getCreatedLeadAddressWithDetails(){
		
		ArrayList<String> contaddress = new ArrayList<String>();
		String caddress = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_address"), wd);
		String[] contactaddress = caddress.split(" ");
		String[] a11 = contactaddress[0].split("\n");
		String street = a11[0];
		String city = a11[1];
		String state = contactaddress[1];
		String[] a12 = contactaddress[2].split("\n");
		String postal = a12[0];
		String country = a12[1];
		contaddress.add(street);
		contaddress.add(city);
		contaddress.add(state);
		contaddress.add(postal);
		contaddress.add(country);
		System.out.println(contaddress);
		return contaddress;
	}
	

	public String getCreatedLeadWebsiteWithDetails(){
		String leadwebsite = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_website"), wd);
		System.out.println(leadwebsite);
		return leadwebsite;
	}

	public String getCreatedLeadStatusWithDetails(){
		String leadstatus = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_status"), wd);
		System.out.println(leadstatus);
		return leadstatus;
	}
	
	public String getCreatedLeadSourceWithDetails(){
		String leadsource = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_source"), wd);
		System.out.println(leadsource);
		return leadsource;
	}
	
	public String getCreatedLeadOpportunityAmountWithDetails(){
		String leadsopportunityamount = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_opportunityamount"), wd);
		System.out.println(leadsopportunityamount);
		return leadsopportunityamount;
	}
	
	public String getCreatedLeadIndustryWithDetails(){
		String leadsindustry = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_industry"), wd);
		System.out.println(leadsindustry);
		return leadsindustry;
	}
	
	public String getCreatedLeadDescriptionWithDetails(){
		String leaddescription = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedlead_description"), wd);
		System.out.println(leaddescription);
		return leaddescription;
	}
	
	
	
		
	
		
		
	// email creation   //////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService clickOnEmailDAshboard(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails"), wd);
		return this;
	}
	
	public CrmService clickOnComposeEmailButton() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails_compose"), wd);
		return this;
	}
	
	public CrmService emailTo(String value){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_dashboard_emails_to"), wd, value);
		return this;
	}
	
	public CrmService clickOnUpperArrowbutton() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails_parents_upperarrowbutton"), wd);
		return this;
	}
	
	public CrmService clickExistingNameLinkForEmail() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails_existinguser"), wd);
		return this;
	}
	
	public CrmService enterEmailSubject(String value){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_dashboard_emails_subject"), wd, value);
		return this;
	}
	
	public CrmService enterEmailBody(String value){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_dashboard_emails_body"), wd, value);
		return this;
	}
	
	public CrmService clickDraftsButton() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails_draftsbutton"), wd);
		return this;
	}
	
	public CrmService clickCancelButton() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emails_cancelbutton"), wd);
		return this;
	}
	
	public CrmService clickDraftsButtonInEmailDashboard(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emailsdashboard_drafts"), wd);
		return this;
	}
	
	public CrmService clickSubjectButtonInEmailDashboard(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_emailsdashboard_drafts_subject"), wd);
		return this;
	}
	
	
	
	// created email     ///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getCreatedEmailTo(){
		String getemail = CommonUtils.getText("css", cro.getObjects().getProperty("created_crm_dashboard_emails_to"), wd);
		System.out.println("getemail");
		return getemail;
	}
	
	public String getCreatedEmailParentExistingUser(){
		String getexistingname = CommonUtils.getText("css", cro.getObjects().getProperty("created_crm_dashboard_emails_existinguser"), wd);
		System.out.println(getexistingname);
		return getexistingname;
	}
	
	public String getCreatedEmailSubject(){
		String getemailsubject = CommonUtils.getText("css", cro.getObjects().getProperty("created_crm_dashboard_emails_subject"), wd);
		System.out.println(getemailsubject);
		return getemailsubject;
	}
	
	public String getCreatedEmailBody(){
		String getemailbody = CommonUtils.getText("css", cro.getObjects().getProperty("created_crm_dashboard_emails_body"), wd);
		System.out.println(getemailbody);
		return getemailbody;
	}
	
	// create cases//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public CrmService clickOnDashboardCases() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clicklink("css", cro.getObjects().getProperty("login_dashboard_cases"), wd);
		return this;
	}

	public CrmService clickOnCreateCase() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("login_cases_createcases"), wd);
		return this;
	}

	public CrmService enterTextInCaseNameField( String name){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("login-cases_createcases_name"), wd, name);
		return this;
	}
	public CrmService selectCasesStatusdd(String stdd){
		CommonUtils.selectDropDownItem("css",cro.getObjects().getProperty("login_cases_createcases_status"),	"value", stdd, wd);
		return this;
	}
	public CrmService selectCasesPrioritydd(String Prioritydd){
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_cases_createcases_priority"),"value",Prioritydd, wd);
		return this;
	}
	public CrmService selectCasesTypedd(String Typedd){
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("login_cases_createcases_dropdown_type"),"value", Typedd, wd);
		return this;
	}

	public CrmService enterCasesDescription(String Description){
		CommonUtils.inserttext("css", cro.getObjects().getProperty("login_cases_createcases_description"),wd, Description);
		return this;
	}
	
	// created cases///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getCreatedCaseNameField() throws InterruptedException{
		CommonUtils.wait(2);
		String name = CommonUtils.getText("css", cro.getObjects().getProperty("created_case_name"), wd);
		System.out.println(name);
		return name;
		
	}

	public String getCreatedCaseStatusdd(){
		String status = CommonUtils.getText("css", cro.getObjects().getProperty("created_case_statusdd"), wd);
		System.out.println(status);
		return status;
		
	}

	public String getCreatedCasePrioritydd(){
		String priority = CommonUtils.getText("css", cro.getObjects().getProperty("created_case_prioritydd"), wd);
		System.out.println(priority);
		return priority;
		
	}

	public String getCreatedCaseTypedd(){
		String type = CommonUtils.getText("css", cro.getObjects().getProperty("created_case_type"), wd);
		System.out.println(type);
		return type;
		
	}


	public String getCreatedCaseDescription(){
		String txt = CommonUtils.getText("css", cro.getObjects().getProperty("created_case_description"), wd);
		System.out.println(txt);
		return txt;
		
	}
	
	
////	create oppurtunities ///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CrmService clickOpportunitiesInDashboard() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_dashboard_opportunities"), wd);
		return this;
	}
	
	public void clickCreateOpportunities() {
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_createopportunities"), wd);
	}
	
	public CrmService enterOpportunitiesName(String name) throws InterruptedException{	
		CommonUtils.wait(1);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_createopportunities_name"), wd, name );
		return this;
	}
	
	
	public CrmService enterOppoAmount(String value) throws InterruptedException {
		CommonUtils.wait(1);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_oppo_amount"), wd, value);
		return this;
	}
	
	public CrmService enterProbability(String value) throws InterruptedException {
		CommonUtils.wait(1);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_oppo_probability"), wd, value);
		return this;
	}
	
	public CrmService enteroppoDate(String date) throws InterruptedException {
		CommonUtils.wait(1);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_oppo_date"), wd);
		return this;
	}
	
	public CrmService enterCloseDate() {
		CommonUtils.clickButton("css", cro.getObjects().getProperty("crm_oppo_closedate"), wd);
		return this;
	}
	
	public CrmService enterLoadSource() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("crm_loadsource"), "value", "Call", wd);
		return this;
	}
	
	public CrmService enterOppoDescription(String description) throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.inserttext("css", cro.getObjects().getProperty("crm_oppo_description"), wd, description);
		return this;
	}

// created oppurtunities //////////////////////////////////////////////////////////////////////////////////////////////////////


	public String getCreatedOppoName(){
		String opponame = CommonUtils.getText("css", cro.getObjects().getProperty("crm_create_doppo_name"), wd);
		return opponame;
	}
	
	
	public String getCreatedOppoStage(){
		String oppostage = CommonUtils.getText("css", cro.getObjects().getProperty("crm_created_oppo_stage"), wd);
		return oppostage;
	}
	
	public String getCreatedOppoAmount(){
		String oppoamount = CommonUtils.getText("css", cro.getObjects().getProperty("crm_created_oppo_amount"), wd);
		System.out.println(oppoamount);
		String []amount = oppoamount.split("$");
		return oppoamount;
	}
	public String getCreatedOppoProbability(){
		String oppoprob = CommonUtils.getText("css", cro.getObjects().getProperty("crm_created_oppo_Probability"), wd);
		
		return oppoprob;
	}

	
	public String getCreatedOppoLoadSource(){
		String oppoloadsource = CommonUtils.getText("css", cro.getObjects().getProperty("crm_created_oppo_loadsource"), wd);
		return oppoloadsource;
	}
	
	public String getCreatedOppodescription(){
		String oppodescription = CommonUtils.getText("css", cro.getObjects().getProperty("crm_created_oppo_description"), wd);
		return oppodescription;
	}
	
	
	
	public String getCreatedTaskName() {
		String taskname = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedtask_name"), wd);
		System.out.println(taskname);
		return taskname;
		}

		public String getCreatedTaskStatus() {
		String taskstatus = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedtask_status"), wd);
		System.out.println(taskstatus);
		return taskstatus;
		}

		public String getCreatedTaskPriority() {
		String taskpriority = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedtask_priority"), wd);
		System.out.println(taskpriority);
		return taskpriority;
		}

		public String getCreatedTaskDescription() {
		String taskdescription = CommonUtils.getText("css", cro.getObjects().getProperty("getcreatedtask_description"), wd);
		System.out.println(taskdescription);
		return taskdescription;
		}

		public ArrayList<String> getCreatedTaskDetails() throws InterruptedException {
		ArrayList<String> taskinfo = new ArrayList<String>();
		taskinfo.add(getCreatedTaskName());
		taskinfo.add(getCreatedTaskStatus());
		taskinfo.add(getCreatedTaskPriority());
		taskinfo.add(getCreatedTaskDescription());
		return taskinfo;
		}
	
	
	
	
	
	
	// sikuli
	
	public CrmService clickImport(){
		CommonUtils.clickButton("css", cro.getObjects().getProperty("hamberger_admini_import"), wd);
		return this;
	}
	
	public CrmService clickOnRunIMport() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("ham_admin_contact_runimport"), wd);
		return this;
	}
	
	public CrmService nextButtonAfterSelectingFile() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("next_afterchoosingfile"), wd);
		return this;
	}
	
	public CrmService clickOnImportedName() throws InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("ham_admin_importname"), wd);
		return this;
	}
	
//	CONTACTS USIND SIKULI:  #####################################################################################################
	
	public CrmService contactFieldDropDown() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("abcd"), "value", "firstName", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("email_fromdropdown"), "value", "emailAddress", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("phone_fromdropdown"), "value", "phoneNumberMobile", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("street_fromdropdown"), "value", "addressStreet", wd);//CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("email_fromdropdown"), "value", "emailAddress", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("city_fromdropdown"), "value", "addressCity", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("state_fromdropdown"), "value", "addressState", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("postalcode_fromdropdown"), "value", "addressPostalCode", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("country_fromdropdown"), "value", "addressCountry", wd);
	//	CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("description_fromdropdown"), "value", "description", wd);
		return this;
		
	}
	
	public CrmService contactUsingSikuli() throws FindFailed, InterruptedException{
		sc.click("src//test//resources//AppImages//espo home.png");
		sc.click("src//test//resources//AppImages//hamburger.png");
		sc.click("src//test//resources//AppImages//administration.png");
		sc.click(clickImport());
		sc.click("src//test//resources//AppImages//account from entity dd.png");
		sc.click("src//test//resources//AppImages//click contact from entity type.png");
		sc.click("src//test//resources//AppImages//choosefile notepad file.png");
		sc.click("src//test//resources//AppImages//desktop.png");
		sc.click("src//test//resources//AppImages//contacts csv.png");
		sc.click("src//test//resources//AppImages//open to choose file.png");	
		return this;
	}
	
	// LEADS USING SIKULI: ######################################################################################################
	
	public CrmService leadsUsingSikuli() throws FindFailed, InterruptedException{
		sc.click("src//test//resources//AppImages//espo home.png");
		sc.click("src//test//resources//AppImages//hamburger.png");
		sc.click("src//test//resources//AppImages//administration.png");
		sc.click(clickImport());
		sc.click("src//test//resources//AppImages//account from entity dd.png");
		sc.click("src//test//resources//AppImages//leads in entity dropdown.png");
		sc.click("src//test//resources//AppImages//choosefile notepad file.png");
		sc.click("src//test//resources//AppImages//desktop.png");
		sc.click("src//test//resources//AppImages//leads csv.png");
		sc.click("src//test//resources//AppImages//open to choose file.png");	
		
		return this;
	}
	
	
	public CrmService leadsFieldDropDown() throws InterruptedException{
		CommonUtils.wait(1);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_email_fromfieldsdd"), "value", "emailAddress", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_phone_fromfieldsdd"), "value", "phoneNumberMobile", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_title_fromfieldsdd"), "value", "title", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_street_fromfieldsdd"), "value", "addressStreet", wd);//CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("email_fromdropdown"), "value", "emailAddress", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_city_fromfieldsdd"), "value", "addressCity", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_state_fromfieldsdd"), "value", "addressState", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_postalcode_fromfieldsdd"), "value", "addressPostalCode", wd);
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("leads_country_fromfieldsdd"), "value", "addressCountry", wd);
	//	CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("description_fromdropdown"), "value", "description", wd);
		return this;
		
	}
	
	public CrmService navigateToHomePage() throws FindFailed, InterruptedException{
		CommonUtils.wait(2);
	//	sc.click("src//test//resources//AppImages//google image.png");
		sc.click("src//test//resources//AppImages//espo home.png");
		sc.click("src//test//resources//AppImages//accounts.png");
		sc.click("src//test//resources//AppImages//create account.png");
		sc.click("src//test//resources//AppImages//account name.png");
		return this;
	}
	
	
	public CrmService addFields() throws FindFailed, InterruptedException{
		CommonUtils.wait(2);
	//	sc.click("src//test//resources//AppImages//google image.png");
		sc.click("src//test//resources//AppImages//espo home.png");
		sc.click("src//test//resources//AppImages//accounts.png");
		sc.click("src//test//resources//AppImages//add field.png");
		sc.click("src///test//resources//AppImages//assigned user in addfield.png");
		sc.click("src//test//resources//AppImages//add field.png");
		sc.click("src//test//resources//AppImages//description in addfield.png");
		//sc.click("src//test//resources//AppImages//value in addfields.png");
		//sc.type("prince");
		sc.click("src//test//resources//AppImages//add field.png");
		sc.click("src/test/resources/AppImages/industry in add fields.png");
		sc.click("src//test//resources//AppImages//any of  in industry_addfields.png");
	//	sc.click("src//test//resources//AppImages//any of  in industry_addfields.png");
		sc.click("src//test//resources//AppImages//is notempty in industry_addfields.png");
		return this;
	}
	
	
//// TASKS USING SIKULI: #######################################################################################################	
	
	public CrmService tasksUsingSikuli() throws FindFailed, InterruptedException{
		sc.click("src//test//resources//AppImages//espo home.png");
		sc.click("src//test//resources//AppImages//hamburger.png");
		sc.click("src//test//resources//AppImages//administration.png");
		sc.click(clickImport());
		sc.click("src//test//resources//AppImages//account from entity dd.png");
		sc.click("src//test//resources//AppImages//tasks from entity dd.png");
		sc.click("src//test//resources//AppImages//choosefile notepad file.png");
		sc.click("src//test//resources//AppImages//desktop.png");
		sc.click("src//test//resources//AppImages//tasks csv.png");
		sc.click("src//test//resources//AppImages//open to choose file.png");	
		sc.click(nextButtonAfterSelectingFile());
		return this;
	}
	
	public CrmService tasksFieldDropdown(){
		CommonUtils.selectDropDownItem("css", cro.getObjects().getProperty("tasks_datedue"), "value", "dateEnd", wd);
		
		return this;
	}
	
	public CrmService runImport() throws FindFailed, InterruptedException{
		CommonUtils.wait(2);
		CommonUtils.clickButton("css", cro.getObjects().getProperty("run_import"), wd);
		return this;
	}
	
}


