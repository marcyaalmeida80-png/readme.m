### Main.java

```java
public class Main {

    public static void main(String[] args) {

        new TelaPrincipal();

        Pessoa p1 =
                new Usuario(
                        "Maria",
                        20,
                        "maria@email.com"
                );

        Pessoa p2 =
                new Administrador(
                        "Carlos",
                        35,
                        "Total"
                );

        System.out.println(
                p1.exibirInformacoes()
        );

        System.out.println(
                p2.exibirInformacoes()
        );
    }
}
```
