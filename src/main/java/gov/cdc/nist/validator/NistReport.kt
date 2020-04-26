package gov.cdc.nist.validator

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName
import java.util.*
import java.util.concurrent.atomic.AtomicInteger

//JsonProperty is used for jackson
//SerialiedName is used for Gson.
@JsonInclude(JsonInclude.Include.NON_NULL)
class NistReport {
    val entries: Entries = Entries()
    @JsonProperty("error-count")
    @SerializedName("error-count")
    var errorCounts: SummaryCount? = null
    @JsonProperty  ("warning-count")
    @SerializedName("warning-count")
    var warningcounts: SummaryCount?  = null
    var status:String? = null

    fun transferErrorCounts(map: HashMap<String, AtomicInteger>) {
        this.errorCounts = transferCounts(map)
    }
    fun transferWarningCounts(map: HashMap<String, AtomicInteger>) {
        this.warningcounts = transferCounts(map)
    }

    private fun transferCounts( map: HashMap<String, AtomicInteger> ):SummaryCount {
        val counts = SummaryCount()
        counts.structure = (map["structure"]!! as AtomicInteger).get()
        counts.valueset = (map["value-set"]!!as AtomicInteger).get()
        counts.content = (map["content"]!!as AtomicInteger).get()
        return counts
    }


}

class SummaryCount {
    @JsonProperty  ("value-set")
    @SerializedName("value-set")
    var valueset: Int = 0
    var structure: Int = 0
    var content: Int = 0
}

class Entries {
    var structure = ArrayList<Entry>()
    var content   = ArrayList<Entry>()
    @JsonProperty  ("value-set")
    @SerializedName("value-set")
    var valueset  = ArrayList<Entry>()
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Entry {
     var line = 0
     var column = 0
     var path: String? = null
     var description: String? = null
     var category: String? = null
     var classification: String? = null

}