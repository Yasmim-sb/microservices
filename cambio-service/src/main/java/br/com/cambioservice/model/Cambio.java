package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cambio implements Serializable {
    private Long id;
    private String to;
    private String from;
    private BigDecimal conversionFactor;
    private BigDecimal convertedValue;
    private String environment;

}
