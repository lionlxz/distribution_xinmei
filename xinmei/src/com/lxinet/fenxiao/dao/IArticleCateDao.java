package com.lxinet.fenxiao.dao;

import java.util.List;

import com.lxinet.fenxiao.entities.ArticleCate;

/**
 * 创建日期：2014-10-25下午11:16:02
 * 作者：Cz
 */
public interface IArticleCateDao<T extends ArticleCate> extends IBaseDao<T> {
	/**
	 * 通过上级栏目ID查找子栏目
	 * 创建日期：2014-10-26下午7:36:15
	 * 作者：Cz
	 * 网址:http://www.919dns.com
	 * @return
	 */
	public List<T> listByFatherId(int fid);

}
