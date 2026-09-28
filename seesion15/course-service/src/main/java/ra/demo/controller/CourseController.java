package ra.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @GetMapping
    public ResponseEntity<String> getAllCourses(@RequestHeader(value = "X-Auth-Role", defaultValue = "UNKNOWN") String userRole) {
        return ResponseEntity.ok("Danh sách khóa học. Bạn đăng nhập với Role: " + userRole);
    }
}
