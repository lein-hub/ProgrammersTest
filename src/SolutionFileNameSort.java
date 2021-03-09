import java.util.*;

public class SolutionFileNameSort {
	
	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

		FileName ddd = new FileName("F-5 Freedom Fighter", 0);
		
		System.out.println(ddd.getFileName());
		System.out.println(ddd.getHead());
		System.out.println(ddd.getNumber());
		System.out.println(ddd.getTail());
		
		for (String a : solution(files))
			System.out.println(a);
	}
	
	public static String[] solution(String[] files) {
        String[] answer;
        
        ArrayList<FileName> list = new ArrayList<>();
        
        for (int i=0; i<files.length; i++) {
        	list.add(new FileName(files[i], i));
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i).getFileName();
        }
        
        
        return answer;
    }

}

class FileName implements Comparable<FileName> {

	private String fileName;
	private int fileIdx;
	private String head="", number="", tail="";
	private byte hnt = 0;
	
	
	
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

	public FileName(String fileName, int fileIdx) {
		this.fileName = fileName;
		this.fileIdx = fileIdx;
		
		char[] list = fileName.toCharArray();
		
		for (char c : list) {
			if (!Character.isDigit(c) && hnt == 0) {
				this.head += c;
			} else if (Character.isDigit(c) && hnt < 5) {
				this.number += c;
				hnt++;
			} else {
				this.tail += c;
				hnt=5;
			}
		}
	}
	
	@Override
	public int compareTo(FileName o) {
		
		if (this.getHead().toLowerCase().compareTo(o.getHead().toLowerCase()) > 0) {
			return 1;
		} else if (this.getHead().toLowerCase().compareTo(o.getHead().toLowerCase()) == 0) {
			if (Integer.parseInt(this.getNumber()) - Integer.parseInt(o.getNumber()) > 0) {
				return 1;
			} else if (Integer.parseInt(this.getNumber()) - Integer.parseInt(o.getNumber()) == 0) {
				return this.getFileIdx() - o.getFileIdx();
			}
		}
		return -1;
	}
	
}