package br.com.belderrama.financesapi.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.belderrama.financesapi.enums.TipoMovimento;



@Entity
@Table (name = "movimentos")
public class Movimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime data;
    
    private Integer tipoMovimento;

    private Double valor;

    public Movimento(){

    }

    public Movimento(Long id, String descricao, LocalDateTime data, TipoMovimento tipoMovimento, Double valor){
        super();
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        setTipoMovimento(tipoMovimento);
        this.valor = valor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
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
