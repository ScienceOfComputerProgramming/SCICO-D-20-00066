package logvis;

import createjson.CreateJson;
import data.SeloggerFiles;

public class Main {
	/**
	 * args[0]=recentdata.txt
	 * args[1]=dataids.txt
	 * args[2]=methods.txt
	 * args[3..]=srcFiles or dir
	 */
	public static void main(String args[]) {
		String dir = args[0];
		SeloggerFiles selfiles = new SeloggerFiles(args[0]);
		//CreateHtml cre = new CreateHtml(selfiles, dir);
		CreateJson cre = new CreateJson(selfiles, dir);
		cre.start();

	}
}
