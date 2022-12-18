package com.eazybyte.repository;

import com.eazybyte.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person readByEmail(String email);

}
