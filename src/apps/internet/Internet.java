package apps.internet;

public class Internet implements NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA");
    }

}
