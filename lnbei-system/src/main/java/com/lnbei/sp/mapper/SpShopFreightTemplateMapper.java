package com.lnbei.sp.mapper;

import com.lnbei.sp.domain.SpShopFreightTemplate;
import java.util.List;	

/**
 * 店铺运费模板 数据层
 * 
 * @author lnbei
 * @date 2020-02-05
 */
public interface SpShopFreightTemplateMapper 
{
	/**
     * 查询店铺运费模板信息
     * 
     * @param mid 店铺运费模板ID
     * @return 店铺运费模板信息
     */
	public SpShopFreightTemplate selectSpShopFreightTemplateById(String mid);
	
	/**
     * 查询店铺运费模板列表
     * 
     * @param spShopFreightTemplate 店铺运费模板信息
     * @return 店铺运费模板集合
     */
	public List<SpShopFreightTemplate> selectSpShopFreightTemplateList(SpShopFreightTemplate spShopFreightTemplate);
	
	/**
     * 新增店铺运费模板
     * 
     * @param spShopFreightTemplate 店铺运费模板信息
     * @return 结果
     */
	public int insertSpShopFreightTemplate(SpShopFreightTemplate spShopFreightTemplate);
	
	/**
     * 修改店铺运费模板
     * 
     * @param spShopFreightTemplate 店铺运费模板信息
     * @return 结果
     */
	public int updateSpShopFreightTemplate(SpShopFreightTemplate spShopFreightTemplate);
	
	/**
     * 删除店铺运费模板
     * 
     * @param mid 店铺运费模板ID
     * @return 结果
     */
	public int deleteSpShopFreightTemplateById(String mid);
	
	/**
     * 批量删除店铺运费模板
     * 
     * @param mids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpShopFreightTemplateByIds(String[] mids);
	
}