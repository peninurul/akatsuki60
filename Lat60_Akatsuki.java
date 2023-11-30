/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 60
 */
class Character {
    // Kelas Dasar Character
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hai, nama saya " + name);
    }

    // Polimorfisme: Metode ini dapat dioverride oleh kelas anak
    public void performAction() {
        System.out.println("Melakukan aksi umum.");
    }
}

// Kelas Anak AkatsukiMember sebagai turunan dari Character
class AkatsukiMember extends Character {
    private String role;

    public AkatsukiMember(String name, String role) {
        super(name);
        this.role = role;
    }

    // Override metode introduce dari kelas Character
    @Override
    public void introduce() {
        System.out.println("Hai, saya anggota Akatsuki. Nama saya " + name + ". Peran saya: " + role);
    }

    // Override metode performAction untuk menunjukkan polimorfisme
    @Override
    public void performAction() {
        System.out.println("Melakukan aksi khas Akatsuki.");
    }
}

// Kelas Main untuk menjalankan program
public class Lat60_Akatsuki {
    public static void main(String[] args) {
        // Polimorfisme: Objek AkatsukiMember dapat disimpan dalam array Character
        Character[] characters = new Character[2];
        characters[0] = new AkatsukiMember("Itachi Uchiha", "Jurus Api");
        characters[1] = new AkatsukiMember("Kisame Hoshigaki", "Pengguna Pedang Samehada");

        // Memanggil metode introduce dan performAction sesuai polimorfisme
        for (Character character : characters) {
            character.introduce();
            character.performAction();
            System.out.println(); // Spasi antara karakter
        }
    }
}