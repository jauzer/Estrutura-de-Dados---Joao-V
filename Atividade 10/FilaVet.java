public class FilaVet implements IFila { //tem funcionamento circular
    private int nElemFila;
    private int inicio;
    private Object[] vetFila; //tamanho maximo do vetor tem que ser de 5
    
    public FilaVet (int tamFila){ //construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }
    
    public boolean add(Object info){ //método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("A fila está cheia");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        
        return true;
        }
    
    public boolean isEmpty() {
        if(inicio == 0 && nElemFila == 0) {
            return true;
        }
            return false;
    }
    
    public boolean remove() { //método que retira da fila
        if (this.isEmpty()){ 
            System.out.println("Fila estah vazia");
            return false;
        }
        
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
        }
     
    public void mostraFila() { //imprime o vetFila
        for(int i=0; i<this.nElemFila; i++){
            System.out.println("["+i+"]"+vetFila[i]);
        }
    }   
}
