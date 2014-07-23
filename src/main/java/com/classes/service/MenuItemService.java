package com.classes.service;

import java.util.List;

import com.classes.model.MenuItem;

public interface MenuItemService {
	
	MenuItem get(Integer menuId);
	List <MenuItem>  getMenuItemList();
	void update(MenuItem menuItem);
	void delete(MenuItem menuItem);

}
