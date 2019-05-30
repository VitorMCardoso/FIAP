package repository;

import model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

    /** Query via JPA **/
    @Query("select p from Produto p where p.nome = :nome")
    public List<Produto> findByName(@Param("nome") String nome);

}
