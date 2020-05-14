package com.example.modul6;

public class Konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IPKOMPUTER DIMANA DATA PHP BERADA
    private static final String address = "http://192.168.43.215/modul6";
    public static final String URL_ADD = address + "/insert.php";
    public static final String URL_GET_ALL = address + "/read.php";
    public static final String URL_GET_MHS = address + "/select.php?id=";
    public static final String URL_UPDATE_MHS = address + "/update.php";
    public static final String URL_DELETE_MHS = address + "/delete.php?id=";
    //Dibawah ini merupakan Kunci yang akan digunakan untukmengirim permintaan ke Script PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";
    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";
    //ID Mahasiswa
    //mhs itu singkatan dari Mahasiswa
    public static final String MHS_ID = "mhs_id";
}