class Solution {
    public boolean isPalindrome(int x) {
        
        long c,rem, temp=0;
     c=x;
        while(c>0)
        {
            rem=c%10;
            temp=temp*10+rem;
            c=c/10;
        }
        if(x==temp)
        
            return true;
        
          return false;
    }
    }

