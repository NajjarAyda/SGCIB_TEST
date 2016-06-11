
/**
 * affiche les nombres de 1 à 100. Un nombre par ligne. Respectez les règles
 * suivantes : -Si le nombre est divisible par 3 ou contient 3, écrire "Foo" à
 * la place de 3. -Si le nombre est divisible par 5 ou contient 5, écrire "Bar"
 * à la place de 5. -Si le nombre est divisible par 7 ou contient 7, écrire
 * "Qix" à la place de 7.
 * 
 * @author Najjar Ayda
 */
public class FooBarQix {

	public static void main(String[] args) {

		// variable qui contient notre résultat pour chaque nombre
		String msg = "";
		// une constante qui contient la régle du nombre 3
		final String TextFor3 = "Foo";
		// une constante qui contient la régle du nombre 5
		final String TextFor5 = "Bar";
		// une constante qui contient la régle du nombre 7
		final String TextFor7 = "Qix";
		// Variable qui va contenir la transformation de l'entier en String
		String intString = "";

		// Parcourir les nombres de 1 à 100
		for (int i = 1; i <= 100; i++) {
			// si notre valeur est divisible par 3 on concatine notre msg par
			// Foo
			if (i % 3 == 0) {
				msg += TextFor3;
			}
			// si notre valeur est divisible par 5 on concatine notre msg par
			// Bar
			if (i % 5 == 0) {
				msg += TextFor5;
			}
			// si notre valeur est divisible par 7 on concatine notre msg par
			// Qix
			if (i % 7 == 0) {
				msg += TextFor7;
			}

			// Transformation de l'entier en un string
			intString = i + "";

			// parcourir tout les chiffres de notre nombre
			for (int j = 0; j < intString.length(); j++) {

				// si notre chiffre égale à 3 on concatine la chaine avec Foo
				if (intString.charAt(j) == '3') {
					msg += TextFor3;
				}
				// si notre chiffre égale à 5 on concatine la chaine avec Bar
				else if (intString.charAt(j) == '5') {
					msg += TextFor5;
				}
				// si notre chiffre égale à 7 on concatine la chaine avec Qix
				else if (intString.charAt(j) == '7') {
					msg += TextFor7;
				}
			}
			
			// Si notre msg est vide on affiche notre nombre
			if (msg.equals("")) {
				System.out.println(i);
			}
			// sinon on affiche notre msg
			else {
				System.out.println(msg);
			}
			
			// on re-initialise notre variable à vide
			msg = "";
		}

	}

}
