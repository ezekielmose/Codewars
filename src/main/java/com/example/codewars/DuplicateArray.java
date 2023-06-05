package com.example.codewars;

//finding duplicates in an array
// numbs = [2, 1, 3, 5, 3, 2],
class Duplicates{
    static  int findDuplicates(int [] numbs){

        for (int i=0; i<numbs.length;i++)
        {
            for (int j=i+1; j<numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                    return numbs[i];
                }
            }
        }
        return 0;
    }
    public static void  main (String [] args)
    {
        System.out.println(findDuplicates(new int[]{5,7,7,7,8,2}));
    }

}