/**
 * 
 */
package com.SpringClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpringClasses.DMS.Models.Dog;

/**
 * ${Naveen Reddy Venna}
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
