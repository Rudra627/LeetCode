
import java.util.*;

public class LeetCode21 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else
            {
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }
        else{
            temp.next=t2;
        }
        return dummy.next;
    }
    public ListNode buildlink(int arr[]){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        for(int n:arr){
            temp.next=new ListNode(n);
            temp=temp.next;
        }
        return dummy.next;
    }
    public void printll(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        int arr1[]={1,2,4};
        int arr2[]={1,3,4};
        LeetCode21 s1=new LeetCode21();
        ListNode l1=s1.buildlink(arr1);
        ListNode l2=s1.buildlink(arr2);
        ListNode head=s1.mergeTwoLists(l1,l2);
        s1.printll(head);

    }
}

// my approach to solve the problem
        // int size = arr1.length + arr2.length;
        // int arr[]=new int[size];
        // for(int i = 0; i < arr1.length; i++){
        //     arr[i]=arr1[i];
        // }
        // for(int i = 0; i < arr2.length; i++){
        //     int j=arr1.length+i;
        //     arr[j]=arr2[i];
        // }
        // Arrays.sort(arr);
        // System.out.println(arr);
        // LeetCode21 list = new LeetCode21();
        // ListNode head = buildList(arr);
        // list.printList(head);
        // ListNode head = mergeTwoLists(l1, l2);
        // list.printList(head);


