package com.oa.dao.impl;

import java.io.Serializable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import com.oa.base.BaseDaoImpl;
import com.oa.dao.UserDao;
import com.oa.entity.User;

@Repository("UserDao")
@SuppressWarnings("all")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	

}
