package com.productos.crud.interfaces;

import com.productos.crud.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {
}
