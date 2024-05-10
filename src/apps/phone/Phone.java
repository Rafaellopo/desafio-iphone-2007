package apps.phone;

public class Phone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("INICIAR UMA LIGACAO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER UMA LIGACAO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICAR CORREIO DE VOZ");
    }

}
