import java.util.HashMap;
import java.util.Map;

public class CuentaTexto {

	private int numLetras = 0;
	private int numPalabras = 0;
//	private int [] numOcurrenciasPorLetra = new int['z' - 'a' + 1];
	private Map<Character, Integer> numOcurrenciasPorLetra = new HashMap<Character, Integer>();
	
	public CuentaTexto(String s) {
		for (int i=0; i<s.length(); i++) {
			char c = s.toLowerCase().charAt(i);
			if (Character.isAlphabetic(c)) {
				numLetras++;
//				numOcurrenciasPorLetra[c - 'a']++;
				if (i == 0 || !Character.isAlphabetic(s.charAt(i - 1))) {
					numPalabras++;
				}
			}
		}
	}
	
	public int getNumLetras() {
		return numLetras;
	}

	public int getNumPalabras() {
		return numPalabras;
	}

	public int getNumOcurrenciasPorLetra(char c) {
		if (!Character.isAlphabetic(c))
			throw new RuntimeException("No es una letra");
		return numOcurrenciasPorLetra[c - 'a'];
	}

	public static void main(String[] args) {
		CuentaTexto ct = new CuentaTexto("Esto es una prueba");
		System.out.println("Numero de letras: " + ct.getNumLetras());
		System.out.println("Numero de palabras: " + ct.getNumPalabras());
		System.out.println("Numero de aes: " + ct.getNumOcurrenciasPorLetra('a'));
		
	}
	
}
