package gov.cdc.nist.validator;

import java.lang.System;

/**
 * @Created - 8/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lgov/cdc/nist/validator/ProfileFetcher;", "", "getFile", "", "file", "getFileAsInputStream", "Ljava/io/InputStream;", "lib-nist-validator"})
public abstract interface ProfileFetcher {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFile(@org.jetbrains.annotations.NotNull()
    java.lang.String file) throws gov.cdc.nist.validator.InvalidFileException;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.io.InputStream getFileAsInputStream(@org.jetbrains.annotations.NotNull()
    java.lang.String file) throws gov.cdc.nist.validator.InvalidFileException;
}