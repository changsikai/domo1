package cn.campsg.java.experiment;

import java.io.File;

import cn.campsg.java.experiment.utils.FileUtils;

public class MainClass {

	public static void main(String[] args) {
		
		String userdir=System.getProperty("user.dir");
	    System.out.println("系统用户目录："+userdir);
	    String dir = userdir+File.separator+"logs"+File.separator+"xp";
	    FileUtils fu = new FileUtils();
	    fu.dirsOperate(dir);
	    String filename = dir+File.separator+"xtest.txt";
	    fu.fileOperate(filename);


	}

}
