package com.pay.dao;

import com.pay.domain.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOperationDao extends CrudRepository<Operation, Integer> {

}
