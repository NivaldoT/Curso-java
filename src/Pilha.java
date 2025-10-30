public class Pilha {
    Node top;
    char height;

    public class Node{
        char value;
        Node next;
        Node(char value){
            this.value = value;
        }
    }

    Pilha(char value){
        Node newNode = new Node(value);

        top = newNode;
        height = 1;
    }
    void push(char value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    void printPilha(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    Node pop(){
        if(height == 0){
            return null;
        } else {
            Node temp = top;
            top = temp.next;
            temp.next = null;
            height--;
            return temp;
        }
    }

    void revertString(String text){
        for(int i=0; i<text.length();i++){
            char value = text.charAt(i);
            push(value);
        }

        String reverseText = "";
        Node p = pop();
        while(p != null){
            reverseText += ""+p.value;
            p = pop();
        }
        System.out.println(reverseText);
    }
}
