# Last updated: 7/3/2025, 7:17:43 AM
class Solution:
    def kthCharacter(self, k: int) -> str:
        res=['a']

        while len(res)<k:
            curr=res[:]
            for i in range (len(curr)):
                if curr[i]=='z':
                    currr[i]='a'
                else:
                    curr[i]=chr(ord(curr[i])+1)
            res+=curr

        return res[k-1]
        