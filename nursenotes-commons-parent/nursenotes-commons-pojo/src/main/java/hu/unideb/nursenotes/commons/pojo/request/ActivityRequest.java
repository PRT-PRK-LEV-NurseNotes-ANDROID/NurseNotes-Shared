package hu.unideb.nursenotes.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

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

    /**
     * Spent time at a client.
     */
    private String timeSpent;

    /**
     * Type of activity.
     */
    private String type;

    /**
     * Time spent on traveling.
     */
    private LocalDate travelTime;

    /**
     * Date of activity.
     */
    private LocalDate date;

}
