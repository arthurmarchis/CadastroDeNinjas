package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("listar")
    public String ListarMissoes(){
        return "Listar missoes";
    }

    @PostMapping("/criar")
    public String AdicionarMissoes(){
        return "Missao adicionada";
    }

    @PutMapping("/alterar")
    public String AlterarMissao(){
        return "Alterar missao";
    }

    @DeleteMapping("/deletar")
    public String DeletarMissao(){
        return "Missao deletada";
    }



}
