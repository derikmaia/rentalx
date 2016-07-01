package com.rentalx.account;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Supplier extends Account{

}
