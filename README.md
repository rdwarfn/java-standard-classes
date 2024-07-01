# Java Standard Classes

### Sebelum Belajar
 - Java Dasar
 - Java Object Oriented Programming

### Agenda
 - Membahas class-class di `Java Strandard Edition` yang sering digunakan

## `String` - `Class`
 - Seperti yang pernah dibahas di materi `Java Dasar`, `String` adalah object, artinya dia memiliki representasi `class` nya
 - Ada banyak sekali method yang bisa kita gunakan di `String`, kita bisa melihat detail mehtod apasaja yang tersedia di halaman dokumentasi `javadoc` nya
 - [https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html)

## Method di `String Class`
| Method                   | Keterangan                                       |
|--------------------------|--------------------------------------------------|
| `String` `toLowerCase()` | Membuat `string` baru dengan format `lower case` |
| `String` `toUpperCase()` | Membuat `string` baru dengan format `upper case` |
| `int` `length()`         | Mendapatkan panjang `string` |
| `boolean` `startsWith(value` | Mengecek apakah dimulai dengan `string value` |
| `boolean` `endsWith(value)` | Mengecek apakah diakhiri dengan `string value` |
| `String[]` `split(value)` | Memotong `string` dengan `string value` |

## `StringBuffer` dan `StringBuilder` - `Class`
- `String` adalah tipe data `immutable`, artinya tidak bisa berubah isinya, saat kita mengubah `string`,
sebenarnya yang dilakukan di `Java` adalah membuat `String` baru.
- Jika kita ingin memanipulasi `String` dalam jumlah banyak, sangat tidak disarankan menggunakan `String`,
karena akan memakan `memory` yang cukup besar, untuk kasus seperti ini, disarankan menggunakan `StringBuffer`
atau `StringBuilder`

### `StringBuffer` vs `StringBuilder`
- Kemampuan `StringBuffer` dan `StringBuilder` cukup sama, bisa digunakan untuk memanipulasi `String`
- Yang membedakan adalah, `StringBuffer` itu `thread safe`, sedangkan `StringBuilder` tidak `thread safe`
- Jika kita ingin memanipulasi `String` secara pararel bersamaan, disarankan menggunakan `StringBuffer`,
namun jika tidak butuh pararel, cukup gunakan `StringBuilder`
- Karena `StringBuffer` dibuat agar `thread safe`, maka secara otomatis performanya lebih lambat dibanding `StringBuilder`
- [https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuffer.html](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuffer.html)
- [https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuilder.html](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuilder.html)

## `StringJoiner` - `Class`
- `StringJoiner` adalah `class` yang bisa digunakan untuk membuat `String sequece` yang dipisahkan dengan `delimiter`
- `StringJoiner` juga mendukung `prefix` dan `suffix` jika kita ingin menambahkannya
- Ini sangat bagus ketika ada kasus misal kita ingin mem-print `Array` dengan format yang kita mau misalnya
- [https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/StringJoiner.html](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/StringJoiner.html)

```java
import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Ridwan", "Arifin"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }
}
```

## `StringTokenizer` - `Class`
- `StringTokenizer class` adalah `class` yang bisa digunakan untuk memotong `String` menjadi `token` atau `string` yang
lebih kecil
- Kita bisa memotong `String` dengan delimiter yang kita mau
- Lebih hemat memory
- [https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/StringTokenizer.html](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/StringTokenizer.html)

### Kode : `StringTokenizer Class`

```java
import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Ridwan Arifin";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken(); // lazy
            System.out.println(token);
        }
    }
}
```

