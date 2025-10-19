public class LeetCode19 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node removeNthFromEnd(Node head,int n){
        int count = 0;
        Node temp= head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int res=count-n;
        if(res==0){
            return head.next;
        }
        temp=head;
        for(int i=1;i<res;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public Node BuildList(int arr[]){
        Node dummy = new Node(-1);
        Node curr = dummy;
        for (int val : arr) {
            curr.next = new Node(val);
            curr = curr.next;
        }
        return dummy.next;
    }
    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LeetCode19 s = new LeetCode19();
        int arr[] = {1,2,3,4,5};
        Node head = s.BuildList(arr);
        s.printList(head);
        head = s.removeNthFromEnd(head,3);
        s.printList(head);
    }
}
