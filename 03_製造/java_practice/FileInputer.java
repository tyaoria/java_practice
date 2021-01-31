package java_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileInputer implements DataInputer {

	/**
	 * 読み込み対象ファイルのパス
	 */
	private String filePath;

	/**
	 * デフォルトコンストラクタ Privateとして使用させない
	 */
	@SuppressWarnings("unused")
	private FileInputer() {
	}

	/**
	 * コンストラクタ 入力となるファイルパスを指定する
	 */
	public FileInputer(String argFilePath) {
		System.out.println("FileInputer Constructor Execute");
		this.filePath = argFilePath;
	}

	/**
	 * ファイルを入力する
	 * 参考サイト：https://syunpon-java.com/programing/java/sample/fileinout.shtml
	 */
	@Override
	public List<String> input() {
		System.out.println("FileInputer input() Execute");
		// 返却用 文字列List
		List<String> returnStringList = new ArrayList<String>();
		// ファイルオブジェクトの作成
		File inputFile = new File(filePath);
		// ファイルが存在する場合
		if (inputFile.exists()) {
			try {
				// 入力ストリームの生成
				FileInputStream fis = new FileInputStream(inputFile);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);

				// テキストファイルからの読み込み
				String lineData;
				while ((lineData = br.readLine()) != null) {
					// 読み込んだデータをListに1行ずつ追加する
					returnStringList.add(lineData);
				}
				// Readerを閉じる
				br.close();
			} catch (IOException e) {
				// エラーが発生した場合
				e.printStackTrace();
			}
		} else {
			// ファイルが存在しない場合
			System.out.println("ファイルが見つかりませんでした");
		}
		return returnStringList;
	}

}
