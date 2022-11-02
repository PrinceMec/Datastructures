import java.util.*;

public class ComputerNumbersOperations {

    public static void decimalToHexadecimal(int decimalInput){
        int[] hexa = new int[30];
        int index = 0;

        while(decimalInput > 0){
           
            hexa[index++] = decimalInput%16;
            decimalInput = decimalInput/16;
        }

        for(int i=index; i>=0; i--){
            System.out.print(hexa[i]);
        }
    }
    
    public static void decimalToBinary(int decimalInput){
        int[] binary = new int[30];
        int index = 0;

        while(decimalInput > 0){
           
            binary[index++] = decimalInput%2;
            decimalInput = decimalInput/2;
        }

        for(int i=index; i>=0; i--){
            System.out.print(binary[i]);
        }
    }
    
    public static void decimalToOctal(int decimalInput){
        int[] octal = new int[30];
        int index = 0;

        while(decimalInput > 0){
            octal[index++] = decimalInput%8;
            decimalInput = decimalInput/8;
        }

        for(int i=index-1; i>=0; i--){
            System.out.print(octal[i]);
        }
    }
    
    public static void binaryToDecimal(int binaryInput){
        
        int decimal = 0;
        int power = 0;

        while(true){
            if(binaryInput == 0){
                break;
            }
            else{
                int temp = binaryInput%10; 
                decimal += temp*Math.pow(2,power);
                binaryInput = binaryInput/10;
                power++;
            }
           
        }

        
        System.out.println(decimal);
    }
    
    public static void binaryToHexa(int binaryInput){
        int decimal = 0;
        int power = 0;

        while(true){
            if(binaryInput == 0){
                break;
            }
            else{
                int temp = binaryInput%10; 
                decimal += temp*Math.pow(2,power);
                binaryInput = binaryInput/10;
                power++;
            }
           
        }
        int conversionToHexa = decimal;


        //Decimal to hexa
        int hexa = 0;
        int index = 0;

        while(conversionToHexa > 0){
           
            hexa = hexa + conversionToHexa%16;
            conversionToHexa = conversionToHexa/16;
        }

        System.out.println(hexa);

    }
    
    public static void binaryToOctal(int binaryInput){
        int decimal = 0;
        int power = 0;

        while(true){
            if(binaryInput == 0){
                break;
            }
            else{
                int temp = binaryInput%10; 
                decimal += temp*Math.pow(2,power);
                binaryInput = binaryInput/10;
                power++;
            }
           
        }
        int conversionToOctal = decimal;


        //Decimal to octal
        int octal = 0;
        
        while(conversionToOctal > 0){
           
            octal = octal + conversionToOctal%8;
            conversionToOctal = conversionToOctal/8;
        }

        System.out.print(octal);
        

      
    }
    
    public static void octalToDecimal(int octalInput){
        int decimal = 0;
        int power = 0;
        while(octalInput !=  0){
            int temp = octalInput%10;
            decimal = decimal + temp*Math.pow(8, power);
            octalInput = octalInput/10;
            power++;
        }
        System.out.print(decimal);
}

    public static void octalToBinary(int octalInput){
        int decimal = 0;
        int power = 0;
        while(octalInput > 0){
            int temp = octalInput%10;
            decimal = decimal + temp*Math.pow(8,power);
            octalInput = octalInput/10;
            power++;

        }
        System.out.println(decimal);
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        octalToBinary(input);
    }

}