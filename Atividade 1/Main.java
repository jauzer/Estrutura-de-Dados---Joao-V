import java. util. Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        //PontoCartesiano p = new PontoCartesiano(xa,xb,ya,yb);
        int xa, xb, ya, yb;
        double distancia;
        
        System.out.println("Bem Vindo a calculo da distania euclidiana!\n");
        System.out.println("Informe o primeiro a posicao de xa:");
        xa = entrada.nextInt();
        System.out.println("Informe o primeiro a posicao de xb:");
        xb = entrada.nextInt();
        System.out.println("Informe o primeiro a posicao de ya:");
        ya = entrada.nextInt();
        System.out.println("Informe o primeiro a posicao de yb:");
        yb = entrada.nextInt();
        
        distancia = Math.sqrt((Math.pow((xb-xa),2)+ Math.pow((yb-ya),2)));
        
        System.out.println("A distancia euclidiana é: " + distancia);
	}
}
