/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int calLength(ListNode l){
        int count = 0;
        while(l != null){
            l = l.next;
            count++;
        }
        return count;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int lentL1 = calLength(l1);
        int lentL2 = calLength(l2);

        ListNode temp1=l1 , temp2=l2 , ans = null , finalAns = null , prev = null;

        if(lentL1 > lentL2){
            ans = l1;
        }
        else {
            ans = l2;
        }
        finalAns = ans;
        int sum = 0 , unit_digit = 0 ,carry=0;
        while(temp1 != null && temp2 != null){
            
            sum = temp1.val + temp2.val + carry;
            unit_digit = sum % 10;
            carry = sum / 10;

            ans.val = unit_digit;
            prev = ans;
            ans = ans.next;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(ans != null){
            sum = ans.val + carry;
            unit_digit = sum % 10;
            carry = sum / 10;

            ans.val = unit_digit;
            prev = ans;
            ans = ans.next;
        }
        if(carry != 0){
            prev.next = new ListNode(carry , null);
        }
        return finalAns;
        
    }
}