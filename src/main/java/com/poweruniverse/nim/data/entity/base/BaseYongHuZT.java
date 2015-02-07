package com.poweruniverse.nim.data.entity.base;
import java.io.Serializable;

import com.poweruniverse.nim.data.entity.YongHuZT;
/*
* 实体类：用户状态
*/
public abstract class BaseYongHuZT  implements Serializable,Comparable<Object> ,EntityI {
	private static final long serialVersionUID = 1L;
	private int hashCode = Integer.MIN_VALUE;

	// constructors
	public BaseYongHuZT () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseYongHuZT (java.lang.Integer id) {
		this.setYongHuZTDM(id);
		initialize();
	}

	protected abstract void initialize ();
	
	// 主键：yongHuZTDM
	private java.lang.Integer yongHuZTDM = null;
	public java.lang.Integer getYongHuZTDM(){return this.yongHuZTDM ;}
	public void setYongHuZTDM(java.lang.Integer yongHuZTDM){this.yongHuZTDM = yongHuZTDM;}

			
	// 属性：用户状态名称 （yongHuZTMC）
	private java.lang.String yongHuZTMC = null;
	public java.lang.String getYongHuZTMC(){return this.yongHuZTMC ;}
	public void setYongHuZTMC(java.lang.String yongHuZTMC){this.yongHuZTMC = yongHuZTMC;}
	
	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof YongHuZT)) return false;
		else {
			YongHuZT entity = (YongHuZT) obj;
			if (null == this.getYongHuZTDM() || null == entity.getYongHuZTDM()) return false;
			else return (this.getYongHuZTDM().equals(entity.getYongHuZTDM()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getYongHuZTDM()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getYongHuZTDM().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}
	
	public String toString() {
		return this.yongHuZTMC+"";
	}

	public Integer pkValue() {
		return this.yongHuZTDM;
	}

	public String pkName() {
		return "yongHuZTDM";
	}

	public void pkNull() {
		this.yongHuZTDM = null;;
	}
	
	public int compareTo(Object o) {
		YongHuZT obj = (YongHuZT)o;
		if(this.getYongHuZTDM()==null){
			return 1;
		}
		return this.getYongHuZTDM().compareTo(obj.getYongHuZTDM());
	}
	
	public YongHuZT clone(){
		YongHuZT yongHuZT = new YongHuZT();
		
		yongHuZT.setYongHuZTMC(yongHuZTMC);
		
		return yongHuZT;
	}
	
	
	
	
	
	
}