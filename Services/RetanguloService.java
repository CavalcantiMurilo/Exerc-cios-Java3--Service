package Services;

import Entities.Retangulo;

public class RetanguloService extends Retangulo {
    public double areaRetangulo(){

        return getLargura() * getComprimento();
    }
}
