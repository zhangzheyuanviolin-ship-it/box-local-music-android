            package p000;

            import java.io.IOException;
            import java.time.LocalDate;
            import java.time.LocalDateTime;
            import java.time.LocalTime;
            import java.time.OffsetTime;
            import java.time.ZoneOffset;
            
            public final class O00oI0OO extends OoO00O1IiOl {
                public final int I00000oIO;
                public OoO00O1IiOl I00000oOI;
                public OoO00O1IiOl I0000Il00O;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 4 */             LocalDate localDate = null;
/* 4 */             LocalTime localTime = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 74 */                    o01loll1loll.I0000Il00O();
/* 77 */                    LocalTime localTime2 = null;
/* 84 */                    while (o01loll1loll.peek() != 4) {
/* 86 */                        String strI00iOIl = o01loll1loll.I00iOIl();
/* 94 */                        if (strI00iOIl.equals("date")) {
/* 121 */                           localDate = (LocalDate) this.I00000oOI.I00000oOI(o01loll1loll);
                                } else if (strI00iOIl.equals("time")) {
/* 112 */                           localTime2 = (LocalTime) this.I0000Il00O.I00000oOI(o01loll1loll);
                                } else {
/* 102 */                           o01loll1loll.I00oooO();
                                }
                            }
/* 124 */                   o01loll1loll.I00100l0();
/* 127 */                   O00o1ll1I.I00000oIO(localDate, "date", o01loll1loll);
/* 130 */                   O00o1ll1I.I00000oIO(localTime2, "time", o01loll1loll);
/* 133 */                   return LocalDateTime.of(localDate, localTime2);
                        default:
/* 10 */                    o01loll1loll.I0000Il00O();
/* 13 */                    ZoneOffset zoneOffset = null;
/* 20 */                    while (o01loll1loll.peek() != 4) {
/* 22 */                        String strI00iOIl2 = o01loll1loll.I00iOIl();
/* 30 */                        if (strI00iOIl2.equals("offset")) {
/* 57 */                            zoneOffset = (ZoneOffset) this.I0000Il00O.I00000oOI(o01loll1loll);
                                } else if (strI00iOIl2.equals("time")) {
/* 48 */                            localTime = (LocalTime) this.I00000oOI.I00000oOI(o01loll1loll);
                                } else {
/* 38 */                            o01loll1loll.I00oooO();
                                }
                            }
/* 60 */                    o01loll1loll.I00100l0();
/* 63 */                    O00o1ll1I.I00000oIO(localTime, "time", o01loll1loll);
/* 66 */                    O00o1ll1I.I00000oIO(zoneOffset, "offset", o01loll1loll);
/* 69 */                    return OffsetTime.of(localTime, zoneOffset);
                    }
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 43 */                    LocalDateTime localDateTime = (LocalDateTime) obj;
/* 45 */                    o01ooi1IIiiO.I000II();
/* 50 */                    o01ooi1IIiiO.I001i1lo1io("date");
/* 59 */                    this.I00000oOI.I0000Il00O(o01ooi1IIiiO, localDateTime.toLocalDate());
/* 62 */                    o01ooi1IIiiO.I001i1lo1io("time");
/* 71 */                    this.I0000Il00O.I0000Il00O(o01ooi1IIiiO, localDateTime.toLocalTime());
/* 74 */                    o01ooi1IIiiO.I00100l0();
                            break;
                        default:
/* 8 */                     OffsetTime offsetTime = (OffsetTime) obj;
/* 10 */                    o01ooi1IIiiO.I000II();
/* 13 */                    o01ooi1IIiiO.I001i1lo1io("time");
/* 22 */                    this.I00000oOI.I0000Il00O(o01ooi1IIiiO, offsetTime.toLocalTime());
/* 27 */                    o01ooi1IIiiO.I001i1lo1io("offset");
/* 36 */                    this.I0000Il00O.I0000Il00O(o01ooi1IIiiO, offsetTime.getOffset());
/* 39 */                    o01ooi1IIiiO.I00100l0();
                            break;
                    }
                }
            }
