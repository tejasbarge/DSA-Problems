class Solution {
    public String capitalizeTitle(String title) {
        String str[]=title.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()<=2){
                str[i]=str[i].toLowerCase();
            }
            else{
                char first=Character.toUpperCase(str[i].charAt(0));
                String last=str[i].substring(1).toLowerCase();
                str[i]=first+last; 
            }
        } 
        return String.join(" ",str);  
    }
}