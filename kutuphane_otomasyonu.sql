-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 13 Oca 2021, 15:13:04
-- Sunucu sürümü: 10.4.17-MariaDB
-- PHP Sürümü: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `kütüphane otomasyonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitaplar`
--

CREATE TABLE `kitaplar` (
  `kitapNo` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `yazar` text COLLATE utf8_turkish_ci NOT NULL,
  `tur` text COLLATE utf8_turkish_ci NOT NULL,
  `yayinevi` text COLLATE utf8_turkish_ci NOT NULL,
  `sayfaSayisi` int(11) NOT NULL,
  `basimTarihi` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kitaplar`
--

INSERT INTO `kitaplar` (`kitapNo`, `ad`, `yazar`, `tur`, `yayinevi`, `sayfaSayisi`, `basimTarihi`) VALUES
(1, 'Nutuk', 'Mustafa Kemal Atatürk', 'Söylev', 'Tutku Yayınevi', 397, 'Aralık 2010'),
(2, 'Üç Anadolu Efsanesi', 'Yaşar Kemal', 'Efsane-Destan', 'Yapı Kredi yayınları', 222, 'Ağustos 2014'),
(3, 'Ana', 'Maksim Gorki', 'Roman', 'Çise Kitap', 408, 'Ocak 2014'),
(4, 'Savaş ve Barış', 'Lev N. Tolstoy', 'Roman', 'Çise Kitap', 607, 'Haziran 2014'),
(5, 'İki İyi Hırsız', 'Daniel Finn', 'Roman', 'Sonsuz Kitap', 330, 'Kasım 2011'),
(6, 'Sefiller - I', 'Victor Hugo ', 'Roman', 'İş Bankası Yayınları', 857, 'Temmuz 2019'),
(7, 'Sefiller - II', 'Victor Hugo', 'Roman', 'İş Bankası Yayınları', 837, 'Temmuz 2019'),
(8, 'Diriliş', 'Lev N. Tolstoy', 'Roman', 'İş Bankası Yayınları', 637, 'Mart 2018'),
(9, 'Suç ve Ceza', 'Fyodor M. Dostoyevski', 'Roman', 'İş Bankası Yayınları', 687, 'Kasım 2018'),
(10, 'Karamazov Kardeşler', 'Fyodor M. Dostoyevski', 'Roman', 'İş Bankası Yayınları', 1025, 'Temmuz 2019'),
(11, 'Ecinniler', 'Fyodor M. Dostoyevski', 'Roman', 'İş Bankası Yayınları', 897, 'Mart 2019'),
(12, 'Madame Bovary', 'Gustave Flaubert', 'Roman', 'İş Bankası Yayınları', 385, 'Şubat 2020'),
(13, 'Vadideki Zambak', 'Honore De Balzac', 'Roman', 'İş Bankası Yayınları', 300, 'Mayıs 2019'),
(14, 'Beyaz Geceler', 'Fyodor M. Dostoyevski', 'Öykü', 'İş Bankası Yayınları', 202, 'Ocak 2020'),
(15, 'Yeraltından Notlar', 'Fyodor M. Dostoyevski', 'Roman', 'İş Bankası Yayınları', 139, 'Ocak 2020'),
(16, 'Bir Yaz Gecesi Rüyası', 'William Shakespeare', 'Oyun', 'İş Bankası Yayınları', 95, 'Ocak 2020'),
(17, 'Bir İdam Mahkumunun Son Günü', 'Victor Hugo', 'Roman', 'İş Bankası Yayınları', 77, 'Şubat 2020'),
(18, 'Kendine Ait Bir Oda', 'Virginia Woolf', 'Deneme', 'İndigo Kitap', 160, 'Temmuz 2019'),
(19, 'Kırmızı Saçlı Kadın', 'Orhan Pamuk', 'Roman', 'Yapı Kredi Yayınları', 195, 'Nisan 2018'),
(20, 'Semaver', 'Sait Faik Abasıyanık', 'Öykü', 'Yapı Kredi Yayınları', 104, 'Mart 2010'),
(21, 'Pal Sokağı Çocukları', 'Ferenc Molnar', 'Çocuk Roman', 'Mevsim Yayınları', 120, 'Ocak 2008'),
(22, 'Güneş Ülkesi', 'Tommaso Campanella', 'Felsefe-Düşünce', 'Say Yayınları', 112, 'Ocak 2014'),
(23, 'İtiraflarım', 'Lev N. Tolstoy', 'Deneme', 'Maviçatı Yayınları', 88, 'Ocak 2018'),
(24, 'Kerem ile Aslı', 'Sadık Yalsızuçanlar', 'Efsane-Destan', 'Timaş Yayınları', 133, 'Ocak 2005'),
(25, 'Safahat ', 'Mehmet Akif Ersoy', 'Şiir', 'İnkılap', 460, 'Ocak 2017'),
(26, 'Cehennem', 'Dan Brown', 'Roman', 'Altın Kitaplar', 574, 'Mayıs 2013'),
(27, 'Bin Muhteşem Güneş', 'Khaled Hosseini', 'Roman', 'Everest Yayınları', 432, 'Ocak 2019'),
(28, 'Patenli Kız', 'Zeynep Cemali', 'Çocuk Öykü', 'Günışığı Kitaplığı', 200, 'Mayıs 2009'),
(29, 'İki Şehrin Hikayesi', 'Charles Dickens', 'Roman', 'İskele Yayınları', 263, 'Mart 2015'),
(30, 'Katre-i Matem', 'İskender Pala', 'Roman', 'Kapı Yayınları', 519, 'Temmuz 2014'),
(31, 'Martin Eden', 'Jack London', 'Roman', 'Destek Yayınları', 488, 'Haziran 2018'),
(32, 'Ütopya', 'Thomas More', 'Felsefe-Düşünce', 'Nilüfer Yayıncılık', 143, 'Ocak 2014'),
(33, 'Sokratesin Savunması', 'Platon', 'Felsefe-Düşünce', 'Nilüfer Yayıncılık', 88, 'Ocak 2017'),
(34, 'Sergüzeşt', 'Samipaşazade Sezai', 'Öykü', 'Nilüfer Yayıncılık', 110, 'Ocak 2016'),
(35, 'Kaptan Grantın Çocukları', 'Jules Verne', 'Çocuk Roman', 'Ema Kitap', 96, 'Ocak 2010'),
(36, 'Momo', 'Michael Ende', 'Çocuk Roman', 'Kabalcı Yayınevi', 303, 'Ekim 2005'),
(37, 'Beyaz Zambaklar Ülkesinde', 'Grigoriy Petrov', 'Tarih', 'Koridor Yayınları', 240, 'Ocak 2020'),
(38, 'Beyaz Diş', 'Jack London', 'Roman', 'İş Bankası Yayınları', 258, 'Şubat 2020'),
(39, 'Otomatik Portakal', 'Anthony Burgess', 'Roman', 'İş Bankası Yayınları', 171, 'Ocak 2020'),
(40, 'Fadiş ', 'Gülten Dayıoğlu', 'Çocuk Öykü', 'Altın Kitapları', 159, 'Ocak 2005'),
(41, 'Siddharta', 'Hermann Hesse', 'Felsefe-Düşünce', 'Can Yayınları', 158, 'Mayıs 2010'),
(42, 'David Copperfield', 'Charles Dickens', 'Çocuk Öykü', 'Morpa Kültür Yayınları', 95, 'Ocak 2005'),
(43, 'Olağanüstü Bir Gece', 'Stefan Zweig', 'Roman', 'Panama Yayınları', 119, 'Ocak 2015'),
(44, 'Yaban', 'Yakup Kadriosmanoğlu', 'Roman', 'İletişim Yayınları', 198, 'Ocak 2016'),
(45, '1984', 'George Orwell', 'Roman', 'Can Yayınları', 348, 'Kasım 2019'),
(46, 'Çılgın Babam', 'Zeynep Cemali', 'Çocuk Roman', 'Günışığı Kitaplığı', 160, 'Eylül 2009'),
(47, 'Hayvan Çiftliği', 'George Orwell', 'Roman', 'Can Yayınları', 152, 'Ocak 2016'),
(48, 'İnsan Ne ile Yaşar? ', 'Lev N. Tolstoy', 'Roman', 'İndigo Kitap', 92, 'Nisan 2017'),
(49, 'Amok Koşucusu', 'Stefan Zweig', 'Roman', 'İndigo Kitap', 80, 'Şubat 2018'),
(50, 'Simyacı', 'Paulo Coelho', 'Roman', 'Can Yayınları', 166, 'Ocak 2000'),
(51, 'Ateşten Gömlek', 'Halide Edib Adıvar', 'Roman', 'Can Yayınları', 211, 'Şubat 2016'),
(52, 'Gökyüzündeki Mor Bulutlar', 'Gülten Dayıoğlu ', 'Çocuk Roman', 'Altın Kitapları', 208, 'Ocak 2000'),
(53, 'Gurbet Hikayeleri', 'Refik Halid Karay', 'Öykü', 'İnkılap Kitabevi', 88, 'Ocak 2016'),
(54, 'Yeraltında Dünya Var', 'Refik Halid Karay', 'Roman', 'İnkılap Kitabevi', 230, 'Ocak 2016'),
(55, 'Bir Bilim Adamının Romanı Mustafa İnan', 'Oğuz Atay', 'Biyografi', 'İletişim Yayınları', 270, 'Haziran 2013'),
(56, 'İçimizdeki Şeytan', 'Sabahattin Ali', 'Roman', 'Yapı Kredi Yayınları', 267, 'Mayıs 2011'),
(57, 'Aşk', 'Elif Şafak', 'Roman', 'Doğan Kitap', 415, 'Mart 2009'),
(59, 'Araba Sevdası', 'Recaizade Mahmut Ekrem', 'Roman', 'Anonim Yayıncılık', 271, 'Ağustos 2016'),
(63, 'Öteki', 'Fyodor M. Dostoyevski', 'Roman', 'İş Bankası Yayınları', 188, 'Kasım 2019'),
(64, 'Oblomov ', 'İvan Gonçarov', 'Roman', 'İş Bankası Yayınları', 632, 'Kasım 2019');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(11) NOT NULL,
  `kullaniciAdi` text COLLATE utf32_turkish_ci NOT NULL,
  `sifre` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `kullaniciAdi`, `sifre`) VALUES
(1, 'kutuphane', 'kutuphane12345'),
(4, 'hacer', 'hacer12345'),
(5, 'dilan', 'dilan12345'),
(6, 'ahmet', 'ahmet12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `odunckitaplar`
--

CREATE TABLE `odunckitaplar` (
  `kitapNo` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `yazar` text COLLATE utf8_turkish_ci NOT NULL,
  `uyeNo` int(11) NOT NULL,
  `uyeAd` text COLLATE utf8_turkish_ci NOT NULL,
  `uyeSoyad` text COLLATE utf8_turkish_ci NOT NULL,
  `verilisTarihi` date NOT NULL,
  `teslimTarihi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `odunckitaplar`
--

INSERT INTO `odunckitaplar` (`kitapNo`, `ad`, `yazar`, `uyeNo`, `uyeAd`, `uyeSoyad`, `verilisTarihi`, `teslimTarihi`) VALUES
(5, 'İki İyi Hırsız', 'Daniel Finn', 7, 'Ahmet', 'YÜZBAŞIOĞLU', '2021-01-02', '2021-01-03'),
(27, 'Bin Muhteşem Güneş', 'Khaled Hosseini', 1, 'Hacer Nur', 'Yavaş', '2021-01-02', '2021-01-03'),
(8, 'Diriliş', 'Lev N. Tolstoy', 9, 'Mustafa', 'ERDEM', '2021-01-02', '2021-01-03'),
(23, 'İtiraflarım', 'Lev N. Tolstoy', 42, 'Emine', 'ERTEKİN', '2021-01-02', '2021-01-03'),
(21, 'Pal Sokağı Çocukları', 'Ferenc Molnar', 17, 'Özlem', 'ÇEVİK', '2021-01-02', '2021-01-03'),
(6, 'Sefiller - I', 'Victor Hugo ', 12, 'Hanife', 'YAVUZ', '2021-01-02', '2021-01-03'),
(11, 'Ecinniler', 'Fyodor M. Dostoyevski', 29, 'Abdullah', 'ERTEKİN', '2021-01-03', '2021-01-04'),
(57, 'Aşk', 'Elif Şafak', 17, 'Özlem', 'ÇEVİK', '2021-01-03', '2021-01-04'),
(22, 'Güneş Ülkesi', 'Tommaso Campanella', 23, 'Umut', 'ERKURAN', '2021-01-05', '2021-01-06'),
(20, 'Semaver', 'Sait Faik Abasıyanık', 45, 'Hasan', 'YÜZBAŞIOĞLU', '2021-01-05', '2021-01-06'),
(17, 'Bir İdam Mahkumunun Son Günü', 'Victor Hugo', 17, 'Özlem', 'ÇEVİK', '2021-01-07', '2021-01-08'),
(16, 'Bir Yaz Gecesi Rüyası', 'William Shakespeare', 17, 'Özlem', 'ÇEVİK', '2021-01-07', '2021-01-08'),
(18, 'Kendine Ait Bir Oda', 'Virginia Woolf', 17, 'Özlem', 'ÇEVİK', '2021-01-07', '2021-01-08');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE `uyeler` (
  `uyeNo` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `telefon` text COLLATE utf32_turkish_ci NOT NULL,
  `mail` text COLLATE utf32_turkish_ci NOT NULL,
  `adres` text COLLATE utf32_turkish_ci NOT NULL,
  `dogumTarihi` date NOT NULL,
  `uyeBorc` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`uyeNo`, `ad`, `soyad`, `telefon`, `mail`, `adres`, `dogumTarihi`, `uyeBorc`) VALUES
(1, 'Hacer Nur', 'Yavaş', '05432724934', 'haceryavaas@gmail.com', 'Fındıklı Mahallesi Çalışkan Sokak No:25 Daire:6 Maltepe/İstanbul ', '2000-11-18', 20),
(2, 'Zeliha', 'YÜCEL', '05564561223', 'zelihayucel@gmail.com', '', '1996-02-04', 0),
(3, 'Merve', 'SÖNMEZ', '5314122698', 'mervesonmez@gmail.com', '', '2001-01-31', 0),
(4, 'Merve', 'VURAL', '05412367895', 'mervevural@gmail.com', '', '2001-02-25', 0),
(5, 'Havva', 'KANDEMİR', '05591234758', 'havvakandemir@gmail.com', '', '1979-01-24', 0),
(6, 'Hatice', 'YÜZBAŞIOĞLU', '05563217896', 'yuzbasiogluhatice@gmail.com', '', '2000-01-28', 0),
(7, 'Ahmet', 'YÜZBAŞIOĞLU', '05412367895', 'yuzbasioglu@gmail.com', '', '2000-02-01', 20),
(8, 'Mustafa', 'TÜTEN', '05576234857', 'mustafatuten@gmail.com', '', '1965-03-03', 0),
(9, 'Mustafa', 'ERDEM', '05596481329', 'erdemustafa@gmail.com', '', '1999-05-20', 20),
(10, 'Havva', 'VURAL', '05394681278', 'vuralhavva@gmail.com', '', '2000-06-08', 0),
(11, 'Esra', 'AKBULUT', '05541123698', 'akbulutesra@gmail.com', '', '2000-06-16', 0),
(12, 'Hanife', 'YAVUZ', '05412987635', 'hanifeyavuz@gmail.com', '', '2001-07-11', 20),
(13, 'Meryem', 'UYANIK', '05384896512', 'uyanikmeryem@gmail.com', '', '2000-08-01', 0),
(14, 'Emine', 'ŞEN', '05461597536', 'seneminem@gmail.com', '', '1999-08-17', 0),
(15, 'Hüseyin', 'ŞEN', '05394786129', 'senhusoo@gmail.com', '', '2000-08-18', 0),
(16, 'Hüseyin', 'YÜCEL', '05495784169', 'yucelahasan@gmail.com', '', '2001-08-24', 0),
(17, 'Özlem', 'ÇEVİK', '05423698741', 'ozlemcevik@gmail.com', '', '1992-08-30', 68),
(18, 'Yunus Emre', 'ERDEM', '05541239857', 'erdemreyunus@gmail.com', '', '1998-10-07', 0),
(19, 'Zeynep', 'ÖZTÜRK', '05536541245', 'ozturkzeynep@gmail.com', '', '1998-09-25', 0),
(20, 'Hülya', 'ÖZTÜRK', '05563217819', 'hulyaozturk@gmail.com', '', '2000-09-28', 0),
(21, 'İsmail', 'ERDEM', '05532587961', 'erdemismail@gmail.com', '', '2000-10-21', 0),
(22, 'Esra', 'KANDEMİR', '05551233445', 'kandemiresra@gmail.com', '', '1998-10-28', 0),
(23, 'Umut', 'ERKURAN', '05564519843', 'erkumut@gmail.com', '', '2000-10-29', 14),
(24, 'Şerife', 'ERKURAN', '05331594554', 'erkuranserife@gmail.com', '', '1997-11-14', 0),
(25, 'Elif', 'VURAL', '05318801369', 'elifVural@gmail.com', '', '2000-05-21', 0),
(26, 'Mustafa', 'ŞEN', '05321567841', 'senmustafa@gmail.com', '', '1989-12-23', 0),
(27, 'Meryem', 'KANDEMİR', '05314897563', 'meryemkandemir@gmail.com', '', '2002-02-01', 0),
(28, 'Enes', 'ÇEVİK', '05511305787', 'enesCevik@gmail.com', '', '1992-04-09', 0),
(29, 'Abdullah', 'ERTEKİN', '05563217896', 'abdullahertekin@gmail.com', '', '2004-04-09', 18),
(30, 'Mehmet', 'ORHON', '05589746532', 'orhonmehmet@gmail.com', '', '1997-07-15', 0),
(31, 'Ömer', 'SÖNMEZ', '05541263978', 'omersonmez@gmail.com', '', '1998-09-25', 0),
(32, 'Abdullah', 'AKBULUT', '05596478236', 'abdullahh@gmail.com', '', '1999-07-21', 0),
(33, 'Meryem', 'SÖNMEZ', '05412697845', 'meryemsonmez@gmail.com', '', '2004-03-03', 0),
(34, 'İsmail', 'SÖNMEZ', '05541897563', 'ismailsonmez@gmail.com', '', '2002-06-06', 0),
(35, 'Zeynep', 'ŞEN', '05392913000', 'zeynepsen@gmail.com', '', '2003-06-06', 0),
(36, 'Ayşe', 'YÜZBAŞIOĞLU', '05541897463', 'yüzbasiiayse@gmail.com', '', '1993-05-19', 0),
(37, 'Enes', 'ŞEN', '05563789412', 'enesen@gmail.com', '', '1998-03-30', 0),
(38, 'Şerife', 'ÇEVİK', '05551871811', 'serifeceviik@gmail.com', '', '1994-12-12', 0),
(39, 'Furkan', 'ERKURAN', '05312478965', 'furkaan@gmail.com', '', '1995-11-23', 0),
(40, 'Murat Can', 'Şahin', '05533157035', 'muratcana26@gmail.com', 'Ferhatpaşa Mahallesi Akdeniz Caddesi G71 Sokak No:18 Daire:4 Ataşehir/İstanbul', '2000-10-29', 0),
(41, 'Hatice', 'VURAL', '05388505367', 'vuralhatice@gmail.com', '', '1997-12-21', 0),
(42, 'Emine', 'ERTEKİN', '05538974746', 'eminErtekin@gmail.com', '', '2001-03-21', 20),
(43, 'Hülya', 'YAVUZ', '05303085171', 'hulyayavuz@gmail.com', '', '1996-10-16', 0),
(44, 'Meryem', 'ERTEKİN', '05444088104', 'ertekinmeryem@gmail.com', '', '1999-04-04', 0),
(45, 'Hasan', 'YÜZBAŞIOĞLU', '05365189118', 'hasanyüzbasii@gmail.com', '', '1997-08-24', 14),
(46, 'Fadime', 'DEDE', '05354766989', 'fadimedede@gmail.com', '', '2002-10-11', 0),
(47, 'Hasan', 'AKBULUT', '053773653355', 'hasakbulut@gmail.com', '', '2002-01-01', 0),
(48, 'Süleyman', 'DEDE', '05522527536', 'dedesuleyman@gmail.com', '', '2002-09-11', 0),
(49, 'Emine', 'ASLAN', '05373764210', 'emineaslaan@gmail.com', '', '2004-11-13', 0),
(50, 'Hacer', 'ERKURAN', '05322552117', 'erkuranhacer@gmail.com', '', '1990-12-19', 0),
(51, 'Huzeyfe', 'Kulfal', '05444088104', 'huzeyfekulfal@gmail.com', '', '2000-02-01', 0),
(52, 'Çiğdem ', 'Başak', '05412987463', 'cigdembasak@gmail.com', 'Feneryolu Mahallesi Fevzi Çakmak Caddesi Atılay Sokak No:27 Daire:5 Kadıköy / İstanbul', '2000-04-12', 0),
(53, 'Emre', 'Deniz', '05529874169', 'emredeniz@gmail.com', 'Yumru Mahallesi Yaprak Caddesi Reşat Sokak No:43 Daire:1 Sultanbeyli  / İstanbul', '1998-04-09', 0),
(54, 'Serpil', 'Turan', '05346987165', 'serpilturan@gmail.com', 'Kadirli Mahallesi Karadeniz Caddesi Helvalı Sokak No:28 Daire:6 Kadıköy / İstanbul', '1996-04-11', 0),
(55, 'Serkan', 'Korkut', '05497813654', 'serkankorkut@gmail.com', '', '1999-12-10', 0);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kitaplar`
--
ALTER TABLE `kitaplar`
  ADD PRIMARY KEY (`kitapNo`);

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`uyeNo`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kitaplar`
--
ALTER TABLE `kitaplar`
  MODIFY `kitapNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `uyeNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
