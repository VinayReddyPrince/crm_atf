package com.crm.data;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.Assert;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;

public class CrmDbData {

	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	
	public static List<String> getDbData(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}



	public static List<String> getDbDataOfAccountBillingAddress(String queryPath, int columnIndex, int columnIndex1, int columnIndex2, int columnIndex3, int columnIndex4 ){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data	 = rs.getString(columnIndex);
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				String data4 = rs.getString(columnIndex4);
				crmdata.add(data);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
				crmdata.add(data4);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
		
	}
	
	public static List<String> getDbDataOfAccountShippingAddress(String queryPath, int columnIndex, int columnIndex1, int columnIndex2, int columnIndex3, int columnIndex4 ){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data	 = rs.getString(columnIndex);
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				String data4 = rs.getString(columnIndex4);
				crmdata.add(data);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
				crmdata.add(data4);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
		
	}
	
	
	
	
	public static List<String> getDbDataOfContactsName(String queryPath, int columnIndex1,int columnIndex2,int columnIndex3){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	
	public static List<String> getNameFieldsForDbValidation(String queryPath, int columnIndex1,int columnIndex2){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				
				crmdata.add(data1);
				crmdata.add(data2);
				
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfContactAddress(String queryPath, int columnIndex, int columnIndex1, int columnIndex2, int columnIndex3, int columnIndex4 ){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data	 = rs.getString(columnIndex);
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				String data4 = rs.getString(columnIndex4);
				crmdata.add(data);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
				crmdata.add(data4);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
		
	}
	
	
	
	public static List<String> getDbDataOfOppurtunity(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	
	
	public static List<String> getDbDataOfLeadsName(String queryPath, int columnIndex1,int columnIndex2,int columnIndex3){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	
	public static List<String> getSingleColumnDbDataOfLead(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfLeadStatus(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfLeadSource(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfLeadIndustry(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfLeadOppurtunityAmount(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	
	public static List<String> getDbDataOfLeadOppurtunityWebsite(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfLeadAddress(String queryPath, int columnIndex, int columnIndex1, int columnIndex2, int columnIndex3, int columnIndex4 ){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data	 = rs.getString(columnIndex);
				String data1 = rs.getString(columnIndex1);
				String data2 = rs.getString(columnIndex2);
				String data3 = rs.getString(columnIndex3);
				String data4 = rs.getString(columnIndex4);
				crmdata.add(data);
				crmdata.add(data1);
				crmdata.add(data2);
				crmdata.add(data3);
				crmdata.add(data4);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
		
	}
	
	

	public static List<String> getDbDataOfEmailSubject(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	public static List<String> getDbDataOfEmailbody(String queryPath, int columnIndex){
		List<String> crmdata = new ArrayList<String>();
		try{
			String query = new Scanner(new File(queryPath)).useDelimiter("\\A").next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/root","root","");
			st = con.createStatement();
			System.out.println(query);
			rs =st.executeQuery(query);
			
			while(rs.next()){
				String data = rs.getString(columnIndex);
				crmdata.add(data);
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return crmdata;
	}
	
	
	
	
////////////////#################################################################################///////////////////////////////	

	public static List<String> getDbDataListOfContacts(String querypath){
		ArrayList<String> contaddress = new ArrayList<String>();
		contaddress.addAll(CrmDbData.getNameFieldsForDbValidation(querypath, 4, 5));
		contaddress.addAll(CrmDbData.getDbDataOfContactAddress(querypath, 9, 10, 11, 13, 12));
		System.out.println(contaddress);
		return contaddress;
		
	}
	
	public static List<String> getDbDataListOfLeads(String querypath){
		ArrayList<String> leadaddress = new ArrayList<String>();
		leadaddress.addAll(CrmDbData.getNameFieldsForDbValidation(querypath, 4, 5));
		leadaddress.addAll(CrmDbData.getSingleColumnDbDataOfLead(querypath, 6));
		leadaddress.addAll(CrmDbData.getSingleColumnDbDataOfLead(querypath, 11));
		leadaddress.addAll(CrmDbData.getDbDataOfLeadAddress(querypath,12,13,14,16,15));
		leadaddress.addAll(CrmDbData.getSingleColumnDbDataOfLead(querypath, 21));
		System.out.println(leadaddress);
		return leadaddress;
	}



	
	
	
	
	
}



	