### Usuario.java

```java
import java.util.ArrayList;

public class Usuario extends Pessoa {

    private String email;
    private ArrayList<RegistroEmocional> registros;

    public Usuario(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
        this.registros = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void adicionarRegistro(RegistroEmocional registro) {
        registros.add(registro);
    }

    public ArrayList<RegistroEmocional> getRegistros() {
        return registros;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
                "\nEmail: " + email;
    }
}
```
