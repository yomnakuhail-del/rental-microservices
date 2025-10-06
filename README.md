# Rental Microservices (car-service & rental-service)

Microservices بسيطة لعرض حجز سيارات:
- **car-service** (منفذ 8081): يقدّم توافر السيارة.
- **rental-service** (منفذ 8082): يستدعي car-service لتأكيد/رفض الحجز.

## المتطلبات
- JDK 17، Maven 3.9+
- Docker Engine  
  - على macOS بدون صلاحيات إدارية استخدم **Colima**: `brew install colima docker`

## تشغيل سريع

### 1) شغّل car-service داخل Docker
```bash
# لو أول مرّة تستخدم Colima
colima start -f
docker context use colima

cd car-service
mvn -DskipTests clean package
docker build -t car-service:local .
docker run -d --name car --rm -p 8081:8081 car-service:local

