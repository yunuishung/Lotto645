package numberCreater;

import java.util.Scanner;
 
public class Lotto {
    
    public static void main(String[] args) {
        
    	lottoNumbers lotto =new lottoNumbers();  
		Scanner sc = new Scanner(System.in);
        NumberReview NR = new NumberReview();		
        
		int switchCase;
        
        do {
           	System.out.print(" 1.���� ������");
           	System.out.print(" 2.��ȣ����");
           	System.out.print(" 3.��ȣ�� ���� ����� �´� Ȯ���� ����");
           	System.out.print(" 4.���� nȸ�� ������ ��ȣ�� ������ �´� Ȯ�� ���ϱ�");
           	System.out.println(" 5.������ 10ȸ���� Ȯ�� ���ϱ�");
           	System.out.print(" 6.");
        	System.out.print(" 7.");
        	System.out.println(" 8.��ȣ�� ȸ�� �м�");
        	System.out.print(" 9.1�� 100~ ȸ�� �м�"); 
        	System.out.print(" 10.2�� 100~ ȸ�� �м�");
        	System.out.print(" 11.3�� 100~ ȸ�� �м�");        	
        	System.out.println(" 12.4�� 100~ ȸ�� �м�");
           	System.out.print(" 0.end");
        	System.out.println(" �޴��� �Է��Ͽ� �ּ���: ");
            switchCase = sc.nextInt();
            
	        if(switchCase == 1 ){

	            NR.PrevalenceCalc();
	            NR.printPrevalenceResult();
	            switchCase = 99;
	        	
	        }else if(switchCase == 2 ){ 
	        	System.out.print("�ζǹ�ȣ ���� ���� �Է�: ");
	            int gameCnt = sc.nextInt();

	            String str2;
	            
	            for (int i = 1; i <= gameCnt; i++) {
	            	str2= lotto.lottoNumbers();
	                System.out.print(i+ "��°  "+ str2 +"--> " );
	
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
	                System.out.print( gameCnt + "��°,  ");    
	                for(int j =0; j < 6; j++) {
	                	System.out.print( lotto.lottoNums[j] + "," );
	                	if( lotto.lottoNums[j] == lastRoundNumber[j+1] ) {
	                		corectOk ++;
	                	}
	                	
	                }
	                System.out.println("--> " + corectOk +"�� ok");
	                if( corectOk == 6) {
	                	switchCase = 99;
	                }
	                gameCnt ++;
	            }while( switchCase != 99  ); 	
	    	
	        	
	        	switchCase = 99;
	        }else if( switchCase == 4 ) {
	        	System.out.println("������ �ζǹ�ȣ ȸ����: 890 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("�ݺ� Ȯ�� ��� Ƚ��: ");
	            int gameCnt = 10;   
	            int gameNum = 890;
	            
	            NR.lastLottoNo( gameNum,gameCnt);
	        	switchCase = 99;
	        	
	        }else if( switchCase == 5 ) {
	        	System.out.println("������ �ζǹ�ȣ ȸ����: 892 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("�ݺ� Ȯ�� ��� Ƚ��: ");
	            int gameCnt = 10;   
	            int gameNum = 892;
	            
	        	NR.lastLotto_10_review( gameNum,gameCnt);
	        	
	        	System.out.println("������ ��÷ȸ���� :"+ NR.LastDraw() +"ȸ �Դϴ�");
	        	
	        	int[] NRarr = NR.DrawNumberArr( gameNum );
	        	System.out.println( NRarr );
	        	System.out.println( NR.DrawNumber(892, 1) );
	        	switchCase = 99;
	        }else if( switchCase == 6 ) {
	        	System.out.println("������ �ζǹ�ȣ ȸ����: 895 ");
	            //int gameNum = sc.nextInt();        	
	        	//System.out.print("�ݺ� Ȯ�� ��� Ƚ��: ");
	            int gameCnt = 10;   
	            int gameNum = 895;
	            
	        	NR.lastLotto_10_review( gameNum,gameCnt);
	        	
	        	System.out.println("������ ��÷ȸ���� :"+ NR.LastDraw() +"ȸ �Դϴ�");
	        	
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


//5080555��°,  7,13,14,33,42,45,--> 1�� ok
//5080556��°,  3,8,10,12,35,42,--> 0�� ok
//5080557��°,  1,4,14,18,29,37,--> 6�� ok

//62150811��°,  3,4,14,20,24,44,--> 2�� ok
//62150812��°,  3,9,15,25,34,41,--> 0�� ok
//62,150,813��°,  1,4,14,18,29,37,--> 6�� ok

//
//2798536��°,  5,25,30,39,41,42,--> 1�� ok
//2798537��°,  10,15,22,27,29,40,--> 0�� ok
//2798538��°,  16,17,21,23,34,43,--> 0�� ok
//2798539��°,  15,23,24,33,40,45,--> 0�� ok
//2,798,540��°,  3,13,29,38,39,42,--> 6�� ok

//4152054��°,  4,19,25,32,37,41,--> 0�� ok
//4152055��°,  9,11,25,32,39,43,--> 1�� ok
//4152056��°,  4,10,11,15,23,44,--> 0�� ok
//4152057��°,  3,13,29,38,39,42,--> 6�� ok
