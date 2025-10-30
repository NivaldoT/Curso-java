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
    Node removeLast(){
        if(length == 0){
            System.out.println("Lista vazia, impossível remover elemento.");
            return null;
        } else {
            Node temp = head;
            Node prev = head;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            tail = prev;
            length--;

            return prev;
        }
    }

    void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            length++;
        }
    }
//    Node removeFirst(){
//        Node segundo = head.next;
//        Node headValor = head;
//        head = segundo;
//        length--;
//        return headValor;
//    }
    Node removeFirst(){
        if(length == 0){
            return null;
        } else {
            Node temp = head;

            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }
    }
    Node get(int index){
        Node temp = head;
        if(index <0 || index >= length){
            return null;
        } else {
            int count = 0;
            while(count < index){
                temp = temp.next;
                count++;
            }
            return temp;
        }
    }

    public boolean insert(int index, int value){
        if(index ==0){
            this.prepend(value);
            return true;
        }
        if(index == length){
            this.append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    public Node findMiddleNode(){
        Node slow;
        Node fast;
        slow = fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            Node aux = fast.next;
            fast = aux.next;
        }
        return slow;
    }
}
