package com.example.demo.chap07;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	//SELECT * FROM Cutomers WHERE code = ?
	Optional<Customer> findByCode(Integer code);
	
	//SELECT * FROM Cutomers WHERE age > ?
	List<Customer> findByAgeGreaterThan(Integer age);
	
	//SELECT * FROM Cutomers WHERE age > ? ORDER BY age ASC
	List<Customer> findByAgeGreaterThanOrderByAgeAsc(Integer age);
	
	//SELECT * FROM Cutomers WHERE age > ? ORDER BY age DESC
	List<Customer> findByAgeGreaterThanOrderByAgeDesc(Integer age);
	
	//SELECT * FROM Cutomers WHERE age >= ?
	List<Customer> findByAgeGreaterThanEqual(Integer age);
	
	//SELECT * FROM Cutomers WHERE age < ?
	List<Customer> findByAgeLessThan(Integer age);
	
	//SELECT * FROM Cutomers WHERE age <= ?
	List<Customer> findByAgeLessThanEqual(Integer age);
	
	//SELECT * FROM Cutomers WHERE age BETWEEN ? AND ?
	List<Customer> findByAgeBetween(Integer age1, Integer age2);
	
	//SELECT * FROM Cutomers WHERE name LIKE '??????'
	List<Customer> findByNameLike(String name);
	
	//List<Customer> list = customerRepository.findByNameLike("%郎");
	
	
	//SELECT * FROM Cutomers WHERE age > ?
	@Query(
			value="SELECT code, name, age FROM Customers WHERE age > ?1",
			nativeQuery=true
	)
	List<Customer> find01(Integer age);
	
	//List<Customer> list = customerRepository.find01(20);
	
	
	
	
	
	
	
	
	
	
}
