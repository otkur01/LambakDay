package com.Stram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatStream {
    public static void main(String[] args) {

            //creating strean from array
        String[] courses = {"java", "spring", "agile"};
        Stream<String> coresesStream = Arrays.stream(courses);

         //creating stream from collection
        List<String>corseList = Arrays.asList("java", "spring", "agile");
        Stream<String>courseListStream = corseList.stream();

        List<Course>myCourse = Arrays.asList( new Course("java",100), new Course("DS",200),new Course("MS",300) );
        Stream<Course>myCourseStream = myCourse.stream();

        //creating stream values

        Stream<Integer>stream = Stream.of(1,2,3,4,5);

        
    }
}
