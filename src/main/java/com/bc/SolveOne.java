package com.bc;

public class SolveOne {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode l3=AddNewsum(l1,l2);
        System.out.println(l3.val+""+l3.next.val+""+l3.next.next.val);

    }
    public static  ListNode AddNewsum(ListNode l1,ListNode l2){
        ListNode t=new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode curr=t;
        int carry=0;
        while (p!=null||q!=null){
            int x=p!=null?p.val:0;
            int y=q!=null?q.val:0;
            int sum=x+y+carry;
            carry= sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return  t.next;
    }

 public static  ListNode Addtosum(ListNode l1,ListNode l2){
        Addsum(l1,l2);
        return  l1;
 }

    public static void Addsum(ListNode l1, ListNode l2) {
        l1.val+=l2.val;
        if(l1.val>=10){
            if(l1.next==null){
                l1.next=new ListNode(0);
            }
            l1.next.val+=1;
            l1.val=l1.val%10;
        }
        if(l1.next==null&&l2.next==null){
            return;
        }else if(l1.next!=null&&l2.next==null){
            l2.next=new ListNode(0);
        }else if(l1.next==null&&l2.next!=null){
            l1.next=new ListNode(0);
        }
        Addsum(l1.next,l2.next);
    }
}
