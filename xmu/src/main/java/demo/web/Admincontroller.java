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
 * ��ע����ÿһ��ʵ����Ĳ�����������һ��contraler�������淶  ����+controller
 *
 */
@Controller
@RequestMapping("/admin")
public class Admincontroller {
	@Resource(name="baseservice")
	private BaseService Adminbase;
	
	//���ر��������
	@RequestMapping("/list")
	@ResponseBody
	public Object list(Admin adminbean){
		List ki =Adminbase.find("from Admin", null);
		return ki;
	}
	//���±�������
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
	//������������
	@RequestMapping("/add")
	@ResponseBody
	private String add(Admin adminbean){
		Adminbase.add(adminbean);
		return "{\"ok\":\"ok\"}";
	}

}
