package gov.cdc.nist.validator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190\u0018R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lgov/cdc/nist/validator/NistReport;", "", "()V", "entries", "Lgov/cdc/nist/validator/Entries;", "getEntries", "()Lgov/cdc/nist/validator/Entries;", "errorCounts", "Lgov/cdc/nist/validator/SummaryCount;", "getErrorCounts", "()Lgov/cdc/nist/validator/SummaryCount;", "setErrorCounts", "(Lgov/cdc/nist/validator/SummaryCount;)V", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "warningcounts", "getWarningcounts", "setWarningcounts", "transferCounts", "map", "Ljava/util/HashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "transferErrorCounts", "", "transferWarningCounts", "lib-nist-validator"})
@com.fasterxml.jackson.annotation.JsonInclude(value = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public final class NistReport {
    @org.jetbrains.annotations.NotNull()
    private final gov.cdc.nist.validator.Entries entries = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error-count")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "error-count")
    private gov.cdc.nist.validator.SummaryCount errorCounts;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "warning-count")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "warning-count")
    private gov.cdc.nist.validator.SummaryCount warningcounts;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    
    @org.jetbrains.annotations.NotNull()
    public final gov.cdc.nist.validator.Entries getEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final gov.cdc.nist.validator.SummaryCount getErrorCounts() {
        return null;
    }
    
    public final void setErrorCounts(@org.jetbrains.annotations.Nullable()
    gov.cdc.nist.validator.SummaryCount p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final gov.cdc.nist.validator.SummaryCount getWarningcounts() {
        return null;
    }
    
    public final void setWarningcounts(@org.jetbrains.annotations.Nullable()
    gov.cdc.nist.validator.SummaryCount p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void transferErrorCounts(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> map) {
    }
    
    public final void transferWarningCounts(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> map) {
    }
    
    private final gov.cdc.nist.validator.SummaryCount transferCounts(java.util.HashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> map) {
        return null;
    }
    
    public NistReport() {
        super();
    }
}