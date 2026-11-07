# SeleniumTest 

KELOMPOK 3

Proyek Java sederhana untuk menguji **Selenium WebDriver** dengan mengisi dan mengirimkan formulir pada halaman demo resmi Selenium.

## Deskripsi

Skrip pada proyek ini membuka halaman [Web Form Demo](https://www.selenium.dev/selenium/web/web-form.html), mengisi kolom teks, menekan tombol submit, lalu memverifikasi bahwa pesan `"Received!"` muncul setelah formulir berhasil dikirim.

## Prasyarat

- **Java** 25 atau lebih baru
- **Maven** 3.x
- **Google Chrome** terbaru
- ChromeDriver otomatis dikelola oleh Selenium WebDriver (tidak perlu diinstal manual)

## Instalasi & Menjalankan

```bash
cd SeleniumTest

# Menjalankan program
mvn compile exec:java -Dexec.mainClass="org.example.Main"
```

Atau jalankan langsung dari IDE (misalnya IntelliJ IDEA) dengan mengeksekusi kelas `org.example.Main`.

## Cara Kerja

1. Membuka browser Chrome dalam mode maximize.
2. Mengakses halaman `https://www.selenium.dev/selenium/web/web-form.html`.
3. Mengisi kolom teks `my-text` dengan string `"Selenium WebDriver Demo - Qin"`.
4. Mengklik tombol `Submit`.
5. Menunggu elemen dengan id `message` hingga terlihat (maksimal 10 detik).
6. Menampilkan hasil verifikasi di konsol:
   - `PASS: Form berhasil dikirim!` jika hasilnya `"Received!"`.
   - `FAIL: Hasil tidak sesuai.` jika hasilnya berbeda.
7. Menutup browser pada blok `finally`.

## Struktur Proyek

```
SeleniumTest/
├── pom.xml                          # Konfigurasi Maven & dependensi
└── src/main/java/org/example/
    └── Main.java                    # Skrip utama pengujian Selenium
```

## Dependensi

| Dependency        | Version | Deskripsi                              |
| ----------------- | ------- | -------------------------------------- |
| `selenium-java`   | 4.52.0  | Library Selenium WebDriver untuk Java  |

## Lisensi

Proyek ini dibuat untuk tujuan pembelajaran Software Quality Assurance (SQA).
