package Queue;

import Node.Node;

public class Queue {
    private Node front;
    private  Node rear;
    private int size;

    public Queue(){
        front = null;
        rear = null;
        size = 0; //O tamanho se inicializa com 0
    }

    /*
        O metodo isEmpty vai verificar se o tamanho é vazio, ou seja, se não tem nenhum valor dentro, retornando true
        se tiver algum valor, retorna false
     */
    public boolean isEmpty(){
        return (size == 0);
    }

    /*
        O metodo getSize retorna o tamanho atual da fila
     */
    public int getSize(){
        return size;
    }
    /*
     O metodo insere um novo elemento na fila. Ele cria um novo nó com valor especificado e insere na fila.
      Se a fila estiver vazia, tanto front quanto rear serão atualizados para o novo nó. Caso contrário,
      o nó será adicionado após o nó traseiro atual e o ponteiro rear será atualizado para o novo nó.
      Além disso, o tamanho da fila é incrementado e uma mensagem é exibida para indicar que o elemento
      foi adicionado com sucesso.
     */
    public void adiciona(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Elemento ->" + data + " adicionado na fila");
    }

    /*
    O método remove() remove o elemento da frente da fila.
     Ele verifica se a fila está vazia e, se estiver, imprime uma mensagem de erro e retorna.
     Caso contrário, ele armazena o valor do elemento da frente, atualiza o ponteiro front para o próximo nó
     e decrementa o tamanho da fila. Por fim, exibe uma mensagem indicando que o elemento foi removido com sucesso.
     */
    public void remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        int data = front.data;
        front = front.next;
        size--;
        System.out.println("Elemento " + data + " removido da fila.");
    }

    /*
    O método display mostra o conteúdo da fila. Se a fila estiver vazia, exibe uma mensagem informando isso e retorna.
    Caso contrário, percorre a fila a partir do nó da frente até o nó traseiro, exibindo o valor de cada elemento na fila.
     */
    public void display(){
        if(isEmpty()){
            System.out.println("A fila esta vazia");
            return;
        }
        Node temp = front;
        System.out.println("Fila: ");
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    /*
    O método clear() esvazia a fila, definindo os ponteiros front e rear como null e reinicializando o tamanho da fila para zero.
     Uma mensagem é exibida para confirmar que a fila foi esvaziada.
     */
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("A fila foi esvaziada.");
    }
}
