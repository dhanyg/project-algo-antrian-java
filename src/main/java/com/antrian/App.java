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
                    nomorAntri = antrianReguler.get(0);
                    antrianReguler.remove(0);
                    antrianSelesai.add(nomorAntri);
                    System.out.println("Nomor antrian " + nomorAntri + " telah selesai dilayani");
                    break;
                case 2:
                    // TODO: menghapus nomor antrian dari antrianReguler dan
                    // menambahkannya ke antrianPending
                    nomorAntri = antrianReguler.get(0);
                    antrianReguler.remove(0);
                    antrianPending.add(nomorAntri);
                    System.out.println("Nomor antrian " + nomorAntri + " telah ditambahkan ke antrian pending");
                    break;
                case 3:
                    // TODO :
                    // menampilkan antrianPending
                    // melakukan pencarian nomor antrian pada antrianPending
                    if (antrianPending.size() < 1) {
                        System.out.println("TIDAK ADA ANTRIAN PENDING");
                        break;
                    }

                    boolean ulangi = true;
                    while (ulangi) {
                        System.out.println("DAFTAR NOMOR ANTRIAN PENDING:");
                        for (Integer nomor : antrianPending) {
                            System.out.print(nomor + " ");
                        }
                        System.out.println();
                        System.out.println("[0] Kembali");
                        System.out.println("[1] Pilih nomor antrian");
                        System.out.print("Pilihan aksi: ");
                        pilihan = input.nextInt();

                        switch (pilihan) {
                            case 0:
                                ulangi = false;
                                break;
                            case 1:
                                System.out.print("Input nomor antrian: ");
                                nomorAntri = input.nextInt();

                                if (antrianPending.indexOf(nomorAntri) < 0) {
                                    System.out.println("NOMOR ANTRIAN TIDAK DITEMUKAN");
                                    break;
                                }

                                int indexNomorAntri = antrianPending.indexOf(nomorAntri);
                                antrianPending.remove(indexNomorAntri);
                                antrianSelesai.add(nomorAntri);

                                System.out.println("Nomor antrian " + nomorAntri
                                        + " telah dihapus dari antrian pending dan telah dimasukkan ke dalam antrian selesai.");
                                ulangi = false;
                                break;
                            default:
                                break;
                        }
                    }
                default:
                    break;
            }
        }
    }
}
