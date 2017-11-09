package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by bursode on 11/8/2017.
 */
public class Ufv {

     private String ufvHorizon;
     private String ufvVisitState;
     private String ufvTransitState;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvCreateTime;
     private String ufvArrivePosition;
     private String ufvLastKnownPosition;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvTimeOfLastMove;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvTimeOfLoading;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvTimeEcIn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvTimeEcOut;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvTimeOut;
     private String ufvDlvTimeAppntmnt;
     private String ufvGapptNbr;
     private String ufvTimeInventory;
     private String ufvTimeComplete;
     private String ufvSequence;
     private String ufvRestowType;
     private String ufvHandlingReason;
     private String ufvYardStowageType;
     private String ufvIsSparcsStopped;
     private String ufvSparcsNote;
     private String ufvHasChanged;
     private String ufvVerifiedForLoad;
     private String ufvVerifiedYardPosition;
     private String ufvAnomalyForExpDkng;
     private String ufvLastFreeDay;
     private String ufvPaidThruDay;
     private String ufvGuaranteeThruDay;
     private String ufvPowerLastFreeDay;
     private String ufvPowerPaidThruDay;
     private String ufvPowerGuaranteeThruDay;
     private String ufvLineLastFreeDay;
     private String ufvLinePaidThruDay;
     private String ufvLineGuaranteeThruDay;
     private String ufvVisibleInSparcs;
     private String ufvFlexString01;
     private String ufvFlexString02;
     private String ufvFlexString03;
     private String ufvFlexString04;
     private String ufvFlexString05;
     private String ufvFlexString06;
     private String ufvFlexString07;
     private String ufvFlexString08;
     private String ufvFlexString09;
     private String ufvFlexString10;
     private String ufvFlexDate01;
     private String ufvFlexDate03;
     private String ufvFlexDate04;
     private String ufvFlexDate05;
     private String ufvFlexDate06;
     private String ufvFlexDate07;
     private String ufvFlexDate08;
     private String ufvIsDirectIbToObMove;
     private String ufvValidateMarryErrors;
     private String ufvStowFactor;
     private String ufvReturnToYard;
     private String ufvMoveCount;
     private String ufvIsRASPriority;
     private String ufvHousekeepingCurrentSlot;
     private String ufvHousekeepingFutureSlot;
     private String ufvHousekeepingCurrentScore;
     private String ufvHousekeepingFutureScore;
     private String ufvHousekeepingTimeStamp;
     private String ufvStackingFactor;
     private String ufvSectionFactor;
     private String ufvSegregationFactor;
     private String ufvCasUnitReference;
     private String ufvCasTransactionReference;
     private String ufvPreferredTransferLocation;
     private String ufvDoorDirection;
     private String ufvOptimalRailTZSlot;
     private String ufvCarrierIncompatibleReason;
     private String ufvRailConeStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
     private Date ufvChanged;
     private String ufvHasActiveAlarm;
     private String ufvGkey;


    public String getUfvHorizon() {
        return ufvHorizon;
    }

    public void setUfvHorizon(String ufvHorizon) {
        this.ufvHorizon = ufvHorizon;
    }

    public String getUfvVisitState() {
        return ufvVisitState;
    }

    public void setUfvVisitState(String ufvVisitState) {
        this.ufvVisitState = ufvVisitState;
    }

    public String getUfvTransitState() {
        return ufvTransitState;
    }

    public void setUfvTransitState(String ufvTransitState) {
        this.ufvTransitState = ufvTransitState;
    }

    public Date getUfvCreateTime() {
        return ufvCreateTime;
    }

    public void setUfvCreateTime(Date ufvCreateTime) {
        this.ufvCreateTime = ufvCreateTime;
    }

    public String getUfvArrivePosition() {
        return ufvArrivePosition;
    }

    public void setUfvArrivePosition(String ufvArrivePosition) {
        this.ufvArrivePosition = ufvArrivePosition;
    }

    public String getUfvLastKnownPosition() {
        return ufvLastKnownPosition;
    }

    public void setUfvLastKnownPosition(String ufvLastKnownPosition) {
        this.ufvLastKnownPosition = ufvLastKnownPosition;
    }

