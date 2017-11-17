package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by bursode on 11/16/2017.
 */
public class WorkInstruction {
    private String wiPkey;
    private String wiWqPkey;
    private String wiArPkey;
    private String wiArGkey;
    private String wiYardShiftTargetWiPkey;
    private String wiCheIndex;
    private String wiItvId;
    private String wiCheWorkAssignmentPkey;
    private String wiItvWorkAssignmentPkey;
    private String wiIntendedCheIndex;
    private String wiMoveNumber;
    private String wiSequence;
    private String wiCraneLane;
    private String wiSetAside;
    private String wiDoorDirection;
    private String wiDeckingRestrict;
    private String wiTwinWith;
    private String wiTwinIntendedFetch;
    private String wiTwinIntendedCarry;
    private String wiTwinIntendedPut;
    private String wiEcStateFetch;
    private String wiEcStateDispatchRequest;
    private String wiEcStateItvDispatchRequest;
    private String wiEcStateDispatch;
    private String wiEcStateItvDispatch;
    private String wiSuspendState;
    private String wiIsLocked;
    private String wiIsConfirmed;
    private String wiIsDefiniteMove;
    private String wiIsExecutable;
    private String wiIsASCAbortedOnceAlready;
    private String wiIsIncrementCraneLane;
    private String wiIsBeingRehandled;
    private String wiIsBeingDeleted;
    private String wiIsShouldBeSent;
    private String wiIsSequencedByPWP;
    private String wiIsHostRequestPriority;
    private String wiIsSkipHostUpdate;
    private String wiMoveStage;
    private String wiConfirmedMoveStage;
    private String wiEcHold;
    private String wiEqMovesKey;
    private String wiEqUsesKey;
    private String wiMoveKind;
    private String wiCarrierLocType;
    private String wiCarrierLocId;
    private String mvhsFetchCheIndex;
    private String mvhsFetchCheId;
    private String mvhsCarryCheIndex;
    private String mvhsCarryCheId;
    private String mvhsPutCheIndex;
    private String mvhsPutCheId;
    private String mvhsDistToStart;
    private String mvhsDistOfCarry;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date mvhsTimeCarryComplete;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date mvhsTimeDispatch;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date mvhsTimeFetch;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date mvhsTimePut;
    private String mvhsTimeCarryCheFetchReady;
    private String mvhsTimeCarryChePutReady;
    private String mvhsTimeCarryCheDispatch;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date mvhsTimeDischarge;
    private String mvhsRehandleCount;
    private String mvhsPowPkey;
    private String mvhsPoolPkey;
    private String mvhsTwinFetch;
    private String mvhsTwinCarry;
    private String mvhsTwinPut;
    private String mvhsTandemFetch;
    private String mvhsTandemPut;
    private String mvhsTZArrivalTime;
    private String mvhsFetchCheDistance;
    private String mvhsCarryCheDistance;
    private String mvhsPutCheDistance;
    private String mvhsTimeFetchCheDispatch;
    private String mvhsTimePutCheDispatch;
    private String wiEstimatedMoveTime;
    private String wiTimeOrigEstStart;
    private String wiRestowAccount;
    private String wiServiceOrder;
    private String wiRestowReason;
    private String wiRoadTruckCounter;
    private String wiCheDispatchOrder;
    private String wiItvDispatchOrder;
    private String wiPosition;
    private String wiTruckVisitRef;
    private String wiPoolLevel;
    private String wiMsgRef;
    private String wiPlannerCreate;
    private String wiPlannerModify;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date wiTimeCreated;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date wiTimeModified;
    private String wiCreateTool;
    private String wiIsImminentMove;
    private String wiIsAlmostImminent;
    private String wiIsAlmostCurrent;
    private String wiIsBeingCarried;
    private String wiIsCarryByStraddle;
    private String wiIsDispatchHung;
    private String wiIsIgnoreGateHold;
    private String wiTvGkey;

    public String getWiPkey() {
        return wiPkey;
    }

    public void setWiPkey(String wiPkey) {
        this.wiPkey = wiPkey;
    }

    public String getWiWqPkey() {
        return wiWqPkey;
    }

