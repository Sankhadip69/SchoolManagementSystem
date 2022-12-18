package com.eazybyte.repository;

import com.eazybyte.entity.Holidays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidaysRepository extends JpaRepository<Holidays,String> {

}
