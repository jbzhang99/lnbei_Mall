package com.lnbei.sp.service;

import com.lnbei.sp.domain.SpGoodsAttributes;
import java.util.List;

/**
 * 商品属性 服务层
 * 
 * @author lnbei
 * @date 2020-02-05
 */
public interface ISpGoodsAttributesService 
{
	/**
     * 查询商品属性信息
     * 
     * @param mid 商品属性ID
     * @return 商品属性信息
     */
	public SpGoodsAttributes selectSpGoodsAttributesById(String mid);
	
	/**
     * 查询商品属性列表
     * 
     * @param spGoodsAttributes 商品属性信息
     * @return 商品属性集合
     */
	public List<SpGoodsAttributes> selectSpGoodsAttributesList(SpGoodsAttributes spGoodsAttributes);
	
	/**
     * 新增商品属性
     * 
     * @param spGoodsAttributes 商品属性信息
     * @return 结果
     */
	public int insertSpGoodsAttributes(SpGoodsAttributes spGoodsAttributes);
	
	/**
     * 修改商品属性
     * 
     * @param spGoodsAttributes 商品属性信息
     * @return 结果
     */
	public int updateSpGoodsAttributes(SpGoodsAttributes spGoodsAttributes);
		
	/**
     * 删除商品属性信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpGoodsAttributesByIds(String ids);
	
}
