package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {

       /* try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            mapper.save(account);
            sqlSession.commit();
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

       accountMapper.save(account);

    }

    @Override
    public List<Account> findAll() {

       /* try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accountList = mapper.findAll();
            sqlSession.commit();
            sqlSession.close();

            return accountList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }*/


       return accountMapper.findAll();

    }
}
