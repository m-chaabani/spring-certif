package com.mc.gestionformation.controller;

import com.mc.gestionformation.model.Formateur;
import com.mc.gestionformation.service.FormateurService;
import com.mc.gestionformation.service.IFormateurService;

public class FormateurController {

	private Formateur formateur;
	private IFormateurService formateurService ;
	
	

	public FormateurController(IFormateurService formateurService) {
		super();
		this.formateurService = formateurService;
	}

	public void BoutonEnregister() {
		System.out.println("  IN CONTROLLER ...");
		System.out.println(" Validation des donn�es au niveau controller effectu� ");
		
		formateur = formateurService.enregistrer(formateur);
		System.out.println(" Formateur enregistr� avec success : " + formateur);
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}


}
