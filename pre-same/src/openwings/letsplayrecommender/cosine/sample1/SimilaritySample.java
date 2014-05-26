package openwings.letsplayrecommender.cosine.sample1;

public class SimilaritySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		��۳ʺ� �󱼳��� �Լ��ʺ�	����
		�ƺ�	191 	173 	79	46
		����	124	129	56	34
		�Ʊ�	91	59	21	24 */
		
		Integer[] mom = {124, 129, 56, 34}; 
		Integer[] dad = {191, 173, 79, 46};
		Integer[] baby = {91, 59, 21, 24};
		
		double simMom = measureCosine(mom, baby);
		double simDad = measureCosine(dad, baby);
		
		System.out.println(" consine mon = " + simMom );
		System.out.println(" consine dad = " + simDad );
		
		
		simMom = measureEuclidean(mom, baby);
		simDad = measureEuclidean(dad, baby);
		
		System.out.println(" eu mon = " + simMom );
		System.out.println(" eu dad = " + simDad );
	}

	private static double measureCosine(Integer[] A, Integer[] B) {
		
		int size = A.length;
		
		long normA = 0, normB=0, scla=0;
		for( int i=0 ; i<size ; i++ ) {
			normA += ( A[i]*A[i] );
			normB += ( B[i]*B[i] );
			scla += (  A[i]*B[i] );
		}
		
		double similarity = scla / ( Math.sqrt(normA) * Math.sqrt(normB) );
		return similarity;
	}
	
	
	private static double measureEuclidean( Integer[] A, Integer[] B ) {
		
		double sum = 0.0;
        for (int i=0 ; i<A.length ; i++) {
        	sum = sum + Math.pow((A[i]-B[i]),2.0);
        }
        return Math.sqrt(sum);
	}
	

	
}
