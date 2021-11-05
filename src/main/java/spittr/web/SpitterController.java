package spittr.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spittr.data.SpitterRepository;
import spittr.domain.Spitter;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	
	private SpitterRepository spitterRepository;
	
	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		
		this.spitterRepository=spitterRepository;
	} 
	
	public SpitterController() {
		
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		
		model.addAttribute(new Spitter());//key value of model  will be spitter
		
		return "registerForm";
	}
	
	@PostMapping("/register")
	public String processRegistration(@Valid Spitter spitter, //Validate Spitter input
									  Errors errors) {
		
		if(errors.hasErrors()) {  //Return to form on validation errors
			
		    return "registerForm";
		}
		
		spitterRepository.save(spitter);
		
		return "redirect:/spitter/" + spitter.getUserName();
		
	}
	
	@GetMapping("{username}")
	public String showSpitterProfile (@PathVariable String username, Model model) {
		
		Spitter spitter = spitterRepository.finfByUsername(username);
		
		model.addAttribute(spitter);
		
		return "profile";
		
		
	}

}
