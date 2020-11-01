package com.udemy.traditional.service;

import com.udemy.traditional.model.DoctorUser;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
@EnableMongoRepositories
public interface DoctorUserRepository extends PagingAndSortingRepository<DoctorUser, String> {

    public List<DoctorUser> findByUserName(String userName);
}
