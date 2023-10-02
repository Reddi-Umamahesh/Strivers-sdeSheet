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
    class Node{
	    int data;
	    Node next;
	    Node bottom;
	    Node(int d){
		    data = d;
		    next = null;
		    bottom = null;
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
    public static boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        int len = findlen(head);
        int NoOfSwaps = len/k;
        int i=0;
        ListNode currpos = head;
        while(NoOfSwaps>0){
            head =reverse(head, i, k);
            i+=k;
            NoOfSwaps--;
        }
        printll(head);
        return head;
    }
    public static int findlen(ListNode head){
        int len=0;
        ListNode temp =head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public static ListNode reverse(ListNode head,int k,int l){
        int j=k;
        ListNode cur = head;
        while(j>1){
            cur = cur.next;
            j--;
        }
        ListNode curr = k==0?head:cur.next;
        int i=0;
        ListNode prev = null;
        ListNode next;
        while(i<l && curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(k!=0){
            cur.next=prev;
              ListNode temp = prev;
            while(temp!=null&&temp.next!=null){
                temp=temp.next;
            }
            if(temp!=null){
                temp.next = curr;
            }

        }else{
            ListNode temp = prev;
            while(temp!=null&&temp.next!=null){
                temp=temp.next;
            }
            
            if(temp!=null){
                temp.next = curr;
            }
            return prev;
        }
        return head;
    }
    public static boolean isPalindrome(ListNode head) {
       //s-1 mid find, make half
       //s-2 reverse second ll
       //s-3 compare and return
        int len = findlen(head);
        int mid = len/2;
        int i=0;
        ListNode temp = head;
        while(i<mid){
            temp = temp.next;
            i++;
        }
        int len2 = findlen(temp);
        if(len2>mid){
            temp = temp.next;
        }
        ListNode sh = reversell(temp);
        ListNode fh = head;
        while(sh!=null){
            if(fh.data!=sh.data){
                return false;
            }
            sh = sh.next;
            fh = fh.next;
        }
        return true;
    }
    public static ListNode reversell(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)break;
        }
        if(fast==null||fast.next==null)return null;
        while(head!=slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
   
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
       // head.next.next = head;
        // head.next.next.next = new ListNode(3);
        // head.next.next.next.next = new ListNode(3);
        // head.next.next.next.next.next = new ListNode(6);
        // head.next.next.next.next.next.next = head.next.next;
        // head.next.next.next.next.next.next.next = new ListNode(8);
        // ListNode head1 = new ListNode(4);
        // head1.next = new ListNode(1);
        // head1.next.next = head.next.next.next;
        // head1.next.next.next = new ListNode(9);
        // printll(head);
        // printll(head1);
        // getIntersectionNode(head,head1);
        // System.out.println(hasCycle(head));
       // reverseKGroup(head, 4);
        //reverse(head, 0,2);
       // System.out.println(isPalindrome(head));
        ListNode temp =detectCycle(head);
        if(temp!=null){
            System.out.println(temp.data);
        }

        
    }
}
