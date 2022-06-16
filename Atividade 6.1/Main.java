public class Main
{
	public static void main(String[] args) {
		Lista l = new LDE();
		
		l.insereInicio(5);
		l.insereInicio(6);
		l.insereInicio(7);
		l.insereFim(9);
		l.insereFim(10);
		
		//l.remove(5);
		//l.remove(7);
		
		l.tamanho();
	}
}
