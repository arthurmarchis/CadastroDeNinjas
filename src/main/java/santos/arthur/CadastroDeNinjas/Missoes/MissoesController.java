package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }
// Criar missoes (CREATE)
    @PostMapping("/criar")
    public MissoesDTO adicionarMissao(@RequestBody MissoesDTO missoesDTO){
        return missoesService.criarMissoes(missoesDTO);
    }
// Listar missoes (READ)
    @GetMapping("listar")
    public List<MissoesDTO> listarMissoes(){
        return missoesService.listarMissoes();
    }
// Listar missoes por ID (READ)
    @GetMapping("listar/{id}")
    public MissoesDTO listarMissoesPorId(@PathVariable Long id){
       return missoesService.listarMissoesPorId(id);
    }
// Alterar missoes (UPDATE)
    @PutMapping("/alterar/{id}")
    public MissoesDTO alterarMissao(@PathVariable Long id, @RequestBody MissoesDTO missoesDTO){
        return missoesService.atualizarMissoes(id, missoesDTO);
    }
// Deletar missoes (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissoes(id);
    }




}
