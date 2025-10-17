import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class DataCreation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/unidb";
        String user = "root";
        String password = "hello";

        String[] biologyCourses = { "Anatomy and Physiology", "Genetics and Genomics", "Microbiology and Immunology",
                "Ecology and Evolution", "Cell Biology and Development", "Neurobiology and Behavior",
                "Marine Biology and Oceanography", "Conservation Biology and Biodiversity", "Plant Biology and Ecology",
                "Evolutionary Biology and Biogeography", "Virology and Emerging Diseases",
                "Bioinformatics and Computational Biology", "Biotechnology and Genetic Engineering",
                "Comparative Physiology and Adaptation", "Endocrinology and Metabolism",
                "Immunology and Infectious Diseases", "Environmental Science and Sustainability",
                "Pathology and Disease Mechanisms", "Anatomy and Physiology of Organ Systems",
                "Physiology and Pathophysiology of Disease", "Cancer Biology and Therapeutics",
                "Reproductive Biology and Endocrinology", "Toxicology and Pharmacology", "Histology and Cell Biology",
                "Biomechanics and Biomaterials" };
        ArrayList<String> biologyCoursesList = new ArrayList<String>(Arrays.asList(biologyCourses));
        Integer[] biologyCredits = {3, 3, 3, 3, 3, 4, 3, 4, 4, 4, 3, 4, 3, 4, 4, 4, 4, 4, 3, 4, 4, 4, 3, 3, 3};
        ArrayList<Integer> biologyCreditsList = new ArrayList<Integer>(Arrays.asList(biologyCredits));

        String[] chemistryCourses = { "General Chemistry I", "General Chemistry II", "Organic Chemistry I", "Organic Chemistry II",
                "Analytical Chemistry and Quantitative Analysis", "Physical Chemistry and Thermodynamics",
                "Inorganic Chemistry and Materials Science", "Biochemistry and Molecular Biology",
                "Polymer Chemistry and Materials Synthesis", "Medicinal Chemistry and Drug Design",
                "Environmental Chemistry and Toxicology", "Electrochemistry and Nanotechnology",
                "Computational Chemistry and Molecular Modeling", "Spectroscopy and Optical Methods",
                "Green Chemistry and Sustainable Synthesis", "Chemical Kinetics and Reaction Dynamics",
                "Surface Chemistry and Catalysis", "Organometallic Chemistry and Transition Metals",
                "Photochemistry and Photobiology", "Nanomaterials and Nanoparticles",
                "Industrial Chemistry and Chemical Engineering", "Forensic Chemistry and Analysis",
                "Materials Chemistry and Solid-State Synthesis", "Astrochemistry and Atmospheric Chemistry",
                "Nuclear and Radiochemistry", "Chemistry and Biology of Natural Products",
                "Chemical Biology and Synthetic Biology" };
        ArrayList<String> chemistryCoursesList = new ArrayList<String>(Arrays.asList(chemistryCourses));
        Integer[] chemistryCredits = {3, 4, 3, 3, 4, 4, 3, 3, 3, 4, 3, 3, 4, 4, 3, 3, 4, 3, 3, 3, 3, 4, 4, 4, 3, 4, 4};
        ArrayList<Integer> chemistryCreditsList = new ArrayList<Integer>(Arrays.asList(chemistryCredits));

        String[] computerScienceCourses = { "Introduction to Computer Science", "Data Structures and Algorithms",
                "Computer Architecture and Organization", "Operating Systems and Systems Programming",
                "Programming Languages and Compilers", "Computer Networks and Distributed Systems",
                "Database Systems and Data Management", "Artificial Intelligence and Machine Learning",
                "Computer Graphics and Visualization", "Human-Computer Interaction and User Experience",
                "Theory of Computation and Formal Languages", "Software Engineering and Design Patterns",
                "Cybersecurity and Information Assurance", "Cloud Computing and Virtualization",
                "Mobile Application Development and Internet of Things", "Web Development and Full Stack Engineering",
                "High Performance Computing and Parallel Programming", "Computer Vision and Image Processing",
                "Natural Language Processing and Computational Linguistics", "Robotics and Autonomous Systems",
                "Data Science and Big Data Analytics", "Computer Ethics and Social Impacts of Technology",
                "Computer Music and Digital Audio Processing", "Game Development and Interactive Media",
                "Quantum Computing and Quantum Information" };
        ArrayList<String> computerScienceCoursesList = new ArrayList<String>(Arrays.asList(computerScienceCourses));        
        Integer[] computerScienceCredits = {3, 3, 4, 4, 4, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 4};
        ArrayList<Integer> computerScienceCreditsList = new ArrayList<Integer>(Arrays.asList(computerScienceCredits));

        String[] englishCourses = { "Introduction to Literature", "British Literature to 1660",
                "British Literature since 1660", "American Literature to 1865", "American Literature since 1865",
                "World Literature in English", "Shakespeare", "The Bible as Literature", "Creative Writing: Fiction",
                "Creative Writing: Poetry", "Literary Theory and Criticism", "Women's Literature",
                "African-American Literature", "Postcolonial Literature and Theory", "Modernist Literature",
                "Contemporary Literature", "Film Studies and Adaptation", "Popular Culture and Literature",
                "Graphic Novels and Comics", "Children's and Young Adult Literature",
                "Digital Humanities and Literature", "Literature and the Environment", "Literature and Social Justice",
                "Mythology and Folklore", "Literature and Science" };
        ArrayList<String> englishCoursesList = new ArrayList<String>(Arrays.asList(englishCourses));
        Integer[] englishCredits = {3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        ArrayList<Integer> englishCreditsList = new ArrayList<Integer>(Arrays.asList(englishCredits));

        String[] mathCourses = { "Calculus I", "Calculus II", "Multivariable Calculus", "Linear Algebra",
                "Differential Equations", "Probability Theory", "Statistics", "Number Theory", "Combinatorics",
                "Abstract Algebra", "Real Analysis", "Complex Analysis", "Topology", "Discrete Mathematics",
                "Graph Theory", "Game Theory", "Cryptography", "Optimization Theory", "Numerical Analysis",
                "Differential Geometry", "Partial Differential Equations", "Algebraic Geometry", "Functional Analysis",
                "Measure Theory", "Stochastic Processes" };
        ArrayList<String> mathCoursesList = new ArrayList<String>(Arrays.asList(mathCourses));
        Integer[] mathCredits = {3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3};
        ArrayList<Integer> mathCreditsList = new ArrayList<Integer>(Arrays.asList(mathCredits));

        String[] physicsCourses = { "Classical Mechanics", "Quantum Mechanics", "Electromagnetism", "Thermodynamics",
                "Statistical Mechanics", "Relativity", "Astrophysics", "Nuclear Physics", "Particle Physics",
                "Plasma Physics", "Biophysics", "Optics", "Atomic Physics", "Condensed Matter Physics",
                "High Energy Physics", "Cosmology", "Gravitational Waves", "Quantum Field Theory", "String Theory",
                "General Relativity", "Quantum Gravity", "Computational Physics", "Nonlinear Dynamics",
                "Fluid Mechanics", "Acoustics" };
        ArrayList<String> physicsCoursesList = new ArrayList<String>(Arrays.asList(physicsCourses));
        Integer[] physicsCredits = {3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        ArrayList<Integer> physicsCreditsList = new ArrayList<Integer>(Arrays.asList(physicsCredits));

        String[] nonsensicalCourses = { "The Art of Pumpkin Carving", "The Science of Superheroes",
                "The History of Hair", "Alien Languages and Cultures", "Vampire Studies",
                "The Psychology of Video Games", "The Sociology of Social Media Influencers",
                "The Philosophy of Science Fiction", "Time Travel and Temporal Paradoxes",
                "Advanced Coffee Brewing Techniques", "Cryptozoology and Mythical Creature Studies",
                "Unicorns and Rainbows in Popular Culture", "The Art of Procrastination",
                "The History of Rock, Paper, Scissors", "How to Survive a Zombie Apocalypse",
                "The Science of Harry Potter", "The Anthropology of Meme Culture", "Advanced Napping Techniques",
                "The Philosophy of Pro Wrestling", "The Science of Unicorns", "The Art of Hula Hooping",
                "The History of Pajamas", "The Sociology of Reality TV Shows", "The Psychology of Online Dating",
                "The Philosophy of Memes" };
        ArrayList<String> nonsensicalCoursesList = new ArrayList<String>(Arrays.asList(nonsensicalCourses));
        Integer[] nonsensicalCredits = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        ArrayList<Integer> nonsensicalCreditsList = new ArrayList<Integer>(Arrays.asList(nonsensicalCredits));

        ArrayList<String> courses = new ArrayList<String>();
        courses.addAll(biologyCoursesList);
        courses.addAll(chemistryCoursesList);
        courses.addAll(computerScienceCoursesList);
        courses.addAll(englishCoursesList);
        courses.addAll(mathCoursesList);
        courses.addAll(physicsCoursesList);
        courses.addAll(nonsensicalCoursesList);

        ArrayList<Integer> credits = new ArrayList<Integer>();
        credits.addAll(biologyCreditsList);
        credits.addAll(chemistryCreditsList);
        credits.addAll(computerScienceCreditsList);
        credits.addAll(englishCreditsList);
        credits.addAll(mathCreditsList);
        credits.addAll(physicsCreditsList);
        credits.addAll(nonsensicalCreditsList);

        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
                      "Hernandez", "Lopez", "Gonzalez", "Perez", "Taylor", "Anderson", "Wilson", "Jackson", "Campbell", "Harris",
                      "Lee", "Young", "Allen", "Wright", "Turner", "Parker", "Evans", "Collins", "Robinson", "Ramirez", "Cook",
                      "Flores", "Cruz", "Reed", "Stewart", "Morales", "Ortiz", "Murphy", "Hall", "Watson", "Sanders", "Reyes",
                      "Edwards", "Reynolds", "Greene", "Baker", "Rogers", "Hill", "Gomez", "Jordan", "Morris", "Brooks", "Kelly",
                      "Perry", "Wood", "Foster", "Barnes", "James", "Bell", "Phillips", "Coleman", "Gray", "West", "Jordan", "Hayes",
                      "Fox", "Chavez", "Frazier", "Rhodes", "Gibson", "Perkins", "Fuller", "Porter", "Murray", "Bryant", "Warren",
                      "Palmer", "George", "Snyder", "Simpson", "Duncan", "Adams", "Griffin", "Reed", "Franklin", "Harrison", "Kennedy",
                      "Bush", "Mendoza", "Moreno", "Ramos", "Gardner", "Banks", "Ford", "Richardson", "Murillo", "Pearson", "Bowen",
                      "Peters", "Lucas", "Keller", "Spencer", "Gregory", "Austin", "Davidson", "Graham", "Lawrence", "Meyer", "Burns"};

        String[] firstNames = { "Oliver", "Emma", "Liam", "Ava", "Noah", "Sophia", "Ethan", "Isabella", "Mason", "Mia",
                        "Lucas", "Charlotte", "Logan", "Amelia", "Jackson", "Harper", "Aiden", "Evelyn", "Caden",
                        "Abigail", "Elijah", "Emily", "Grayson", "Elizabeth", "Jacob", "Avery", "Michael", "Sofia",
                        "Benjamin", "Chloe", "William", "Ella", "Daniel", "Madison", "Matthew", "Grace", "James",
                        "Victoria", "Evelyn", "Aria", "Olivia", "Mila", "Aaliyah", "Scarlett", "Arianna", "Lily",
                        "Aubrey", "Nora", "Hailey", "Zoe", "Ellie", "Lila", "Hazel", "Camila", "Brielle", "Gianna",
                        "Sadie", "Kinsley", "Eva", "Nova", "Valentina", "Peyton", "Aurora", "Audrey", "Leah", "Violet",
                        "Savannah", "Nova", "Maya", "Aria", "Eleanor", "Skylar", "Stella", "Caroline", "Madelyn", "Ivy",
                        "Everly", "Riley", "Genesis", "Allison", "Penelope", "Brooklyn", "Naomi", "Samantha", "Elena",
                        "Isabelle", "Ariana", "Makayla", "Kaylee", "Ellie", "Alice", "Cora", "Clara", "Katherine",
                        "Lucy", "Annabelle", "Julia", "Luna", "Sophie", "Adeline" };
         
        ArrayList<String> sid_list = new ArrayList<String>(101);
        for (int s = 0; s < 100; s++) {
                if (s < 25) {
                        String temp_last = lastNames[s];
                        String temp_first = firstNames[s];
                        boolean sid_done = false;
                        String temp_sid = "";
                        String temp_major1 = new String();
                        String temp_major2 = new String();
                        String temp_major3 = new String();
                        String temp_minor1 = new String();
                        String temp_minor2 = new String();
                        String temp_minor3 = new String();
                        while (sid_done != true) {
                                int tesid = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);
                                String tesidstring = String.valueOf(tesid);  
                                if (sid_list.contains(tesidstring) == false) {
                                        sid_list.add(tesidstring);
                                        temp_sid = tesidstring;
                                        sid_done = true;
                                }
                        }
                        double number_majors = Math.random();
                        int rand_major_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                        int rand_major2 = rand_major_num;
                        int rand_major3 = rand_major_num;
                        if (rand_major_num == 1) {
                                temp_major1 = "Bio";
                        } else if (rand_major_num == 2) {
                                temp_major1 = "Chem";
                        } else if (rand_major_num == 3) {
                                temp_major1 = "CS";
                        } else if (rand_major_num == 4) {
                                temp_major1 = "Eng";
                        } else if (rand_major_num == 5) {
                                temp_major1 = "Math";
                        } else if (rand_major_num == 6) {
                                temp_major1 = "Phys";
                        }
                        if ((number_majors > 0.5) && (number_majors <= 0.75)) {
                                while(rand_major2 == rand_major_num){
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }   
                        }
                        if ((number_majors >= 0.95) && (number_majors <= 1)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                                while ((rand_major3 == rand_major_num) || (rand_major3 == rand_major2)) {
                                        rand_major3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major3 == 1) {
                                        temp_major3 = "Bio";
                                } else if (rand_major3 == 2) {
                                        temp_major3 = "Chem";
                                } else if (rand_major3 == 3) {
                                        temp_major3 = "CS";
                                } else if (rand_major3 == 4) {
                                        temp_major3 = "Eng";
                                } else if (rand_major3 == 5) {
                                        temp_major3 = "Math";
                                } else if (rand_major3 == 6) {
                                        temp_major3 = "Phys";
                                }
                        }
                        double number_minors = Math.random();
                        int rand_minor_num = rand_major_num;
                        int rand_minor2 = rand_major_num;
                        int rand_minor3 = rand_major_num;
                        if (((number_minors >= 0.2) && (number_minors <= 0.6))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2) || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.6) && (number_minors <= 0.95))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2) || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2) || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.95) && (number_minors <= 1))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2) || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2) || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor3 == rand_major_num) || (rand_minor3 == rand_major2) || (rand_minor3 == rand_major3) || (rand_minor3 == rand_minor_num) || (rand_minor3 == rand_minor2)) {
                                        rand_minor3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                                if (rand_minor3 == 1) {
                                        temp_minor3 = "Bio";
                                } else if (rand_minor3 == 2) {
                                        temp_minor3 = "Chem";
                                } else if (rand_minor3 == 3) {
                                        temp_minor3 = "CS";
                                } else if (rand_minor3 == 4) {
                                        temp_minor3 = "Eng";
                                } else if (rand_minor3 == 5) {
                                        temp_minor3 = "Math";
                                } else if (rand_minor3 == 6) {
                                        temp_minor3 = "Phys";
                                }
                        }
                        try {
                                Connection conn = DriverManager.getConnection(url, user, password);
                                String students_insert = "INSERT INTO Students VALUES (?, ?, ?)";
                                PreparedStatement pstmt_students = conn.prepareStatement(students_insert);
                                pstmt_students.setString(1, temp_first);
                                pstmt_students.setString(2, temp_last);
                                pstmt_students.setString(3, temp_sid);
                                pstmt_students.executeUpdate();
                                String majors_insert = "INSERT INTO Majors VALUES (?, ?)";
                                PreparedStatement pstmt_majors= conn.prepareStatement(majors_insert);
                                pstmt_majors.setString(1, temp_sid);
                                pstmt_majors.setString(2, temp_major1);
                                pstmt_majors.executeUpdate();
                                if (temp_major2.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major2);
                                        pstmt_majors.executeUpdate();
                                }
                                if (temp_major3.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major3);
                                        pstmt_majors.executeUpdate();
                                }
                                String minors_insert = "INSERT INTO Minors VALUES (?, ?)";
                                PreparedStatement pstmt_minors = conn.prepareStatement(minors_insert);
                                if (temp_minor1.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor1);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor2.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor2);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor3.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor3);
                                        pstmt_minors.executeUpdate();
                                }
                                int totalCredits = 0;
                                ArrayList<String> courses_taken = new ArrayList<String>();
                                int num_current_courses = 0;
                                int course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                String temp_course = courses.get(course_ind);
                                courses_taken.add(temp_course);
                                String istaking_insert = "INSERT INTO IsTaking VALUES (?, ?)";
                                PreparedStatement pstmt_istaking = conn.prepareStatement(istaking_insert);
                                pstmt_istaking.setString(1, temp_sid);
                                pstmt_istaking.setString(2, temp_course);
                                pstmt_istaking.executeUpdate();
                                num_current_courses ++;
                                while (num_current_courses < 5) {
                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                        while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                temp_course = courses.get(course_ind);
                                                courses_taken.add(temp_course);
                                        }
                                        pstmt_istaking.setString(1, temp_sid);
                                        pstmt_istaking.setString(2, temp_course);
                                        pstmt_istaking.executeUpdate();
                                        num_current_courses ++;
                                }
                                String hastaken_insert = "INSERT INTO HasTaken VALUES (?, ?, ?)";
                                PreparedStatement pstmt_hastaken = conn.prepareStatement(hastaken_insert);
                                double freshman_taken_courses = Math.random();
                                if (freshman_taken_courses > 0.5) {
                                        while (totalCredits < 25) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                        temp_course = courses.get(course_ind);
                                                        courses_taken.add(temp_course);
                                                }
                                                int temp_credits = credits.get(course_ind);
                                                String temp_grade = new String();
                                                double grade_prob = Math.random();
                                                if (grade_prob <= 0.15) {
                                                        temp_grade = "A";
                                                } else if ((grade_prob > 0.15) && (grade_prob <= 0.35)) {
                                                        temp_grade = "B";
                                                } else if ((grade_prob > 0.35) && (grade_prob <= 0.65)) {
                                                        temp_grade = "C";
                                                } else if ((grade_prob > 0.65) && (grade_prob <= 0.85)) {
                                                        temp_grade = "D";
                                                } else if (grade_prob > 0.85) {
                                                        temp_grade = "F";
                                                }
                                                pstmt_hastaken.setString(1, temp_sid);
                                                pstmt_hastaken.setString(2, temp_course);
                                                pstmt_hastaken.setString(3, temp_grade);
                                                pstmt_hastaken.executeUpdate();
                                                totalCredits = totalCredits + temp_credits;
                                        }
                                }
                                pstmt_students.close();
                                pstmt_majors.close();
                                pstmt_minors.close();
                                pstmt_istaking.close();
                                pstmt_hastaken.close();
                                conn.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }

                }

                if ((s >= 25) && (s < 50)) {
                        String temp_last = lastNames[s];
                        String temp_first = firstNames[s];
                        boolean sid_done = false;
                        String temp_sid = "";
                        String temp_major1 = new String();
                        String temp_major2 = new String();
                        String temp_major3 = new String();
                        String temp_minor1 = new String();
                        String temp_minor2 = new String();
                        String temp_minor3 = new String();
                        while (sid_done != true) {
                                int tesid = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);
                                String tesidstring = String.valueOf(tesid);
                                if (sid_list.contains(tesidstring) == false) {
                                        sid_list.add(tesidstring);
                                        temp_sid = tesidstring;
                                        sid_done = true;
                                }
                        }
                        double number_majors = Math.random();
                        int rand_major_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                        int rand_major2 = rand_major_num;
                        int rand_major3 = rand_major2;
                        if (rand_major_num == 1) {
                                temp_major1 = "Bio";
                        } else if (rand_major_num == 2) {
                                temp_major1 = "Chem";
                        } else if (rand_major_num == 3) {
                                temp_major1 = "CS";
                        } else if (rand_major_num == 4) {
                                temp_major1 = "Eng";
                        } else if (rand_major_num == 5) {
                                temp_major1 = "Math";
                        } else if (rand_major_num == 6) {
                                temp_major1 = "Phys";
                        }
                        if ((number_majors > 0.5) && (number_majors <= 0.75)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                        }
                        if ((number_majors >= 0.95) && (number_majors <= 1)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                                while ((rand_major3 == rand_major_num) || (rand_major3 == rand_major2)) {
                                        rand_major3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major3 == 1) {
                                        temp_major3 = "Bio";
                                } else if (rand_major3 == 2) {
                                        temp_major3 = "Chem";
                                } else if (rand_major3 == 3) {
                                        temp_major3 = "CS";
                                } else if (rand_major3 == 4) {
                                        temp_major3 = "Eng";
                                } else if (rand_major3 == 5) {
                                        temp_major3 = "Math";
                                } else if (rand_major3 == 6) {
                                        temp_major3 = "Phys";
                                }
                        }
                        double number_minors = Math.random();
                        int rand_minor_num = rand_major_num;
                        int rand_minor2 = rand_major_num;
                        int rand_minor3 = rand_major_num;
                        if ((number_minors <= 0.6)) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.6) && (number_minors <= 0.95))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.95) && (number_minors <= 1))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor3 == rand_major_num) || (rand_minor3 == rand_major2)
                                                || (rand_minor3 == rand_major3) || (rand_minor3 == rand_minor_num)
                                                || (rand_minor3 == rand_minor2)) {
                                        rand_minor3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                                if (rand_minor3 == 1) {
                                        temp_minor3 = "Bio";
                                } else if (rand_minor3 == 2) {
                                        temp_minor3 = "Chem";
                                } else if (rand_minor3 == 3) {
                                        temp_minor3 = "CS";
                                } else if (rand_minor3 == 4) {
                                        temp_minor3 = "Eng";
                                } else if (rand_minor3 == 5) {
                                        temp_minor3 = "Math";
                                } else if (rand_minor3 == 6) {
                                        temp_minor3 = "Phys";
                                }
                        }
                        try {
                                Connection conn = DriverManager.getConnection(url, user, password);
                                String students_insert = "INSERT INTO Students VALUES (?, ?, ?)";
                                PreparedStatement pstmt_students = conn.prepareStatement(students_insert);
                                pstmt_students.setString(1, temp_first);
                                pstmt_students.setString(2, temp_last);
                                pstmt_students.setString(3, temp_sid);
                                pstmt_students.executeUpdate();
                                String majors_insert = "INSERT INTO Majors VALUES (?, ?)";
                                PreparedStatement pstmt_majors = conn.prepareStatement(majors_insert);
                                pstmt_majors.setString(1, temp_sid);
                                pstmt_majors.setString(2, temp_major1);
                                pstmt_majors.executeUpdate();
                                if (temp_major2.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major2);
                                        pstmt_majors.executeUpdate();
                                }
                                if (temp_major3.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major3);
                                        pstmt_majors.executeUpdate();
                                }
                                String minors_insert = "INSERT INTO Minors VALUES (?, ?)";
                                PreparedStatement pstmt_minors = conn.prepareStatement(minors_insert);
                                if (temp_minor1.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor1);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor2.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor2);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor3.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor3);
                                        pstmt_minors.executeUpdate();
                                }
                                int totalCredits = 0;
                                ArrayList<String> courses_taken = new ArrayList<String>();
                                int num_current_courses = 0;
                                int course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                String temp_course = courses.get(course_ind);
                                courses_taken.add(temp_course);
                                String istaking_insert = "INSERT INTO IsTaking VALUES (?, ?)";
                                PreparedStatement pstmt_istaking = conn.prepareStatement(istaking_insert);
                                pstmt_istaking.setString(1, temp_sid);
                                pstmt_istaking.setString(2, temp_course);
                                pstmt_istaking.executeUpdate();
                                num_current_courses++;
                                while (num_current_courses < 5) {
                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                        while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                temp_course = courses.get(course_ind);
                                                courses_taken.add(temp_course);
                                        }
                                        pstmt_istaking.setString(1, temp_sid);
                                        pstmt_istaking.setString(2, temp_course);
                                        pstmt_istaking.executeUpdate();
                                        num_current_courses++;
                                }
                                String hastaken_insert = "INSERT INTO HasTaken VALUES (?, ?, ?)";
                                PreparedStatement pstmt_hastaken = conn.prepareStatement(hastaken_insert);
                                        while ((totalCredits < 55)) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                        temp_course = courses.get(course_ind);
                                                        courses_taken.add(temp_course);
                                                }
                                                int temp_credits = credits.get(course_ind);
                                                String temp_grade = new String();
                                                double grade_prob = Math.random();
                                                if (grade_prob <= 0.15) {
                                                        temp_grade = "A";
                                                } else if ((grade_prob > 0.15) && (grade_prob <= 0.35)) {
                                                        temp_grade = "B";
                                                } else if ((grade_prob > 0.35) && (grade_prob <= 0.65)) {
                                                        temp_grade = "C";
                                                } else if ((grade_prob > 0.65) && (grade_prob <= 0.85)) {
                                                        temp_grade = "D";
                                                } else if (grade_prob > 0.85) {
                                                        temp_grade = "F";
                                                }
                                                pstmt_hastaken.setString(1, temp_sid);
                                                pstmt_hastaken.setString(2, temp_course);
                                                pstmt_hastaken.setString(3, temp_grade);
                                                pstmt_hastaken.executeUpdate();
                                                totalCredits = totalCredits + temp_credits;
                                        }
                                pstmt_students.close();
                                pstmt_majors.close();
                                pstmt_minors.close();
                                pstmt_istaking.close();
                                pstmt_hastaken.close();
                                conn.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }

                }

                if ((s >= 51) && (s < 75)) {
                        String temp_last = lastNames[s];
                        String temp_first = firstNames[s];
                        boolean sid_done = false;
                        String temp_sid = "";
                        String temp_major1 = new String();
                        String temp_major2 = new String();
                        String temp_major3 = new String();
                        String temp_minor1 = new String();
                        String temp_minor2 = new String();
                        String temp_minor3 = new String();
                        while (sid_done != true) {
                                int tesid = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);
                                String tesidstring = String.valueOf(tesid);
                                if (sid_list.contains(tesidstring) == false) {
                                        sid_list.add(tesidstring);
                                        temp_sid = tesidstring;
                                        sid_done = true;
                                }
                        }
                        double number_majors = Math.random();
                        int rand_major_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                        int rand_major2 = rand_major_num;
                        int rand_major3 = rand_major2;
                        if (rand_major_num == 1) {
                                temp_major1 = "Bio";
                        } else if (rand_major_num == 2) {
                                temp_major1 = "Chem";
                        } else if (rand_major_num == 3) {
                                temp_major1 = "CS";
                        } else if (rand_major_num == 4) {
                                temp_major1 = "Eng";
                        } else if (rand_major_num == 5) {
                                temp_major1 = "Math";
                        } else if (rand_major_num == 6) {
                                temp_major1 = "Phys";
                        }
                        if ((number_majors > 0.5) && (number_majors <= 0.75)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                        }
                        if ((number_majors >= 0.95) && (number_majors <= 1)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                                while ((rand_major3 == rand_major_num) || (rand_major3 == rand_major2)) {
                                        rand_major3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major3 == 1) {
                                        temp_major3 = "Bio";
                                } else if (rand_major3 == 2) {
                                        temp_major3 = "Chem";
                                } else if (rand_major3 == 3) {
                                        temp_major3 = "CS";
                                } else if (rand_major3 == 4) {
                                        temp_major3 = "Eng";
                                } else if (rand_major3 == 5) {
                                        temp_major3 = "Math";
                                } else if (rand_major3 == 6) {
                                        temp_major3 = "Phys";
                                }
                        }
                        double number_minors = Math.random();
                        int rand_minor_num = rand_major_num;
                        int rand_minor2 = rand_major_num;
                        int rand_minor3 = rand_major_num;
                        if ((number_minors <= 0.6)) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.6) && (number_minors <= 0.95))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.95) && (number_minors <= 1))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor3 == rand_major_num) || (rand_minor3 == rand_major2)
                                                || (rand_minor3 == rand_major3) || (rand_minor3 == rand_minor_num)
                                                || (rand_minor3 == rand_minor2)) {
                                        rand_minor3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                                if (rand_minor3 == 1) {
                                        temp_minor3 = "Bio";
                                } else if (rand_minor3 == 2) {
                                        temp_minor3 = "Chem";
                                } else if (rand_minor3 == 3) {
                                        temp_minor3 = "CS";
                                } else if (rand_minor3 == 4) {
                                        temp_minor3 = "Eng";
                                } else if (rand_minor3 == 5) {
                                        temp_minor3 = "Math";
                                } else if (rand_minor3 == 6) {
                                        temp_minor3 = "Phys";
                                }
                        }
                        try {
                                Connection conn = DriverManager.getConnection(url, user, password);
                                String students_insert = "INSERT INTO Students VALUES (?, ?, ?)";
                                PreparedStatement pstmt_students = conn.prepareStatement(students_insert);
                                pstmt_students.setString(1, temp_first);
                                pstmt_students.setString(2, temp_last);
                                pstmt_students.setString(3, temp_sid);
                                pstmt_students.executeUpdate();
                                String majors_insert = "INSERT INTO Majors VALUES (?, ?)";
                                PreparedStatement pstmt_majors = conn.prepareStatement(majors_insert);
                                pstmt_majors.setString(1, temp_sid);
                                pstmt_majors.setString(2, temp_major1);
                                pstmt_majors.executeUpdate();
                                if (temp_major2.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major2);
                                        pstmt_majors.executeUpdate();
                                }
                                if (temp_major3.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major3);
                                        pstmt_majors.executeUpdate();
                                }
                                String minors_insert = "INSERT INTO Minors VALUES (?, ?)";
                                PreparedStatement pstmt_minors = conn.prepareStatement(minors_insert);
                                if (temp_minor1.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor1);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor2.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor2);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor3.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor3);
                                        pstmt_minors.executeUpdate();
                                }
                                int totalCredits = 0;
                                ArrayList<String> courses_taken = new ArrayList<String>();
                                int num_current_courses = 0;
                                int course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                String temp_course = courses.get(course_ind);
                                courses_taken.add(temp_course);
                                String istaking_insert = "INSERT INTO IsTaking VALUES (?, ?)";
                                PreparedStatement pstmt_istaking = conn.prepareStatement(istaking_insert);
                                pstmt_istaking.setString(1, temp_sid);
                                pstmt_istaking.setString(2, temp_course);
                                pstmt_istaking.executeUpdate();
                                num_current_courses++;
                                while (num_current_courses < 5) {
                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                        while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                temp_course = courses.get(course_ind);
                                                courses_taken.add(temp_course);
                                        }
                                        pstmt_istaking.setString(1, temp_sid);
                                        pstmt_istaking.setString(2, temp_course);
                                        pstmt_istaking.executeUpdate();
                                        num_current_courses++;
                                }
                                String hastaken_insert = "INSERT INTO HasTaken VALUES (?, ?, ?)";
                                PreparedStatement pstmt_hastaken = conn.prepareStatement(hastaken_insert);
                                        while ((totalCredits < 85)) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                        temp_course = courses.get(course_ind);
                                                        courses_taken.add(temp_course);
                                                }
                                                int temp_credits = credits.get(course_ind);
                                                String temp_grade = new String();
                                                double grade_prob = Math.random();
                                                if (grade_prob <= 0.15) {
                                                        temp_grade = "A";
                                                } else if ((grade_prob > 0.15) && (grade_prob <= 0.35)) {
                                                        temp_grade = "B";
                                                } else if ((grade_prob > 0.35) && (grade_prob <= 0.65)) {
                                                        temp_grade = "C";
                                                } else if ((grade_prob > 0.65) && (grade_prob <= 0.85)) {
                                                        temp_grade = "D";
                                                } else if (grade_prob > 0.85) {
                                                        temp_grade = "F";
                                                }
                                                pstmt_hastaken.setString(1, temp_sid);
                                                pstmt_hastaken.setString(2, temp_course);
                                                pstmt_hastaken.setString(3, temp_grade);
                                                pstmt_hastaken.executeUpdate();
                                                totalCredits = totalCredits + temp_credits;
                                        }
                                pstmt_students.close();
                                pstmt_majors.close();
                                pstmt_minors.close();
                                pstmt_istaking.close();
                                pstmt_hastaken.close();
                                conn.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }

                }

                if (s >= 75) {
                        String temp_last = lastNames[s];
                        String temp_first = firstNames[s];
                        boolean sid_done = false;
                        String temp_sid = "";
                        String temp_major1 = new String();
                        String temp_major2 = new String();
                        String temp_major3 = new String();
                        String temp_minor1 = new String();
                        String temp_minor2 = new String();
                        String temp_minor3 = new String();
                        while (sid_done != true) {
                                int tesid = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);
                                String tesidstring = String.valueOf(tesid);
                                if (sid_list.contains(tesidstring) == false) {
                                        sid_list.add(tesidstring);
                                        temp_sid = tesidstring;
                                        sid_done = true;
                                }
                        }
                        double number_majors = Math.random();
                        int rand_major_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                        int rand_major2 = rand_major_num;
                        int rand_major3 = rand_major2;
                        if (rand_major_num == 1) {
                                temp_major1 = "Bio";
                        } else if (rand_major_num == 2) {
                                temp_major1 = "Chem";
                        } else if (rand_major_num == 3) {
                                temp_major1 = "CS";
                        } else if (rand_major_num == 4) {
                                temp_major1 = "Eng";
                        } else if (rand_major_num == 5) {
                                temp_major1 = "Math";
                        } else if (rand_major_num == 6) {
                                temp_major1 = "Phys";
                        }
                        if ((number_majors > 0.5) && (number_majors <= 0.75)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                        }
                        if ((number_majors >= 0.95) && (number_majors <= 1)) {
                                while (rand_major2 == rand_major_num) {
                                        rand_major2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major2 == 1) {
                                        temp_major2 = "Bio";
                                } else if (rand_major2 == 2) {
                                        temp_major2 = "Chem";
                                } else if (rand_major2 == 3) {
                                        temp_major2 = "CS";
                                } else if (rand_major2 == 4) {
                                        temp_major2 = "Eng";
                                } else if (rand_major2 == 5) {
                                        temp_major2 = "Math";
                                } else if (rand_major2 == 6) {
                                        temp_major2 = "Phys";
                                }
                                while ((rand_major3 == rand_major_num) || (rand_major3 == rand_major2)) {
                                        rand_major3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_major3 == 1) {
                                        temp_major3 = "Bio";
                                } else if (rand_major3 == 2) {
                                        temp_major3 = "Chem";
                                } else if (rand_major3 == 3) {
                                        temp_major3 = "CS";
                                } else if (rand_major3 == 4) {
                                        temp_major3 = "Eng";
                                } else if (rand_major3 == 5) {
                                        temp_major3 = "Math";
                                } else if (rand_major3 == 6) {
                                        temp_major3 = "Phys";
                                }
                        }
                        double number_minors = Math.random();
                        int rand_minor_num = rand_major_num;
                        int rand_minor2 = rand_major_num;
                        int rand_minor3 = rand_major_num;
                        if ((number_minors <= 0.6)) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.6) && (number_minors <= 0.95))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                        }
                        if (((number_minors >= 0.95) && (number_minors <= 1))) {
                                while ((rand_minor_num == rand_major_num) || (rand_minor_num == rand_major2)
                                                || (rand_minor_num == rand_major3)) {
                                        rand_minor_num = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor2 == rand_major_num) || (rand_minor2 == rand_major2)
                                                || (rand_minor2 == rand_major3) || (rand_minor2 == rand_minor_num)) {
                                        rand_minor2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                while ((rand_minor3 == rand_major_num) || (rand_minor3 == rand_major2)
                                                || (rand_minor3 == rand_major3) || (rand_minor3 == rand_minor_num)
                                                || (rand_minor3 == rand_minor2)) {
                                        rand_minor3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
                                }
                                if (rand_minor_num == 1) {
                                        temp_minor1 = "Bio";
                                } else if (rand_minor_num == 2) {
                                        temp_minor1 = "Chem";
                                } else if (rand_minor_num == 3) {
                                        temp_minor1 = "CS";
                                } else if (rand_minor_num == 4) {
                                        temp_minor1 = "Eng";
                                } else if (rand_minor_num == 5) {
                                        temp_minor1 = "Math";
                                } else if (rand_minor_num == 6) {
                                        temp_minor1 = "Phys";
                                }
                                if (rand_minor2 == 1) {
                                        temp_minor2 = "Bio";
                                } else if (rand_minor2 == 2) {
                                        temp_minor2 = "Chem";
                                } else if (rand_minor2 == 3) {
                                        temp_minor2 = "CS";
                                } else if (rand_minor2 == 4) {
                                        temp_minor2 = "Eng";
                                } else if (rand_minor2 == 5) {
                                        temp_minor2 = "Math";
                                } else if (rand_minor2 == 6) {
                                        temp_minor2 = "Phys";
                                }
                                if (rand_minor3 == 1) {
                                        temp_minor3 = "Bio";
                                } else if (rand_minor3 == 2) {
                                        temp_minor3 = "Chem";
                                } else if (rand_minor3 == 3) {
                                        temp_minor3 = "CS";
                                } else if (rand_minor3 == 4) {
                                        temp_minor3 = "Eng";
                                } else if (rand_minor3 == 5) {
                                        temp_minor3 = "Math";
                                } else if (rand_minor3 == 6) {
                                        temp_minor3 = "Phys";
                                }
                        }
                        try {
                                Connection conn = DriverManager.getConnection(url, user, password);
                                String students_insert = "INSERT INTO Students VALUES (?, ?, ?)";
                                PreparedStatement pstmt_students = conn.prepareStatement(students_insert);
                                pstmt_students.setString(1, temp_first);
                                pstmt_students.setString(2, temp_last);
                                pstmt_students.setString(3, temp_sid);
                                pstmt_students.executeUpdate();
                                String majors_insert = "INSERT INTO Majors VALUES (?, ?)";
                                PreparedStatement pstmt_majors = conn.prepareStatement(majors_insert);
                                pstmt_majors.setString(1, temp_sid);
                                pstmt_majors.setString(2, temp_major1);
                                pstmt_majors.executeUpdate();
                                if (temp_major2.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major2);
                                        pstmt_majors.executeUpdate();
                                }
                                if (temp_major3.isEmpty() != true) {
                                        pstmt_majors.setString(1, temp_sid);
                                        pstmt_majors.setString(2, temp_major3);
                                        pstmt_majors.executeUpdate();
                                }
                                String minors_insert = "INSERT INTO Minors VALUES (?, ?)";
                                PreparedStatement pstmt_minors = conn.prepareStatement(minors_insert);
                                if (temp_minor1.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor1);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor2.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor2);
                                        pstmt_minors.executeUpdate();
                                }
                                if (temp_minor3.isEmpty() != true) {
                                        pstmt_minors.setString(1, temp_sid);
                                        pstmt_minors.setString(2, temp_minor3);
                                        pstmt_minors.executeUpdate();
                                }
                                int totalCredits = 0;
                                ArrayList<String> courses_taken = new ArrayList<String>();
                                int num_current_courses = 0;
                                int course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                String temp_course = courses.get(course_ind);
                                courses_taken.add(temp_course);
                                String istaking_insert = "INSERT INTO IsTaking VALUES (?, ?)";
                                PreparedStatement pstmt_istaking = conn.prepareStatement(istaking_insert);
                                pstmt_istaking.setString(1, temp_sid);
                                pstmt_istaking.setString(2, temp_course);
                                pstmt_istaking.executeUpdate();
                                num_current_courses++;
                                while (num_current_courses < 5) {
                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                        while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                temp_course = courses.get(course_ind);
                                                courses_taken.add(temp_course);
                                        }
                                        pstmt_istaking.setString(1, temp_sid);
                                        pstmt_istaking.setString(2, temp_course);
                                        pstmt_istaking.executeUpdate();
                                        num_current_courses++;
                                }
                                String hastaken_insert = "INSERT INTO HasTaken VALUES (?, ?, ?)";
                                PreparedStatement pstmt_hastaken = conn.prepareStatement(hastaken_insert);
                                        while (totalCredits < 110) {
                                                course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                while (courses_taken.contains(courses.get(course_ind)) == false) {
                                                        course_ind = ThreadLocalRandom.current().nextInt(0, 176 + 1);
                                                        temp_course = courses.get(course_ind);
                                                        courses_taken.add(temp_course);
                                                }
                                                int temp_credits = credits.get(course_ind);
                                                String temp_grade = new String();
                                                double grade_prob = Math.random();
                                                if (grade_prob <= 0.15) {
                                                        temp_grade = "A";
                                                } else if ((grade_prob > 0.15) && (grade_prob <= 0.35)) {
                                                        temp_grade = "B";
                                                } else if ((grade_prob > 0.35) && (grade_prob <= 0.65)) {
                                                        temp_grade = "C";
                                                } else if ((grade_prob > 0.65) && (grade_prob <= 0.85)) {
                                                        temp_grade = "D";
                                                } else if (grade_prob > 0.85) {
                                                        temp_grade = "F";
                                                }
                                                pstmt_hastaken.setString(1, temp_sid);
                                                pstmt_hastaken.setString(2, temp_course);
                                                pstmt_hastaken.setString(3, temp_grade);
                                                pstmt_hastaken.executeUpdate();
                                                totalCredits = totalCredits + temp_credits;
                                        }
                                pstmt_students.close();
                                pstmt_majors.close();
                                pstmt_minors.close();
                                pstmt_istaking.close();
                                pstmt_hastaken.close();
                                conn.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }

                }
        } 
        /*  //THIS CODE WAS USED TO FILL IN THE CLASSES TABLE
        try {
                Connection conn = DriverManager.getConnection(url, user, password);
                //Statement stmt = conn.createStatement();
                String sql = "INSERT INTO Classes VALUES (?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                for (int i = 0; i < 25; i++) {
                        pstmt.setString(1, biologyCourses[i]);
                        pstmt.setInt(2, biologyCredits[i]);
                        pstmt.executeUpdate();
                        pstmt.setString(1, computerScienceCourses[i]);
                        pstmt.setInt(2, computerScienceCredits[i]);
                        pstmt.executeUpdate();
                        pstmt.setString(1, englishCourses[i]);
                        pstmt.setInt(2, englishCredits[i]);
                        pstmt.executeUpdate();
                        pstmt.setString(1, mathCourses[i]);
                        pstmt.setInt(2, mathCredits[i]);
                        pstmt.executeUpdate();
                        pstmt.setString(1, physicsCourses[i]);
                        pstmt.setInt(2, physicsCredits[i]);
                        pstmt.executeUpdate();
                        pstmt.setString(1, nonsensicalCourses[i]);
                        pstmt.setInt(2, nonsensicalCredits[i]);
                        pstmt.executeUpdate();
                }
                for (int i = 0; i < 27; i++) {
                        pstmt.setString(1, chemistryCourses[i]);
                        pstmt.setInt(2, chemistryCredits[i]);
                        pstmt.executeUpdate();
                }
                pstmt.close();
                conn.close();
        } catch (SQLException e) {
                e.printStackTrace();
        } */
        System.out.println("Done");
    }
    
}
