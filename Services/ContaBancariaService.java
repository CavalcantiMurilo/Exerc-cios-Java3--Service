package Services;
import Entities.ContaBancaria;
public class ContaBancariaService extends ContaBancaria {

    public void depositar(double quantidade){

        setSaldo(getSaldo() + quantidade);
    }

    public void sacar(double quantidade){

        setSaldo(getSaldo() - quantidade);
    }

}
