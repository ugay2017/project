package ru.job.professions;

public class Engineer extends Profession {
private boolean isBuild;

public void build(House house) {
    house.setBuild(isBuild);
}

public boolean isBuild(House house) {
    return house.isBuild();
}
}
