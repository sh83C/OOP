public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.birthday = new FormDate();

        post.birthday.day = 21;
        post.birthday.month = 8;
        post.birthday.year = 1986;

        post.name = "Шамиль";
        post.passport = "1234 № 12345678";
        post.patronymic = "Хамитович";
        post.phone = "+79373050880";
        post.surname = "Бакиров";
        post.subscription = true;
    }
}