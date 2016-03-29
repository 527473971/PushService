package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by yujinghui on 3/28/16.
 */
@Entity
public class Resume extends Model {

    @Id
    public Integer id;

    public String name;

    // Query
    public static Finder<Integer, Resume> find =
            new Finder<Integer, Resume>(Integer.class, Resume.class);

    public static List<Resume> findAll() {
        return find.all();
    }

    public static Resume findByName(String name) {
        return find.where().eq("name", name).findUnique();
    }
}
