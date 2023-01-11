package com.macys.OrderMessageProducer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageProducer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itemID;
	private String itemName;
	private String itemDescriptione;
	private Double itemLength;
	private Double itemWidth;
	private Double itemHeight;
	private Double itemWeight;
	private String imagePathname;
	private String rfidTagged;
	private Integer storageAttribute;
	private String pickType;
	private String upcList;
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescriptione() {
		return itemDescriptione;
	}
	public void setItemDescriptione(String itemDescriptione) {
		this.itemDescriptione = itemDescriptione;
	}
	public Double getItemLength() {
		return itemLength;
	}
	public void setItemLength(Double itemLength) {
		this.itemLength = itemLength;
	}
	public Double getItemWidth() {
		return itemWidth;
	}
	public void setItemWidth(Double itemWidth) {
		this.itemWidth = itemWidth;
	}
	public Double getItemHeight() {
		return itemHeight;
	}
	public void setItemHeight(Double itemHeight) {
		this.itemHeight = itemHeight;
	}
	public Double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getImagePathname() {
		return imagePathname;
	}
	public void setImagePathname(String imagePathname) {
		this.imagePathname = imagePathname;
	}
	public String getRfidTagged() {
		return rfidTagged;
	}
	public void setRfidTagged(String rfidTagged) {
		this.rfidTagged = rfidTagged;
	}
	public Integer getStorageAttribute() {
		return storageAttribute;
	}
	public void setStorageAttribute(Integer storageAttribute) {
		this.storageAttribute = storageAttribute;
	}
	public String getPickType() {
		return pickType;
	}
	public void setPickType(String pickType) {
		this.pickType = pickType;
	}
	public String getUpcList() {
		return upcList;
	}
	public void setUpcList(String upcList) {
		this.upcList = upcList;
	}
	@Override
	public String toString() {
		return "MessageProducer [itemID=" + itemID + ", itemName=" + itemName + ", itemDescriptione=" + itemDescriptione
				+ ", itemLength=" + itemLength + ", itemWidth=" + itemWidth + ", itemHeight=" + itemHeight
				+ ", itemWeight=" + itemWeight + ", imagePathname=" + imagePathname + ", rfidTagged=" + rfidTagged
				+ ", storageAttribute=" + storageAttribute + ", pickType=" + pickType + ", upcList=" + upcList + "]";
	}

}
