import Queue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean exit = false;
        while (!exit) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inserir elemento na fila");
            System.out.println("2. Remover elemento da fila");
            System.out.println("3. Mostrar conteúdo da fila");
            System.out.println("4. Tamanho da fila");
            System.out.println("5. Esvaziar a fila");
            System.out.println("6. Sair");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.println("Digite o elemento a ser inserido:");
                    int data = Integer.parseInt(System.console().readLine());
                    queue.inQueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Tamanho da fila: " + queue.getSize());
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}