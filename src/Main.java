import com.dio.domain.model.Iphone;
import com.dio.domain.model.Smartphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.desligar(); //Iphone

        System.out.println("");

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("JERUSALÉM E EU"); //Reprodutor músical

        System.out.println("");

        iphone.fazerLigacao("(22) 99999-9999");
        iphone.atenderLigacao();
        iphone.iniciarCorreioDeVoz(); //Telefone

        System.out.println("");

        iphone.exibirPagina("www.google.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        
    }
}