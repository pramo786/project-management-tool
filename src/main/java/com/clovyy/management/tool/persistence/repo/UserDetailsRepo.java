package com.clovyy.management.tool.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clovyy.management.tool.persistence.entity.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, String> {

}
