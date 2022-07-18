public class Main
{
	public static void main(String[] args) {
		HashVet h = new HashVet();
		
		Aluno a = new Aluno(2110102367,"Joao", 18, 10);
		Aluno b = new Aluno(2110102368,"Raul", 18, 7);
		
		h.put(2110102367,a);
		//h.put(2110102368,b;
	    System.out.println(h.get(2110102367));

	}
}
