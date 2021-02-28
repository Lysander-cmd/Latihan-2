
package bus_private;


public class ujiBus_ubah {
    public static void main(String[] args) {
        //membuat objek busbesar pada class Bus
        Bus busbesar = new Bus (40);
        busbesar.cetak();
        //penambahan penumpang
        busbesar.addpenumpang(15);//menambahkan 15 penumpang
        busbesar.cetak();
        
        busbesar.addpenumpang(5);//menambahkan 5 penumpang
        busbesar.cetak();
        
        busbesar.addpenumpang(26);//menambahkan 26 penumpang
        busbesar.cetak();
    }
}
