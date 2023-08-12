package org.example;

import javafx.scene.shape.Path;

import javax.xml.transform.Source;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
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


//       /** Реализация через BufferdReader, стрим */
//
//       BufferedReader br = new BufferedReader(new FileReader(new File("/Програмирование/Test_file.txt")));
//       br.lines().forEach(System.out::println);

        /** Реализация через BufferdReader */


//        BufferedReader br = new BufferedReader(new FileInputStream("/Програмирование/Test_file.txt"));
//        try(FileInputStream fir = new FileInputStream("/Програмирование/Test_file.txt")){
//        ArrayList<Byte> resultInt = new ArrayList<>();
//        String fromFile ="";
//
//        while (fir.read() != -1){
//            resultInt.add((byte)(fir.read()));
//        }
//        byte [] bytesArray = new byte[resultInt.size()];
//            for (int i = 0; i < bytesArray.length-1; i++) {
//                bytesArray[i] = resultInt.get(i);
//                System.out.println(bytesArray[i]);
//            }


//            ByteBuffer b = ByteBuffer.allocate(resultInt.size());
//        String st = new String(bytesArray,StandardCharsets.UTF_8);
//            char c = (char) bytesArray[1];
//            System.out.println(c);

//            int a = 181;
//            byte bt = (byte) a;

//            System.out.println(string);
//            System.out.println(charResult);
//        ArrayList<Character> characters = resultInt.stream().map(m ->).collect(Collectors.toCollection(ArrayList::new));
//            System.out.println(resultInt);
//            System.out.println(st);

        /** Запись в файл байт кода */

//            try (FileOutputStream fos = new FileOutputStream(new File("/Програмирование/Test_file.txt"));
//            DataOutputStream dos = new DataOutputStream(fos)){
//
//
//
//                double testDouble = 156.15;
//                String testText = "Какая то фигня для текста";
//                int testInt = 894616;
//
//                dos.writeDouble(testDouble);
//                dos.writeChars(testText);
//                dos.writeInt(testInt);
//                System.out.println("Файл записан в бинарном варианте");
//
//
//            }


        Long aLong;
        String aString;
        Double aDouble;


        try (FileInputStream fis = new FileInputStream(new File("Result_test_binaryFile.bin"));
             DataInputStream ois = new DataInputStream(fis)) {

            aLong = ois.readLong();
            System.out.println(aLong);

            aDouble = ois.readDouble();
            System.out.println(aDouble);

            while (true) {
                aString = String.valueOf(ois.readChar());
                System.out.print(aString);
            }

        } catch (EOFException e) {
            // Оставляем пустым , что бы не отлавливал ошибку при когда чтение файла закончилось
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}


