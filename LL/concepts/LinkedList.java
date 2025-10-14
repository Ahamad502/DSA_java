package LL.concepts;

public class LinkedList {

    private Node Head;
    private Node Tail;
    private int size;
    public class Node{
        int data;
        Node link;
        Node(int data){
            this.data = data;
            this.link = null;
        }
    }

    public LinkedList(int data){
        Node newNode = new Node(data);
        Head = newNode;
        Tail = newNode;
        size = 1;
    }

    public void PrintList(){
        Node temp =Head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.link;
        }
    }

    public void HeadElement(){
        System.out.println("The head element is::"+Head.data);
    }

    public void TailElement(){
        System.out.println("The tail Element is::"+Tail.data);
    }

    public void Length(){
        System.out.println("The size of the list is::"+size);
    }
}
