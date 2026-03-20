package module10;

class Node {
    int data;
    Node next;

    // Constructor initialize a new node with data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head = null;

    // 1. Display all elements in the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 2. Insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to current head
        head = newNode;      // Update head to the new node
    }

    // 3. Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // 4. Delete a node with a given value (first occurrence)
    public void deleteByValue(int key) {
        Node temp = head, prev = null;

        // Case 1: If the head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Case 2: Search for the key, keeping track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not found in the list
        if (temp == null) return;

        // Unlink the node from the list
        prev.next = temp.next;
    }

    // 5. Count the number of nodes in the list
    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();


        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        System.out.println("Current Linked List:");
        list.display();

        System.out.println("Total nodes: " + list.countNodes());

        System.out.println("Deleting node with value 20...");
        list.deleteByValue(20);
        list.display();

        System.out.println("Final node count: " + list.countNodes());
    }
}

