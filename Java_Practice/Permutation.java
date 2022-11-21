public class Permutation{


    public static void Logic(String str, String perm){

        if(str.length() == ){
            System.out.println(perm);
            return;
        }

    //    if(str.length() == 0){
    //     System.out.println(perm); 
    
    //     return;
    //    }

        for(int i=0;i<str.length();i++){
            
            String current = str.charAt(i)+"";
            String newStr = str.substring(0, i) + str.substring(i+1);
            Logic(newStr, perm+current);
        }
        System.out.println();
        System.out.println("down"+perm);
    
    }

    public static void main(String[] args) {
        
        Logic("ABC", "");
    
        
    }


}