USE `ecom`;
DROP TABLE IF EXISTS `composite_product_history`;
CREATE TABLE IF NOT EXISTS `composite_product_history` (
  `COMPOSITE_PRODUCT_HISTORY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMPOSITE_PRODUCT_ID` int(11) NOT NULL,
  `COMPOSITE_PRODUCT_UUID` varchar(500) NOT NULL,
  `PRODUCT_UUID` varchar(500) NOT NULL,
  `COMPOSITE_QUANTITY` int(11) NOT NULL,
  `PRODUCT_ASSOCICATION_ID` int(11) NOT NULL,
  `SELECTIVE_PRODUCT_ASSOCIATION_ID` int(11) NOT NULL,
  `PRODUCT_VARIANT_ASSOCICATION_ID` int(11) DEFAULT NULL,
  `OUTLET_ASSOCICATION_ID` int(11) NOT NULL,
  `ACTIVE_INDICATOR` bit(1) NOT NULL,
  `CREATED_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `LAST_UPDATED` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CREATED_BY` int(11) NOT NULL,
  `UPDATED_BY` int(11) NOT NULL,
  `COMPANY_ASSOCIATION_ID` int(11) NOT NULL,
  `ACTION_TYPE` varchar(100) NOT NULL,
  PRIMARY KEY (`COMPOSITE_PRODUCT_HISTORY_ID`),
  CONSTRAINT COMPOSITE_PRODUCT_HISTORY_COMPOSITE_PRODUCT_ID_FK FOREIGN KEY (COMPOSITE_PRODUCT_ID) REFERENCES composite_product (COMPOSITE_PRODUCT_ID),
   CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_COMPANY_ASSOCIATION_ID_FK` FOREIGN KEY (`COMPANY_ASSOCIATION_ID`)  REFERENCES company (`COMPANY_ID`),
   CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_CREATED_BY_FK` FOREIGN KEY (`CREATED_BY`) REFERENCES user (`USER_ID`),
  CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_UPDATED_BY_FK` FOREIGN KEY (`UPDATED_BY`) REFERENCES user (`USER_ID`),
  CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_PRODUCT_ASSOCICATION_ID_FK` FOREIGN KEY (`PRODUCT_ASSOCICATION_ID`) REFERENCES product (`PRODUCT_ID`),
  CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_SELECTIVE_PRODUCT_ASSOCIATION_ID_FK` FOREIGN KEY (`SELECTIVE_PRODUCT_ASSOCIATION_ID`) REFERENCES product (`PRODUCT_ID`),
  CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_OUTLET_ASSOCICATION_ID_FK` FOREIGN KEY (`OUTLET_ASSOCICATION_ID`) REFERENCES outlet (`OUTLET_ID`),
  CONSTRAINT `COMPOSITE_PRODUCT_HISTORY_PRODUCT_VARIANT_ASSOCICATION_ID_FK` FOREIGN KEY (`PRODUCT_VARIANT_ASSOCICATION_ID`) REFERENCES product_variant (`PRODUCT_VARIANT_ID`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


ALTER TABLE `ecom`.`product` 
ADD COLUMN `IS_COMPOSITE` VARCHAR(10) ;

INSERT INTO stock_order_type ( STOCK_ORDER_TYPE_ID,STOCK_ORDER_TYPE_CODE, STOCK_ORDER_TYPE_DESC, ACTIVE_INDICATOR, 
CREATED_DATE, LAST_UPDATED, CREATED_BY, UPDATED_BY)
VALUES (6, 'SPOA', 'Self Process Order Add', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 1);
INSERT INTO stock_order_type ( STOCK_ORDER_TYPE_ID,STOCK_ORDER_TYPE_CODE, STOCK_ORDER_TYPE_DESC, ACTIVE_INDICATOR, 
CREATED_DATE, LAST_UPDATED, CREATED_BY, UPDATED_BY)
VALUES (7, 'SPOR', 'Self Process Order Remove', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 1);
