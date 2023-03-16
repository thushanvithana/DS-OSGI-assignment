package com.mtit.service;

public class BasketballPlayer {

    /// Required Statistics
    private int fieldGoals;
    private int fieldGoalAttempts;
    private int pointScored;
    private int freeThrows;
    private int freeThrowAttemps;
    private int assiste;
    private int blocks;
    private int steals;
    private int turnovers;
    private int defensiveRebounds;
    private int personalFouls;
    private int OffensiveRebounds;

    // player information
    private String name;
    private int age;
    private double height;
    private double weight;

    /// Calculated results
    private double eFGCalc;
    private double trueShootingPercentageCalc;
    private double gamePerformcCalc;

    /// Calculate all statistics
    public void calculateStatistics() {
        eFGCalc = (double) (3 - fieldGoals) / 3 - fieldGoalAttempts;
        gamePerformcCalc = (double) (pointScored + (0.4 * fieldGoals) - (0.7 * fieldGoalAttempts)
                - 0.4 * (freeThrowAttemps - freeThrows) + 0.7 * (OffensiveRebounds) + 0.3 * (defensiveRebounds) + steals
                + 0.7 * assiste + 0.7 * (blocks) - 0.4 * (personalFouls) - turnovers);
        trueShootingPercentageCalc = (double) (pointScored / (2 * (fieldGoalAttempts + 0.44 * freeThrowAttemps))) * 100;
    }

    // Constructor
    public BasketballPlayer() {
        super();
    }

    /// Getters // Setters
    public int getOffensiveRebounds() {
        return OffensiveRebounds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOffensiveRebounds(int offensiveRebounds) {
        OffensiveRebounds = offensiveRebounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFieldGoals() {
        return fieldGoals;
    }

    public void setFieldGoals(int fieldGoals) {
        this.fieldGoals = fieldGoals;
    }

    public int getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public void setFieldGoalAttempts(int fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts;
    }

    public int getPointScored() {
        return pointScored;
    }

    public void setPointScored(int pointScored) {
        this.pointScored = pointScored;
    }

    public int getFreeThrows() {
        return freeThrows;
    }

    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    public int getFreeThrowAttemps() {
        return freeThrowAttemps;
    }

    public void setFreeThrowAttemps(int freeThrowAttemps) {
        this.freeThrowAttemps = freeThrowAttemps;
    }

    public int getAssiste() {
        return assiste;
    }

    public void setAssiste(int assiste) {
        this.assiste = assiste;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getSteals() {
        return steals;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }

    public int getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(int defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public int getPersonalFouls() {
        return personalFouls;
    }

    public void setPersonalFouls(int personalFouls) {
        this.personalFouls = personalFouls;
    }

    public double geteFGCalc() {
        return eFGCalc;
    }

    public void seteFGCalc(double eFGCalc) {
        this.eFGCalc = eFGCalc;
    }

    public double getTrueShootingPercentageCalc() {
        return trueShootingPercentageCalc;
    }

    public void setTrueShootingPercentageCalc(int trueShootingPercentageCalc) {
        this.trueShootingPercentageCalc = trueShootingPercentageCalc;
    }

    public double getGamePerformcCalc() {
        return gamePerformcCalc;
    }

    public void setGamePerformcCalc(double gamePerformcCalc) {
        this.gamePerformcCalc = gamePerformcCalc;
    }
}
