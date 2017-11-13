package org.feona.service;

import org.feona.pojo.Account;

import java.util.List;

/**
 * @AUTHER feona
 * @CREATE 2017/11/8  9:26
 **/
public interface AccountService {

    int deleteByPrimaryKey(Integer id);
    int insert(Account record);
    int insertSelective(Account record);
    Account selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Account record);
    int updateByPrimaryKey(Account record);

}
