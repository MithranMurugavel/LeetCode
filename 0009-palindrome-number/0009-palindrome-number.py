class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num = x
        sum = 0

        while(x>0):
            rem = x%10
            sum = sum*10 +rem
            x/=10
    
        return True if sum == num else False
        