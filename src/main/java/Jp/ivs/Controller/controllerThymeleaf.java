package Jp.ivs.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerThymeleaf {
	@GetMapping("/index")
	public ResponseEntity<String> test()
	{
		return ResponseEntity.ok("Thông Báo");
	}
	private String chuoi= "Xin Chao Thế Giới";
	@RequestMapping("/text")
	public String test1(ModelMap modelmap)
	{
		modelmap.addAttribute("msg", chuoi);
		return "NguoiList";		
	}
	
	@RequestMapping("/nguoi")
	public String nguoi()
	{
		return "nguoi";
	}
}
