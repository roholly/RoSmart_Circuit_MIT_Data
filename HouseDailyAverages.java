package edu.acc.java;

import java.io.Serializable;


public class HouseDailyAverages implements Serializable {
	private String houseId;
	private String circuit;
	private Double overallAvg;
	private Double minAvg;
	private String minDate;
	private Double maxAvg;
	private String maxDate;

	public HouseDailyAverages() {
		// TODO Auto-generated constructor stub
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public Double getOverallAvg() {
		return overallAvg;
	}

	public void setOverallAvg(Double overallAvg) {
		this.overallAvg = overallAvg;
	}

	public Double getMinAvg() {
		return minAvg;
	}

	public void setMinAvg(Double minAvg) {
		this.minAvg = minAvg;
	}

	public String getMinDate() {
		return minDate;
	}

	public void setMinDate(String minDate) {
		this.minDate = minDate;
	}

	public Double getMaxAvg() {
		return maxAvg;
	}

	public void setMaxAvg(Double maxAvg) {
		this.maxAvg = maxAvg;
	}

	public String getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}

	
}
