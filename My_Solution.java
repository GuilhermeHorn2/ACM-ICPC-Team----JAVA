package misc;



public class main_misc {

	public static void main(String[] args) {
		
		//
		String[]s = {"10101","11110","00010"};
		int[]k = acm_team(s);
		for(int i = 0;i < k.length;i++) {
			System.out.println(k[i]);
		}
	
		
	}
	private static int subjects_covered(String a,String b){
		//
		int j = 0;
		for(int i = 0;i < a.length();i++){
			//
			if(a.substring(i, i+1).equals("1") || b.substring(i, i+1).equals("1")) {
				j++;
			}
		}
		return j;
	}
	private static int max_subjects(String[]s) {
		//
		int k = 0;
		for(int i = 0;i < s.length;i++) {
			for(int j = i+1;j < s.length;j++) {
				int n = subjects_covered(s[i],s[j]);
				if(n >= k) {
					k = n; 
				}
			}
		}
		return k;
	}
	private static int[] acm_team(String[]s) {
		int max = max_subjects(s);
		int[] k = {max,0};
		for(int i = 0;i < s.length;i++) {
			for(int j = i+1;i < s.length;i++) {
				if(subjects_covered(s[i],s[j]) == max) {
					k[1] ++;
				}
			}
		}
		return k;
	}
	
	}
	
	
	

	


	
	

	
		
	
	


	

	
	

