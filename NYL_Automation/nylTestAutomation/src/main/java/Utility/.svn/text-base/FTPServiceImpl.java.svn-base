package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

import MyCommonObject.CommonPage;
import Utility.FTPService;

public class FTPServiceImpl implements FTPService {
	/*private String user;
	private String password;
	private String hostName;*/
	//private List<File> files;
	/*private FTPClient ftpClient;*/
	private ChannelSftp sftpChannel;
	public boolean connect(String user, String password, String host, int port) {
		JSch jsch  = new JSch();
		Session session = null;
		Channel channel;
		try {
		session = jsch.getSession(user, host,port);
		session.setConfig("StrictHostKeyChecking", "no");
		session.setPassword(password);
		session.connect();

		channel = session.openChannel("sftp");
		channel.connect();
		sftpChannel = (ChannelSftp) channel;
		return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public void disconnect() {
		try {
			System.out.println("Disconnecting "+sftpChannel.getSession().getHost());
			if(sftpChannel.getSession() != null) {				
				sftpChannel.disconnect();
				sftpChannel.getSession().disconnect();			
			}
		} catch (JSchException e1) {			
			e1.printStackTrace();
		}
		
		
	}

	public List<CommonPage> ls()  {
		List<CommonPage> files = null;
		Vector<LsEntry> remoteFiles;
		
		try {
			remoteFiles = (Vector<LsEntry>)sftpChannel.ls(sftpChannel.pwd());
			if(!remoteFiles.isEmpty()) {
				files = new ArrayList<>(remoteFiles.size());
				for(LsEntry entry : remoteFiles) {
					if(entry.getFilename().equals(".") || entry.getFilename().equals("..")) {
						continue;
					}
					SftpATTRS attributes = entry.getAttrs();
					CommonPage obj = new CommonPage();
					obj.setFileName(entry.getFilename());
					obj.setSizeInBytes(attributes.getSize());
					obj.isDirectory(attributes.isDir());
					files.add(obj);
				}
				return Collections.unmodifiableList(files);
			}
		} catch (SftpException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public boolean download(String remoteFileName, String localPath) {
		File localFile = new File(localPath+File.separator+remoteFileName);
		try(OutputStream os = new FileOutputStream(localFile);){
			sftpChannel.get(remoteFileName, os);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}
	public boolean cd(String directoryName) {
		try {
			if(directoryName.startsWith("/")) {
				sftpChannel.cd(directoryName);
			}else {
				sftpChannel.cd(sftpChannel.pwd()+"//"+directoryName);
			}
			
			return true;
		} catch (SftpException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean upload(File localFile, String remotePath) {
		try(InputStream is = new FileInputStream(localFile);){
			sftpChannel.put(is, remotePath);
			//ftpClient.storeFile(remotePath, is);
			return true;
		}catch(SftpException | IOException ex) {
			ex.printStackTrace();
			
		}
		return false;
	}
	
	public String currentRemoteDir() {
		try {
			return sftpChannel.pwd();
		} catch (SftpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}

	

}
