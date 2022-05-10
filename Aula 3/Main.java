public class Main {
  
    public static void main(String[] args) {
        
            Vetor v = new Vetor();
            
            /*adicionando alunos no vetor*/
            v.adiciona("Cirilo", 20, 7.5);
            v.adiciona("Joao Villa", 19, 8.9);
            //v.adiciona("Mario Games", 30, 5.2);
            
            /*mostra o numero total de alunos*/
            System.out.println("Numero de alunos: " + v.tamanho());

		
            
    }
    
}
