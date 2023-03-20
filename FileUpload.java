package lbh.java.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUpload {
//	public void uploadFile(InputStream inputStream, String fileName) throws IOException {
//		// 업로드할 파일의 경로 설정
//		String filePath = "C:\\javaio\\lbh\\";
//
//		// 파일 저장하기
//		OutputStream outputStream = new FileOutputStream(new File(filePath + fileName));
//		int read = 0;
//		byte[] bytes = new byte[1024];
//		while ((read = inputStream.read(bytes)) != -1) {
//			outputStream.write(bytes, 0, read);
//		}
//		outputStream.flush();
//		outputStream.close();
//	}

	public void uploadFile(byte[] fileContent, String fileName) throws IOException {
		// 업로드할 파일의 경로 설정
		String filePath = "C:\\javaio\\lbh\\";

		// 파일 저장하기
		File targetFile = new File(filePath + fileName);
		FileOutputStream outputStream = new FileOutputStream(targetFile);
		outputStream.write(fileContent);
		outputStream.close();
	}
}
