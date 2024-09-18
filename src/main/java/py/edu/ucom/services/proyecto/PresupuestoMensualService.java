package py.edu.ucom.services.proyecto;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import py.edu.ucom.config.GenericDAO;
import py.edu.ucom.entities.proyecto.PresupuestoMensual;
import py.edu.ucom.repository.proyecto.PresupuestoMensualRepository;

@ApplicationScoped
public class PresupuestoMensualService implements GenericDAO<PresupuestoMensual, Integer> {

    private final PresupuestoMensualRepository repository;

    public PresupuestoMensualService(PresupuestoMensualRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PresupuestoMensual> listar() {
        return this.repository.findAll().list();
    }

    @Override
    public PresupuestoMensual obtener(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public void eliminar(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    @Transactional
    public PresupuestoMensual modificar(PresupuestoMensual param) {

        return this.repository.getEntityManager().merge(param);
    }

    @Override
    @Transactional
    public PresupuestoMensual agregar(PresupuestoMensual param) {
        this.repository.persist(param);
        return null;
    }

}
