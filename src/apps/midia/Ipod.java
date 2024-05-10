package apps.midia;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("INICIAR A REPRODUCAO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR A REPRODUCAO");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONE UMA MUSICA");
    }

}
