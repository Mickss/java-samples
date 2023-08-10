package org.micks.javasamples.lists;

import org.micks.javasamples.samples.SamplesRunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListsSamples implements SamplesRunnable {

    @Override
    public void run() {

        String[] array = {"a", "b", "c", "d", "e"};
        System.out.println("Array before conversion: " + Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println("Array as List: " + list);

        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, array);
        System.out.println("Array as List1: " +list1);

        List<String> list2 = new ArrayList<String>(Arrays.asList(array));
        System.out.println("Array as List2: " +list2);

        ArrayList<String> list01 = new ArrayList<String>();
        list01.add("Apple");
        list01.add("Orange");
        list01.add("Banana");

        System.out.println("Contents of list :" + list01);
        String[] myArray = new String[list01.size()];
        list01.toArray(myArray);

        for(int i=0; i<myArray.length; i++){
            System.out.println("Element at the index "+i+" is :"+myArray[i]);
        }
    }
}
