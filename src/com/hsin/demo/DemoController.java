package com.hsin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller

//@RequestMapping("/WEB-INF/views/demo")
public class DemoController {
	@RequestMapping(value = {"/index.jsp", "/index", "/"}, method = RequestMethod.GET)
	public String homepage (Model model) {
		return "demo/index";
	}
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard (Model model) {
		return "demo/dashboard";//當請求是/dashboard就轉到WEB-INF/view/demo/dashboar
	}
	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank(Model model) {
		return "demo/blank";
	}
	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons(Model model) {
		return "demo/buttons";
	}
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards(Model model) {
		return "demo/cards";
	}
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts(Model model) {
		return "demo/charts";
	}
	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotPassword(Model model) {
		return "demo/forgot-password";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "demo/login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		return "demo/register";
	}
	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		return "demo/tables";
	}
	@RequestMapping(value = "/utilities-animation", method = RequestMethod.GET)
	public String utilitiesAnimation(Model model) {
		return "demo/utilities-animation";
	}
	@RequestMapping(value = "/utilities-border", method = RequestMethod.GET)
	public String utilitiesBorder(Model model) {
		return "demo/utilities-border";
	}
	@RequestMapping(value = "/utilities-color", method = RequestMethod.GET)
	public String utilitiesColor(Model model) {
		return "demo/utilities-color";
	}
	@RequestMapping(value = "/utilities-other", method = RequestMethod.GET)
	public String utilitiesOther() {//在目前的使用上，不寫model這項看起來完全沒影響。
		return "demo/utilities-other";
	}
	@RequestMapping(value = "/404", method = RequestMethod.GET)//errorController可能會自己寫一個類別?
	public String ErrorPage() {//在目前的使用上，不寫model這項看起來完全沒影響。
		return "demo/404";
	}
}
