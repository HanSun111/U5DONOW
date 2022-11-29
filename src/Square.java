public class Square {
        private int side;
        public Square(int side){
            this.side = side;
        }

        public Square(){
            side = 999999999 + 1;
        }

        public void setSide(int newSide)
        {
            side = newSide;
        }

        public String toString()
        {
            return "Side: " + side;
        }
    }