    public Date getUfvTimeOfLastMove() {
        return ufvTimeOfLastMove;
    }

    public void setUfvTimeOfLastMove(Date ufvTimeOfLastMove) {
        this.ufvTimeOfLastMove = ufvTimeOfLastMove;
    }

    public Date getUfvTimeOfLoading() {
        return ufvTimeOfLoading;
    }

    public void setUfvTimeOfLoading(Date ufvTimeOfLoading) {
        this.ufvTimeOfLoading = ufvTimeOfLoading;
    }

    public Date getUfvTimeEcIn() {
        return ufvTimeEcIn;
    }

    public void setUfvTimeEcIn(Date ufvTimeEcIn) {
        this.ufvTimeEcIn = ufvTimeEcIn;
    }

    public Date getUfvTimeEcOut() {
        return ufvTimeEcOut;
    }

    public void setUfvTimeEcOut(Date ufvTimeEcOut) {
        this.ufvTimeEcOut = ufvTimeEcOut;
    }

    public Date getUfvTimeOut() {
        return ufvTimeOut;
    }

    public void setUfvTimeOut(Date ufvTimeOut) {
        this.ufvTimeOut = ufvTimeOut;
    }

    public String getUfvDlvTimeAppntmnt() {
        return ufvDlvTimeAppntmnt;
    }

    public void setUfvDlvTimeAppntmnt(String ufvDlvTimeAppntmnt) {
        this.ufvDlvTimeAppntmnt = ufvDlvTimeAppntmnt;
    }

    public String getUfvGapptNbr() {
        return ufvGapptNbr;
    }

    public void setUfvGapptNbr(String ufvGapptNbr) {
        this.ufvGapptNbr = ufvGapptNbr;
    }

    public String getUfvTimeInventory() {
        return ufvTimeInventory;
    }

    public void setUfvTimeInventory(String ufvTimeInventory) {
        this.ufvTimeInventory = ufvTimeInventory;
    }

    public String getUfvTimeComplete() {
        return ufvTimeComplete;
    }

    public void setUfvTimeComplete(String ufvTimeComplete) {
        this.ufvTimeComplete = ufvTimeComplete;
    }

    public String getUfvSequence() {
        return ufvSequence;
    }

    public void setUfvSequence(String ufvSequence) {
        this.ufvSequence = ufvSequence;
    }

    public String getUfvRestowType() {
        return ufvRestowType;
    }

    public void setUfvRestowType(String ufvRestowType) {
        this.ufvRestowType = ufvRestowType;
    }

    public String getUfvHandlingReason() {
        return ufvHandlingReason;
    }

    public void setUfvHandlingReason(String ufvHandlingReason) {
        this.ufvHandlingReason = ufvHandlingReason;
    }

    public String getUfvYardStowageType() {
        return ufvYardStowageType;
    }

    public void setUfvYardStowageType(String ufvYardStowageType) {
        this.ufvYardStowageType = ufvYardStowageType;
    }

    public String getUfvIsSparcsStopped() {
        return ufvIsSparcsStopped;
    }

    public void setUfvIsSparcsStopped(String ufvIsSparcsStopped) {
        this.ufvIsSparcsStopped = ufvIsSparcsStopped;
    }

    public String getUfvSparcsNote() {
        return ufvSparcsNote;
    }

    public void setUfvSparcsNote(String ufvSparcsNote) {
        this.ufvSparcsNote = ufvSparcsNote;
    }

    public String getUfvHasChanged() {
        return ufvHasChanged;
    }

    public void setUfvHasChanged(String ufvHasChanged) {
        this.ufvHasChanged = ufvHasChanged;
    }

    public String getUfvVerifiedForLoad() {
        return ufvVerifiedForLoad;
    }

    public void setUfvVerifiedForLoad(String ufvVerifiedForLoad) {
        this.ufvVerifiedForLoad = ufvVerifiedForLoad;
    }

    public String getUfvVerifiedYardPosition() {
        return ufvVerifiedYardPosition;
    }

    public void setUfvVerifiedYardPosition(String ufvVerifiedYardPosition) {
        this.ufvVerifiedYardPosition = ufvVerifiedYardPosition;
    }

