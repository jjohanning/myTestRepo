package com.janhelmut.avz.domain.util;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Version
	private int version;

	@Temporal(TemporalType.TIMESTAMP)
	private Date persistDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@PrePersist
	public void prePersist() {
		this.persistDate = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		this.updateDate = new Date();
	}

	public Date getPersistDate() {
		return persistDate;
	}

	public void setPersistDate(Date persistDate) {
		this.persistDate = persistDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
