public class lab2_1 {
    lab2Node head;
    public lab2_1(){
        this.head = null;
    }
    public void insert (int data){
        lab2Node newNode = new lab2Node(data);

        if (head == null){
            head = newNode;
        }
        else{
            lab2Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        lab2Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        lab2_1 list = new lab2_1();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List");
        list.display();
    }
    
}