    public void setWiWqPkey(String wiWqPkey) {
        this.wiWqPkey = wiWqPkey;
    }

    public String getWiArPkey() {
        return wiArPkey;
    }

    public void setWiArPkey(String wiArPkey) {
        this.wiArPkey = wiArPkey;
    }

    public String getWiArGkey() {
        return wiArGkey;
    }

    public void setWiArGkey(String wiArGkey) {
        this.wiArGkey = wiArGkey;
    }

    public String getWiYardShiftTargetWiPkey() {
        return wiYardShiftTargetWiPkey;
    }

    public void setWiYardShiftTargetWiPkey(String wiYardShiftTargetWiPkey) {
        this.wiYardShiftTargetWiPkey = wiYardShiftTargetWiPkey;
    }

    public String getWiCheIndex() {
        return wiCheIndex;
    }

    public void setWiCheIndex(String wiCheIndex) {
        this.wiCheIndex = wiCheIndex;
    }

    public String getWiItvId() {
        return wiItvId;
    }

    public void setWiItvId(String wiItvId) {
        this.wiItvId = wiItvId;
    }

    public String getWiCheWorkAssignmentPkey() {
        return wiCheWorkAssignmentPkey;
    }

    public void setWiCheWorkAssignmentPkey(String wiCheWorkAssignmentPkey) {
        this.wiCheWorkAssignmentPkey = wiCheWorkAssignmentPkey;
    }

    public String getWiItvWorkAssignmentPkey() {
        return wiItvWorkAssignmentPkey;
    }

    public void setWiItvWorkAssignmentPkey(String wiItvWorkAssignmentPkey) {
        this.wiItvWorkAssignmentPkey = wiItvWorkAssignmentPkey;
    }

    public String getWiIntendedCheIndex() {
        return wiIntendedCheIndex;
    }

    public void setWiIntendedCheIndex(String wiIntendedCheIndex) {
        this.wiIntendedCheIndex = wiIntendedCheIndex;
    }

    public String getWiMoveNumber() {
        return wiMoveNumber;
    }

    public void setWiMoveNumber(String wiMoveNumber) {
        this.wiMoveNumber = wiMoveNumber;
    }

    public String getWiSequence() {
        return wiSequence;
    }

    public void setWiSequence(String wiSequence) {
        this.wiSequence = wiSequence;
    }

    public String getWiCraneLane() {
        return wiCraneLane;
    }

    public void setWiCraneLane(String wiCraneLane) {
        this.wiCraneLane = wiCraneLane;
    }

    public String getWiSetAside() {
        return wiSetAside;
    }

    public void setWiSetAside(String wiSetAside) {
        this.wiSetAside = wiSetAside;
    }

    public String getWiDoorDirection() {
        return wiDoorDirection;
    }

    public void setWiDoorDirection(String wiDoorDirection) {
        this.wiDoorDirection = wiDoorDirection;
    }

    public String getWiDeckingRestrict() {
        return wiDeckingRestrict;
    }

    public void setWiDeckingRestrict(String wiDeckingRestrict) {
        this.wiDeckingRestrict = wiDeckingRestrict;
    }

    public String getWiTwinWith() {
        return wiTwinWith;
    }

    public void setWiTwinWith(String wiTwinWith) {
        this.wiTwinWith = wiTwinWith;
    }

    public String getWiTwinIntendedFetch() {
        return wiTwinIntendedFetch;
    }

    public void setWiTwinIntendedFetch(String wiTwinIntendedFetch) {
        this.wiTwinIntendedFetch = wiTwinIntendedFetch;
    }

    public String getWiTwinIntendedCarry() {
        return wiTwinIntendedCarry;
    }

    public void setWiTwinIntendedCarry(String wiTwinIntendedCarry) {
        this.wiTwinIntendedCarry = wiTwinIntendedCarry;
    }

    public String getWiTwinIntendedPut() {
        return wiTwinIntendedPut;
    }

    public void setWiTwinIntendedPut(String wiTwinIntendedPut) {
        this.wiTwinIntendedPut = wiTwinIntendedPut;
    }

    public String getWiEcStateFetch() {
        return wiEcStateFetch;
    }

