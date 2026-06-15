### Pessoa.java

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String exibirInformacoes() {
        return "Nome: " + nome + "\nIdade: " + idade;
    }
}
```

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

### TelaPrincipal.java

```java
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaPrincipal extends JFrame {

    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtEmail;

    private JTextArea area;

    private ArrayList<Usuario> usuarios;

    public TelaPrincipal() {

        usuarios = new ArrayList<>();

        setTitle("MindCare");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nome"));
        txtNome = new JTextField(20);
        add(txtNome);

        add(new JLabel("Idade"));
        txtIdade = new JTextField(5);
        add(txtIdade);

        add(new JLabel("Email"));
        txtEmail = new JTextField(20);
        add(txtEmail);

        JButton btnCadastrar =
                new JButton("Cadastrar");

        add(btnCadastrar);

        area = new JTextArea(10,35);
        add(new JScrollPane(area));

        btnCadastrar.addActionListener(e -> cadastrar());

        setVisible(true);
    }

    private void cadastrar() {

        try {

            String nome = txtNome.getText();
            int idade =
                    Integer.parseInt(txtIdade.getText());

            String email = txtEmail.getText();

            Usuario usuario =
                    new Usuario(nome, idade, email);

            usuarios.add(usuario);

            area.append(
                    usuario.exibirInformacoes()
                    + "\n-----------------\n"
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Usuário cadastrado!"
            );

        } catch (NumberFormatException erro) {

            JOptionPane.showMessageDialog(
                    this,
                    "Idade inválida!"
            );

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(
                    this,
                    "Erro: " + erro.getMessage()
            );
        }
    }
}
```

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
