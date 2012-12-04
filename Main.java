package pplcompiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception{
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
        List<VElement> leftTop = new ArrayList();
        List<VElement> leftMiddle = new ArrayList();
        List<VElement> leftBottom = new ArrayList();
        List<VElement> centerTop = new ArrayList();
        List<VElement> centerMiddle = new ArrayList();
        List<VElement> centerBottom = new ArrayList();
        List<VElement> rightTop = new ArrayList();
        List<VElement> rightMiddle = new ArrayList();
        List<VElement> rightBottom = new ArrayList();
        while(!lineIn.toLowerCase().equals("end")){
            StringTokenizer st = new StringTokenizer(lineIn);
            String firstWord = st.nextToken();
            if(firstWord.toLowerCase().equals("make")){
                String secondWord = st.nextToken();
                if(secondWord.toLowerCase().equals("list")){
                    VList vList = new VList(st);
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
                    VTextfield vTextfield = new VTextfield(st);
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
                    VTable vTable = new VTable(st);
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
                    VPicture vPicture = new VPicture(st);
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
                    VLink vLink = new VLink(st);
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
                    throw new Exception("Syntax Exception on Second Word");
                }
            }
            else{
                throw new Exception("Syntax Error.");
            }
            lineIn = fin.readLine();
        }
        fout.write("<div>");
        for(VElement element: leftTop){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: leftMiddle){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: leftBottom){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: centerTop){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: centerMiddle){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: centerBottom){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: rightTop){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: rightMiddle){
            element.toHTML();
        }
        fout.write("</div>");
        fout.newLine();
        fout.write("<div>");
        for(VElement element: rightBottom){
            element.toHTML();
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