    public void setWiEcStateFetch(String wiEcStateFetch) {
        this.wiEcStateFetch = wiEcStateFetch;
    }

    public String getWiEcStateDispatchRequest() {
        return wiEcStateDispatchRequest;
    }

    public void setWiEcStateDispatchRequest(String wiEcStateDispatchRequest) {
        this.wiEcStateDispatchRequest = wiEcStateDispatchRequest;
    }

    public String getWiEcStateItvDispatchRequest() {
        return wiEcStateItvDispatchRequest;
    }

    public void setWiEcStateItvDispatchRequest(String wiEcStateItvDispatchRequest) {
        this.wiEcStateItvDispatchRequest = wiEcStateItvDispatchRequest;
    }

    public String getWiEcStateDispatch() {
        return wiEcStateDispatch;
    }

    public void setWiEcStateDispatch(String wiEcStateDispatch) {
        this.wiEcStateDispatch = wiEcStateDispatch;
    }

    public String getWiEcStateItvDispatch() {
        return wiEcStateItvDispatch;
    }

    public void setWiEcStateItvDispatch(String wiEcStateItvDispatch) {
        this.wiEcStateItvDispatch = wiEcStateItvDispatch;
    }

    public String getWiSuspendState() {
        return wiSuspendState;
    }

    public void setWiSuspendState(String wiSuspendState) {
        this.wiSuspendState = wiSuspendState;
    }

    public String getWiIsLocked() {
        return wiIsLocked;
    }

    public void setWiIsLocked(String wiIsLocked) {
        this.wiIsLocked = wiIsLocked;
    }

    public String getWiIsConfirmed() {
        return wiIsConfirmed;
    }

    public void setWiIsConfirmed(String wiIsConfirmed) {
        this.wiIsConfirmed = wiIsConfirmed;
    }

    public String getWiIsDefiniteMove() {
        return wiIsDefiniteMove;
    }

    public void setWiIsDefiniteMove(String wiIsDefiniteMove) {
        this.wiIsDefiniteMove = wiIsDefiniteMove;
    }

    public String getWiIsExecutable() {
        return wiIsExecutable;
    }

    public void setWiIsExecutable(String wiIsExecutable) {
        this.wiIsExecutable = wiIsExecutable;
    }

    public String getWiIsASCAbortedOnceAlready() {
        return wiIsASCAbortedOnceAlready;
    }

    public void setWiIsASCAbortedOnceAlready(String wiIsASCAbortedOnceAlready) {
        this.wiIsASCAbortedOnceAlready = wiIsASCAbortedOnceAlready;
    }

    public String getWiIsIncrementCraneLane() {
        return wiIsIncrementCraneLane;
    }

    public void setWiIsIncrementCraneLane(String wiIsIncrementCraneLane) {
        this.wiIsIncrementCraneLane = wiIsIncrementCraneLane;
    }

    public String getWiIsBeingRehandled() {
        return wiIsBeingRehandled;
    }

    public void setWiIsBeingRehandled(String wiIsBeingRehandled) {
        this.wiIsBeingRehandled = wiIsBeingRehandled;
    }

    public String getWiIsBeingDeleted() {
        return wiIsBeingDeleted;
    }

    public void setWiIsBeingDeleted(String wiIsBeingDeleted) {
        this.wiIsBeingDeleted = wiIsBeingDeleted;
    }

    public String getWiIsShouldBeSent() {
        return wiIsShouldBeSent;
    }

    public void setWiIsShouldBeSent(String wiIsShouldBeSent) {
        this.wiIsShouldBeSent = wiIsShouldBeSent;
    }

    public String getWiIsSequencedByPWP() {
        return wiIsSequencedByPWP;
    }

    public void setWiIsSequencedByPWP(String wiIsSequencedByPWP) {
        this.wiIsSequencedByPWP = wiIsSequencedByPWP;
    }

    public String getWiIsHostRequestPriority() {
        return wiIsHostRequestPriority;
    }

    public void setWiIsHostRequestPriority(String wiIsHostRequestPriority) {
        this.wiIsHostRequestPriority = wiIsHostRequestPriority;
    }

    public String getWiIsSkipHostUpdate() {
        return wiIsSkipHostUpdate;
    }

