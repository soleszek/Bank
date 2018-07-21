public class PersonalAccount extends Account {
    public PersonalAccount(String clientData, int number, boolean isOpen) {
        super(clientData, number, isOpen);
    }

    @Override
    public accountTypes getType() {
        return accountTypes.PERSONAL;
    }

    public String toString() {
        return super.toString() + ", typ rachunku to: " + accountTypes.PERSONAL;
    }
}
