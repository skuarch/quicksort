/**
 *
 * @author knfx094
 */
public class Main {
    
    public static void main(String[] args) {
        int array[] = {2,7,4,1,5,8,4,56,1,8,0,3,12,5,7,3,1,34,45,6,2,5,8,9,0,1,2,3,459,9,18,8,20,2,86,6,67,3,7,5,6};
        // int array[] = {19,2,7,18};
        
        System.out.println("");
        Quicksort quicksort = new Quicksort();
        quicksort.quicksort(array, 0, array.length);
        System.out.println("------------");
        for (int i : array) {
            System.out.print(" " + i);    
        }
        
        
    }
    
}
