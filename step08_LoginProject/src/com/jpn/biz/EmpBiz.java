package com.jpn.biz;

import java.util.ArrayList;

import com.jpn.dao.EmpDao;
import com.jpn.entity.EmpEntity;

//유효성검사, 계산 처리 담당
public class EmpBiz {
	public int insertEmp(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.insertEmp(entity);
		return n;
	}

	public ArrayList<EmpEntity> listEmp() {
		EmpDao dao = new EmpDao();
		ArrayList<EmpEntity> list = dao.listEmp();
		return list;
	}

	public int updateEmp(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.updateEmp(entity);
		return n;
	}

	public int deleteEmp(EmpEntity entity) {
		EmpDao dao=new EmpDao();
		int n=dao.deleteEmp(entity);
		return n;
	}
}
