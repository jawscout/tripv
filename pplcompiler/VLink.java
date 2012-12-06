package pplcompiler;

import java.util.StringTokenizer;

class VLink extends VElement
{
    private String url;
    private String text;
    
    public VLink(String[] st, int pos) 
    {
        /**
             * I assume that for all class variables, they are defined in the 
             * format Parameter = XXXXYYYY. Elements not in this format will 
             * throw an exception. 
             */
        while(pos <= st.length)
        {
            if(st[pos].equalsIgnoreCase("url"))
            {
                url = st[pos+2];
                pos += 2;
            }
            else if(st[pos].equalsIgnoreCase("alignment"))
            {
                alignment = st[pos+=2];
                pos += 2;
            }
            else if(st[pos].equalsIgnoreCase("color"))
            {
                color = st[pos+2];
                pos += 2;
            }
            else if(st[pos].equalsIgnoreCase("text"))
            {
                text = st[pos+2];
                pos += 2;
            }
            else
            {
                throw new SyntaxException("incorrect syntax: "+st[pos]);
                pos++;
            }
        }
    }

    @Override
    public String toHTML() 
    {
        return "<a href=\""+url+"\">\""+text+"\"</a> ";		
    }
	
	
}

