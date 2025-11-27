package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String adicionarMissoes(){
        return "Missao adicionada";
    }

    @GetMapping("listar")
    public String listarMissoes(){
        return "Listar missoes";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterar missao";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }



}
