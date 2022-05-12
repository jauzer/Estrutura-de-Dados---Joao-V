public class Main {
  
    public static void main(String[] args) {
        
            Ivetor v = new Vetor();
            
            /*adicionando qualquer coisa no vetor*/
            v.adiciona("Texto teste");
            v.adiciona(30);
            v.adiciona(3.3);
            v.adiciona("Texto teste teste");
            //Aluno a = new Aluno("Joao Villa", 19, 10);
            //v.adiciona(a);
            
            /*removendo obj do vetor*/
            //v.remove(30);
            //v.remove("Texto teste");
            
            /*mostra o numero total de objetos no vetor*/
            System.out.println("Numero de obj no vetor: " + v.tamanho() + "\n");
            
            v.imprimirVetor(); 
    }
    
}
