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

	public boolean busca(int element) { //método que busca por chassi
		isEmpty();
		Noh atual = this.raiz;  //começa a procurar desde raiz
		while (atual.getValor() != element) { //enquanto nao encontrou
			if(element < atual.getValor()) atual = atual.esq; //caminha para esquerda
			else atual = atual.dir; //caminha para direita
			if (atual == null) return false; //encontrou uma folha -> sai
		}
		return true; //terminou o laço while e chegou aqui é pq encontrou item	
	}
}
