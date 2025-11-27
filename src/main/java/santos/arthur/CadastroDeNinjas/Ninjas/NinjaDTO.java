package santos.arthur.CadastroDeNinjas.Ninjas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import santos.arthur.CadastroDeNinjas.Missoes.MissoesModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private long id;
    private String nome;
    private String email;
    private int idade;
    private String rank;
    private MissoesModel missoes;

}

