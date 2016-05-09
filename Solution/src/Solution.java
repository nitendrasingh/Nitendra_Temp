class Solution {
    public void solution(String S) {
        // write your code in Java SE 8
       S =  S.replaceAll("\\s+","");
       S =  S.replaceAll("-","");
       
       System.out.println(reformat(S));
       
       //return S = reformat(S);
    }
    
    public static void main(String s[]){
    	Solution sss = new Solution();
    	sss.solution("55555555");
    }
    
    public String processString(String s){
    	
    	String made_string = "";
        for(int i = 0 ; i < s.length() ; i++){
        	  if( i % 3 == 0 && i !=0 ){
                    	made_string = made_string + "-" + s.charAt(i);
                    }else {
                    	made_string = made_string + s.charAt(i);
                    }    
        }      
        
        return made_string;
    }
    
    public String reformat(String s){
        if(s.length() <= 2 ){
            return s;
        }else{
            if(s.length() % 3 == 1){
                if(s.length() == 4){
                    s = s.substring(0,2) + "-" + s.substring(2);
                }else{
                    s = processString(s.substring(0, s.length() - 4));    
                }
            }else{
                s = processString(s);
            }
            return s;
        }    
    }
    
}