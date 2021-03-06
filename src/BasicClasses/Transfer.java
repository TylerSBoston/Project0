package BasicClasses;

import java.math.*;

public class Transfer {

	private BigDecimal amount;
	private String targetRoutingNumber;
	private String targetAccountNumber;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTargetRoutingNumber() {
		return targetRoutingNumber;
	}
	public void setTargetRoutingNumber(String targetRoutingNumber) {
		this.targetRoutingNumber = targetRoutingNumber;
	}
	public String getTargetAccountNumber() {
		return targetAccountNumber;
	}
	public void setTargetAccountNumber(String targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}
	public int getOriginID() {
		return originID;
	}
	public void setOriginID(int originID) {
		this.originID = originID;
	}
	private int originID;
}
