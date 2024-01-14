/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {


    ArrayList<FacultyProfile> facultyList;

    public FacultyDirectory() {

     facultyList = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(FacultyProfile fp) {
        facultyList.add(fp);
        return fp;
    }

    public FacultyProfile findFaculty(String id) {

        for (FacultyProfile fp : facultyList) {

            if (fp.getPerson().getId().equals(id)) {
                return fp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
