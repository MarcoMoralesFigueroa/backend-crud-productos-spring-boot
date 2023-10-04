package com.productos.crud.interfacesServeice;

import com.productos.crud.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> listar();

    public Optional<Producto> listarId(int id);

    public Producto save(Producto p);

    public void delete(int id);

    public Producto edit(int id, Producto p);
}
