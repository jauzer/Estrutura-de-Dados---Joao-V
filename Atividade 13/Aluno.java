public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private double nota;
    
    Aluno(int matricula, String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.matricula = matricula;
    }    
    
    public void setNome(String nome) {this.nome = nome;}
    
    public void setIdade(int Idade) {this.idade = idade;}
        
    public void setNota(double nota) {this.nota = nota;}
        
    public String getNome() {return nome;}
        
    public int getIdade() {return idade;}
        
    public double getNota() {return nota;}
    
    public int getMatricula() {return matricula;}

}
