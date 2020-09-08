package lesson8;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
//        int[] mas = new int[5];
//        try {
//            System.out.println(mas[5]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Finally!");
//        }
//        System.out.println("After ArrayIndexOutOfBoundsException");

//        String s = "Hello";
//
//        try{
//            MyMethod(s);
//        }
//        catch (MyException e){
//            e.printStackTrace();
//        }

        File file = new File("1.txt");
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)){
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            fileOutputStream.write("Hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream(file)){
//            System.out.println((char)(fileInputStream.read()));
            int i = 0;
            String result = "";
            while((i = fileInputStream.read()) != -1){
//                System.out.println((char)i);
                result += (char)i;
            }
            System.out.println(result);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
//            bufferedWriter.write("Hello World \nHello Universe");
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            String s;
//            while((s = bufferedReader.readLine()) != null){
//                System.out.println(s);
//            }
//
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        try{
//            URL url = new URL("https://jsonplaceholder.typicode.com/users");
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            int responseCode = urlConnection.getResponseCode();
//            StringBuilder stringBuilder = new StringBuilder();
//            if(responseCode == HttpURLConnection.HTTP_OK){
//                InputStream inputStream = urlConnection.getInputStream();
//                int i = 0;
//                while ((i = inputStream.read()) != -1) {
//                    stringBuilder.append((char)i);
//                }
//
//                System.out.println(stringBuilder);
//
//            }
//
//
//        } catch (MalformedURLException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

//    private static void MyMethod(String s) throws MyException{
//        if(s.startsWith("H")){
//            throw  new MyException("I H8 letter H");
//        }
//    }
}