## `Number` - `Class`
- Semua `number class` yang bukan `primitif` memiliki `parent class` yang sama, yaitu `class Number`
- `Class number` memiliki banyak `method` yang bisa digunakan untuk mengkorversi ke tipe `number` lain
- Hal ini memudahkan kita untuk mengkonversi `object nuber` dari satu tipe ke tipe `number` lainnya
- [https://doc.oracle.com/en/java/javase/15/docs/java.base/java/lang/Number.html](https://doc.oracle.com/en/java/javase/15/docs/java.base/java/lang/Number.html)

### `Method` di `Number Class`
| Method | Keterangan |
| --- | --- |
| `byte` `byteValue()` | Mengubah menjadi tipe `byte` |
| `double` `doublevalue()` | Mengubah menjadi tipe `double` |
| `float` `floatValue()` | Mengubah menjadi tipe `float` |
| `int` `intValue()` | Mengubah menjadi tipe `int value` |
| `long` `longValue()` | Mengubah menjadi tipe `long value` |
| `short` `shortValue()` | Mengubah menjadi `short value` |

### Konversi `String` ke `Number`
- `Long`, `Integer` dan `Byte` memiliki `static method` untuk melakukan konversi dari `String` ke `number`
- `parseXxx`(`string`) digunakan untuk mengkonversi dari `string` ke tipe data `number` `primitif`
- `valueOf`(`string`) digunakan untuk mengkonversi dari `string` ke tipe data `number` `non-primitif`
- `Method` ini akan `throw` `NumberFormatException` jika ternyata gagal melakukan konversi `String` ke `number`

## `Big Number`
- Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas `Long` dan `Double`, di `Java`
sudah di sediakan `class` untuk `handle` data besar tersebut
- `BigInteger` adalah `class` untuk `handle` tipe data `Integer`, dan
- `BigDecimal` adalah `class` untuk `handle` tipe data `floating point`
- [http://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/math/BigInteger.html](http://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/math/BigInteger.html)
- [http://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/math/BigDecimal.html](http://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/math/BigDecimal.html)

### `Method` di `BigInteger` & `BigDecimal`
| Method | Operator |
| --- | --- |
| `add` | + |
| `subtract` | - |
| `multiply` | * |
| `divide` | / |
| `mod` | % |
|...dan masih banyak lagi | |

### Kode : `BigInteger`

```java
import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000");
        BigInteger result = a.add(b);
        System.out.println(result);
    }
}
```

## `Scanner` - `Class`
- `Scanner` sebenarnya bagian dari `Java IO` (`input output`), dan ini akan dibahas di materi terpisah
  - Namun sekarang kita akan bahas sekilas tentang `class scanner`
  - `Class Scanner` hadir sejak `Java 5`
  - `Class Scanner` adalah `class` yang bisa digunakan untuk membaca `input`, entah dari `file`, `console`, dan lain-lain
  - `Class Scanner` ini cocok untuk dijadikan `object` untuk membaca `input user` saat kita belajar membuat program `Java`
  menggunakan `console` / terminal
  - [https://doc.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Scanner.html](https://doc.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Scanner.html)

### `Method` di `Scanner Class`
| Method | Keterangan |
| --- | --- |
| `nextLine()` | Membaca `string` |
| `nextInt()` | Membaca `int` |
| `nextLong()` | Membaca `long` |
| `nextBoolean()` | Membaca `boolean` |
| ...dan masih banyak | |

### Kode : Menggunakan `Scanner`

```java
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.println("Hello " + nama);
    }
}
```

## `Date` & `Calendar`
- Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di `Java` juga sama, ada `class Date & Calendar`
yang bisa kita gunakan sebagai representasi tanggal
- Sebenarnya di `Java 8` sudah ada cara memanipulasi tanggal yang baru menggunakan `Java Date Time API`, namun itu akan
kita bahas di course terpisah
- Sekarang kita akan fokus menggunakan `class Date & Calendar`

### Hubungan `Date` dana `Calendar`
- `Class Date` adalah `class` representasi tanggal sampai presisi `milisecond`
- Namun di `class Date` sudah banyak method-method yang di `deprecated`, sehingga
untuk memanipulasi `date` tanggal, kita sekarang harus melakukan kombinasi antara `class`
`Date` dan `Calendar`
- Sederhananya `Date` untuk representasi tanggal, dan `Calendar` untuk memanipulasi tanggal
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html)
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html)

### Kode : Menggunakan `Date`

```java
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        long millisecond = date.getTime();

        System.out.println(date);
        System.out.println(millisecond);
    }
}
```
### Kode : Menggunakan `Calendar`

```java
import java.util.Calendar;

public class CalendarApp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        Date date = calendar.getTime();
        long millisecond = date.getTime();
    }
}
```

## `System Class`
- `Class System` adalah `class` yang berisikan banyak untility `method` di `java`.
Contohnya sebelumnya kita sudah sering menggunakan `method` `println` milik `field out` di `class System`.
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html)

### `Method` di `System Class`
| Method               | Keterangan                                      |
|----------------------|-------------------------------------------------|
| `String getenv(key)` | Mendapatkan `environment variable` sistem operasi |
| `void exit(status)` | Menghentikan program `Java`|
| `long currentTimeMilis()` | Mendapatkan waktu saat ini dalam `millisecond` |
| `long nanoTime()` | Mendapatkan waktu saat ini dalam `nanosecond` |
| `void gc()` | Menjalankan `Java garbage collection` |
| ...dan masih banyak | |

## `Runtime Class`
- Ketika aplikasi `Java` kita berjalan, kita bisa melihat informasi `environment` tempat aplikasi `Java` berjalan
- Informasi itu terdapat di `class Runtime`
- `Class Runtime` tidak bisa dibuat, secara otomatis `Java` akan membuat `single object`. Kita bisa mengakses `object`
tersebut menggunakan `static method getRuntime()` milik `class Runtime`
- [htpps://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html](htpps://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html)

### `Method` di `Runtime Class`
| Method | Keterangan |
| --- | --- |
| `int availableProcessors()` | Mendapatkan jumlah `core cpu` |
| `long freeMemory()` | Mendapatkan jumlah memori bebas di `JVM` |
| `long totalMemory()` | Mendapatkan jumlah total memori di `JVM` |
| `long maxMemory()` | Mendapatkan jumlah maksimum memori di `JVM` |
| `void gc()` | Menjalankan `garbage collector` untuk menghilangkan data di momori yg sudah tidak terpakai |

## `UUID Class`
- Saat membuat aplikasi, kadang kita ada kasus ingin membuat data `unique`, misal untuk kebutuhan data `primary key` misalnya
- `Java` menyediakan sebuat `class UUID` atau singkatan dari `Universally Unique Identifier`
- `UUID` adalah format `standard` untuk membuat `unique value` yang telah terjamin
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html)
- [https://www.ietf.org/rfc/rfc4122.txt](https://www.ietf.org/rfc/rfc4122.txt)

## `Base64 Class`
- Sejah `Java 8`, `Java` sudah menyediakan `class` untuk `encoding base64`
- Buat `programmer web` pasti tahu tentang `base64`, yaitu `encoding` yang bisa digunakan untuk mengubah `binary` data ke `text` yang aman
- Aman disini bukan dari sisi `security`, tapi aman dari kesalahan parsing
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html)
- [https://www.ietf.org/rfc/rfc4648.txt](https://www.ietf.org/rfc/rfc4648.txt)

### Kode : `Base64`

```java
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String query = "belajar()  pemrograman() java";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);
        
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
    }
}
```

## `Objects Class`
- Awas jangan tertukar, ini `class Objects`, bukan `Object`
- `Objects` adalah `class utility` yang berisikan banyak `static method` yang bisa kita gunakan untuk
operasi `object` atau melakukan pengecekan sebelum operasinya dilakukan
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html)

### Kode : Tanda `Objects`

```java
public class ObjectsApp {
    public static void main(String[] args) {
        String product, product2;
        if (product != null) product.toString();
        
        if (product != null) product.hashCode();
        
        if (product != null) product.equals(product2);
    }
}
```

## `Random Class`
- `Random Class` adalah `class` yang bisa kita gunakan untuk men-`generate` `random number`
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html)

