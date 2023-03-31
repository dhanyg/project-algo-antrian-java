package com.antrian;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> antrianReguler = new ArrayList<Integer>();
        ArrayList<Integer> antrianPending = new ArrayList<Integer>();
        ArrayList<Integer> antrianSelesai = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int pilihan, nomorAntri;

        /*
         * Menginisialisasi isi array antrianReguler
         * membuat nomor antrian 1-100
         */
        for (int i = 0; i < 100; i++) {
            antrianReguler.add(i + 1);
        }

        /*
         * Menampilkan nomor urut antrian
         * dan menu pilihan aksi
         */
        while (antrianReguler.size() > 0) {
            System.out.println("Nomor urut antrian saat ini adalah: " + antrianReguler.get(0));
            System.out.println("Jumlah antrian pending saat ini: " + antrianPending.size());
            System.out.println("[1] Ambil antrian");
            System.out.println("[2] Lewati antrian");
            System.out.println("[3] Lihat antrian pending");
            System.out.print("Pilihan aksi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // TODO: menghapus nomor antrian dari antrianReguler dan
                    // menambahkannya ke antrianSelesai
                    break;
                case 2:
                    // TODO: menghapus nomor antrian dari antrianReguler dan
                    // menambahkannya ke antrianPending
                    break;
                case 3:
                    // TODO :
                    // menampilkan antrianPending
                    // melakukan pencarian nomor antrian pada antrianPending
                    break;
                default:
                    break;
            }
        }
    }
}
