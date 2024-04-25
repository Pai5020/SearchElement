import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,element;
        int[] arr = new int[6];

        Search sh = new Search();

        try{
            System.out.println("Enter the elements : ");
            for(i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(i=0; i< arr.length; i++){
                for(j=i+1;j< arr.length;j++){
                    if(arr[i]==arr[j]){
                        throw new DuplicatesException("Duplicate elements not allowed..");
                    }
                }
            }
            System.out.println("Enter the element to be searched : ");
            element = sc.nextInt();
            sh.find(arr,element);
        }
        catch (DuplicatesException |ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}