class Solution {
    public int reverse(int x) {
        boolean negativeFlag = false; 
    if (x < 0) 
    { 
        negativeFlag = true; 
        x = -x ; 
    } 
  
    int prev_rev_num = 0, rev_num = 0; 
    while (x != 0) 
    { 
        int curr_digit = x % 10; 
  
        rev_num = (rev_num * 10) + curr_digit; 
  
        // checking if the reverse overflowed or not. 
        // The values of (rev_num - curr_digit)/10 and 
        // prev_rev_num must be same if there was no 
        // problem. 
        if ((rev_num - curr_digit) /  
               10 != prev_rev_num) 
        { 
                 
            return 0; 
        } 
  
        prev_rev_num = rev_num; 
        x = x / 10; 
    } 
  
    return (negativeFlag == true) ? 
                         -rev_num : rev_num; 
    }
}

