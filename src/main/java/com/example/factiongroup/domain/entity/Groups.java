package com.example.factiongroup.domain.entity;

import com.example.factiongroup.configs.StringToListConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "groups")
public class Groups implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private Long id;

    private String groupName;

    private int groupLength;

    @OneToMany
    @JoinColumn
    private List<Users> users;
}
