package ilu2;

public class Calculateur {

	private static final int MAX_NUMBER_SIZE = 1000;

	private int calculerSomme(String input) {
		int somme = 0;
		String[] tabChaineEntiers = input.split(",");
		for (int i = 0; i < tabChaineEntiers.length; i++) {
			if (tabChaineEntiers[i].equals("")) {
				return -1;
			}
			int entier = Integer.parseInt(tabChaineEntiers[i]);
			if (entier < 0) {
				return -1;
			}
			if (entier < MAX_NUMBER_SIZE) {
				somme += entier;
			}
		}
		return somme;
	}

	public String ajoute(String input) {
		String newInput = input.replace(" ", "");
		if (newInput.equals("")) {
			return "0";
		}
		int somme = calculerSomme(newInput);
		if (somme < 0) {
			return "erreur";
		}
		return Integer.toString(somme);
	}

}