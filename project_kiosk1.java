import java.util.Scanner;
public class project_kiosk1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fries;
        fries = pickFries();
        int pizza;
        pizza = pickPizza();
        int burger;
        burger = pickBurger();

    }

    public static void showMenu() {
        System.out.println("===== Food =====");
        System.out.println("   F - Fries");
        System.out.println("   P - Pizza");
        System.out.println("   B - Burger");
        System.out.println("================");
    }

    public static int pickFries() {
        Scanner sc = new Scanner(System.in);

        System.out.println("============= Fries size ============");
        System.out.println("     1 - Regular size = 35 Pesos");
        System.out.println("     2 - Large size = 55 Pesos");
        System.out.println("     3 - Jumbo size = 75 Pesos");
        System.out.println("     4 - Big size = 145 Pesos");
        System.out.println("=====================================");
        System.out.print("What Size Do You Want?: ");
        int fries = sc.nextInt();
        if (fries == 1) {
            System.out.println("Fries: [Regular size]\n");
            System.out.println("====== Available Flavors ======");
            System.out.println("          1 - Barbeque");
            System.out.println("          2 - Cheese");
            System.out.println("          3 - Sour Cream");
            System.out.println("===============================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor1 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm1 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment1;
            payment1 = Hm1 * 35;
            System.out.printf("        Total = [%d Pesos]", payment1);
            System.out.print("\nEnter Amount To Pay: ");
            int amount1 = sc.nextInt();
            int change1 = amount1 - payment1;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Fries");
            System.out.println("Regular Size");
            switch (flavor1) {
                case 1:
                    System.out.print("Barbeque flavor");
                    break;
                case 2:
                    System.out.print("Cheese flavor");
                    break;
                case 3:
                    System.out.print("Sour Cream flavor");
                    break;
            }
            System.out.printf("\n                  %d x 35 Pesos ", Hm1);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment1);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment1);
            System.out.printf("\nCASH                   %d.00", amount1);
            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
        } else if (fries == 2) {
            System.out.println("Fries: [Large size]\n");
            System.out.println("====== Available Flavors ======");
            System.out.println("          1 - Barbeque");
            System.out.println("          2 - Cheese");
            System.out.println("          3 - Sour Cream");
            System.out.println("===============================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor2 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm2 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment2;
            payment2 = Hm2 * 55;
            System.out.printf("        Total = [%d Pesos]", payment2);
            System.out.print("\nEnter Amount To Pay: ");
            int amount2 = sc.nextInt();
            int change2 = amount2 - payment2;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Fries");
            System.out.println("Large Size");
            switch (flavor2) {
                case 1:
                    System.out.print("Barbeque flavor");
                    break;
                case 2:
                    System.out.print("Cheese flavor");
                    break;
                case 3:
                    System.out.print("Sour Cream flavor");
                    break;
            }
            System.out.printf("\n                  %d x 55 Pesos ", Hm2);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment2);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment2);
            System.out.printf("\nCASH                   %d.00", amount2);
            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
        } else if (fries == 3) {
            System.out.println("Fries: [Jumbo size]\n");
            System.out.println("====== Available Flavors ======");
            System.out.println("          1 - Barbeque");
            System.out.println("          2 - Cheese");
            System.out.println("          3 - Sour Cream");
            System.out.println("===============================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor3 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm3 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment3;
            payment3 = Hm3 * 75;
            System.out.printf("        Total = [%d Pesos]", payment3);
            System.out.print("\nEnter Amount To Pay: ");
            int amount3 = sc.nextInt();
            int change3 = amount3 - payment3;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Fries");
            System.out.println("Jumbo Size");
            switch (flavor3) {
                case 1:
                    System.out.print("Barbeque flavor");
                    break;
                case 2:
                    System.out.print("Cheese flavor");
                    break;
                case 3:
                    System.out.print("Sour Cream flavor");
                    break;
            }
            System.out.printf("\n                  %d x 75 Pesos ", Hm3);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm3);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment3);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment3);
            System.out.printf("\nCASH                   %d.00", amount3);
            System.out.printf("\nCHANGE                  %d.00\n\n", change3);
        } else if (fries == 4) {
            System.out.println("Fries: [Big size]\n");
            System.out.println("====== Available Flavors ======");
            System.out.println("          B - Barbeque");
            System.out.println("          C - Cheese");
            System.out.println("          S - Sour Cream");
            System.out.println("===============================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor4 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm4 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment4;
            payment4 = Hm4 * 145;
            System.out.printf("        Total = [%d Pesos]", payment4);
            System.out.print("\nEnter Amount To Pay: ");
            int amount4 = sc.nextInt();
            int change4 = amount4 - payment4;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Fries");
            System.out.println("Regular Size");
            switch (flavor4) {
                case 1:
                    System.out.print("Barbeque flavor");
                    break;
                case 2:
                    System.out.print("Cheese flavor");
                    break;
                case 3:
                    System.out.print("Sour Cream flavor");
                    break;
            }
            System.out.printf("\n                  %d x 145 Pesos ", Hm4);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm4);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment4);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment4);
            System.out.printf("\nCASH                   %d.00", amount4);
            System.out.printf("\nCHANGE                  %d.00\n\n", change4
            );
        }
        return fries;
    }

    public static int pickPizza() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Pizza Size ===============");
        System.out.println("      1 = Pizza 9 Inches = 95 Pesos");
        System.out.println("      2 = Pizza 11 Inches = 175 Pesos");
        System.out.println("==========================================");
        System.out.print("What Size Do You Want?: ");
        int pizza = sc.nextInt();
        if (pizza == 1) {
            System.out.println("Pizza: [9 Inches Size]\n");
            System.out.println("=============== Pizza Flavor ===============");
            System.out.println("               1 - Hawaiian");
            System.out.println("               2 - All Peperoni");
            System.out.println("               3 - Beef & Mushroom");
            System.out.println("               4 - Ham & Cheese");
            System.out.println("============================================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor1 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm1 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment1;
            payment1 = Hm1 * 95;
            System.out.printf("        Total = [%d Pesos]", payment1);
            System.out.print("\nEnter Amount To Pay: ");
            int amount1 = sc.nextInt();
            int change1 = amount1 - payment1;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Pizza");
            System.out.println("9 Inches Size");
            switch (flavor1) {
                case 1:
                    System.out.print("Hawaiian flavor");
                    break;
                case 2:
                    System.out.print("All Peperoni flavor");
                    break;
                case 3:
                    System.out.print("Beef & Mushroom flavor");
                    break;
                case 4:
                    System.out.print("Ham & Cheese flavor");
                    break;
            }
            System.out.printf("\n                  %d x 95 Pesos ", Hm1);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment1);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment1);
            System.out.printf("\nCASH                   %d.00", amount1);
            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
        } else if (pizza == 2) {
            System.out.println("Pizza: [11 Inches Size]\n");
            System.out.println("=============== Pizza Flavor ===============");
            System.out.println("               1 - Hawaiian");
            System.out.println("               2 - All Peperoni");
            System.out.println("               3 - Beef & Mushroom");
            System.out.println("               4 - Ham & Cheese");
            System.out.println("============================================");
            System.out.print("What Flavor Do You Want?: ");
            int flavor2 = sc.nextInt();
            System.out.print("How many?: ");
            int Hm2 = sc.nextInt();
            System.out.println("-------------------------------");
            int payment2;
            payment2 = Hm2 * 175;
            System.out.printf("        Total = [%d Pesos]", payment2);
            System.out.print("\nEnter Amount To Pay: ");
            int amount2 = sc.nextInt();
            int change2 = amount2 - payment2;
            System.out.println("-------------------------------");
            System.out.println("\n            MR CD                      ");
            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
            System.out.println("      ISLAND CENTRAL MALL       ");
            System.out.println(" Mactan Pusok Lapu - lapu City ");
            System.out.println("\nVAT REG TIN:010-057-617-103");
            System.out.println("    MIN: 20121215011430195");
            System.out.println("       S/N:LAPTOP DELL");
            System.out.println("  --------------------------");
            System.out.println("      **SALES INVOICE**         ");
            System.out.println("\nINVOICE#:0000-0000302823");
            System.out.println("-------------------------------");
            System.out.println("Pizza");
            System.out.println("11 Inches Size");
            switch (flavor2) {
                case 1:
                    System.out.print("Hawaiian flavor");
                    break;
                case 2:
                    System.out.print("All Peperoni flavor");
                    break;
                case 3:
                    System.out.print("Beef & Mushroom flavor");
                    break;
                case 4:
                    System.out.print("Ham & Cheese flavor");
                    break;
            }
            System.out.printf("\n                  %d x 175 Pesos ", Hm2);
            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
            System.out.println("\n-------------------------------");
            System.out.printf("SUBTOTAL                   %d\n", payment2);
            System.out.println("VATABLE SALES              0.00");
            System.out.println("VAT AMT                    0.00");
            System.out.println("VAT EXEMPT SALES           0.00");
            System.out.println("ZERO RATED SALES           0.00");
            System.out.println("-------------------------------");
            System.out.printf("Total               PHP %d.00 ", payment2);
            System.out.printf("\nCASH                   %d.00", amount2);
            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
        }
        return pizza;
    }

    public static int pickBurger() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================= Burger =================");
        System.out.println("             1 = Solo");
        System.out.println("             2 = Buy 2 Take 1");
        System.out.println("==========================================");
        System.out.print("Enter your desired option: ");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Burger: [Solo]\n");
            System.out.println("================= Burger Menu =================");
            System.out.println("          1. Ham Burger = 30 Pesos");
            System.out.println("          2. Beef Patty Burger = 25 Pesos");
            System.out.println("          3. Beef with Egg Burger = 35 Pesos");
            System.out.println("          4. Ham with Egg Burger = 40 Pesos");
            System.out.println("===============================================");
            System.out.print("Enter your desired burger: ");
            int burger1 = sc.nextInt();

            switch (burger1) {
                case 1:
                    System.out.println("[Ham Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 10 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese1 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm1 = sc.nextInt();

                    switch (cheese1) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm1 * 40;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham Burger with Cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 40 Pesos ", Hm1);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm1 * 30;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 30 Pesos ", Hm1);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 2:
                    System.out.println("[Beef Patty Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 10 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese2 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm2 = sc.nextInt();

                    switch (cheese2) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm2 * 35;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef Patty Burger with Cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 35 Pesos ", Hm2);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm2 * 25;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef Patty Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 25 Pesos ", Hm2);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 3:
                    System.out.println("[Beef with Egg Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 10 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese3 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm3 = sc.nextInt();

                    switch (cheese3) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm3 * 45;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef with Egg Burger with cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 45 Pesos ", Hm3);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm3);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm3 * 35;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef with Egg Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 35 Pesos ", Hm3);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm3);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 4:
                    System.out.println("[Ham with Egg Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 10 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese4 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm4 = sc.nextInt();

                    switch (cheese4) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm4 * 50;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham with Egg Burger with cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 50 Pesos ", Hm4);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm4);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm4 * 40;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham with Egg Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 40 Pesos ", Hm4);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm4);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
            }
        } else if (option == 2) {
            System.out.println("Burger: [Buy 2 Take 1]\n");
            System.out.println("================= Burger Menu =================");
            System.out.println("          1. Ham Burger = 60 Pesos");
            System.out.println("          2. Beef Patty Burger = 50 Pesos");
            System.out.println("          3. Beef with Egg Burger = 75 Pesos");
            System.out.println("          4. Ham with Egg Burger = 80 Pesos");
            System.out.println("===============================================");
            System.out.print("Enter your desired burger: ");
            int burger2 = sc.nextInt();

            switch (burger2) {
                case 1:
                    System.out.println("[Ham Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 20 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese1 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm1 = sc.nextInt();

                    switch (cheese1) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm1 * 80;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham Burger with Cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 80 Pesos ", Hm1);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm1 * 60;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 60 Pesos ", Hm1);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm1);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 2:
                    System.out.println("[Beef Patty Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 20 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese2 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm2 = sc.nextInt();

                    switch (cheese2) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm2 * 70;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef Patty Burger with Cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 70 Pesos ", Hm2);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm2 * 50;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef Patty Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 50 Pesos ", Hm2);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm2);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 3:
                    System.out.println("[Beef with Egg Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 20 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese3 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm3 = sc.nextInt();

                    switch (cheese3) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm3 * 95;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef with Egg Burger with cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 95 Pesos ", Hm3);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm3);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm3 * 75;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Beef with Egg Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 75 Pesos ", Hm3);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm3);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
