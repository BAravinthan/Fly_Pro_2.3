package com.FlyPro_2_3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlyPro_2_3.Entity.Entityclass;
import com.FlyPro_2_3.Service.Serviceinterface;

@Controller
public class Controllerclass {
@Autowired
private Serviceinterface serviceinterface;

@RequestMapping("Registration")
public String tStep()
{
	return "Registration";
}

@RequestMapping("Regconnection")
public String fStep(Entityclass entityclass)
{
	serviceinterface.sStep(entityclass);
	return "Registration";
}

@GetMapping("pl_redirect")
public String displayAllPassengerList(Model model)
{
	List<Entityclass> listentityclass=serviceinterface.getall();
	model.addAttribute("first_redirect",listentityclass);
	return  "DisplayAllPassengerList";
}
@GetMapping("basedid")
public String basedOnId(@RequestParam("p_id") long p_id,Model model)
{
	Entityclass entityclass =serviceinterface.getid(p_id);
	model.addAttribute("first",entityclass);
	return "displaybasedonid";
}



@RequestMapping("delid")
public String deteleuser(@RequestParam("p_id") long p_id,Model model)
{
	boolean del=serviceinterface.userid(p_id);
	if(del)
	{
		model.addAttribute("message","Id ="+p_id+" deleted successfully");
	}
	else
	{
		model.addAttribute("message","Id ="+p_id+" is not found");

	}
	return "display";
}

@PostMapping("updateone")
public String updateall(@RequestParam long p_id, @RequestParam String p_email_id,@RequestParam String p_password,@RequestParam String p_c_password,Model model)
{
boolean upd=serviceinterface.userupd(p_id,p_email_id,p_password,p_c_password);
{
	if(upd)
	{
		model.addAttribute("up","Id ="+p_id+" has been updated successfully");
	}
	else
	{
		model.addAttribute("up","Id ="+p_id+" not available");
	}
	return "updatedisplay";
}
}

}