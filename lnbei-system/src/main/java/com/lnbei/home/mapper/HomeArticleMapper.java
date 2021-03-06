package com.lnbei.home.mapper;

import com.lnbei.home.domain.HomeArticle;
import java.util.List;	

/**
 * 文章主 数据层
 * 
 * @author lnbei
 * @date 2020-01-24
 */
public interface HomeArticleMapper 
{
	/**
     * 查询文章主信息
     * 
     * @param mid 文章主ID
     * @return 文章主信息
     */
	public HomeArticle selectHomeArticleById(String mid);
	
	/**
     * 查询文章主列表
     * 
     * @param homeArticle 文章主信息
     * @return 文章主集合
     */
	public List<HomeArticle> selectHomeArticleList(HomeArticle homeArticle);
	
	/**
     * 新增文章主
     * 
     * @param homeArticle 文章主信息
     * @return 结果
     */
	public int insertHomeArticle(HomeArticle homeArticle);
	
	/**
     * 修改文章主
     * 
     * @param homeArticle 文章主信息
     * @return 结果
     */
	public int updateHomeArticle(HomeArticle homeArticle);
	
	/**
     * 删除文章主
     * 
     * @param mid 文章主ID
     * @return 结果
     */
	public int deleteHomeArticleById(String mid);
	
	/**
     * 批量删除文章主
     * 
     * @param mids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHomeArticleByIds(String[] mids);
	
	/**
	 * 更新文章属性
	 * @param homeArticle
	 * @return
	 */
	public int updateHomeArticleAttr(HomeArticle homeArticle);
	
	/**
	 * 改变状态
	 * @param mCategory
	 * @return
	 */
	public int changeStatus(HomeArticle homeArticle);
}