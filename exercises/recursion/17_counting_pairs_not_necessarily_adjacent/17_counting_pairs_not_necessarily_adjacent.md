
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9


# version 1

public int strDist(String str, String sub) { 

  if(str.length() < sub.length())
    return 0;

  if(!str.contains(sub))return 0;

  if(str.startsWith(sub)&& str.endsWith(sub))
    return str.length();

  if(str.startsWith(sub) )
    return  strDist(str.substring(0,str.length()-1),sub);

  if(str.endsWith(sub)) 
    return strDist(str.substring(1,str.length()),sub);

  else return strDist(str.substring(1,str.length()-1),sub);
}


# version 2

class Example {

    private static int indexOf(String str, int idx, String sub, int res) {

        if (str.length() < sub.length()) return res;

        int tmp = str.indexOf(sub, idx);

        if (tmp < 0) return res;

        return Math.max(tmp, indexOf(str, tmp + 1, sub, res));

    }

    public static int strDist(String str, String sub) {

        if (str.length() < sub.length()) return 0;


        int from = str.indexOf(sub);
        int to = indexOf(str, from + 1, sub, from);


        return to - from + sub.length();
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
        System.out.println(strDist("hiHellohihihi", "hih"));
    }
}
