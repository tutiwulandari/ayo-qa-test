# Studi Kasus 2

## 1. Website AYO (https://ayo.co.id)

### Area yang Perlu Diuji

#### A. Registrasi dan Login

**Pengujian**
- Registrasi akun baru
- Login dengan akun valid
- Login dengan akun tidak valid
- Lupa password

**Mekanisme Pengujian**
- Functional Testing
- Negative Testing
- Automation Testing

---

#### B. Pencarian Venue

**Pengujian**
- Pencarian berdasarkan nama venue
- Pencarian berdasarkan lokasi
- Filter pencarian

**Mekanisme Pengujian**
- Functional Testing
- UI Testing
- Automation Testing

---

#### C. Detail Venue

**Pengujian**
- Informasi venue
- Jadwal venue
- Harga venue
- Ketersediaan slot

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing

---

#### D. Proses Booking

**Pengujian**
- Pemilihan jadwal
- Pemesanan venue
- Validasi ketersediaan slot
- Pencegahan double booking

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing
- Database Testing
- Automation Testing

---

#### E. Pembayaran

**Pengujian**
- Pembayaran berhasil
- Pembayaran gagal
- Pembayaran dibatalkan

**Mekanisme Pengujian**
- Integration Testing
- End-to-End Testing

---

#### F. Responsivitas Website

**Pengujian**
- Tampilan desktop
- Tampilan tablet
- Tampilan mobile

**Mekanisme Pengujian**
- Responsive Testing
- Cross Browser Testing

---

## 2. Aplikasi Mobile AYO

### Area yang Perlu Diuji

#### A. Registrasi dan Login

**Pengujian**
- Registrasi akun baru
- Login dengan akun valid
- Login dengan akun tidak valid
- Lupa password
- Logout

**Mekanisme Pengujian**
- Functional Testing
- Negative Testing
- Automation Testing

---

#### B. Profil Pengguna

**Pengujian**
- Melihat profil pengguna
- Mengubah data profil
- Mengubah foto profil
- Mengubah password

**Mekanisme Pengujian**
- Functional Testing
- UI Testing

---

#### C. Pencarian Venue

**Pengujian**
- Pencarian berdasarkan nama venue
- Pencarian berdasarkan lokasi
- Filter pencarian
- Sorting hasil pencarian

**Mekanisme Pengujian**
- Functional Testing
- UI Testing
- Automation Testing

---

#### D. Detail Venue

**Pengujian**
- Informasi venue
- Galeri foto venue
- Jadwal venue
- Harga venue
- Ketersediaan slot

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing

---

#### E. Booking Venue

**Pengujian**
- Pemilihan jadwal
- Pemesanan venue
- Validasi ketersediaan slot
- Pencegahan double booking
- Pembatalan booking

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing
- End-to-End Testing
- Automation Testing

---

#### F. Pembayaran

**Pengujian**
- Pembayaran berhasil
- Pembayaran gagal
- Pembayaran dibatalkan
- Validasi nominal pembayaran
- Validasi status pembayaran

**Mekanisme Pengujian**
- Integration Testing
- End-to-End Testing

---

#### G. Riwayat Booking

**Pengujian**
- Melihat daftar booking
- Detail booking
- Status booking

**Mekanisme Pengujian**
- Functional Testing
- UI Testing

---

#### H. Notifikasi

**Pengujian**
- Notifikasi booking berhasil
- Notifikasi pembayaran berhasil
- Notifikasi pembayaran gagal
- Deep link dari notifikasi

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing

---

#### I. Performa Aplikasi

**Pengujian**
- Waktu startup aplikasi
- Waktu loading halaman
- Penggunaan memori
- Stabilitas aplikasi

**Mekanisme Pengujian**
- Performance Testing

---

#### J. Kompatibilitas Perangkat

**Pengujian**
- Android berbagai versi
- iOS berbagai versi
- Berbagai ukuran layar
- Orientasi portrait dan landscape

**Mekanisme Pengujian**
- Compatibility Testing
- Device Testing

---

#### K. Koneksi Jaringan

**Pengujian**
- Koneksi internet lambat
- Kehilangan koneksi internet
- Pergantian jaringan WiFi ke Mobile Data

**Mekanisme Pengujian**
- Network Testing
- Negative Testing

#### L. Sparring
**Pengujian**
- Membuat sparring baru
- Mencari sparring yang tersedia
- Bergabung ke sparring
- Membatalkan partisipasi sparring
- Melihat detail sparring
- Validasi jumlah peserta
- Validasi jadwal sparring
- Validasi lokasi sparring
- Validasi status sparring (Open, Full, Cancelled, Completed)

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing
- End-to-End Testing
- Automation Testing

#### M. Create Game Time

**Pengujian**
- Membuat Game Time baru
- Mengisi informasi Game Time (judul, lokasi, tanggal, waktu)
- Menentukan jumlah peserta
- Menyimpan Game Time
- Mengedit Game Time
- Membatalkan Game Time
- Bergabung ke Game Time
- Keluar dari Game Time
- Validasi kuota peserta
- Validasi tanggal dan waktu

**Mekanisme Pengujian**
- Functional Testing
- Integration Testing
- End-to-End Testing
- Automation Testing

#### N. Riwayat Aktivitas

**Pengujian**
- Melihat riwayat booking
- Melihat riwayat pembayaran
- Melihat riwayat game

**Mekanisme Pengujian**
- Functional Testing
- UI Testing


## Prioritas Automation
Fitur yang direkomendasikan untuk diotomasi:
1. Login & Registrasi
2. Booking Venue
3. Pembayaran
4. Sparring
5. Notifikasi


### Tools yang Dapat Digunakan
#### Website
- Selenium WebDriver
- JUnit/TestNG
- Katalon Studio

#### Mobile
- Appium
- JUnit/TestNG
- Katalon Studio

## Kesimpulan

Fitur yang memiliki prioritas pengujian tertinggi adalah proses booking venue dan pembayaran karena merupakan fitur utama yang berhubungan langsung dengan transaksi pengguna. Selain itu, validasi ketersediaan jadwal dan pencegahan double booking juga perlu menjadi fokus utama untuk menjaga integritas data dan pengalaman pengguna.