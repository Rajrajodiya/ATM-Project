import java.util.Scanner;

public class ATM {

    // ANSI color codes for console design
    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String BLUE = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(CYAN + """
                ╔══════════════════════════════════════════════════╗
                ║                                                  ║
                ║       💳  WELCOME TO SMART ATM SYSTEM 💳        ║
                ║                                                  ║
                ╚══════════════════════════════════════════════════╝
                """ + RESET);

        int pin = 1234;
        int attempts = 0;
        int balance = 100000;

        // Login Section
        while (attempts < 3) {
            System.out.print(YELLOW + "🔐 Enter your 4-digit PIN: " + RESET);
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println(GREEN + "\n✅ Login Successful!" + RESET);
                break;
            } else {
                attempts++;
                System.out.println(RED + "❌ Invalid PIN. Attempts left: " + (3 - attempts) + RESET);
            }
        }

        if (attempts == 3) {
            System.out.println(RED + "\n🚫 Your account has been locked for 24 hours due to 3 failed attempts." + RESET);
            sc.close();
            return;
        }

        // Menu Section
        boolean active = true;
        while (active) {
            System.out.println(BLUE + """
                    
                    ╔══════════════════════════════════════╗
                    ║          🏧  ATM MAIN MENU           ║
                    ╚══════════════════════════════════════╝
                    """ + RESET);

            System.out.println(CYAN + "1️⃣  Change PIN");
            System.out.println("2️⃣  Withdraw Money");
            System.out.println("3️⃣  Deposit Money");
            System.out.println("4️⃣  Check Balance");
            System.out.println("5️⃣  Exit" + RESET);

            System.out.print(YELLOW + "\n👉 Select an option (1–5): " + RESET);
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    System.out.print(YELLOW + "Enter your new 4-digit PIN: " + RESET);
                    String newPin = sc.next();

                    if (newPin.matches("\\d{4}")) {
                        pin = Integer.parseInt(newPin);
                        System.out.println(GREEN + "\n🔒 PIN changed successfully!" + RESET);
                    } else {
                        System.out.println(RED + "\n❌ PIN must contain exactly 4 digits (0–9)." + RESET);
                    }
                }

                case 2 -> {
                    System.out.print(YELLOW + "💰 Enter amount to withdraw: " + RESET);
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println(GREEN + "\n✅ Please collect your cash." + RESET);
                        System.out.println(BLUE + "💵 Remaining Balance: ₹" + balance + RESET);
                    } else {
                        System.out.println(RED + "\n❌ Insufficient Balance or Invalid Amount!" + RESET);
                    }
                }

                case 3 -> {
                    System.out.print(YELLOW + "💸 Enter amount to deposit: " + RESET);
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println(GREEN + "\n✅ Deposit Successful!" + RESET);
                        System.out.println(BLUE + "💵 Updated Balance: ₹" + balance + RESET);
                    } else {
                        System.out.println(RED + "\n❌ Invalid deposit amount!" + RESET);
                    }
                }

                case 4 -> {
                    System.out.println(GREEN + "📊 Your Current Balance: ₹" + balance + RESET);
                }

                case 5 -> {
                    System.out.println(MAGENTA + """
                            ╔══════════════════════════════════╗
                            ║   🙏 Thank You for Using ATM!    ║
                            ║   Have a Wonderful Day! 😊       ║
                            ╚══════════════════════════════════╝
                            """ + RESET);
                    active = false;
                }

                default -> System.out.println(RED + "⚠️  Invalid option! Please choose 1–5." + RESET);
            }
        }

        sc.close();
    }
}
