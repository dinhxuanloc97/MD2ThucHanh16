package ThucHanh1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            //Doc file theo huong dan
            File file = new File(filePath);
            //Kiem tra file k ton tai thi nem ra ngoai

            if(!file.exists()){
                throw  new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0 ;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = " + sum );
        } catch (Exception e ){
            System.out.println("Fie khong ton tai or noi dung co loi !");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file :");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }

}


