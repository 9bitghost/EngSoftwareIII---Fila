package Impressão;

public class Fila {
	private static Fila instance;
	private Fila(){
	    }

	public static Fila getInstance(){
		if (instance == null){
			instance = new Fila();
	        }
		return instance;

	    }

	public static void ImprimeDocumento(){

	}

	public static void RemoveDocumento(){

	}

	public static void RemoveTodosDocumentos(){

	}

}
