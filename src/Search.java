public class Search {
    public void find(int[] arr,int element) throws ElementNotFoundException{
        int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]==element){
                System.out.println("The element " + arr[i] + " is found at "+ i);
                return;
            }
            }
        throw new ElementNotFoundException("Element is not found..");
        }
    }

