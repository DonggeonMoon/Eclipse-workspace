package Day05;

import java.util.Scanner;

//신체 검사 데이터용 클래스 배열에서 키와 시력의 분포를 포함한다.
//자바에서 클래스란? 객체를 만드는 틀, 특정 자료의 집합, c 언어: 구조체, 
//Human 명사적 속성: 키, 몸무게, 혈액형, 성별, 머리, ...
//변수: int height, int weight...
//동사적 속성: 먹기, 자기, 배변, ...
//method:public void sleep(int time)...

public class PhysicalExam {
	
	static final int VMAX =21;//시력 분포(0.0에서 0.1 단위로 21개)
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) { 
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	static double avgHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length;i++) {
			sum+= dat[i].height;
		}
		return sum/dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;
		dist[i] = 0;
		for(i=0;i<dat.length;i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision*10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {new PhyscData("이순신", 175, 1.0),
						new PhyscData("강감찬", 175, 1.0),
						new PhyscData("최무선", 175, 1.0),
						new PhyscData("안정복", 175, 1.0),
						new PhyscData("김정호", 175, 1.0),
						new PhyscData("장영실", 175, 1.0),
						new PhyscData("이자겸", 175, 1.0),
		};
		
		int[] vdist= new int[VMAX];
		System.out.println("*신체 검사 리스트*");
		System.out.println("이름			키			 시력");
		System.out.println("----------------------------");
		for(int i=0;i<x.length;i++) {
			System.out.println("%-8s%3d%5.1f");
		}
		
		System.out.printf("\n평균 키:%5.1fcm\n", avgHeight(x));
		distVision(x,vdist);
		System.out.println("\n시력분포");
		for(int i=0;i<VMAX;i++) {
			System.out.printf("%3.1f~: %2d명\n", i/10.0, vdist[i]);
		}

	}
}
