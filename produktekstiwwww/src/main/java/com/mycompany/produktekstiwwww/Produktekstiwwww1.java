/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produktekstiwwww;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Produktekstiwwww1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> produkTekstil = new ArrayList<>();
        
        // --- list produk awal ---
            produkTekstil.add("pakaian");
            produkTekstil.add("selimut");
            produkTekstil.add("celana jeans");
            produkTekstil.add("batik");
            
        // --- ini untuk login yachs ---
        
        // --- akun yang sudah ada  ---
        String usernameBenar = "ayawWw";
        String passwordBenar = "088022";

        // --- menambahkan akun ---
        ArrayList<String> daftarUsername = new ArrayList<>();
        ArrayList<String> daftarPassword = new ArrayList<>();

        boolean loginBerhasil = false;

        // --- pilihan menu login/registrasi ---
        boolean selesaiRegistrasi = false;
        while (!selesaiRegistrasi) {
            System.out.println("1. login".toUpperCase());
            System.out.println("2. registrasi".toUpperCase());
            System.out.print("pilih: ".toUpperCase());
            String pilih = input.nextLine();

                        switch (pilih) {
                            case "1" -> selesaiRegistrasi = true; // lanjut ke login
                            case "2" -> {
                                System.out.print("masukkan username baru: ".toUpperCase());
                                String userBaru = input.nextLine();
                                System.out.print("masukkan password baru: ".toUpperCase());
                                String passBaru = input.nextLine();
                                daftarUsername.add(userBaru);
                                daftarPassword.add(passBaru);
                                System.out.println("akun berhasil dibuat!\n".toUpperCase());
                    }
                            default -> System.out.println("pilihan tidak valid!".toUpperCase());
                        }
        }

        // --- proses login ---
        while (!loginBerhasil) {
            System.out.println("=== silahkan login untuk masuk ke dalam sistem manajemen produk tekstil ===".toUpperCase());
            System.out.print("Masukkan Username anda: ".toUpperCase());
            String username = input.nextLine();
            System.out.print("Masukkan Password anda: ".toUpperCase());
            String password = input.nextLine();

            // cek akun kalau make akun yg uda dibuat dr awal
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                loginBerhasil = true;
            } else {
                // cek akun kalau misal milih registrasi
                boolean ditemukan = false;
                for (int i = 0; i < daftarUsername.size(); i++) {
                    if (username.equals(daftarUsername.get(i)) && password.equals(daftarPassword.get(i))) {
                        ditemukan = true;
                        break;
                    }
                }

                if (ditemukan) {
                    loginBerhasil = true;
                } else {
                    System.out.println("username atau password yang kamu masukkan salah. silahkan coba lagi yaw~.\n".toUpperCase());
                }
            }

            if (loginBerhasil) {
                System.out.println(("login kamu berhasil! selamat datang " + username + "!").toUpperCase());
            }
        }

//        // gunakan ArrayList untuk menampung banyak akun
//        ArrayList<String> daftarUsername = new ArrayList<>();
//        ArrayList<String> daftarPassword = new ArrayList<>();
//
//        // akun default biar tetap bisa masuk
//        daftarUsername.add("ayawWw");
//        daftarPassword.add("088022");
//
//        boolean loginBerhasil = false;
//
//        // --- proses login ---
//        boolean selesaiRegistrasi = false;
//        while (!selesaiRegistrasi) {
//            System.out.println("1. Login");
//            System.out.println("2. Registrasi");
//            System.out.print("Pilih: ");
//            String pilih = input.nextLine();
//
//            if (pilih.equals("1")) {
//                selesaiRegistrasi = true; // lanjut ke proses login
//            } else if (pilih.equals("2")) {
//                System.out.print("Masukkan username baru: ");
//                String userBaru = input.nextLine();
//                System.out.print("Masukkan password baru: ");
//                String passBaru = input.nextLine();
//
//                daftarUsername.add(userBaru);
//                daftarPassword.add(passBaru);
//                System.out.println("Akun berhasil dibuat!\n");
//            } else {
//                System.out.println("Pilihan tidak valid!");
//            }
//        }

