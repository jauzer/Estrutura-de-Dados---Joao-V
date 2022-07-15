public class Main
{
	public static void main(String[] args) {
		IPilha p = new PilhaLista();
		
		Aluno a = new Aluno("Mario", 20, 5);
		Aluno b = new Aluno("Paulo", 22, 6);
		Aluno c = new Aluno("Cirilo", 18, 7);
		Aluno d = new Aluno("Fernando", 19, 2);
		Aluno e = new Aluno("Maria Joaquina", 18, 7);
		
		//p.push(a);
		//p.push("arara");
		
		System.out.println(p.ehPalindromo("arara"));
		System.out.println(p.ehPalindromo("subinoonibus"));
		System.out.println(p.ehPalindromo("10101"));
		System.out.println(p.ehPalindromo("202"));
		System.out.println(p.ehPalindromo("arar"));
		System.out.println(p.ehPalindromo("100"));
	}
}
