import java.util.ArrayList;

public class LSE implements Lista{
    private Noh inicio;
    
    ArrayList<Object> listaobj = new ArrayList<Object> ();
    
    public LSE(){
        this.inicio = null;
    }
    
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if(inicio == null) { //se o inicio for vazio
            inicio = novo;
        }else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }
    
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }else {
            Noh ultimo = null;
            for(int i = inicio; i != null; i=i.getProx())
            ultimo = i;
            ultimo.setProx(novo);
        }
    }
    
    /*public boolean estahVazia() {}*/
    
    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while (p!=null && p.getInfo() != info){ //busca
            ant = p;
            p = p.getProx();
        }
        if (p==null) // não achou, então não faz nada e retorna false
            return false;
        if (ant==null) {//retira info do início
            inicio = p.getProx();
        }else {
            ant.setProx(p.getProx());
        }
            return true;
    }
    
    /*public int tamanho() {}*/

    public boolean estahVazia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int tamanho() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void imprimir() {
        System.out.println("Conteúdo da lista: \n");
        System.out.println(listaobj.size());
        /*for(int i = 0; i < listaobj.size(); i++) {
            System.out.println(listaobj.size());
        }*/
    }
    
}
