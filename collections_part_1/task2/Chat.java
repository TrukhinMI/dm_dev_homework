package chat2;

import java.time.Period;
import java.util.List;

public class Chat {
    private String name;
    private List<User> list;

    public Chat(String name, List<User> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
