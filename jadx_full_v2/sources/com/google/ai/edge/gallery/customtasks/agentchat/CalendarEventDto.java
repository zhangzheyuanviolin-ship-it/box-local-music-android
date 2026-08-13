            package com.google.ai.edge.gallery.customtasks.agentchat;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.O01III;
            import p000.Oi010OO0;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/CalendarEventDto;", "", "title", "", "description", "begin_time", "end_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getBegin_time", "getEnd_time", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class CalendarEventDto {
                public static final int $stable = 0;
                private final String begin_time;
                private final String description;
                private final String end_time;
                private final String title;

                public CalendarEventDto(String str, String str2, String str3, String str4) {
/* 4 */             this.title = str;
/* 6 */             this.description = str2;
/* 8 */             this.begin_time = str3;
/* 10 */            this.end_time = str4;
                }

                public static CalendarEventDto copy$default(CalendarEventDto calendarEventDto, String str, String str2, String str3, String str4, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = calendarEventDto.title;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = calendarEventDto.description;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = calendarEventDto.begin_time;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = calendarEventDto.end_time;
                    }
/* 25 */            return calendarEventDto.copy(str, str2, str3, str4);
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final String getBegin_time() {
/* 1 */             return this.begin_time;
                }

                public final String getEnd_time() {
/* 1 */             return this.end_time;
                }

                public final CalendarEventDto copy(String title, String description, String begin_time, String end_time) {
/* 3 */             return new CalendarEventDto(title, description, begin_time, end_time);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof CalendarEventDto)) {
/* 7 */                 return false;
                    }
/* 11 */            CalendarEventDto calendarEventDto = (CalendarEventDto) other;
                    return O0000Ioio00.I0000O(this.title, calendarEventDto.title) && O0000Ioio00.I0000O(this.description, calendarEventDto.description) && O0000Ioio00.I0000O(this.begin_time, calendarEventDto.begin_time) && O0000Ioio00.I0000O(this.end_time, calendarEventDto.end_time);
                }

                public final String getBegin_time() {
/* 1 */             return this.begin_time;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final String getEnd_time() {
/* 1 */             return this.end_time;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public int hashCode() {
/* 28 */            return this.end_time.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.title.hashCode() * 31, 31, this.description), 31, this.begin_time);
                }

                public String toString() {
/* 1 */             String str = this.title;
/* 3 */             String str2 = this.description;
/* 23 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("CalendarEventDto(title=", str, ", description=", str2, ", begin_time="), this.begin_time, ", end_time=", this.end_time, ")");
                }
            }
