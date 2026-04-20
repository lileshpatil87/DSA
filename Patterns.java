class Patterns {
    public static void main(String args[]) {

        System.out.println("Star Pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Inverted Star Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Characters Pattern");
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Hollow Rectangle Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Inverted and Rotated Half Pyramid Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j >= (n - i) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Floyd's Triangle");
        int cn = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cn++ + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Butterfly Pattern");

        n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i <= n / 2) {
                    if (j <= i)
                        System.out.print("* ");
                    else if (j >= (n - i) + 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else {
                    if (j <= (n - i) + 1)
                        System.out.print("* ");
                    else if (j >= i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

        n = 5;
        System.out.println();
        System.out.println();

        System.out.println("Solid Rhombus Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= (n - i) + 1)
                    System.out.print(" ");
                else {
                    for (int k = 1; k <= n; k++)
                        System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Hollow Rhombus Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < (n - i) + 1)
                    System.out.print(" ");
                else {
                    for (int k = 1; k <= n; k++) {
                        if (i == 1 || i == n || k == 1 || k == n)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    break;
                }
            }
            System.out.println();
        }

        n=7;
        System.out.println();
        System.out.println();

        System.out.println("Diamond Pattern");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j <= Math.abs((n / 2 - i) + 1))
                    System.out.print(" ");
                else if (j <= n - Math.abs((n / 2 - i) + 1))
                    System.out.print("*");
            }
            System.out.println();
        }

    }

}