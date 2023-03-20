package lbh.java.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUploadService {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("업로드할 파일 경로를 입력하세요: ");
		String filePath = bufferedReader.readLine();

		Path path = Paths.get(filePath);
		String fileName = path.getFileName().toString();

		FileUpload controller = new FileUpload();
		byte[] fileContent = Files.readAllBytes(path);
		controller.uploadFile(fileContent, fileName);

		System.out.println("파일 업로드가 완료되었습니다.");
	}
}
