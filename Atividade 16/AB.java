public class AB{

	private Noh raiz;
	private int tamanho;

	public int size() {
		return this.tamanho;
	}

	public boolean isEmpty() { //método verifica se arvore esta vazia
		return this.raiz == null;
	}

	public void imprime(){
		imprimeAux(raiz);
	}

	public void imprimeAux(Noh raiz){
		if(raiz.esq != null){
			imprimeAux(raiz.esq);
		}
		System.out.println(raiz.valor+"");
		if(raiz.dir != null){
			imprimeAux(raiz.dir);
		}
    }

	public void add(int element) {
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
        aux = aux.esq;
                } else{
                    if(aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
            
        }
	    
	}

	public boolean busca(int element) { 
		isEmpty();
		Noh atual = this.raiz; 
		while (atual.getValor() != element) { 
			if(element < atual.getValor()) atual = atual.esq;
			else atual = atual.dir; 
			if (atual == null) return false;
		}
		return true;
	}
	
	public boolean remover(int v) {
		if (this.raiz == null) return false;
	
		Noh atual = this.raiz;
		Noh pai = this.raiz;
		boolean fEsq = true;
	
		while (atual.getValor() != v) { //enquanto nao encontrou
		  pai = atual;
		  if(v < atual.getValor()) { //caminha para esquerda
			atual = atual.esq;
			fEsq = true; // confirma q é filho a esquerda
		  }
		  else { //vai para direita
			atual = atual.dir; 
			fEsq = false; //confirma que não é filho a esquerda
		  }
		  if (atual == null) return false; // é pq encontrou uma folha
		}
		if (atual.esq == null && atual.dir == null) { //nao tem filho, é folha
		  if (atual == this.raiz ) this.raiz = null; // caso for raiz
		  else if (fEsq) pai.esq = null; // caso for filho a esquerda
			   else pai.dir = null; // se for filho a direita

			   tamanho--;
		}
		else if (atual.dir == null) { //se eh pai e nao possui um filho a direita, substitui pela subarvore a direita
		   if (atual == this.raiz) this.raiz = atual.esq; //se raiz
		   else if (fEsq) pai.esq = atual.esq; //se for filho a esquerda do pai
				else pai.dir = atual.esq; //se for filho a direita do pai

			tamanho--;
		}else if (atual.esq == null) { //se eh pai e nao possui um filho a esquerda, substitui pela subarvore a esquerda
		   if (atual == this.raiz) this.raiz = atual.dir; // se raiz
		   else if (fEsq) pai.esq = atual.dir; // se for filho a esquerda do pai
				else pai.dir = atual.dir; // se for  filho a direita do pai

			tamanho--;	
		}else { // Se possui mais de um filho
			Noh sucessor = no_sucessor(atual);// Usando sucessor que seria o Nó mais a esquerda da subarvore a direita do No que deseja-se remover
			if (atual == this.raiz) this.raiz = sucessor; // se raiz
			else if(fEsq) pai.esq = sucessor; // se for filho a esquerda do pai
				else pai.dir = sucessor; // se for filho a direita do pai
			sucessor.esq = atual.esq; // acertando o ponteiro a esquerda do sucessor agora que ele assumiu  // a posição correta na arvore   
			tamanho--;
		}
		return true;
	  }

	public Noh no_sucessor(Noh apaga) { //recebe o nó que deseja apagar
		Noh paidosucessor = apaga;
		Noh sucessor = apaga;
		Noh atual = apaga.dir; //vai para a subarvore a direita
		
		while (atual != null) { //enquanto nao chegar no nó mais a esquerda
		  paidosucessor = sucessor;
		  sucessor = atual;
		  atual = atual.esq; //caminha para a esquerda
		} 
		if (sucessor != apaga.dir) { //se sucessor nao é o filho a direita do nó que devera ser eliminado
		  paidosucessor.esq = sucessor.dir; //pai herda os filhos do sucessor que sempre serao a direita
		  sucessor.dir = apaga.dir;
		}
		return sucessor;
	}
}
