package Bubblesort;

// Nama : Nur Rizqi Maulanna

public class Bubblesort {
    private String [] data;

    //    constructor
        public Bubblesort(){
    
        }
        public void setData (String[] data){
            this.data=data;
        }
        public void sortData(){
            int lenData = this.data.length;
            for(int i = 0; i<lenData;i++){
                for(int j=i+1;j<lenData;j++){
                    if (this.data[j].compareTo(this.data[i])>0){
                        String temp = this.data[i];
                        this.data[i]=this.data[j];
                        this.data[j]=temp;
                    }
                }
            }
        }
        public void PrintData(){
            for (String datum:this.data){
                System.out.println(datum+"");
            }
        }
    
        public static void main(String[] args) {
    //        int[] s = new int[]{10,35,32,13,26};
            String [] nama={"spiderman","superman","batman","ant man","wonderwoman","gundala","thor"};
            Bubblesort _myBubble = new Bubblesort();
            _myBubble.setData(nama);
            _myBubble.sortData();
            _myBubble.PrintData();
        }
    
    
}
