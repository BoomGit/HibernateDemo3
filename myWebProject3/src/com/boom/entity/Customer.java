package com.boom.entity;

import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Customer {
	//客户id
	private Integer cid;
	//客户名称
	private String custName;
	//客户级别
	private String custLevel;
	//客户来源
	private String custSourse;
	//联系电话
	private String custPhone;
	//手机
	private String custMobile;
	
	//在客户实体类中表示多个联系人，一个客户有多个联系人
	//hibernate中用集合表示多个数据，使用set集合
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
