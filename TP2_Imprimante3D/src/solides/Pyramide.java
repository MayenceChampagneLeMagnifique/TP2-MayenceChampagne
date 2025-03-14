package solides;

public class Pyramide extends Solide {

    private static final double COTE_BASE_DEFAUT = 5;
    private static final double HAUTEUR_DEFAUT = 10;
    private double coteBase;
    private double hauteur;

    public Pyramide(double coteBase, double hauteur, Materiau materiau) {

    }

    public Pyramide() {
        setMateriau(MATERIAU_DEFAUT);
        setCoteBase(COTE_BASE_DEFAUT);
        setHauteur(HAUTEUR_DEFAUT);
    }

    private double aireBase() {
        return Math.pow(getCoteBase(), 2);
    }

    private double aireFace() {
        return (getCoteBase() * Math.sqrt(Math.pow(getCoteBase() / 2, 2) + Math.pow(getHauteur(), 2))) / 2;
    }

    @Override
    double calculerSurface() {
        return aireBase() + 4 * aireFace();
    }

    @Override
    public double calculerVolume() {
        return (aireBase() * getHauteur()) / 3;
    }

    public String formaterSTL() {

    }

    public double getCoteBase() {
        return coteBase;
    }

    public void setCoteBase(double coteBase) {
        if (validerDimensions(coteBase)) {
            this.coteBase = coteBase;
        }
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        if (validerDimensions(hauteur)) {
            this.hauteur = hauteur;
        }
    }
}
