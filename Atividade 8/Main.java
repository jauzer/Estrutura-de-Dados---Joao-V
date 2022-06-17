import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		TADVetor v = new TADVetor();
		
        v.adiciona(1000);
        
        v.mostraMaior();
        
        long tempoInicial = System.currentTimeMillis();
        v.ordena(); //ordena o vetor
        System.out.println("O método foi executado em " + (System.currentTimeMillis() - tempoInicial));
        
        //v.imprime(); //no momento coloquei pra imprimir os 10 primeiros
        v.tamanho();
        //v.contem(10);
	}
}
