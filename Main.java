public class Main
{
	public static void main(String[] args) {
		IPilha p = new PilhaVet(5);
		
		System.out.println("\nArara é Palindromo?");
		System.out.print(p.ehPalindromo("arara"));
	
		System.out.println("\n\nsubinoonibus é Palindromo?");
		System.out.print(p.ehPalindromo("subinoonibus"));
		
		System.out.println("\n\n10101 é Palindromo?");
		System.out.print(p.ehPalindromo("10101"));
		
		System.out.println("\n\n2020 é Palindromo?");
		System.out.print(p.ehPalindromo("2020"));
		
	}
}
