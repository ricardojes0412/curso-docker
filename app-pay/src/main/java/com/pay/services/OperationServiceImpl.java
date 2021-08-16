package com.pay.services;

import com.pay.dao.IOperationDao;
import com.pay.domain.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements IOperationService {

    @Autowired
    private IOperationDao _iOperationDao;

    @Override
    public Operation save(Operation operation) {
        return _iOperationDao.save(operation);
    }

}
