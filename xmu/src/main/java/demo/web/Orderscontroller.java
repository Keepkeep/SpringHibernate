package demo.web;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Orders;
import demo.bean.Post;
import demo.bean.Product;
import demo.service.BaseService;

@Controller
@RequestMapping("/order")
public class Orderscontroller {
	@Autowired
	private BaseService baseService;
	
	//查询订单
	@RequestMapping("/list")
	@ResponseBody
	private Object list(Integer userId){
		return baseService.find("from Orders",null);
	}
	//添加订单
	@RequestMapping("/add")
	private String add(@RequestParam("postId") Integer postId,@RequestParam("proId") Integer proId){
		System.out.println("postId"+proId+"产品Id"+proId);
		Post po=(Post)baseService.load(Post.class,postId);
		Product prodeuct=(Product)baseService.load(Product.class,proId);
		Orders order= new Orders();
		order.setOrdtime(new Date());
		order.setSendName("邮递员");
		order.setOrderNo(UUID.randomUUID().toString().replaceAll("-", ""));
		order.setSendTel("13688889999");
		order.setPayment("支付宝");
		order.setPostId(proId);
		order.setProId(proId);
		order.setPostbean(po);
		order.setProductbean(prodeuct);
		baseService.add(order);
		return "forward:/qiantai/html/pay.jsp";
	}
	//修改订单
	@RequestMapping("/update")
	@ResponseBody
	private String update(Orders order){
		Post po=(Post)baseService.load(Post.class,order.getPostId());
		Product prodeuct=(Product)baseService.load(Product.class,order.getProId());
		Orders orders= new Orders();
		orders.setPostbean(po);
		orders.setProductbean(prodeuct);
		baseService.add(orders);
		return "ok";
	}
	//订单删除
	@RequestMapping("/delete")
	@ResponseBody
	private  String delete(Orders obj){
		Orders orders = (Orders)baseService.load(Orders.class,obj.getOrderId());
		baseService.delete(orders);
		return "ok";
	}
}
