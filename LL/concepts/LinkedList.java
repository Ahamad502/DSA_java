package LL.concepts;

public class LinkedList {

    private Node Head;
    private Node Tail;
    private int size;

    public class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public LinkedList(int data) {
        Node newNode = new Node(data);
        Head = newNode;
        Tail = newNode;
        size = 1;
    }

    public void PrintList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.link != null) {
                System.out.print(" -> ");
            }

            temp = temp.link;
        }
    }

    public void HeadElement() {
        System.out.println("The head element is::" + Head.data);
    }

    public void TailElement() {
        System.out.println("The tail Element is::" + Tail.data);
    }

    public void Length() {
        System.out.println("The size of the list is::" + size);
    }

    //append a value (add at last) using tail
    public void append(int value) {
        Node newNode = new Node(value);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.link = newNode;
            Tail = Tail.link;
        }
        size++;
    }

    //append a value (add at last) without using tail
    public void append_without_tail(int value) {
        Node newNode = new Node(value);
        if (Head == null) {
            Head = newNode;
        } else {
            Node temp = Head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
        size++;
    }

    //prepend a value (add at first)
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.link = Head;
            Head = newNode;
        }
        size++;
    }

    public Node RemoveAtLast() {
        if (size == 0) return null;
        Node temp = Head;
        Node pre = Head;
        while (temp.link != null) {
            pre = temp;
            temp = temp.link;
        }
        pre = Tail;
        Tail.link = null;
        size--;
        if (size == 0) {
            Head = null;
            Tail = null;
        }
        return temp;
    }

    public void Prepend(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            Head = newNode;
            Tail = newNode;
        } else {
            newNode.link = Head;
            Head = newNode;
        }
        size++;
    }

    public Node RemoveFirst() {
        if (size == 0) return null;
        Node temp = Head;
        Head = Head.link;
        temp.link = null;
        size--;
        if (size == 0) {
            Tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index<0 || index>=size){
            return null;
        }
        else{
            Node temp=Head;
            for(int i=0;i<index;i++){
                temp=temp.link;
            }
            return temp;
        }
    }

    public boolean set(int data,int index){
        Node temp=get(index);
        if(temp!=null){
            temp.data=data;
            return true;
        }
        return false;
    }

    public boolean Insert(int data, int index){
        if(index < 0 || index > size) return false;
        if(index==0) {
            Prepend(data);
            return true;
        }
        if(index==size) {
            append(data);
            return true;
        }
        Node newNode = new Node(data);
        Node temp=get(index-1);
        newNode.link=temp.link;
        temp.link=newNode;
        size++;
        return true;
    }

    public Node Remove(int index){
        if(index < 0 || index > size) return null;
        if(index==0) return RemoveFirst();
        if(index==size-1) return RemoveAtLast();
        Node pre=get(index-1);
        Node temp=pre.link;
        pre.link=temp.link;
        temp.link=null;
        size--;
        return temp;
    }

    public void Reverse(){
        Node temp=Head;
        Head=Tail;
        Tail=temp;
        Node After = temp.link;
        Node Before = null;
        for(int i = 0; i<size ;i++){
            After=temp.link;
            temp.link=Before;
            Before=temp;
            temp=After;
        }
    }
}

    //remove first node
//    public void removeFirst() {
//        Node temp = Head;
//        if (Head == null) return null;
//        else if (Head == Tail) {
//            Head = null;
//            Tail = null;
//        } else {
//            Head = Head.link;
//            temp.link = null;
//        }
//        size--;
//        return temp;
//    }
//}


