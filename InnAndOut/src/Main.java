import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static String counter = "-";

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        File dir = new File(path);

        File outFile = new File("out.txt");


        if (!dir.exists()) {
            System.out.println("Папки или файла с введеным именем не существует");


        } else if (!dir.isDirectory()) {

            //выводим данные в консоль из файла (дописать!!!)
            int dirCount = 0;
            int fileCount = 0;
            BufferedReader reader = new BufferedReader(new FileReader(dir));
            List list = new ArrayList<String>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (str.contains("/")) {
                    dirCount++;
                } else if (str.equals("")) {
                    continue;
                } else {
                    fileCount++;
                }
            }
            System.out.println("Количество папок: " + dirCount);
            System.out.println("Количество файлов: " + fileCount);

        } else {
            printAllFilesFromDirectory(dir, outFile);
        }
    }

    static void printAllFilesFromDirectory(File dir, File outFile) throws FileNotFoundException {
        try (PrintStream stream = new PrintStream(new FileOutputStream(outFile, true))) {
            for (File file : dir.listFiles()) {
                stream.print("\n" + counter + " " + file.getName());
                ;
                if (file.isDirectory()) {
                    stream.print("/");
                    counter += "-";
                    printAllFilesFromDirectory(file, outFile);
                }

            }
            StringBuilder stringBuilder = new StringBuilder(counter);
            stringBuilder.deleteCharAt(0);
            counter = stringBuilder.toString();
        }
    }
}






