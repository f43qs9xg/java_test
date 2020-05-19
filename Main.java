import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// 出力のフォーマット
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		Date now = new Date();
		Calendar c = Calendar.getInstance();

		c.setTime(now);
		// 1日にセット
		c.set(Calendar.DAY_OF_MONTH, 1);

		// 来月の値
		int nextMonth = c.get(Calendar.MONTH) + 1;

		// 来月になったらループを抜ける
		while (c.get(Calendar.MONTH) != nextMonth) {
			Date d = c.getTime();
			System.out.println(f.format(d));
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
