package Models;

import java.io.*;
import java.util.*;

public class BulkRefactor {

	public static interface IRename {

		public void rename(final CFile file, String... params);
	}

	protected ArrayList<CFile> CFiles;

	public boolean forFile,
			forDir,
			forSubDir,
			ignoreExtension;

	public String originPath,
			params[];

	public IRename action;

	/**
	 *
	 * @param Action
	 * @param params
	 * @param originPath
	 * @param forFile
	 * @param forDir
	 * @param forSubDir
	 * @param ignoreExtension
	 */
	public BulkRefactor(IRename Action, String originPath, boolean forFile, boolean forDir, boolean forSubDir, boolean ignoreExtension, String... params) {
		this.action = Action;
		this.originPath = originPath;
		this.forFile = forFile;
		this.forDir = forDir;
		this.forSubDir = forSubDir;
		this.ignoreExtension = ignoreExtension;
		this.params = params;
	}

	/**
	 * validate all the fields of the class
	 *
	 * @return
	 */
	public boolean validate() {
		return params != null
				//&& forDir != forSubDir
				&& new File(this.originPath).exists()
				&& new File(this.originPath).isDirectory();
	}

	/**
	 * fill the array of CFiles with the new name
	 *
	 * @return true if an only if Success
	 */
	public boolean Prepair() {
		if (!this.validate()) {
			return false;
		}
		this.CFiles = new ArrayList<>();
		make(this.originPath, null);
		return true;
	}

	/**
	 * fill the array of CFiles with the new name
	 *
	 * @param Path used for recursion to loop all sub directory
	 */
	private void make(final String Path, final CFile parent) {
		File[] listOfFiles = new File(Path).listFiles();// get an array of all files and folder in that path
		CFile tmpCFile;
		for (File tempFile : listOfFiles) {
			tmpCFile = new CFile(Path, tempFile, parent, this.ignoreExtension);

			if ((tempFile.isFile() && forFile)
					|| (tempFile.isDirectory() && forDir)) {
				this.action.rename(tmpCFile, this.params);
				this.CFiles.add(tmpCFile);
			}

			if (tempFile.isDirectory() && forSubDir) {
				make(Path + "\\" + tmpCFile.oldName, tmpCFile);
			}
		}
	}

	/**
	 * loop all the CFiles and rename them
	 */
	public void rename() {
		if (this.CFiles == null) {
			return;
		}
		for (CFile tempCFile : this.CFiles) {
			tempCFile.rename();
		}
	}

	/**
	 * loop all the CFiles and undo the previous rename
	 */
	public void undoRename() {
		if (this.CFiles == null) {
			return;
		}
		for (CFile tempCFile : this.CFiles) {
			tempCFile.undoRename();
		}
	}

	/**
	 * @return the array of CFiles
	 */
	public ArrayList<CFile> getCFiles() {
		return this.CFiles;
	}
}
