class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char charDot= '.';
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == charDot){
                sb.append("[.]");
            }
            else{                
                sb.append(address.charAt(i));
            }
            
        }        
        return sb.toString();
    }
}