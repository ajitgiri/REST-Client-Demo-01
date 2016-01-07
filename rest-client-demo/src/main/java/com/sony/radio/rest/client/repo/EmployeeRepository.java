/**
 * @author Itopia
 * 27-Apr-2015
 */
package com.sony.radio.rest.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sony.radio.rest.client.domain.Employee;

/**
 * @author Itopia
 *
 */

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findById(Integer iid);
}
