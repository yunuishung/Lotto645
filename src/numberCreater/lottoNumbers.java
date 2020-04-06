package numberCreater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lottoNumbers {
	int[] lottoNums = new int[6];  
	int AllLottoNums[][];
	
	String lottoNumbers(){    

		List<Integer> lottoNum = new ArrayList<Integer>();
		
	    for (int i = 1; i <= 45; i++) {		// List 안에 로또번호 추가
	        lottoNum.add(i);
	       //System.out.println( lottoNum );
	    }
	    //System.out.println( lottoNum );

	    Collections.shuffle(lottoNum);	    // set안의 수를 무작위로 섞는다
	    
	    //int[] lottoNums = new int[6];
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lottoNum.get(i);
	    //	System.out.println(	i + "번째 로또번호: " + lottoNums[i] );          
	    }
	     
	    // 정렬
	    Arrays.sort(lottoNums);
	    
	    return Arrays.toString(lottoNums);

    }
	void lottoNos(){    

		List<Integer> lottoNo = new ArrayList<Integer>();
		
	    for (int i = 1; i <= 45; i++) {		// List 안에 로또번호 추가
	        lottoNo.add(i);
	       //System.out.println( lottoNum );
	    }
	    //System.out.println( lottoNum );

	    Collections.shuffle(lottoNo);	    // set안의 수를 무작위로 섞는다
	    
	    //int[] lottoNums = new int[6];
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lottoNo.get(i);
	    //	System.out.println(	i + "번째 로또번호: " + lottoNums[i] );          
	    }
	     
	    // 정렬
	    Arrays.sort(lottoNums);
	}
	
	
	void lastLottoNos(int lastLotto) {
		
		List<Integer> lastLottoNos = new ArrayList<Integer>();
		NumberReview arr = new NumberReview();
		int ListPlusNum = 0;
		
		//마지막 추첨한 회차 번호를 받아 이전에 추첨된 10회 번호를 가지고 list요소를 만든다.
	    for (int i = 1; i <= 10; i++) {  // 이전 10회차 
	    	for( int j = 1; j <= 7; j++ ) {    // 번호 7개 배열  읽어서  list에 넣기

	    		if( ListPlusNum == 0 ) {    // 처음 중복 요소가 없을때
		    		lastLottoNos.add(  arr.arr[ lastLotto - i ][ j ] );
		    		ListPlusNum++;
		    	}else{  // 중복 번호를 제외하고 
		    		for(int k=0; k <= ListPlusNum; k++) {
		    			
		    			int lastLottoNums = lastLottoNos.get(k);
		    			int reviewLottoNums = arr.arr[ lastLotto - i ][ j ];
		    			
		    			
		    			lastLottoNos.add(  arr.arr[ lastLotto - i ][ j ] );
			    		ListPlusNum++;
		    		}
		    	}
		    	
	    	}
	    }
	    Collections.shuffle(lastLottoNos);	    // set안의 수를 무작위로 섞는다
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lastLottoNos.get(i);
	    }
	    Arrays.sort(lottoNums);	    // 정렬

	}
	


}
