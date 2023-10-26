package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Observation;

public interface ObservationDao {
	public Observation saveObservation(Observation observation,int eid);
	public Observation getObservationId(int oid);
	public boolean deleteObservationId(int oid);
	public Observation updateObservation(Observation observation,int oid);
	public List<Observation> getAllObservation();
	public List<Observation> getObservationByDoctorName(String name);
	

}
