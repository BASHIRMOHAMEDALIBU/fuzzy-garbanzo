import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class filereader {
    public static void main(String[] args) throws IOException {
        File read = new File("C:\\Users\\Bashir\\Desktop\\try\\test.txt");
        Scanner input = new Scanner(read);

        String filecontent = "";
        while(input.hasNextLine()){
                    filecontent = filecontent.concat(input.nextLine()+ "\n");
        }
        FileWriter file = new FileWriter("C:\\Users\\Bashir\\Desktop\\try\\newfile.txt");
        file.write(filecontent);
        file.close();

    }
}
