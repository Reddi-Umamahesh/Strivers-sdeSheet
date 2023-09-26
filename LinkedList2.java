package StriverssdeSheet;

import java.util.*;
public class LinkedList2 {
    public static class ListNode{
        int data;
        ListNode next ;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while(l1!=null && l2!=null){
            
        }
        return null;
    }
    public static void printll(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
       // head.next.next.next.next.next.next = new ListNode(9);

        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(1);
        head1.next.next = head.next.next.next;
        // head1.next.next.next = new ListNode(9);
        printll(head1);
        System.out.println(head);
        if(head.next.next == head1.next.next){
            System.out.println("hii");
        }
    }
}
