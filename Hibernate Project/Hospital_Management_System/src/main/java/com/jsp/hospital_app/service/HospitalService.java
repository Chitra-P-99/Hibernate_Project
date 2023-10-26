package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.HospitalDaoImp;
import com.jsp.hospital_app.dto.Hospital;

public class HospitalService {
	public void saveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		daoImp.saveHospital(hospital);
		if(hospital!=null)
		{
			System.out.println("Data Saved");
			
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Hospital getHospitalById(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital=daoImp.getHospitalById(hid);
		if(hospital!=null)
		{
			return hospital;
			
		}
		else
		{
			return null;
		}
	}
	public void deleteHospital(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean flag=daoImp.deleteHospitalId(hid);
		if(flag)
		{
			System.out.println("Data Deleted");
			
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Hospital updateHospital(Hospital hospital,int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.updateHospital(hid, hospital);
		if(hospital1!=null)
		{
			return hospital1;
			
		}
		else
		{
			return null;
		}
	}

}
