package com.jsp.hospital_app.controll;

import com.jsp.hospital_app.service.HospitalService;

public class DeleteHospital {
	public static void main(String[] args) {
		HospitalService service=new HospitalService();
		service.deleteHospital(1);
		
	}

}
