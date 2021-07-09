//1.Write a program to find the four digit numbers, which are perfect squares, and all the digits in that number are even.

public class Main{
  public static void main(String args[]){
     int rem;
     int[] arr = new int[4];
     for(int i = 1000 ; i < 10000 ; i++){
        for(int j = 32 ; j<101 ; j++ ){
           if( i == (j*j)){
              int k = 0,temp = i;
              while(temp>0){
                 arr[k] = temp % 10;
                 temp = temp / 10;
                 k++;
              }
              if(arr[0]%2==0&&arr[1]%2==0&&arr[2]%2==0&&arr[3]%2==0){
                 System.out.print(i+"\t");
              }
           }
        }
     }
  }
}
