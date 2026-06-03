public class Middle_Linklist {

    private static class ListNode {

        private ListNode next;

        public ListNode() {
        }
    }
    class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }
}

}
