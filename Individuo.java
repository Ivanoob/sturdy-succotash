import java.util.*;

public class Individuo {

    public enum TIPO {MORIGERATO, AVVENTURIERO, PRUDENTE, SPREGIUDICATA}
    public enum GENDER {UOMO,DONNA}

    private GENDER gender;
    private TIPO tipo;
    private int eta;

    Individuo(GENDER g, TIPO t, int e){
        this.eta = e;
        this.gender = g;
        this.tipo = t;
    }

    public void setEta(int age){this.eta = age;}

    public GENDER getGender(){
        return this.gender;
    }
    public TIPO getTipo(){
        return this.tipo;
    }
    public int getEta(){
        return this.eta;
    }
}
