package com.codegym.repository;

import com.codegym.model.Ethnicity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EthnicityRepository extends PagingAndSortingRepository<Ethnicity,Long> {
}
