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
		
	    for (int i = 1; i <= 45; i++) {		// List �ȿ� �ζǹ�ȣ �߰�
	        lottoNum.add(i);
	       //System.out.println( lottoNum );
	    }
	    //System.out.println( lottoNum );

	    Collections.shuffle(lottoNum);	    // set���� ���� �������� ���´�
	    
	    //int[] lottoNums = new int[6];
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lottoNum.get(i);
	    //	System.out.println(	i + "��° �ζǹ�ȣ: " + lottoNums[i] );          
	    }
	     
	    // ����
	    Arrays.sort(lottoNums);
	    
	    return Arrays.toString(lottoNums);

    }
	void lottoNos(){    

		List<Integer> lottoNo = new ArrayList<Integer>();
		
	    for (int i = 1; i <= 45; i++) {		// List �ȿ� �ζǹ�ȣ �߰�
	        lottoNo.add(i);
	       //System.out.println( lottoNum );
	    }
	    //System.out.println( lottoNum );

	    Collections.shuffle(lottoNo);	    // set���� ���� �������� ���´�
	    
	    //int[] lottoNums = new int[6];
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lottoNo.get(i);
	    //	System.out.println(	i + "��° �ζǹ�ȣ: " + lottoNums[i] );          
	    }
	     
	    // ����
	    Arrays.sort(lottoNums);
	}
	
	
	void lastLottoNos(int lastLotto) {
		
		List<Integer> lastLottoNos = new ArrayList<Integer>();
		NumberReview arr = new NumberReview();
		int ListPlusNum = 0;
		
		//������ ��÷�� ȸ�� ��ȣ�� �޾� ������ ��÷�� 10ȸ ��ȣ�� ������ list��Ҹ� �����.
	    for (int i = 1; i <= 10; i++) {  // ���� 10ȸ�� 
	    	for( int j = 1; j <= 7; j++ ) {    // ��ȣ 7�� �迭  �о  list�� �ֱ�

	    		if( ListPlusNum == 0 ) {    // ó�� �ߺ� ��Ұ� ������
		    		lastLottoNos.add(  arr.arr[ lastLotto - i ][ j ] );
		    		ListPlusNum++;
		    	}else{  // �ߺ� ��ȣ�� �����ϰ� 
		    		for(int k=0; k <= ListPlusNum; k++) {
		    			
		    			int lastLottoNums = lastLottoNos.get(k);
		    			int reviewLottoNums = arr.arr[ lastLotto - i ][ j ];
		    			
		    			
		    			lastLottoNos.add(  arr.arr[ lastLotto - i ][ j ] );
			    		ListPlusNum++;
		    		}
		    	}
		    	
	    	}
	    }
	    Collections.shuffle(lastLottoNos);	    // set���� ���� �������� ���´�
	    for (int i = 0; i < 6; i++) {
	        this.lottoNums[i] = lastLottoNos.get(i);
	    }
	    Arrays.sort(lottoNums);	    // ����

	}
	


}
