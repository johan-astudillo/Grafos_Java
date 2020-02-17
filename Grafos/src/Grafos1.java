// Autor: Johan Astudillo

	
	/* Un grafo muy básico */
	public class Grafos1 {
		
		// ESTA CLASE ES LA IMAGEN 1 
		
	    public static void main(String[] args) {
	        Nodo Iniciando = new Nodo(1, null, null, null, null);
	        Nodo Segundo = new Nodo(5, Iniciando, null, null, null);
    /*     null
            |
   null - Iniciando - null
            |
   null - Segundo - null
            |
          null
   */
   
			// IMAGEN 2 ESTA ES LA TECNICA 1
	        // public Nodo(int valor, Nodo Arriba, Nodo Abajo, Nodo Derecha, Nodo Izquierda){
	        Nodo Tercero = new Nodo (8, null, null, null, Iniciando );
	        Nodo Cuarto =  new Nodo (4, Tercero, null, null, Segundo );
	        
	        Iniciando.Abajo = Segundo;
	        Iniciando.Derecha = Tercero;
	        
	        Segundo.Derecha = Cuarto;
	        
	        Tercero.Abajo = Cuarto;
	        //
	        
  /*     null          null
            |            |   
   null - Iniciando--- Tercero - null
            |
   null - Segundo ----   Cuarto  - null
            |            |
          null          null
   */
	        
	        
	   
	        //Imprime
	        System.out.println("Iniciando es: " + Iniciando.getValor());
	        System.out.println("Iniciando abajo es: " + Iniciando.Abajo.getValor());
	        System.out.println("Segundo es: " + Segundo.getValor());
	        System.out.println("Segundo arriba es: " + Segundo.Arriba.getValor());
	        
	        
	        // IMAGEN 2
	        System.out.println("Tercero es: " + Tercero.getValor());
	        System.out.println("Tercero abajo es: " + Tercero.Abajo.getValor());
	        System.out.println("Cuarto es: " + Cuarto.getValor());
	        System.out.println("Cuarto arriba es: " + Cuarto.Arriba.getValor());

	        
	    }
	}
