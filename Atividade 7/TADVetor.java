import java.util.Random;

public class TADVetor {
    private static int[] vet = new int[1000];
    private int info;
    int i;
    private int tamanho = 0;
    //private static int tamanho = 0;
    
    /*public void adiciona(int info) {
        this.vet[this.tamanho] = info;
        this.tamanho++;
    }*/
    
    public void adiciona(int info) {
        Random r = new Random();
        for(i = 0; i < 1000; i++) {
            this.vet[i] = r.nextInt(info);
            this.tamanho++;   
        }
    }
    
    public void tamanho() {
        System.out.println(""+this.tamanho);
    }
    
    public boolean contem(int info) {
        for(int i = 0; i < this.tamanho; i++) {
            if(info != this.vet[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static int encontraMaior(int[] vet) {
        int max = vet[0];
        for(int i = 1; i < 1000; i++){
            if(vet[i] > max){
                max = vet[i];
            }
        }
        return max;
    }
    
    public void mostraMaior() {
        int maior = encontraMaior(vet);
        System.out.println("O maior valor é: " + maior);
    }
    
    public void imprime() {
        for(int i = 0;i < 10; i++) {
            System.out.println("" + vet[i]);
        }
    }
}
