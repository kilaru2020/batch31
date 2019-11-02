package tutorial.io;

import java.io.*;

public class ByteExample {
    public static void main(String[] args) {
        readContentFromFile();
    }
    // read a pdf file and write to a different file and open it.. do it using both fileread and fileinputstream.
    private static void readContentFromFile() {
        File file = new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/Area.java");
        File file2 = new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/Area2.txt");
        try(FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file2)){
            int c;
            while((c = fis.read()) != -1){
//                System.out.print((char)c);
                fos.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    private static void readContentFromFileWithBuffer() {
        File file = new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/Area.java");
        try(FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis) ){
            int c;
            while((c = bis.read()) != -1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
