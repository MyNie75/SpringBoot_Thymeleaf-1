package Jp.ivs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Jp.ivs.DepartsMapper.IDepartsMapper;
import Jp.ivs.model.Departs;

@Controller

public class DepartsController {
	@Autowired
	private IDepartsMapper departsmapper;
	@RequestMapping("/departs")
	public String getall(ModelMap model)
	{
		List<Departs> departs = departsmapper.findAll();
		model.addAttribute("listdepart", departs);
		
		return "NguoiList";
	}
}
