public class FairCandySwap {

        public static void main(String[] args) {
            FairCandySwap solution = new FairCandySwap();


            int[] aliceSizes1 = {35,17,4,24,10};
            int[] bobSizes1 = {63,21};
            int[] result1 = solution.fairCandySwap(aliceSizes1, bobSizes1);
            printResult(result1);

        }


        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceTotal =0;
            int bobTotal =0;
            for(int a : aliceSizes){
                aliceTotal +=a;
            }
            for(int b: bobSizes){
                bobTotal += b;
            }

            int at = aliceTotal;
            int bt = bobTotal;
            for(int a : aliceSizes){
                aliceTotal = aliceTotal-a;
                bobTotal = bobTotal+a;
                int BobExchange = (bobTotal - aliceTotal)/2;
                if(BinarySearch(bobSizes,BobExchange)){
                    return new int[] {a,BobExchange};
                }else{
                    aliceTotal = at;
                    bobTotal = bt;
                }
            }
            return new int[]{};
        }
      static boolean BinarySearch(int[] arr,int target){
            int start=0;
            int end= arr.length-1;
          boolean isAsc = arr[start]<arr[end];
            while(start<=end){
                int mid= start + (end-start)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(isAsc){
                    if(arr[mid]<target){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
                else {
                    if(arr[mid]>target){
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }
            }
            return false;
        }
     static void printResult(int[] result) {
        if (result.length == 0) {
            System.out.println("No fair candy swap possible.");
        } else {
            System.out.println("Fair candy swap: [" + result[0] + ", " + result[1] + "]");
        }
    }
    }

