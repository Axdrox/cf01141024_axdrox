package mx.com.fractalyst.pocs.model.producto.gateways;

import mx.com.fractalyst.pocs.model.producto.Producto;

import java.util.List;
import java.math.BigDecimal;

public interface ProductoRepository {
    public abstract Producto getProducto (String id);
    List<Producto> getProductos ();
    BigDecimal getProductoPrecio (String id);
    boolean addProducto (Producto producto);

    // 
    String ping (String mensaje);   
}
