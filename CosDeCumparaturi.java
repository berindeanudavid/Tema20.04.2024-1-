import java.util.LinkedList;

public class CosDeCumparaturi {
    public LinkedList<Produs> cos;
    public void adaugaProdus(Produs p){
        this.cos.add(p);
    }
    public Double calculeazaTotal(){
        Double suma=0.0;
        for(Produs p:cos){
            suma=suma+p.pret;
        }
        return suma;
    }
    public void testCosCumparaturi(Produs p1, Produs p2, Produs p3){
        this.cos=new LinkedList<Produs>();
        adaugaProdus(p1);
        adaugaProdus(p2);
        adaugaProdus(p3);
        System.out.println(calculeazaTotal());
    }
    public static void main(String[] args) {
        Produs p1=new Produs();
        Produs p2=new Produs();
        Produs p3=new Produs();
        p1.name="ardei";
        p2.name="lapte";
        p3.name="steak";
        p1.pret=10;
        p2.pret=7;
        p3.pret=35;
        CosDeCumparaturi instanta=new CosDeCumparaturi();
        instanta.testCosCumparaturi(p1, p2, p3);//afiseaza 52.0
    }
}
