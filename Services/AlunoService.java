package Services;

import Entities.Aluno;

public class AlunoService extends Aluno {

    public double CalculaMedia(double[] notas, int contador){

        double soma =0;

        for(int i=0; i<contador; i++){

            soma += notas[i];
        }

        return (soma/contador);
    }

}
