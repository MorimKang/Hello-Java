package com.jpn.biz;

import com.jpn.dao.LoginDao;
import com.jpn.entity.LoginEntity;
//��ȿ���˻�, ��� ó�� ���
public class LoginBiz {
	public LoginEntity getLoginUser(String sid, String spwd) {
		LoginDao dao=new LoginDao();
		LoginEntity entity=dao.getLoginUser(sid,spwd);
		return entity;
	}
}
