package com.boom.entity;

import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Customer {
	//�ͻ�id
	private Integer cid;
	//�ͻ�����
	private String custName;
	//�ͻ�����
	private String custLevel;
	//�ͻ���Դ
	private String custSourse;
	//��ϵ�绰
	private String custPhone;
	//�ֻ�
	private String custMobile;
	
	//�ڿͻ�ʵ�����б�ʾ�����ϵ�ˣ�һ���ͻ��ж����ϵ��
	//hibernate���ü��ϱ�ʾ������ݣ�ʹ��set����
	private Set<LinkMan> linkMen=new HashSet<LinkMan>();
	

	public Set<LinkMan> getLinkMen() {
		return linkMen;
	}

	public void setLinkMen(Set<LinkMan> linkMen) {
		linkMen = linkMen;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustSourse() {
		return custSourse;
	}

	public void setCustSourse(String custSourse) {
		this.custSourse = custSourse;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

}
