package com.smartsti.rest.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountData {
    @Id
    private Long id;

    private String name;

    private BigDecimal balance;
}