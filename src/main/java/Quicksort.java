
/**
 *
 * @author knfx094
 */
public class Quicksort {

    public int[] quicksort(int[] array, int start, int finish) {

        for (int i : array) {
            System.out.print(i + " ");    
        }
        System.out.println("");
        
        int pivot = array[start];
        int right = finish - 1;
        int left = start;
        int aux;
        int pointer;
        System.out.println("pivot " + pivot);

        while (right != left) {

            System.out.println(array[right] + " > " + pivot + " compare right, right " + right);
            while (array[right] > pivot) {
                right--;
                System.out.println(array[right] + " > " + pivot + " compare right, right " + right);
            }

            if (right != left) {
                aux = array[left];
                array[left] = array[right];
                array[right] = aux;
                left++;
            }

            System.out.println(array[left] + " < " + pivot + " compare left,  left " + left);
            while (array[left] < pivot) {
                left++;
                System.out.println(array[left] + " < " + pivot + " compare  left, left " + left);
            }

            if (left != right) {
                aux = array[right];
                array[right] = array[left];
                array[left] = aux;
                right--;
            }

            if (left == right) {
                pointer = left;
                System.out.println("same pointers, left " + left + " right " + right);
                /*if (left == 0 && right == 0 || left == finish -1 && right == finish -1) {
                    break;
                }*/
                array[left] = pivot;
                quicksort(array, start +1, array.length);
                // quicksort(array, pointer, array.length);
            }
        }

        return array;

    }

    private void swap(int array[], int left, int right) {
    }

}
