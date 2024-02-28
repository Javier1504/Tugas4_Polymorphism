# oop-polymorphism
Tugas #4 PBO latihan implementasi polymorphism dan abstract class.

## Cara membuka project menggunakan Eclipse IDE

1. Clone repositori project ```oop-polymorphism``` ke local direktori git Anda.
2. Buka Eclipse IDE, Pilih menu File > Import > Maven > Existing Maven Projects.
3. Pada Root Directory, klik tombol Browse, pilih direktori ```oop-polymorphism```, kemudian check ```pom.xml```.
4. Tekan tombol finish untuk melakukan tombol impor.

## Deskripsi Soal
Kerjakan soal-soal berikut ini. (Soal diambil dari buku Java How to Program 10th edition 2015, halaman 439-440)

### Kerjakan soal berikut di package id.its.pbo.shape
10.13 (Project: Shape Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each ```TwoDimensionalShape``` should contain method ```getArea``` to calculate the area of the two-dimensional shape. Each ```ThreeDimensionalShape``` should have methods ```getArea``` and ```getVolume``` to calculate the surface area and volume, respectively, of the three-dimensional shape. Create a program that uses an array of ```Shape``` references to objects of each concrete class in the hierarchy. The program should print a text description of the object to which each array element refers. Also, in the loop that processes all the shapes in the array, determine whether each shape is a ```TwoDimensionalShape``` or a ```ThreeDimensionalShape```. If it’s a ```TwoDimensionalShape```, display its area. If it’s a ```ThreeDimensionalShape```, display its area and volume.

### Kerjakan soal berikut di package id.its.pbo.payroll
10.14 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an additional ```Employee``` subclass ```PieceWorker``` that represents an employee whose pay is based on the number of pieces of merchandise produced. Class ```PieceWorker``` should contain private instance variables ```wage``` (to store the employee’s wage per piece) and ```pieces``` (to store the number of pieces produced). Provide a concrete implementation of method ```earnings``` in class ```PieceWorker``` that calculates the employee’s earnings by multiplying the number of pieces produced by the wage per piece. Create an array of ```Employee``` variables to store references to objects of each concrete class in the new ```Employee``` hierarchy. For each Employee, display its String representation and earnings.