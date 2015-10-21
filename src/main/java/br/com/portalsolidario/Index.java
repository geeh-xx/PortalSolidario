package br.com.portalsolidario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Index {

	@PostConstruct
	public void init() {
		System.out.println("Bean executado!");
	}

	public String getMessage() {
		return "Bem Vindo!";
	}

	 public String login(){
         return "/public/login.xhtml";
  }
	
	public String register() {
		return "/public/register.xhtml";
	}
	
	public String index(){
		return "/public/index.xhtml";
	}
	
}
