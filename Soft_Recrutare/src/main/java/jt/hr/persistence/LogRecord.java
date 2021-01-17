package jt.hr.persistence;

import javax.persistence.*;

//name defaults to the unqualified entity class name.        
//default access is property.
@Entity
@NamedQueries({
    @NamedQuery(name = "LogRecord.countCandidates", query = "select count(c) from Candidat c"),
    @NamedQuery(name = "LogRecord.findAllRecords", query = "select c from Candidat c")
})

public class LogRecord {
    
    @Id 
    @GeneratedValue
    private int id;
    private String name;
    
    public LogRecord(String record) {
        setRecord(record);
    }
    
    public LogRecord() {
    }
    
    public String getRecord() {
        return name;
    }
    public void setRecord(String record) {
        this.name = record;
    }
    
}
