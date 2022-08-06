public class Noh{

    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    Noh(int v) {
        this.valor = v;
    }

    public int getValor() {return valor;}
    public Noh getEsq() {return esq;}
    public Noh getDir() {return dir;}
    public Noh getPai() {return pai;}
    public void setEsq(Noh n) {this.esq = esq;}
    public void setDir(Noh n) {this.dir = dir;}
    public void setPai(Noh n) {this.pai = pai;}
}
