package Matrix;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        //1
        int row, col;
        
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextInt();
        
        //3
        System.out.println("Enter total number of columns : ");
        col = scanner.nextInt();
        
        //4
        int inputArray[][] = new int[row][col];
        
        //5
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
                inputArray[i][j] = scanner.nextInt();
            }
        }
        
        //6
        System.out.println("You have entered : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(inputArray[i][j] + "\t");
            }
            System.out.println();
        }
        
        //7
        int sum=0;
        System.out.println("The boundary elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print(inputArray[i][j] + "\t");
                    sum=sum+inputArray[i][j];
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
        System.out.println(sum);
        
        
        
         sum=0;
        System.out.println("The second boundary elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 1 || j == 1 || i == row - 2 || j == col - 2) {
                	if (i != 0 && j != 0 && i != row - 1 && j != col - 1) {
                    System.out.print(inputArray[i][j] + "\t");
                    sum=sum+inputArray[i][j];
                	}
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
