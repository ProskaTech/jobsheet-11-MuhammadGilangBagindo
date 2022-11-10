package jobsheet11;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

public class B extends A {
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai();//memanggil method dalam kelas A
        System.out.println("Nilai b = " + getB());
    }
}
