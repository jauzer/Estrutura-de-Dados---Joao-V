public class Main
{
	public static void main(String[] args) {
		FilaVet f = new FilaVet(5); //tamanho maximo da fila é 5 posicoes
		
		f.add("Joao");
		f.add("Rafael");
		f.add("Cirilo");
		f.add("Amanda");
		f.add("Maria");
		
		f.mostraFila();
		f.remove();
		System.out.println("\n");
		f.mostraFila();
		
	}
}
