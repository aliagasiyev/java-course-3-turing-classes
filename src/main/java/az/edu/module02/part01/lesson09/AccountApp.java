package az.edu.module02.part01.lesson09;

public class AccountApp {

    public static void main(String[] args) {
        new Account("AZ2IBA32467832642934", AccountStatus.ACTIVE);

        System.out.println(AccountStatus.ACTIVE);
        System.out.println(AccountStatus.ACTIVE.name());
        System.out.println(AccountStatus.ACTIVE.ordinal());
        System.out.println(AccountStatus.ACTIVE.getOtherName());
        System.out.println(AccountStatus.ACTIVE.getCode());
    }
}
