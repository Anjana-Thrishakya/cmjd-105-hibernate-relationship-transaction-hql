package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "batch")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer batchId;

    @Column(name = "name", length = 50, nullable = false)
    private String batchName;

    @Transient
    @OneToMany(mappedBy = "batchEntity", targetEntity = StudentEntity.class)
    List<StudentEntity> studentEntities;
}
