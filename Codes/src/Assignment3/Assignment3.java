package Assignment3;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String dir="D:\\directory_test\\sample";
        File f=new File(dir);
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;

        try {
            boolean b=f.mkdirs();
            dir=dir+"\\MalihaTabassum_30124.txt";
            File f2=new File(dir);
            f2.createNewFile();
            System.out.println(f2.getCanonicalPath());


            FileWriter fw=new FileWriter(f2.getCanonicalPath());
            System.out.println("What do you want to write in the MalihaTabassum_30124 file?");

            String text=sc.nextLine();
            fw.write(text);
            fw.close();

            String newDir="D:\\directory_test\\sample\\output.txt";

            inputStream=new FileInputStream(f2.getCanonicalPath());
            outputStream=new FileOutputStream(newDir);
            int temp;
            while ((temp = inputStream.read())!= -1){
                outputStream.write((byte)temp);
            }

        }
        catch (IOException e){
            System.out.println("Couldn't properly Create Files");
        }
        finally {
            inputStream.close();
            outputStream.close();
        }



    }
}
