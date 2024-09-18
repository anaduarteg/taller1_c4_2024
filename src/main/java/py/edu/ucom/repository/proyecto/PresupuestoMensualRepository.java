package py.edu.ucom.repository.proyecto;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import py.edu.ucom.entities.proyecto.PresupuestoMensual;

@ApplicationScoped
public class PresupuestoMensualRepository implements PanacheRepositoryBase<PresupuestoMensual, Integer> {

    public List<PresupuestoMensual> findByClienteId(Integer clienteId) {
        return find("idCliente.idCliente", clienteId).list(); // Usamos el atributo idCliente para buscar
    }
}
