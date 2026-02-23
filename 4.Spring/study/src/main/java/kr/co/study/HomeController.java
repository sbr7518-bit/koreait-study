package kr.co.study;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Handler 라고도 불림.
public class HomeController {

	@RequestMapping("/")
	public String goHome(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("message", "<strong>안녕하세요</strong>");
		
	 //- 3만큼을 가진 배열을 items 라는 변수를 대입한 것.
		List<String> items = Arrays.asList("items1", "items2", "items3");
		model.addAttribute("items",items);
		
		return "index";
	}
}


