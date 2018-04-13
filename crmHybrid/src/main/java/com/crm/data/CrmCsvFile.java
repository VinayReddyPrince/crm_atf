package com.crm.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class CrmCsvFile {
	
	private static final int String = 0;

	public static List<String> getCsvData() throws IOException {
		List<String> csvdata = new ArrayList<String>();
		FileReader file = new FileReader("C:\\Users\\vinay\\Desktop\\notepad.csv");
		BufferedReader br = new BufferedReader(file);
		StringBuilder sb = new StringBuilder();
		String s= null;
		while((s = br.readLine())!=null){
			s = br.readLine();
		sb.append(s);
		}
		String sc = sb.toString();
		String[] arr = sc.split(",");
		csvdata = Arrays.asList(arr);
		System.out.println(csvdata);
		return csvdata;

		} 
	
	
	public void csvdataIntoList(){
		
	}
	
	public static List<String> getCsvDataForDbValidation() throws IOException {
		List<String> csvdata = new ArrayList<String>();
		FileReader file = new FileReader("C:\\Users\\vinay\\Desktop\\notepad.csv");
		BufferedReader br = new BufferedReader(file);
		StringBuilder sb = new StringBuilder();
		String s= null;
		while((s = br.readLine())!=null){
			s = br.readLine();
		sb.append(s);
		}
		String sc = sb.toString();
		String[] arr = sc.split(",");
		csvdata = Arrays.asList(arr);
//		List<String> csvdata1 = new ArrayList<String>();
//		
//		csvdata.remove("vinayreddy211@gmail.com");
////	boolean bbbb = aaaa.remove("vinayreddy211@gmail.com");
//	//	csvdata.remove(3);
		System.out.println(csvdata);
		return csvdata;

		} 
	
	
	public static List<String> getLeadCsvData() throws IOException {
		List<String> leadcsvfiledata = new ArrayList<String>();
		FileReader file = new FileReader("C:\\Users\\vinay\\Desktop\\leads.csv");
		BufferedReader br = new BufferedReader(file);
		StringBuilder sb = new StringBuilder();
		String s= null;
		while((s = br.readLine())!=null){
			s = br.readLine();
			sb.append(s);
		}
		String sc = sb.toString();
		String[] arr = sc.split(",");
		leadcsvfiledata = Arrays.asList(arr);
		System.out.println(leadcsvfiledata);
		
		return leadcsvfiledata;
		
	}
	
	public static List<String> getTaskCsvData() throws IOException {
		List<String> taskcsvfiledata = new ArrayList<String>();
		FileReader file = new FileReader("C:\\Users\\vinay\\Desktop\\tasks.csv");
		BufferedReader br = new BufferedReader(file);
		StringBuilder sb = new StringBuilder();
		String s= null;
		while((s = br.readLine())!=null){
			s = br.readLine();
			sb.append(s);
		}
		String sc = sb.toString();
		String[] arr = sc.split(",");
		taskcsvfiledata = Arrays.asList(arr);
		System.out.println(taskcsvfiledata);
		
		return taskcsvfiledata;
		
	}
	
	
	
	
	
	
	
	
	

}
