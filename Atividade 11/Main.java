public class Main
{
	public static void main(String[] args) {
		FilaLista l = new FilaLista();
		
		l.add(10);
		l.add("Joao");
		l.add("Cirilo");
		l.add("Maria");
		l.add("Guilherme");
		
		l.imprime();
		System.out.print("\nTamanho da Lista: ");
		l.size();
		
	}
}
