package synch;

import java.util.concurrent.locks.*;

/**
 * Bank z kilkoma kontami, kontroluj�cy dost�p za pomoc� blokad
 * 
 * @version 1.30 2004-08-01
 * @author Cay Horstmann
 */

public class Bank {
	private final double[] accounts;
	private Lock bankLock;
	private Condition sufficientFunds;

	/**
	 * Tworzy bank
	 * 
	 * @param n
	 *            liczba kont
	 * @param initialBalance
	 *            saldo pocz�tkowe na ka�dym koncie
	 */
	public Bank(int n, double initialBalance) {
		accounts = new double[n];
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = initialBalance;
		bankLock = new ReentrantLock();
		sufficientFunds = bankLock.newCondition();
	}

	/**
	 * Przelewa pieni�dze pomi�dzy kontami.
	 * 
	 * @param from
	 *            konto, z kt�rego ma nast�pi� przelew
	 * @param to
	 *            konto, na kt�re maj� zosta� przelane �rodki
	 * @param amount
	 *            kwota do przelania
	 */
	public void transfer(int from, int to, double amount) throws InterruptedException {
		bankLock.lock();
		try {
			while (accounts[from] < amount)
				sufficientFunds.await();
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f z %d na %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf(" Saldo og�lne: %10.2f%n", getTotalBalance());
			sufficientFunds.signalAll();
		} finally {
			bankLock.unlock();
		}
	}

	/**
	 * Zwraca sum� sald wszystkich kont.
	 * 
	 * @return saldo og�lne
	 */
	public double getTotalBalance() {
		bankLock.lock();
		try {
			double sum = 0;

			for (double a : accounts)
				sum += a;
			return sum;
		} finally {
			bankLock.unlock();
		}
	}

	/**
	 * Zwraca liczb� kont w banku.
	 * 
	 * @return liczba kont
	 */
	public int size() {
		return accounts.length;
	}
}
