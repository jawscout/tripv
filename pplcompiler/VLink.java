package pplcompiler;

import java.util.StringTokenizer;

class VLink extends VElement
{
    private String url;
    private String text;

    public VLink(String[] st, int pos) throws SyntaxException
    {
        /**
* I assume that for all class variables, they are defined in the
* format Parameter = XXXXYYYY. Elements not in this format will
* throw an exception.
*/
        while(pos <= st.length-2)
        {
            if(st[pos].equalsIgnoreCase("url"))
            {
                url = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("alignment"))
            {
                alignment = st[pos+2].substring(1, st[pos+2].length()-1);
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("color"))
            {
                color = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("text"))
            {
                text = st[pos+2];
                pos += 3;
            }
            else
            {
                throw new SyntaxException("incorrect syntax: "+st[pos]);
            }
        }
    }

    @Override
    public String toHTML()
    {
        return "<a href=\""+url+"\">\""+text+"\"</a> ";
    }


}