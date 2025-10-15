package LL.concepts;//package LL.concepts;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.PrintList();
        list.HeadElement();
        list.TailElement();
        list.Length();
        list.append(5);
        list.append(6);
        list.append_without_tail(9);
        list.prepend(2);
        list.PrintList();
        System.out.println("\nThe removed element is::"+list.RemoveAtLast().data);
        list.PrintList();
        list.Prepend(1);
        System.out.print("\n"); // one new line
        list.PrintList();
        System.out.println("\nThe removed element is::"+list.RemoveFirst().data);
        list.PrintList();
        System.out.println("\nThe index element is::"+list.get(2).data);
        System.out.println(list.set(1,0));
        list.PrintList();
        System.out.println("\nThe adding result is::"+ list.Insert(3,2));
        list.PrintList();
        System.out.println("\nThe removed element is::"+list.Remove(3).data);
        list.PrintList();
        list.Reverse();
        System.out.print("\n");
        list.PrintList();
    }
}