package demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Product;
import demo.bean.Shopcar;
import demo.bean.Users;
import demo.service.BaseService;
/**
 * 
 * @author huhu
 * 时间:2017-10-24
 */
@Controller
@RequestMapping("/shopcar")
public class Shopcarcontroller {
	@Autowired
	private BaseService baseService;
	@RequestMapping("/list")
	@ResponseBody
	private Object list(){
		return baseService.find("from Shopcar", null);
	}
	@RequestMapping("/add")
	@ResponseBody
	private String add(Integer proId,HttpSession session){
		Integer userId=(Integer)session.getAttribute("userId");
		//System.out.println("登录用户Id"+userId);
		Shopcar shopcar = new Shopcar();
		shopcar.setProId(proId);
		shopcar.setUserId(userId);
		Product product=(Product)baseService.load(Product.class,proId);
		Users users=(Users)baseService.load(Users.class,userId);
		shopcar.setProductbean(product);
		shopcar.setUsersbean(users);
		shopcar.setScount(1);
		baseService.add(shopcar);
		System.out.println(shopcar);
		return "ok";
	}
	@RequestMapping("/delete")
	@ResponseBody
	private String delete(Integer cid){
		baseService.delete(baseService.load(Shopcar.class,cid));
		return "ok";
	}
	@RequestMapping("/updata")
	@ResponseBody
	private String update(Shopcar shopcar){
		/*
		Shopcar shop=(Shopcar)baseService.load(Shopcar.class,shopcar.getScarId());
		Product product=(Product)baseService.load(Product.class, shopcar.getProId());
		Users users=(Users)baseService.load(Users.class,shopcar.getUserId());
		shop.setProId(shopcar.getUserId());
		shop.setUserId(shopcar.getUserId());
		shop.setProductbean(product);
		shop.setUsersbean(users);
		*/
		return "ok";
	}
}
