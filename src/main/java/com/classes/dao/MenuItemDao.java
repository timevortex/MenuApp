package com.classes.dao;

import java.util.List;

import com.classes.model.MenuItem;

public interface MenuItemDao {
	MenuItem get(Integer menuId);
	List <MenuItem>  getMenuItemList();
	void update(MenuItem menuItem);
	void delete(MenuItem menuItem);

}
