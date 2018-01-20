package com.innowave.mahaulb.service.treecensus.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import com.innowave.mahaulb.common.dao.TmCmApartment;
import com.innowave.mahaulb.common.dao.TmCmLocality;
import com.innowave.mahaulb.common.dao.TmCmRoad;
import com.innowave.mahaulb.common.dao.master.TmCmLocation;
import com.innowave.mahaulb.common.dao.trans.TtServiceRequest;
import com.innowave.mahaulb.common.service.utils.beans.FilesBean;
import com.innowave.mahaulb.repository.treecensus.dao.master.TmTreeAuthorityMaster;
import com.innowave.mahaulb.repository.treecensus.dao.master.TmTreeNameMaster;
import com.innowave.mahaulb.repository.treecensus.dao.trans.TtTreeSurveyUploadList;

public class TtTreeSurveyDetailsBean {
	
	//private static final long serialVersionUID = 1L;
	private int treeSurveyId;
	private TmCmApartment tmCmApartment;
	private TmCmLocality tmCmLocality;
	private TmCmLocation tmCmLocation;
	private TmCmRoad tmCmRoad;
	private TtServiceRequest ttServiceRequest;
	private TmTreeAuthorityMaster tmTreeAuthorityMaster;
	private TmTreeNameMaster tmTreeNameMaster;
	private int ulbId;
	private Character flagNewExisting;
	private Date surveyDate;
	private Integer treemasIdTsm;
	private Integer treemasIdLsm;
	private Integer treemasIdBsm;
	private Integer treemasIdTms;
	private Integer treemasIdLcm;
	private Integer treemasIdCom;
	private Integer treemasIdFnm;
	private Integer treemasIdFrm;
	private Integer treemasIdOdm;
	private Integer treemasIdSma;
	private Integer treemasIdTst;
	private Integer sizeValue;
	private Integer girthAtBreastHieght;
	private Double hieght;
	private Integer approxAge;
	private Double canopyWidth;
	private String msebCtcNo;
	private String location;
	private String apartmentComplex;
	private String road;
	private String building;
	private String locality;
	private String longitude;
	private String latitude;
	private String observationRemarks;
	private String ownerAadharCard;
	private String ownerName;
	private String ownerAddress;
	private Character approveFlag;
	private String approveRemark;
	private Integer status;
	private int createdBy;
	private Date createdDate;
	private Integer updatedBy;
	private Date updatedDate;
	private String macId;
	private String ipAddress;
	private Character deviceFrom;
	private Date approvalDate;
	private String surveyNumber;
	private String treeIdentificationNo;
	private Character portDataFlag;
	private Set<TtTreeSurveyUploadList> ttTreeSurveyUploadLists = new HashSet<TtTreeSurveyUploadList>(0);
	private Integer inspectedByUserId;
	private Date inspectedOnDate;
	private Integer lookupDetHierIdAwz1;
	private Integer lookupDetHierIdAwz2;
	private FilesBean files;
	private MultipartFile file;
	private Integer lookupDetIdOlt; 
	private Integer lookupDetIdRsu;
	private String seqNO;
	
