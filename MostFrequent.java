class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int temp =0;
  		 boolean ok = false;
 		 do{
 			 ok = false; 
 		    for(int i = 0; i< taille-1; ++i){
 			
 			 if((tab1[i] > tab1[i +1] ) ){
 					   temp = tab1[i];
 					   tab1[i] = tab1[i +1];
 					   tab1[i+1] =temp;
 					 ok = true;	  
 			 }	   
 		}
 		}while(ok);		
 //******************************************Le plus fréquent élélément***************		 
 		
 		int valeur = 0; 
      int compteur  = 0;
  	int frequence = 0;
 		
  	 int i, j;
  		
 		 for ( i=0; i < taille; i++){

  	    compteur = 0 ;
  	    for (j = 0 ; j < taille; j++){
              if ( tab1 [i] == tab1 [j]) {
                   compteur = compteur + 1 ;
  	        }
  	       if ( (compteur >= frequence) ) {
                   frequence = compteur;
                  valeur = tab1 [i] ;
                  
                }
          }
  	   }	
      System.out.println("Le nombre le plus frequent dans le tableau est le :");
      System.out.println(valeur+  " ("+frequence+ " x)"); //1 (1 x)
       /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
