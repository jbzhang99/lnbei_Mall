package com.lnbei.sp.service;

import com.lnbei.sp.domain.SpShopExpress;
import java.util.List;

/**
 * 商家快递 服务层
 * 
 * @author lnbei
 * @date 2020-02-05
 */
public interface ISpShopExpressService 
{
	/**
     * 查询商家快递信息
     * 
     * @param mid 商家快递ID
     * @return 商家快递信息
     */
	public SpShopExpress selectSpShopExpressById(String mid);
	
	/**
     * 查询商家快递列表
     * 
     * @param spShopExpress 商家快递信息
     * @return 商家快递集合
     */
	public List<SpShopExpress> selectSpShopExpressList(SpShopExpress spShopExpress);
	
	/**
     * 新增商家快递
     * 
     * @param spShopExpress 商家快递信息
     * @return 结果
     */
	public int insertSpShopExpress(SpShopExpress spShopExpress);
	
	/**
     * 修改商家快递
     * 
     * @param spShopExpress 商家快递信息
     * @return 结果
     */
	public int updateSpShopExpress(SpShopExpress spShopExpress);
		
	/**
     * 删除商家快递信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpShopExpressByIds(String ids);
	
}
