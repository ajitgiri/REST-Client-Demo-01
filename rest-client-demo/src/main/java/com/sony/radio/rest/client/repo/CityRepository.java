/**
 * @author Ajit Kumar Giri
 * 07-May-2015
 */
package com.sony.radio.rest.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sony.radio.rest.client.domain.City;

@Transactional
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	public City findById(int id);

}
