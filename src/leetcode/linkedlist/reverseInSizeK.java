package leetcode.linkedlist;

public class reverseInSizeK {
    public static void main(String[] args) {
         int k = 2;
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode temp = head;
        temp.next = new LinkedListNode(2);
        temp= temp.next;
        temp.next = new LinkedListNode(3);
        temp = temp.next;
        temp.next = new LinkedListNode(4);
        temp= temp.next;
        temp.next = new LinkedListNode(5);
        temp= temp.next;
        temp.next = new LinkedListNode(6);
        temp= temp.next;
        temp.next = new LinkedListNode(7);
        temp = head;
        System.out.println("original linkedlist before reversal");
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        LinkedListNode newHead = reverse(head,k);
        temp = newHead;
        System.out.println("\nAfter reversal in size of k");
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }

    public static LinkedListNode reverse(LinkedListNode head,int k){
        /// 1 2 3 4 5 6 7
        int count = k;
        LinkedListNode nextGroupHead = head;
        while(count > 0 && nextGroupHead!=null){
            nextGroupHead = nextGroupHead.next;
            count --;
        }
        // only reverse the next set of k if set contains k nodes
        // if it has less than k than keep it as it is
        if(count==0){
            LinkedListNode curr = head;
            LinkedListNode prev = null;
            LinkedListNode next = null;

            while(curr!=null && curr.next!=null){
                if(next==nextGroupHead) break;
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(nextGroupHead!=null){
                head.next = reverse(nextGroupHead,k);
            }
            return prev;

        }
        // as the only 1 node is left to reverse and group size has to be 2
        // we do not reverse in this case
        else return head;

    }

}

class LinkedListNode{
    public int val;
    public LinkedListNode next;

    public LinkedListNode(int value){
        this.val = value;
        this.next = null;
    }




}
