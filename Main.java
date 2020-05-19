public class Main {
    public static void main(String[] args){
        // 10の要素を持つ配列
        int[] x = {5, 10, 15, 20, 7, 18, 4, 1, 25, 19};
        int[] index = {0,1,2,3,4,5,6,7,8,9};

        bubbleSort(x, index);

        System.out.println("昇順ソート後");
        for(int i : x)System.out.print(i+" ");

        System.out.println(""); // 改行

        System.out.println("インデックス順に表示");
        int indexNum = 0; // 検索するインデックス番号を格納

        for(int i = 0; i < index.length; i++){
            // 0から順番にインデックスの検索
            for(int j = 0; i < index.length; j++){
                if( i == index[j] ){
                    indexNum = j;
                    break;
                }
            }
            System.out.print(x[indexNum] + " ");
        }

    }

    // インデックスを保持したバブルソートを実行
    public static void bubbleSort(int[] x, int[] index){
        int index_tmp;
        int tmp;

        for(int i = x.length -1; i>0; i-- ){
            for(int j = 0; j < i; j++){
                // 入れ替え処理
                if(x[j] > x[j+1]){
                    index_tmp = index[j+1];
                    index[j+1] = index[j];
                    index[j] = index_tmp;
                    
                    tmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tmp;
                }
            }
        }

    }
}
