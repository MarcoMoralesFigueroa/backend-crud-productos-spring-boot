package com.productos.crud.controller;


import com.productos.crud.interfacesServeice.IProductoService;
import com.productos.crud.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    private final IProductoService productoService;

    public ProductoController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/api/productos")
    public List<Producto> listar() {
        return productoService.listar();
    }

    @PostMapping("/api/productos")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/api/productos/{id}")
    public void delete(@PathVariable int id) {
        productoService.delete(id);
    }

    @PostMapping("/api/productos/{id}")
    public Producto edit(@PathVariable int id, @RequestBody Producto producto) {
        return productoService.edit(id, producto);
    }

    @GetMapping("/api/productos/{id}")
    public Optional<Producto> listarId(@PathVariable int id) {
        return productoService.listarId(id);
    }
}
