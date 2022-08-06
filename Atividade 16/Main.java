public class Main
{
	public static void main(String[] args) {
		AB a = new AB();
		a.add(109);
		a.add(1);
		a.add(2);
		a.add(3);
		a.imprime();
		System.out.println(a.busca(109)+"\n\n");
		a.remover(3);
	    a.imprime();
	    
	}
}
