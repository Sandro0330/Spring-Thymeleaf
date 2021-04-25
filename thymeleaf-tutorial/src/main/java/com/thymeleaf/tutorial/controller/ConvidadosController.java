package com.thymeleaf.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thymeleaf.tutorial.model.Convidado;
import com.thymeleaf.tutorial.repository.ConvidadoRepository;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidadoRepository.findAll());
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		convidadoRepository.save(convidado);
		return "redirect:/convidados";
	}
}
