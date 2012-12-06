package pplcompiler;

import java.util.StringTokenizer;

class VPicture extends VElement
{
    private String url;
    private String alt;
    private String width;
    private String height;
    
    /**
     * It is assumed that all inputs from the text file are in the format 
     * "Paramter = XXXXYYYY" any other format will throw an exception.
     */
    public VPicture(String[] st, int pos)
    {
        width = "0";
        height = "0";
        while(pos <= st.length)
        {
            if(st[pos].equalsIgnoreCase("url"))
            {
                url = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("Width"))
            {
                width = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("Height"))
            {
                height = st[pos+2];
                pos+=3;
            }
            else if(st[pos].equalsIgnoreCase("alignment"))
            {
                alignment = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("color"))
            {
                color = st[pos+2];
                pos += 3;
            }
            else if(st[pos].equalsIgnoreCase("alt"))
            {
                alt = st[pos+2];
                pos += 3;
            }
            else
            {
                throws new Exception();
                pos++;
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

