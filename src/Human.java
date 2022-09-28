
public class Human {
    private Integer yearOfBirth;
    private String name;
    private String city;
    private String job;

    public Human(Integer yearOfBirth, String name, String city, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if(name==null) {
            this.name = "Информация не указана";
        } else{
            this.name = name;
        }
        if(city==null) {
            this.city = "Информация не указана";
        }else{
            this.city = city;
        }
        if(job==null){
            this.job = "Информация не указана";
        } else{
        this.job = job;
    }}

    public Human(Integer yearOfBirth, String name, String city) {
        if (yearOfBirth < 0) {
           this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return " Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";

    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if((yearOfBirth<0) || yearOfBirth == null){
         this.yearOfBirth = 0;}
          else { this.yearOfBirth = yearOfBirth;}
    }


    public void setCity(String city) {
        if (city != null || !(city.isEmpty())){
        this.city = city;}
        else{ city = "Информация не указана";}
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return city;
    }
}

