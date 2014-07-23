package com.classes.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MenuItem {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "menuId")
	private int menuId;
	@Column(name="menuName")
	private String menuName;
	@Column(name="category")
	private String category;
	@Column(name="imageId")
	private String imageId;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
}
