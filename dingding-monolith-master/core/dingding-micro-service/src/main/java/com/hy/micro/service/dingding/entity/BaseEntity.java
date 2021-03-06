package com.hy.micro.service.dingding.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;

/**
 * 
 * @Author: Eddie.Wei
 * @Date: 2018-10-05
 * @github: https://github.com/weixuan2008
 */

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "create_time")
	@CreatedDate
	private Date createTime;

	@Column(name = "update_time")
	@LastModifiedDate
	private Date updateTime;
}
