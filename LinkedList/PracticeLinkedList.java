



public class PracticeLinkedList {
    Node head;
   class Node {
        int val;
        Node next;
        Node prev;
        Node(int value) {
            this.val = value;
            this.next = null;
            this.prev = null;
        }
   }

   public void addfirst(int value) {
     Node newNode = new Node(value);
     newNode.next = head;
     head = newNode;
     newNode.prev = null;
   }

   public void addLast(int value) {
    Node newNode = new Node(value);
    Node currNode = head;
     while(true) {
        currNode = currNode.next;
        if(currNode.next == null) {
            currNode.next = newNode;
            break;
        }
     }
   }

   public void removeLast() {
    Node currNode = head.next;
    Node prevNode = head;
    while(true) {
        currNode = currNode.next;
        prevNode = prevNode.next;
        if(currNode.next == null) {
            prevNode.next = null;
            break;
        }
    }
   }

   public void removeFirst() {
    head = head.next;
   }

   public void printList() {
    if(head == null) {
        System.out.print("The List is Empty!");
    }
     Node currNode = head;
     System.out.print("Null");
     while(currNode != null) {
        System.out.print(" <-- " + currNode.val + " --> ");
        currNode = currNode.next;
     }
     System.out.println("Null");
   }

    public static void main(String args[]) {
       OopsConcepts l = new OopsConcepts();
       l.addfirst(1);
       l.addfirst(2);
       l.addLast(2);
       l.addLast(6);
       l.addLast(90);
       l.printList();
       l.removeLast();
       l.printList();
       l.removeFirst();
       l.printList();

      
    }
    

}
