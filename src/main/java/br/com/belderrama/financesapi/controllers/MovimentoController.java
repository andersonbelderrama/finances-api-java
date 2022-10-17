package br.com.belderrama.financesapi.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.belderrama.financesapi.model.Movimento;
import br.com.belderrama.financesapi.service.MovimentoService;

@RestController
@RequestMapping("/movimentos")
public class MovimentoController {
    @Autowired
    MovimentoService movimentoService;

    @GetMapping("")
    public List<Movimento> list(){
        return movimentoService.listAllMovimentacao();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimento> get(@PathVariable Long id){
        try {
            Movimento movimento = movimentoService.getMovimento(id);
            return new ResponseEntity<Movimento>(movimento, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Movimento>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Movimento movimento){
        movimentoService.saveMovimento(movimento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Movimento movimento, @PathVariable Long id){
        try {
            Movimento existMovimento = movimentoService.getMovimento(id);
            movimento.setId(id);
            movimentoService.saveMovimento(existMovimento);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        movimentoService.deleteMovimento(id);
    }


}
