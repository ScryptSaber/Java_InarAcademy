package weeks.week14;

public class Polimorfizm {
    /**
     public static void nesneAl(Canli c) {
        if(c instanceof Canli){
            Canli c1 =c;
            c1.print();
        } else if (c instanceof Insan) {
            Insan c1 =(Insan) c;
            c1.print();

        } else if (c instanceof Hayvan) {
            Hayvan c1 =(Hayvan) c;
            c1.print();

        }else if(c instanceof Bitki){
            Bitki c1=(Bitki) c;
            c1.print();
        }
    }

    */
    //Yukaridakini yapmak yerine , asagidaki daha guzel..
    public static void nesneAl(Canli c) {
        c.print();
    }

    public static void main(String[] args) {
        Canli c = new Canli();
        Insan i = new Insan();
        Hayvan h = new Hayvan();
        Bitki b = new Bitki();

        Canli c1= new Insan();
        ((Insan) c1).ctest();
       // Insan c2 = (Insan) c; // We cannot cast to Insan

        nesneAl(c);
        nesneAl(i);
        nesneAl(h);
        nesneAl(b);

        nesneAl(c1);
    }
}
