/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pplcompiler;

/**
 *
 * @author agodbey7
 */
public class SyntaxException extends Exception{
    String reason = null;
    SyntaxException() {
        reason = "No reason given";
    }
    SyntaxException(String string) {
        reason = string;
    }

    @Override
    public void printStackTrace(){
        System.out.println("Syntax Exception Reason: " + reason);
        printStackTrace();
    }
}
