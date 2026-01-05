package project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import project.dao.WorkDao;
import project.model.Works;

@Controller
public class MainController {

	@Autowired
	public WorkDao workDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Works> works=workDao.getWorks();
		m.addAttribute("works", works);
		System.out.println("Fetched: " + works);

		return "index";
	}
	
	//SHOW ADD FORM DATA
	@RequestMapping("/add-work")
	public String addWork(Model m) {
		m.addAttribute("title","Add Work");
		return "add_work_form";
	}
	
	//HANDLE ADD WORK FORM
	@RequestMapping(value="/handleWorks" , method= RequestMethod.POST)
	public RedirectView handleWork(@ModelAttribute Works works, HttpServletRequest request ) {
		System.out.println(works);
		workDao.createWork(works);
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//HANDLE TO DELETE WORK
	@RequestMapping("/delete/{id}")
	public RedirectView deleteWork(@PathVariable("id") int id,HttpServletRequest request) {
		this.workDao.deleteWork(id);
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//HANDLE TO UPDATE
	@RequestMapping("/update/{id}")
	public String updateWork(@PathVariable("id") int id, Model m){
		Works work=this.workDao.getWork(id);
		m.addAttribute("work", work);
		return "update_form";
	}
}
