/**
 * 
 */
package com.dowhile.dao;

import java.util.List;

import com.dowhile.ProductHistory;

/**
 * @author Yameen Bashir
 *
 */
public interface ProductHistoryDAO {

	ProductHistory addProductHistory(ProductHistory productHistory, int companyId);
	List<ProductHistory> getProductHistoryByProductIdOutletId(int productId,int outletId, int companyId);
	List<ProductHistory> getProductHistoryByUuid(String uUid, int companyId);
	List<ProductHistory> getProductHistoryByProductId(int productId, int companyId);
}
