/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Database;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.ALL)
@Table(name="Games",uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")
})
public class GameEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",length=5,unique = true,nullable = false)
    private Integer gameId;

    @Column(name="Game_Name",length = 200)
    private String gameName;

    @Column(name="Description",length = 1000)
    private String description;
}
