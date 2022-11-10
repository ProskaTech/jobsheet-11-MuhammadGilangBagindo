## Created by 21343030_Muhammad Gilang Bagindo

## Penjelasan Source Code
Pada pertemuan kali ini membahas mengenai kelas inheritance, overriding dan kelas enkapsulasi.

Inheritance merupakan proses pewarisan data dan method dari suatu class yang telah ada kepada suatu class baru. Class yang mewariskan disebut dengan superclass/parent class/base class, sedangkan class yang mewarisi (class yang baru) disebut dengan subclass/child class/derived class. Akan tetapi subclass tidak dapat mewarisi anggota private dari superclass-nya. Dengan inheritance, class yang baru (subclass) akan mirip dengan class yang lama (superclass), namun memiliki karakteristik yang baru. Dalam Java, subclass hanya bisa memiliki satu superclass (single inheritance) sedangkan superclass bisa memiliki satu subclass atau lebih. Untuk menerapkan inheritance, digunakan statement “extends”.

Overriding adalah menulis kembali method sama persis, mulai dari nama method dan isinya dan mengimplementasi kembali di subclassnya. Overriding dipakai ketika menggunakan method yang sama tapi berbeda implementasinya atau dengan kata lain, overriding adalah suatu keadaan dimana method pada subclass menolak method pada parent class-nya.

Encapsulation (Enkapsulasi) adalah pembungkus, pembungkus disini dimaksudkan untuk menjaga suatu proses program agar tidak dapat diakses secara sembarangan oleh program lain. Dalam Java, dasar enkapsulasi adalah class. Anda membuat suatu class yang menyatakan bahwa variable atau method sebuah class tidak dapat diakses oleh class lain dengan menjadikan class tersebut private, atau menjadikan class tersebut protected yaitu hanya bisa diakses oleh turunannya, atau menjadikan class tersebut public yaitu bisa diakses oleh sembarang class.
