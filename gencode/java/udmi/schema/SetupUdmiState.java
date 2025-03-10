
package udmi.schema;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Setup Udmi State
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user"
})
@Generated("jsonschema2pojo")
public class SetupUdmiState {

    @JsonProperty("user")
    public String user;

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SetupUdmiState) == false) {
            return false;
        }
        SetupUdmiState rhs = ((SetupUdmiState) other);
        return ((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user)));
    }

}
