package demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author huhu
 * ��ע����ÿһ��ʵ����Ĳ�����������һ��contraler�������淶  ����+controller
 *
 */
@Controller
public class Admincontroller {
	@GetMapping("/list")
	public String list(){
		return "ok";
	}
}
