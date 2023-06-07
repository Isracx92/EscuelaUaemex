package cola;

public class COLA {
	Nodo frente;
	int tamanio;

	public COLA() {
		frente = null;
		this.tamanio = 0;
	}

	public boolean isEmpty() {
		return frente == null;
	}

	public int size() {
		return this.tamanio;
	}

	public Nodo raiz() {
		if (isEmpty()) {
			return null;
		} else {
			return frente;
		}
	}

	public void sacar() {
		System.out.println("Inicia el metodo sacar");
		if (frente != null) {
			System.out.println("Valor sacado" + frente.getElemento());
			Nodo s = frente.getSiguiente();
			frente = s;
		}
		this.tamanio--;
	}

	public Nodo recorreCola() {
		System.out.println("Iniciando metodo de recorrer cola");
		System.out.println("Valor visitado " + frente.getElemento());
		Nodo i = frente;
		Nodo s = new Nodo(0, null);
		while (i.getSiguiente() != null) {
			s = i.getSiguiente();
			System.out.println("Valor visitado " + s.getElemento());
			i = s;
		}
		return i;
	}

	public void encolar(Nodo nv) {
		if (frente == null) {
			frente = nv;
			System.out.println("Valor insertado " + nv.getElemento());
		} else {
			Nodo s = recorreCola();
			if (s.getSiguiente() == null) {
				System.out.println("Valor insertado " + nv.getElemento());
				s.setSiguiente(nv);
				this.tamanio++;
			}
		}
	}

	public String toString() {
		if (isEmpty()) {
			return "La cola esta vacia";
		} else {
			String resultado = "";
			Nodo aux = frente;
			while (aux != null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}

}
