package k;

import java.io.File;
import java.io.IOException;

public class k {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k=new File("E:\\k");
		if(k.exists()){
			File fi =new File(k,"k.txt");
			if(fi.exists()){
			fi.delete();
			System.out.println("文件存在，已删除！！");
			}
			else{
				System.out.println("文件不存在，创建");
				System.out.println("创建成功"+fi.createNewFile());
			}
			
		}
		else{System.out.println("文件夹不存在");
		System.out.println("文件夹创建成功了吗"+k.mkdirs());
		}

	}

	

}
