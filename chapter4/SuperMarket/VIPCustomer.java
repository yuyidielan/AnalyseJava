class VIPCustomer extends Customer{
		private int jifen;
		public VIPCustomer(String ID,String name,int fen){
			super(ID,name);
			jifen=fen;
		}
		public void setFen(int f){
			jifen=f;
		}
		public int getFen(){
			return jifen;
		}
}