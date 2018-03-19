package co.com.fabrica.wsrest;

import java.util.HashSet;
import java.util.Set;

public class RestConfig extends javax.ws.rs.core.Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(co.com.fabrica.wsrest.RestRegistraPedido.class);
        classes.add(co.com.fabrica.wsrest.RestSolicitaCatalogoPedido.class);
        
        return classes;
    }
}