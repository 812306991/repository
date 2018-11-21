package cn.yufei.ssm.system.po;

import java.math.BigDecimal;

import cn.yufei.ssm.system.dal.object.Entity;

public class OrgTree implements Entity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String code;
	private String name;
	private String shortName;
	private String fullName;
	private String fullId;
	private String fullCode;
	private String parent;
	private String sequence;
	private BigDecimal validstate;
	private BigDecimal level;
	private String phone;
	private String fax;
	private String address;
	private String zip;
	private String description;
	private String personId;
	private String kind;
	private String nodeKind;
	private boolean isParent;
	private String icon;
	private boolean open;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullId() {
		return fullId;
	}
	public void setFullId(String fullId) {
		this.fullId = fullId;
	}
	public String getFullCode() {
		return fullCode;
	}
	public void setFullCode(String fullCode) {
		this.fullCode = fullCode;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public BigDecimal getValidstate() {
		return validstate;
	}
	public void setValidstate(BigDecimal validstate) {
		this.validstate = validstate;
	}
	public BigDecimal getLevel() {
		return level;
	}
	public void setLevel(BigDecimal level) {
		this.level = level;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getNodeKind() {
		return nodeKind;
	}
	public void setNodeKind(String nodeKind) {
		this.nodeKind = nodeKind;
	}
	public boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public boolean getOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	

}
