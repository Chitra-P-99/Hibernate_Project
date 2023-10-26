package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.dto.Hospital;
import com.jsp.hospital_app.service.HospitalService;

public class UpdateHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		hospital.setName("apollo");
		hospital.setWebsite("www.apollo.com");
		service.updateHospital(hospital, 2);
	}

}
