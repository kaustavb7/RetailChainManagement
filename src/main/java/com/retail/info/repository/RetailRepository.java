package com.retail.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retail.info.domain.RetailInfo;

public interface RetailRepository extends JpaRepository<RetailInfo, Integer> {

}
