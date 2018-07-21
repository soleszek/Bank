public abstract class Account {

    private String clientData;
    private int number;
    private Boolean isOpen = false;

    public Account(String clientData, int number, Boolean state) {
        this.clientData = clientData;
        this.number = number;
        this.isOpen = state;
    }

    public void openAccount(){
        isOpen = true;
        System.out.println("Rachunek jest aktywny");
    }
    public void closeAccount(){
        isOpen = false;
        System.out.println("Rachunek jest nieaktywny");
    }
    public void payMoney(){};
    public void takeMoney(){};

    public enum accountTypes {
        PERSONAL,
        CORPORATE;
    }

    public abstract accountTypes getType();

    public String toString (){

        return "";
    }


    public String getClientData() {
        return clientData;
    }

    public void setClientData(String clientData) {
        this.clientData = clientData;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean getState() {
        return isOpen;
    }

    public void setState(Boolean state) {
        this.isOpen = state;
    }
}
