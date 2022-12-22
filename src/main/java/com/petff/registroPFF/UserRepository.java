package com.petff.registroPFF;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository <User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username=?1")//consultas de JPA integradas
	Optional<User> findByUsername(String username); //consulta opcional 

}
