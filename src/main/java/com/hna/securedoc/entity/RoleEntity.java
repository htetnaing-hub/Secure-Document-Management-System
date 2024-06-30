package com.hna.securedoc.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hna.securedoc.enumeration.Authority;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

/**
 * @author Htet Naing Aung
 * @version 1.0
 * @email htetnaing.ucsmdy@gmail.com
 * @since 2024-06-30
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
@JsonInclude(Include.NON_DEFAULT)
public class RoleEntity extends Auditable{
    private String name;
    private Authority authorities;
}
