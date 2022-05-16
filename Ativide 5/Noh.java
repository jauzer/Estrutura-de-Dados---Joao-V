public class Noh {
    private Object info; 
    private Object prox;
    private Object n;
    
    public Noh (Object info){
        this.info = info;
        this.prox = null;
}
    public Object getInfo() {return info;}
    public Object getProx() {return prox;}
    public Object setProx(Object n) {this.prox = n;return null;}
    
}
