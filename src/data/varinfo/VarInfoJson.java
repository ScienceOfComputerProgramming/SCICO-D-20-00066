package data.varinfo;

import java.util.List;

import data.Recentdata;

public class VarInfoJson {

	private String dataid;
	private String className;
	private String methodName;
	private String var;
	private String linenum;
	//private final String _countcomment = "その行で何回目の出現か(同じ変数が行内にあったときのみカウント+)";
	private String inst;
	private int count;
	private List<Recentdata> valueList;

	public VarInfoJson() {
	}

	public VarInfoJson(String dataid, String className, String methodName, String var, String linenum, String inst) {
		this.dataid = dataid;
		this.className = className;
		this.methodName = methodName;
		this.var = var;
		this.linenum = linenum;
		this.inst = inst;
	}

	public String getDataid() {
		return dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getLinenum() {
		return linenum;
	}

	public void setLinenum(String linenum) {
		this.linenum = linenum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Recentdata> getValueList() {
		return valueList;
	}

	public void setValueList(List<Recentdata> valueList) {
		this.valueList = valueList;
	}

	public String getInst() {
		return inst;
	}

	public void setInst(String inst) {
		this.inst = inst;
	}
}