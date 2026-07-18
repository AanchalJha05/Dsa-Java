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

// 1456. Maximum Number of Vowels in a Substring of Given Length (leetcode)

int n= s.length();
int count =0;
int maxcount =0;
for(int i=0;i<k;i++){
    char ch = s.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
    }
}
maxcount=count;
for(int i=1;i<n-k+1;i++){
    char left = s.charAt(i-1);
    if(left=='a'||left=='e'||left=='i'||left=='o'||left=='u'){
        count--;
    }
    char right = s.charAt(i+k-1);
    if(right=='a'||right=='e'||right=='i'||right=='o'||right=='u'){
        count++;
    }
    maxcount = Math.max(maxcount,count);
}




// 904. Fruit Into Baskets
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int windowstart=0;
        int windowend =0;
        int n= fruits.length;
        int maxcount =0;
        
        while(windowend<n){
            map.put(fruits[windowend],map.getOrDefault(fruits[windowend], 0) + 1);
            while(map.size()>2){
                map.put(fruits[windowstart],map.get(fruits[windowstart])-1);
                if(map.get(fruits[windowstart])==0){
                    map.remove(fruits[windowstart]);
                }
                windowstart++;
                

            }
            
            maxcount = Math.max(maxcount,windowend-windowstart+1);
            windowend++;
        }
        return maxcount;
        
    }
}
