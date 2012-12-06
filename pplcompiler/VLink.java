package pplcompiler;

import java.util.StringTokenizer;

class VLink extends VElement
{
    private String url;
    private String text;
    
    public VLink(StringTokenizer st) 
    {
        String temp;
        while(st.hasMoreTokens())
        {
            temp = st.nextToken();
            if(temp.contains("http"))
            {
                url = temp;
            }
            /**
             * The next 2 if blocks assume that if alignment and color are 
             * specified then they are specified in the following syntax:
             * alignment/color = XXXX
             */
            else if(temp.contains("alignment"))
            {
                temp = st.nextToken();
                alignment = st.nextToken();
            }
            else if(temp.contains("color"))
            {
                temp = st.nextToken();
                color = st.nextToken();
            }
            else
            {
                text = temp;
            }
        }
    }

    @Override
    public String toHTML() 
    {
        return "<a href=\""+url+"\">\""+text+"\"</a> ";		
    }
	
	
}

