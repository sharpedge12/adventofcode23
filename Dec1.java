import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {



        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                String s = "";
                for(int i = 0 ; i < line.length() ; i++){
                    if(line.charAt(i) == '0' || line.charAt(i) == '1' ||  line.charAt(i) == '2' ||  line.charAt(i) == '3' ||  line.charAt(i) == '4' ||  line.charAt(i) == '5' ||  line.charAt(i) == '6' ||  line.charAt(i) == '7' ||  line.charAt(i) == '8' || line.charAt(i) == '9' ){
                        s += line.charAt(i);
                        break;
                    }
                }

                for(int i = line.length() - 1 ; i >= 0  ; i--){
                    if(line.charAt(i) == '0' || line.charAt(i) == '1' ||  line.charAt(i) == '2' ||  line.charAt(i) == '3' ||  line.charAt(i) == '4' ||  line.charAt(i) == '5' ||  line.charAt(i) == '6' ||  line.charAt(i) == '7' ||  line.charAt(i) == '8' || line.charAt(i) == '9' ){
                        s += line.charAt(i);
                        break;
                    }
                }

                writer.write(line + "\n");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