    public void setWiIsSkipHostUpdate(String wiIsSkipHostUpdate) {
        this.wiIsSkipHostUpdate = wiIsSkipHostUpdate;
    }

    public String getWiMoveStage() {
        return wiMoveStage;
    }

    public void setWiMoveStage(String wiMoveStage) {
        this.wiMoveStage = wiMoveStage;
    }

    public String getWiConfirmedMoveStage() {
        return wiConfirmedMoveStage;
    }

    public void setWiConfirmedMoveStage(String wiConfirmedMoveStage) {
        this.wiConfirmedMoveStage = wiConfirmedMoveStage;
    }

    public String getWiEcHold() {
        return wiEcHold;
    }

    public void setWiEcHold(String wiEcHold) {
        this.wiEcHold = wiEcHold;
    }

    public String getWiEqMovesKey() {
        return wiEqMovesKey;
    }

    public void setWiEqMovesKey(String wiEqMovesKey) {
        this.wiEqMovesKey = wiEqMovesKey;
    }

    public String getWiEqUsesKey() {
        return wiEqUsesKey;
    }

    public void setWiEqUsesKey(String wiEqUsesKey) {
        this.wiEqUsesKey = wiEqUsesKey;
    }

    public String getWiMoveKind() {
        return wiMoveKind;
    }

    public void setWiMoveKind(String wiMoveKind) {
        this.wiMoveKind = wiMoveKind;
    }

    public String getWiCarrierLocType() {
        return wiCarrierLocType;
    }

    public void setWiCarrierLocType(String wiCarrierLocType) {
        this.wiCarrierLocType = wiCarrierLocType;
    }

    public String getWiCarrierLocId() {
        return wiCarrierLocId;
    }

    public void setWiCarrierLocId(String wiCarrierLocId) {
        this.wiCarrierLocId = wiCarrierLocId;
    }

    public String getMvhsFetchCheIndex() {
        return mvhsFetchCheIndex;
    }

    public void setMvhsFetchCheIndex(String mvhsFetchCheIndex) {
        this.mvhsFetchCheIndex = mvhsFetchCheIndex;
    }

    public String getMvhsFetchCheId() {
        return mvhsFetchCheId;
    }

    public void setMvhsFetchCheId(String mvhsFetchCheId) {
        this.mvhsFetchCheId = mvhsFetchCheId;
    }

    public String getMvhsCarryCheIndex() {
        return mvhsCarryCheIndex;
    }

    public void setMvhsCarryCheIndex(String mvhsCarryCheIndex) {
        this.mvhsCarryCheIndex = mvhsCarryCheIndex;
    }

    public String getMvhsCarryCheId() {
        return mvhsCarryCheId;
    }

    public void setMvhsCarryCheId(String mvhsCarryCheId) {
        this.mvhsCarryCheId = mvhsCarryCheId;
    }

    public String getMvhsPutCheIndex() {
        return mvhsPutCheIndex;
    }

    public void setMvhsPutCheIndex(String mvhsPutCheIndex) {
        this.mvhsPutCheIndex = mvhsPutCheIndex;
    }

    public String getMvhsPutCheId() {
        return mvhsPutCheId;
    }

    public void setMvhsPutCheId(String mvhsPutCheId) {
        this.mvhsPutCheId = mvhsPutCheId;
    }

    public String getMvhsDistToStart() {
        return mvhsDistToStart;
    }

    public void setMvhsDistToStart(String mvhsDistToStart) {
        this.mvhsDistToStart = mvhsDistToStart;
    }

    public String getMvhsDistOfCarry() {
        return mvhsDistOfCarry;
    }

    public void setMvhsDistOfCarry(String mvhsDistOfCarry) {
        this.mvhsDistOfCarry = mvhsDistOfCarry;
    }

    public Date getMvhsTimeCarryComplete() {
        return mvhsTimeCarryComplete;
    }

    public void setMvhsTimeCarryComplete(Date mvhsTimeCarryComplete) {
        this.mvhsTimeCarryComplete = mvhsTimeCarryComplete;
    }

    public Date getMvhsTimeDispatch() {
        return mvhsTimeDispatch;
    }

