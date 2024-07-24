package test.t240724.object1;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		fd.checkName(file);
		return true;
		
	}
	
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
		
	}
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
		
	}
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}

}
