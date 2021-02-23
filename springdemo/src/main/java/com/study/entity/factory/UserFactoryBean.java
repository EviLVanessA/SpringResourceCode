package com.study.entity.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author jianghui
 * @date 2021-02-22 16:29
 */
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
