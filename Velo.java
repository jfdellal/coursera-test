import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

          double result = fin - debut;
        
        if((debut >= 0) && (fin <=24 ) && (debut != fin) && (debut < fin)){
        	System.out.println( "Vous avez loué votre vélo pendant");
        	
   		if((debut >= 0 && fin <=7) || (debut >=17 && fin <=24)){
   			
   			System.out.println(fin -debut +" heure(s) au tarif horaire de 1.0 franc(s)");
               System.out.println("Le montant total à payer est de " +result+ " franc(s).");
   		}
   		
   		if(debut >= 7 && fin <=17){
   			System.out.println(fin -debut + " heure(s) au tarif horaire de 2.0 franc(s) ");
               System.out.println( "Le montant total à payer est de " +(2 *result) + " franc(s)." );
   		}
   		
   		/**cas de 0 H a 17 H **/
   		 if((debut >= 0 && debut < 7) && (fin > 7 && fin <=17)){
   			int resultat = 0;
   		    int total = 0;
   		    
   		 resultat =  7 - debut;
   				total = resultat;
   				System.out.println (resultat + " heure(s) au tarif horaire de 1.0 franc(s) ");
                  
   				resultat = fin -7;
   		        System.out.println(resultat + " heure(s) au tarif horaire de 2.0 franc(s) " );
                   System.out.println ( "Le montant total à payer est de " +(double)(2* resultat + total) +" franc(s).");
   		       
               
   		}
            /**cas de 7 H a 24 H **/
   		 if((debut >= 7 && debut < 17) && (fin > 17 && fin <= 24)){
   			int res = 0;
   		    int total = 0;
   		    
   		    res = fin -17;
   				total = res;
   				System.out.println(res + " heure(s) au tarif horaire de 1.0 franc(s) ");
                   res =  17 - debut;
   		        System.out.println(res + " heure(s) au tarif horaire de 2.0 franc(s)");
                   System.out.println("Le montant total à payer est de " +(double)(2* res + total) +" franc(s).");
   		}       
               
             /**cas de 0 H a 24 H **/
   		 if((debut >= 0 && debut < 7) && (fin > 17 && fin <= 24)){
   			int res = 0;
   		    int total = 0;
   		    
   		        res = 7 - debut;
   				total = res;
   				res =  fin - 17;
                   System.out.println(res+total + " heure(s) au tarif horaire de 1.0 franc(s)");
                   System.out.println(10  +" heure(s) au tarif horaire de 2.0 franc(s)");
                   System.out.println("Le montant total à payer est de " +(double)(res + total +20) +" franc(s)."); 
       }
     }		
     else if((debut < 0 ||  debut > 24) || (fin  > 24 || fin < 0)){
   		System.out.println( "Les heures doivent etre comprises entre 0 et 24 !");
   		
     }
       else if( debut  == fin ){
   		System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
       }
       
       else if(debut > fin) { 
   		System.out.println("Bizarre, le début de la location est après la fin ...");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
