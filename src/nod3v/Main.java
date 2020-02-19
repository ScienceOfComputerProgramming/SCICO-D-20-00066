package nod3v;

import createjson.StartJson;
import data.SeloggerFiles;

public class Main {
	/**
	 * args[0] = targetdir
	 */
	public static void main(String args[]) {
		String dir = args[0];

		SeloggerFiles selFiles = new SeloggerFiles(args[0]);
		StartJson cre = new StartJson(selFiles, dir);
		cre.start();
	}
}
