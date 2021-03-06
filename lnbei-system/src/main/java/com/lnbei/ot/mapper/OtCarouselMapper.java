package com.lnbei.ot.mapper;

import com.lnbei.ot.domain.OtCarousel;
import java.util.List;	

/**
 * 轮播图 数据层
 * 
 * @author lnbei
 * @date 2020-04-10
 */
public interface OtCarouselMapper 
{
	/**
     * 查询轮播图信息
     * 
     * @param mid 轮播图ID
     * @return 轮播图信息
     */
	public OtCarousel selectOtCarouselById(String mid);
	
	/**
     * 查询轮播图列表
     * 
     * @param otCarousel 轮播图信息
     * @return 轮播图集合
     */
	public List<OtCarousel> selectOtCarouselList(OtCarousel otCarousel);
	
	/**
     * 新增轮播图
     * 
     * @param otCarousel 轮播图信息
     * @return 结果
     */
	public int insertOtCarousel(OtCarousel otCarousel);
	
	/**
     * 修改轮播图
     * 
     * @param otCarousel 轮播图信息
     * @return 结果
     */
	public int updateOtCarousel(OtCarousel otCarousel);
	
	/**
     * 删除轮播图
     * 
     * @param mid 轮播图ID
     * @return 结果
     */
	public int deleteOtCarouselById(String mid);
	
	/**
     * 批量删除轮播图
     * 
     * @param mids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOtCarouselByIds(String[] mids);
	
}