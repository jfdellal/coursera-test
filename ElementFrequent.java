
public class ElementFrequent {
	
	 public static void main(String[] args) {
	        int[] t = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
	       // int taille = t.length;
	        int valeur = 0;
	       
    int frequence, i, j, compteur ;
	frequence = 0;
	
	for (i=0; i < t.length; i++){

	    compteur = 0 ;
	    for (j = 0 ; j < t.length; j++){

	         if ( t [i] == t [j]) {

	            compteur = compteur + 1 ;
	        }
	        
	    if  (compteur > frequence) {

	        frequence = compteur ;
	        valeur = t [i] ;
         }

	 }
 }	
	    System.out.println("Element le plus frequent : "+valeur+" apparait "+frequence+ " fois");
		  
	
  }
}
