public class Noh {
    private int info; 
    private Noh prox;
    private Noh ant;
    //private Object n;
    
    public Noh (int info){
        this.info = info;
        this.ant  = null;
        this.prox = null;
}
    public int getInfo() {return info;}
    public Noh getProx() {return prox;}
    public void setProx(Noh n) {this.prox = n;}
    public Noh getAnt() {return ant;}
    public void setAnt(Noh n) {this.ant = n;}
    
}
