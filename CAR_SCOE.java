package RCOE;
import java.util.*;

// ======================================================
// Team class (formerly Company)
// Represents a specific team or project within a division.
// ======================================================
class Team {
    String name;
    int size;

    Team(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void showTeam() {
        System.out.println("    Team: " + name + " | Size: " + size + " employees");
    }
}

// ======================================================
// Manager class (formerly CEO)
// Represents a Manager who oversees multiple teams.
// ======================================================
class Manager {
    String name;
    List<Team> teams;

    Manager(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    void addTeam(Team t) {
        teams.add(t);
    }

    void showManager() {
        System.out.println("  Manager: " + name);
        for (Team t : teams) {
            t.showTeam();
        }
    }
}

// ======================================================
// Division class (formerly Department)
// Represents a major division of the company (e.g., Cloud, Software).
// ======================================================
class Division {
    String name;
    List<Manager> managers;

    Division(String name) {
        this.name = name;
        this.managers = new ArrayList<>();
    }

    void addManager(Manager m) {
        managers.add(m);
    }

    void showDivision() {
        System.out.println("Division: " + name);
        for (Manager m : managers) {
            m.showManager();
        }
    }
}

// ======================================================
// IT_Company class (formerly University)
// Represents the top level: the IT Company itself.
// ======================================================
class IT_Company {
    String name;
    List<Division> divisions;

    IT_Company(String name) {
        this.name = name;
        this.divisions = new ArrayList<>();
    }

    void addDivision(Division d) {
        divisions.add(d);
    }

    void showCompanyHierarchy() {
        System.out.println("\n--- IT Company Hierarchy ---");
        System.out.println("Company: " + name);
        for (Division d : divisions) {
            d.showDivision();
        }
    }
}

// ======================================================
// Main class
// ======================================================
public class CAR_SCOE {

    public static void main(String[] args) {

        // 1. Create teams (formerly companies)
        Team cloudInfra = new Team("Cloud Infrastructure", 15);
        Team dataScience = new Team("AI Data Science", 10);
        Team coreBanking = new Team("Core Banking Product", 25);
        Team devOps = new Team("DevOps Tools", 8);

        // 2. Create managers (formerly CEOs) and assign teams
        Manager managerA = new Manager("xyz");
        managerA.addTeam(cloudInfra);
        managerA.addTeam(devOps);

        Manager managerB = new Manager("Bob Williams");
        managerB.addTeam(coreBanking);

        Manager managerC = new Manager("Cathy Lee");
        managerC.addTeam(dataScience);
        managerC.addTeam(coreBanking); // Note: A team can potentially be cross-managed or involved in multiple projects

        // 3. Create divisions (formerly departments) and assign managers
        Division cloud = new Division("Cloud Services Division");
        cloud.addManager(managerA);
        
        Division finance = new Division("Financial Systems Division");
        finance.addManager(managerB);

        Division research = new Division("R&D Labs Division");
        research.addManager(managerC);

        // 4. Create IT companies (formerly universities) and assign divisions
        IT_Company techGlobal = new IT_Company("Tech Global Solutions");
        techGlobal.addDivision(cloud);
        techGlobal.addDivision(finance);

        IT_Company innovaCorp = new IT_Company("InnovaCorp");
        innovaCorp.addDivision(research);

        // 5. Display the hierarchy
        techGlobal.showCompanyHierarchy();
        innovaCorp.showCompanyHierarchy();
    }
}