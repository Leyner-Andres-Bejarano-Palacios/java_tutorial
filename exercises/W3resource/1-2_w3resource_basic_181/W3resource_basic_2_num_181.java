import java.util.*;


public class W3resource_basic_2_num_181 {


    public static void main(String[] args) {
        ListNode l = new ListNode(10);
        l.next = new ListNode(20);
        l.next.next = new ListNode(30);
        l.next.next.next = new ListNode(40);
        l.next.next.next.next = new ListNode(50);
        System.out.println("\nOriginal Linked list:");
        printList(l);
        ListNode p = swap_Pairs(l);
        System.out.println("\n\nAfter swiping Linked list becomes:");
        printList(p);
    }

    public static ListNode swap_Pairs(ListNode head) {
    ListNode temp = new ListNode(0);
    temp.next = head;
    head = temp;
    while (head.next != null && head.next.next != null) {
        ListNode a = head.next;
        ListNode b = head.next.next;
        head.next = b;
        a.next = b.next;
        b.next = a;
        head = a;
        }
    return temp.next;
    }

    static void printList(ListNode p) {
    while (p != null) {
        System.out.print(p.val);
        if (p.next != null) {
            System.out.print("->");
        }
        p = p.next;
      }
    }


}



class ListNode {
 int val;
 ListNode next;

 ListNode(int x) {
  val = x;
 }
}



