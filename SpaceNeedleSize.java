import java.util.*;

public class SpaceNeedleSize {
    public static int SIZE;   
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print ("enter SIZE: ");
        SIZE = console.nextInt();
        System.out.println ();
        needle();
        upHalfDome();
        spacer();
        botHalfDome();
        needle();
        body();
        upHalfDome();
        spacer();
        console.close();
    }
    public static void needle() {
    	for (int i = 1; i <= SIZE; i++) {
    		for (int space = 1; space <= SIZE * 3; space++) {
    			System.out.print (" ");
    	    }
    	    System.out.println ("||");
    	}
    }
    public static void upHalfDome() {
    	for (int line = 1; line <= SIZE; line++) {
    		for (int space = 1; space <= SIZE-line; space++) {
    			System.out.print ("   ");
    	    }  
    	    System.out.print ("__/");
    	    for (int j = 1; j <= line - 1; j++) {
    	    	System.out.print (":::");
    	    }
    	    System.out.print("||");
    	    for (int j = 1; j <= line - 1; j++) {
    	        System.out.print (":::");
    	    }
    	    System.out.println ("\\__");
    	}
    }
    public static void spacer() {
    	System.out.print("|");
    	for (int i = 1; i <= SIZE; i++) {
    		System.out.print ("\"\"\"\"\"\"");
    	}
    	    System.out.println("|");
    }
    public static void botHalfDome(){
    	for (int line = 1; line <= SIZE; line++) {
    	    for (int space = 1; space <= (line * 2) - 2; space++) {
    	    	System.out.print (" ");
    	     }
    	     System.out.print ("\\_");
    	     for (int j = 1; j <= (((SIZE * 3) + 1) - (line * 2)); j++) {
    	        System.out.print ("/\\");
    	     }
    	     System.out.println ("_/");
    	}
    }
    public static void body() {
    	for (int line = 1; line <= SIZE * SIZE; line++) {
    		for (int space = 1; space <= SIZE + 3; space++) {
    			System.out.print (" ");
    		}
    		for (int space = 1; space <= SIZE - 2; space++) {
    			System.out.print (" ");
    		}
    		System.out.print ("|");
    		for (int space = 1; space <= SIZE - 2; space++) {
    			System.out.print ("%");
    		}
    		System.out.print ("|");
    		System.out.print ("|");
    		for (int space = 1; space <= SIZE - 2; space++) {
    			System.out.print ("%");
    		}
    		System.out.print ("|");
    		System.out.println ();
    	}
    }
}