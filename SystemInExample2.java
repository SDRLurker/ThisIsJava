import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception { 
		InputStream is = System.in;
		
		byte[] datas = new byte[100];

		int enterBytes = 2;
		if(!OSValidator.isWindows())
			enterBytes = 1;

		System.out.println("�̸�: ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-enterBytes);
		
		System.out.println("�ϰ� ������: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-enterBytes);

		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ� ������: " + comment);
	}	
}
