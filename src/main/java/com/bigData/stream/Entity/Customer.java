package com.bigData.stream.Entity;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;
import org.springframework.data.cassandra.core.mapping.Column;


@Table("customer_churn")
public class Customer {

    @PrimaryKey
    private UUID id;

    @Column("account_length")
    private int accountLength;

    @Column("area_code")
    private int areaCode;

    @Column("churn")
    private int churn;

    @Column("customer_service_calls")
    private int customerServiceCalls;

    @Column("international_plan")
    private int internationalPlan;

    @Column("number_vmail_messages")
    private int numberVmailMessages;

    @Column("prediction")
    private int prediction;

    @Column("state")
    private int state;

    @Column("total_day_calls")
    private int totalDayCalls;

    @Column("total_day_charge")
    private double totalDayCharge;

    @Column("total_day_minutes")
    private double totalDayMinutes;

    @Column("total_eve_calls")
    private int totalEveCalls;

    @Column("total_eve_charge")
    private double totalEveCharge;

    @Column("total_eve_minutes")
    private double totalEveMinutes;

    @Column("total_night_calls")
    private int totalNightCalls;

    @Column("total_night_charge")
    private double totalNightCharge;

    @Column("total_night_minutes")
    private double totalNightMinutes;

    @Column("total_intl_calls")
    private int totalIntlCalls;

    @Column("total_intl_charge")
    private double totalIntlCharge;

    @Column("total_intl_minutes")
    private double totalIntlMinutes;

    @Column("voice_mail_plan")
    private int voiceMailPlan;

    public UUID getId() {
        return id;
    }

    public int getAccountLength() {
        return accountLength;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getChurn() {
        return churn;
    }

    public int getCustomerServiceCalls() {
        return customerServiceCalls;
    }

    public int getInternationalPlan() {
        return internationalPlan;
    }

    public int getNumberVmailMessages() {
        return numberVmailMessages;
    }

    public int getPrediction() {
        return prediction;
    }

    public int getState() {
        return state;
    }

    public int getTotalDayCalls() {
        return totalDayCalls;
    }

    public double getTotalDayCharge() {
        return totalDayCharge;
    }

    public double getTotalDayMinutes() {
        return totalDayMinutes;
    }

    public int getTotalEveCalls() {
        return totalEveCalls;
    }

    public double getTotalEveCharge() {
        return totalEveCharge;
    }

    public double getTotalEveMinutes() {
        return totalEveMinutes;
    }

    public int getTotalNightCalls() {
        return totalNightCalls;
    }

    public double getTotalNightCharge() {
        return totalNightCharge;
    }

    public double getTotalNightMinutes() {
        return totalNightMinutes;
    }

    public int getTotalIntlCalls() {
        return totalIntlCalls;
    }

    public double getTotalIntlCharge() {
        return totalIntlCharge;
    }

    public double getTotalIntlMinutes() {
        return totalIntlMinutes;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAccountLength(int accountLength) {
        this.accountLength = accountLength;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setChurn(int churn) {
        this.churn = churn;
    }

    public void setCustomerServiceCalls(int customerServiceCalls) {
        this.customerServiceCalls = customerServiceCalls;
    }

    public void setInternationalPlan(int internationalPlan) {
        this.internationalPlan = internationalPlan;
    }

    public void setNumberVmailMessages(int numberVmailMessages) {
        this.numberVmailMessages = numberVmailMessages;
    }

    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTotalDayCalls(int totalDayCalls) {
        this.totalDayCalls = totalDayCalls;
    }

    public void setTotalDayCharge(double totalDayCharge) {
        this.totalDayCharge = totalDayCharge;
    }

    public void setTotalDayMinutes(double totalDayMinutes) {
        this.totalDayMinutes = totalDayMinutes;
    }

    public void setTotalEveCalls(int totalEveCalls) {
        this.totalEveCalls = totalEveCalls;
    }

    public void setTotalEveCharge(double totalEveCharge) {
        this.totalEveCharge = totalEveCharge;
    }

    public void setTotalEveMinutes(double totalEveMinutes) {
        this.totalEveMinutes = totalEveMinutes;
    }

    public void setTotalNightCalls(int totalNightCalls) {
        this.totalNightCalls = totalNightCalls;
    }

    public void setTotalNightCharge(double totalNightCharge) {
        this.totalNightCharge = totalNightCharge;
    }

    public void setTotalNightMinutes(double totalNightMinutes) {
        this.totalNightMinutes = totalNightMinutes;
    }

    public void setTotalIntlCalls(int totalIntlCalls) {
        this.totalIntlCalls = totalIntlCalls;
    }

    public void setTotalIntlCharge(double totalIntlCharge) {
        this.totalIntlCharge = totalIntlCharge;
    }

    public void setTotalIntlMinutes(double totalIntlMinutes) {
        this.totalIntlMinutes = totalIntlMinutes;
    }

    public void setVoiceMailPlan(int voiceMailPlan) {
        this.voiceMailPlan = voiceMailPlan;
    }

    public int getVoiceMailPlan() {
        return voiceMailPlan;
    }
}
