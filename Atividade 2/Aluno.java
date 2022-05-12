public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    
Aluno(String nome, int idade, double nota) {
    this.nome = nome;
    this.idade = idade;
    this.nota = nota;
}    
    
public void setNome(String nome) {this.nome = nome;}

public void setIdade(int Idade) {this.idade = idade;}
    
public void setNota(double nota) {this.nota = nota;}
    
public String getNome() {return nome;}
    
public int getIdade() {return idade;}
    
public double getNota() {return nota;}
  
public void tamanho() {}
    
public void contem() {}
/*
@Override
public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Nota: " + this.nota; }*/
    
}
