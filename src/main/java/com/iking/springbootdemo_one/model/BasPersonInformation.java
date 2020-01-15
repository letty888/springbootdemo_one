package com.iking.springbootdemo_one.model;

import java.io.Serializable;

/**
 * @Author System
 */
public class BasPersonInformation implements Serializable {
    /**
     * 主键id
     */
    private Integer fid;

    /**
     *  人员表ID
     */
    private Integer fpersonid;

    /**
     *  '身高（公分）'
     */

    private Double fheight;

    /**
     *   体重（公斤）
     */
    private Double fweight;

    /**
     *   肺活量（毫升）
     */
    private Double flungcapacity;

    /**
     *   三围
     */
    private String fmeasurements;

    /**
     *  血压（毫米泵柱）
     */
    private Double fbloodpressure;


    /**
     * 心率（次/分钟）
     */
    private Double fheartrate;

    /**
     * 视力（左）
     */
    private Double fvisionleft;

    /**
     *  视力（右）
     */
    private Double fvisionright;

    /**
     *  服装型号(如：XS,S,M,L,XL)
     */
    private String fclothingmodels;

    /**
     *  其他
     */
    private String fother;

    /**
     *  胸围(厘米)
     */
    private Double fbust;

    /**
     *  腰围（厘米）
     */
    private Double fwaist;

    /**
     *  头围（厘米）
     */
    private Double fhardst;

    /**
     * 上衣型号(如：XS,S,M,L,XL)
     */
    private String fjacket;

    /**
     *  裤子型号(如：XS,S,M,L,XL)
     */
    private String fpants;

    /**
     * 腰带型号（如：S,M,L）
     */
    private String fbelt;

    /**
     *  鞋子型号（厘米:230,235,240,245等）
     */
    private Integer fshoes;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFpersonid() {
        return fpersonid;
    }

    public void setFpersonid(Integer fpersonid) {
        this.fpersonid = fpersonid;
    }

    public Double getFheight() {
        return fheight;
    }

    public void setFheight(Double fheight) {
        this.fheight = fheight;
    }

    public Double getFweight() {
        return fweight;
    }

    public void setFweight(Double fweight) {
        this.fweight = fweight;
    }

    public Double getFlungcapacity() {
        return flungcapacity;
    }

    public void setFlungcapacity(Double flungcapacity) {
        this.flungcapacity = flungcapacity;
    }

    public String getFmeasurements() {
        return fmeasurements;
    }

    public void setFmeasurements(String fmeasurements) {
        this.fmeasurements = fmeasurements;
    }

    public Double getFbloodpressure() {
        return fbloodpressure;
    }

    public void setFbloodpressure(Double fbloodpressure) {
        this.fbloodpressure = fbloodpressure;
    }

    public Double getFheartrate() {
        return fheartrate;
    }

    public void setFheartrate(Double fheartrate) {
        this.fheartrate = fheartrate;
    }

    public Double getFvisionleft() {
        return fvisionleft;
    }

    public void setFvisionleft(Double fvisionleft) {
        this.fvisionleft = fvisionleft;
    }

    public Double getFvisionright() {
        return fvisionright;
    }

    public void setFvisionright(Double fvisionright) {
        this.fvisionright = fvisionright;
    }

    public String getFclothingmodels() {
        return fclothingmodels;
    }

    public void setFclothingmodels(String fclothingmodels) {
        this.fclothingmodels = fclothingmodels;
    }

    public String getFother() {
        return fother;
    }

    public void setFother(String fother) {
        this.fother = fother;
    }

    public Double getFbust() {
        return fbust;
    }

    public void setFbust(Double fbust) {
        this.fbust = fbust;
    }

    public Double getFwaist() {
        return fwaist;
    }

    public void setFwaist(Double fwaist) {
        this.fwaist = fwaist;
    }


    public String getFjacket() {
        return fjacket;
    }

    public void setFjacket(String fjacket) {
        this.fjacket = fjacket;
    }

    public String getFpants() {
        return fpants;
    }

    public void setFpants(String fpants) {
        this.fpants = fpants;
    }

    public String getFbelt() {
        return fbelt;
    }

    public void setFbelt(String fbelt) {
        this.fbelt = fbelt;
    }

    public Integer getFshoes() {
        return fshoes;
    }

    public void setFshoes(Integer fshoes) {
        this.fshoes = fshoes;
    }


    public Double getFhardst() {
        return fhardst;
    }

    public void setFhardst(Double fhardst) {
        this.fhardst = fhardst;
    }
}