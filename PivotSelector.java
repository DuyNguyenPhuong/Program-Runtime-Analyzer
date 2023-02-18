/**
* Interface for pivot selection methods for quicksort.
*/
public interface PivotSelector {
    /**
     * Returns a pivot index between the integers first and last (inclusive).
     * I.e., if first = 0 and last = 3, returns one of 0, 1, 2, or 3.
     */
     public int choosePivotIndex(int[] array, int first, int last);

}