import java.util.Scanner;

public class Champi {
	
	static boolean lectureClavier(String question , Scanner clavier){
		
		boolean reponse = false;
		System.out.print(question);
		
		if(!clavier.hasNext()){
			clavier.hasNextBoolean();
		 }
		while(!clavier.hasNextBoolean()){
			System.out.println(" Entree incorrecte Tapez True pour Oui et false pour non");
			System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
			clavier.next();
		}
		
		reponse  = clavier.nextBoolean();
		clavier.nextLine();
		return reponse;
	}
	public static void main(String [] args){
		String nameChampignons = "";
		Scanner clavier = new Scanner(System.in);
		boolean lamelle = false;
		boolean convexe = false;
		boolean anneau = false;
		boolean foret = false;
		
	System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
	System.out.println("Cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
	
	convexe = lectureClavier("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? " , clavier); //true
	anneau = lectureClavier("Est-ce que votre champignon a un anneau (true : oui, false : non) ? " , clavier); //true
	
	if(convexe && anneau){
		foret = lectureClavier("Est-ce que votre champignon vit en forêt (true : oui, false : non) ?", clavier);
		if(foret){
			nameChampignons = "Amanite tue-mouches";
		}else {
			nameChampignons = "Agaric jaunissant";
			}	
	}else if(convexe && !anneau){
		     nameChampignons = "Pied bleu";      
			
	 }else if(!convexe && anneau){
		        nameChampignons = "Coprin chevelu";
			
	  }else if(!convexe && !anneau){
		   lamelle = lectureClavier("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ", clavier);
		   if(lamelle){
		         nameChampignons = "Girolle ";
		    }
		   else {
			   nameChampignons = "Cèpe de Bordeaux";
			   
		   }
	  }
		
     System.out.print("==> Le champignon auquel vous pensez est ");
     System.out.print(nameChampignons);
    
 clavier.close();

  }
}
