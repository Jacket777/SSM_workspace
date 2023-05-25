package com.msb.dao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by 17081290 on 2020/11/4.
 */
@Repository("personDao")
@Scope(value="prototype")
public class PersonDao {
}
