package com.cdrundle.cdc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 仪器设备对应的方法
 *
 * @ClassName: MachineCodeAndFun
 * @Description: 实验室仪器设备的编码和功能
 * @author 肖铜
 * @date 2021-05-31
 *
 */
public enum MachineCode {

	ICPMARS("电感耦合等离子体质谱仪","理检－08"),
	FYFS400("低本底α/β测定系统","理检-01"),
	Microplate("酶标仪PHOMO","微检－29"),
	AFS230E("双道原子荧光光度计","理检－05"),
	TAS990("原子吸收分光光度计","理检－09"),
	ICS90("离子色谱仪","理检－06"),
	DIONEXAQUION("离子色谱仪","理检-39"),
	Agilent7890A("气相色谱仪","理检－12"),
	Agilent5975C("气相色谱质谱联用仪","理检－13"),
	DioNexUitiMate300("超高液相色谱仪","理检-40"),
	Agilent1200("液相色谱仪","理检－14"),
	SANSYSTEM("连续流动分析仪","理检－03"),
	HISCL5000("化学发光仪","微检－49"),
	GCMSQP("气相色谱-质谱联用仪","理检-41"),
	GC2010Plus("气相色谱仪","理检-38"),
	VITEK2("全自动微生物鉴别及药敏分析系统","微检－03"),
	ZEENIT700("原子吸收分光光度计","理检-10"),


	//隆昌
	LONGCHANGPCR7500("PCR","135"),
	LONGCHANGLPCR48P("PCR","000"),//暂时未收集到仪器编码，设置未000
	LONGCHANGAGILENT1260("高效液相色谱仪","138"),
	LONGCHANGAGILENT7890B("气象色谱仪","137"),
	LONGCHANGICS1100("离子色谱仪","136"),
	LONGCHANGAFS3000("双通道原子荧光光度计","070"),
	LONGCHANGAFS9700("双通道原子荧光光度计","133"),
	LONGCHANGPE900T("原子吸收光谱仪","145"),
	LONGCHANGMICRO("酶标仪","118"),

	//宜宾
	YIBINA206("ICP","A206"),
	YIBINA378("ICPMS","A378"),
	YIBINA375("PCRABI7500","A375"),
	YIBINA179("7890A气象色谱仪","A179"),
	YIBINA355("7890B气象色谱仪","A355"),
	YIBINA354("超高液相色谱仪","A354"),
	YIBINA181("高效液相色谱仪","A181"),
	YIBINA180("离子色谱仪","A180"),
	YIBINA379("液相色谱质谱联用仪","A379"),
	YIBINA178("原子吸收仪","A178"),
	YIBINA344("原子荧光仪","A344"),
	YIBINA177("气象色谱-质谱联用仪","A177");


	private final String title;
	private final String code;

	private MachineCode(String title, String code)
	{
		this.title = title;
		this.code = code;
	}

	public String toString()
	{
		return this.title;
	}

	public String toCode(){
		return this.code;
	}

	public static MachineCode get(String str) {
		for (MachineCode e : values()) {
			if(e.toString().equals(str)) {
				return e;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> toList()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (MachineCode e : values())
		{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", e.name());
			map.put("title", e.toString());
			list.add(map);
		}
		return list;
	}

	public static Map<String, String> toMap(){
		Map<String, String> map = new LinkedHashMap<String, String>();
		for (MachineCode e : values()) {
			map.put(e.name(), e.toString());
		}
		return map;
	}


	public static List<MachineCode> getMachineCodeAndFunByNames(String names){
		List<MachineCode> result = new ArrayList();
		String[] nameArray = names.split(",");
		for(String name : nameArray){
			result.add(valueOf(name));
		}
		return result;
	}

}
