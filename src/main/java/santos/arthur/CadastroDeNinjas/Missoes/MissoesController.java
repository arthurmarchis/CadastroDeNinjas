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
    public MissoesModel adicionarMissao(@RequestBody MissoesModel missoesModel){
        return missoesService.criarMissoes(missoesModel);
    }
// Listar missoes (READ)
    @GetMapping("listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }
// Listar missoes por ID (READ)
    @GetMapping("listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
       return missoesService.listarMissoesPorId(id);
    }
// Alterar missoes (UPDATE)
    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missoesModel){
        return missoesService.atualizarMissoes(id, missoesModel);
    }
// Deletar missoes (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissoes(id);
    }




}