    public String getUfvAnomalyForExpDkng() {
        return ufvAnomalyForExpDkng;
    }

    public void setUfvAnomalyForExpDkng(String ufvAnomalyForExpDkng) {
        this.ufvAnomalyForExpDkng = ufvAnomalyForExpDkng;
    }

    public String getUfvLastFreeDay() {
        return ufvLastFreeDay;
    }

    public void setUfvLastFreeDay(String ufvLastFreeDay) {
        this.ufvLastFreeDay = ufvLastFreeDay;
    }

    public String getUfvPaidThruDay() {
        return ufvPaidThruDay;
    }

    public void setUfvPaidThruDay(String ufvPaidThruDay) {
        this.ufvPaidThruDay = ufvPaidThruDay;
    }

    public String getUfvGuaranteeThruDay() {
        return ufvGuaranteeThruDay;
    }

    public void setUfvGuaranteeThruDay(String ufvGuaranteeThruDay) {
        this.ufvGuaranteeThruDay = ufvGuaranteeThruDay;
    }

    public String getUfvPowerLastFreeDay() {
        return ufvPowerLastFreeDay;
    }

    public void setUfvPowerLastFreeDay(String ufvPowerLastFreeDay) {
        this.ufvPowerLastFreeDay = ufvPowerLastFreeDay;
    }

    public String getUfvPowerPaidThruDay() {
        return ufvPowerPaidThruDay;
    }

    public void setUfvPowerPaidThruDay(String ufvPowerPaidThruDay) {
        this.ufvPowerPaidThruDay = ufvPowerPaidThruDay;
    }

    public String getUfvPowerGuaranteeThruDay() {
        return ufvPowerGuaranteeThruDay;
    }

    public void setUfvPowerGuaranteeThruDay(String ufvPowerGuaranteeThruDay) {
        this.ufvPowerGuaranteeThruDay = ufvPowerGuaranteeThruDay;
    }

    public String getUfvLineLastFreeDay() {
        return ufvLineLastFreeDay;
    }

    public void setUfvLineLastFreeDay(String ufvLineLastFreeDay) {
        this.ufvLineLastFreeDay = ufvLineLastFreeDay;
    }

    public String getUfvLinePaidThruDay() {
        return ufvLinePaidThruDay;
    }

    public void setUfvLinePaidThruDay(String ufvLinePaidThruDay) {
        this.ufvLinePaidThruDay = ufvLinePaidThruDay;
    }

    public String getUfvLineGuaranteeThruDay() {
        return ufvLineGuaranteeThruDay;
    }

    public void setUfvLineGuaranteeThruDay(String ufvLineGuaranteeThruDay) {
        this.ufvLineGuaranteeThruDay = ufvLineGuaranteeThruDay;
    }

    public String getUfvVisibleInSparcs() {
        return ufvVisibleInSparcs;
    }

    public void setUfvVisibleInSparcs(String ufvVisibleInSparcs) {
        this.ufvVisibleInSparcs = ufvVisibleInSparcs;
    }

    public String getUfvFlexString01() {
        return ufvFlexString01;
    }

    public void setUfvFlexString01(String ufvFlexString01) {
        this.ufvFlexString01 = ufvFlexString01;
    }

    public String getUfvFlexString02() {
        return ufvFlexString02;
    }

    public void setUfvFlexString02(String ufvFlexString02) {
        this.ufvFlexString02 = ufvFlexString02;
    }

    public String getUfvFlexString03() {
        return ufvFlexString03;
    }

    public void setUfvFlexString03(String ufvFlexString03) {
        this.ufvFlexString03 = ufvFlexString03;
    }

    public String getUfvFlexString04() {
        return ufvFlexString04;
    }

    public void setUfvFlexString04(String ufvFlexString04) {
        this.ufvFlexString04 = ufvFlexString04;
    }

    public String getUfvFlexString05() {
        return ufvFlexString05;
    }

    public void setUfvFlexString05(String ufvFlexString05) {
        this.ufvFlexString05 = ufvFlexString05;
    }

    public String getUfvFlexString06() {
        return ufvFlexString06;
    }

    public void setUfvFlexString06(String ufvFlexString06) {
        this.ufvFlexString06 = ufvFlexString06;
    }

