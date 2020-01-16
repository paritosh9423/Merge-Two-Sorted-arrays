class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int[] arr1={-1,2,6,7,99};
    int[] arr2={0,3,5,9,101};
    int n1 = arr1.length;
    int n2 = arr2.length;
    int i=0,j=0,k=0;
    int[] mergedArray= new int[n1+n2];

    while(i<n1 && j<n2){
      if(arr1[i]<arr2[j])
        mergedArray[k++] = arr1[i++];
      else
        mergedArray[k++] = arr2[j++];
    }

    while(i<n1){
      mergedArray[k++]=arr1[i++];
    }
    while(j<n2){
      mergedArray[k++]=arr2[j++];
    }
    for(int item:mergedArray)
    System.out.print(item+" ");

    


  }
}