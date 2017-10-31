package demo.web;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Admin;
import demo.service.BaseService;

/**
 * 
 * @author huhu
 * 备注：对每一个实体类的操作单独创建一个contraler，名名规范  类名+controller
 *
 */
@Controller
@RequestMapping("/admin")
public class Admincontroller {
	@Resource(name="baseservice")
	private BaseService Adminbase;
	
	//加载表里的数据
	@RequestMapping("/list")
	@ResponseBody
	public Object list(Admin adminbean){
		List ki =Adminbase.find("from Admin", null);
		return ki;
	}
	//更新表里数据
	@RequestMapping("/update")
	@ResponseBody
	private String update(Admin adminbean){
		Admin uik=(Admin)Adminbase.load(Admin.class,adminbean.getAdminId());
		uik.setAdminName(adminbean.getAdminName());
		uik.setAdminName(adminbean.getAdminName());
		uik.setPerssion(adminbean.getAdminpwd());
		Adminbase.update(uik);
		return "ok";
	}
	//向表里添加数据
	@RequestMapping("/add")
	@ResponseBody
	private String add(Admin adminbean){
		Adminbase.add(adminbean);
		return "{\"ok\":\"ok\"}";
	}

}
