/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan8;
/**
 *
 * @author bhanu
 */
public class HitungHari {

    

    public static int hitung(int tahun, String bulan) {
        int jum_hari;

        if (bulan.equals("Februari")) {
            if ((tahun % 4 == 0) && !(tahun % 100 == 0) || (tahun % 4 == 0)) {
                jum_hari = 29;
            } else {
                jum_hari = 28;
            }
        } else if (bulan.equals("April") || bulan.equals("Juni") || bulan.equals("September") || bulan.equals("November")) {
            jum_hari = 30;
        } else {
            jum_hari = 31;
        }

        return jum_hari;
    }
}
