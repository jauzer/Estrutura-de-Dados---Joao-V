public class Main {
  
    public static void main(String[] args) {
        
            Vetor v = new Vetor();
            
            /*adicionando alunos no vetor - alunos[5]*/
            v.adiciona("Cirilo", 20, 7.5);
            v.adiciona("Joao Villa", 19, 8.9);
            v.adiciona("Mario Games", 30, 5.2);
            v.adiciona("Alex", 25, 5.2);
            v.adiciona("Marcio", 18, 5.2);
            /*adicionando outros 2 testando se o vetor duplica*/
            v.adiciona("Guilherme", 22, 5.2);
            v.adiciona("Andre", 22, 5.2);
            
            /*removendo alunos do vetor*/
            //v.remove("Alex");
            //v.remove("Cirilo");
            
            /*mostra o numero total de alunos*/
            System.out.println("Numero de alunos: " + v.tamanho());    
    }
    
}
