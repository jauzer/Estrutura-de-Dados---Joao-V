public class Vetor implements Ivetor {
    public String nome;
    public int idade;
    public double nota;
    
    /*inicializa um vetor de obje*/
    Aluno[] alunos = new Aluno[5];
    int[] vetorInt = new int[100];
    private int totalAlunos = 0;
    
    public void adiciona(String nome, int idade, double nota) {
        this.garanteEspaco();
        if(!this.cheio()) {
        alunos[this.totalAlunos] = new Aluno(nome, idade, nota);
        this.totalAlunos++;
        }else {
            System.out.println("O vetor está cheio!");
        }
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
    
    public boolean contem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean cheio() {
        if(totalAlunos == this.alunos.length) {
            return true;
        }
            return false;
    }
        
    private void garanteEspaco() {
        if(this.cheio()) {
            Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++)
                novoAlunos[i] = this.alunos[i]; //passa o conteudo do vetor antigo para o novo vetor
            this.alunos = novoAlunos;
        }
    }
    
    public boolean remove(String nome) {
        int indice = -1;
        for(int i = 0; i < this.totalAlunos; i++) //percorre o vetor e faz a busca
            if(nome == alunos[i].getNome()) {
                indice = i; break;
            }
                if(indice != -1) { //se o indice nao for igual a -1, quer dizer que encontrou
                    for(int i = indice; i < (this.alunos.length-1); i++)
                        vetorInt[i] = vetorInt[i+1];
                        totalAlunos--;
                        return true;
                }
                        return true;
    }
    //this.nome != this.alunos[i].getNome()
    //nome.equals(this.alunos[i].getNome())
}
