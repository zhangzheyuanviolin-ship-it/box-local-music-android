            package p000;

            import java.io.IOException;
            import java.time.Duration;
            import java.time.Instant;
            import java.time.LocalDate;
            import java.time.LocalTime;
            import java.time.MonthDay;
            import java.time.Period;
            import java.time.Year;
            import java.time.YearMonth;
            import java.util.Arrays;
            import java.util.Calendar;
            import java.util.GregorianCalendar;
            import java.util.List;
            
            public final class O00o1O0I01II extends OoO00O1IiOl {
                public final List I00000oIO;
                public final int I00000oOI;

                public O00o1O0I01II(int i, String[] strArr) {
/* 1 */             this.I00000oOI = i;
/* 10 */            this.I00000oIO = Arrays.asList(strArr);
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            o01loll1loll.I0000Il00O();
/* 17 */            List list = this.I00000oIO;
/* 23 */            long[] jArr = new long[list.size()];
/* 30 */            while (o01loll1loll.peek() != 4) {
/* 36 */                int iIndexOf = list.indexOf(o01loll1loll.I00iOIl());
/* 40 */                if (iIndexOf >= 0) {
/* 46 */                    jArr[iIndexOf] = o01loll1loll.I00Ol00();
                        } else {
/* 49 */                    o01loll1loll.I00oooO();
                        }
                    }
/* 53 */            o01loll1loll.I00100l0();
                    switch (this.I00000oOI) {
                        case 0:
/* 243 */                   return Year.of(Math.toIntExact(jArr[0]));
                        case 1:
/* 232 */                   return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                        case 2:
/* 215 */                   return Duration.ofSeconds(jArr[0], jArr[1]);
                        case 3:
/* 206 */                   return Instant.ofEpochSecond(jArr[0], jArr[1]);
                        case 4:
/* 197 */                   return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                        case 5:
/* 174 */                   return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
                        case 6:
/* 145 */                   return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                        case 7:
/* 127 */                   return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                        default:
/* 104 */                   return new GregorianCalendar(OoOI01I0lI0.I0000O(jArr[0]), OoOI01I0lI0.I0000O(jArr[1]), OoOI01I0lI0.I0000O(jArr[2]), OoOI01I0lI0.I0000O(jArr[3]), OoOI01I0lI0.I0000O(jArr[4]), OoOI01I0lI0.I0000O(jArr[5]));
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    int i;
                    long[] jArr;
                    long[] jArr2;
/* 5 */             if (obj == null) {
/* 7 */                 o01ooi1IIiiO.I00IOO();
/* 10 */                return;
                    }
/* 11 */            o01ooi1IIiiO.I000II();
                    switch (this.I00000oOI) {
                        case 0:
/* 289 */                   i = 0;
/* 300 */                   jArr = new long[]{((Year) obj).getValue()};
/* 120 */                   jArr2 = jArr;
                            break;
                        case 1:
/* 265 */                   i = 0;
/* 269 */                   YearMonth yearMonth = (YearMonth) obj;
/* 281 */                   jArr2 = new long[]{yearMonth.getYear(), yearMonth.getMonthValue()};
                            break;
                        case 2:
/* 242 */                   i = 0;
/* 257 */                   jArr2 = new long[]{((Duration) obj).getSeconds(), r2.getNano()};
                            break;
                        case 3:
/* 219 */                   i = 0;
/* 234 */                   jArr2 = new long[]{((Instant) obj).getEpochSecond(), r2.getNano()};
                            break;
                        case 4:
/* 188 */                   i = 0;
/* 192 */                   LocalDate localDate = (LocalDate) obj;
/* 209 */                   jArr = new long[]{localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()};
/* 120 */                   jArr2 = jArr;
                            break;
                        case 5:
/* 149 */                   i = 0;
/* 153 */                   LocalTime localTime = (LocalTime) obj;
/* 175 */                   jArr2 = new long[]{localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano()};
                            break;
                        case 6:
/* 124 */                   i = 0;
/* 128 */                   MonthDay monthDay = (MonthDay) obj;
/* 140 */                   jArr2 = new long[]{monthDay.getMonthValue(), monthDay.getDayOfMonth()};
                            break;
                        case 7:
/* 91 */                    i = 0;
/* 95 */                    Period period = (Period) obj;
/* 112 */                   jArr = new long[]{period.getYears(), period.getMonths(), period.getDays()};
/* 120 */                   jArr2 = jArr;
                            break;
                        default:
/* 25 */                    Calendar calendar = (Calendar) obj;
/* 61 */                    i = 0;
/* 74 */                    jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                            break;
                    }
/* 306 */           int i2 = i;
                    while (true) {
/* 308 */               List list = this.I00000oIO;
/* 314 */               if (i2 >= list.size()) {
/* 333 */                   o01ooi1IIiiO.I00100l0();
/* 336 */                   return;
                        } else {
/* 322 */                   o01ooi1IIiiO.I001i1lo1io((String) list.get(i2));
/* 327 */                   o01ooi1IIiiO.I00OIl(jArr2[i2]);
/* 330 */                   i2++;
                        }
                    }
                }
            }
