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
        if(headA==null||headB==null)return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
            
        }
       return a;
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
        printll(head);
        printll(head1);
        getIntersectionNode(head,head1);
        
    }
}
