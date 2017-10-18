package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.BaseDao;

@Service("baseservice")
public class BaseService {
	@Autowired
	private BaseDao basedao;
	
	@Transactional
	public void add(Object obj){
		basedao.add(obj);
	}
	@Transactional
	 public void update(Object obj){
		 basedao.update(obj);
	 }
	@Transactional
	 public void delete(Object obj){
		 basedao.delete(obj);
	 }
	 
	 public Object load(Class clazz, Integer id){
		 return basedao.load(clazz, id);
	 }
	 public List  find(String hql){
		 return basedao.find(hql, null);
	 }
	 
	 public List  find(String hql, Object[] params){
		 return basedao.find(hql, params);
	 }
}
