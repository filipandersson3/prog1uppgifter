package testkod.komplexatal;

public class Komplex {
    public Komplex(double reelt, double imaginart) {
        this.reelt = reelt;
        this.imaginart = imaginart;
    }

    public double reelt;
    public double imaginart;

    @Override
    public String toString() {
        return reelt + " + " + imaginart +"i";
    }
    public Komplex add(Komplex k2) {
        return new Komplex(reelt + k2.reelt,imaginart + k2.imaginart);
    }
}
