package com.proem.exm.dao.wholesaleGroupPurchase.wholesaleGroupPurchaseReturn;

import java.util.List;
import java.util.Map;

import com.proem.exm.utils.Page;

/**
 * 团购退货单明细
 * @author ZuoYM 
 * @com proem
 */
public interface WGPurchaseReturnItemDao {
	
	public List<Map<String, Object>> getObjPagedList(Page page) throws Exception;

	public Long getObjListCount(Page page) throws Exception;
}
