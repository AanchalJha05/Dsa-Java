public class Bitonic_array{
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,11,7,5,4};
        int res =  bitonicarrayminelement(arr);
        System.out.println(res);
        
    }
    static int bitonicarrayminelement(int arr[]){
        int n= arr.length;

        if(arr[0]<arr[n-1]){
            return arr[0];
        }
        else{
            return arr[n-1];
        }

    }
}

// 941 valid mountain array in leetcode solution
/* 
int index =0;
int n= arr.length;
// for increasing
while(index<n-1){
    if(arr[index]<arr[index+1]){
        index++;
    }
    else{
        break;

    }
    


}
if(index==0||index==n-1){
    return false;
}
// for decreasing
while(index<n-1){
    if(arr[index]>arr[index+1]){
        index++;
    }
    else{
        break;

    }
    return (index==n-1);


}
*/

/* 
// 852 leetcode solution(peak element)
int n = arr.length;
int start =0;
int end= n-1;
while(start<=end){
    int mid = start+(end-start)/2;
    if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        return mid;
    }
    else if(mid!=n-1 && arr[mid]<arr[mid+1]){
        start = mid+1;
        
    }
    else{
        end = mid-1;
    }
    
}
return -1;
*/

// leetcode 1095 find in mountain array
/* 

int n = mountainArr.length(); // as it has class of array not only arrays
int start=0;
int end  = n-1;
int mid =-1;
while(start<=end){
    mid = start+(end-start)/2;
    int cur = mountainArr.get(mid);
    if(mid!=0 && mid!=n-1 && cur>mountainArr.get(mid-1) && cur>mountainArr.get(mid+1)){
        if(cur==target){
            return mid;

        }
        break;
        

    }else if(mid!=n-1 && cur<mountainArr.get(mid+1)){
        start =mid+1;

    }else{
        end = mid-1;

    }

}
// find in first half (increasing)
start =0;
end = mid;
while(start<=end){
    int m = start +(end-start)/2;
    int cur = mountainArr.get(m);
    if(cur==target){
        return m;
    }else if(target<cur){
        end = m-1;
        
    }else{
        start = m+1;
    }
}

start =mid+1;
end =n-1;
while(start<=end){
    int m = start +(end-start)/2;
    int cur = mountainArr.get(m);
    if(cur==target){
        return m;
    }else if(target<cur){
        
        start = m+1;
        
    }else{
        end = m-1;
        
    }
}
return -1;




*/




