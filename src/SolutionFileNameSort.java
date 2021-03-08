import java.util.*;

public class SolutionFileNameSort {
	
	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
	}
	
	public String[] solution(String[] files) {
        String[] answer = {};
        
        ArrayList<FileName> list = new ArrayList<>();
        
        for (int i=0; i<files.length; i++) {
        	
        }
        
        
        return answer;
    }

}

class FileName implements Comparable<FileName> {

	private String fileName;
	private int fileIdx;
	private String head, number, tail;
	
	
	
	public String getFileName() {
		return fileName;
	}

	public int getFileIdx() {
		return fileIdx;
	}

	public String getHead() {
		return head;
	}

	public String getNumber() {
		return number;
	}

	public String getTail() {
		return tail;
	}

	public FileName(String fileName, int fileIdx, String head, String number, String tail) {
		this.fileName = fileName;
		this.fileIdx = fileIdx;
		this.head = head;
		this.number = number;
		this.tail = tail;
	}
	
	@Override
	public int compareTo(FileName o) {
		
		if (this.getHead().compareTo(o.getHead()) > 0) {
			return 1;
		} else if (this.getHead().compareTo(o.getHead()) == 0) {
			if (Integer.parseInt(this.getNumber()) - Integer.parseInt(o.getNumber()) > 0) {
				return 1;
			} else if (Integer.parseInt(this.getNumber()) - Integer.parseInt(o.getNumber()) == 0) {
				return this.getFileIdx() - o.getFileIdx();
			}
		}
		return 0;
	}
	
}