import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
    	//S'assurer que la matrice contient que des 1 ou 0
    	for(int i =0; i< carte.length; ++i){
    		for(int j =0; j< carte[0].length; ++j){
    			if(carte[i][j] != 0 && carte[i][j] != 1 ){
    			   System.out.println("Votre carte du terrain n'a pas le bon format :");
    		       System.out.println("valeur '"+carte[i][j]+"' trouvée en position ["+i+"]["+j+"]");
    			   return;
    			}
    		}
    	}
    	
    	
    	//Recupérer l'indice du premier 1 rencontré
    	int indicePremierUn = 0;
    	int indiceDernierUn = 0;
    	ArrayList<Integer>  tabIndicePremierUn = new ArrayList<Integer>();
    	ArrayList<Integer>  tabIndiceDernierUn = new ArrayList<Integer>();
    	 
    	
    	 for(int i =0; i< carte.length; ++i){
    		for(int j =0; j< carte[0].length; ++j){
    			if( carte[i][j]  == 1){
    			    indicePremierUn = j;
    			    break;
    			}
    		}
    		tabIndicePremierUn.add(i, indicePremierUn);
    		//System.out.println(" premier ="+tabIndicePremierUn.get(i));
    	 }	
    		
    	//Recupérer l'indice du dernier 1 rencontré
    	 for(int i =0; i< carte.length; ++i){
    			for(int j = carte[i].length-1 ; j>=0 ; --j){
    				if( carte[i][j]  == 1){
    					indiceDernierUn = j;
    				    break;
    				}
    			}
    			tabIndiceDernierUn.add(i, indiceDernierUn); 
    	 }	
    	
    	 //Remplacer les etangs(Zéro du milieu )par des 1
    	for(int i = 0; i < carte.length ; ++i){
    		if(tabIndicePremierUn.get(i) < tabIndiceDernierUn.get(i)){
    		   for(int j = tabIndicePremierUn.get(i)+1 ; j <= tabIndiceDernierUn.get(i)-1; ++j){
    			  if(carte[i][j] == 0){
    				 carte[i][j] = 1;
    			 }
    	      }
    	  }
    }
    	
    		
    	/*******************************************Calcul de la cloture**************************************
    	 *********************** 1)-- Calcul de la cloture du bord superieur**********************************/
    	 int countBordSup= 0;
    	 //int countBordInf= 0;
    	 
    	 for(int j = 0; j < carte[0].length; ++j){
    		 if(carte[0][j] == 1){
    			 countBordSup++;
    			
    		}
    	}
    	 
    	//  Calcul de la cloture du bord inférieur
    	 for(int j = 0; j < carte[carte.length-1].length; ++j){
    		 if(carte[carte.length-1][j] == 1){
    			 countBordSup++;
    		 }
    	}  
    	
    	
    	/*********************** 1)-- Calcul de la cloture des coté externe gauche**********************************/
    	 double  bordure = 0.0;
    	 for(int i = 0 ; i < carte.length ; ++i){     //it's ok
    		if(carte[i][0] == 1){
    			countBordSup++;
    		}
    	}
    	
    	
    	 /*********************** 1)-- Calcul de la cloture des coté externes droit**********************************/
    	 for(int i = 0 ; i < carte.length ; ++i){
    		if(carte[i][carte[0].length-1] == 1){ //carte[carte.length-1][j]
    			countBordSup++;
    		}
    		 
       }
     /*********************** 1)-- Calcul de la cloture des coté verticaux internes | 1 |**********************************/
    	
    	 for(int i = 0 ; i < carte.length  ; ++i){
    			for(int j = 0 ; j< carte[0].length -1 ; ++j){
    				if(carte[i][j] == 0 && carte[i][j+1] == 1){
    					countBordSup++;
    				}
    				if(carte[i][j] == 1 && carte[i][j+1] == 0){
    					countBordSup++;
    				}
    			}
    	}
    	/*********************** 1)-- Calcul de la cloture des coté horizontaux internes 1********************************/
    		                                                                               // _	
    		 for(int i = 0 ; i < carte.length-1  ; ++i){ 
    				for(int j = 0 ; j< carte[0].length  ; ++j){
    					if(carte[i][j] == 0 && carte[i+1][j] == 1){
    						countBordSup++;
    					}
    					if(carte[i][j] == 1 && carte[i+1][j] == 0){
    						countBordSup++;
    						
    					}
    				}
    		 }
    		bordure =  countBordSup * 2.5;
    		System.out.print("Il vous faut " +bordure);
          	System.out.println(" mètres de clôture pour votre terrain.");
    	  
    	
    	
    	

  //****************************Affichage de Matrice****************
        	
        /*System.out.println("Votre mmmcarte du terrain n'a pas le bon format :");
        System.out.print("bord extérieur entrant trouvé en position [");
        System.out.print("][");
        System.out.println("]");*/

       

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
