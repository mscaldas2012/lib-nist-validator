package gov.cdc.nist.validator;

import java.lang.System;

/**
 * @Created - 8/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002\u00a8\u0006\n"}, d2 = {"Lgov/cdc/nist/validator/ResourceFileFetcher;", "Lgov/cdc/nist/validator/ProfileFetcher;", "()V", "getFile", "", "file", "getFileAsInputStream", "Ljava/io/InputStream;", "getResourceFile", "fileName", "lib-nist-validator"})
public final class ResourceFileFetcher implements gov.cdc.nist.validator.ProfileFetcher {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String file) throws gov.cdc.nist.validator.InvalidFileException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.InputStream getFileAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String file) throws gov.cdc.nist.validator.InvalidFileException {
        return null;
    }
    
    private final java.io.InputStream getResourceFile(java.lang.String fileName) {
        return null;
    }
    
    public ResourceFileFetcher() {
        super();
    }
}