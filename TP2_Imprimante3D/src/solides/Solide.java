package solides;

import interfaces.Imprimable;

public abstract class Solide implements Imprimable {
    protected final Materiau MATERIAU_DEFAUT = Materiau.NYLON;
    protected Materiau materiau;
    protected final double DIM_MAX = 50;
    protected final double DIM_MIN = 1;


    protected int compareTo(Solide s) {
        if (this.calculerVolume() > s.calculerVolume()) {
            return 1;
        }
        if (this.calculerVolume() < s.calculerVolume()) {
            return -1;
        } else return 0;
    }

    abstract double calculerSurface();

    public boolean validerMateriau(Materiau m) {
        for (Materiau mat : Materiau.values()) {
            if (mat == m) {
                return true;
            }
        }
        throw new RuntimeException("Matériau invalide");
    }

    public boolean validerDimensions(double dimension) {
        if (dimension < DIM_MIN) {
            throw new RuntimeException("Dimension inférieure à 1");
        }
        if (dimension > DIM_MAX) {
            throw new RuntimeException("Dimension supérieure à 50");
        }
        return true;
    }

    public abstract double calculerVolume();

    @Override
    public String toString() {

    }

    public Materiau getMateriau() {
        return materiau;
    }

    public void setMateriau(Materiau materiau) {
        if (validerMateriau(materiau)) {
            this.materiau = materiau;
        }
    }
}
