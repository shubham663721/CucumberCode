package Utility;
import java.io.File;
import java.util.List;

import org.apache.commons.net.ftp.FTPFile;

import MyCommonObject.CommonPage;


public interface FTPService {
	boolean connect(String user, String password, String host, int port);
	void disconnect();
	List<CommonPage> ls();//list files/directories
	boolean cd(String directoryName);//change directory
	boolean download(String fileName, String localPath);
	boolean upload(File localFile, String remotePath);
	String currentRemoteDir();
}
