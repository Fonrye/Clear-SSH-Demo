package com.fon.dao.impl;

import com.fon.dao.AccountDao;
import com.fon.entity.AccountEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {
    @Override
    public void save(AccountEntity user) {
         getHibernateTemplate().saveOrUpdate(user);;
    }
}