    public void setMvhsTimeDispatch(Date mvhsTimeDispatch) {
        this.mvhsTimeDispatch = mvhsTimeDispatch;
    }

    public Date getMvhsTimeFetch() {
        return mvhsTimeFetch;
    }

    public void setMvhsTimeFetch(Date mvhsTimeFetch) {
        this.mvhsTimeFetch = mvhsTimeFetch;
    }

    public Date getMvhsTimePut() {
        return mvhsTimePut;
    }

    public void setMvhsTimePut(Date mvhsTimePut) {
        this.mvhsTimePut = mvhsTimePut;
    }

    public String getMvhsTimeCarryCheFetchReady() {
        return mvhsTimeCarryCheFetchReady;
    }

    public void setMvhsTimeCarryCheFetchReady(String mvhsTimeCarryCheFetchReady) {
        this.mvhsTimeCarryCheFetchReady = mvhsTimeCarryCheFetchReady;
    }

    public String getMvhsTimeCarryChePutReady() {
        return mvhsTimeCarryChePutReady;
    }

    public void setMvhsTimeCarryChePutReady(String mvhsTimeCarryChePutReady) {
        this.mvhsTimeCarryChePutReady = mvhsTimeCarryChePutReady;
    }

    public String getMvhsTimeCarryCheDispatch() {
        return mvhsTimeCarryCheDispatch;
    }

    public void setMvhsTimeCarryCheDispatch(String mvhsTimeCarryCheDispatch) {
        this.mvhsTimeCarryCheDispatch = mvhsTimeCarryCheDispatch;
    }

    public Date getMvhsTimeDischarge() {
        return mvhsTimeDischarge;
    }

    public void setMvhsTimeDischarge(Date mvhsTimeDischarge) {
        this.mvhsTimeDischarge = mvhsTimeDischarge;
    }

    public String getMvhsRehandleCount() {
        return mvhsRehandleCount;
    }

    public void setMvhsRehandleCount(String mvhsRehandleCount) {
        this.mvhsRehandleCount = mvhsRehandleCount;
    }

    public String getMvhsPowPkey() {
        return mvhsPowPkey;
    }

    public void setMvhsPowPkey(String mvhsPowPkey) {
        this.mvhsPowPkey = mvhsPowPkey;
    }

    public String getMvhsPoolPkey() {
        return mvhsPoolPkey;
    }

    public void setMvhsPoolPkey(String mvhsPoolPkey) {
        this.mvhsPoolPkey = mvhsPoolPkey;
    }

    public String getMvhsTwinFetch() {
        return mvhsTwinFetch;
    }

    public void setMvhsTwinFetch(String mvhsTwinFetch) {
        this.mvhsTwinFetch = mvhsTwinFetch;
    }

    public String getMvhsTwinCarry() {
        return mvhsTwinCarry;
    }

    public void setMvhsTwinCarry(String mvhsTwinCarry) {
        this.mvhsTwinCarry = mvhsTwinCarry;
    }

    public String getMvhsTwinPut() {
        return mvhsTwinPut;
    }

    public void setMvhsTwinPut(String mvhsTwinPut) {
        this.mvhsTwinPut = mvhsTwinPut;
    }

    public String getMvhsTandemFetch() {
        return mvhsTandemFetch;
    }

    public void setMvhsTandemFetch(String mvhsTandemFetch) {
        this.mvhsTandemFetch = mvhsTandemFetch;
    }

    public String getMvhsTandemPut() {
        return mvhsTandemPut;
    }

    public void setMvhsTandemPut(String mvhsTandemPut) {
        this.mvhsTandemPut = mvhsTandemPut;
    }

    public String getMvhsTZArrivalTime() {
        return mvhsTZArrivalTime;
    }

    public void setMvhsTZArrivalTime(String mvhsTZArrivalTime) {
        this.mvhsTZArrivalTime = mvhsTZArrivalTime;
    }

    public String getMvhsFetchCheDistance() {
        return mvhsFetchCheDistance;
    }

    public void setMvhsFetchCheDistance(String mvhsFetchCheDistance) {
        this.mvhsFetchCheDistance = mvhsFetchCheDistance;
    }

