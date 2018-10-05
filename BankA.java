
public class BankA {

    public static void main(String[] args) {
        nasabah n=new nasabah();
        final String Bank = "Bank A";
        System.out.println( "nama bank =" +Bank);
        nasabah.noAntrian++;
        System.out.println(n.noAntrian);

        n.nasabah("Mila Haryani");
        n.tabungan(500000);
        n.ambilUang(270000);

        System.out.println(n.getSaldo());
        System.out.println();
        nasabah n1=new nasabah();
        nasabah.noAntrian++;
        System.out.println(n1.noAntrian);
        n1.nasabah("kiki renaldi");
        n1.tabungan(350000);
        n1.ambilUang(70000);
        n1.ambilUang(10000);
    
    }
    
}
