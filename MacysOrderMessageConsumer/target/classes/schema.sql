DROP TABLE IF EXISTS macysorder;
CREATE TABLE macysorder(
orderID BIGINT,
orderTypeCode VARCHAR(50),
partnerOrderID INT,
 orderStatus VARCHAR(50),
 messageCreateTimeStamp INT,
 fulfillmentChannelCode VARCHAR(50),
 orderStatusCode INT,
 orderStatusDescription VARCHAR(50),
 sellZLDivisionNbr INT,
 sellZLLocationNbr INT,
 );