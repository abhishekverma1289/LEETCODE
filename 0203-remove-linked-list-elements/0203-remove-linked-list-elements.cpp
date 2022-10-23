
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        if (head == 0) return head; 
        if (head->val == val)   
            return removeElements(head->next, val);
        else {                  
            head->next = removeElements(head->next, val);
            return head;
        }
    }
        
    };
