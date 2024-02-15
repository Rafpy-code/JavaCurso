package org.ramon.apiservlet.webapp.headers.services;

import org.ramon.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {
    @Override
    public List<Producto> listar() {
        return Arrays.asList(
                new Producto(1L, "compu", "inform", 2317.67F),
                new Producto(1L, "ta", "inform", 9317.67F),
                new Producto(1L, "dora", "inform", 4512.67F)
        );
    }
}