    public String getUfvFlexString07() {
        return ufvFlexString07;
    }

    public void setUfvFlexString07(String ufvFlexString07) {
        this.ufvFlexString07 = ufvFlexString07;
    }

    public String getUfvFlexString08() {
        return ufvFlexString08;
    }

    public void setUfvFlexString08(String ufvFlexString08) {
        this.ufvFlexString08 = ufvFlexString08;
    }

    public String getUfvFlexString09() {
        return ufvFlexString09;
    }

    public void setUfvFlexString09(String ufvFlexString09) {
        this.ufvFlexString09 = ufvFlexString09;
    }

    public String getUfvFlexString10() {
        return ufvFlexString10;
    }

    public void setUfvFlexString10(String ufvFlexString10) {
        this.ufvFlexString10 = ufvFlexString10;
    }

    public String getUfvFlexDate01() {
        return ufvFlexDate01;
    }

    public void setUfvFlexDate01(String ufvFlexDate01) {
        this.ufvFlexDate01 = ufvFlexDate01;
    }

    public String getUfvFlexDate03() {
        return ufvFlexDate03;
    }

    public void setUfvFlexDate03(String ufvFlexDate03) {
        this.ufvFlexDate03 = ufvFlexDate03;
    }

    public String getUfvFlexDate04() {
        return ufvFlexDate04;
    }

    public void setUfvFlexDate04(String ufvFlexDate04) {
        this.ufvFlexDate04 = ufvFlexDate04;
    }

    public String getUfvFlexDate05() {
        return ufvFlexDate05;
    }

    public void setUfvFlexDate05(String ufvFlexDate05) {
        this.ufvFlexDate05 = ufvFlexDate05;
    }

    public String getUfvFlexDate06() {
        return ufvFlexDate06;
    }

    public void setUfvFlexDate06(String ufvFlexDate06) {
        this.ufvFlexDate06 = ufvFlexDate06;
    }

    public String getUfvFlexDate07() {
        return ufvFlexDate07;
    }

    public void setUfvFlexDate07(String ufvFlexDate07) {
        this.ufvFlexDate07 = ufvFlexDate07;
    }

    public String getUfvFlexDate08() {
        return ufvFlexDate08;
    }

    public void setUfvFlexDate08(String ufvFlexDate08) {
        this.ufvFlexDate08 = ufvFlexDate08;
    }

    public String getUfvIsDirectIbToObMove() {
        return ufvIsDirectIbToObMove;
    }

    public void setUfvIsDirectIbToObMove(String ufvIsDirectIbToObMove) {
        this.ufvIsDirectIbToObMove = ufvIsDirectIbToObMove;
    }

    public String getUfvValidateMarryErrors() {
        return ufvValidateMarryErrors;
    }

    public void setUfvValidateMarryErrors(String ufvValidateMarryErrors) {
        this.ufvValidateMarryErrors = ufvValidateMarryErrors;
    }

    public String getUfvStowFactor() {
        return ufvStowFactor;
    }

    public void setUfvStowFactor(String ufvStowFactor) {
        this.ufvStowFactor = ufvStowFactor;
    }

    public String getUfvReturnToYard() {
        return ufvReturnToYard;
    }

    public void setUfvReturnToYard(String ufvReturnToYard) {
        this.ufvReturnToYard = ufvReturnToYard;
    }

    public String getUfvMoveCount() {
        return ufvMoveCount;
    }

    public void setUfvMoveCount(String ufvMoveCount) {
        this.ufvMoveCount = ufvMoveCount;
    }

    public String getUfvIsRASPriority() {
        return ufvIsRASPriority;
    }

    public void setUfvIsRASPriority(String ufvIsRASPriority) {
        this.ufvIsRASPriority = ufvIsRASPriority;
    }

    public String getUfvHousekeepingCurrentSlot() {
        return ufvHousekeepingCurrentSlot;
    }

    public void setUfvHousekeepingCurrentSlot(String ufvHousekeepingCurrentSlot) {
        this.ufvHousekeepingCurrentSlot = ufvHousekeepingCurrentSlot;
    }

    public String getUfvHousekeepingFutureSlot() {
        return ufvHousekeepingFutureSlot;
    }

