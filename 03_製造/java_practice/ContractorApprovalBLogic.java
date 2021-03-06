package java_practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class ContractorApprovalBLogic {

	public void execute(String contractorSeq, String approvalFlg) {

		// ----------------------------------------------------//
		// ファイル読み込み用クラスのインスタンス作成
		DataInputer inputer = new FileInputer("C://TestData/Contractor.csv");

		// ファイルを読み込む
		List<String> fileData = inputer.input();

		// 読み込んだテキストデータをオブジェクトへ変換する
		List<ContractorVO> inputContractorList = ContractorVOConverter.convertTextToContractorVO(fileData);

		// ----------------------------------------------------//
		// 契約者通番と一致する契約者情報を取得する
		ContractorVO targetContractor = null;
		for (ContractorVO inputContractor : inputContractorList) {
			// 読み込んだ契約者情報の契約者通番と、入力の契約者通番が同じ場合
			if (inputContractor.getContractorSeq().equals(contractorSeq)) {
				// 該当の契約者を取得する
				targetContractor = inputContractor;
				// 以降のデータを参照する必要はないのでfor文から抜ける
				break;
			}
		}
		// ----------------------------------------------------//
		// 承認情報を作成
		ApprovalVO approvalData = new ApprovalVO();

		// 契約者通番設定
		approvalData.setContractorSeq(targetContractor.getContractorSeq());
		// 承認日付設定
		approvalData.setApprovalDate(getSystemDateString());
		// システム登録日が2020年1月1日以降の場合
		if ("20200101".compareTo(targetContractor.getSystemRegistrationDate()) <= 0) {
			// 承認フラグ設定
			approvalData.setApprovalFlg(approvalFlg);
		}
		// ----------------------------------------------------//
		// 承認情報を変換する
		String approvalTextData = ApprovalVOConverter.convertApprovalVOToText(approvalData);
		// 出力する承認情報のファイル名を作成する
		String outputFileName = "Approval_" + getSystemDateString() + ".csv";

		// ファイル出力用クラスのインスタンス作成
		DataOutputter  outputer= new FileOutputter("C://TestData/" + outputFileName);

		// ファイルを出力する
		outputer.output(approvalTextData);
	}

	/**
	* システム日付を文字列の形で取得する
	* @return システム日付
	* 参考サイト：https://qiita.com/wataru908/items/91731fa64f173e7c6f24
	*/
	private String getSystemDateString() {
		Calendar cl = Calendar.getInstance();

		//日付をyyyyMMddの形で出力する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String str = sdf.format(cl.getTime());

		return str;

	}
}
