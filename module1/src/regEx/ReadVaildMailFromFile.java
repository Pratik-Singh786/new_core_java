package regEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadVaildMailFromFile {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter("D:\\writeMail.txt");
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-z A-Z0-9 ]*@ [a-z A-Z0-9 ]+([.][a-zA-Z]+)+]");
        BufferedReader br = new BufferedReader(new FileReader("D:\\readMail.txt"));
        String line = br.readLine();
        while (line != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                out.println(m.group());

            }
            line = br.readLine();
        }
        System.out.println("success");
        out.flush();


    }
}
