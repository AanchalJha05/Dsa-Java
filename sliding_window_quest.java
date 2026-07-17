// gfg question smallest subarray with sum greater than x (given value) 
// but agr x ko bhi include krna hai to code me simply sum>= target kr do :) 
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int windowstart =0;
        int windowend =0;
        int sum=0;
        int ans = Integer.MAX_VALUE;
        int len =0;
        while(windowend<n){
            sum+=nums[windowend];
            
            while(sum>target){
                
                len = windowend-windowstart+1;
                ans = Math.min(ans,len);
                sum-=nums[windowstart];
                windowstart++;
            }
            windowend++;


        }
        return (ans==Integer.MAX_VALUE)?0:ans;
        
    }
}




//Longest substring of K unique elements in gfg
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int windowstart=0;
        int windowend = 0;
        int len =0;
        int maxlen =Integer.MIN_VALUE;
        int freqhash[] = new int[26];
        int uniquecharcount = 0;
        while(windowend<n){
            int index=s.charAt(windowend)-97;
            if(freqhash[index]==0){
                uniquecharcount++;
                freqhash[index]++;
                
            }else{
                freqhash[index]++;
            }
            if(uniquecharcount==k){
                len = windowend-windowstart+1;
                maxlen = Math.max(maxlen,len);
            }
            else if(uniquecharcount>k){
                while(windowstart<windowend && uniquecharcount>k){
                    index = s.charAt(windowstart)-97;
                    
                    freqhash[index]--;
                    windowstart++;
                    if(freqhash[index]==0){
                        uniquecharcount--;
                    }
                }
            }
            windowend++;
            
            
        }
        return (maxlen==Integer.MIN_VALUE)?-1:maxlen;
        
    }
}


//  Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int windowstart= 0;
        int windowend =0;
        
        HashSet<Character> set = new HashSet<>();
        int len =0;
        int maxlen =0;
        while(windowend<n){
            char ch = s.charAt(windowend);
            if(set.contains(ch)){
                while(windowstart<windowend && set.contains(ch)){
                    set.remove(s.charAt(windowstart));
                    windowstart++;
                }
            }
            set.add(ch);
            maxlen = Math.max(maxlen,windowend-windowstart+1);
            windowend++;
        }
        return maxlen;
    }
}