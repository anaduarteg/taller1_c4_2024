package py.edu.ucom.repository.proyecto;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.entities.proyecto.Movimientos;

@ApplicationScoped
public class MovimientosRepository implements PanacheRepositoryBase<Movimientos, Integer> {

}
