package cn.campsg.java.experiment.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	public void dirsOperate(String dirPath){
		File f=new File(dirPath);
		if(f.exists()){
			String []s=f.list();
			for(String sa:s){
				System.out.println(sa);
			}
		}
		else{System.out.println("目录创建成功？"+f.mkdirs());}
			
			
		
	}

	public void fileOperate(String filename){ 
		File file = new File(filename);
		if (file.exists()) {

			    System.out.println("文件路径：" + file.getPath());

			    System.out.println("文件名：" + file.getName());      

			    System.out.println("是否可执行文件：" + file.canExecute());
			 }
		else{
			try {

			    System.out.println("成功创建文件：" + file.createNewFile());

			  } catch (IOException e) {

			    System.out.println("创建文件失败："+filename+"错误原因："+e.getMessage());

			  }


		}
	  }




}
