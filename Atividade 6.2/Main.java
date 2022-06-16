public class Main
{
	public static void main(String[] args) {
		Lista l = new LDE();
		
		Aluno a = new Aluno("Cirilo", 20, 7.5);
		Aluno b = new Aluno("Cirilo", 20, 7.5);
		
		l.insereInicio(a);
		l.insereInicio(b);
		l.insereInicio(5);
		l.insereInicio(6);
		l.insereInicio(7);
		l.insereFim(9);
		l.insereFim(10);
		
		//l.remove(5);
		//l.remove(7);
		l.tamanho(); //imprimindo tamanho
		l.imprime(); //imprimindo conteudo primeiro conteudo da lista pq nao consegui imprimir tudo
	}
}
