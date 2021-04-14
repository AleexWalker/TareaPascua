public class Ejercicio1 {
    public static void main(String[] args) {

        double num = 3.5;

        //int x = Math.round(num);    //  x = 4
        int x = (int) Math.round(num);
        System.out.println(x);
        //int y = Math.ceil(num);        // y = 4
        int y = (int) Math.ceil(num);
        System.out.println(y);
        //int z = Math.floor(num);      //  z = 3
        int z = (int) Math.floor(num);
        System.out.println(z);

        int num1;
        char c;
        num1 = (int) 'A';                //num = 65
        System.out.println(num1);
        c = (char) 65;                    // c = ‘A’
        System.out.println(c);
        c = (char) ((int) 'A' + 1);  // c = ’B’
        System.out.println(c);

        String cad = "100";
        byte numByte = Byte.parseByte(cad);
        System.out.println(numByte);
        short numShort = Short.parseShort(cad);
        System.out.println(numShort);
        Integer numInteger = Integer.parseInt(cad);
        System.out.println(numInteger);
        long numLong = Long.parseLong(cad);
        System.out.println(numLong);
        float numFloat = Float.parseFloat(cad);
        System.out.println(numFloat);
        double numDouble = Double.parseDouble(cad);
        System.out.println(numDouble);

        String cadena = "5";
        byte n = Byte.parseByte(cadena);
        System.out.println(cadena);

    }
}
