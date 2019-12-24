package patos;

public abstract class ComicDuck extends Pato implements Flyable {

    public abstract void doBoom();

    public void doZap(){
        System.out.println("Hace Zap desde un ComicDuck");
    }
}
