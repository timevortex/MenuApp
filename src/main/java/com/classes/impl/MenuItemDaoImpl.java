package com.classes.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classes.dao.MenuItemDao;
import com.classes.model.MenuItem;


@Repository("menuItemDao")
public class MenuItemDaoImpl implements MenuItemDao{

	@Autowired
	private SessionFactory sessionFactory;

	
	public MenuItem get(Integer menuId) {
		return (MenuItem) sessionFactory.getCurrentSession().get(MenuItem.class, menuId);
	}

	
	@SuppressWarnings("unchecked")
	public List<MenuItem> getMenuItemList() {
		return (List<MenuItem>) sessionFactory.getCurrentSession().createCriteria(MenuItem.class).list();
	}

	
	public void update(MenuItem menuItem) {
		System.out.println("Calling saveOrUpdate");
		sessionFactory.getCurrentSession().saveOrUpdate(menuItem);
	}

	public void delete(MenuItem menuItem) {
		//sessionFactory.getCurrentSession().createQuery("DELETE FROM menuitems WHERE empid = "+menuItem.getMenuId()).executeUpdate();
		sessionFactory.getCurrentSession().delete(menuItem);

	}

	


}