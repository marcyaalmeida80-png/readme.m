
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
