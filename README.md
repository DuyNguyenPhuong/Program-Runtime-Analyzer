# HW5 Experiments with Quicksort

## Overview

The Quicksort Experiments program uses 3 different Pivot choosing methods and keeps track of the running time on different types of array. 

The program can: 
- Generate differnet type of array: Random, Duplicate with levels, Sorted with level
- Use different Pivot choosing methods: First index, Random index, Medion of 3 Pivots index
- Print the running time of 3 methods 

## Usage
To use the CountrySorterLost program, run the following commands after downloading the code:
```
$ javac *.java
$ java Quicksort
```

The program will display the list of task then ask for the task user want:
```
[1]: Random; [2]: Duplicate; [3]: Sorted
[4]: All three
Enter task you want to do
```
For example, if you ask for task 1, it will print the result of the Random array

```
User task is: 1
Length of the array: 10000
RANDOM ARRAY:
First index: 0.66
Random index: 0.62
Median of 3 index: 0.54
```

## Note
There might me Stack Overflow if you choose task 3 or 4. (Explain in the MEMO)

## Rubric

Here we discuss how our project meets the rubric requirements of HW5

### Median of 3 pivot selector implemented correctly

Our program can get the index of median of 3 pivot selector implemented correctly. Here is a snippet of code:
```java
public int choosePivotIndex(int[] array, int first, int last) {
        int firstItem = array[first];
        int lastItem = array[last];
        int mid = (first+last)/2;
        int midItem = array[mid];
        if (firstItem >= Math.min(midItem, lastItem) && firstItem <= Math.max(midItem, lastItem))
        {
            return first;
        }

        else if (midItem >= Math.min(firstItem, lastItem) && midItem <= Math.max(firstItem, lastItem)) {
            return mid;
        }

        else {
            return last;
        }
    }

```

### Analyzed effect of length of array
I analyzed the effect of length of array in section I of MEMO

### Analyzed effect of initial ordering
I analyzed the effect of initial ordering of array in section III of MEMO

### Analyzed effect of duplicated items
I analyzed the effect of duplicated items in section II of MEMO

### Explains convincingly why evidence supports the claim
I explain why evidence suppports the claim in every parts 2 `Evidence` and 3 `Description & Conclusion` of section I, II, III. And explain the "nosiy data" in `Prompt` section at the end of the MEMO

### Memo makes a recommendation of which pivot approach to use
I make recommendation in every part 4 `Recommendation` of section I, II, III. And explain it in the `Prompt` section at the end of MEMO

### Evidence presented clearly
I make evidence from terminal and data charts in every part 2 `Evidence` of section I, II, III.

### Memo organized well
Yes, I believe my Memo is well-organized

### README complete
This is the end of my README. It's complete!
