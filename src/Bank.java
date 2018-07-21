public class Bank {
    public static void main(String[] args) {
        Account sylwester = new PersonalAccount("Sylwester Oleszek", 823000110, true);
        Account arkadia = new CorporateAccount("Arkadia", 823000111, true, 2343445, 5556778);

        System.out.println(sylwester.toString());
        System.out.println(arkadia.toString());

        sylwester.payMoney();
        sylwester.takeMoney();



    }
}
