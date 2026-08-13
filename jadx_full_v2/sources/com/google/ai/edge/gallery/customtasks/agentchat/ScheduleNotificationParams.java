            package com.google.ai.edge.gallery.customtasks.agentchat;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.O01III;
            import p000.Oi010OO0;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\u008a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\u0006HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/ScheduleNotificationParams;", "", "title", "", "message", "hour", "", "minute", "deeplink", "task_id", "model_name", "year", "month", "day", "repeat_daily", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getHour", "()I", "getMinute", "getDeeplink", "getTask_id", "getModel_name", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMonth", "getDay", "getRepeat_daily", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/google/ai/edge/gallery/customtasks/agentchat/ScheduleNotificationParams;", "equals", "other", "hashCode", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 39 */    public final class ScheduleNotificationParams {
                public static final int $stable = 0;
                private final Integer day;
                private final String deeplink;
                private final int hour;
                private final String message;
                private final int minute;
                private final String model_name;
                private final Integer month;
                private final Boolean repeat_daily;
                private final String task_id;
                private final String title;
                private final Integer year;

                public ScheduleNotificationParams(String str, String str2, int i, int i2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 37 */            this(str, str2, i, i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & Barcode.FORMAT_ITF) != 0 ? null : num, (i3 & Barcode.FORMAT_QR_CODE) != 0 ? null : num2, (i3 & Barcode.FORMAT_UPC_A) != 0 ? null : num3, (i3 & Barcode.FORMAT_UPC_E) != 0 ? null : bool);
                }

                public static ScheduleNotificationParams copy$default(ScheduleNotificationParams scheduleNotificationParams, String str, String str2, int i, int i2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 str = scheduleNotificationParams.title;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                str2 = scheduleNotificationParams.message;
                    }
/* 15 */            if ((i3 & 4) != 0) {
/* 17 */                i = scheduleNotificationParams.hour;
                    }
/* 21 */            if ((i3 & 8) != 0) {
/* 23 */                i2 = scheduleNotificationParams.minute;
                    }
/* 27 */            if ((i3 & 16) != 0) {
/* 29 */                str3 = scheduleNotificationParams.deeplink;
                    }
/* 33 */            if ((i3 & 32) != 0) {
/* 35 */                str4 = scheduleNotificationParams.task_id;
                    }
/* 39 */            if ((i3 & 64) != 0) {
/* 41 */                str5 = scheduleNotificationParams.model_name;
                    }
