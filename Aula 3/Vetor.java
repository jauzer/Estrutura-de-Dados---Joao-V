public class Vetor {
    public String nome;
    public int idade;
    public double nota;
    
    /*inicializa um vetor de obje*/
    Aluno[] alunos = new Aluno[10];
    private int totalAlunos = 0;
    
    public void adiciona(String nome, int idade, double nota) {
        alunos[this.totalAlunos] = new Aluno(nome, idade, nota);
        this.totalAlunos++;
    }
    
    public int tamanho() {
        return this.totalAlunos;
    }
    
    public boolean contem(String nome) {
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getNome().equals(nome)) {
                System.out.println("True");
                return true;
                
            }
        }
                return false;
                
    }
        
    //this.nome != this.alunos[i].getNome()
    //nome.equals(this.alunos[i].getNome())
    
}
