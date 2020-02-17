

/* Unidad básica en el grafo cuadrado. Apuntará Arriba, Abajo, Derecha e Izquierda */
public class Nodo {

	private int valor;
    
    public Nodo Arriba;
    public Nodo Abajo;
    public Nodo Derecha;
    public Nodo Izquierda;
    
    public int getValor(){ return valor; }
    
    public void setValor(int valor) { this.valor = valor; };
    

    public Nodo(int valor, Nodo Arriba, Nodo Abajo, Nodo Derecha, Nodo Izquierda){
    
    	this.valor = valor;
        this.Arriba = Arriba;
        this.Abajo = Abajo;
        this.Derecha = Derecha;
        this.Izquierda = Izquierda;
    
    }
}

