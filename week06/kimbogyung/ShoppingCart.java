public class ShoppingCart {
    private Item [] items = new Item[10];
    private int itemCount;

    ShoppingCart() {
        System.out.println("장바구니 상품 출력");
    }
    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 다 찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getPrice());
        }
        System.out.println("전체 금액:" + getTotal());
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.getPrice();
        }
        return total;
    }

}
