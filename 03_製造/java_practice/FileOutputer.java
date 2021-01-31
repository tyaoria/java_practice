package java_practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileOutputer implements DataOutputer {

	/**
	 * 読み込み対象ファイルのパス
	 */
	private String filePath;

	/**
	 * デフォルトコンストラクタ Privateとして使用させない
	 */
	@SuppressWarnings("unused")
	private FileOutputer() {
	}

	/**
	 * コンストラクタ 出力するファイルパスを指定する
	 */
	public FileOutputer(String argFilePath) {
		System.out.println("FileOutputer Constructor Execute");
		this.filePath = argFilePath;
	}

	/**
	 * ファイルを出力する
	 * 参考サイト：https://syunpon-java.com/programing/java/sample/fileinout.shtml
	 */
	@Override
	public void output(String data) {

		// ファイルオブジェクトの生成
		File outputFile = new File(filePath);
		try {
			// 出力ストリームの生成（追記モード）
			FileOutputStream fos = new FileOutputStream(outputFile, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			PrintWriter pw = new PrintWriter(osw);

			// ファイルへの書き込み
			pw.println(data);

			// Writerを閉じる
			pw.close();
			// エラーがあった場合は、スタックトレースを出力
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
