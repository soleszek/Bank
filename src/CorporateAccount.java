public class CorporateAccount extends Bank {
    private int nip;
    private int regon;

    public CorporateAccount(int nip, int regon) {
        this.nip = nip;
        this.regon = regon;
    }

    public String toString() {
        return super.toString() + " ";
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getRegon() {
        return regon;
    }

    public void setRegon(int regon) {
        this.regon = regon;
    }
}
