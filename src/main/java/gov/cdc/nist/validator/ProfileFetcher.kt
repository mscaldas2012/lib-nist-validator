package gov.cdc.nist.validator

import java.io.InputStream

/**
 *
 *
 * @Created - 8/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
interface ProfileFetcher {
    fun getFile(file: String): String
    fun getFileAsInputStream(file: String): InputStream
}