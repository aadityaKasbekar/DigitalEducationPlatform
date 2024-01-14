package ConfigureABusiness;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
import Business.Business;
import Business.Course.Course;
import Business.Course.CourseDirectory;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Coursera");

// Create Persons
        //Create Faculty
        PersonDirectory persondirectory = business.getPersonDirectory();
        Person person = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person.setName("Kal Bugrara");
        person.setDateOfBirth("09/07/1998");
        person.setGender("Male");
        FacultyProfile facultyProfile = persondirectory.newFaculty(person, "Faculty", "Information Systems");
        facultyProfile.setRating();
        FacultyDirectory facultyDir = business.getFacultydirectory();
        facultyDir.newFacultyProfile(facultyProfile);
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount facultyUserAcc = uadirectory.newUserAccount(facultyProfile, "Kal", "kal");
        
        Person person01 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person01.setName("Manuel Montrond");
        person01.setDateOfBirth("10/01/1982");
        person01.setGender("Male");
        FacultyProfile facultyProfile1 = persondirectory.newFaculty(person01, "Faculty", "Information Systems");
        facultyProfile1.setRating();
        facultyDir.newFacultyProfile(facultyProfile1);
        UserAccount facultyUserAcc01 = uadirectory.newUserAccount(facultyProfile1, "Manuel", "man");
        
        Person person02 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person02.setName("Jessica Fisher");
        person02.setDateOfBirth("01/19/1982");
        person02.setGender("Male");
        FacultyProfile facultyProfile2 = persondirectory.newFaculty(person02, "Faculty", "Information Systems");
        facultyProfile2.setRating();
        facultyDir.newFacultyProfile(facultyProfile2);
        UserAccount facultyUserAcc02 = uadirectory.newUserAccount(facultyProfile2, "Jessica", "jes");

        Person person03 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person03.setName("Daniel Peters");
        person03.setDateOfBirth("01/19/1982");
        person03.setGender("Memale");
        FacultyProfile facultyProfile3 = persondirectory.newFaculty(person03, "Faculty", "Information Systems");
        facultyProfile3.setRating();
        facultyDir.newFacultyProfile(facultyProfile3);
        
        UserAccount facultyUserAcc03 = uadirectory.newUserAccount(facultyProfile3, "Daniel", "dan");
        
        Person person04 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person04.setName("Ketan Kulkarni");
        person04.setDateOfBirth("07/21/1998");
        person04.setGender("Male");
        FacultyProfile facultyProfile4 = persondirectory.newFaculty(person04, "Faculty", "Information Systems");
        facultyProfile4.setRating();
        facultyDir.newFacultyProfile(facultyProfile4);
        UserAccount facultyUserAcc04 = uadirectory.newUserAccount(facultyProfile4, "Ketan", "ket");
        
        Person person05 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person05.setName("Hrishikesh Abdeo");
        person05.setDateOfBirth("09/14/1998");
        person05.setGender("Male");
        FacultyProfile facultyProfile5 = persondirectory.newFaculty(person05, "Faculty", "Information Systems");
        facultyProfile5.setRating();
        facultyDir.newFacultyProfile(facultyProfile5);
        UserAccount facultyUserAcc05 = uadirectory.newUserAccount(facultyProfile5, "Hrishikesh", "hri");
        
        Person person06 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person06.setName("Gauri Pathak");
        person06.setDateOfBirth("10/15/1999");
        person06.setGender("Male");
        FacultyProfile facultyProfile6 = persondirectory.newFaculty(person06, "Faculty", "Information Systems");
        facultyProfile6.setRating();
        facultyDir.newFacultyProfile(facultyProfile6);
        UserAccount facultyUserAcc06 = uadirectory.newUserAccount(facultyProfile6, "Gauri", "gau");
        
        Person person07 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person07.setName("Rahi Thakre");
        person07.setDateOfBirth("07/12/1999");
        person07.setGender("Female");
        FacultyProfile facultyProfile7 = persondirectory.newFaculty(person07, "Faculty", "Information Systems");
        facultyProfile7.setRating();
        facultyDir.newFacultyProfile(facultyProfile7);
        UserAccount facultyUserAcc07 = uadirectory.newUserAccount(facultyProfile7, "Rahi", "rah");
        
        Person person08 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person08.setName("Amit Agrwal");
        person08.setDateOfBirth("08/23/1998");
        person08.setGender("Male");
        FacultyProfile facultyProfile8 = persondirectory.newFaculty(person08, "Faculty", "Information Systems");
        facultyProfile8.setRating();
        facultyDir.newFacultyProfile(facultyProfile8);
        //UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount facultyUserAcc08 = uadirectory.newUserAccount(facultyProfile8, "Amit", "ami");
        
        Person person09 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person09.setName("Aayush Rajankar");
        person09.setDateOfBirth("04/18/1998");
        person09.setGender("Male");
        FacultyProfile facultyProfile9 = persondirectory.newFaculty(person09, "Faculty", "Information Systems");
        facultyProfile9.setRating();
        facultyDir.newFacultyProfile(facultyProfile9);
        UserAccount facultyUserAcc09 = uadirectory.newUserAccount(facultyProfile9, "Aayush", "aay");
        
        Person person010 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person010.setName("Pragati Singh");
        person010.setDateOfBirth("05/25/2021");
        person010.setGender("Female");
        FacultyProfile facultyProfile10 = persondirectory.newFaculty(person010, "Faculty", "Information Systems");
        facultyProfile10.setRating();
        facultyDir.newFacultyProfile(facultyProfile10);
        UserAccount facultyUserAcc010 = uadirectory.newUserAccount(facultyProfile10, "Pragti", "pra");


        // Create Courses
        CourseDirectory coursedirectory = business.getCourseDirectory();
        Course course = new Course();
        course.setCourseID("1001");
        course.setCourseName("DMDD");
        course.setFacultyProfile((FacultyProfile) facultyProfile);
        course.setCourseTopic("Databases");
        course.setLanguage("English");
        course.setTermOfferedIn("Fall 2023");
        course.setRegion("Boston");
        course.setCreditHours("4");
        course.setCourseDescription("This deals with SQL");
        coursedirectory.getCourseCatalog().add(course);

        Course course2 = new Course();
        course2.setCourseID("1002");
        course2.setCourseName("AED");
        course2.setFacultyProfile((FacultyProfile) facultyProfile);
        course2.setCourseTopic("Software Engineering");
        course2.setLanguage("English");
        course2.setTermOfferedIn("Fall 2023");
        course2.setRegion("Boston");
        course2.setCreditHours("4");
        course2.setCourseDescription("Java App Development");
        coursedirectory.getCourseCatalog().add(course2);