### Kode : `Random`

```java
import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            var value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
```

## `Properties Class`
- Kebanyakan aplikasi `Java` akan menyimpan konfigurasi `file` dalam bentuk `properties file`
- `Properties file` adalah `file` berisi `key value` yang dipisahkan dengan tanda sama dengan (`=`)
- `Properties file` bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita

### `Properties Class`
- `Properties Class` adalah `class` yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke `file properties`
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html)

### Kode : `Properties`

```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("name.first"));
            System.out.println(properties.getProperty("name.last"));

            properties.put("hobby", "Coding");
            properties.store(new FileOutputStream("application.properties"), "Komentar");
        } catch (IOException exception) {
            
        }
    }
}
```

## `Arrays Class`
- `Arrays class` adalah `class` yang berisikan `static method` yang bisa kita gunakan untuk memanipulasi data `array`,
seperti pencarian dan pengurutan
- [https://docs.oracle.com/en/javase/14/docs/api/java.base/java/util/Arrays.html](https://docs.oracle.com/en/javase/14/docs/api/java.base/java/util/Arrays.html)

### `Method` di `Arrays Class`
| Method | Keterangan |
| --- | --- |
| `binarySearch(array,value)` | Mencari `value` di `array` |
| `copyOf(...)` | Menyalin data `array` |
| `equals(array1, array2)` | Membandingkan array1 dan array2 |
| `sort(array)` | Mengurutkan `array` |
| `toString(array)` | Mengembalikan representasi `string` |
| ...dan masih banyak | |

## `Regular Expression`
- `Regular Expression` atau disingkat `regex` adalah cara untuk melakukan pola pencarian
- Biasanya dilakukan untuk pencarian dalam data `String`
- Secara sederhana, kita mungkin sudah sering melakukan pencarian `text`, entah di `text editor` atau aplikasi `word`
- `Regex` adalah pencarian yang lebih `advanced` dibandingkan pencarian `text` biasanya, misal kita ingin mencari semua
kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain

### `Regex Package`
- `Java` sudah menyediakan `package` `java.util.regex` yang berisikan utilitas untuk melakukan proses `regular expression`
- Secara garis besar terdapat 2 `class` yang dapat kita gunakan, yaitu `Pattern class` dan `Matcher class`
- `Pattern class` adalah representasi hasil kompilasi dari pola `regular expression` yang kita buat
- `Matcher class` adalah `engine` untuk melakukan pencarian dari pattern yang sudah kita buat

### Aturan `Regular Expression`
- Aturan `regular expression` sangat kaya, sehingga kemungkinan tidak bisa dibahas dalam satu materi
- Kita bisa lihat detail aturan-aturannya di halaman `javadoc` `class Pattern`
- [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html)

### Kode : `Regular Expression`

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {
    String name = "Ridwan Arifin";
    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
    Matcher matcher = pattern.matcher(name);
    
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
```
