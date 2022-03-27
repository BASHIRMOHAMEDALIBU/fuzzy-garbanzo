import java.io.*;

public class Vocabulary {
    public static  void main(String[] args) {

       try{
           BufferedReader br = new BufferedReader(
                   new FileReader("C:\\Users\\Bashir\\OneDrive - Bartın Üniversitesi\\Masaüstü\\try\\output.txt"));
           String s;
           while( (s = br.readLine()) != null){
               System.out.println(s);
           }
           br.close();
       }catch(Exception Ex){
           return;

       }


//       try{
//           BufferedWriter My = new BufferedWriter(
//                   new FileWriter("C:\\Users\\Bashir\\Desktop\\test\\output.txt"));
//           My.write("Car\n");
//           My.write("Laptop\n");
//           My.write("House\n");
//           My.write("Phone\n");
//           My.write("Airphone\n");
//           My.close();
//
//
//       }catch(Exception Ex){
//           return;
//       }
    }
}