/* 45 */            if ((i3 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                num = scheduleNotificationParams.year;
                    }
/* 51 */            if ((i3 & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                num2 = scheduleNotificationParams.month;
                    }
/* 57 */            if ((i3 & Barcode.FORMAT_UPC_A) != 0) {
/* 59 */                num3 = scheduleNotificationParams.day;
                    }
/* 63 */            if ((i3 & Barcode.FORMAT_UPC_E) != 0) {
/* 65 */                bool = scheduleNotificationParams.repeat_daily;
                    }
/* 67 */            Integer num4 = num3;
/* 68 */            Boolean bool2 = bool;
/* 69 */            Integer num5 = num;
/* 70 */            Integer num6 = num2;
/* 71 */            String str6 = str4;
/* 72 */            String str7 = str5;
/* 74 */            String str8 = str3;
/* 76 */            int i4 = i;
/* 79 */            return scheduleNotificationParams.copy(str, str2, i4, i2, str8, str6, str7, num5, num6, num4, bool2);
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final Integer getDay() {
/* 1 */             return this.day;
                }

                public final Boolean getRepeat_daily() {
/* 1 */             return this.repeat_daily;
                }

                public final String getMessage() {
/* 1 */             return this.message;
                }

                public final int getHour() {
/* 1 */             return this.hour;
                }

                public final int getMinute() {
/* 1 */             return this.minute;
                }

                public final String getDeeplink() {
/* 1 */             return this.deeplink;
                }

                public final String getTask_id() {
/* 1 */             return this.task_id;
                }

                public final String getModel_name() {
/* 1 */             return this.model_name;
                }

                public final Integer getYear() {
/* 1 */             return this.year;
                }

                public final Integer getMonth() {
/* 1 */             return this.month;
                }

                public final ScheduleNotificationParams copy(String title, String message, int hour, int minute, String deeplink, String task_id, String model_name, Integer year, Integer month, Integer day, Boolean repeat_daily) {
/* 3 */             return new ScheduleNotificationParams(title, message, hour, minute, deeplink, task_id, model_name, year, month, day, repeat_daily);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ScheduleNotificationParams)) {
/* 7 */                 return false;
                    }
/* 11 */            ScheduleNotificationParams scheduleNotificationParams = (ScheduleNotificationParams) other;
                    return O0000Ioio00.I0000O(this.title, scheduleNotificationParams.title) && O0000Ioio00.I0000O(this.message, scheduleNotificationParams.message) && this.hour == scheduleNotificationParams.hour && this.minute == scheduleNotificationParams.minute && O0000Ioio00.I0000O(this.deeplink, scheduleNotificationParams.deeplink) && O0000Ioio00.I0000O(this.task_id, scheduleNotificationParams.task_id) && O0000Ioio00.I0000O(this.model_name, scheduleNotificationParams.model_name) && O0000Ioio00.I0000O(this.year, scheduleNotificationParams.year) && O0000Ioio00.I0000O(this.month, scheduleNotificationParams.month) && O0000Ioio00.I0000O(this.day, scheduleNotificationParams.day) && O0000Ioio00.I0000O(this.repeat_daily, scheduleNotificationParams.repeat_daily);
                }

                public final Integer getDay() {
/* 1 */             return this.day;
                }

                public final String getDeeplink() {
/* 1 */             return this.deeplink;
                }

                public final int getHour() {
/* 1 */             return this.hour;
                }

                public final String getMessage() {
/* 1 */             return this.message;
                }

                public final int getMinute() {
/* 1 */             return this.minute;
                }

                public final String getModel_name() {
/* 1 */             return this.model_name;
                }

                public final Integer getMonth() {
/* 1 */             return this.month;
                }

                public final Boolean getRepeat_daily() {
/* 1 */             return this.repeat_daily;
                }

                public final String getTask_id() {
/* 1 */             return this.task_id;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final Integer getYear() {
/* 1 */             return this.year;
                }

                public int hashCode() {
/* 24 */            int iI0000O = IIl001iO0Io.I0000O(this.minute, IIl001iO0Io.I0000O(this.hour, Oi010OO0.I000O01llI0(this.title.hashCode() * 31, 31, this.message), 31), 31);
/* 28 */            String str = this.deeplink;
/* 40 */            int iHashCode = (iI0000O + (str == null ? 0 : str.hashCode())) * 31;
/* 41 */            String str2 = this.task_id;
/* 52 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 53 */            String str3 = this.model_name;
/* 64 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 65 */            Integer num = this.year;
/* 76 */            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
/* 77 */            Integer num2 = this.month;
/* 88 */            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 89 */            Integer num3 = this.day;
/* 100 */           int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
/* 101 */           Boolean bool = this.repeat_daily;
/* 110 */           return iHashCode6 + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
/* 1 */             String str = this.title;
/* 3 */             String str2 = this.message;
/* 5 */             int i = this.hour;
/* 7 */             int i2 = this.minute;
/* 9 */             String str3 = this.deeplink;
/* 11 */            String str4 = this.task_id;
/* 13 */            String str5 = this.model_name;
/* 15 */            Integer num = this.year;
/* 17 */            Integer num2 = this.month;
/* 19 */            Integer num3 = this.day;
/* 21 */            Boolean bool = this.repeat_daily;
/* 29 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ScheduleNotificationParams(title=", str, ", message=", str2, ", hour=");
/* 33 */            sbI00111O.append(i);
/* 38 */            sbI00111O.append(", minute=");
/* 41 */            sbI00111O.append(i2);
/* 46 */            sbI00111O.append(", deeplink=");
/* 53 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", task_id=", str4, ", model_name=");
/* 56 */            sbI00111O.append(str5);
/* 61 */            sbI00111O.append(", year=");
/* 64 */            sbI00111O.append(num);
/* 69 */            sbI00111O.append(", month=");
/* 72 */            sbI00111O.append(num2);
/* 77 */            sbI00111O.append(", day=");
/* 80 */            sbI00111O.append(num3);
/* 85 */            sbI00111O.append(", repeat_daily=");
/* 88 */            sbI00111O.append(bool);
/* 93 */            sbI00111O.append(")");
/* 96 */            return sbI00111O.toString();
                }

/* 40 */        public ScheduleNotificationParams(String str, String str2, int i, int i2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool) {
/* 42 */            this.title = str;
/* 43 */            this.message = str2;
/* 44 */            this.hour = i;
/* 45 */            this.minute = i2;
/* 46 */            this.deeplink = str3;
/* 47 */            this.task_id = str4;
/* 48 */            this.model_name = str5;
/* 49 */            this.year = num;
/* 50 */            this.month = num2;
/* 51 */            this.day = num3;
/* 52 */            this.repeat_daily = bool;
                }
            }
