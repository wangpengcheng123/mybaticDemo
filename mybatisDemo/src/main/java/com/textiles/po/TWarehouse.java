package com.textiles.po;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;
public class TWarehouse implements Serializable{
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private Integer id;
   private String whName;
   private Integer companyId;
   private String whTel;
   private String whAddress;
   private String whContacts;
   private Integer operatorId;
   private String operatorName;
   private Date ctime;
   private Integer parentId;
   private String parentIds;
   private Integer whLevel;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWhName() {
		return whName;
	}
	public void setWhName(String whName) {
		this.whName = whName;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getWhTel() {
		return whTel;
	}
	public void setWhTel(String whTel) {
		this.whTel = whTel;
	}
	public String getWhAddress() {
		return whAddress;
	}
	public void setWhAddress(String whAddress) {
		this.whAddress = whAddress;
	}
	public String getWhContacts() {
		return whContacts;
	}
	public void setWhContacts(String whContacts) {
		this.whContacts = whContacts;
	}
	public Integer getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentIds() {
		return parentIds;
	}
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	public Integer getWhLevel() {
		return whLevel;
	}
	public void setWhLevel(Integer whLevel) {
		this.whLevel = whLevel;
	}
	 
   
   
}
