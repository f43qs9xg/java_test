import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// 出力のフォーマット
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:sss");
        // 現在の日時を取得
        Date now = new Date();
        String s = f.format(now);

        System.out.println("現在は"+s+"です");
	}

}
