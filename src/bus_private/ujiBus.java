
package bus_private;


public class ujiBus {
     public static void main(String[] args) {
         //membuat objek busmini dari kelas bus
        Bus busmini = new Bus ();
        //memasukan nilai jumlah penumpang dan jumlah max penumpang ke
        //dalam objek busmini
        busmini.penumpang = 5;
        busmini.maxpenumpang = 15;
        //memanggil method cetak pada kelas bus
        busmini.cetak();
        //menambahkan penumpang pada busmini
        busmini.penumpang = busmini.penumpang+5;
        //memanggil method cetak pada kelas bus
        busmini.cetak();
        //mengurangi penumpang pada busmini
        busmini.penumpang = busmini.penumpang - 2;
        //memanggil method cetak pada kelas bus
        busmini.cetak();
        //menambahkan penumpang pada busmini
        busmini.penumpang= busmini.penumpang + 8;
        //memanggil method cetak pada kelas bus
        busmini.cetak();
        
    }
}
