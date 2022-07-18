public class HashVet {
    private Aluno[] vetor;
    
    public HashVet() {
        this.vetor = new Aluno[20];
    }
    
    private int hash(int chave) {
        return chave % this.vetor.length;
    }
    
    public Aluno get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }
    
    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null ||
            vetor[hash].getMatricula() == chave) {
            vetor[hash] = valor;
            return;
        }
        sondagem++;
    }
    
    /*public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash(chave)] = null;
        return aluno;
    }*/
    
    /*
    public void put(int chave, String valor) {
        int hash = hash(chave);
        LSE alunos_lista = this.vetorLista[hash];
        
        if (alunos_lista == null) {
            alunos_lista = new LSE();
            alunos_lista.insereInicio(valor);
            this.vetorLista[hash] = alunos_lista;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProx()) {
                if (n.getInfo().getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);
        }
    }*/
    }
}