	public int getTreeSurveyId() {
		return treeSurveyId;
	}
	public void setTreeSurveyId(int treeSurveyId) {
		this.treeSurveyId = treeSurveyId;
	}
	public TmCmApartment getTmCmApartment() {
		return tmCmApartment;
	}
	public void setTmCmApartment(TmCmApartment tmCmApartment) {
		this.tmCmApartment = tmCmApartment;
	}
	public TmCmLocality getTmCmLocality() {
		return tmCmLocality;
	}
	public void setTmCmLocality(TmCmLocality tmCmLocality) {
		this.tmCmLocality = tmCmLocality;
	}
	public TmCmLocation getTmCmLocation() {
		return tmCmLocation;
	}
	public void setTmCmLocation(TmCmLocation tmCmLocation) {
		this.tmCmLocation = tmCmLocation;
	}
	public TmCmRoad getTmCmRoad() {
		return tmCmRoad;
	}
	public void setTmCmRoad(TmCmRoad tmCmRoad) {
		this.tmCmRoad = tmCmRoad;
	}
	public TtServiceRequest getTtServiceRequest() {
		return ttServiceRequest;
	}
	public void setTtServiceRequest(TtServiceRequest ttServiceRequest) {
		this.ttServiceRequest = ttServiceRequest;
	}
	public TmTreeAuthorityMaster getTmTreeAuthorityMaster() {
		return tmTreeAuthorityMaster;
	}
	public void setTmTreeAuthorityMaster(TmTreeAuthorityMaster tmTreeAuthorityMaster) {
		this.tmTreeAuthorityMaster = tmTreeAuthorityMaster;
	}
	public TmTreeNameMaster getTmTreeNameMaster() {
		return tmTreeNameMaster;
	}
	public void setTmTreeNameMaster(TmTreeNameMaster tmTreeNameMaster) {
		this.tmTreeNameMaster = tmTreeNameMaster;
	}
	public int getUlbId() {
		return ulbId;
	}
	public void setUlbId(int ulbId) {
		this.ulbId = ulbId;
	}
	public Character getFlagNewExisting() {
		return flagNewExisting;
	}
	public void setFlagNewExisting(Character flagNewExisting) {
		this.flagNewExisting = flagNewExisting;
	}
	public Date getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}
	public Integer getTreemasIdTsm() {
		return treemasIdTsm;
	}
	public void setTreemasIdTsm(Integer treemasIdTsm) {
		this.treemasIdTsm = treemasIdTsm;
	}
	public Integer getTreemasIdLsm() {
		return treemasIdLsm;
	}
	public void setTreemasIdLsm(Integer treemasIdLsm) {
		this.treemasIdLsm = treemasIdLsm;
	}
	public Integer getTreemasIdBsm() {
		return treemasIdBsm;
	}
	public void setTreemasIdBsm(Integer treemasIdBsm) {
		this.treemasIdBsm = treemasIdBsm;
	}
	public Integer getTreemasIdTms() {
		return treemasIdTms;
	}
	public void setTreemasIdTms(Integer treemasIdTms) {
		this.treemasIdTms = treemasIdTms;
	}
	public Integer getTreemasIdLcm() {
		return treemasIdLcm;
	}
	public void setTreemasIdLcm(Integer treemasIdLcm) {
		this.treemasIdLcm = treemasIdLcm;
	}
	public Integer getTreemasIdCom() {
		return treemasIdCom;
	}
	public void setTreemasIdCom(Integer treemasIdCom) {
		this.treemasIdCom = treemasIdCom;
	}
	public Integer getTreemasIdFnm() {
		return treemasIdFnm;
	}
	public void setTreemasIdFnm(Integer treemasIdFnm) {
		this.treemasIdFnm = treemasIdFnm;
	}
	public Integer getTreemasIdFrm() {
		return treemasIdFrm;
	}
	public void setTreemasIdFrm(Integer treemasIdFrm) {
		this.treemasIdFrm = treemasIdFrm;
	}
	public Integer getTreemasIdOdm() {
		return treemasIdOdm;
	}
	public void setTreemasIdOdm(Integer treemasIdOdm) {
		this.treemasIdOdm = treemasIdOdm;
	}
	public Integer getTreemasIdSma() {
		return treemasIdSma;
	}
	public void setTreemasIdSma(Integer treemasIdSma) {
		this.treemasIdSma = treemasIdSma;
	}
	public Integer getTreemasIdTst() {
		return treemasIdTst;
	}
	public void setTreemasIdTst(Integer treemasIdTst) {
		this.treemasIdTst = treemasIdTst;
	}
	public Integer getSizeValue() {
		return sizeValue;
	}
	public void setSizeValue(Integer sizeValue) {
		this.sizeValue = sizeValue;
	}
	public Integer getGirthAtBreastHieght() {
		return girthAtBreastHieght;
	}
	public void setGirthAtBreastHieght(Integer girthAtBreastHieght) {
		this.girthAtBreastHieght = girthAtBreastHieght;
	}
	public Double getHieght() {
		return hieght;
	}
	public void setHieght(Double hieght) {
		this.hieght = hieght;
	}
	public Integer getApproxAge() {
		return approxAge;
	}
	public void setApproxAge(Integer approxAge) {
		this.approxAge = approxAge;
	}
	public Double getCanopyWidth() {
		return canopyWidth;
	}
	public void setCanopyWidth(Double canopyWidth) {
		this.canopyWidth = canopyWidth;
	}
	public String getMsebCtcNo() {
		return msebCtcNo;
	}
	public void setMsebCtcNo(String msebCtcNo) {
		this.msebCtcNo = msebCtcNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getApartmentComplex() {
		return apartmentComplex;
	}
	public void setApartmentComplex(String apartmentComplex) {
		this.apartmentComplex = apartmentComplex;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getObservationRemarks() {
		return observationRemarks;
	}
	public void setObservationRemarks(String observationRemarks) {
		this.observationRemarks = observationRemarks;
	}
	public String getOwnerAadharCard() {
		return ownerAadharCard;
	}
	public void setOwnerAadharCard(String ownerAadharCard) {
		this.ownerAadharCard = ownerAadharCard;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public Character getApproveFlag() {
		return approveFlag;
	}
	public void setApproveFlag(Character approveFlag) {
		this.approveFlag = approveFlag;
	}
	public String getApproveRemark() {
		return approveRemark;
	}
	public void setApproveRemark(String approveRemark) {
		this.approveRemark = approveRemark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getMacId() {
		return macId;
	}
	public void setMacId(String macId) {
		this.macId = macId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Character getDeviceFrom() {
		return deviceFrom;
	}
	public void setDeviceFrom(Character deviceFrom) {
		this.deviceFrom = deviceFrom;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getSurveyNumber() {
		return surveyNumber;
	}
	public void setSurveyNumber(String surveyNumber) {
		this.surveyNumber = surveyNumber;
	}
	public String getTreeIdentificationNo() {
		return treeIdentificationNo;
	}
	public void setTreeIdentificationNo(String treeIdentificationNo) {
		this.treeIdentificationNo = treeIdentificationNo;
	}
	public Character getPortDataFlag() {
		return portDataFlag;
	}
	public void setPortDataFlag(Character portDataFlag) {
		this.portDataFlag = portDataFlag;
	}
	public Set<TtTreeSurveyUploadList> getTtTreeSurveyUploadLists() {
		return ttTreeSurveyUploadLists;
	}
	public void setTtTreeSurveyUploadLists(Set<TtTreeSurveyUploadList> ttTreeSurveyUploadLists) {
		this.ttTreeSurveyUploadLists = ttTreeSurveyUploadLists;
	}
	public Integer getInspectedByUserId() {
		return inspectedByUserId;
	}
	public void setInspectedByUserId(Integer inspectedByUserId) {
		this.inspectedByUserId = inspectedByUserId;
	}
	public Date getInspectedOnDate() {
		return inspectedOnDate;
	}
	public void setInspectedOnDate(Date inspectedOnDate) {
		this.inspectedOnDate = inspectedOnDate;
	}
	public Integer getLookupDetHierIdAwz1() {
		return lookupDetHierIdAwz1;
	}
	public void setLookupDetHierIdAwz1(Integer lookupDetHierIdAwz1) {
		this.lookupDetHierIdAwz1 = lookupDetHierIdAwz1;
	}
	public Integer getLookupDetHierIdAwz2() {
		return lookupDetHierIdAwz2;
	}
	public void setLookupDetHierIdAwz2(Integer lookupDetHierIdAwz2) {
		this.lookupDetHierIdAwz2 = lookupDetHierIdAwz2;
	}

	public FilesBean getFiles() {
		return files;
	}
	public void setFiles(FilesBean files) {
		this.files = files;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public Integer getLookupDetIdOlt() {
		return lookupDetIdOlt;
	}
	public void setLookupDetIdOlt(Integer lookupDetIdOlt) {
		this.lookupDetIdOlt = lookupDetIdOlt;
	}
	public Integer getLookupDetIdRsu() {
		return lookupDetIdRsu;
	}
	public void setLookupDetIdRsu(Integer lookupDetIdRsu) {
		this.lookupDetIdRsu = lookupDetIdRsu;
	}
	public String getSeqNO() {
		return seqNO;
	}
	public void setSeqNO(String seqNO) {
		this.seqNO = seqNO;
	}

	
	

}
