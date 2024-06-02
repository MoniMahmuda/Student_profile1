module com.cse213.student_profile1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213.student_profile1 to javafx.fxml;
    exports com.cse213.student_profile1;
}