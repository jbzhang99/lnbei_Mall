package com.lnbei.sp.service;

import com.lnbei.sp.domain.SpCatShops;
import java.util.List;

/**
 * 类别和店铺 服务层
 * 
 * @author lnbei
 * @date 2020-03-06
 */
public interface ISpCatShopsService 
{
	/**
     * 查询类别和店铺信息
     * 
     * @param mid 类别和店铺ID
     * @return 类别和店铺信息
     */
	public SpCatShops selectSpCatShopsById(String mid);
	
	/**
     * 查询类别和店铺列表
     * 
     * @param spCatShops 类别和店铺信息
     * @return 类别和店铺集合
     */
	public List<SpCatShops> selectSpCatShopsList(SpCatShops spCatShops);
	
	/**
     * 新增类别和店铺
     * 
     * @param spCatShops 类别和店铺信息
     * @return 结果
     */
	public int insertSpCatShops(SpCatShops spCatShops);
	
	/**
     * 修改类别和店铺
     * 
     * @param spCatShops 类别和店铺信息
     * @return 结果
     */
	public int updateSpCatShops(SpCatShops spCatShops);
		
	/**
     * 删除类别和店铺信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpCatShopsByIds(String ids);
	
	/**
     * 根据商铺Id删除类别和店铺
     * 
     * @param mids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpCatShopsByShopId(String shopId);
	
}
