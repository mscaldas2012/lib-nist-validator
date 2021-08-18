package gov.cdc.nist.validator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lgov/cdc/nist/validator/Entries;", "", "()V", "content", "Ljava/util/ArrayList;", "Lgov/nist/validation/report/Entry;", "getContent", "()Ljava/util/ArrayList;", "setContent", "(Ljava/util/ArrayList;)V", "structure", "getStructure", "setStructure", "valueset", "getValueset", "setValueset", "lib-nist-validator"})
public final class Entries {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<gov.nist.validation.report.Entry> structure;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<gov.nist.validation.report.Entry> content;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "value-set")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "value-set")
    private java.util.ArrayList<gov.nist.validation.report.Entry> valueset;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<gov.nist.validation.report.Entry> getStructure() {
        return null;
    }
    
    public final void setStructure(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<gov.nist.validation.report.Entry> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<gov.nist.validation.report.Entry> getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<gov.nist.validation.report.Entry> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<gov.nist.validation.report.Entry> getValueset() {
        return null;
    }
    
    public final void setValueset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<gov.nist.validation.report.Entry> p0) {
    }
    
    public Entries() {
        super();
    }
}