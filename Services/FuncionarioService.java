package Services;

import Entities.Funcionario;

public class FuncionarioService extends Funcionario {

    public double aumentaSalario(double porcentagem){

        return (getSalario() + (getSalario() * porcentagem / 100));
    }

}
