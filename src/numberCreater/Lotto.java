package numberCreater;

import java.util.Scanner;
 
public class Lotto {
    
    public static void main(String[] args) {
        
    	lottoNumbers lotto =new lottoNumbers();  
		Scanner sc = new Scanner(System.in);
        NumberReview NR = new NumberReview();		
        
		int switchCase;
        
        do {
           	System.out.print(" 1.과거 출현율");
           	System.out.print(" 2.번호생성");
           	System.out.print(" 3.번호를 새로 만들어 맞는 확률을 구해");
           	System.out.print(" 4.과거 n회의 출현한 번호로 구성해 맞는 확률 구하기");
           	System.out.println(" 5.마지막 10회에서 확률 구하기");
           	System.out.print(" 6.");
        	System.out.print(" 7.");
        	System.out.println(" 8.번호별 회귀 분석");
        	System.out.print(" 9.1번 100~ 회귀 분석"); 
        	System.out.print(" 10.2번 100~ 회귀 분석");
        	System.out.print(" 11.3번 100~ 회귀 분석");        	
        	System.out.println(" 12.4번 100~ 회귀 분석");
           	System.out.print(" 0.end");
        	System.out.println(" 메뉴를 입력하여 주세요: ");
            switchCase = sc.nextInt();
            
	        if(switchCase == 1 ){

	            NR.PrevalenceCalc();
	            NR.printPrevalenceResult();
	            switchCase = 99;
	        	
	        }else if(switchCase == 2 ){ 
	        	System.out.print("로또번호 추출 개수 입력: ");
	            int gameCnt = sc.nextInt();

	            String str2;
	            
	            for (int i = 1; i <= gameCnt; i++) {
	            	str2= lotto.lottoNumbers();
	                System.out.print(i+ "번째  "+ str2 +"--> " );
	
	                for(int j =0; j < 6; j++) {
	                	System.out.print( lotto.lottoNums[j] + "," );
	                }
	                System.out.println("");
	            }
	            switchCase = 99;
	            
	        }else if(switchCase == 3 ){
	        	int lastRoundNumber[] = { 888, 3, 7, 12, 31, 44, 38, 32, 0, 0 };	
	        	int gameCnt = 1 ;
	        	
	            do {
	            	int corectOk = 0;
	            	lotto.lottoNos();
	                System.out.print( gameCnt + "번째,  ");    
	                for(int j =0; j < 6; j++) {
	                	System.out.print( lotto.lottoNums[j] + "," );
	                	if( lotto.lottoNums[j] == lastRoundNumber[j+1] ) {
	                		corectOk ++;
	                	}
	                	
	                }
	                System.out.println("--> " + corectOk +"개 ok");
	                if( corectOk == 6) {
	                	switchCase = 99;
	                }
	                gameCnt ++;
	            }while( switchCase != 99  ); 	
	    	
	        	
	        	switchCase = 99;
	        }else if( switchCase == 4 ) {
	        	System.out.println("마지막 로또번호 회차수: 890 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("반복 확률 계산 횟수: ");
	            int gameCnt = 10;   
	            int gameNum = 890;
	            
	            NR.lastLottoNo( gameNum,gameCnt);
	        	switchCase = 99;
	        	
	        }else if( switchCase == 5 ) {
	        	System.out.println("마지막 로또번호 회차수: 892 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("반복 확률 계산 횟수: ");
	            int gameCnt = 10;   
	            int gameNum = 892;
	            
	        	NR.lastLotto_10_review( gameNum,gameCnt);
	        	
	        	System.out.println("마지막 추첨회차는 :"+ NR.LastDraw() +"회 입니다");
	        	
	        	int[] NRarr = NR.DrawNumberArr( gameNum );
	        	System.out.println( NRarr );
	        	System.out.println( NR.DrawNumber(892, 1) );
	        	switchCase = 99;
	        }else if( switchCase == 6 ) {
	        	System.out.println("마지막 로또번호 회차수: 895 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("반복 확률 계산 횟수: ");
	            int gameCnt = 10;   
	            int gameNum = 895;
	            
	        	NR.lastLotto_10_review( gameNum,gameCnt);
	        	
	        	System.out.println("마지막 추첨회차는 :"+ NR.LastDraw() +"회 입니다");
	        	
	        	int[] NRarr = NR.DrawNumberArr( gameNum );
	        	System.out.println( NRarr[1] );
	        	System.out.println( NR.DrawNumber(gameNum, 1) );
	        	switchCase = 99;
	        }else if( switchCase == 7 ) {
	        	NR.NRArrayPrintln();
	        	switchCase = 99;	 
	        }else if( switchCase == 8 ) {
	        	NR.snumInit();
	        	NR.selfNumberReview(1);
	        	for(int Pnum=0; Pnum <46; Pnum++) {
	            	NR.selfNumberReviewPrint(Pnum);    		
	        	}
	        	switchCase = 99;
	        }else if( switchCase == 9 ) {
	        	
	        	int self_snum = 1;
	        	for(int self_snumber = 1; self_snumber <= 895; self_snumber++) {
		        	NR.selfReview(self_snum,self_snumber);
    				//NR.selfReviewPrint(self_snumber);   
	        	}
	        	switchCase = 99;
	        	
	        }else if( switchCase == 10 ) {
	        	int self_snum = 2;
	        	int self_snumber = 895;
	        	NR.selfReview(self_snum,self_snumber);
	        	switchCase = 99;
	        }	             
        }while( switchCase != 0 );
        sc.close();


//        NumberReview arr2 = new NumberReview();
//		NumberReview arr2 = new NumberReview();
//        System.out.println(arr2.arr.length);         

        //      String str = "3,5,6,24,41,43";
//      String[] splitStr = str.split(",");
    }


}


//5080555번째,  7,13,14,33,42,45,--> 1개 ok
//5080556번째,  3,8,10,12,35,42,--> 0개 ok
//5080557번째,  1,4,14,18,29,37,--> 6개 ok

//62150811번째,  3,4,14,20,24,44,--> 2개 ok
//62150812번째,  3,9,15,25,34,41,--> 0개 ok
//62,150,813번째,  1,4,14,18,29,37,--> 6개 ok

//
//2798536번째,  5,25,30,39,41,42,--> 1개 ok
//2798537번째,  10,15,22,27,29,40,--> 0개 ok
//2798538번째,  16,17,21,23,34,43,--> 0개 ok
//2798539번째,  15,23,24,33,40,45,--> 0개 ok
//2,798,540번째,  3,13,29,38,39,42,--> 6개 ok

//4152054번째,  4,19,25,32,37,41,--> 0개 ok
//4152055번째,  9,11,25,32,39,43,--> 1개 ok
//4152056번째,  4,10,11,15,23,44,--> 0개 ok
//4152057번째,  3,13,29,38,39,42,--> 6개 ok
