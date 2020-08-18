package gov.cdc.nist.validator

import gov.nist.validation.report.Report
import hl7.v2.profile.Profile
import hl7.v2.profile.XMLDeserializer
import hl7.v2.validation.SyncHL7Validator
import hl7.v2.validation.content.DefaultConformanceContext
import hl7.v2.validation.vs.ValueSetLibraryImpl
import java.io.InputStream
import java.util.logging.Logger

/**
 *
 *
 * @Created - 4/26/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
class NISTProfileManager(val profile: String) {
    companion object {
        private val logger =  Logger.getLogger(NISTProfileManager::class.java.name)


        private const val VALID_MESSAGE_STATUS = "VALID_MESSAGE"
        private const val STRUCTURE_ERRORS_STATUS = "STRUCTURE_ERRORS"
        private const val CONTENT_ERRORS_STATUS = "CONTENT_ERRORS"
        private const val ERROR_CLASSIFICATION = "Error"
        private const val WARNING_CLASSIFICATION = "Warning"

        private const val VALUE_SET_ENTRIES = "value-set"
        private const val STRUCTURE_ENTRIES = "structure"
        private const val CONTENT_ENTRIES = "content"
        private const val error_count = "error-count"
        private const val warning_count = "warning-count"
    }

    val validator: SyncHL7Validator
    val profileX: Profile

    init {
        logger.info("AUDIT:: Loading profile $profile")
        val profileXML = getResourceFile("$profile/PROFILE.xml")
        // The get() at the end will throw an exception if something goes wrong
         profileX = XMLDeserializer.deserialize(profileXML).get()
        // get ConformanceContext
        val contextXML1 = getResourceFile("$profile/CONSTRAINTS.xml")
        // The second conformance context XML file
        val confContexts = mutableListOf(contextXML1)
        try {
            val contextXML2 = getResourceFile("$profile/PREDICATES.xml")
            confContexts.add(contextXML2)
            //Add predicates to confContexts...
        } catch (e: Exception) {
            logger.fine("No Predicate Available for group $profile. Ignoring Predicate.")
            //No predicate available... ignore file...
        }

        // The get() at the end will throw an exception if something goes wrong
        val conformanceContext = DefaultConformanceContext.apply(confContexts).get()
        // get ValueSetLibrary
        val vsLibXML = getResourceFile("$profile/VALUESETS.xml")
        val valueSetLibrary = ValueSetLibraryImpl.apply(vsLibXML).get()
        validator = SyncHL7Validator(profileX, valueSetLibrary, conformanceContext)
    }

    fun validate(hl7Message: String) {
//        val msgId = validator.profile.messages.keySet().iterator()
//        //val messageIds = profileX.getMessage(validator.)    //.messages().keySet().iterator()
//        val msId = messageIds.next()
//        val report = validator.check(hl7Message, msId)
    }


    //val filteredResults: Map<String, Any> = filter(report)
    private fun filter(report: Report?): Map<String, Any> {
        TODO("Not yet implemented")
    }

    private fun getResourceFile(fileName: String): InputStream? {
        return ProfileManager::class.java.getResourceAsStream(fileName)
    }
}