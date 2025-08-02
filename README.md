# 📂 Vakansiya Kateqoriyaları – SQL Əlavə Etmə

Bu sənəd vakansiya saytınız üçün nümunəvi **15 kateqoriyanın** SQL vasitəsilə `categories` cədvəlinə əlavə olunmasını göstərir. Hər bir kateqoriyaya uyğun **Font Awesome ikon** sinifləri təyin olunmuşdur.

## 📌 SQL Formatı

```sql
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-briefcase text-primary mb-4', 'İnzibati işlər');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-laptop-code text-primary mb-4', 'İT və Proqramlaşdırma');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-chart-line text-primary mb-4', 'Marketinq və Satış');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-balance-scale text-primary mb-4', 'Hüquq');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-coins text-primary mb-4', 'Maliyyə və Mühasibat');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-graduation-cap text-primary mb-4', 'Təhsil və Elmi Tədqiqat');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-stethoscope text-primary mb-4', 'Tibb və Sağlamlıq');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-tools text-primary mb-4', 'Tikinti və Texniki sahələr');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-store text-primary mb-4', 'Müştəri Xidmətləri və Satış');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-shipping-fast text-primary mb-4', 'Logistika və Nəqliyyat');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-utensils text-primary mb-4', 'İaşə və Restoran');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-paint-brush text-primary mb-4', 'Dizayn və Yaradıcılıq');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-language text-primary mb-4', 'Tərcümə və Dil Xidmətləri');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-hammer text-primary mb-4', 'Əl əməyinə əsaslanan işlər');
INSERT INTO categories(icon, name) VALUES ('fa fa-3x fa-users text-primary mb-4', 'İnsan Resursları');
```


# 💼 İş Tipləri – SQL Əlavə və Açıqlama

Bu bölmədə vakansiya platforması üçün **dünya praktikasına uyğun 13 iş növü** təqdim olunur. Aşağıda həm onların Azərbaycan dilində adları, izahları, həm də SQL əmr forması qeyd edilmişdir.

## 🌐 İş Tipləri və İzahları

| İş Tipi              | İzah |
|----------------------|------|
| **Tam ştat**         | Həftədə 35–40 saatlıq daimi iş |
| **Yarım ştat**       | Gündə və ya həftədə daha az saat işlənən çevik iş |
| **Freelancer**       | Layihə əsaslı, sərbəst iş rejimi |
| **Müqaviləli iş**    | Müəyyən müddətlik müqavilə ilə görülən iş |
| **Müvəqqəti iş**     | Qısa müddətli, bəzən birdəfəlik iş |
| **Mövsümi iş**       | Məsələn yay-qış mövsümünə uyğun olan işlər |
| **Təcrübəçi**        | Tələbələr və yeni məzunlar üçün öyrənmə yönümlü iş |
| **Uzaqdan iş**       | İnternet vasitəsilə, ofisə gəlmədən görülən iş |
| **Hibrid**           | Həm ofisdə, həm uzaqdan işləmə imkanı verən qarışıq model |
| **Ofisdaxili iş**    | Ənənəvi olaraq iş yerində fiziki iştirak tələb edən iş |
| **Növbəli iş**       | Gecə/gündüz növbəsi ilə dəyişən iş saatları |
| **Könüllü iş**       | Sosial yönümlü, ödənişsiz işlər |
| **Faizlə əsaslanan iş** | Əmək haqqı satış və ya göstəriciyə əsasən faizlə ödənilən iş |

---

## 🛠️ SQL Əmr Forması

