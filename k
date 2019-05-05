package k;

import java.io.File;

public class k1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File k=new File("E:\\");
		if(k.exists()&&k.isDirectory()){
			String []s=k.list();
			for(String sa:s){
				File fs=new File(k,sa);
				if(fs.isFile()){
					System.out.println(fs.getName()+"\t文件大小是："+fs.length());
					
				}
				else{System.out.println(fs.getName()+"\t<dir> 文件夹");}
			}
		}
		
	}
	
	}


