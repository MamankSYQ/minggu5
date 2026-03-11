package BruteForceDivideConquer;
public class Mahasiswa {
    public String nama;
    public String nim;
    public int tahun;
    public int uts;
    public int uas;

    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String nim, int tahun, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.tahun = tahun;
        this.uts = uts;
        this.uas = uas;    
    }

    int utsTertinggi(Mahasiswa arr[], int l, int r){
        if(l==r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int lmin = utsTertinggi(arr, l, mid);
        int rmin = utsTertinggi(arr, mid+1, r);

        if(lmin > rmin){
            return lmin;
        }
        else{
            return rmin;
        }
    }
    int utsTerendah(Mahasiswa arr[], int l, int r){
        if(l==r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int lmax = utsTerendah(arr, l, mid);
        int rmax = utsTerendah(arr, mid+1, r);

        if(lmax < rmax){
            return lmax;
        }
        else{
            return rmax;
        }
    }
    double ratauas(Mahasiswa arr[]){
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}
