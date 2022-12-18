package com.eazybyte.repository;

import com.eazybyte.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(exported = false)
@RepositoryRestResource(path = "courses")
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

    /*
   Spring Data JPA allows us to apply static sorting by adding the OrderBy keyword
   to the method name along with the property name and sort direction (Asc or Desc).
   * */
    List<Courses> findByOrderByNameDesc();

    /*
    The Asc keyword is optional as OrderBy, by default,
    sorts the results in the ascending order.
    * */
    List<Courses> findByOrderByName();
}
