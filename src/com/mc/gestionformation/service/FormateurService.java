package com.mc.gestionformation.service;

import com.mc.gestionformation.business.FormateurBusiness;
import com.mc.gestionformation.model.Formateur;

/// la couche service sert pour le controle et la validation des DTO et l'application d'aspects techniques
// pattern fa�ade 
public class FormateurService implements IFormateurService {

	IFormateurService formateurBusiness;  // = new FormateurBusiness(); pour diminuer le couplage on �liminie l'instanciation 
	
	
	public FormateurService(IFormateurService formateurBusiness) {
		super();
		this.formateurBusiness = formateurBusiness;
	}

	@Override
	public Formateur enregistrer(Formateur formateur) {
		System.out.println("  IN SERIVICE ...");
		// ajout de l'aspet transaction
		cache();
		// ajout de l'aspet transaction
		ouvrirTransaction();
		// ajout de l'aspet securit�
		if (estAutorise()) {
			formateur = formateurBusiness.enregistrer(formateur);
		}
		fermerTransaction();
		return formateur;
	}

	private void cache() {
		System.out.println(" caching  ...");
		
	}

	private boolean estAutorise() {
		System.out.println(" v�rification des autorisations ...");
		System.out.println(" Utilisateur autoris� ...");

		return true;
	}

	private void ouvrirTransaction() {
		System.out.println(" Transaction Ouverte ...");
	}

	private void fermerTransaction() {
		System.out.println(" Transaction ferm�e ...");

	}

}