    public void setUfvHousekeepingFutureSlot(String ufvHousekeepingFutureSlot) {
        this.ufvHousekeepingFutureSlot = ufvHousekeepingFutureSlot;
    }

    public String getUfvHousekeepingCurrentScore() {
        return ufvHousekeepingCurrentScore;
    }

    public void setUfvHousekeepingCurrentScore(String ufvHousekeepingCurrentScore) {
        this.ufvHousekeepingCurrentScore = ufvHousekeepingCurrentScore;
    }

    public String getUfvHousekeepingFutureScore() {
        return ufvHousekeepingFutureScore;
    }

    public void setUfvHousekeepingFutureScore(String ufvHousekeepingFutureScore) {
        this.ufvHousekeepingFutureScore = ufvHousekeepingFutureScore;
    }

    public String getUfvHousekeepingTimeStamp() {
        return ufvHousekeepingTimeStamp;
    }

    public void setUfvHousekeepingTimeStamp(String ufvHousekeepingTimeStamp) {
        this.ufvHousekeepingTimeStamp = ufvHousekeepingTimeStamp;
    }

    public String getUfvStackingFactor() {
        return ufvStackingFactor;
    }

    public void setUfvStackingFactor(String ufvStackingFactor) {
        this.ufvStackingFactor = ufvStackingFactor;
    }

    public String getUfvSectionFactor() {
        return ufvSectionFactor;
    }

    public void setUfvSectionFactor(String ufvSectionFactor) {
        this.ufvSectionFactor = ufvSectionFactor;
    }

    public String getUfvSegregationFactor() {
        return ufvSegregationFactor;
    }

    public void setUfvSegregationFactor(String ufvSegregationFactor) {
        this.ufvSegregationFactor = ufvSegregationFactor;
    }

    public String getUfvCasUnitReference() {
        return ufvCasUnitReference;
    }

    public void setUfvCasUnitReference(String ufvCasUnitReference) {
        this.ufvCasUnitReference = ufvCasUnitReference;
    }

    public String getUfvCasTransactionReference() {
        return ufvCasTransactionReference;
    }

    public void setUfvCasTransactionReference(String ufvCasTransactionReference) {
        this.ufvCasTransactionReference = ufvCasTransactionReference;
    }

    public String getUfvPreferredTransferLocation() {
        return ufvPreferredTransferLocation;
    }

    public void setUfvPreferredTransferLocation(String ufvPreferredTransferLocation) {
        this.ufvPreferredTransferLocation = ufvPreferredTransferLocation;
    }

    public String getUfvDoorDirection() {
        return ufvDoorDirection;
    }

    public void setUfvDoorDirection(String ufvDoorDirection) {
        this.ufvDoorDirection = ufvDoorDirection;
    }

    public String getUfvOptimalRailTZSlot() {
        return ufvOptimalRailTZSlot;
    }

    public void setUfvOptimalRailTZSlot(String ufvOptimalRailTZSlot) {
        this.ufvOptimalRailTZSlot = ufvOptimalRailTZSlot;
    }

    public String getUfvCarrierIncompatibleReason() {
        return ufvCarrierIncompatibleReason;
    }

    public void setUfvCarrierIncompatibleReason(String ufvCarrierIncompatibleReason) {
        this.ufvCarrierIncompatibleReason = ufvCarrierIncompatibleReason;
    }

    public String getUfvRailConeStatus() {
        return ufvRailConeStatus;
    }

    public void setUfvRailConeStatus(String ufvRailConeStatus) {
        this.ufvRailConeStatus = ufvRailConeStatus;
    }

    public Date getUfvChanged() {
        return ufvChanged;
    }

    public void setUfvChanged(Date ufvChanged) {
        this.ufvChanged = ufvChanged;
    }

    public String getUfvHasActiveAlarm() {
        return ufvHasActiveAlarm;
    }

    public void setUfvHasActiveAlarm(String ufvHasActiveAlarm) {
        this.ufvHasActiveAlarm = ufvHasActiveAlarm;
    }

    public String getUfvGkey() {
        return ufvGkey;
    }

    public void setUfvGkey(String ufvGkey) {
        this.ufvGkey = ufvGkey;
    }
}
