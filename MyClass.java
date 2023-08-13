import java.util.Scanner;


public class MyClass {
    public static void main(String args[]) {
      // declaracoVariarveisExercicio1();
      // declaracoVariarveisExercicio2();
      // operadoresExpressoesExercicio1();
      // operadoresExpressoesExercicio2();
      // LeituraDadosExercicio1();
      // leituraDadosExercicio2();
      // leituraDadosExercicios3();
      StringExercicio1();
    }
    
    public static void declaracoVariarveisExercicio1()
    {
        //a.3 variáveis do tipo char;
        char c1 = 'A', c2 = 'B', c3 = 'C';
        //b.Duas variáveis capazes de guardar notas de um estudante;
        float nota1 = 15.5f, nota2 = 20f;
        //c.Um Variável capaz de guardar o sexo de um indivíduo. (Nota: suponha que o sexo só pode ser F ou M)
        char sexo = 'M';
        //d.	Um variável para guardar o número de olhos de todos os estudantes de uma turma;
        short numOlhos = 2;

        System.out.println(nota1);
    }
    
    public static void declaracoVariarveisExercicio2()
    {
        double double1 = 188.5;
        char char1 = 'A';
        float float1 = 48.5f;
        boolean boolean1 = true;
        long long1 = 12;
        int int1 = 12;
        byte byte1 = 127;
        
        System.out.println((byte)char1); // 68 Bytes
        System.out.println((char)byte1); // removido
        System.out.println((int)double1); // 188
        System.out.println((long)float1);// 48
        System.out.println((char)long1); // .
        System.out.println((char)double1); // ¼
    }
    
    public static void operadoresExpressoesExercicio1()
    {
        int x = 1 + 5*3/3;
        System.out.println(x); // 6
        
        int j = (3 + 5*3)/3;
        System.out.println(j); // 6
        
        int k = 4%3;
        System.out.println(k); // 1
        
        float f = 7/2;
        System.out.println(f); // 3.0
        
        int r = 7/2;
        System.out.println(r); // 3
        
        double d = (double) 7/2; 
        System.out.println(d); // 3.5
        
        double d1 = x + 7*r - 9;
        System.out.println(d1); // 18
        
        byte b = 8;
        System.out.println(b); // 8
        
        double d2 = (10/3) + (15/3);
        System.out.println(d2); // 8
    }
    
    public static void operadoresExpressoesExercicio2()
    {
        boolean b = !true;
        System.out.println(b); // false
        
        boolean c = true;
        System.out.println(c); // true
        
        boolean b2 = b && c;
        System.out.println(b2); // false
        
        boolean b3 = b && c || false;
        System.out.println(b3); // false
        
        boolean b4 = (b && c) || false;
        System.out.println(b4); // false
        
        boolean b5 = b && (c || false); 
        System.out.println(b5); //false
        
        int j = 12;
        System.out.println(j); // 12
        
        double r = 8, d = 10, k = 0;
        b = (r >=  8 && d != 7);
        System.out.println(b); // true
        
        boolean b6 = (k == 0 && true);
        System.out.println(b6); // true
        
        boolean b7 = (k != 0 && false);
        System.out.println(b7); // false
        
        boolean b8 = ( 12/5 == 2 || 7%3 != 1);
        System.out.println(b8); // true
    }
    
    
    public static void LeituraDadosExercicio1()
    {
        String txt1 = "PROGRAMACAO";
        byte n1 = 1;
        System.out.println(txt1 + " " + n1);
        
        short n2 = 001, n3 = 012, n4 = 123, n5 = 234;
        System.out.println(n2 + "\n" + n3 + "\n" + n4 + "\n" + n5);
        
        String txt2 = "01", txt3 = "UM";
        System.out.println("+--+--+");
        System.out.println("|" +  txt2 + "|" + txt3 +"|");
        System.out.println("+--+--+");
    }
    
    public static void leituraDadosExercicio2()
    {
        Scanner sc = new Scanner(System.in);
        char sexo = sc.next().charAt(0); 
        byte idade = sc.nextByte();
        
        System.out.println(">" + sexo + "><" + idade + "<"); 
        
    }
    
    public static void leituraDadosExercicios3()
    {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char c3 = sc.next().charAt(0);
        char c4 = sc.next().charAt(0);
        char c5 = sc.next().charAt(0);
        
        byte idade  = sc.nextByte();
        
        System.out.println("" + c1 + c2 + c3 + c4 + c5 +" : " + idade); 
    }
    
    public static void StringExercicio1()
    {
        
        String str1 = "Thomas " + "Ludis " + "Mukamba";
        System.out.println(str1); // Thomas Ludis Mukamba
        
        String str2 = "Lucas Ghustavus " + 1234;
        System.out.println(str2); // Lucas Ghustavus 1234
        
        String str3 = str1 + "," + "F" + "R" + "O" + "D" + " DURAN";
        System.out.println(str3); // Thomas Ludis Mukamba,FROD DURAN
        
        String nome1 = "Ludis Mathoza", nome2 = "Jana Matlhoza";
        
        nome1 = nome2;
        System.out.println(nome2); // Jana Matlhoza
        
        nome2 = nome1;
        System.out.println(nome2); // Jana Matlhoza
        
        double d = (12.0 + 1.0)/2;
        String strMedia = "Media: " + d;
        System.out.println(strMedia); //Media: 6.5
        
        int nota1 = 14, nota2 = 12;
        
        String strMedia1 = "Media ? " + nota1 + nota2;
        System.out.println(strMedia1); // Media ? 1412
        
        String strMedia2 = "Media ? " + (nota1 + nota2); 
        System.out.println(strMedia2); // Media ? 26
        
        String strBoolean = "Boolean : " + (nota1 != nota2);
        System.out.println(strBoolean); // Boolean : true
        
        String strBoolean2 = "Boolean : " + (nota1%nota2);
        System.out.println(strBoolean2); // Boolean : 2
    }
}