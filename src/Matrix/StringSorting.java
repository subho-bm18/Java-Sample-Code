package Matrix;

public class StringSorting {
	
	char temp = ' ';
	
	
    public char[] stringSort(String s1)
    {
    	char chars[]=s1.toCharArray();
    	
    	for (int i=0; i<chars.length; i++)
    	{
    		for (int j=1; j<chars.length-i; j++)
    		{
    			if(chars[j-1]>chars[j])
    			{
    			temp = chars[j-1];
    			chars[j-1]=chars[j];
    			chars[j]=temp;
    			}
    			
    			
    		}
    	}
    	
    	return chars;
    }
    
    public static void main ( String args[])
    {
    	StringSorting ss = new StringSorting();
    	String s1 = "Java2Sforbeginners";
        char op[]=ss.stringSort(s1);
        
        for (int k=0; k<op.length;k++)
        {
        	System.out.println(op[k]);
        }
    	
    }
}