    public String getMvhsCarryCheDistance() {
        return mvhsCarryCheDistance;
    }

    public void setMvhsCarryCheDistance(String mvhsCarryCheDistance) {
        this.mvhsCarryCheDistance = mvhsCarryCheDistance;
    }

    public String getMvhsPutCheDistance() {
        return mvhsPutCheDistance;
    }

    public void setMvhsPutCheDistance(String mvhsPutCheDistance) {
        this.mvhsPutCheDistance = mvhsPutCheDistance;
    }

    public String getMvhsTimeFetchCheDispatch() {
        return mvhsTimeFetchCheDispatch;
    }

    public void setMvhsTimeFetchCheDispatch(String mvhsTimeFetchCheDispatch) {
        this.mvhsTimeFetchCheDispatch = mvhsTimeFetchCheDispatch;
    }

    public String getMvhsTimePutCheDispatch() {
        return mvhsTimePutCheDispatch;
    }

    public void setMvhsTimePutCheDispatch(String mvhsTimePutCheDispatch) {
        this.mvhsTimePutCheDispatch = mvhsTimePutCheDispatch;
    }

    public String getWiEstimatedMoveTime() {
        return wiEstimatedMoveTime;
    }

    public void setWiEstimatedMoveTime(String wiEstimatedMoveTime) {
        this.wiEstimatedMoveTime = wiEstimatedMoveTime;
    }

    public String getWiTimeOrigEstStart() {
        return wiTimeOrigEstStart;
    }

    public void setWiTimeOrigEstStart(String wiTimeOrigEstStart) {
        this.wiTimeOrigEstStart = wiTimeOrigEstStart;
    }

    public String getWiRestowAccount() {
        return wiRestowAccount;
    }

    public void setWiRestowAccount(String wiRestowAccount) {
        this.wiRestowAccount = wiRestowAccount;
    }

    public String getWiServiceOrder() {
        return wiServiceOrder;
    }

    public void setWiServiceOrder(String wiServiceOrder) {
        this.wiServiceOrder = wiServiceOrder;
    }

    public String getWiRestowReason() {
        return wiRestowReason;
    }

    public void setWiRestowReason(String wiRestowReason) {
        this.wiRestowReason = wiRestowReason;
    }

    public String getWiRoadTruckCounter() {
        return wiRoadTruckCounter;
    }

    public void setWiRoadTruckCounter(String wiRoadTruckCounter) {
        this.wiRoadTruckCounter = wiRoadTruckCounter;
    }

    public String getWiCheDispatchOrder() {
        return wiCheDispatchOrder;
    }

    public void setWiCheDispatchOrder(String wiCheDispatchOrder) {
        this.wiCheDispatchOrder = wiCheDispatchOrder;
    }

    public String getWiItvDispatchOrder() {
        return wiItvDispatchOrder;
    }

    public void setWiItvDispatchOrder(String wiItvDispatchOrder) {
        this.wiItvDispatchOrder = wiItvDispatchOrder;
    }

    public String getWiPosition() {
        return wiPosition;
    }

    public void setWiPosition(String wiPosition) {
        this.wiPosition = wiPosition;
    }

    public String getWiTruckVisitRef() {
        return wiTruckVisitRef;
    }

    public void setWiTruckVisitRef(String wiTruckVisitRef) {
        this.wiTruckVisitRef = wiTruckVisitRef;
    }

    public String getWiPoolLevel() {
        return wiPoolLevel;
    }

    public void setWiPoolLevel(String wiPoolLevel) {
        this.wiPoolLevel = wiPoolLevel;
    }

    public String getWiMsgRef() {
        return wiMsgRef;
    }

    public void setWiMsgRef(String wiMsgRef) {
        this.wiMsgRef = wiMsgRef;
    }

    public String getWiPlannerCreate() {
        return wiPlannerCreate;
    }

    public void setWiPlannerCreate(String wiPlannerCreate) {
        this.wiPlannerCreate = wiPlannerCreate;
    }

    public String getWiPlannerModify() {
        return wiPlannerModify;
    }

    public void setWiPlannerModify(String wiPlannerModify) {
        this.wiPlannerModify = wiPlannerModify;
    }

