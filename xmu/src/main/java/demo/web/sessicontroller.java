package demo.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sessicontroller {
	@RequestMapping("/session")
	@ResponseBody
	private Object list(HttpSession session){
		return session.getAttribute("userId");
	}
}
