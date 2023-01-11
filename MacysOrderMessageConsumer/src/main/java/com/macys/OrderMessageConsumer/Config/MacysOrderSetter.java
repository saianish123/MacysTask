package com.macys.OrderMessageConsumer.Config;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hsqldb.persist.RowInsertInterface.modes;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.macys.OrderMessageConsumer.Model.macysOrderModel;

public class MacysOrderSetter implements ItemPreparedStatementSetter<macysOrderModel> {

	public void setValues(macysOrderModel mOrder, PreparedStatement ps) throws SQLException {
		ps.setInt(1, mOrder.getOrderID()); // orderID;
		ps.setString(2, mOrder.getOrderTypeCode());// orderTypeCode;
		ps.setInt(3, mOrder.getPartnerOrderID()); // partnerOrderID;
		ps.setString(4, mOrder.getOrderStatus()); // orderStatus;
		ps.setInt(5, mOrder.getMessageCreateTimeStamp()); /// messageCreateTimeStamp;
		ps.setString(6, mOrder.getFulfillmentChannelCode()); // fulfillmentChannelCode;
		ps.setInt(7, mOrder.getOrderStatusCode()); // orderStatusCode;
		ps.setString(8, mOrder.getOrderStatusDescription());// orderStatusDescription;
		ps.setInt(9, mOrder.getSellZLDivisionNbr());// sellZLDivisionNbr;
		ps.setInt(10, mOrder.getSellZLLocationNbr()); // sellZLLocationNbr;
	}
}
