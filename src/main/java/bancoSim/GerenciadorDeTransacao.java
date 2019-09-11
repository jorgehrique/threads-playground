package bancoSim;

public class GerenciadorDeTransacao {

    public void begin(){
        System.out.println("comecando a transacao");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
