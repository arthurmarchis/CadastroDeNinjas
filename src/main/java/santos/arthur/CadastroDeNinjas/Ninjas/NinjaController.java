package santos.arthur.CadastroDeNinjas.Ninjas;

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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }
    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaDTO> MostrarNinjas(){
        return ninjaService.listarNinjas();
    }
    //Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaDTO MostrarNinjasPorID(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }
    //Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarDados(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
