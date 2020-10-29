public class p00083 {


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode i = current.next;
        while(i != null){
            if(i.val == current.val){
                i = i.next;
            } else{
                current.next = i;
                current = current.next;
                i = i.next;
            }
        }
        current.next = null;
        return head;
    }
}
