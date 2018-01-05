import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int  pos1,pos2;
        for(int i = 0; i< s.length(); ++i){
       	    pos1 =  ALPHABET.indexOf((s.charAt(i)));
       	    if(pos1 >= 0){
       		   aCoder = aCoder +s.charAt(i);
       	      }
       	 
		     if(s.charAt(i) == ' '){
	  		    	
	  		    	aCoder = aCoder +' '; 
	  		      }
        }
        for(int i = 0; i< aCoder.length(); ++i){
       	    pos1 =  ALPHABET.indexOf((aCoder.charAt(i)));
       	    if(pos1 >= 0){
  			   pos2 = pos1 + DECALAGE;
    		   if(pos2  < 26){
    			   chaineCodee  = chaineCodee+ ALPHABET.charAt(pos2);
    		    }
    		    else{
                   pos2 = 4 - (26 - pos1 );
                   chaineCodee  = chaineCodee+ ALPHABET.charAt(pos2);
    	          }
    	     }
 		     else{
 		    	chaineCodee  = chaineCodee+ aCoder.charAt(i);
    	     }
       }	     
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
