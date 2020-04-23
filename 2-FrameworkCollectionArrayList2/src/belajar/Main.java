package belajar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        // menambah data
        data.add(1);
        data.add(2);

        // memasukkan data ke index 1 dan index 1 otomatis jadi index 2 (bergeser)
        data.add(0,2);
        data.add(1,1);

        // mengurutkan data
        Collections.sort(data);

        // menghapus data
        data.remove(1);
        // hapus semua data
        data.clear();
        data.removeAll(data);

        // set data di index tertentu
        data.set(1,12);

        // ambil data per index
        System.out.println(data.get(4));
        // melihat tampungan data
        System.out.println(data.size());

        // cek sebuah data ada atau tidak
        boolean test = data.contains(2);
        if(test != false){


            System.out.println(test);
        }else{
            System.out.println("Data tidak ada");
        }

        // menampilkan data dengan forEach
        if(data.isEmpty()){
            data.forEach((show) -> {
                System.out.println(show);
            });
        }




    }
}
