package site.lawmate.user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import site.lawmate.user.domain.model.Premium;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
@Data
public class LawPaymentDto {
    private Long id;
    private String lawyer;
    private String impUid;

    private String status;
    private Long amount;

    private LocalDateTime startDate;
    private LocalDateTime expireDate;

    private Premium premium;
}
