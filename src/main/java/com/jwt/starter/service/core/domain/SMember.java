package com.jwt.starter.service.core.domain;

import java.util.Date;
import java.util.List;

public class SMember {
	private Integer id;
	private String username;
	private String password;
	private Integer status;
	private Date addTime;
	private Date modifyTime;
	private Integer parentId;
	private Integer isAdministrator;

	private List<SAuthGroup> sAuthGroups;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getIsAdministrator() {
		return isAdministrator;
	}
	public void setIsAdministrator(Integer isAdministrator) {
		this.isAdministrator = isAdministrator;
	}

	public List<SAuthGroup> getsAuthGroups() {
		return sAuthGroups;
	}
	public void setsAuthGroups(List<SAuthGroup> sAuthGroups) {
		this.sAuthGroups = sAuthGroups;
	}
}