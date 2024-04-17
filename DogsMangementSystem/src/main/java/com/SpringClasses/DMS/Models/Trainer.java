/**
 * 
 */
package com.SpringClasses.DMS.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * ${Naveen Reddy Venna}
 */
@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	/**
	 * @return the rainerId
	 */
	public int getRainerId() {
		return trainerId;
	}
	/**
	 * @param rainerId the rainerId to set
	 */
	public void setRainerId(int rainerId) {
		this.trainerId = rainerId;
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	/**
	 * @return the trainerAddress
	 */
	public String getTrainerAddress() {
		return trainerAddress;
	}
	/**
	 * @param trainerAddress the trainerAddress to set
	 */
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [rainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	

}
