package Services;

import Entities.Triangulo;

public class TrianguloService extends Triangulo {

    public void Validacao(){
        if (getLado1() + getLado2() > getLado3() && getLado2() + getLado3() > getLado1() && getLado3() + getLado1() > getLado2()){
            System.out.println("Os três lados formam um triângulo válido!");
        }else{
            System.out.println("Os lados não formam um triângulo válido!");
        }
    }
}
