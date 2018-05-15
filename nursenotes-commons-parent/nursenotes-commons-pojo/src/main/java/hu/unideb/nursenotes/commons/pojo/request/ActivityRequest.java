package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Lombok for constructors.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
/**
 * Activity request class.
 */
public class ActivityRequest implements Serializable {

    private Integer travelTime;

    /**
     * Spent time at a Client.
     */
    private String timeSpent;

    /**
     * Type of Activity at a Client.
     */
    private List<String> type;

    /**
     * Date of Activity.
     */
    private LocalDate date;

}