    public Date getWiTimeCreated() {
        return wiTimeCreated;
    }

    public void setWiTimeCreated(Date wiTimeCreated) {
        this.wiTimeCreated = wiTimeCreated;
    }

    public Date getWiTimeModified() {
        return wiTimeModified;
    }

    public void setWiTimeModified(Date wiTimeModified) {
        this.wiTimeModified = wiTimeModified;
    }

    public String getWiCreateTool() {
        return wiCreateTool;
    }

    public void setWiCreateTool(String wiCreateTool) {
        this.wiCreateTool = wiCreateTool;
    }

    public String getWiIsImminentMove() {
        return wiIsImminentMove;
    }

    public void setWiIsImminentMove(String wiIsImminentMove) {
        this.wiIsImminentMove = wiIsImminentMove;
    }

    public String getWiIsAlmostImminent() {
        return wiIsAlmostImminent;
    }

    public void setWiIsAlmostImminent(String wiIsAlmostImminent) {
        this.wiIsAlmostImminent = wiIsAlmostImminent;
    }

    public String getWiIsAlmostCurrent() {
        return wiIsAlmostCurrent;
    }

    public void setWiIsAlmostCurrent(String wiIsAlmostCurrent) {
        this.wiIsAlmostCurrent = wiIsAlmostCurrent;
    }

    public String getWiIsBeingCarried() {
        return wiIsBeingCarried;
    }

    public void setWiIsBeingCarried(String wiIsBeingCarried) {
        this.wiIsBeingCarried = wiIsBeingCarried;
    }

    public String getWiIsCarryByStraddle() {
        return wiIsCarryByStraddle;
    }

    public void setWiIsCarryByStraddle(String wiIsCarryByStraddle) {
        this.wiIsCarryByStraddle = wiIsCarryByStraddle;
    }

    public String getWiIsDispatchHung() {
        return wiIsDispatchHung;
    }

    public void setWiIsDispatchHung(String wiIsDispatchHung) {
        this.wiIsDispatchHung = wiIsDispatchHung;
    }

    public String getWiIsIgnoreGateHold() {
        return wiIsIgnoreGateHold;
    }

    public void setWiIsIgnoreGateHold(String wiIsIgnoreGateHold) {
        this.wiIsIgnoreGateHold = wiIsIgnoreGateHold;
    }

    public String getWiTvGkey() {
        return wiTvGkey;
    }

    public void setWiTvGkey(String wiTvGkey) {
        this.wiTvGkey = wiTvGkey;
    }

    public String getWiTranGkey() {
        return wiTranGkey;
    }

    public void setWiTranGkey(String wiTranGkey) {
        this.wiTranGkey = wiTranGkey;
    }

    public String getWiOriginalFromQual() {
        return wiOriginalFromQual;
    }

    public void setWiOriginalFromQual(String wiOriginalFromQual) {
        this.wiOriginalFromQual = wiOriginalFromQual;
    }

    public String getWiAssignedChassId() {
        return wiAssignedChassId;
    }

    public void setWiAssignedChassId(String wiAssignedChassId) {
        this.wiAssignedChassId = wiAssignedChassId;
    }

    public String getWiIsSwappableDelivery() {
        return wiIsSwappableDelivery;
    }

    public void setWiIsSwappableDelivery(String wiIsSwappableDelivery) {
        this.wiIsSwappableDelivery = wiIsSwappableDelivery;
    }

    public String getWiIsN4SpecifiedQueue() {
        return wiIsN4SpecifiedQueue;
    }

    public void setWiIsN4SpecifiedQueue(String wiIsN4SpecifiedQueue) {
        this.wiIsN4SpecifiedQueue = wiIsN4SpecifiedQueue;
    }

    public String getWiGateTranSeq() {
        return wiGateTranSeq;
    }

    public void setWiGateTranSeq(String wiGateTranSeq) {
        this.wiGateTranSeq = wiGateTranSeq;
    }

    public String getWiCraneLaneTier() {
        return wiCraneLaneTier;
    }

    public void setWiCraneLaneTier(String wiCraneLaneTier) {
        this.wiCraneLaneTier = wiCraneLaneTier;
    }

