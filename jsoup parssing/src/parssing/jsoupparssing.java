package parssing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
import java.io.*;

public class jsoupparssing {
	public static void main(String[] args) throws Exception{
		
		InputStreamReader Inputvalue = new InputStreamReader(System.in);
		
		BufferedReader buff = new BufferedReader(Inputvalue);
		
		System.out.print("URL을 입력하세요. : ");
		String url = buff.readLine();
		
		System.out.print("원하는 태그를 입력하세요. : ");
		String tag = buff.readLine();
		
		//String articleURL = "http://www.ilbe.com/10292553017";
		Document doc = Jsoup.connect(url).get();
		
		Elements ele = doc.select(tag);//replyContent 클래스 태그 안에 내용 파싱
		String output ="";
		for(Element e:ele)
		{
			output +=e.text();
			output +="\n";
		}
		
		System.out.println(output);
		
		
		//String str = ele.text(); //파싱한 내용을 text 형태로 str에 저장.
		/*String arr[] = output.split(" "); //공백을 기준으로 문자열 나눔.
		
		for(int i =0; i<arr.length ; i++)
		{
		System.out.println(arr[i]);
		}	*/	
		Scanner a = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요. : ");
		
		while(a.hasNextLine()){ //다음줄 입력 여부 결정
		String msg = a.nextLine(); //키보드 입력
		if(output.contains(msg)){ //str 즉 파싱한 댓글에 msg(입력값)에 해당하는 값 탐색
			System.out.println("해당 단어가 포함된 댓글이 있습니다.");
			System.out.println("다음 검색할 단어를 입력하세요. : ");
			}
		else{
			System.out.println("해당 단어가 포함된 댓글이 없습니다.");
			System.out.println("검색 결과가 없습니다. 검색할 단어를 입력하세요. : ");
		}				
		}
		/*
		if(str.indexOf("시발")>-1) // contains 이외의 방법
		{
			int sibal = str.indexOf("시발");
			String siball=str.substring(sibal,sibal+2);
			System.out.println("해당 단어가 포함된 댓글이 있습니다.");
			System.out.println("욕 :"+ siball);
		
		}*/
	}

}
