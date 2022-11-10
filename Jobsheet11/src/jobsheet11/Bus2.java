package jobsheet11;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks seharusnya : " + maxPenumpang);
    }
}
