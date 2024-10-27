class DoubleLinkedList {
    private Node head;
    private Node tail;

    public void addFirst(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(String name) {
        Node newNode = new Node(name);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void remove(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    public void swapNodes(String name1, String name2) {
        Node node1 = findNode(name1);
        Node node2 = findNode(name2);

        if (node1 != null && node2 != null) {
            String temp = node1.name;
            node1.name = node2.name;
            node2.name = temp;
        }
    }

    private Node findNode(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        Node current = head;
        int count = 1;
        while (current != null) {
            System.out.println(count + ". " + current.name.trim());
            current = current.next;
            count++;
        }
        System.out.println();
    }
}