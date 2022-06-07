package ar.edu.utn.link.tpintegrador.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.utn.link.tpintegrador.model.Producto;

@Repository
public class RepoProductoMem {

	private Collection<Producto> productos;
	
	public RepoProductoMem() {
		super();
		List<Producto> of =  List.of(new Producto("Leche",150),new Producto("Huevo",450),new Producto("Aceite",220),
		new Producto("Don Satur",70),new Producto("Agua",50));
        productos = new ArrayList<Producto>(of);	//Con esto puedo agregar materias
	}
	
	public Collection<Producto> all(){
		return productos;
	}
	
    public void save(Producto producto){
		this.productos.add(producto);
	}
	
}
