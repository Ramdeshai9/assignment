
# Hollow-square-with-name-written-in-it.

This is a simple java program written only by using for loops and if else statements.
Two for loops are written one for row and the other for column.

for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
since we need a hollow square, we have used if else loops for conditions

  if ((i == 1 && j == 1) || (i == 1 && j == n) || (i == m && j == 1) || (i == m && j == n))
                    System.out.print("+");

                else if (i == 1 || i == m)
                    System.out.print("-");

                else if ((i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9)
                        && (j == 1 || j == n))
                    System.out.print("|");
The name given by the user must come in the last but one line and leaving one column space to the right
Following the above condition the code is written.

                else if (i == m - 2 && j == n - (name.length() + 2)) {
                    for (int k = 0; k < name.length(); k++)
                        System.out.print(name.charAt(k));
                    j = j + name.length() - 1;

 
