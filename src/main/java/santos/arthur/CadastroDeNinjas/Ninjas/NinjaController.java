package santos.arthur.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Seja Bem vindo, esta é minha primeira mensagem";
    }

    //Adicionar Ninja (CREATE)]
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja Criado com sucesso: " + novoNinja.getNome() + " ID: " + novoNinja.getId());
    }

    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> MostrarNinjas(){
        List<NinjaDTO> ninjaDTOS = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjaDTOS);
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> MostrarNinjasPorID(@PathVariable Long id){
        if (ninjaService.listarNinjasPorId(id) != null) {
            NinjaDTO ninjaDTO = ninjaService.listarNinjasPorId(id);
            return ResponseEntity.ok(ninjaDTO);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado.");
        }
    }


    //Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarDados(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninjaatualizado = ninjaService.atualizarNinja(id, ninjaAtualizado);
        if (ninjaatualizado != null){
            return ResponseEntity.ok(ninjaatualizado);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id nao encontrado");
        }

    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinja(@PathVariable Long id){
        if (ninjaService.listarNinjasPorId(id) != null){
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja de ID: " + id +" Deletado com sucesso");
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com id " +id+ " não foi encontrado.");
        }


    }
}
