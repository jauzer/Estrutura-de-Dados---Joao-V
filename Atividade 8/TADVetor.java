import java.util.Random;

public class TADVetor {
    private static int[] vet = new int[1000];
    private int info;
    private static int tam = 1000;
    int i;
    private int tamanho = 0;
    //private static int tamanho = 0;
    
    /*public void adiciona(int info) {
        this.vet[this.tamanho] = info;
        this.tamanho++;
    }*/
    
    public void adiciona(int info) {
        Random r = new Random();
        for(i = 0; i < tam; i++) {
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
        for(int i = 1; i < tam; i++){
            if(vet[i] > max){
                max = vet[i];
            }
        }
        return max;
    }
    
    public static void ordena() {
        for (int i = 0; i < vet.length; i++){
            for (int j = 0; j < (vet.length - 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }    
            }    
        }
    } 
    
    public void mostraMaior() {
        int maior = encontraMaior(vet);
        System.out.println("O maior valor é: " + maior);
    }
    
    public void imprime() {
        for(int i = 0;i < tam; i++) {
            System.out.println("" + vet[i]);
        }
    }
}
