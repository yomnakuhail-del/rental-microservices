# Islamic University of Gaza  
## Faculty of IT — Advanced SW Engineering (SDEV 4304)  
### Running Project Report

<div style="page-break-after: always;"></div>

## Cover Page
- **Course**: Advanced SW Engineering (SDEV 4304)  
- **Project Title**: Rental Microservices  
- **Student Name**: YUMNA KUHAIL 
- **Student ID**: 220211735  
- **Supervisor**: Dr. Abdelkareem Alashqar  
- **Date**: 06/10/2025

<div style="page-break-after: always;"></div>

## Links (Public)
- **GitHub Repo**: https://github.com/yomnakuhail-del/rental-microservices
- **Video**: <<ضع رابط فيديو عام على YouTube أو Google Drive>>

<div style="page-break-after: always;"></div>

## 1. Introduction
- فكرة النظام بإيجاز ولماذا اخترته.
- نطاق المشروع وما لا يشمله.

## 2. Objectives
- أهداف واضحة قابلة للقياس (مثال: حجز سيارة بنجاح، رفض الطلب عند عدم التوفر، تشغيل خدمة على Docker، إلخ).

## 3. Requirements & Tech Stack
- المتطلبات الوظيفية وغير الوظيفية.
- التقنيات: Java 17, Spring Boot 3.5.x, WebFlux WebClient, Maven, Docker (Colima على macOS), cURL/HTTP.

## 4. System Design Overview
- **Architecture (Microservices)**: car-service و rental-service مع وصف تدفق الطلب.
- مخطط بسيط للعناصر (ضع صورة لاحقًا أو ارسم Mermaid).
- نماذج البيانات الأساسية مثل CarAvailability و RentalRequest.

## 5. API Endpoints
### car-service
- `GET /cars/{id}/availability` → { carId, available, location }
- (اختياري) `POST /cars/{id}/reserve` → { status }

### rental-service
- `POST /rentals` → CONFIRMED | REJECTED

## 6. Implementation Details
- ملخص الحزم: `web`, `model`, `client`, `config`.
- **التواصل بين الخدمات**: WebClient مع خاصية `car.service.url`.
- لقطات/أمثلة من الشيفرة الحرجة (CarClient, RentalController).

## 7. Running & Testing
### Local + Docker
- تشغيل car-service داخل Docker:
  - build jar, build image, run container، اختبار `/cars/{id}/availability`.
- تشغيل rental-service محليًا:
  - `mvn spring-boot:run` ثم اختبار `POST /rentals`.

### Evidence (Logs/Outputs)
- ضع هنا مخرجات cURL الرئيسية كنص أو صور لشاشة التنفيذ:
  - حجز ناجح: `CONFIRMED`
  - رفض الحجز: `REJECTED`

## 8. Deployment (Docker)
- Dockerfile لـ car-service.
- استخدام Colima: `colima start -f`, `docker context use colima`.
- أوامر بناء وتشغيل الصورة.
- أي ملاحظات واجهتها على macOS.

## 9. (Bonus) CI/CD — اختياري
- GitHub Actions: build Maven، (اختياري) push للصور إلى Docker Hub.
- قدم ملف workflow إن قمت به.

## 10. Testing & Validation
- حالات الاختبار اليدوية (happy path, unavailable car).
- كيف تحققت من تكامل الخدمتين end-to-end.

## 11. Screenshots
- ضع لقطات للشاشات: طرفية التشغيل، Docker container, cURL responses.

## 12. Lessons Learned
- أبرز ما تعلمته تقنيًا (WebClient, Docker/Colima, Spring Boot).
- كيف يفيدك ذلك مستقبلًا.

## 13. Conclusion
- ملخص لما تم إنجازه مقارنة بالأهداف.

