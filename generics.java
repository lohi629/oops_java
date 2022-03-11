import java.util.Arrays;
import java.util.Scanner;
public class Main<T extends Comparable<? super T>> {
  T[] array;
  Main(T[] array){
    this.array = array;
  }
 
  private T[] sort(){
    for(int i = array.length; i > 1; i--){
      for(int j = 0; j < i - 1; j++){
        if(array[j].compareTo(array[j+1]) > 0){
          swapElements(j, array);
        }
      }            
    }
    return array;
  }
  private void swapElements(int index, T[] arr){
    T temp = arr[index];
    arr[index] = arr[index+1];
    arr[index+1] = temp;        
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of elements in integer array");
    int n = sc.nextInt();
    Integer[] arr1 = new Integer[n];
    System.out.println("enter elements in integer array");
    for(int i=0;i<n;i++)
    {
      arr1[i]=sc.nextInt();
}
     Main<Integer> b1 = new Main<Integer>(arr1);
    Integer[] sa1 = b1.sort();
    System.out.println("minimum element is :"+sa1[0]);
    System.out.println("maximum element is :"+sa1[n-1]);

System.out.println("enter no of elements in String array");
    int m = sc.nextInt();
    String[] arr2 = new String[m];
    System.out.println("enter elements in String array");
    sc.nextLine();
    for(int i=0;i<m;i++)
    {
      arr2[i]=sc.nextLine();
}
     Main<String> b2 = new Main<String>(arr2);
    String[] sa2 = b2.sort();
    System.out.println("minnimum element is :"+sa2[0]);
   System.out.println("maximum element is :"+sa2[m-1]);
   System.out.println("enter no.of ele in double array");
   int p=sc.nextInt();
   Double[] d1=new Double[p];
   System.out.println("enter elements in double array");
    for(int i=0;i<p;i++)
    {
      d1[i]=sc.nextDouble();
}
Main<Double> b3 = new Main<Double>(d1);
    Double[] sa3 = b3.sort();
    System.out.println("minnimum element is :"+sa3[0]);
   System.out.println("maximum element is :"+sa3[p-1]);
   
    }
}
enter no of elements in integer array
3
enter elements in integer array
34
90
12
minimum element is :12
maximum element is :90
enter no of elements in String array
3
enter elements in String array
car
dog
key
minnimum element is :car
maximum element is :key
enter no.of ele in double array
4
enter elements in double array
8.99
1.22
7.009
8.005
minnimum element is :1.22
maximum element is :8.99
