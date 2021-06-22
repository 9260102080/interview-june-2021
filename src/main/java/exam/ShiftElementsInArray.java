public class RotateLeft{
  public static void main (String[]args){
    int []arr=new int[]{1,2,3,4,5};
    int n=4;
    system.out.println("original array:");
    for(int i=0;i<arr.length;i++){
      system.out.println(arr[i]+" ");
    }
    for(int i=0;i<n;i++){
      int j,first;
      first=arr[0];
      for(int j=0;arr.length-1;j++){
        arr[j]=arr[j+1];
      }
      arr[j]=first;
    }
    system.out.println("arrary after left rotation:");
    for(int i=0;i<arr.length;i++){
      system.out.println(arr[i]+" ");
    }
  }
}
    
