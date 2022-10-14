package dev.rayssacorreia.Application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Lock {

    @Id
    private String id;
    private String lockId;
    private String lockName;
    private String lockDescription;
    private String lockImageUrl;
    private Date creationData = new Date();

    public Lock(){}

    /* GETTERS AND SETTERS*/

    public String getId(){
        return id;
    }
    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public void setLockDescription(String lockDescription) {
        this.lockDescription = lockDescription;
    }

    public String getLockImageUrl() {
        return lockImageUrl;
    }

    public void setLockImageUrl(String lockImageUrl) {
        this.lockImageUrl = lockImageUrl;
    }

    public Date getCreationData() {
        return creationData;
    }

    public void setCreationData(Date creationData) {
        this.creationData = creationData;
    }

}
