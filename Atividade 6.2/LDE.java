public class LDE implements Lista {//TAD Lista duplamente encadeada
    private Noh inicio;
    private Noh fim;
    private int tamanho = 0;
    
    private Object alunos = new Object();
    
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }
    
    public void insereInicio(Object info) { //recebe info como INT
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            tamanho++;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
            tamanho++;
        }
    }

    public void insereFim(Object info) { //recebe info como INT
        Noh novo = new Noh(info);
        if (fim == null){
            inicio = novo;
            fim = novo;
            tamanho++;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
            tamanho++;
        }
    }
    //public boolean estahVazia() { ... }
    
    /*public void procura(Noh p, int info) {
        while (p!=null && p.getInfo() != info) //busca
            p = p.getProx();
    }*/
    
    public boolean remove(Object info) {
        Noh p = inicio;
        while (p!=null && p.getInfo() != info) //busca
            p = p.getProx();
        //procura(p, info);
        if (p==null) // não achou, então não faz nada e retorna false
            return false;
        if (p == inicio) { //info estah no inicio
            inicio = p.getProx();
            if (inicio != null) {
                inicio.setAnt(null);
            } else { 
                fim = null;
            }    
            tamanho--;
        } else if (p.getProx() == null) { //info estah no fim
                p.getAnt().setProx(null);
                fim = p.getAnt();
                tamanho--;
            } else { //info estah no meio
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
                tamanho--;
            }
        return true;
    }
    
    public void tamanho() {
        System.out.print("\nTamanho da LDE é <" + tamanho + ">\n\n");
    }
    
    public void imprime() {
        String impressao = "";
        
        if(inicio == null) {
            System.out.println("A LDE esta vazia!");
        } else {
            System.out.println("Conteúdo do vetor: \n");
            impressao += inicio.toString();
            Noh Iterador = inicio.getProx();

            while(Iterador != null){
                impressao += "-->"+Iterador.toString();
                Iterador = Iterador.getProx();
                System.out.println(""+ inicio.getInfo());
            }
        }
    }
}
