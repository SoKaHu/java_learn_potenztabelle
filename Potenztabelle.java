package blatt2;
public class Potenztabelle extends MiniJava {
	public static void main (String args []) {
		int x, z, a, b, g ; //Eingabe, Hilfsvariablen
		
		//Eingabe
		write("Bitte geben Sie eine Zahl größer 0 ein:");
		x = read ();
		
		//ungültige Eingabe
		while (x<=0)
		{
			write("Ungültige Eingabe! Bitte geben Sie eine Zahl größer 0 ein.");
			x = read ();
		}
		
		//x>1
		if (x>1) {
			
			//Ausgabe erste Zeile
			writeConsole ("\\begin{tabular}{");
			for (g=1; g<=x; g++) {
				writeConsole ("l");
			}
			writeConsole ("}");
		
		
			//Ausgabe Block in der Mitte
		
			b= 0;
			for (z=1 ; z<=x ; z++ ) {
				writeConsole ("\n 1 & " + z );
					b=z;
					for (a=1; a<=x-2; a++ ) {
						b = b*z;
						writeConsole ( " & " + b );
				
					}	
					writeConsole ("\\\\");
			}	
		
		
		//Ausgabe letzte Zeile
		writeConsole("\n\\end{tabular}");
		
		}
		
		//x=1
		else 
			writeConsole ("\\begin{tabular}{l}\n1\\\\\n\\end{tabular}");
		
		
	}
	
}
