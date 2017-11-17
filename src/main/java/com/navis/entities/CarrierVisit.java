package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * Created by bursode on 11/13/2017.
 */
public class CarrierVisit {
    private String cvId;
    private String cvCustomsId;
    private String cvCarrierMode;
    private String cvVisitNbr;
    private String cvVisitPhase;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date cvATA;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date cvATD;
    private String cvSendOnBoardUnitUpdates;
    private String cvSendCraneWorkListUpdates;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date cvCreated;
    private String cvCreator;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date cvChanged;
    private String cvChanger;
    private String cvGkey;

    public String toString() {
        return "CarrierVisitGkey:" + cvGkey;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    public String getCvCustomsId() {
        return cvCustomsId;
    }

    public void setCvCustomsId(String cvCustomsId) {
        this.cvCustomsId = cvCustomsId;
    }

    public String getCvCarrierMode() {
        return cvCarrierMode;
    }

    public void setCvCarrierMode(String cvCarrierMode) {
        this.cvCarrierMode = cvCarrierMode;
    }

    public String getCvVisitNbr() {
        return cvVisitNbr;
    }

    public void setCvVisitNbr(String cvVisitNbr) {
        this.cvVisitNbr = cvVisitNbr;
    }

    public String getCvVisitPhase() {
        return cvVisitPhase;
    }

    public void setCvVisitPhase(String cvVisitPhase) {
        this.cvVisitPhase = cvVisitPhase;
    }

    public Date getCvATA() {
        return cvATA;
    }

    public void setCvATA(Date cvATA) {
        this.cvATA = cvATA;
    }

    public Date getCvATD() {
        return cvATD;
    }

    public void setCvATD(Date cvATD) {
        this.cvATD = cvATD;
    }

    public String getCvSendOnBoardUnitUpdates() {
        return cvSendOnBoardUnitUpdates;
    }

    public void setCvSendOnBoardUnitUpdates(String cvSendOnBoardUnitUpdates) {
        this.cvSendOnBoardUnitUpdates = cvSendOnBoardUnitUpdates;
    }

    public String getCvSendCraneWorkListUpdates() {
        return cvSendCraneWorkListUpdates;
    }

    public void setCvSendCraneWorkListUpdates(String cvSendCraneWorkListUpdates) {
        this.cvSendCraneWorkListUpdates = cvSendCraneWorkListUpdates;
    }

    public Date getCvCreated() {
        return cvCreated;
    }

    public void setCvCreated(Date cvCreated) {
        this.cvCreated = cvCreated;
    }

    public String getCvCreator() {
        return cvCreator;
    }

    public void setCvCreator(String cvCreator) {
        this.cvCreator = cvCreator;
    }

    public Date getCvChanged() {
        return cvChanged;
    }

    public void setCvChanged(Date cvChanged) {
        this.cvChanged = cvChanged;
    }

    public String getCvChanger() {
        return cvChanger;
    }

    public void setCvChanger(String cvChanger) {
        this.cvChanger = cvChanger;
    }

    public String getCvGkey() {
        return cvGkey;
    }

    public void setCvGkey(String cvGkey) {
        this.cvGkey = cvGkey;
    }
}
