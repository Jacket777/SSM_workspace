package com.itheima.jdbc;

import java.util.List;

/**
 * Created by 17081290 on 2021/2/8.
 */
public interface AccountDao {
    //添加
    public int addAccount(Account account);
    //更新
    public int updateAccount(Account account);
    //删除
    public int deleteAccount(int id);

    //通过id查询
    public Account findAccountById(int id);
    //查询所有账户
    public List<Account> findAllAccount();
}
