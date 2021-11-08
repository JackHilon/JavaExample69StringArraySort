package javaexample69stringarraysort;

import java.util.Arrays;

public class JavaExample69StringArraySort {

    public static void main(String[] args) {

        Integer[] vec1 = new Integer[]{1, 6, 2, 7, 9, 4, 11, 3};
        String[] vec2 = new String[]{"SSS", "EEE", "BBB", "TTT", "AAA", "HHH", "CCC"};
        StringBuilder[] vec3 = new StringBuilder[]{new StringBuilder("R"),
            new StringBuilder("F"), new StringBuilder("C"), new StringBuilder("U"),
            new StringBuilder("B"), new StringBuilder("J"), new StringBuilder("G")};

        System.out.print("First array: ");
        PrintArray(vec1);
        System.out.print("Second array: ");
        PrintArray(vec2);
        System.out.print("Third array: ");
        PrintArray(vec3);

        System.out.println();
        System.out.println();

        Arrays.sort(vec1);
        Arrays.sort(vec2);

        System.out.println("After sorting....");
        System.out.print("First array: ");
        PrintArray(vec1);
        System.out.print("Second array: ");
        PrintArray(vec2);

        System.out.println("-------------------------------------------------");
        try {
            Arrays.sort(vec3);
            System.out.print("Third array: ");
            PrintArray(vec3);
        } catch (Exception e) {
            System.out.println(e.toString()+'\n'+ e.getMessage());
        }                
        System.out.println("-------------------------------------------------");

        System.out.println();
        String[] vec4=ConvertStringBuilderArray2StringArray(vec3);
        Arrays.sort(vec4);
        System.out.print("Converted third array after sorting: ");
        PrintArray(vec4);

    }

    private static String[] ConvertStringBuilderArray2StringArray(StringBuilder[] sb)
    {
        if (sb==null || sb.length==0) {
            return null;
        }
        String[] res= new String[sb.length];
        for (int i = 0; i < res.length; i++) {
            res[i]=ConvertStringBuilder2String(sb[i]);
        }
        return res;
    }
    
    private static String ConvertStringBuilder2String(StringBuilder sb)
    {
        if (sb==null || sb.length()==0) {
            return null;
        }
        return sb.toString();
    }
    
    private static void PrintArray(Object[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
