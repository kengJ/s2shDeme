package com.oa.base;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	/**
	 * 保存一个对象
	 * @param oaUser
	 * @return
	 */
	public Serializable Save(T o);
	
	/**
	 * 删除一个对象
	 * @param o
	 */
	public void Deletd(T o);
	
	/**
	 * 更新一个对象
	 * @param o
	 */
	public void Update(T o);
	
	/**
	 * 保存或更新一个对象
	 * @param o
	 */
	public void SaveOrUpdate(T o);
	
	/**
	 * 查询
	 * @param hql
	 * @return
	 */
	public List<T> find(String hql);
	
	/**
	 * 查询集合
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> find(String hql , Object[] params);
	
	/**
	 * 查询集合
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<T> find(String hql , List<Object> params);
	
	/**
	 * 分页查询集合
	 * @param hql
	 * @param params
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<T> find(String hql , List<Object> params ,Integer page , Integer rows);
	
	/**
	 * 分页查询集合
	 * @param hql
	 * @param params
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<T> find(String hql , Object[] params , Integer page , Integer rows);
	
	/**
	 * 获取对象
	 * @param c
	 * @param id
	 * @return
	 */
	public T get(Class<T> c , Serializable id );
	
	/**
	 * 获取对象
	 * @param hql
	 * @param params
	 * @return
	 */
	public T get(String hql , Object[] params);
	
	/**
	 * 获取对象
	 * @param hql
	 * @param params
	 * @return
	 */
	public T get(String hql , List<Object> params);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @return
	 */
	public Long count(String hql);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @param params
	 * @return
	 */
	public Long count(String hql , Object[] params);
	
	/**
	 * 查询数据总行数
	 * @param hql
	 * @param params
	 * @return
	 */
	public Long count(String hql , List<Object> params);
	
	/**
	 * 执行HQL语句
	 * @param hql
	 * @return
	 */
	public Integer executeHql(String hql);
	
	/**
	 * 执行HQL语句
	 * @param hql
	 * @param params
	 * @return
	 */
	public Integer executeHql(String hql , Object[] params);
	
	/**
	 * 执行HQL语句
	 * @param hql
	 * @param params
	 * @return
	 */
	public Integer executeHql(String hql , List<Object> params);
}
