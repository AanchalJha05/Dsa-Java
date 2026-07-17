/*public class binarysearch {
    public static void main(String[] args) {
      int arr[] = {2,5,7,11,45,87,90};
      int arr2[]={90,78,34,3,1};
       // binarysearch(arr,87);
       //binarysearchdesc(arr,3);
       binarysearchorderagnostics(arr,3);
       binarysearchorderagnostics(arr,90);
       
    }
    static void binarysearchorderagnostics(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            binarysearch(arr, target);
        }
        else{
            binarysearchdesc(arr, target);
        }
    }
    static void binarysearch(int arr[],int target){
        int ans=-1;
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }
        if(ans==-1){
            System.out.println("element is not found");
        }else{
            System.out.println("element found at "+ans);
        }
    }
    static void binarysearchdesc(int arr[],int target){
        int ans=-1;
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                
                end = mid-1;

            }else{
                start = mid+1;
                
            }
        }
        if(ans==-1){
            System.out.println("element is not found");
        }else{
            System.out.println("element found at "+ans);
        }
    }
}
*/
/*public class binarysearch{
    public static void main(String[] args){
        int arr[]={2,2,4,4,8,12,16};
        binarysearchquest(arr, 4, true);
        binarysearchquest(arr, 4,false);
    }
    static void binarysearchquest(int arr[],int target,boolean isfirst){
        int ans=-1;
        int start=0;
        int end =arr.length-1;// gives last index 
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==target){
                ans = mid;
                if(isfirst){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
                
            }else if(arr[mid]<target){
                start= mid+1;

            }else{
                end=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("the target is not found");
        }else{
            System.out.println("the target found at index"+ans);
        }

    }
}*/


/*public class binarysearch{
    public static void main(String[] args){
        int arr[]={2,2,4,4,8,12,16};
        int res[] = new int[2];
        int first = binarysearchcount(arr,13,true);
        int last = binarysearchcount(arr,13,false);
        if(first==-1){
            System.out.println("the occurance of target is "+0);
        }
        else{
            System.out.println("occurance of target is: "+ (last-first+1));

        }
        
        //binarysearchcount(arr, 4, true);
        //binarysearchcount(arr, 4,false);
    }
    static int binarysearchcount(int arr[],int target,boolean isfirst){
        int ans=-1;
        int start=0;
        int end =arr.length-1;// gives last index 
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==target){
                ans = mid;
                if(isfirst){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
                
            }else if(arr[mid]<target){
                start= mid+1;

            }else{
                end=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("the target is not found");
        }else{
            System.out.println("the target found at index"+ans);
        }
        return ans;

    }
}*/
/*public class binarysearch {
    public static void main(String[] args){
        int arr[]={2,2,4,4,8,12,16};
        // int res[] = new int[2];   // abhi yhe bna kr kiya hai to tum ese bhi kr skte hai kyuki gfg pr main() nhi chlta so use this  ArrayList<Integer> res = new ArrayList<>();  res.add(binarysearchquest(arr,x,true)); res.add(binarysearchquest(arr,x,false));  return res;
            
                                                
                                                      
                                                       
        // int first = binarysearchfloor(arr,13,true);
        // int last = binarysearchfloor(arr,13,false);
        // if(first==-1){
        //     System.out.println("the occurance of target is "+0);
        // }
        // else{
        //     System.out.println("occurance of target is: "+ (last-first+1));
        int ans = binarysearchfloor(arr,17);
        System.out.println("ans is"+ans);
        

    }
    static int binarysearchfloor(int arr[],int target){
        int ans = -1;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start +(end-start)/2;
            if(target==arr[mid]){
                ans= arr[mid];
                break;

            }
            else if(target<arr[mid]){
                end = mid-1;
                ans =arr[mid];
            }else{
                start=mid+1;
                ans=arr[mid];
            }
            
            

            
        }
        return ans;
    }

    
}*/


/*public class binarysearch {
    public static void main(String[] args){
        int arr[]={2,2,4,4,8,12,14};
        // int res[] = new int[2];
        // int first = binarysearchfloor(arr,13,true);
        // int last = binarysearchfloor(arr,13,false);
        // if(first==-1){
        //     System.out.println("the occurance of target is "+0);
        // }
        // else{
        //     System.out.println("occurance of target is: "+ (last-first+1));
        int ans = binarysearchceil(arr,13);
        System.out.println("ans is"+ans);
        

    }
    static int binarysearchceil(int arr[],int target){
        int ans = -1;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start +(end-start)/2;
            if(target==arr[mid]){
                ans= arr[mid];
                break;

            }
            else if(arr[mid]<target){
                start = mid+1;
                
            }else{
                end=mid-1;
                ans=arr[mid];
            }
            
            

            
        }
        return ans;
    }

    
}*/

/*public class binarysearch {
    public static void main(String[] args){
        int arr[]={2,2,4,4,8,12,14};
        // int res[] = new int[2];
        // int first = binarysearchfloor(arr,13,true);
        // int last = binarysearchfloor(arr,13,false);
        // if(first==-1){
        //     System.out.println("the occurance of target is "+0);
        // }
        // else{
        //     System.out.println("occurance of target is: "+ (last-first+1));
        binarysearchminabsdifference(arr,10);
        
        

    }
    static void binarysearchminabsdifference(int arr[],int target){
        if(arr.length==0){
            return;
        }
        int ans = -1;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start +(end-start)/2;
            if(target==arr[mid]){
                ans= arr[mid];
                break;

            }
            else if(arr[mid]<target){
                start = mid+1;
                
            }else{
                end=mid-1;
                
            }
            
            

            
        }
        int res=0;
        // element does not exist
        if(ans==-1){
            if(end==-1){  
                res = Math.abs(target-arr[start]);

                

            }else if(start==arr.length){
                res=Math.abs(target-arr[end]);

            }else{
                int ans1 = Math.abs(target-arr[start]);
                int ans2=Math.abs(target-arr[end]);
                res = (ans1<ans2)?ans1:ans2;
            }
            
        }else{
            res=0;

        }
        System.out.println("minimum absolute difference is"+res);
        
    }

    
}*/


public class binarysearch{
    public static void main(String[] args) {
        int arr[]={2,2,4,7,9,25,56,88,94}; // ab ham infinite array nhi bna skte islye bas isme kuch value daal kr isko let kr rhe h ki yhe infinite array hai 
        int arr1[]={0,0,0,0,1,1,1,1};
        
        int range[]= findrangeinInfinitearray(arr,25);
        System.out.println(range[0]+" , "+range[1]);
        int ans=binarysearchinrange(arr,25,range[0],range[1]);
        if(ans==-1){
            System.out.println("element not found");
        }else{
            System.out.println("found element at index"+ans);
        }

        
        
    }
    
    static int[] findrangeinInfinitearray(int arr[],int target){
        int range[] = new int[2];
        int start=0;
        int end =1;
        while(arr[end]<target){
            start=end;
            end = 2*end;

        }
        range[0]=start;
        range[1] =end;
        return range;
    }
    static int binarysearchinrange(int arr[],int target,int start,int end){
        int ans=-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}