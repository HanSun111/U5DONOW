public class Person {
        private String first = "";
        private String last = "";
        private String email = "";

        public Person(String first, String last, String email){
            this.first = first;
            this.last = last;
            this.email = email;
        }

        public Person(String first, String last){
            this.first = first;
            this.last = last;
            email = "Redacted";
        }

        public void introduce(){
            System.out.println("Hello, my name is " + first + " " + last);
        }

        public void changeEmail(String newEmail){
            email = newEmail;
        }

        public String getFirst(){
            return first;
        }

        public String getLast(){
            return last;
        }

    public String getEmail(){
        return email;
    }
    }
