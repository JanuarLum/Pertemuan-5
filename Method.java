class Mahasiswa{
    
    String nama;
    String NIM;

    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Method{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Januar","2020071003");
        mahasiswa1.show();
        mahasiswa1.setNama("Ewing");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("wih ganteng");
        System.out.println(data);
    }
}