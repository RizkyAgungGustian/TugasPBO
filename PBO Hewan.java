class Hewan{
 public String nama;
 public String makanan;
 public String habitat;
 public String caraBergerak;
}


class Jenis extends Hewan{
public void tampil()
{
System.out.println("\t\t Macam - macam hewan :");
}
}
class Harimau extends Hewan {
 public Harimau (String nama, String makanan, String habitat, String caraBergerak){
  this.nama = nama;
  this.makanan = makanan;
  this.habitat = habitat;
  this.caraBergerak = caraBergerak;
 }
 
  public void tampil() {
  System.out.println("\n====================================");
  System.out.println("Nama Hewan \t\t: " + nama);
  System.out.println("Jenis Makanan \t\t:" + makanan);
  System.out.println("Tempat hidup/habitat    :" +habitat);
  System.out.println("Bergerak menggunakan    : " +caraBergerak);
  }
  }

class Paus extends Hewan {
 public Paus (String nama, String makanan, String habitat, String caraBergerak ) {
  this.nama = nama;
  this.makanan = makanan;
  this.habitat = habitat;
  this.caraBergerak = caraBergerak;
 }
  public void tampil() {
  System.out.println("\n====================================");
  System.out.println("Nama Hewan \t\t: " + nama);
  System.out.println("Jenis Makanan \t\t:" + makanan);
  System.out.println("Tempat hidup/Habitat    :" +habitat);
  System.out.println("Bergerak menggunakan    : " +caraBergerak);
  }
  }
class Kambing extends Hewan {
 public Kambing (String nama, String makanan, String habitat, String caraBergerak ) {
  this.nama = nama;
  this.makanan = makanan;
  this.habitat= habitat;
  this.caraBergerak = caraBergerak;
 }
  public void tampil() {
  System.out.println("\n====================================");
  System.out.println("Nama Hewan \t\t: " + nama);
  System.out.println("Jenis Makanan \t\t:" + makanan);
  System.out.println("Tempat hidup/Habitat    :" +habitat);
  System.out.println("Bergerak menggunakan    : " +caraBergerak);
  }
  }
class Kelelawar extends Hewan {
 public Kelelawar (String nama, String makanan, String habitat, String caraBergerak ) {
  this.nama = nama;
  this.makanan = makanan;
  this.habitat = habitat;
  this.caraBergerak = caraBergerak;
 }
  public void tampil() {
  System.out.println("\n====================================");
  System.out.println("Nama Hewan \t\t: " + nama);
  System.out.println("Jenis Makanan \t\t:" + makanan);
  System.out.println("Tempat hidup/Habitat    :" +habitat);
  System.out.println("Bergerak menggunakan    : " +caraBergerak);
  
  }
  }
  
class jenisHewan {
 public static void main (String[]args) {
 
 Jenis jns = new Jenis();
 Harimau hrmu = new Harimau ("Harimau","daging","Darat","kaki");
 Paus paus = new Paus("paus","plankton","Laut","Sirip");
 Kambing kbg = new Kambing("kambing","Rumput","Darat","Kaki");
 jns.tampil();
 hrmu.tampil();
 paus.tampil();
 kbg.tampil();
 }
}