package demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component("basedao")
public class BaseDao  extends HibernateDaoSupport{
	
	 @Resource(name="sessionFactory")
	  public void setFactory(SessionFactory sessionFactory){
		  super.setSessionFactory(sessionFactory);
	  }
	
	 public void add(Object obj){
		 super.getHibernateTemplate().save(obj);
	 }
	 
	 public void update(Object obj){
		 super.getHibernateTemplate().update(obj);
	 }
	 
	 public void delete(Object obj){
		 super.getHibernateTemplate().delete(obj);
	 }
	 
	 public Object load(Class clazz, Integer id){
		 return super.getHibernateTemplate().get(clazz, id);
	 }
	 
	 public List  find(String hql, Object[] params){
		 return super.getHibernateTemplate().find(hql, params);
	 }
}
