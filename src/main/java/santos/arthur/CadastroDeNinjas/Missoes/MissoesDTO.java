package santos.arthur.CadastroDeNinjas.Missoes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import santos.arthur.CadastroDeNinjas.Ninjas.NinjaModel;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesDTO {
    private long id;
    private String nome;
    private String dificuldade;
    private List<NinjaModel> ninjas;

}
