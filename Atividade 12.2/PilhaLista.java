public class PilhaLista implements IPilha {
    private Noh topo;
    
    public PilhaLista (){
        this.topo = null;
    }
     
    public boolean push(Object info){ //empilha
        Noh novo = new Noh(info);
        
        if (topo == null) {
            topo = novo;
        }else {
            novo.setProx(topo);
            topo = novo;
        }
        return true;
    }
    
    public Object pop(){ //desempilha
        Object info = null;
        
        if (topo != null) {
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
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
