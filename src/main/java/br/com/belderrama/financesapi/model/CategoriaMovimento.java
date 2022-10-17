package br.com.belderrama.financesapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.belderrama.financesapi.enums.TipoMovimento;

@Entity
@Table (name = "categorias_movimentos")
public class CategoriaMovimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String categoria;

    private Integer tipoMovimento;

    public CategoriaMovimento(){

    }

    public CategoriaMovimento(Long id, String categoria, TipoMovimento tipoMovimento){
        super();
        this.id = id;
        this.categoria = categoria;
        setTipoMovimento(tipoMovimento);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipoMovimento(Integer tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public TipoMovimento getTipoMovimento() {
        return TipoMovimento.valueOf(tipoMovimento);
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        if(tipoMovimento != null){
            this.tipoMovimento = tipoMovimento.getCode();
        }
        
    }
}
