package pplcompiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* To show how to use git, add your name to the authors.
* This is a test.
* @author Jake Wilkinson
* @author Andrew Godbey
* @author Andrew Davis
* @author SATAN!!! , and secretary (Sam)
* @author Tom Binner
* @author London Jepson
*/

public class Main {

    /**
* @param args the command line arguments
*/
    public static void main(String[] args) throws IOException, Exception{
        BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter fout = new BufferedWriter(new FileWriter("ouptut.html"));
        String titleIn = fin.readLine(); // first line is title
        fout.write("<html>");
        fout.newLine();
        fout.write("<head>");
        fout.newLine();
        fout.write("<title>" + titleIn + "</title>");
        fout.newLine();
        fout.write("</head>");
        fout.newLine();
        fout.write("<body>");
        fout.newLine();
        String lineIn = fin.readLine();
        List<VElement> leftTop = new ArrayList<VElement>();
        List<VElement> leftMiddle = new ArrayList<VElement>();
        List<VElement> leftBottom = new ArrayList<VElement>();
        List<VElement> centerTop = new ArrayList<VElement>();
        List<VElement> centerMiddle = new ArrayList<VElement>();
        List<VElement> centerBottom = new ArrayList<VElement>();
        List<VElement> rightTop = new ArrayList<VElement>();
        List<VElement> rightMiddle = new ArrayList<VElement>();
        List<VElement> rightBottom = new ArrayList<VElement>();
        String firstWord = null;
        String[] st = null;
        while(!lineIn.toLowerCase().equals("end")){
            try{
                List<String> matchList = new ArrayList<String>();
                Pattern regex = Pattern.compile("[^\\s\"']+|\"[^\"]*\"|'[^']*'");
                Matcher regexMatcher = regex.matcher(lineIn);
                while (regexMatcher.find()) {
                    matchList.add(regexMatcher.group());
                }
                st = matchList.toArray(new String[matchList.size()]);
            //st = lineIn.split(" "/*"[^\\s\"']+|\"([^\"]*)\"|'([^']*)'"*/);
            firstWord = st[0];
            }
            catch(Exception e){
                System.out.println("Error on first read. Make sure your input file is not empty");
                e.printStackTrace();
            }
            if(firstWord.toLowerCase().equals("make")){
                String secondWord = st[1];
                try{
                    if(secondWord.toLowerCase().equals("list")){
                        VList vList = new VList(st, 2);
                        if(vList.alignment.equals("left top")){
                            leftTop.add(vList);
                        }
                        else if(vList.alignment.equals("left middle")){
                            leftMiddle.add(vList);
                        }
                        else if(vList.alignment.equals("left bottom")){
                            leftBottom.add(vList);
                        }
                        else if(vList.alignment.equals("center top")){
                            centerTop.add(vList);
                        }
                        else if(vList.alignment.equals("center middle")){
                            centerMiddle.add(vList);
                        }
                        else if(vList.alignment.equals("center bottom")){
                            centerBottom.add(vList);
                        }
                        else if(vList.alignment.equals("right top")){
                            rightTop.add(vList);
                        }
                        else if(vList.alignment.equals("right middle")){
                            rightMiddle.add(vList);
                        }
                        else if(vList.alignment.equals("right bottom")){
                            rightBottom.add(vList);
                        }
                    }
                    else if(secondWord.toLowerCase().equals("textfield"))
                    {
                        VTextField vTextfield = new VTextField(st, 2);
                        if(vTextfield.alignment.equals("left top")){
                            leftTop.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("left middle")){
                            leftMiddle.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("left bottom")){
                            leftBottom.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("center top")){
                            centerTop.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("center middle")){
                            centerMiddle.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("center bottom")){
                            centerBottom.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("right top")){
                            rightTop.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("right middle")){
                            rightMiddle.add(vTextfield);
                        }
                        else if(vTextfield.alignment.equals("right bottom")){
                            rightBottom.add(vTextfield);
                        }
                    }
                    else if(secondWord.toLowerCase().equals("table")){
                        VTable vTable = new VTable(st, 2);
                        if(vTable.alignment.equals("left top")){
                            leftTop.add(vTable);
                        }
                        else if(vTable.alignment.equals("left middle")){
                            leftMiddle.add(vTable);
                        }
                        else if(vTable.alignment.equals("left bottom")){
                            leftBottom.add(vTable);
                        }
                        else if(vTable.alignment.equals("center top")){
                            centerTop.add(vTable);
                        }
                        else if(vTable.alignment.equals("center middle")){
                            centerMiddle.add(vTable);
                        }
                        else if(vTable.alignment.equals("center bottom")){
                            centerBottom.add(vTable);
                        }
                        else if(vTable.alignment.equals("right top")){
                            rightTop.add(vTable);
                        }
                        else if(vTable.alignment.equals("right middle")){
                            rightMiddle.add(vTable);
                        }
                        else if(vTable.alignment.equals("right bottom")){
                            rightBottom.add(vTable);
                        }
                    }
                    else if(secondWord.toLowerCase().equals("picture")){
                        VPicture vPicture = new VPicture(st, 2);
                        if(vPicture.alignment.equals("left top")){
                            leftTop.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("left middle")){
                            leftMiddle.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("left bottom")){
                            leftBottom.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("center top")){
                            centerTop.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("center middle")){
                            centerMiddle.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("center bottom")){
                            centerBottom.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("right top")){
                            rightTop.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("right middle")){
                            rightMiddle.add(vPicture);
                        }
                        else if(vPicture.alignment.equals("right bottom")){
                            rightBottom.add(vPicture);
                        }
                    }
                    else if(secondWord.toLowerCase().equals("link")){
                        VLink vLink = new VLink(st, 2);
                        if(vLink.alignment.equals("left top")){
                            leftTop.add(vLink);
                        }
                        else if(vLink.alignment.equals("left middle")){
                            leftMiddle.add(vLink);
                        }
                        else if(vLink.alignment.equals("left bottom")){
                            leftBottom.add(vLink);
                        }
                        else if(vLink.alignment.equals("center top")){
                            centerTop.add(vLink);
                        }
                        else if(vLink.alignment.equals("center middle")){
                            centerMiddle.add(vLink);
                        }
                        else if(vLink.alignment.equals("center bottom")){
                            centerBottom.add(vLink);
                        }
                        else if(vLink.alignment.equals("right top")){
                            rightTop.add(vLink);
                        }
                        else if(vLink.alignment.equals("right middle")){
                            rightMiddle.add(vLink);
                        }
                        else if(vLink.alignment.equals("right bottom")){
                            rightBottom.add(vLink);
                        }
                    }
                else{
                    throw new SyntaxException("Syntax Exception on Second Word");
                }
            }
            catch(SyntaxException se){
                System.out.println("Syntax Exception.");
                se.printStackTrace();
            }
            }
            lineIn = fin.readLine();
        }
        fout.write("<div width=\"33%\">");
        for(VElement element: leftTop){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: leftMiddle){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: leftBottom){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\">");
        for(VElement element: centerTop){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: centerMiddle){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: centerBottom){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\">");
        for(VElement element: rightTop){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: rightMiddle){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div width=\"33%\" style=\"float:left;\">");
        for(VElement element: rightBottom){
            fout.write(element.toHTML());
            fout.newLine();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("</body>");
        fout.newLine();
        fout.write("</html>");
        fin.close();
        fout.close();
    }

}

