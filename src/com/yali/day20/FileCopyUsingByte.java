package com.yali.day20;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingByte {
    public static void main(String[] args) throws IOException{

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/resource/read.txt");
            out = new FileOutputStream("src/resource/write.txt");
            int c;
            
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File has written");
        } catch(Exception ex){
        	ex.printStackTrace();
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}