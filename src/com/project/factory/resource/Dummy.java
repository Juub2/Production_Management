package com.project.factory.resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Dummy {
	
	
	
	public static void makeUserData(String departCode) {
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(Path.MEMBER, true));
			Random rnd = new Random();
			String depart = "";
			String id = "";
			String name = "";
			String result = "";
			String email = "";
			
			
			
			
			
			for (int i = 0; i < 30; i++) {
				String[] lastName = { "김", "박", "이", "송", "윤", "최", "황", "손", "한", "조", "백", "정" };
				String[] firstName = { "준", "미", "섭", "영", "욱", "원", "철", "지", "숙", "현", "민", "희", "대", "형", "나", "우",
						"진", "수", "승", "민", "은", "규", "석", "현", "성", "혜", "근", "정" };
				

				// 사원번호
				id = (int) (Math.random() * 899999) + 100000 + departCode;
				email = id + "@auto.com";
				//부서
				switch (id.substring(id.length() - 1)) {
				case "A":
					depart = "생산";
					break;
				case "B":
					depart = "유통";
					break;
				case "C":
					depart = "인사";
					break;
				case "D":
					depart = "경영";
					break;

				}

				// 전화번호
				String phoneNum = "010" + "-" + ((int) (Math.random() * 8999) + 1000) + "-"
						+ ((int) (Math.random() * 8999) + 1000);

				// 이름 생성
				name = lastName[rnd.nextInt(lastName.length)] + firstName[rnd.nextInt(firstName.length)]
						+ firstName[rnd.nextInt(firstName.length)];
				
				//주소 생성
				
				// 사원번호■비밀번호■이름■전화번호■주소■직급■부서■생년월일■이메일(사원번호@auto.com)
				result = id + "■" + "134113411341" + "■" + name + "■" + phoneNum + "■" + "주소" + "■" + "2" + "■" + depart + "■"+ email;
		

				writer.write(result + "\r\n");

			}
			writer.close();

		} catch (Exception e) {
			System.out.println("Main.main");
			e.printStackTrace();
		}
		
	}
}
