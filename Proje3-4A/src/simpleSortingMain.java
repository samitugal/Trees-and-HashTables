public class simpleSortingMain {
    public static void main(String[] args) {
        int[] list = {10,8,9,11,13,7,2,1};


        System.out.println("DÜZENLENMEDEN ÖNCEKİ HALİ:");
        for(int i = 0 ; i < list.length ; i++){
            System.out.print(list[i]+"   ");
        }
        System.out.println();


        for(int j = 0 ; j < list.length-1 ; j++ ){
            int temp ;
            if(list[j] > list[j+1] ){
                temp = list[j];
                list[j++] = list[j];
                list[j++] = temp;
                j=0 ;
            }
            int temp1 = 0;
            if(list[0] > list[1]){
                temp1 = list[0];
                list[0] = list[1];
                list[1] = temp1;
            }
        }
        System.out.println("DÜZENLENMİŞ HALİ:");
        for(int k = 0 ; k < list.length ; k++){
            System.out.print(list[k]+"   ");
        }


    }
}





