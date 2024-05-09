public class User {
    private int age;

    /**
     * 设置用户的年龄。
     * 如果年龄不在合理范围内（1-100岁），抛出 IllegalArgumentException。
     *
     * @param age 用户的年龄
     */
    public void setAge(int age) {
        if (age <= 0 || age > 100) {
            throw new IllegalArgumentException("年龄必须在1到100岁之间。");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User user = new User();
        try {
            user.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }
    }
}
