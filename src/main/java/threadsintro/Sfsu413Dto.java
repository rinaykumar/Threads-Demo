package threadsintro;

import java.util.List;

public class Sfsu413Dto {
    public final String school;
    public final String department;
    public final List<String> topics;

    public Sfsu413Dto(String school, String department, List<String> topics) {
        this.school = school;
        this.department = department;
        this.topics = topics;
    }
}
