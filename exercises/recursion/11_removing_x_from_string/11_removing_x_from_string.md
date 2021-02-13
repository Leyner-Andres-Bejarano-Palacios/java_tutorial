Given a string, compute recursively a new string where all 'x' chars have been removed.
noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

# solution

public static String removeX(String input){
	if(input.length()<=1)
{
	if(input.charAt(0)=='x')
	{
		return "";
	}
	else
		return input;
	}
if(input.charAt(0)=='x')
{
input=input.substring(1);
return removeX(input);
}
return input.charAt(0)+removeX(input.substring(1));
}






