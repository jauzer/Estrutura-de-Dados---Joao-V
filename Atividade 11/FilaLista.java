public class FilaLista implements IFila {
    private Noh inicio;
    private Noh fim;
    private int tamanho = 0;
    
    public FilaLista (){
        this.inicio = null;
        this.fim = null;
    }
    
    public boolean isEmpty() {
        if(inicio == null) {
            return true;
        }
            return false;
    }
    
    public boolean add(Object info){
        Noh novo = new Noh(info);
        
        if (this.isEmpty()){
            inicio = novo;
            fim = novo; //adicionei essa linha
        }else{
            fim.setProx(novo);
            fim = novo;
        }
        return true;
    }
    
    public boolean remove(Object info){ 
        if (!isEmpty()){
            if (inicio == fim) {
                inicio = null;
                fim = null;
            }else{
                inicio = inicio.getProx();
                return true;
            }        
        }
            return false;
    }
    
    public void imprime() {
        Noh p = this.inicio;
        while(p != null){
            System.out.println(p.getInfo());
            p = p.getProx();
        }
    }
    
    public void size() {
        Noh aux = this.inicio;
        while(aux != null) {
            tamanho++;
            aux = aux.getProx();
        }
        System.out.println(tamanho);
    }
    
}
