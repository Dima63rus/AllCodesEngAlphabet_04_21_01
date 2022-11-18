public class Main {
    public static void main(String[] args) {
//        Собрать алфавит
        final char LCA = 'a';
        final char LCZ = 'z';
        final String lCCODE = " Code ";
        final String lCEQ = " = ";
        for (char i = LCA; i <= LCZ; i++) {
            int lvCode = (int) i;
            System.out.println(lCCODE + i + lCEQ + lvCode);
        }
    }
}
