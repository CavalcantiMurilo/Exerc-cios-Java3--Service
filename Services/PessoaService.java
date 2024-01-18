package Services;

import Entities.Pessoa;

public class PessoaService extends Pessoa {

    public void maiorIdade(){
        if(getIdade()>=18){
            System.out.println("Você é maior de idade! ");
        }else{
            System.out.println("Você não é maior de idade!");
        }
    }

}
