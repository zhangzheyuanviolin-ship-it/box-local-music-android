            package com.google.mlkit.vision.barcode.common;

            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.util.Arrays;
            import java.util.List;
            import p000.lII0I0I000I;
            
/* 34 */    public class Barcode {
                public static final int FORMAT_ALL_FORMATS = 0;
                public static final int FORMAT_AZTEC = 4096;
                public static final int FORMAT_CODABAR = 8;
                public static final int FORMAT_CODE_128 = 1;
                public static final int FORMAT_CODE_39 = 2;
                public static final int FORMAT_CODE_93 = 4;
                public static final int FORMAT_DATA_MATRIX = 16;
                public static final int FORMAT_EAN_13 = 32;
                public static final int FORMAT_EAN_8 = 64;
                public static final int FORMAT_ITF = 128;
                public static final int FORMAT_PDF417 = 2048;
                public static final int FORMAT_QR_CODE = 256;
                public static final int FORMAT_UNKNOWN = -1;
                public static final int FORMAT_UPC_A = 512;
                public static final int FORMAT_UPC_E = 1024;
                public static final int TYPE_CALENDAR_EVENT = 11;
                public static final int TYPE_CONTACT_INFO = 1;
                public static final int TYPE_DRIVER_LICENSE = 12;
                public static final int TYPE_EMAIL = 2;
                public static final int TYPE_GEO = 10;
                public static final int TYPE_ISBN = 3;
                public static final int TYPE_PHONE = 4;
                public static final int TYPE_PRODUCT = 5;
                public static final int TYPE_SMS = 6;
                public static final int TYPE_TEXT = 7;
                public static final int TYPE_UNKNOWN = 0;
                public static final int TYPE_URL = 8;
                public static final int TYPE_WIFI = 9;
                private final BarcodeSource zza;
                private final Rect zzb;
                private final Point[] zzc;

                public static class Address {
                    public static final int TYPE_HOME = 2;
                    public static final int TYPE_UNKNOWN = 0;
                    public static final int TYPE_WORK = 1;
                    private final int zza;
                    private final String[] zzb;

                    @Retention(RetentionPolicy.CLASS)
                    public @interface AddressType {
                    }

                    public Address(int i, String[] strArr) {
/* 4 */                 this.zza = i;
/* 6 */                 this.zzb = strArr;
                    }

                    public String[] getAddressLines() {
/* 1 */                 return this.zzb;
                    }

                    public int getType() {
/* 1 */                 return this.zza;
                    }
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface BarcodeFormat {
                }

                @Retention(RetentionPolicy.CLASS)
                public @interface BarcodeValueType {
                }

                public static class CalendarDateTime {
                    private final int zza;
                    private final int zzb;
                    private final int zzc;
                    private final int zzd;
                    private final int zze;
                    private final int zzf;
                    private final boolean zzg;
                    private final String zzh;

                    public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
/* 4 */                 this.zza = i;
/* 6 */                 this.zzb = i2;
/* 8 */                 this.zzc = i3;
/* 10 */                this.zzd = i4;
/* 12 */                this.zze = i5;
/* 14 */                this.zzf = i6;
/* 16 */                this.zzg = z;
/* 18 */                this.zzh = str;
                    }

                    public int getDay() {
/* 1 */                 return this.zzc;
                    }

                    public int getHours() {
/* 1 */                 return this.zzd;
                    }

                    public int getMinutes() {
/* 1 */                 return this.zze;
                    }

                    public int getMonth() {
/* 1 */                 return this.zzb;
                    }

                    public String getRawValue() {
/* 1 */                 return this.zzh;
                    }

                    public int getSeconds() {
/* 1 */                 return this.zzf;
                    }

                    public int getYear() {
/* 1 */                 return this.zza;
                    }

                    public boolean isUtc() {
/* 1 */                 return this.zzg;
                    }
                }

                public static class CalendarEvent {
                    private final String zza;
                    private final String zzb;
                    private final String zzc;
                    private final String zzd;
                    private final String zze;
                    private final CalendarDateTime zzf;
                    private final CalendarDateTime zzg;

                    public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
/* 8 */                 this.zzc = str3;
/* 10 */                this.zzd = str4;
/* 12 */                this.zze = str5;
/* 14 */                this.zzf = calendarDateTime;
/* 16 */                this.zzg = calendarDateTime2;
                    }

                    public String getDescription() {
/* 1 */                 return this.zzb;
                    }

                    public CalendarDateTime getEnd() {
/* 1 */                 return this.zzg;
                    }

                    public String getLocation() {
/* 1 */                 return this.zzc;
                    }

                    public String getOrganizer() {
/* 1 */                 return this.zzd;
                    }

                    public CalendarDateTime getStart() {
/* 1 */                 return this.zzf;
                    }

                    public String getStatus() {
/* 1 */                 return this.zze;
                    }

                    public String getSummary() {
/* 1 */                 return this.zza;
                    }
                }

                public static class ContactInfo {
                    private final PersonName zza;
                    private final String zzb;
                    private final String zzc;
                    private final List zzd;
                    private final List zze;
                    private final List zzf;
                    private final List zzg;

                    public ContactInfo(PersonName personName, String str, String str2, List<Phone> list, List<Email> list2, List<String> list3, List<Address> list4) {
/* 4 */                 this.zza = personName;
/* 6 */                 this.zzb = str;
/* 8 */                 this.zzc = str2;
/* 10 */                this.zzd = list;
/* 12 */                this.zze = list2;
/* 14 */                this.zzf = list3;
/* 16 */                this.zzg = list4;
                    }

                    public List<Address> getAddresses() {
/* 1 */                 return this.zzg;
                    }

                    public List<Email> getEmails() {
/* 1 */                 return this.zze;
                    }

                    public PersonName getName() {
/* 1 */                 return this.zza;
                    }

                    public String getOrganization() {
/* 1 */                 return this.zzb;
                    }

                    public List<Phone> getPhones() {
/* 1 */                 return this.zzd;
                    }

                    public String getTitle() {
/* 1 */                 return this.zzc;
                    }

                    public List<String> getUrls() {
/* 1 */                 return this.zzf;
                    }
                }

                public static class DriverLicense {
                    private final String zza;
                    private final String zzb;
                    private final String zzc;
                    private final String zzd;
                    private final String zze;
                    private final String zzf;
                    private final String zzg;
                    private final String zzh;
                    private final String zzi;
                    private final String zzj;
                    private final String zzk;
                    private final String zzl;
                    private final String zzm;
                    private final String zzn;

                    public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
/* 8 */                 this.zzc = str3;
/* 10 */                this.zzd = str4;
/* 12 */                this.zze = str5;
/* 14 */                this.zzf = str6;
/* 16 */                this.zzg = str7;
/* 18 */                this.zzh = str8;
/* 20 */                this.zzi = str9;
/* 22 */                this.zzj = str10;
/* 24 */                this.zzk = str11;
/* 26 */                this.zzl = str12;
/* 28 */                this.zzm = str13;
/* 30 */                this.zzn = str14;
                    }

                    public String getAddressCity() {
/* 1 */                 return this.zzg;
                    }

                    public String getAddressState() {
/* 1 */                 return this.zzh;
                    }

                    public String getAddressStreet() {
/* 1 */                 return this.zzf;
                    }

                    public String getAddressZip() {
/* 1 */                 return this.zzi;
                    }

                    public String getBirthDate() {
/* 1 */                 return this.zzm;
                    }

                    public String getDocumentType() {
/* 1 */                 return this.zza;
                    }

                    public String getExpiryDate() {
/* 1 */                 return this.zzl;
                    }

                    public String getFirstName() {
/* 1 */                 return this.zzb;
                    }

                    public String getGender() {
/* 1 */                 return this.zze;
                    }

                    public String getIssueDate() {
/* 1 */                 return this.zzk;
                    }

                    public String getIssuingCountry() {
/* 1 */                 return this.zzn;
                    }

                    public String getLastName() {
/* 1 */                 return this.zzd;
                    }

                    public String getLicenseNumber() {
/* 1 */                 return this.zzj;
                    }

                    public String getMiddleName() {
/* 1 */                 return this.zzc;
                    }
                }

                public static class Email {
                    public static final int TYPE_HOME = 2;
                    public static final int TYPE_UNKNOWN = 0;
                    public static final int TYPE_WORK = 1;
                    private final int zza;
                    private final String zzb;
                    private final String zzc;
                    private final String zzd;

                    @Retention(RetentionPolicy.CLASS)
                    public @interface FormatType {
                    }

                    public Email(int i, String str, String str2, String str3) {
/* 4 */                 this.zza = i;
/* 6 */                 this.zzb = str;
/* 8 */                 this.zzc = str2;
/* 10 */                this.zzd = str3;
                    }

                    public String getAddress() {
/* 1 */                 return this.zzb;
                    }

                    public String getBody() {
/* 1 */                 return this.zzd;
                    }

                    public String getSubject() {
/* 1 */                 return this.zzc;
                    }

                    public int getType() {
/* 1 */                 return this.zza;
                    }
                }

                public static class GeoPoint {
                    private final double zza;
                    private final double zzb;

                    public GeoPoint(double d, double d2) {
/* 4 */                 this.zza = d;
/* 6 */                 this.zzb = d2;
                    }

                    public double getLat() {
/* 1 */                 return this.zza;
                    }

                    public double getLng() {
/* 1 */                 return this.zzb;
                    }
                }

                public static class PersonName {
                    private final String zza;
                    private final String zzb;
                    private final String zzc;
                    private final String zzd;
                    private final String zze;
                    private final String zzf;
                    private final String zzg;

                    public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
/* 8 */                 this.zzc = str3;
/* 10 */                this.zzd = str4;
/* 12 */                this.zze = str5;
/* 14 */                this.zzf = str6;
/* 16 */                this.zzg = str7;
                    }

                    public String getFirst() {
/* 1 */                 return this.zzd;
                    }

                    public String getFormattedName() {
/* 1 */                 return this.zza;
                    }

                    public String getLast() {
/* 1 */                 return this.zzf;
                    }

                    public String getMiddle() {
/* 1 */                 return this.zze;
                    }

                    public String getPrefix() {
/* 1 */                 return this.zzc;
                    }

                    public String getPronunciation() {
/* 1 */                 return this.zzb;
                    }

                    public String getSuffix() {
/* 1 */                 return this.zzg;
                    }
                }

                public static class Phone {
                    public static final int TYPE_FAX = 3;
                    public static final int TYPE_HOME = 2;
                    public static final int TYPE_MOBILE = 4;
                    public static final int TYPE_UNKNOWN = 0;
                    public static final int TYPE_WORK = 1;
                    private final String zza;
                    private final int zzb;

                    @Retention(RetentionPolicy.CLASS)
                    public @interface FormatType {
                    }

                    public Phone(String str, int i) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = i;
                    }

                    public String getNumber() {
/* 1 */                 return this.zza;
                    }

                    public int getType() {
/* 1 */                 return this.zzb;
                    }
                }

                public static class Sms {
                    private final String zza;
                    private final String zzb;

                    public Sms(String str, String str2) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
                    }

                    public String getMessage() {
/* 1 */                 return this.zza;
                    }

                    public String getPhoneNumber() {
/* 1 */                 return this.zzb;
                    }
                }

                public static class UrlBookmark {
                    private final String zza;
                    private final String zzb;

                    public UrlBookmark(String str, String str2) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
                    }

                    public String getTitle() {
/* 1 */                 return this.zza;
                    }

                    public String getUrl() {
/* 1 */                 return this.zzb;
                    }
                }

                public static class WiFi {
                    public static final int TYPE_OPEN = 1;
                    public static final int TYPE_WEP = 3;
                    public static final int TYPE_WPA = 2;
                    private final String zza;
                    private final String zzb;
                    private final int zzc;

                    @Retention(RetentionPolicy.CLASS)
                    public @interface EncryptionType {
                    }

                    public WiFi(String str, String str2, int i) {
/* 4 */                 this.zza = str;
/* 6 */                 this.zzb = str2;
/* 8 */                 this.zzc = i;
                    }

                    public int getEncryptionType() {
/* 1 */                 return this.zzc;
                    }

                    public String getPassword() {
/* 1 */                 return this.zzb;
                    }

                    public String getSsid() {
/* 1 */                 return this.zza;
                    }
                }

                public Barcode(BarcodeSource barcodeSource, Matrix matrix) {
/* 4 */             lII0I0I000I.I000II(barcodeSource);
/* 7 */             this.zza = barcodeSource;
/* 9 */             Rect boundingBox = barcodeSource.getBoundingBox();
/* 13 */            if (boundingBox != null && matrix != null) {
/* 17 */                CommonConvertUtils.transformRect(boundingBox, matrix);
                    }
/* 20 */            this.zzb = boundingBox;
/* 22 */            Point[] cornerPoints = barcodeSource.getCornerPoints();
/* 26 */            if (cornerPoints != null && matrix != null) {
/* 30 */                CommonConvertUtils.transformPointArray(cornerPoints, matrix);
                    }
/* 33 */            this.zzc = cornerPoints;
                }

                public Rect getBoundingBox() {
/* 1 */             return this.zzb;
                }

                public CalendarEvent getCalendarEvent() {
/* 3 */             return this.zza.getCalendarEvent();
                }

                public ContactInfo getContactInfo() {
/* 3 */             return this.zza.getContactInfo();
                }

                public Point[] getCornerPoints() {
/* 1 */             return this.zzc;
                }

                public String getDisplayValue() {
/* 3 */             return this.zza.getDisplayValue();
                }

                public DriverLicense getDriverLicense() {
/* 3 */             return this.zza.getDriverLicense();
                }

                public Email getEmail() {
/* 3 */             return this.zza.getEmail();
                }

                public int getFormat() {
/* 3 */             int format = this.zza.getFormat();
/* 10 */            if (format > 4096 || format == 0) {
/* 9 */                 return -1;
                    }
/* 15 */            return format;
                }

                public GeoPoint getGeoPoint() {
/* 3 */             return this.zza.getGeoPoint();
                }

                public Phone getPhone() {
/* 3 */             return this.zza.getPhone();
                }

                public byte[] getRawBytes() {
/* 3 */             byte[] rawBytes = this.zza.getRawBytes();
/* 7 */             if (rawBytes != null) {
/* 10 */                return Arrays.copyOf(rawBytes, rawBytes.length);
                    }
/* 15 */            return null;
                }

                public String getRawValue() {
/* 3 */             return this.zza.getRawValue();
                }

                public Sms getSms() {
/* 3 */             return this.zza.getSms();
                }

                public UrlBookmark getUrl() {
/* 3 */             return this.zza.getUrl();
                }

                public int getValueType() {
/* 3 */             return this.zza.getValueType();
                }

                public WiFi getWifi() {
/* 3 */             return this.zza.getWifi();
                }

/* 35 */        public Barcode(BarcodeSource barcodeSource) {
/* 36 */            this(barcodeSource, null);
                }
            }
