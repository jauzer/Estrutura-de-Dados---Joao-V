import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //ArrayList<Aluno> listaobj = new ArrayList<Aluno> ();
        Lista l = new LSE();
        
        //adicionando 
        l.insereInicio(5);
        l.insereInicio("Joao");
        l.insereInicio("Andre");
        //l.insereFim(7);
        
        l.imprimir(); //imprime o conteudo
    }
    
}
