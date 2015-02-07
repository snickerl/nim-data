package com.poweruniverse.nim.data.entity;

import com.poweruniverse.nim.data.entity.base.BaseYongHu;

/*
* 实体类：用户
*/
public class YongHu  extends BaseYongHu {
	private static final long serialVersionUID = 1L;
//	private List<Integer> jsdmList = null;
	// constructors 
	public YongHu () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public YongHu (java.lang.Integer id) {
		super(id);
	}

	protected void initialize () {}
	
//	public List<Integer> getJueSeIds(){
//		if(jsdmList==null){
//			jsdmList = new ArrayList<Integer>();
//			Iterator<YongHuJS> jsIts = this.getJss().iterator();
//			while(jsIts.hasNext()){
//				jsdmList.add(jsIts.next().getJueSe().getJueSeDM());
//			}
//		}
//		return jsdmList;
//	}
	
	public boolean isSuperUser(){
		return (this.getYongHuDM()!=null && this.getYongHuDM().intValue()<=1);
	}
	
	
}