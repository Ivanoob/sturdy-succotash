import java.util.*;

public class Popolazione{


    // ciao brutto stronzo
    private List<Individuo> Morigerati,Avventurieri,Prudenti,Spregiudicate;
    private float percAvventurieri,percMorigerati,percPrudenti,percSpregiudicate;

    Popolazione(){
        this.Morigerati = new ArrayList<>();
        this.Avventurieri = new ArrayList<>();
        this.Prudenti = new ArrayList<>();
        this.Spregiudicate = new ArrayList<>();
    }

    public void addIndividuo(Individuo i){
        if(i.getTipo()==Individuo.TIPO.AVVENTURIERO) Avventurieri.add(i);
        if(i.getTipo()==Individuo.TIPO.MORIGERATO) Morigerati.add(i);
        if(i.getTipo()==Individuo.TIPO.PRUDENTE) Prudenti.add(i);
        if(i.getTipo()==Individuo.TIPO.SPREGIUDICATA) Spregiudicate.add(i);
    }

    public void invecchiamento(){
        List<Individuo> tmp = new ArrayList<>();
        for(Individuo elem : Avventurieri){
            if(elem.getEta()>=80){
                continue;
            }
            else{
                int e = elem.getEta();
                elem.setEta(e+1);
                tmp.add(elem);
            }
        }
        Avventurieri = tmp;
        tmp = new ArrayList<>();

        for(Individuo elem : Morigerati){
            if(elem.getEta()>=80){
                continue;
            }
            else{
                int e = elem.getEta();
                elem.setEta(e+1);
                tmp.add(elem);
            }
        }
        Morigerati = tmp;
        tmp = new ArrayList<>();

        for(Individuo elem : Prudenti){
            if(elem.getEta()>=80){
                continue;
            }
            else{
                int e = elem.getEta();
                elem.setEta(e+1);
                tmp.add(elem);
            }
        }
        Prudenti = tmp;
        tmp = new ArrayList<>();

        for(Individuo elem : Spregiudicate){
            if(elem.getEta()>=80){
                continue;
            }
            else{
                int e = elem.getEta();
                elem.setEta(e+1);
                tmp.add(elem);
            }
        }
        Spregiudicate = tmp;
        tmp = new ArrayList<>();
    }

    public void statoPop(){
        float totIndividui = Avventurieri.size()+Morigerati.size()+Prudenti.size()+Spregiudicate.size();
        //(num individui*100) / totale
        percAvventurieri = (Avventurieri.size()*100)/totIndividui;
        System.out.println(percAvventurieri+"%");
        percMorigerati = (Morigerati.size()*100)/totIndividui;
        System.out.println(percMorigerati+"%");
        percPrudenti = (Prudenti.size()*100)/totIndividui;
        System.out.println(percPrudenti+"%");
        percSpregiudicate = (Spregiudicate.size()*100)/totIndividui;
        System.out.println(percSpregiudicate+"%");
    }

    public void accoppiamento(){

    }

    public List<Individuo> getMorigerati(){return this.Morigerati;}
    public List<Individuo> getAvventurieri(){return this.Avventurieri;}
    public List<Individuo> getPrudenti(){return this.Prudenti;}
    public List<Individuo> getSpregiudicate(){return this.Spregiudicate;}
}
