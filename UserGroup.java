package example7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserGroup {

    private String groupName;
    private List<User> groupList = new ArrayList<>();

    UserGroup(String grpN) {
        this.groupName = grpN;
    }

    UserGroup(String grpN, String fileName) throws IOException {

        this.groupName = grpN;

        FileReader fReader = new FileReader(fileName);
        BufferedReader bReader = new BufferedReader(fReader);

        try {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    String[] arg = line.split(" ");

                    groupList.add(new User(arg[0], arg[1], Integer.parseInt(arg[2]), arg[3], arg[4]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fReader.close();
            bReader.close();
        }

    }

    void addUser(User usr) {
        groupList.add(usr);
    }

    void sortFNameLName() {

        FirstNameComparator fComp = new FirstNameComparator();

        Collections.sort(groupList, fComp);

//        for(int i = 0; i < groupList.size(); i++) {
//            if (fComp.compare(groupList.get(i), groupList.get(i+1)) > 0) {
//                Collections.swap(groupList, i, i+1);
//            }
//        }
    }

    void sortLNameFName() {

        LastNameComparator lComp = new LastNameComparator();

        Collections.sort(groupList, lComp);
//
//
//        for(int i = 0; i < groupList.size(); i++) {
//            if (lComp.compare(groupList.get(i), groupList.get(i+1)) > 0) {
//                Collections.swap(groupList, i, i+1);
//            }
//        }
    }

    void sortUserPass() {
        Collections.sort(groupList);
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupList=" + groupList +
                '}';
    }

    public static void main(String[] args) {
        try {

            UserGroup users = new UserGroup("User Group", "test.txt");
            User oUser = new User("CJames", "RSmith", 22 , "JS", "ssaeg");
            users.addUser(oUser);
            System.out.println(users);

            users.sortLNameFName();
            System.out.println(users);

            users.sortFNameLName();
            System.out.println(users);

            users.sortUserPass();
            System.out.println(users);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
