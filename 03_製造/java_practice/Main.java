package java_practice;

public class Main {

	public static void main(String[] args) {
		System.out.println("----- main start -----");
		// BLogicのインスタンス生成
		ContractorApprovalBLogic blogic = new ContractorApprovalBLogic();
		// BLocic実行
		blogic.execute("0000001", "0");
		System.out.println("----- main end -----");
	}

}