//        while (!loginBerhasil) {
//            System.out.println("=== silahkan login di sistem manajemen tekstil ===".toUpperCase());
//            System.out.print("Masukkan Username anda: ".toUpperCase());
//            String username = input.nextLine();
//            System.out.print("Masukkan Password anda: ".toUpperCase());
//            String password = input.nextLine();
//
//            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
//                System.out.println("login kamu berhasil! selamat datang " + username + "!".toUpperCase());
//                loginBerhasil = true;
//            } else {
//                System.out.println("username atau password salah, coba lagi.\n");
//            }
//        }

            // CRUD
            int pilihan;
            do {
                System.out.println("\n=== sistem manajemen produk tekstil ===".toUpperCase());
                System.out.println("1. Tambah Produk");
                System.out.println("2. Lihat Produk");
                System.out.println("3. Update Produk");
                System.out.println("4. Hapus Produk");
                System.out.println("5. Keluar");
                System.out.print("pilih menu: ".toUpperCase()); 
                
                // === validasi input menu hanya untuk int ===
                boolean validInput = false;
                pilihan = 0; 
                while (!validInput) {
                    System.out.print("pilih menu: ".toUpperCase());
                    if (input.hasNextInt()) {
                    pilihan = input.nextInt();
                    input.nextLine(); 
                    validInput = true;
                    } else {
                        System.out.println("angka yang ada masukkan salah! silahkan coba lagi ya~.".toUpperCase());
                        input.nextLine(); 
                    }
                }
                
                // create
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama produk tekstil: ".toUpperCase());
                        String produkBaru = input.nextLine();
                        produkTekstil.add(produkBaru);
                        System.out.println("Produk berhasil ditambahkan!".toUpperCase());
                    }
                    
                    // read
                    case 2 -> {
                        System.out.println("\n=== daftar produk tekstil ===".toUpperCase());
                        if (produkTekstil.isEmpty()) {
                            System.out.println("belum ada produk.".toUpperCase());
                        } else {
                            for (int i = 0; i < produkTekstil.size(); i++) {
                                System.out.println((i + 1) + ". " + produkTekstil.get(i).toUpperCase());
                            }
                        }
                    }
                    
                    // update
                    case 3 -> {
                        System.out.println("\n=== update produk ===".toUpperCase());
                        if (produkTekstil.isEmpty()) {
                            System.out.println("belum ada produk untuk diupdate.".toUpperCase());
                        } else {
                            for (int i = 0; i < produkTekstil.size(); i++) {
                                System.out.println((i + 1) + ". " + produkTekstil.get(i).toUpperCase());
                            }
                            System.out.print("pilih nomor produk yang mau diupdate: ".toUpperCase());
                            int indexUpdate = input.nextInt();
                            input.nextLine();
                            if (indexUpdate > 0 && indexUpdate <= produkTekstil.size()) {
                                System.out.print("masukkan nama produk baru: ".toUpperCase());
                                String produkUpdate = input.nextLine();
                                produkTekstil.set(indexUpdate - 1, produkUpdate);
                                System.out.println("produk berhasil diupdate!".toUpperCase());
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                    
                    // delete
                    case 4 -> {
                        System.out.println("\n=== hapus produk ===".toUpperCase());
                        if (produkTekstil.isEmpty()) {
                            System.out.println("belum ada produk untuk dihapus.".toUpperCase());
                        } else {
                            for (int i = 0; i < produkTekstil.size(); i++) {
                                System.out.println((i + 1) + ". " + produkTekstil.get(i).toUpperCase());
                            }
                            System.out.print("pilih nomor produk yang mau dihapus: ".toUpperCase());
                            int indexHapus = input.nextInt();
                            input.nextLine();
                            if (indexHapus > 0 && indexHapus <= produkTekstil.size()) {
                                produkTekstil.remove(indexHapus - 1);
                                System.out.println("produk berhasil dihapus!".toUpperCase());
                            } else {
                                System.out.println("nomor tidak valid.".toUpperCase());
                            }
                        }
                    }
                    
                    // out
                    case 5 -> System.out.println("keluar dari program...".toUpperCase());
                    
                    default -> System.out.println("pilihan tidak valid.".toUpperCase());
                    
                }
            } while (pilihan != 5);
        }
    }
}