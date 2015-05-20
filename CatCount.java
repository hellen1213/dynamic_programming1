package q3;


public class CatCount {

	public int ct(String key, String src){
	
		int[][] f = new int[key.length() + 1][src.length()+ 1];
		for(int i = 0; i<src.length() ; i++){
			f[0][i] = 1;
			
		}
		
		
		f[0][0] = 1;
		for(int i=1; i <= key.length(); i++){
			for(int j=1; j <= src.length(); j++){
				if(key.charAt(i-1) == src.charAt(j-1)){
					f[i][j] = f[i-1][j-1] + f[i][j-1];
				}else{
					f[i][j] = f[i][j-1];
				}
			}
		}
		return f[key.length()][src.length()];
	}
	
	public static void main(String[] args){
		CatCount cc = new CatCount();
		System.out.println(cc.ct("cat", "catapuelte"));
	}
}
