public class Noh {
    private Object info; 
    private Noh prox;
    private Noh ant;
    //private Object n;
    
    public Noh (Object info){
        this.info = info;
        this.ant  = null;
        this.prox = null;
}
    public Object getInfo() {return info;}
    public Noh getProx() {return prox;}
    public void setProx(Noh n) {this.prox = n;}
    public Noh getAnt() {return ant;}
    public void setAnt(Noh n) {this.ant = n;}
    
}
