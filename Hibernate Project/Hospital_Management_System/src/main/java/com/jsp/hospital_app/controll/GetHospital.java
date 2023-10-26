package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalService;

public class GetHospital {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		
		service.getHospitalById(2);
		System.out.println(hospital.getHid());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		
	}

}
