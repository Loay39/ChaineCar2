package ilu2;

public class Calculateur {
	public String ajoute(String input) {
		int somme = 0;
		if (input.equals("")) {
			return "0";
		}
		String[] tabChaineEntiers = input.split(",");
		for (int i = 0; i < tabChaineEntiers.length; i++) {
			somme += Integer.parseInt(tabChaineEntiers[i]);
		}
		return Integer.toString(somme);
	}
}