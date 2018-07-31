package servlet.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import servlet.service.testService;

@Controller
public class sevController {

	@Resource(name = "testService")
	private testService testService;

	@RequestMapping(value = "/mainTest.do")
	public String mainTest(ModelMap model) throws Exception {
		System.out.println("sevController.java - mainTest()");

		String str = testService.addStringTest("START! ");
		model.addAttribute("resultStr", str);

		return "test/hello";
	}

}