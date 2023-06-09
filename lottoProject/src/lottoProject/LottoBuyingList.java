package lottoProject;

import java.util.ArrayList;
import java.util.List;

import Frame.DepositFrame;

public class LottoBuyingList {
	private List<LottoPaper> buyList; // 로또 용지
	private int money; // 예치금

	// 처음에 초기화
	public LottoBuyingList() {
		buyList = new ArrayList<>();
		this.money = 0;
	}

	public List<LottoPaper> getBuyList() {
		return buyList;
	}

	public void setBuyList(List<LottoPaper> buyList) {
		this.buyList = buyList;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyList == null) ? 0 : buyList.hashCode());
		result = prime * result + money;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LottoBuyingList))
			return false;
		LottoBuyingList other = (LottoBuyingList) obj;
		if (buyList == null) {
			if (other.buyList != null)
				return false;
		} else if (!buyList.equals(other.buyList))
			return false;
		if (money != other.money)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LottoUser [buyList=" + buyList + ", money=" + money + "]";
	}

}
