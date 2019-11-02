package tutorial.io;

import java.io.*;

public class FileExample {
    static File file = new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/IOExample.txt");
    static File file2 = new File("/Users/jrout/Development/Github/batch31/CoreJava/src/tutorial/IOExample2.txt");

    public static void main(String[] args) {
        createANewFile();
        writeSomethingToTheFile();
        readContentFromFile();
    }

    private static void readContentFromFile() {
        FileReader reader = null;
        char[] content = new char[500];
        try {
            reader = new FileReader(file);
            int read = reader.read(content);

            System.out.println("Size read "+ read);

            for(char ch : content) {
                System.out.print(ch);
            }
        } catch (FileNotFoundException | ArithmeticException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeSomethingToTheFile() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Hello Guys good morning everyone \n . This is Java Class");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeSomethingToTheFileWithResource() {
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Hello Guys good morning everyone \n . This is Java Class");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createANewFile() {
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        if(!file.exists()) {
            try {
                boolean isFileCreated = file.createNewFile();
                System.out.println("File Created :"+ isFileCreated);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File is existing...");
        }


    }
}
