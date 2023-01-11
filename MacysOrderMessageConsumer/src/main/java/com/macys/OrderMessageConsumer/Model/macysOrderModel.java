package com.macys.OrderMessageConsumer.Model;

public class macysOrderModel {

	private Integer orderID;
	private String orderTypeCode;
	private Integer partnerOrderID;
	private String orderStatus;
	private Integer messageCreateTimeStamp;
	private String fulfillmentChannelCode;
	private Integer orderStatusCode;
	private String orderStatusDescription;
	private Integer sellZLDivisionNbr;
	private Integer sellZLLocationNbr;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public String getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public Integer getPartnerOrderID() {
		return partnerOrderID;
	}

	public void setPartnerOrderID(Integer partnerOrderID) {
		this.partnerOrderID = partnerOrderID;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getMessageCreateTimeStamp() {
		return messageCreateTimeStamp;
	}

	public void setMessageCreateTimeStamp(Integer messageCreateTimeStamp) {
		this.messageCreateTimeStamp = messageCreateTimeStamp;
	}

	public String getFulfillmentChannelCode() {
		return fulfillmentChannelCode;
	}

	public void setFulfillmentChannelCode(String fulfillmentChannelCode) {
		this.fulfillmentChannelCode = fulfillmentChannelCode;
	}

	public Integer getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(Integer orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}

	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}

	public Integer getSellZLDivisionNbr() {
		return sellZLDivisionNbr;
	}

	public void setSellZLDivisionNbr(Integer sellZLDivisionNbr) {
		this.sellZLDivisionNbr = sellZLDivisionNbr;
	}

	public Integer getSellZLLocationNbr() {
		return sellZLLocationNbr;
	}

	public void setSellZLLocationNbr(Integer sellZLLocationNbr) {
		this.sellZLLocationNbr = sellZLLocationNbr;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getSubClientID() {
		return subClientID;
	}

	public void setSubClientID(String subClientID) {
		this.subClientID = subClientID;
	}

	public String getSellingChannelCode() {
		return sellingChannelCode;
	}

	public void setSellingChannelCode(String sellingChannelCode) {
		this.sellingChannelCode = sellingChannelCode;
	}

	public Integer getSeperatorSource0() {
		return seperatorSource0;
	}

	public void setSeperatorSource0(Integer seperatorSource0) {
		this.seperatorSource0 = seperatorSource0;
	}

	public Integer getSeparatorSource1() {
		return separatorSource1;
	}

	public void setSeparatorSource1(Integer separatorSource1) {
		this.separatorSource1 = separatorSource1;
	}

	private String clientID;
	private String subClientID;
	private String sellingChannelCode;
	private Integer seperatorSource0;
	private Integer separatorSource1;

}
