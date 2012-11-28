/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pplcompiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author agodbey7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter fout = new BufferedWriter(new FileWriter("ouptut.html"));
        String titleIn = fin.readLine();
        fout.write("<html>");
        fout.newLine();
        fout.write("<head>");
        fout.newLine();
        fout.write("<title>" + titleIn + "</title");
        fout.newLine();
        fout.write("</head>");
        fout.newLine();
        fout.write("<body>");
        fout.newLine();
        String lineIn = fin.readLine();
        while(!lineIn.toLowerCase().equals("end")){
            StringTokenizer st = new StringTokenizer(lineIn);
            String firstWord = st.nextToken();
            if(firstWord.toLowerCase() == "make"){
                //make(fin, fout, st);
            }
            if(firstWord.toLowerCase() == "put"){
                //put(fin, fout, st);
            }
            if(firstWord.toLowerCase() == "")
            lineIn = fin.readLine();
        }
        fout.write("</body>");
        fout.newLine();
        fout.write("</html>");
        fin.close();
        fout.close();
    }

}
