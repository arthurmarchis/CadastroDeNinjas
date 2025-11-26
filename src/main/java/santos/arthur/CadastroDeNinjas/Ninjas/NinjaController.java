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
    public String criarNinja(){
        return "Ninja criado";
    }
    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> MostrarNinjas(){
        return ninjaService.listarNinjas();
    }
    //Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public List<NinjaModel> MostrarNinjasPorID(){
        return ninjaService.listarNinjasPorId();
    }
    //Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar")
    public String AlterarDados(){
        return "Alterar dados";
    }
    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar")
    public String DeletarDados(){
        return "Deletar dados";
    }
}
