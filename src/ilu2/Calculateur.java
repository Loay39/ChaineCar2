package ilu2;

public class Calculateur {

	private int calculerSomme(String input) {
		int somme = 0;
		String[] tabChaineEntiers = input.split(",");
		for (int i = 0; i < tabChaineEntiers.length; i++) {
			int entier = Integer.parseInt(tabChaineEntiers[i]);
			if (entier < 1000) {
				somme += entier;
			}

		}
		return somme;
	}

	public String ajoute(String input) {
		if (input.equals("")) {
			return "0";
		}
		int somme = calculerSomme(input);
		return Integer.toString(somme);
	}

}