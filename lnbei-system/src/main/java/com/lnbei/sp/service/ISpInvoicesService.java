package com.lnbei.sp.service;

import com.lnbei.sp.domain.SpInvoices;
import java.util.List;

/**
 * 发票管理 服务层
 * 
 * @author lnbei
 * @date 2020-02-23
 */
public interface ISpInvoicesService 
{
	/**
     * 查询发票管理信息
     * 
     * @param mid 发票管理ID
     * @return 发票管理信息
     */
	public SpInvoices selectSpInvoicesById(String mid);
	
	/**
     * 查询发票管理列表
     * 
     * @param spInvoices 发票管理信息
     * @return 发票管理集合
     */
	public List<SpInvoices> selectSpInvoicesList(SpInvoices spInvoices);
	
	/**
     * 新增发票管理
     * 
     * @param spInvoices 发票管理信息
     * @return 结果
     */
	public int insertSpInvoices(SpInvoices spInvoices);
	
	/**
     * 修改发票管理
     * 
     * @param spInvoices 发票管理信息
     * @return 结果
     */
	public int updateSpInvoices(SpInvoices spInvoices);
		
	/**
     * 删除发票管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpInvoicesByIds(String ids);
	
}
