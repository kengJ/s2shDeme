package com.oa.base;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
@SuppressWarnings("all")
public class BaseDaoImpl<T> implements BaseDao<T>{
	@Resource
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public Session getCurrentSession(){
		return getSessionFactory().getCurrentSession();
	}
	
	
	public Serializable Save(T o) {
		// TODO Auto-generated method stub
		return getCurrentSession().save(o);
	}

	public void Deletd(T o) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(o);
	}

	public void Update(T o) {
		// TODO Auto-generated method stub
		getCurrentSession().update(o);
	}

	public void SaveOrUpdate(T o) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(o);
	}

	public List<T> find(String hql) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(query.getMaxResults()==0){
			return null;
		}
		return query.list();
	}

	public List<T> find(String hql, Object[] params) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(params!=null && params.length>0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, (String)param);
				i++;
			}
		}
		return query.list();
	}

	public List<T> find(String hql, List<Object> params) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(params!=null && params.size()>0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return query.list();
	}

	public List<T> find(String hql, List<Object> params, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		if(page == null || page > 1){
			page = 1;
		}
		
		if(rows == null || rows > 1){
			rows = 10;
		}
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && params.size() > 0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return query.setFirstResult((page-1)*rows).setMaxResults(rows).list();
	}

	public List<T> find(String hql, Object[] params, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		if(page == null || page > 1){
			page = 1;
		}
		
		if(rows == null || rows > 1){
			rows = 10;
		}
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && params.length > 0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return query.setFirstResult((page-1)*rows).setMaxResults(rows).list();
	}

	public T get(Class<T> c, Serializable id) {
		// TODO Auto-generated method stub
		return (T)getCurrentSession().get(c, id);
	}

	public T get(String hql, Object[] params) {
		// TODO Auto-generated method stub
		List<T> list = this.find(hql,params);
		return list != null && list.size() > 0 ? list.get(0):null;
	}

	public T get(String hql, List<Object> params) {
		// TODO Auto-generated method stub
		List<T> list = this.find(hql,params);
		return list != null && list.size() > 0 ? list.get(0) : null;
	}

	public Long count(String hql) {
		// TODO Auto-generated method stub
		return (Long) getCurrentSession().createQuery(hql).uniqueResult();
	}

	public Long count(String hql, Object[] params) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && params.length > 0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return (Long) query.uniqueResult();
	}

	public Long count(String hql, List<Object> params) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && params.size() > 0){
			int i = 0;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return (Long) query.uniqueResult();
	}

	public Integer executeHql(String hql) {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery(hql).executeUpdate();
	}

	public Integer executeHql(String hql, Object[] params) {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && params.length > 0){
			int i = 0; 
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return query.executeUpdate();
	}

	public Integer executeHql(String hql, List<Object> params) {
		// TODO Auto-generated method stub
		Query  query = getCurrentSession().createQuery(hql);
		if(params != null && params.size() > 0){
			int i = 0 ;
			for(Object param : params){
				query.setParameter(i, param);
				i++;
			}
		}
		return query.executeUpdate();
	}

	

}
