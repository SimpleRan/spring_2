package com.ict.di;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.ict.di.classfile.Broadcast;
import com.ict.di.classfile.Satellite;
import com.ict.di.classfile.Stage;

public class DIMainSpringver {

	public static void main(String[] args) {
		// root-context가 여러개라면 미리 문자 배열로 경로를 만들어두기 (방법2)
		//String[] path= {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		//				"file:src/main/webapp/WEB-INF/spring/root-context2.xml"};
		// GenericXmlApplicationContext context = 
		//		new GenericXmlApplicationContext(path);
		
		// or 이렇게 주소 두개 연달아 쓰기 (방법1)
		//GenericXmlApplicationContext context = 
			//	new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml",
				//								"file:src/main/webapp/WEB-INF/spring/root-context2.xml");
		
		// 빈 컨테이너에 들어있는 객체를 꺼내기 위해 호출기 생성
		// 목표 빈 컨테이너(root-context.xml) 의 경로를 적어줘서 그쪽 빈컨테이너와 통신하도록 설정 
		GenericXmlApplicationContext context = 
			new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-*.xml"); //(방법3)
		 
		// Singer없이 바로 다이렉트로 Stage를 만들어보겠습니다.
		//Stage stage = context.getBean("stage", Stage.class);
		//stage.perform();
				
		
		//Broadcast broadcast = context.getBean("broadcast", Broadcast.class);
		//broadcast.broad();
		
		Broadcast broadcast = context.getBean("hiphopBroad", Broadcast.class);
		broadcast.broad();
		
		//Broadcast broadcast = context.getBean("danceBroad", Broadcast.class);
		//broadcast.broad();
		
		//Satellite satellite = context.getBean("satellite", Satellite.class);
		//satellite.satelliteBroad();
		
		//Satellite satellite = context.getBean("satelliteBroad", Satellite.class);
		//satellite.satelliteBroad();
		
		
		//Stage stage = context.getBean("danceStage", Stage.class);
		//stage.perform();
		
	}

}
