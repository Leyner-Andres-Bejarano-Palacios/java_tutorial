Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0

# solution 

public int strCount(String str, String sub) {
  int strlen = str.length();
  int sublen = sub.length();
  if (strlen < sublen) return 0;
  if (str.substring(0,sublen).equals(sub))
    return 1 + strCount(str.substring(sublen), sub);
  else 
    return strCount(str.substring(1), sub);
}