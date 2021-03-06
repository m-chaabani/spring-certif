package com.mc.gestionformation.view;

import com.mc.gestionformation.business.FormateurBusiness;
import com.mc.gestionformation.controller.FormateurController;
import com.mc.gestionformation.model.Formateur;
import com.mc.gestionformation.service.FormateurService;
import com.mc.gestionformation.service.IFormateurService;

public class FormateurView {
	
	public static void main(String[] args) {
		System.out.println("  IN VIEW ...");
		IFormateurService formateurRealBusiness = new FormateurBusiness();
		IFormateurService formateurBusinessPROXY = new FormateurService(formateurRealBusiness);

		FormateurController controller = new FormateurController(formateurBusinessPROXY);
		Formateur formateur = new Formateur();
		formateur.setNom("Noureddine");
		formateur.setPrenom("BOUBEKEUR");
		controller.setFormateur(formateur);
		controller.BoutonEnregister();

	}

}
