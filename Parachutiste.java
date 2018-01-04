import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        
        double v = v0; // Pour la vitesse
        double h = h0; // Pour l'altitude
        double accel = g;
        double t = t0;
        double q;
        double surface = 2.0;
        boolean ok1 = false;
        boolean ok2 = false;
        boolean ok3 = false;
        
       System.out.printf("%.0f, %.4f, %.4f, %.5f\n",t, h, v, accel);
        
        while(h > 0){
        	 t++;
        	double s = surface/masse; // Surface du parachutiste
            q = Math.exp(-s * (t - t0));
            v = (g / s) * (1 - q) + v0 * q;
            h = h0 - (g / s) * (t - t0) - (v0 - (g / s)) / s * (1 - q);
            accel = g - s * v;
            
           if((v > 343) && (ok1 == false)){
        		System.out.printf("## Felix depasse la vitesse du son\n");
        	     ok1 = true;
        	}
        	
        	 if((accel < 0.5) && (ok2 == false)){
        		
        		System.out.printf("## Felix a atteint sa vitesse maximale\n");
        	   ok2 = true;
        	}
        	if(h > 0){
        	   if((h <= 2500) && (ok3 == false)){
             	surface = 25.0;
         		t0=  t;
         		v0=  v;
         		h0=  h;
         		System.out.printf("## Felix ouvre son parachute \n");
            	   ok3 = true; 
              }
        	  
        	   System.out.printf("%.0f, %.4f, %.4f, %.5f\n",t, h, v, accel);
        	}
        }
        
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
