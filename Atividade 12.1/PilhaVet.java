public class PilhaVet implements IPilha {
    private Object[] pilha;
    private static int numElem;
    private int tamanhoVetor;
    
    public PilhaVet (int tamanhoVetor){
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }    
        
    public boolean push(Object info){
        if (this.numElem == pilha.length){
            System.out.println("A pilha esta cheia!");
            return false;
        }else {
            this.pilha[this.numElem] = info;
            this.numElem++;
        }
            return true;
    }
        
    public Object pop(){
        Object o = null;
        if(numElem == 0){
            System.out.println("A pilha esta vazia");
            return null;
        } else {
            o = this.pilha[numElem - 1];
            this.pilha[numElem - 1] = null;
            this.numElem--;
        }    
            return o;
    }
    
    public void imprime(){
        for(int i=0; i<pilha.length; i++){
            System.out.print(pilha[i]);
        }
    }
    public boolean ehPalindromo(String info) {
        String palavra = info;
        String aux = new StringBuffer(palavra).reverse().toString();

        if(palavra.equals(aux)) {
            return true;
        }else {
            return false;
        }
    }
}
