package pplcompiler;

import java.util.StringTokenizer;

class VPicture extends VElement
{
    private String url;
    private String alt;
    private String width;
    private String height;
    
    public VPicture(StringTokenizer st)
    {
        width = "0";
        height = "0";
        String temp;
        while(st.hasMoreTokens())
        {
            temp = st.nextToken();
            if(temp.contains("http"))
            {
                url = temp;
            }
            /**
             * This if block assumes an input format of Width = XXXX.
             * We first advance the token to the "=" then set the width
             * variable to the next token.
             */
            else if(temp.equals("Width"))
            {
                temp = st.nextToken();
                width = st.nextToken();
            }
            /**
             * This if block assume the same input format as used in width.
             */
            else if(temp.equals("Height"))
            {
                temp = st.nextToken();
                height = st.nextToken();
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
                alt = temp;
            }
        }
    }

    @Override
    public String toHTML() 
    {
        if(width.equals("0") && height.equals("0"))
        {
            return "<img src=\""+url+"\" alt=\""+alt+"\">";
        }
        else
        {
            return "<img src=\""+url+"\" alt=\""+alt+"\" "
                    + "width=\""+width+"\" height=\""+height+"\">";
        }
    }	
}

