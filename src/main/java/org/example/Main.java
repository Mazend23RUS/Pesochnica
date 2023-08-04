package org.example;

import javax.xml.transform.Source;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

//        LinkedListService linkedListService = new LinkedListService();
//
//        String[] arrayOfAzs = new String []{"One","Two","Three","One", "One", "Five"};
////
//        System.out.println("Создали массив , положили туда значения - "+Arrays.toString(arrayOfAzs));
//
//        List<Integer> arrayHashcode = Arrays.stream(arrayOfAzs).map( a -> a.hashCode()).collect(Collectors.toList());
//        System.out.println("Из стрима получаем HashCode - "+arrayHashcode);
//
//        HashMap<String[], Integer> resilt = new HashMap<>();
//
//        resilt.put(arrayOfAzs,arrayOfAzs.length);
//
//        System.out.println(resilt.keySet());


//        linkedListService.addNode("1");
//        linkedListService.addNode("2");
//        linkedListService.addNode("3");
//        linkedListService.addNode("4");
//
//        linkedListService.printAllNodes();

        /** Задание от руководителя. Создание файла с внесением в него данных*/
//        System.out.println("Введите текст который будет сохранен в файл");
//
//        Scanner scanner = new Scanner(System.in);
//        String textFromUser = scanner.nextLine();
//
//
//        File testFile = new File("/Програмирование/Test_file.txt");
//
//        if(!testFile.exists()){
//            testFile.createNewFile();
//        }
//
//
//        FileWriter fileWriter = new FileWriter(testFile);
//        fileWriter.write(textFromUser);
//        System.out.println("Файл создан");
//        fileWriter.close();

        /** Реализация чтения через Scanner */


//        Scanner scFromFile = new Scanner(new File("/Програмирование/Test_file.txt"));
//        String result="";
//        while (scFromFile.hasNextLine()){
//            result = result + scFromFile.nextLine() + '\n';
//        }
//        System.out.println(result);


       /** Реализация через BufferdReader */

       BufferedReader br = new BufferedReader(new FileReader(new File("/Програмирование/Test_file.txt")));
       br.lines().forEach(System.out::println);





    }


}