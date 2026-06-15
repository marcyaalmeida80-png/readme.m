### RegistroEmocional.java

```java
public class RegistroEmocional {

    private String data;
    private String emocao;
    private String observacao;

    public RegistroEmocional(String data,
                             String emocao,
                             String observacao) {

        this.data = data;
        this.emocao = emocao;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return data + " - " +
               emocao + " - " +
               observacao;
    }
}
```