    public String getWiYardMoveFilter() {
        return wiYardMoveFilter;
    }

    public void setWiYardMoveFilter(String wiYardMoveFilter) {
        this.wiYardMoveFilter = wiYardMoveFilter;
    }

    public String getWiActualSequence() {
        return wiActualSequence;
    }

    public void setWiActualSequence(String wiActualSequence) {
        this.wiActualSequence = wiActualSequence;
    }

    public String getWiActualVesselTwinWiPkey() {
        return wiActualVesselTwinWiPkey;
    }

    public void setWiActualVesselTwinWiPkey(String wiActualVesselTwinWiPkey) {
        this.wiActualVesselTwinWiPkey = wiActualVesselTwinWiPkey;
    }

    public String getWiIsStrictLoad() {
        return wiIsStrictLoad;
    }

    public void setWiIsStrictLoad(String wiIsStrictLoad) {
        this.wiIsStrictLoad = wiIsStrictLoad;
    }

    public String getWiPreferredTransferLocation() {
        return wiPreferredTransferLocation;
    }

    public void setWiPreferredTransferLocation(String wiPreferredTransferLocation) {
        this.wiPreferredTransferLocation = wiPreferredTransferLocation;
    }

    public String getWiIsTandemWithNext() {
        return wiIsTandemWithNext;
    }

    public void setWiIsTandemWithNext(String wiIsTandemWithNext) {
        this.wiIsTandemWithNext = wiIsTandemWithNext;
    }

    public String getWiIsTandemWithPrevious() {
        return wiIsTandemWithPrevious;
    }

    public void setWiIsTandemWithPrevious(String wiIsTandemWithPrevious) {
        this.wiIsTandemWithPrevious = wiIsTandemWithPrevious;
    }

    public String getWiXpsObjectVersion() {
        return wiXpsObjectVersion;
    }

    public void setWiXpsObjectVersion(String wiXpsObjectVersion) {
        this.wiXpsObjectVersion = wiXpsObjectVersion;
    }

    public String getWiEmtTimeHorizonMin() {
        return wiEmtTimeHorizonMin;
    }

    public void setWiEmtTimeHorizonMin(String wiEmtTimeHorizonMin) {
        this.wiEmtTimeHorizonMin = wiEmtTimeHorizonMin;
    }

    public String getWiHasActiveAlarm() {
        return wiHasActiveAlarm;
    }

    public void setWiHasActiveAlarm(String wiHasActiveAlarm) {
        this.wiHasActiveAlarm = wiHasActiveAlarm;
    }

    public String getWiPairWith() {
        return wiPairWith;
    }

    public void setWiPairWith(String wiPairWith) {
        this.wiPairWith = wiPairWith;
    }

    public String getWiIsBimSwappable() {
        return wiIsBimSwappable;
    }

    public void setWiIsBimSwappable(String wiIsBimSwappable) {
        this.wiIsBimSwappable = wiIsBimSwappable;
    }

    public String getWiIsN4ToCompleteMove() {
        return wiIsN4ToCompleteMove;
    }

    public void setWiIsN4ToCompleteMove(String wiIsN4ToCompleteMove) {
        this.wiIsN4ToCompleteMove = wiIsN4ToCompleteMove;
    }

    public String getWiGkey() {
        return wiGkey;
    }

    public void setWiGkey(String wiGkey) {
        this.wiGkey = wiGkey;
    }

    private String wiTranGkey;
    private String wiOriginalFromQual;
    private String wiAssignedChassId;
    private String wiIsSwappableDelivery;
    private String wiIsN4SpecifiedQueue;
    private String wiGateTranSeq;
    private String wiCraneLaneTier;
    private String wiYardMoveFilter;
    private String wiActualSequence;
    private String wiActualVesselTwinWiPkey;
    private String wiIsStrictLoad;
    private String wiPreferredTransferLocation;
    private String wiIsTandemWithNext;
    private String wiIsTandemWithPrevious;
    private String wiXpsObjectVersion;
    private String wiEmtTimeHorizonMin;
    private String wiHasActiveAlarm;
    private String wiPairWith;
    private String wiIsBimSwappable;
    private String wiIsN4ToCompleteMove;
    private String wiGkey;
}