////        
//        Course course3 = new Course();
//        course3.setCourseID("1003");
//        course3.setCourseName("AED Lab");
//        course3.setFacultyProfile((FacultyProfile) facultyProfile1);
//        course3.setCourseTopic("Software Engineering");
//        course3.setLanguage("English");
//        course3.setTermOfferedIn("Fall 2023");
//        course3.setRegion("Seatle");
//        course3.setCreditHours("4");
//        course3.setCourseDescription("Java App Development Hands On");
//        coursedirectory.getCourseCatalog().add(course3);
        
//        Course course4 = new Course();
//        course4.setCourseID("1004");
//        course4.setCourseName("NMMT");
//        course4.setFacultyProfile((FacultyProfile) facultyProfile1);
//        course4.setCourseTopic("Software Engineering");
//        course4.setLanguage("English");
//        course4.setTermOfferedIn("Fall 2023");
//        course4.setRegion("Boston");
//        course4.setCreditHours("4");
//        course4.setCourseDescription("Neural Modeling Methods and Tools");
//        coursedirectory.getCourseCatalog().add(course4);
//        
//        Course course5 = new Course();
//        course5.setCourseID("1005");
//        course5.setCourseName("WEBDev");
//        course5.setFacultyProfile((FacultyProfile) facultyProfile2);
//        course5.setCourseTopic("Software Engineering");
//        course5.setLanguage("English");
//        course5.setTermOfferedIn("Fall 2023");
//        course5.setRegion("San Jose");
//        course5.setCreditHours("4");
//        course5.setCourseDescription("Web Design and User Experience Engineering");
//        coursedirectory.getCourseCatalog().add(course5);
//        
//        Course course6 = new Course();
//        course6.setCourseID("1006");
//        course6.setCourseName("PSA");
//        course6.setFacultyProfile((FacultyProfile) facultyProfile2);
//        course6.setCourseTopic("Software Engineering");
//        course6.setLanguage("English");
//        course6.setTermOfferedIn("Fall 2023");
//        course6.setRegion("San Jose");
//        course6.setCreditHours("4");
//        course6.setCourseDescription("Program Structure and Algorithms");
//        coursedirectory.getCourseCatalog().add(course6);
//        
//        Course course7 = new Course();
//        course7.setCourseID("1007");
//        course7.setCourseName("DSEP");
//        course7.setFacultyProfile((FacultyProfile) facultyProfile3);
//        course7.setCourseTopic("Databases");
//        course7.setLanguage("English");
//        course7.setTermOfferedIn("Fall 2023");
//        course7.setRegion("Toronto");
//        course7.setCreditHours("4");
//        course7.setCourseDescription("Data Science Engineering with Python");
//        coursedirectory.getCourseCatalog().add(course7);
//        
//        Course course8 = new Course();
//        course8.setCourseID("1008");
//        course8.setCourseName("IDMP");
//        course8.setFacultyProfile((FacultyProfile) facultyProfile3);
//        course8.setCourseTopic("Databases");
//        course8.setLanguage("English");
//        course8.setTermOfferedIn("Fall 2023");
//        course8.setRegion("Toronto");
//        course8.setCreditHours("4");
//        course8.setCourseDescription("Intelligent Data Modeling and Presentation for Engineers");
//        coursedirectory.getCourseCatalog().add(course8);
//        
//        Course course9 = new Course();
//        course9.setCourseID("1009");
//        course9.setCourseName("BDSIA");
//        course9.setFacultyProfile((FacultyProfile) facultyProfile4);
//        course9.setCourseTopic("Databases");
//        course9.setLanguage("English");
//        course9.setTermOfferedIn("Fall 2023");
//        course9.setRegion("Vancouver");
//        course9.setCreditHours("4");
//        course9.setCourseDescription("Big-Data Systems and Intelligence Analytics");
//        coursedirectory.getCourseCatalog().add(course9);
//        
//        Course course10 = new Course();
//        course10.setCourseID("1010");
//        course10.setCourseName("BDAG");
//        course10.setFacultyProfile((FacultyProfile) facultyProfile4);
//        course10.setCourseTopic("Databases");
//        course10.setLanguage("English");
//        course10.setTermOfferedIn("Fall 2023");
//        course10.setRegion("Vancouver");
//        course10.setCreditHours("4");
//        course10.setCourseDescription("Big Data Architecture and Governance");
//        coursedirectory.getCourseCatalog().add(course10);
//        
//        Course course11 = new Course();
//        course11.setCourseID("1011");
//        course11.setCourseName("ADBMS");
//        course11.setFacultyProfile((FacultyProfile) facultyProfile5);
//        course11.setCourseTopic("Databases");
//        course11.setLanguage("English");
//        course11.setTermOfferedIn("Fall 2023");
//        course11.setRegion("Seattle");
//        course11.setCreditHours("4");
//        course11.setCourseDescription("Advanced Database Management Systems");
//        coursedirectory.getCourseCatalog().add(course11);
//        
//        Course course12 = new Course();
//        course12.setCourseID("1012");
//        course12.setCourseName("DWBI");
//        course12.setFacultyProfile((FacultyProfile) facultyProfile5);
//        course12.setCourseTopic("Databases");
//        course12.setLanguage("English");
//        course12.setTermOfferedIn("Fall 2023");
//        course12.setRegion("Seattle");
//        course12.setCreditHours("4");
//        course12.setCourseDescription("Data Warehousing and Business Intelligence");
//        coursedirectory.getCourseCatalog().add(course12);
//        
//        Course course13 = new Course();
//        course13.setCourseID("1013");
//        course13.setCourseName("ITA");
//        course13.setFacultyProfile((FacultyProfile) facultyProfile6);
//        course13.setCourseTopic("Databases");
//        course13.setLanguage("English");
//        course13.setTermOfferedIn("Fall 2023");
//        course13.setRegion("San Jose");
//        course13.setCreditHours("4");
//        course13.setCourseDescription("Introduction to Information Technology Auditing");
//        coursedirectory.getCourseCatalog().add(course13);
//        
//        Course course14 = new Course();
//        course14.setCourseID("1014");
//        course14.setCourseName("ESD");
//        course14.setFacultyProfile((FacultyProfile) facultyProfile6);
//        course14.setCourseTopic("Software Development");
//        course14.setLanguage("English");
//        course14.setTermOfferedIn("Fall 2023");
//        course14.setRegion("San Jose");
//        course14.setCreditHours("4");
//        course14.setCourseDescription("Enterprise Software Design");
//        coursedirectory.getCourseCatalog().add(course14);
//        
//        Course course15 = new Course();
//        course15.setCourseID("1015");
//        course15.setCourseName("NSCC");
//        course15.setFacultyProfile((FacultyProfile) facultyProfile7);
//        course15.setCourseTopic("Cloud");
//        course15.setLanguage("English");
//        course15.setTermOfferedIn("Fall 2023");
//        course15.setRegion("Toronto");
//        course15.setCreditHours("4");
//        course15.setCourseDescription("Network Structures and Cloud Computing");
//        coursedirectory.getCourseCatalog().add(course15);
//        
//        Course course16 = new Course();
//        course16.setCourseID("1016");
//        course16.setCourseName("ACC");
//        course16.setFacultyProfile((FacultyProfile) facultyProfile7);
//        course16.setCourseTopic("Cloud");
//        course16.setLanguage("English");
//        course16.setTermOfferedIn("Fall 2023");
//        course16.setRegion("Toronto");
//        course16.setCreditHours("4");
//        course16.setCourseDescription("Advanced Cloud Computing");
//        coursedirectory.getCourseCatalog().add(course16);
//        
//        Course course17 = new Course();
//        course17.setCourseID("1017");
//        course17.setCourseName("QCA");
//        course17.setFacultyProfile((FacultyProfile) facultyProfile8);
//        course17.setCourseTopic("Software Development");
//        course17.setLanguage("English");
//        course17.setTermOfferedIn("Fall 2023");
//        course17.setRegion("Vancouver");
//        course17.setCreditHours("4");
//        course17.setCourseDescription("Introduction to Quantum Computing with Applications");
//        coursedirectory.getCourseCatalog().add(course17);
//        
//        Course course18 = new Course();
//        course18.setCourseID("1018");
//        course18.setCourseName("BDSES");
//        course18.setFacultyProfile((FacultyProfile) facultyProfile8);
//        course18.setCourseTopic("Software Development");
//        course18.setLanguage("Vancouver");
//        course18.setTermOfferedIn("Fall 2023");
//        course18.setRegion("Boston");
//        course18.setCreditHours("4");
//        course18.setCourseDescription("Big-Data System Engineering Using Scala");
//        coursedirectory.getCourseCatalog().add(course18);
//        
//        Course course19 = new Course();
//        course19.setCourseID("1019");
//        course19.setCourseName("BAIE");
//        course19.setFacultyProfile((FacultyProfile) facultyProfile9);
//        course19.setCourseTopic("Software Development");
//        course19.setLanguage("English");
//        course19.setTermOfferedIn("Fall 2023");
//        course19.setRegion("Portland");
//        course19.setCreditHours("4");
//        course19.setCourseDescription("Business Analysis and Information Engineering");
//        coursedirectory.getCourseCatalog().add(course19);
//        
//        Course course20 = new Course();
//        course20.setCourseID("1020");
//        course20.setCourseName("SQCM");
//        course20.setFacultyProfile((FacultyProfile) facultyProfile9);
//        course20.setCourseTopic("Software Development");
//        course20.setLanguage("English");
//        course20.setTermOfferedIn("Fall 2023");
//        course20.setRegion("Portland");
//        course20.setCreditHours("4");
//        course20.setCourseDescription("Software Quality Control and Management");
//        coursedirectory.getCourseCatalog().add(course20);
//        
//        //Create Students
//        Person person1 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
//        person1.setName("Sakshi Wadaskar");
//        person1.setDateOfBirth("03/05/1998");
//        person1.setGender("Female");
//        StudentProfile studentProfile1 = persondirectory.newStudent(person1, "Student");
//        StudentDirectory studentDir = business.getStudentdirectory();
//        studentDir.newStudentProfile(studentProfile1);
//        UserAccount studentUserAcc1 = uadirectory.newUserAccount(studentProfile1, "Sakshi", "sak");
// 
//        studentProfile1.getRegisteredCourseList().add(course);
//        studentProfile1.getRegisteredCourseList().add(course2);
//        studentProfile1.getRegisteredCourseList().add(course3);
//        studentProfile1.getRegisteredCourseList().add(course4);
//        studentProfile1.getRegisteredCourseList().add(course5);
//        studentProfile1.getRegisteredCourseList().add(course6);
//        studentProfile1.getRegisteredCourseList().add(course7);
//        studentProfile1.getRegisteredCourseList().add(course8);
//       
//        
//
//        
        Person person2 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person2.setName("Aaditya Kasbekar");
        person2.setDateOfBirth("05/08/1998");
        person2.setGender("Male");
        StudentProfile studentProfile2 = persondirectory.newStudent(person2, "Student");
        StudentDirectory studentDir = business.getStudentdirectory();
        studentDir.newStudentProfile(studentProfile2);
        UserAccount studentUserAcc2 = uadirectory.newUserAccount(studentProfile2, "Aaditya", "aad");
        
        Person person3 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person3.setName("Sudhanva Paturkar");
        person3.setDateOfBirth("06/09/1998");
        person3.setGender("Male");
        StudentProfile studentProfile3 = persondirectory.newStudent(person3, "Student");
        studentDir.newStudentProfile(studentProfile3);
        UserAccount studentUserAcc3 = uadirectory.newUserAccount(studentProfile3, "Sudhanva", "sud");
        
        Person person4 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person4.setName("Kartik Raut");
        person4.setDateOfBirth("07/10/1998");
        person4.setGender("Male");
        StudentProfile studentProfile4 = persondirectory.newStudent(person4, "Student");
        studentDir.newStudentProfile(studentProfile4);
        UserAccount studentUserAcc4 = uadirectory.newUserAccount(studentProfile4, "Kartik", "kar");
        
        Person person5 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person5.setName("Sarthak Anjikar");
        person5.setDateOfBirth("08/11/1998");
        person5.setGender("Male");
        StudentProfile studentProfile5 = persondirectory.newStudent(person5, "Student");
        studentDir.newStudentProfile(studentProfile5);
        UserAccount studentUserAcc5 = uadirectory.newUserAccount(studentProfile5, "Sarthak", "sar");
        
        Person person6 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person6.setName("Sheetal Singh");
        person6.setDateOfBirth("08/12/1998");
        person6.setGender("Female");
        StudentProfile studentProfile6 = persondirectory.newStudent(person6, "Student");
        studentDir.newStudentProfile(studentProfile6);
        UserAccount studentUserAcc6 = uadirectory.newUserAccount(studentProfile6, "Sheetal", "she");
        
        Person person7 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person7.setName("Purwa Anasane");
        person7.setDateOfBirth("08/14/1999");
        person7.setGender("Female");
        StudentProfile studentProfile7 = persondirectory.newStudent(person7, "Student");
        studentDir.newStudentProfile(studentProfile7);
        UserAccount studentUserAcc7 = uadirectory.newUserAccount(studentProfile7, "Purwa", "pur");
        
        Person person8 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person8.setName("Sakshii Pawar");
        person8.setDateOfBirth("01/29/1998");
        person8.setGender("Female");
        StudentProfile studentProfile8 = persondirectory.newStudent(person8, "Student");
        studentDir.newStudentProfile(studentProfile8);
        UserAccount studentUserAcc8 = uadirectory.newUserAccount(studentProfile8, "Sakshiiip", "sakshiiip");
        
        Person person9 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person9.setName("Samiksha Shankarpure");
        person9.setDateOfBirth("01/19/1999");
        person9.setGender("Female");
        StudentProfile studentProfile9 = persondirectory.newStudent(person9, "Student");
        studentDir.newStudentProfile(studentProfile9);
        UserAccount studentUserAcc9 = uadirectory.newUserAccount(studentProfile9, "Samiksha", "sam");
        
        Person person10 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person10.setName("Ameya Bidwai");
        person10.setDateOfBirth("11/15/1998");
        person10.setGender("Male");
        StudentProfile studentProfile10 = persondirectory.newStudent(person10, "Student");
        studentDir.newStudentProfile(studentProfile10);
        UserAccount studentUserAcc10 = uadirectory.newUserAccount(studentProfile10, "Ameya", "ame");
        
        Person person11 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        person11.setName("Saurabh Gade");
        person11.setDateOfBirth("07/09/1998");
        person11.setGender("Male");
        StudentProfile studentProfile11 = persondirectory.newStudent(person11, "Student");
        studentDir.newStudentProfile(studentProfile11);
        UserAccount studentUserAcc11 = uadirectory.newUserAccount(studentProfile11, "Saurabh", "sau");

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        Person adminPerson = new Person("admin");
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(adminPerson);

// Create User accounts that link to specific profiles
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "1234");

        return business;

    }

}
