
### Administrador.java

```java
public class Administrador extends Pessoa {

    private String permissao;

    public Administrador(String nome, int idade, String permissao) {
        super(nome, idade);
        this.permissao = permissao;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() +
                "\nPermissão: " + permissao;
    }
}
```
