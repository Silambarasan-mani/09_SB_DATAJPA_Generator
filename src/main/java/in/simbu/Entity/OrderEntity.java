package in.simbu.Entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="Order_TBL")
@Data
public class OrderEntity {
	
	@Id
	@GenericGenerator(name="order",strategy = "in.simbu.Generator.OrderCustomGen")
	@GeneratedValue(generator = "order")
	@Column(name="ORD_ID")
	private String ordId;
	
	@Column(name="ORD_BY")
	private String ordBy;
	
	@Column(name="ORD_DATE")
	@Temporal(TemporalType.DATE)
	private Date ordDate;
	

}
