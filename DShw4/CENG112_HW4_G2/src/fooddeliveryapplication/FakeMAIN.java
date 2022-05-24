package fooddeliveryapplication;

public class FakeMAIN {
		public void xd() {
		ObjectCreation objects;
		Restaurant [] restaurants;
		Food [] foods;
		Binarysearchtree<Restaurant> ratingBST ;
		Binarysearchtree<Restaurant>  deliveryBST;
		Binarysearchtree<Food> priceBST ;
		Binarysearchtree<Food> stockBST;
		
			
			objects=new ObjectCreation();
			restaurants=objects.getRestaurants();
			foods=objects.getFoods();
			ratingBST = new Binarysearchtree<>( new Restaurantcomparator(0));
			deliveryBST= new Binarysearchtree<>( new Restaurantcomparator(1));
			priceBST = new Binarysearchtree<>( new Foodcomparator(0));
			stockBST = new Binarysearchtree<>( new Foodcomparator(1));
			
			
			
			
			
			
			int size=restaurants.length;
			for (int i=0;i<size;i++) {
				 //System.out.println(restaurants[i]);
				 if (restaurants[i]!=null) {
					 ratingBST.add(restaurants[i]);
							
					 deliveryBST.add(restaurants[i]);
					 //System.out.println(restaurants[i].getName()+"   "+restaurants[i].getRating());	
						
				 }
				
				//System.out.println(foods[i].getName());
				priceBST.add(foods[i]);
				stockBST.add(foods[i]);
			}
			
			while (true) {
				Restaurant tempReturn=ratingBST.descInOrder();
				if (tempReturn==null) {
					break;
				}
				
				if (tempReturn!=null) {
					System.out.println(tempReturn.getName()+"  "+tempReturn.getRating() );
				}
				
			}
		
	}
}
