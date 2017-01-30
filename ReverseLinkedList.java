
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev, current, next;
        
        prev = null;
        current = head;
        while(current!=null){
            ListNode temp;
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
