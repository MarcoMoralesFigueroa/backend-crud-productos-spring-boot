package com.productos.crud.service;

import com.productos.crud.interfaces.IProducto;
import com.productos.crud.interfacesServeice.IProductoService;
import com.productos.crud.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProducto dataProducto;

    @Override
    public List<Producto> listar() {
        return (List<Producto>) dataProducto.findAll();
    }

    @Override
    public Optional<Producto> listarId(int id) {
        return dataProducto.findById(id);
    }

    @Override
    public Producto save(Producto p) {
        Producto producto = dataProducto.save(p);
        return producto;
    }

    @Override
    public void delete(int id) {
        dataProducto.deleteById(id);
    }

    @Override
    public Producto edit(int id, Producto p) {
        Optional<Producto> productoOptional = dataProducto.findById(id);

        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            producto.setNombre(p.getNombre());
            producto.setCategoria(p.getCategoria());
            producto.setUbicacion(p.getUbicacion());
            producto.setPrecio(p.getPrecio());

            return dataProducto.save(producto);
        } else {
            return null;
        }
    }

}
