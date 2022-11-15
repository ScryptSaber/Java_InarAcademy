package weeks.week14;

public class Canli {
    public void print(){
        System.out.println("Canli sinifi");

    }

}
class Insan extends Canli{
    public void print(){
        System.out.println("Insan sinifi");
    }
    public void ctest(){
        System.out.println("Canli Test");
    }
}
class Hayvan extends Canli{
    public void print(){
        System.out.println("Hayvan sinifi");
    }
}
class Bitki extends Canli{
    public void print(){
        System.out.println("Bitki sinifi");
    }
}
