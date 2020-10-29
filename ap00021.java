public class ap00021 {

  //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-101);
        ListNode move = newList;
        while(l1 != null && l2!=null){
            if(l1.val<=l2.val){
                move.next = l1;
                l1 = l1.next;
            } else{
                move.next = l2;
                l2 = l2.next;
            }
            move = move.next;
        }
        if(l1!=null){
            move.next = l1;
        }
        if(l2!=null){
            move.next = l2;
        }
        return newList.next;
        
    }

    public static void main(String[] args) {
        
    }
}
}

