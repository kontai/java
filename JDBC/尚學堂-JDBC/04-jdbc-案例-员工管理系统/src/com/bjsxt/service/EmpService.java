package com.bjsxt.service;

public interface EmpService {
	//查詢全部員工信息
			public void selAllEmpInfo();
	//根據用戶編號查詢用戶信息
			public void selEmpInfoByEmpno();
	//刪除員工信息
			public void delEmpInfo();
	//新增員工信息
			public void insEmpInfo();
	//更新用戶信息
			public void upEmpInfo();
}
