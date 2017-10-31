package demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Product;
import demo.service.BaseService;

@Controller
@RequestMapping("/product")
public class Productcontroller {
	@Autowired
	private BaseService baseService;
	
	@RequestMapping("/load")
	@ResponseBody
	private Object Loadable(Integer proId){
		System.out.println("����id"+proId);
		return baseService.load(Product.class, proId);
	}
	@RequestMapping("/list")
	@ResponseBody
	private Object list(){
		return baseService.find("from Product", null);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	private Object add(Product product){
		 baseService.add(product);
		 return "ok";
	}
	
	//�鿴������Ʒ
	//������ҳ��
	@RequestMapping("/dangelist")
	@ResponseBody
	private Object dangelist(@RequestParam("proId") Integer proId,HttpSession session){
		System.out.println("�û�Id"+session.getAttribute("userName"));
		return baseService.load(Product.class, proId);
		
	}
}
