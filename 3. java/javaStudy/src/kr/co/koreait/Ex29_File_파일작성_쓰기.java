package kr.co.koreait;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex29_File_파일작성_쓰기{

	public static void main(String[] args) {

		Path path = Paths.get("Ex29_hello.txt");
		
//		 <외부파일 작성> = BufferedWriter (출력 스트림)
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			writer.write("파일에 작성중!!!");
			System.out.println("쓰기 완료");
		} catch(IOException e){

		}
		
//		<외부파일 읽기> = BufferedReader (입력 스트림)
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String text = reader.readLine();
			System.out.println("파일 내용 : " + text);
		} catch(IOException e){

		}
	}
}
