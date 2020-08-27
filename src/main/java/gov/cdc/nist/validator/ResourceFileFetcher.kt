package gov.cdc.nist.validator

import java.io.InputStream

/**
 *
 *
 * @Created - 8/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
class ResourceFileFetcher: ProfileFetcher {
    override fun getFile(file: String): String {
        TODO("Not yet implemented")
    }

    override fun getFileAsInputStream(file: String): InputStream {
        return getResourceFile(file)
    }

    private fun getResourceFile(fileName: String): InputStream {
        return ResourceFileFetcher::class.java.getResourceAsStream(fileName)
    }
}