```sql
INSERT INTO job_types(name) VALUES ('Tam ştat');
INSERT INTO job_types(name) VALUES ('Yarım ştat');
INSERT INTO job_types(name) VALUES ('Freelancer');
INSERT INTO job_types(name) VALUES ('Müqaviləli iş');
INSERT INTO job_types(name) VALUES ('Müvəqqəti iş');
INSERT INTO job_types(name) VALUES ('Mövsümi iş');
INSERT INTO job_types(name) VALUES ('Təcrübəçi');
INSERT INTO job_types(name) VALUES ('Uzaqdan iş');
INSERT INTO job_types(name) VALUES ('Hibrid');
INSERT INTO job_types(name) VALUES ('Ofisdaxili iş');
INSERT INTO job_types(name) VALUES ('Növbəli iş');
INSERT INTO job_types(name) VALUES ('Könüllü iş');
INSERT INTO job_types(name) VALUES ('Faizlə əsaslanan iş');
```


# 🏢 Şirkət Məlumatları – SQL Əlavə Nümunələri

Aşağıdakı SQL əmrləri vakansiya platforması üçün 4 nüfuzlu texnoloji şirkətin verilənlər bazasına əlavə edilməsini əhatə edir. Hər biri üçün təsvir, ünvan və loqo linkləri daxil edilmişdir.

## 🗃️ companies Cədvəli Strukturu

| Sütun       | Tip    | Təsvir                        |
|-------------|--------|-------------------------------|
| description | TEXT   | Şirkət haqqında məlumat        |
| address     | TEXT   | Ünvan                         |
| name        | VARCHAR | Şirkətin adı                 |
| photo_url   | TEXT   | Şirkətin loqo və ya şəkil linki |

---

## ✅ SQL Kodları

```sql
INSERT INTO companies(description, address, name, photo_url) 
VALUES (
  'Azərbaycanın qabaqcıl texnoloji təhsil mərkəzlərindən biri olan ITBrains, proqramlaşdırma və rəqəmsal bacarıqlar üzrə ixtisaslaşır.',
  'Bakı, Nərimanov r., Fətəli Xan Xoyski 123',
  'ITBrains',
  'https://example.com/images/itbrains-logo.png'
);

INSERT INTO companies(description, address, name, photo_url) 
VALUES (
  'ITBTecho rəqəmsal transformasiya, proqram təminatı və texnoloji konsaltinq sahəsində xidmət göstərən bir texnologiya şirkətidir.',
  'Bakı, Yasamal r., Hüseyn Cavid prospekti 45',
  'ITBTecho',
  'https://example.com/images/itbtecho-logo.png'
);

INSERT INTO companies(description, address, name, photo_url) 
VALUES (
  'ITBrains Abuturient – məktəblilər və abituriyentlər üçün IT yönümlü təlimlər və hazırlıq proqramları təklif edir.',
  'Sumqayıt şəhəri, Sülh küçəsi 89',
  'ITBrains Abuturient',
  'https://example.com/images/itbrains-abuturient-logo.png'
);

INSERT INTO companies(description, address, name, photo_url) 
VALUES (
  'TechvibeDS data science, süni intellekt və maşın öyrənməsi sahəsində ixtisaslaşan startapdır. Layihələri həm yerli, həm də beynəlxalq bazarlara yönəlib.',
  'Bakı, Sabunçu r., Zabrat 2, Texnopark binası',
  'TechvibeDS',
  'https://example.com/images/techvibeds-logo.png'
);
```


# 👤 İstifadəçilərin Əlavə Edilməsi – SQL və Nümunə Məlumatlar

Aşağıda vakansiya sistemində istifadəçilərin `users` cədvəlinə əlavə olunması üçün nümunə SQL əmrləri təqdim edilir. Email-lər **@itbrains.edu.az** domeninə aiddir.

## 🗃️ users Cədvəli Strukturu

| Sütun      | Tip     | Təsvir                            |
|------------|---------|-----------------------------------|
| company_id | INT     | İstifadəçinin aid olduğu şirkət   |
| email      | VARCHAR | Email ünvanı                      |
| name       | VARCHAR | Ad                                |
| surname    | VARCHAR | Soyad                             |
| password   | VARCHAR | Şifrələnmiş parol                 |

---

## ✅ SQL Kodları

