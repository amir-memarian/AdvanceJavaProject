package shop;

import java.util.List;

public class ShoppingListServiceImpl implements ShoppingListService{
    final ShoppingListDAO shoppingListDAO;
    //Dependency Injection
    public ShoppingListServiceImpl(ShoppingListDAO shoppingListDAO) {
        this.shoppingListDAO = shoppingListDAO;
    }

    @Override
    public List<Item> findAllItems() {
        //Get all items from database: Any Logic - not utest
        return shoppingListDAO.findAllItems();
    }

    @Override
    public void saveItems(List<Item> items) {
        // check items:
            // check if item name is not null or empty
            // quantity > 0
            // quantity < 100
        for (Item item : items) {
            item.check();
        }

        // Save all items in database
        shoppingListDAO.saveItems(items);
    }
}
