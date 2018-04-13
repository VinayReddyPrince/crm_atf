package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class CrmTestData {
	
	static CrmAccountData craccountdata = null;
	
	public static CrmAccountData accountTestData(){
		File file = new File("src//test//data//account_data.xml");
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(CrmAccountData.class);
			
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			craccountdata = (CrmAccountData) unmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		return craccountdata;
		
	}

}
