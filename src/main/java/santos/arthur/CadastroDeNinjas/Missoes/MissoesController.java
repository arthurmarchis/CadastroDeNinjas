package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String AdicionarMissoes(){
        return "Missao adicionada";
    }

    @GetMapping("listar")
    public String ListarMissoes(){
        return "Listar missoes";
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
