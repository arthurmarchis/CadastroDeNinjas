package santos.arthur.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import santos.arthur.CadastroDeNinjas.Ninjas.NinjaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    // Criar Missoes
    public MissoesDTO criarMissoes(MissoesDTO missoesDTO){
        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
        missoesModel = missoesRepository.save(missoesModel);
        return missoesMapper.map(missoesModel);
    }
    // Listar Missoes
    public List<MissoesDTO> listarMissoes(){
        List<MissoesModel> listaModel = missoesRepository.findAll();
        return listaModel.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }
    // Listar Missoes Por ID
    public MissoesDTO listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.map(missoesMapper::map).orElse(null);

    }
    // Deletar Missoes
    public void deletarMissoes(Long id){
        missoesRepository.deleteById(id);
    }
    // Atualizar Missoes
    public MissoesDTO atualizarMissoes(Long id, MissoesDTO missoesDTO){
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        if (missoesModel.isPresent()){
            MissoesModel missaoAtualizada = missoesMapper.map(missoesDTO);
            missaoAtualizada.setId(id);
            MissoesModel missaoSalva = missoesRepository.save(missaoAtualizada);
            return missoesMapper.map(missaoSalva);
        }
        return null;
       }
}
