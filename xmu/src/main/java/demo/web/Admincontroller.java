package demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author huhu
 * 备注：对每一个实体类的操作单独创建一个contraler，名名规范  类名+controller
 *
 */
@Controller
public class Admincontroller {
	@GetMapping("/list")
	public String list(){
		return "ok";
	}
}
