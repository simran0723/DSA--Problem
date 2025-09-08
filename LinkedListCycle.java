public class LinkedListCycle {
    class ListNode{
        ListNode next;
    }
   // public static void main(String[] args) {
        //firstly create the linked list then
        //use two fast and slow pointer
        //in which the fast pointer jump two node and slow jump one node
        //and by doing this again and again the fast and slow pointer comes to sam e position which means the
        //linked list contain the cycle
        public boolean hasCycle(ListNode head) {
            ListNode slow = head,fast = head;
            while (fast != null&& fast.next != null){
                slow = slow.next;
                fast = fast .next.next;
                if (fast == slow ){
                    return true ;
                }

            }
            return false;
        }
    }

