package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import santos.arthur.CadastroDeNinjas.Ninjas.NinjaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }
    // Criar Missoes
    public MissoesModel criarMissoes(MissoesModel missoesModel){
        return missoesRepository.save(missoesModel);
    }
    // Listar Missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
    // Listar Missoes Por ID
    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }
    // Deletar Missoes
    public void deletarMissoes(Long id){
        missoesRepository.deleteById(id);
    }
    // Atualizar Missoes
    public MissoesModel atualizarMissoes(Long id, MissoesModel missoesModel){
        if(missoesRepository.existsById(id)){
            missoesModel.setId(id);
            missoesRepository.save(missoesModel);
        }
        return null;
    }
}
