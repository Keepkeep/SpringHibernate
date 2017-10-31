package demo.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import demo.bean.Users;
import demo.service.BaseService;

@Controller
@RequestMapping(value="/users")
public class Usercontroller {
	@Resource(name = "baseservice")
	private BaseService Usersbase;

	// 加载表里的数据
	@RequestMapping("/list")
	@ResponseBody
	public Object list(Users users) {
		List ki = Usersbase.find("from Users", null);
		return ki;
	}

	// 更新表里数据
	@RequestMapping("/update")
	@ResponseBody
	private String update(Users Usersbean) {
		Users uik = (Users) Usersbase.load(Users.class, Usersbean.getUserId());
		uik.setUserName(Usersbean.getUserName());
		uik.setUserPwd(Usersbean.getUserPwd());
		uik.setUserAddress(Usersbean.getUserAddress());
		uik.setUserImg(Usersbean.getUserImg());
		uik.setUserRank(Usersbean.getUserRank());
		uik.setUsertel(Usersbean.getUsertel());
		uik.setRealName(Usersbean.getRealName());
		Usersbase.update(uik);
		return "ok";
	}

	// 向表里添加数据
	@RequestMapping("/add")
	@ResponseBody
	private String add(Users Usersbean) {
		Usersbase.add(Usersbean);
		return "ok";
	}
	//登录
	@RequestMapping("/login")
	private String login(@RequestParam("userName") String userName,@RequestParam("userPwd") String userPwd,HttpSession session,HttpServletResponse response) throws UnsupportedEncodingException{
		if (userName!=null && !userName.equals("") &&
				userPwd!=null && !userPwd.equals("")) {
			List li = new ArrayList();
			//System.out.println("密碼"+userPwd+"賬號"+userName);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			li.add(userName);
			li.add(userPwd);
			List ui =Usersbase.find("select u from Users u where u.userName=? and u.userPwd=?", li.toArray());
			if(ui.size()>0){
				session.setAttribute("userName", userName);
				session.setAttribute("userId",((Users)ui.get(0)).getUserId());
				Cookie cookie =new Cookie("userName", URLEncoder.encode(userName, "UTF-8"));
				cookie.setMaxAge(24*60*60);
				response.addCookie(cookie);
				Cookie cookie1;
				cookie1=new Cookie("userPwd", URLEncoder.encode(userPwd,"UTF-8"));
				cookie1.setMaxAge(24*60*60);
				response.addCookie(cookie1);
				System.out.println("用户Id"+session.getAttribute("userId"));
				return "redirect:/taobao/index.jsp";
			}
		}
		return "";
	}
	@RequestMapping("/jiaoyan")
	@ResponseBody
	private String jiaoyan(HttpServletRequest request,HttpServletResponse response){
		Cookie[] cookies = request.getCookies();
		String us=null;
		String pw = null;
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				try {
					System.out.println("输出cookie值"+URLDecoder.decode(cookie.getValue(), "UTF-8"));
					 if(URLDecoder.decode(cookie.getName(), "UTF-8").equals("userName")){
						 us=URLDecoder.decode(cookie.getValue(), "UTF-8");
					 }
					 if(URLDecoder.decode(cookie.getName(), "UTF-8").equals("userPwd")){
						 pw=URLDecoder.decode(cookie.getValue(), "UTF-8");
					 }
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (us!=null && pw!=null) {
			return "true";
		}
		return "false";
	}
}
