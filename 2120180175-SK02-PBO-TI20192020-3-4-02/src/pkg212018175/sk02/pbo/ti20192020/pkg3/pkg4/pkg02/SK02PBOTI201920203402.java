package pkg212018175.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class SK02PBOTI201920203402 {
    public static void main(String[] args) {
        browser ucbrowser = new browser();
        ucbrowser.google=1;        
        ucbrowser.youtube=2;        
        ucbrowser.facebook=1000;        
        System.out.println(ucbrowser.nama);
        System.out.println(ucbrowser.google);
        System.out.println(ucbrowser.youtube);
        System.out.println("beranda "+ ucbrowser.facebook);
        ucbrowser.browsing();
        ucbrowser.nonton_vidio();
        
    }
    
}
