import java.util.Random;

public class LaBattagliaDeiSessi{
    public static void main(String[] args) throws NoRightGENDERException {
        Random random =new Random();
        Popolazione w = new Popolazione();

        /*Individuo p1 = new Individuo(Individuo.GENDER.UOMO, Individuo.TIPO.MORIGERATO, 49);
        Individuo p2 = new Individuo(Individuo.GENDER.UOMO, Individuo.TIPO.AVVENTURIERO, 49);
        Individuo p3 = new Individuo(Individuo.GENDER.DONNA, Individuo.TIPO.PRUDENTE, 49);
        Individuo p4 = new Individuo(Individuo.GENDER.DONNA, Individuo.TIPO.SPREGIUDICATA, 48);*/

        for (int i = 0; i <random.nextInt(1000)  ; i++) {
            w.addIndividuo(new Individuo(Individuo.GENDER.UOMO, Individuo.TIPO.MORIGERATO,random.nextInt(50)));
        }
        System.out.println(w.getMorigerati().size());
        for (int i = 0; i <random.nextInt(1000)  ; i++) {
            w.addIndividuo(new Individuo(Individuo.GENDER.UOMO, Individuo.TIPO.AVVENTURIERO,random.nextInt(50)));
        }
        System.out.println(w.getAvventurieri().size());
        for (int i = 0; i <random.nextInt(1000)  ; i++) {
            w.addIndividuo(new Individuo(Individuo.GENDER.DONNA, Individuo.TIPO.PRUDENTE,random.nextInt(50)));
        }
        System.out.println(w.getPrudenti().size());
        for (int i = 0; i <random.nextInt(1000)  ; i++) {
            w.addIndividuo(new Individuo(Individuo.GENDER.DONNA, Individuo.TIPO.SPREGIUDICATA,random.nextInt(50)));
        }
        System.out.println(w.getSpregiudicate().size());

        /*w.addIndividuo(p1);
        w.addIndividuo(p2);
        w.addIndividuo(p3);
        w.addIndividuo(p4);*/

        /*System.out.println(w.getAvventurieri());
        System.out.println(w.getMorigerati());
        System.out.println(w.getPrudenti());
        System.out.println(w.getSpregiudicate());*/

        w.statoPop();
        System.out.println("");
        int cont = 0;
        for (int i = 0; i <random.nextInt(1000)  ; i++){
            w.invecchiamento();
            cont++;
        }
        System.out.println(cont);
        System.out.println("");
        System.out.println(w.getMorigerati().size());
        System.out.println(w.getAvventurieri().size());
        System.out.println(w.getPrudenti().size());
        System.out.println(w.getSpregiudicate().size());
        System.out.println("");
        w.statoPop();
    }
}
