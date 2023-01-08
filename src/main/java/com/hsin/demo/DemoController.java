package com.hsin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	@RequestMapping(value = {"/index.jsp", "/index", "/"}, method = RequestMethod.GET)
	public String homepage (Model model) {
		return "index";
	}
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard (Model model) {
		return "dashboard";//當請求是/dashboard就轉到WEB-INF/view/dashboard
	}
	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank(Model model) {
		return "blank";
	}
	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons(Model model) {
		return "buttons";
	}
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards(Model model) {
		return "cards";
	}
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts(Model model) {
		return "charts";
	}
	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotPassword(Model model) {
		return "forgot-password";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		return "register";
	}
	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		return "tables";
	}
	@RequestMapping(value = "/utilities-animation", method = RequestMethod.GET)
	public String utilitiesAnimation(Model model) {
		return "utilities-animation";
	}
	@RequestMapping(value = "/utilities-border", method = RequestMethod.GET)
	public String utilitiesBorder(Model model) {
		return "utilities-border";
	}
	@RequestMapping(value = "/utilities-color", method = RequestMethod.GET)
	public String utilitiesColor(Model model) {
		return "utilities-color";
	}
	@RequestMapping(value = "/utilities-other", method = RequestMethod.GET)
	public String utilitiesOther() {//在目前的使用上，不寫model這項看起來完全沒影響。
		return "utilities-other";
	}
	@RequestMapping(value = "/404", method = RequestMethod.GET)//errorController可能會自己寫一個類別?
	public String ErrorPage() {//在目前的使用上，不寫model這項看起來完全沒影響。
		return "404";
	}
}
