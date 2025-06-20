import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {
    private String fileName = "accounts.txt";

    public void saveAccount(Account account) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode
            writer.write(account.getIDOfCustomer() + "," +
                    account.getNameOfCustomer() + "," +
                    account.getBalanceOfCustomer() + "," +
                    account.getPasswordOfCustomer() + "\n");
            writer.close();
            System.out.println("Account saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving account: " + e.getMessage());
        }
    }

    public Account findAccount(String id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    reader.close();
                    return new Account(parts[1], Float.parseFloat(parts[2]), parts[3], parts[0]);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading account: " + e.getMessage());
        }
        return null;
    }

    public Account findAccountByName(String name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(name)) {
                    reader.close();
                    return new Account(parts[1], Float.parseFloat(parts[2]), parts[3], parts[0]);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading account: " + e.getMessage());
        }
        return null;
    }
}
