package com.yeah.texas.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.yeah.texas.Texas;
import com.yeah.texas.service.TexasService;

@Controller
@RequestMapping("/texas")
public class TexasController {

	@Autowired
	TexasService texasService;
	
	//增加玩家
	@RequestMapping("/add")
	public String addUser(Texas texas){
		
		int counter=Integer.parseInt(texas.getLeftCounter());
		int dSs=Integer.parseInt(texas.getdS())*400;
		texas.setpAndL(Integer.toString(counter-dSs));
		texasService.addUser(texas);
				
		return "redirect:/manager/texas/show";
	}
	
	//展示玩家
//	@RequestMapping("/show")
	@RequestMapping(value="/show",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView showAllUsers(ModelAndView modelAndView){
		
		List<Texas> listTexas=texasService.showAllUser();
		modelAndView.addObject("listTexas", listTexas);
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	//删除玩家
	@RequestMapping("/dele")
	public String deleUser(int id){
		
		texasService.deleUser(id);
		
		return "redirect:/manager/texas/show";
	}
	
	//修改玩家
	@RequestMapping("/updateUser")
	public String updateUser(Texas texas){
		
		texasService.updateUser(texas);
		
		return "redirect:/manager/texas/show";
	}
}
