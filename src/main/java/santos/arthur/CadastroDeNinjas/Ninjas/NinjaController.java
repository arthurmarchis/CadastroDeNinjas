package santos.arthur.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

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
    public String MostrarNinjas(){
        return "Mostrar ninjas";
    }
    //Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public String MostrarNinjasPorID(){
        return "Mostrar Ninjas por ID";
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
