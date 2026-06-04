# AYO QA Technical Test

## Deskripsi

Repository ini berisi hasil pengerjaan QA Technical Test yang terdiri dari:

1. **Studi Kasus 1** - Automation testing untuk validasi data booking dan schedule.
2. **Studi Kasus 2** - Analisis area pengujian pada Website dan Aplikasi Mobile AYO.

-

## Teknologi yang Digunakan

* Java 17
* Maven
* JUnit 5
* JDBC
* MySQL

---

## Struktur Project

```text
ayo-qa-technical-test
├── docs
│   ├── StudyCase1.md
│   └── StudyCase2.md
│
├── src
│   └── test
│       └── java
│           └── com.ayo
│               ├── tests
│               │   └── BookingTest.java
│               ├── service
│               │   └── BookingValidator.java
│               └── utils
│                   └── DBConnection.java
│
├── pom.xml
└── README.md
```

---

## Studi Kasus 1

Automation testing dibuat untuk mendeteksi:

* Ketidaksesuaian harga booking dengan schedule.
* Double booking pada venue, tanggal, dan jam yang sama.

### Automation Test Coverage

* Validate Booking Price Against Schedule
* Detect Booking Price Mismatch
* Detect Duplicate Booking
* Validate Unique Booking Slot

Dokumentasi lengkap dapat dilihat pada:

```text
docs/StudyCase1.md
```

---

## Studi Kasus 2

Analisis area pengujian untuk:

* Website AYO
* Aplikasi Mobile AYO

Dokumentasi lengkap dapat dilihat pada:

```text
docs/StudyCase2.md
```

---

## Konfigurasi Database

Sesuaikan konfigurasi database pada file:

```java
DBConnection.java
```

Contoh konfigurasi:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/ayo_db";

private static final String USER = "root";

private static final String PASSWORD = "password";
```

---

## Menjalankan Automation Test

### 1. Clone Repository

```bash
git clone <repository-url>
```

### 2. Install Dependency

```bash
mvn clean install
```

### 3. Jalankan Automation Test

```bash
mvn test
```

---

## Hasil yang Diharapkan

* Harga booking yang tidak sesuai dengan schedule dapat terdeteksi.
* Double booking dapat terdeteksi.
* Seluruh automation test berjalan dengan sukses.

---

## Author

Tuti Wulandari
