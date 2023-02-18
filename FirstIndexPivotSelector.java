import java.util.Random;

/**
* Chooses the first index for pivot selection
*/
public class FirstIndexPivotSelector implements PivotSelector {

    /**
     * Returns first as the new pivotIndex.
     */
     public int choosePivotIndex(int[] array, int first, int last) {
         return first;       
     }

}