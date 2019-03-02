package com.jpn.biz;

import com.jpn.dao.LoginDao;
import com.jpn.entity.LoginEntity;
//유효성검사, 계산 처리 담당
public class LoginBiz {
	public LoginEntity getLoginUser(String sid, String spwd) {
		LoginDao dao=new LoginDao();
		LoginEntity entity=dao.getLoginUser(sid,spwd);
		return entity;
	}
}
