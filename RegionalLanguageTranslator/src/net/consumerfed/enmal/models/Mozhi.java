package net.consumerfed.enmal.models;

/**
 * 
 */

/**
 * @author Bithesh
 *
 */
public class Mozhi {

	String []aa = {"�","�"};
	String []e = {"�","�"};
	String []ee = {"�","�"};
	String []u = {"�","�"};
	String []uu = {"�","�"};
	String []i = {"�","�"};
	String []ii = {"�","�"};
	String []ai = {"�","�"};
	String []o = {"�","�"};
	String []oo = {"�","�"}; 
	String []ou = {"�","�"};
	String tilt = "�";

	public String getMalayalam(String engWord) {
		String englishWord = engWord;
		String malWord = englishWord.replaceAll("who is the author", "����� ����V");
		/*
		malWord = malWord.replaceAll("ni", "��");
		malWord = malWord.replaceAll("jE", "�");
		malWord = malWord.replaceAll("ja", "��");
		malWord = malWord.replaceAll("va", "�");
		malWord = malWord.replaceAll("bi", "��");
		malWord = malWord.replaceAll("the", "��");
		malWord = malWord.replaceAll("sh", "��");
		*/
		
		//kootaksharangal 3 combination
		malWord = malWord.replaceAll("ksh", "f");
		
		//venganaksharangal
		malWord = malWord.replaceAll("kh", "�");
		malWord = malWord.replaceAll("gh", "�");
		malWord = malWord.replaceAll("ng", "�");
		malWord = malWord.replaceAll("jh", "�");
		malWord = malWord.replaceAll("nj", "�");
		malWord = malWord.replaceAll("Th", "�");
		malWord = malWord.replaceAll("Dh", "�");
		malWord = malWord.replaceAll("nn", "K");
		malWord = malWord.replaceAll("ph", "�");
		malWord = malWord.replaceAll("bh", "�");
		malWord = malWord.replaceAll("sh", "�");
		malWord = malWord.replaceAll("zh", "�");
		malWord = malWord.replaceAll("th", "�");
		
		//double 
		malWord = malWord.replaceAll("tt", "J");
		
		//chillaksharangal 2 combination
		//malWord = malWord.replaceAll("n^", "X");
		malWord = malWord.replaceAll("[A-Za-z]n\\b", "X");  // ends with n preceed by a charZ
		malWord = malWord.replaceAll("[A-Za-z]l\\b", "Z");
		malWord = malWord.replaceAll("[A-Za-z]L\\b", "Z");
		malWord = malWord.replaceAll("[A-Za-z]r\\b", "V");
		
		// ko kO
		//if(malWord)
		
		
		//vowels 2 combination
		malWord = malWord.replaceAll(" ou", " "+ou[1]);
		malWord = malWord.replaceAll("ou", ou[0]);
		malWord = malWord.replaceAll(" ai", " "+ai[1]);
		malWord = malWord.replaceAll("ai", ai[0]);
	
		//malWord = malWord.replaceAll("R^", "�");
		/*
		//endswith
		if(malWord.endsWith("n")){
			malWord = malWord.replaceAll("n", "X");
		}
		*/
		malWord = malWord.replaceAll("k", "�");
		malWord = malWord.replaceAll("g", "�");
		malWord = malWord.replaceAll("c", "�");
		malWord = malWord.replaceAll("C", "��");
		malWord = malWord.replaceAll("j", "�");
		malWord = malWord.replaceAll("T", "�");
		malWord = malWord.replaceAll("D", "�");
		malWord = malWord.replaceAll("p", "�");
		malWord = malWord.replaceAll("b", "�");
		malWord = malWord.replaceAll("m", "�");
		malWord = malWord.replaceAll("y", "�");
		malWord = malWord.replaceAll("r", "�");
		malWord = malWord.replaceAll("l", "�");
		malWord = malWord.replaceAll("v", "�");
		malWord = malWord.replaceAll("S", "�");
		malWord = malWord.replaceAll("h", "�");
		malWord = malWord.replaceAll("L", "{");
		malWord = malWord.replaceAll("R", "�");
		malWord = malWord.replaceAll("s", "�");
		malWord = malWord.replaceAll("t", "�");
		malWord = malWord.replaceAll("n", "�");
		malWord = malWord.replaceAll("f", "�");
		
		//kootaksharangal
		
		malWord = malWord.replaceAll("M", "N");
		malWord = malWord.replaceAll("P", "M");
		
		//chinnangal (sign)
		malWord = malWord.replaceAll("~", tilt);
		//malWord = malWord.replaceAll("d", "���");
		
		//chillaksharangal
		//malWord = malWord.replaceAll("n", "X");
		
		//vowels 
		malWord = malWord.replaceAll(" a", " �");
		malWord = malWord.replaceAll("a", " ");
		malWord = malWord.replaceAll(" A", " "+aa[1]);
		malWord = malWord.replaceAll("A", aa[0]);
		malWord = malWord.replaceAll(" e", " "+e[1]);
		malWord = malWord.replaceAll("e", e[0]);
		malWord = malWord.replaceAll(" E", " "+ee[1]);
		malWord = malWord.replaceAll("E", ee[0]);
		malWord = malWord.replaceAll(" u", " "+u[1]);
		malWord = malWord.replaceAll("u", u[0]);
		malWord = malWord.replaceAll(" U", " "+uu[1]);
		malWord = malWord.replaceAll("U", uu[0]);
		malWord = malWord.replaceAll(" i", " "+i[1]);
		malWord = malWord.replaceAll("i", i[0]);
		malWord = malWord.replaceAll(" I", " "+ii[1]);
		malWord = malWord.replaceAll("I", ii[0]);
		malWord = malWord.replaceAll(" o", " "+o[1]);
		malWord = malWord.replaceAll("o", o[0]);
		malWord = malWord.replaceAll(" O", " "+oo[1]);
		malWord = malWord.replaceAll("O", oo[0]);


		//malWord.
		
		
		return malWord;
	}

}
