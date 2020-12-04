package com.learning.springmvcannotations.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springmvcannotations.models.DemoModel;

@Controller
public class DemoController {

	@Autowired
	DemoModel model;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/create")
	public ModelAndView createModel() {
		model = new DemoModel(101, "Kedar", "VPE", "niit.kedar@gmail.com");
		ModelAndView mv = new ModelAndView();
		// requesting view named as create.jsp
		mv.setViewName("create");
		return mv;
	}

	@RequestMapping("/view")
	public ModelAndView viewModel() {
		// System.out.println(model);
		// following line would redirect the view
		// to url pattern "/" i.e. index
		// return "redirect:/";
		ModelAndView mv = new ModelAndView();
		// passing object of the class as an attribute
		// to view named as create.jsp
		mv.addObject("modelObj", model);
		mv.setViewName("view");
		return mv;
	}

	@RequestMapping("/edit")
	public ModelAndView editModel() {
//		ModelAndView mv=new ModelAndView();
//		//passing object of the class as an attribute 
//		//to view named as create.jsp
//		mv.addObject("modelObj", model);
//		mv.setViewName("edit");
//		return mv;

		return new ModelAndView("edit", "command", model);
	}

//	@RequestMapping(path="/edit",method = RequestMethod.POST)
//	public ModelAndView editModel(@RequestParam("newuserid") int newUserId,
//			@RequestParam("newusername") String newUserName,
//			@RequestParam("newuseraddr") String newUserAddr,
//			@RequestParam("newusermail") String newUserMail)
//	
//	{
//		model.setDemoId(newUserId);
//		model.setDemoName(newUserName);
//		model.setDemoAddr(newUserAddr);
//		model.setDemoMail(newUserMail);
//		ModelAndView mv=new ModelAndView();
//		//passing object of the class as an attribute 
//		//to view named as create.jsp
//		mv.addObject("modelObj", model);
//		mv.setViewName("view");
//		return mv;
//	}

	@RequestMapping(path = "/edit", method = RequestMethod.POST)
	public ModelAndView editModel(@Valid @ModelAttribute DemoModel demoModel, 
			BindingResult result) {
		ModelAndView mv = new ModelAndView();
		if (!result.hasErrors()) {
			// System.out.println(demoModel);
			
			// passing object of the class as an attribute
			// to view named as create.jsp
			mv.addObject("modelObj", demoModel);
			mv.setViewName("view");
			
		}
		return mv;
	}
}
