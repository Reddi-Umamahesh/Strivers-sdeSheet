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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0;
        ListNode temp = head;
        while(temp!=null){
            k++;
            temp = temp.next;
        }
        if(k==1&&head.next==null){
            return null;
        }
        int e = k-n;
        if(e==0){
            head = head.next;
            return head;
        }
        ListNode curr = head;
        while(e>1){
            curr = curr.next;
            e--;
        }
        ListNode deleted = curr.next;
        curr.next = curr.next.next;
        return head;
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
<<<<<<< HEAD
        ListNode head1 =l1;
        ListNode head2 = l2;
        ListNode sol;
        int sum = head1.data+head2.data ;
        ListNode temp;
        if(sum<10){
            sol = new ListNode(sum);
            temp = sol;
        }else{
            sol = new ListNode(sum-10);
            sol.next = new ListNode(1);
            temp = sol.next;
        }
        head1 = head1.next;
        head2 = head2.next;
        int carry=0;
        while(head1!=null && head2!=null){
            System.out.println("hi");
            sum = head1.data + head2.data+carry;
            head1 = head1.next;
            head2 = head2.next;
                
            if(sum<10){
                temp.next = new ListNode(sum);
                carry=0;
                temp = temp.next;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
                temp = temp.next;
            }
        }
        while(head1!=null){
            sum = head1.data+carry;
            if(sum<10){
                temp.next = new ListNode(sum);
                temp = temp.next;
                carry=0;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
=======
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode ans;
        int carry =0;
        int sum = head1.data+head2.data;
        if(sum<10){
            ans = new ListNode(sum);
        }else{
            ans = new ListNode(sum-10);
            carry =1;
        }
        ListNode temp=ans;
        head1 = head1.next;
        head2 = head2.next;
        printll(ans);
        System.out.println(sum);
        while(head1!=null&&head2!=null){
            sum = head1.data +head2.data +carry;
            head1 = head1.next;
            head2 = head2.next;
            if(sum<10){
                temp.next = new ListNode(sum);
                carry =0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(sum-10);
                carry =1;
                temp = temp.next;
            }
           
        }
        while(head1!=null){
            sum = head1.data +carry;
            head1 = head1.next;
            if(sum<10){
                temp.next = new ListNode(sum);
                carry =0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(sum-10);
                carry =1;
>>>>>>> 5e5450819278229ae8bae32f7b990463408ac916
                temp = temp.next;
            }
        }
        while(head2!=null){
<<<<<<< HEAD
            sum = head2.data + carry;
            if(sum<10){
                temp.next = new ListNode(sum);
                temp = temp.next;
                carry=0;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
=======
            sum = head2.data +carry;
            head2 = head2.next;
            if(sum<10){
                temp.next = new ListNode(sum);
                carry =0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(sum-10);
                carry =1;
>>>>>>> 5e5450819278229ae8bae32f7b990463408ac916
                temp = temp.next;
            }
        }
        if(carry==1){
<<<<<<< HEAD
            temp.next = new ListNode(carry);
        }
        printll(sol);
        return sol;
    }
=======
            temp.next = new ListNode(1);
        }
        printll(ans);
        return ans;
        
    }
    public static void deleteNode(ListNode node) {
        ListNode curr = node;
        while(curr.next!=null){
            curr.data = curr.next.data;
            curr = curr.next;
        }
        curr = null;
        ListNode temp = node;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        printll(head1);
    }
    static ListNode head1 = new ListNode(4);
>>>>>>> 5e5450819278229ae8bae32f7b990463408ac916
    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next = new ListNode(9);

<<<<<<< HEAD
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(9);
        head1.next.next.next = new ListNode(9);
=======
        
        head1.next = new ListNode(5);
       // head1.next.next = new ListNode(1);
       // head1.next.next.next = new ListNode(9);
>>>>>>> 5e5450819278229ae8bae32f7b990463408ac916
        //reverseList(head);
        //middleNode(head);
        //mergeTwoLists(head,head1);
        // ListNode ans =removeNthFromEnd(head, 2);
        // printll(ans);
<<<<<<< HEAD
        addTwoNumbers(head,head1);
=======
       // addTwoNumbers(head,head1);
        deleteNode(head1);

        
>>>>>>> 5e5450819278229ae8bae32f7b990463408ac916

    }
    /*
     *  ListNode head1 =l1;
        ListNode head2 = l2;
        ListNode sol;
        int sum = head1.data+head2.data ;
        ListNode temp;
        if(sum<10){
            sol = new ListNode(sum);
            temp = sol;
        }else{
            sol = new ListNode(sum-10);
            sol.next = new ListNode(1);
            temp = sol.next;
        }
        head1 = head1.next;
        head2 = head2.next;
        int carry=0;
        while(head1!=null && head2!=null){
            System.out.println("hi");
            sum = head1.data + head2.data+carry;
            head1 = head1.next;
            head2 = head2.next;
                
            if(sum<10){
                temp.next = new ListNode(sum);
                carry=0;
                temp = temp.next;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
                temp = temp.next;
            }
        }
        while(head1!=null){
            sum = head1.data+carry;
            if(sum<10){
                temp.next = new ListNode(sum);
                temp = temp.next;
                carry=0;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
                temp = temp.next;
            }
        }
        while(head2!=null){
            sum = head2.data + carry;
            if(sum<10){
                temp.next = new ListNode(sum);
                temp = temp.next;
                carry=0;
            }else{
                carry=1;
                temp.next = new ListNode(sum-10);
                temp = temp.next;
            }
        }
        if(carry==1){
            temp.next = new ListNode(carry);
        }
        printll(sol);
        return sol;
     */
}
