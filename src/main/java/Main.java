public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "иван";
        post.patronymic = "иванович";
        post.surname = "иванов";
        post.passport = "4444 № 444444";
        post.phone = "+7(900)-999-99-99";
        post.registration = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
