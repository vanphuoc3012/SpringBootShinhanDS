# SpringBootShinhanDS
Spring Data JPA work flow:

![dataaccess_jpa_basic_flow](https://user-images.githubusercontent.com/37379686/212478482-687724d0-810f-49bc-82ee-5aa69aaa21a5.png)

Phân biệt ORM, Hibernate, JPA, Spring Data JPA:
- ORM (Object relational mapping): là 1 kỹ thuật cho phép ánh xạ cơ sở dữ liệu đến đối tượng lập trình hướng đối tượng (chưa được triển khai cụ thể)
- JPA (Java Persistence Interface): JPA có thể xem như là 1 interface định nghĩa các API cho kỹ thuật ORM (chưa được triển khai cụ thể)
- Hibernate: implements JPA
- Spring Data JPA: là dự án con trong Spring Data. Được sử dụng để định nghĩa các phương thức truy vấn và kết nối đến database, giúp cho việc triển khai nhanh hơn.

# Spring Data JPA work flow:
(1) Các method(có chứa thông tin entity và các tham số) của Repository được gọi từ tầng Service.

(2) Proxy gọi tới các Repository Implement xử lý các tham số được gửi từ tầng Service để gửi đến tầng tiếp theo.
  (CustomRepositoryImpl = khi ta có thực hiện custom query trong repository interface, SimpleJpaRepositoryImpl = triển khai mặc định của repository)
  
(3) Các Repository Implement gọi các JPA APIs (ở đây là Hibernate) để tiếp tục xử lý các tham số.

  (Mặc định của Spring Data JPA sử dụng là Hibernate, có thể thay thế bằng EclipseLink...)
  
(4) Các Hibernates Core API được gọi để tạo ra các câu SQL sử dụng các tham số trước đó.

(5) Các câu SQL được chuyển đến JDBC driver để thực hiện với database
