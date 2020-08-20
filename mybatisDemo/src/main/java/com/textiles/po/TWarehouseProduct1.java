package com.textiles.po;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;
//@Alias("TWarehouseProduct1")给类起别名，可以不在xml中指定
public class TWarehouseProduct1 implements Serializable{
   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private Integer id;
   private Integer whId;
   private Integer productId;
   private String whNum;
   private String vatNum;
   private String spoolNum;
   private Double whAmount;
   private String unit;
   private Double width;
   private Integer weight;
   private Integer initDzId;
   private String initDzCode;
   private Integer initDzType;
   private Date initDzDate;
   private Integer dzId;
   private String dzCode;
   private Integer dzType;
   private Integer stockItemId;
   private String stockCode;
   private Integer customerId;
   private Integer colorId;
   private Double price;
   private String grade;
   private Integer score;
   private Date ctime;
   private Double flower;
   private Integer saleId;
   private String wpMark;
   private String field01;
   private String field02;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWhId() {
		return whId;
	}
	public void setWhId(Integer whId) {
		this.whId = whId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getWhNum() {
		return whNum;
	}
	public void setWhNum(String whNum) {
		this.whNum = whNum;
	}
	public String getVatNum() {
		return vatNum;
	}
	public void setVatNum(String vatNum) {
		this.vatNum = vatNum;
	}
	public String getSpoolNum() {
		return spoolNum;
	}
	public void setSpoolNum(String spoolNum) {
		this.spoolNum = spoolNum;
	}
	public Double getWhAmount() {
		return whAmount;
	}
	public void setWhAmount(Double whAmount) {
		this.whAmount = whAmount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getInitDzId() {
		return initDzId;
	}
	public void setInitDzId(Integer initDzId) {
		this.initDzId = initDzId;
	}
	public String getInitDzCode() {
		return initDzCode;
	}
	public void setInitDzCode(String initDzCode) {
		this.initDzCode = initDzCode;
	}
	public Integer getInitDzType() {
		return initDzType;
	}
	public void setInitDzType(Integer initDzType) {
		this.initDzType = initDzType;
	}
	public Date getInitDzDate() {
		return initDzDate;
	}
	public void setInitDzDate(Date initDzDate) {
		this.initDzDate = initDzDate;
	}
	public Integer getDzId() {
		return dzId;
	}
	public void setDzId(Integer dzId) {
		this.dzId = dzId;
	}
	public String getDzCode() {
		return dzCode;
	}
	public void setDzCode(String dzCode) {
		this.dzCode = dzCode;
	}
	public Integer getDzType() {
		return dzType;
	}
	public void setDzType(Integer dzType) {
		this.dzType = dzType;
	}
	public Integer getStockItemId() {
		return stockItemId;
	}
	public void setStockItemId(Integer stockItemId) {
		this.stockItemId = stockItemId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Double getFlower() {
		return flower;
	}
	public void setFlower(Double flower) {
		this.flower = flower;
	}
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public String getWpMark() {
		return wpMark;
	}
	public void setWpMark(String wpMark) {
		this.wpMark = wpMark;
	}
	public String getField01() {
		return field01;
	}
	public void setField01(String field01) {
		this.field01 = field01;
	}
	public String getField02() {
		return field02;
	}
	public void setField02(String field02) {
		this.field02 = field02;
	}
	@Override
	public String toString() {
		return "TWarehouseProduct1 [id=" + id + ", whId=" + whId + ", productId=" + productId + ", whNum=" + whNum
				+ ", vatNum=" + vatNum + ", spoolNum=" + spoolNum + ", whAmount=" + whAmount + ", unit=" + unit
				+ ", width=" + width + ", weight=" + weight + ", initDzId=" + initDzId + ", initDzCode=" + initDzCode
				+ ", initDzType=" + initDzType + ", initDzDate=" + initDzDate + ", dzId=" + dzId + ", dzCode=" + dzCode
				+ ", dzType=" + dzType + ", stockItemId=" + stockItemId + ", stockCode=" + stockCode + ", customerId="
				+ customerId + ", colorId=" + colorId + ", price=" + price + ", grade=" + grade + ", score=" + score
				+ ", ctime=" + ctime + ", flower=" + flower + ", saleId=" + saleId + ", wpMark=" + wpMark + ", field01="
				+ field01 + ", field02=" + field02 + "]";
	}
   
  
   
}
