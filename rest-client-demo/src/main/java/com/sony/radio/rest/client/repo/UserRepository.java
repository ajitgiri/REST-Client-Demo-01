/**
 * @author Ajit Kumar Giri
 * 07-May-2015
 */
package com.sony.radio.rest.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sony.radio.rest.client.domain.User;

/**
 * @author Itopia
 *
 */

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findById(int id);
}