```sql
INSERT INTO users(company_id, email, name, password, surname)
VALUES (1, 'ayhan.mammadov@itbrains.edu.az', 'Ayhan', 'hashed_password1', 'Məmmədov');

INSERT INTO users(company_id, email, name, password, surname)
VALUES (2, 'leyla.aliyeva@itbrains.edu.az', 'Leyla', 'hashed_password2', 'Əliyeva');

INSERT INTO users(company_id, email, name, password, surname)
VALUES (3, 'samir.rustamli@itbrains.edu.az', 'Samir', 'hashed_password3', 'Rüstəmli');

INSERT INTO users(company_id, email, name, password, surname)
VALUES (4, 'nigar.huseynova@itbrains.edu.az', 'Nigar', 'hashed_password4', 'Hüseynova');
```


# Vakansiyalar SQL Insert Skripti

Bu fayl müxtəlif kateqoriyalar üzrə vakansiyaların məlumatlarını `vacancies` cədvəlinə əlavə etmək üçün hazırlanmış SQL insert sorğularını ehtiva edir. Hər vakansiya üçün müxtəlif sahələr doludur:

- **max_salary** və **min_salary** — işin maksimum və minimum maaşı.
- **category_id** — vakansiyanın aid olduğu kateqoriya (1-dən 15-ə qədər kateqoriyalar mövcuddur).
- **company_id** — vakansiyanı elan edən şirkətin ID-si.
- **date_line** — vakansiyanın bitmə tarixi.
- **job_type_id** — iş növü (məsələn, tam iş günü, yarım iş günü və s.).
- **description** — iş haqqında geniş təsvir, CKEditor-də hazırlanmış kimi HTML `<ul>` siyahı formatında.
- **qualification** — tələb olunan keyfiyyət və bacarıqlar, siyahı formatında.
- **responsibility** — vəzifə və məsuliyyətlər, siyahı formatında.
- **location** — işin yerinə dair məlumat.
- **title** — işin adı (sadə mətn).

---

## Kateqoriyalar və Vakansiyalar

Kateqoriyalar 15-ə bölünüb:

1. İnzibati işlər
2. İT və Proqramlaşdırma
3. Marketinq və Satış
4. Hüquq
5. Maliyyə və Mühasibat
6. Təhsil və Elmi Tədqiqat
7. Tibb və Sağlamlıq
8. İncəsənət və Mədəniyyət
9. Mühəndislik və Texnika
10. Logistika və Nəqliyyat
11. İaşə və Restoran
12. Dizayn və Yaradıcılıq
13. Tərcümə və Dil Xidmətləri
14. Əl əməyinə əsaslanan işlər
15. İnsan Resursları

Hər kateqoriyada 2-dən 5-ə qədər vakansiya təqdim olunub.

---

## İstifadə qaydası

1. SQL skriptini verilənlər bazanızda işlədərək `vacancies` cədvəlinə vakansiya məlumatlarını əlavə edin.
2. **description**, **qualification**, və **responsibility** sahələri HTML `<ul>` və `<li>` tagları ilə strukturlaşdırılıb ki, məlumatlar rahat vizuallaşdırılsın.
3. Başlıq sahəsi isə adi mətn kimi saxlanılıb.

---

## Məsələn

```sql
INSERT INTO vacancies(max_salary, min_salary, category_id, company_id, date_line, job_type_id, description, qualification, responsibility, location, title)
VALUES (
  1500, 900, 1, 1, '2025-09-30', 1,
  '<ul><li>Ofis işlərinin təşkil olunması və idarə edilməsi.</li><li>Gündəlik hesabatların hazırlanması.</li></ul>',
  '<ul><li>Ali təhsil, inzibati sahədə üstünlük.</li><li>MS Office proqramlarını bilməlidir.</li></ul>',
  '<ul><li>Sənədlərin idarə olunması.</li><li>Görüşlərin təşkili.</li></ul>',
  'Bakı',
  'Ofis Meneceri'
);
```