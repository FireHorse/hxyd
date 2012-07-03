package com.hxyd.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 单位信息Bean，对应数据库中的TB002表
 * @author mzy
 * @date 2012-07-02
 * @version 0.1
 */
public class Unit implements Serializable{
	
	private static final long serialVersionUID = 850789203242393419L;
	
	private String unitAccNum;//单位公积金账号
	private String unitAccName;//单位名称
	private String unitAddr;//单位地址
	private String orgCode;//组织机构代码
	private String unitChar;//单位类别
	private String unitKind;//企业类型
	private String salaryDate;//发薪日期
	private String unitPhone;//联系电话
	private String accState;//账户状态
	private Double balance;//公积金余额
	private Double baseNumber;//缴存基数
	private Double unitProp;//单位比例
	private Double perProp;//个人比例
	private Double unitPaySum;//单位月应缴总额
	private Double perPaySum;//个人月应缴总额
	private Integer PersNum;//单位人数
	private Date lastPryDate;//最后汇缴月
	private String instCode;//机构代码
	private String op;//柜员
	private Date creatDate;//建立日期
	private String remakrk;//备注
	public String getUnitAccNum() {
		return unitAccNum;
	}
	public void setUnitAccNum(String unitAccNum) {
		this.unitAccNum = unitAccNum;
	}
	public String getUnitAccName() {
		return unitAccName;
	}
	public void setUnitAccName(String unitAccName) {
		this.unitAccName = unitAccName;
	}
	public String getUnitAddr() {
		return unitAddr;
	}
	public void setUnitAddr(String unitAddr) {
		this.unitAddr = unitAddr;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getUnitChar() {
		return unitChar;
	}
	public void setUnitChar(String unitChar) {
		this.unitChar = unitChar;
	}
	public String getUnitKind() {
		return unitKind;
	}
	public void setUnitKind(String unitKind) {
		this.unitKind = unitKind;
	}
	public String getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(String salaryDate) {
		this.salaryDate = salaryDate;
	}
	public String getUnitPhone() {
		return unitPhone;
	}
	public void setUnitPhone(String unitPhone) {
		this.unitPhone = unitPhone;
	}
	public String getAccState() {
		return accState;
	}
	public void setAccState(String accState) {
		this.accState = accState;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getBaseNumber() {
		return baseNumber;
	}
	public void setBaseNumber(Double baseNumber) {
		this.baseNumber = baseNumber;
	}
	public Double getUnitProp() {
		return unitProp;
	}
	public void setUnitProp(Double unitProp) {
		this.unitProp = unitProp;
	}
	public Double getPerProp() {
		return perProp;
	}
	public void setPerProp(Double perProp) {
		this.perProp = perProp;
	}
	public Double getUnitPaySum() {
		return unitPaySum;
	}
	public void setUnitPaySum(Double unitPaySum) {
		this.unitPaySum = unitPaySum;
	}
	public Double getPerPaySum() {
		return perPaySum;
	}
	public void setPerPaySum(Double perPaySum) {
		this.perPaySum = perPaySum;
	}
	public Integer getPersNum() {
		return PersNum;
	}
	public void setPersNum(Integer persNum) {
		PersNum = persNum;
	}
	public Date getLastPryDate() {
		return lastPryDate;
	}
	public void setLastPryDate(Date lastPryDate) {
		this.lastPryDate = lastPryDate;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public String getRemakrk() {
		return remakrk;
	}
	public void setRemakrk(String remakrk) {
		this.remakrk = remakrk;
	}
}
