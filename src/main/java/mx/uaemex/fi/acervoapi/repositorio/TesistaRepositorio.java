package mx.uaemex.fi.acervoapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.uaemex.fi.acervoapi.modelo.Tesista;

@Repository
public interface TesistaRepositorio extends JpaRepository<Tesista, Integer>{
}
