package org.ramofpy.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    //Podría crear la clase Usuario y haacer una lista de Usuario.
    private List<String> repositorio = new ArrayList<>();
    public void crearUsuario(String usuario){
        repositorio.add(usuario);
        notifyObservers(usuario);
    }
}
