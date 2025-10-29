public class ListaEncadeada {
    Node head;
    Node tail;
    int length;

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public ListaEncadeada(int value){
        Node newNode = new Node(value);

        head = newNode;
        tail = newNode;
        length = 1;
    }

    void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
