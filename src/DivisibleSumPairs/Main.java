package DivisibleSumPairs;


/*
Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i < j and ar[i] + ar[j] is divisible by k.

* */
public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int n = 6;
        int k= 3;
        int count=0;

        for(int i=0;i<(n-1);i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    if((a[i]+a[j])%k==0)
                        count++;
                }
            }
        }

        System.out.println(count);
    }
}
