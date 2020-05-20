package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	
	private Client Client;
	
	private List<OrderItem> orderItens = new ArrayList<>();

	public Order(Date moment, OrderStatus status, entities.Client client) {
		this.moment = moment;
		this.status = status;
		Client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}
	
	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

	public void addItem(OrderItem item) {
		orderItens.add(item); 
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	public Double total() {
		Double sum=0.0;
		for (OrderItem x : orderItens) {
			sum += x.subTotal();
		}
		 return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + "(" + Client.getName() + ")" + sdf2.format(Client.getBirthDate()) + " - " + Client.getEmail() + "\n");
		sb.append("Oder Items" + "\n");
		for (OrderItem item : orderItens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f",total()));
		
		
		return sb.toString();
	}
	


}
