public class CorporateAccount extends Account {
    private int nip;
    private int regon;

    public CorporateAccount(String clientData, int number, boolean isOpen, int nip, int regon) {
        super(clientData, number, isOpen);
        this.nip = nip;
        this.regon = regon;
    }

    public accountTypes getType() {
        return accountTypes.CORPORATE;
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
