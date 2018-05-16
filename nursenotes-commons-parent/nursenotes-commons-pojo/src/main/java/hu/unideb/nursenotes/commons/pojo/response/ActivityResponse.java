package hu.unideb.nursenotes.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * Activity response class.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityResponse {

    /**
     * Activity ID.
     */
    private Long id;

    /**
     * Travel time.
     */
    private Integer travelTime;

    /**
     * Time spent at client.
     */
    private String timeSpent;

    /**
     * Activity type.
     */
    private List<String> type;

    /**
     * Date of activity.
     */
    private LocalDate date;

}