//----------------------------------------------------------------------------------------------------------------------
                case 4:
                    System.out.println("[Ham with Egg Burger]\n");
                    System.out.println("============ Cheese ============");
                    System.out.println("     1. With Cheese = 20 Pesos");
                    System.out.println("     2. Without Cheese");
                    System.out.println("==============================");
                    System.out.print("Enter your desired option: ");
                    int cheese4 = sc.nextInt();
                    System.out.print("How many: ");
                    int Hm4 = sc.nextInt();

                    switch (cheese4) {
                        case 1:
                            System.out.println("-------------------------------");
                            int payment1;
                            payment1 = Hm4 * 100;
                            System.out.printf("        Total = [%d Pesos]", payment1);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount1 = sc.nextInt();
                            int change1 = amount1 - payment1;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham with Egg Burger with cheese");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 100 Pesos ", Hm4);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm4);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment1);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment1);
                            System.out.printf("\nCASH                   %d.00", amount1);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change1);
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            int payment2;
                            payment2 = Hm4 * 80;
                            System.out.printf("        Total = [%d Pesos]", payment2);
                            System.out.print("\nEnter Amount To Pay: ");
                            int amount2 = sc.nextInt();
                            int change2 = amount2 - payment2;
                            System.out.println("-------------------------------");
                            System.out.println("\n            MR CD                      ");
                            System.out.println("\n  BRICOLAGE PHILIPPINES INC.  ");
                            System.out.println("      ISLAND CENTRAL MALL       ");
                            System.out.println(" Mactan Pusok Lapu - lapu City ");
                            System.out.println("\nVAT REG TIN:010-057-617-103");
                            System.out.println("    MIN: 20121215011430195");
                            System.out.println("       S/N:LAPTOP DELL");
                            System.out.println("  --------------------------");
                            System.out.println("      **SALES INVOICE**         ");
                            System.out.println("\nINVOICE#:0000-0000302823");
                            System.out.println("-------------------------------");
                            System.out.println("Ham with Egg Burger");
                            System.out.println("Solo");
                            System.out.printf("\n                  %d x 80 Pesos ", Hm4);
                            System.out.printf("\nItem(s) : 1         Qty(s) : %d", Hm4);
                            System.out.println("\n-------------------------------");
                            System.out.printf("SUBTOTAL                   %d\n", payment2);
                            System.out.println("VATABLE SALES              0.00");
                            System.out.println("VAT AMT                    0.00");
                            System.out.println("VAT EXEMPT SALES           0.00");
                            System.out.println("ZERO RATED SALES           0.00");
                            System.out.println("-------------------------------");
                            System.out.printf("Total               PHP %d.00 ", payment2);
                            System.out.printf("\nCASH                   %d.00", amount2);
                            System.out.printf("\nCHANGE                  %d.00\n\n", change2);
                            break;
                    }
                    break;
            }
        }
        return option;
    }

}
