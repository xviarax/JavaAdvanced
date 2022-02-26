package bankInfo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String[] input = scanner.nextLine().split(" ");
        Map<Integer, BankAccount> accounts = new HashMap<>();
       String command = input[0];

       while (!command.equals("End")) {
            String result = "";
            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    result = String.format("Account ID%d created", bankAccount.getId());
                    break;

                case "Deposit":
                    int accID = Integer.parseInt(input[1]);
                    double money = Double.parseDouble((input[2]));

                    if (accounts.containsKey(accID)){
                        BankAccount bankAccount1 = accounts.get(accID);
                        bankAccount1.deposit(money);
                        accounts.put(accID, bankAccount1);
                        result = String.format(Locale.US,"Deposited %.0f to ID%d",money, accID);
                    } else {
                        result = "Account does not exist";
                    }
                    break;
                case "SetInterest":
                    double IntRatte = Double.parseDouble(input[1]);
                    BankAccount.setIntRate(IntRatte);
                    break;
                case "GetInterest":
                    int accoutID = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (accounts.containsKey(accoutID)){
                        BankAccount bankAccount1 = accounts.get(accoutID);
                      double totalInterest = bankAccount1.getInterest(years);

                        result = String.format(Locale.US,"%.2f", totalInterest);
                    } else {
                        result = "Account does not exist";
                    }
                    break;
            }
        if (!result.isEmpty()) {
            System.out.println(result);
        }
           input = scanner.nextLine().split(" ");
           command = input[0];
       }





    }
}
