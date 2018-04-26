package app;


import Entity.Mesa;
import rest.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by lucas on 27/07/2016.
 */
@ApplicationPath("/ws")
public class appComanda extends Application {

        public Set<Class<?>> getClasses(){
            Set<Class<?>> classes = new HashSet<Class<?>>();
            classes.add(PizzaController.class);
            classes.add(MesaController.class);
            classes.add(ComandaController.class);
            classes.add(BebidaController.class);
            classes.add(UsuarioController.class);
            return classes;
        }
}
