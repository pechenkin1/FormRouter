package local.myworktech.formrouter.entity;

import local.myworktech.formrouter.tables.ShowInTable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class House extends PersistableEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @ShowInTable(displayName = "Город")
    private String city;
    @ShowInTable(displayName = "Улка")
    private String street;
    @ShowInTable(displayName = "Дом")
    private String house;
    private String building;
    @ShowInTable(displayName = "Номер квартиры")
    private String room;
    @ShowInTable(displayName = "Площадь")
    private Integer square;

    @ShowInTable(displayName = "bool")
    private Boolean waterHeater;
    @ShowInTable
    private Integer residentsCount;

}
