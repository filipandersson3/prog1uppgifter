package testkod.komplexatal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.reelt, reelt) == 0 &&
                Double.compare(komplex.imaginart, imaginart) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reelt, imaginart);
    }

    public Komplex add(Komplex k2) {
        return new Komplex(reelt + k2.reelt,imaginart + k2.imaginart);
    }
    public Komplex multiply(Komplex k2) {
        return new Komplex((reelt*k2.reelt)-(imaginart*k2.imaginart),imaginart*k2.reelt + k2.imaginart*reelt);
    }
    public double arg() {
        if (reelt>0) {
            return Math.atan(imaginart/reelt);
        } else if (imaginart>=0 && reelt<0) {
            return Math.atan(imaginart/reelt) + Math.PI;
        } else if (imaginart<0 && reelt<0) {
            return Math.atan(imaginart/reelt) - Math.PI;
        } else if (imaginart>0 && reelt==0) {
            return Math.PI/2;
        }
        else {
            return 0;
        }
    }
}
