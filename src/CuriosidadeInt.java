public class CuriosidadeInt {

    public static void main(String[] args) {

        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2);

        // -2147483648
        // -2147483648
        // Os números no java funcionam como uma roleta.
        // No memento que eu pego um limite, e somo com alguma coisa ele vai retornar negativo
    }
}
