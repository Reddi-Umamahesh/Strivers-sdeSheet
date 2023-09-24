package StriverssdeSheet;

public class Linkedlist1 {
    public static class ListNode{
        int data;
        ListNode next ;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        printll(head);
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        printll(prev);
        return prev;
    }
    public static void printll(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        printll(slow);
        return slow;
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode ans;
        if(head1!=null &&head2!=null &&head1.data<=head2.data){
            ans = new ListNode(head1.data);
            head1 = head1.next;
        }else{
            ans = new ListNode(head2.data);
            head2 = head2.next;
        }
        ListNode temp = ans;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                //add that into ans ll
                temp.next = new ListNode(head1.data);
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = new ListNode(head2.data);
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = new ListNode(head1.data);
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = new ListNode(head2.data);
            head2 = head2.next;
            temp = temp.next;
        }
        printll(ans);
        return ans;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        //head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        //reverseList(head);
        //middleNode(head);
        mergeTwoLists(head,head1);
        

    }
}
