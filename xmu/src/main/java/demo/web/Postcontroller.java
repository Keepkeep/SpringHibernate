package demo.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Post;
import demo.bean.Users;
import demo.service.BaseService;

@Controller
@RequestMapping("/post")
public class Postcontroller {
	
	@Autowired
	private BaseService BaseService;
	@RequestMapping("/list")
	@ResponseBody
	private Object list(){
		return BaseService.find("from Post",null);
	}
	@RequestMapping("/add")
	@ResponseBody
	private String add(Post post,HttpSession session,Model model){
		//System.out.println("ÓÊ¼þµØÖ·"+post);
		Integer userId=(Integer)session.getAttribute("userId");
		post.setUserId(userId);
		post.setUsersbaen((Users)BaseService.load(Users.class,userId));
		BaseService.add(post);
		Map li = new HashMap();
		li.put("userId",userId);
		model.addAllAttributes(li);
		return session.getAttribute("userId").toString();
	}
}
