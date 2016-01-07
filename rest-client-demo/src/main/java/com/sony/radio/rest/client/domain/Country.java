/**
 * @author Ajit Kumar Giri
 * 07-May-2015
 */
package com.sony.radio.rest.client.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Itopia
 *
 */
@Entity
@Table(name="country")
public class Country implements Serializable {

	private static final long serialVersionUID = 1142799724230579085L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String countryName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
