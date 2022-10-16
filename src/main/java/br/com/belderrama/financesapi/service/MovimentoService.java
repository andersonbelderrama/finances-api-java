package br.com.belderrama.financesapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.belderrama.financesapi.model.Movimento;
import br.com.belderrama.financesapi.repository.MovimentoRepository;

@Service
@Transactional
public class MovimentoService {
    
    @Autowired
    private MovimentoRepository movimentacaoRepository;
    
    public List<Movimento> listAllMovimentacao(){
        return movimentacaoRepository.findAll();
    }

    public void saveMovimento(Movimento movimento){
        movimentacaoRepository.save(movimento);
    }

    public Movimento getMovimento(Integer id){
        return movimentacaoRepository.findById(id).get();
    }

    public void deleteMovimento(Integer id){
        movimentacaoRepository.deleteById(id);
    }

}
