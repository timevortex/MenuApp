package com.classes.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.classes.bin.MenuItemDto;
import com.classes.model.MenuItem;
import com.classes.service.MenuItemService;



@Component
@Scope("prototype")
@Path("/menuItems")
public class MenuItemController {
	
	
	 @Autowired
	 private MenuItemService menuItemService;


	 @GET
	 @Path("/get/{menuId}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public MenuItem get(@PathParam ("menuId") String menuId){
		 MenuItem mi= null;
		 try{
			 if(menuId!=null && menuId.length()>0)
				 mi=menuItemService.get(Integer.parseInt(menuId));
		 } catch (IllegalArgumentException e) {
		      throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity( e.getMessage() ).build());
		 }
		 return mi;
	 }

	 @GET
	 @Path("/listMenu")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<MenuItem> getMenuItemList(){
		 return menuItemService.getMenuItemList();
	 }

	
	 @POST
	 @Path("/save")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public void  update(MenuItem menuItem){
		 menuItemService.update(menuItem);
	
	 }

	 
	 @POST
	 @Path("/delete")
	 @Consumes(MediaType.APPLICATION_JSON)
	public void delete(MenuItem menuItem){
		 menuItemService.delete(menuItem);
	 }

	

	
	
	
	
	

}
