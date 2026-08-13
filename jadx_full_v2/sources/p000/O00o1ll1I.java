            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.time.Instant;
            import java.time.LocalDate;
            import java.time.LocalDateTime;
            import java.time.LocalTime;
            import java.time.MonthDay;
            import java.time.OffsetDateTime;
            import java.time.OffsetTime;
            import java.time.Period;
            import java.time.Year;
            import java.time.YearMonth;
            import java.time.ZoneId;
            import java.time.ZoneOffset;
            import java.time.ZonedDateTime;
            
            final class O00o1ll1I implements OoO1oO {
                public static final O00o1O0I01II I00000oIO = new O00o1O0I01II(2, new String[]{"seconds", "nanos"});
                public static final O00o1O0I01II I00000oOI = new O00o1O0I01II(3, new String[]{"seconds", "nanos"});
                public static final O00o1O0I01II I0000Il00O = new O00o1O0I01II(4, new String[]{"year", "month", "day"});
                public static final O00o1O0I01II I0000O = new O00o1O0I01II(5, new String[]{"hour", "minute", "second", "nano"});
                public static final O00o1O0I01II I0000oI00 = new O00o1O0I01II(6, new String[]{"month", "day"});
                public static final O00o1O0I01II I0001Ioi1lo = new O00o1O0I01II(7, new String[]{"years", "months", "days"});
                public static final O00o1O0I01II I000II = new O00o1O0I01II(0, new String[]{"year"});
                public static final O00o1O0I01II I000O01llI0 = new O00o1O0I01II(1, new String[]{"year", "month"});
                public static final OoIooiOoi0i I000OOo1O = new I00000oIO().I00000oIO();
                public static final I00000oOI I000OiO = new I00000oOI();

                public class I00000oIO extends OoO00O1IiOl {
                    @Override
                    public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 1 */                 o01loll1loll.I0000Il00O();
/* 4 */                 String strI00lli11 = null;
/* 5 */                 Integer numValueOf = null;
/* 11 */                while (o01loll1loll.peek() != 4) {
/* 13 */                    String strI00iOIl = o01loll1loll.I00iOIl();
/* 23 */                    if (strI00iOIl.equals("totalSeconds")) {
/* 46 */                        numValueOf = Integer.valueOf(o01loll1loll.I00OOll1());
                            } else if (strI00iOIl.equals("id")) {
/* 37 */                        strI00lli11 = o01loll1loll.I00lli11();
                            } else {
/* 33 */                        o01loll1loll.I00oooO();
                            }
                        }
/* 51 */                o01loll1loll.I00100l0();
/* 54 */                if (strI00lli11 != null) {
/* 56 */                    return ZoneId.of(strI00lli11);
                        }
/* 61 */                if (numValueOf != null) {
/* 67 */                    return ZoneOffset.ofTotalSeconds(numValueOf.intValue());
                        }
/* 186 */               throw new O01Oo001("Missing id or totalSeconds field; at path ".concat(o01loll1loll.I001l0I00(true)));
                    }

                    @Override
                    public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */                 ZoneId zoneId = (ZoneId) obj;
/* 5 */                 if (zoneId instanceof ZoneOffset) {
/* 7 */                     o01ooi1IIiiO.I000II();
/* 12 */                    o01ooi1IIiiO.I001i1lo1io("totalSeconds");
/* 22 */                    o01ooi1IIiiO.I00OIl(((ZoneOffset) zoneId).getTotalSeconds());
/* 25 */                    o01ooi1IIiiO.I00100l0();
/* 28 */                    return;
                        }
/* 29 */                o01ooi1IIiiO.I000II();
/* 34 */                o01ooi1IIiiO.I001i1lo1io("id");
/* 41 */                o01ooi1IIiiO.I00Ol00(zoneId.getId());
/* 44 */                o01ooi1IIiiO.I00100l0();
                    }
                }

                public class I00000oOI implements OoO00iO0OOl0 {
                    @Override
                    public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 1 */                 Class cls = ooOilO.I00000oIO;
/* 13 */                if (!cls.getName().startsWith("java.time.")) {
/* 216 */                   return null;
                        }
/* 19 */                if (cls == Duration.class) {
/* 21 */                    return O00o1ll1I.I00000oIO;
                        }
/* 26 */                if (cls == Instant.class) {
/* 28 */                    return O00o1ll1I.I00000oOI;
                        }
/* 33 */                if (cls == LocalDate.class) {
/* 35 */                    return O00o1ll1I.I0000Il00O;
                        }
/* 40 */                if (cls == LocalTime.class) {
/* 42 */                    return O00o1ll1I.I0000O;
                        }
/* 47 */                if (cls == LocalDateTime.class) {
/* 49 */                    return O00o1ll1I.I00000oOI(ooIlIoo1oiOo);
                        }
/* 56 */                if (cls == MonthDay.class) {
/* 58 */                    return O00o1ll1I.I0000oI00;
                        }
/* 66 */                if (cls == OffsetDateTime.class) {
/* 68 */                    OoIooiOoi0i ooIooiOoi0iI00000oOI = O00o1ll1I.I00000oOI(ooIlIoo1oiOo);
/* 77 */                    OoO00O1IiOl ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(new OoOilO(ZoneOffset.class));
/* 83 */                    O00oI0iiI1 o00oI0iiI1 = new O00oI0iiI1(0);
/* 86 */                    o00oI0iiI1.I00000oOI = ooIooiOoi0iI00000oOI;
/* 88 */                    o00oI0iiI1.I0000Il00O = ooO00O1IiOlI0000O;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    return o00oI0iiI1.I00000oIO();
                        }
/* 100 */               if (cls == OffsetTime.class) {
/* 102 */                   O00o1O0I01II o00o1O0I01II = O00o1ll1I.I00000oIO;
/* 104 */                   ooIlIoo1oiOo.getClass();
/* 112 */                   OoO00O1IiOl ooO00O1IiOlI0000O2 = ooIlIoo1oiOo.I0000O(new OoOilO(LocalTime.class));
/* 121 */                   OoO00O1IiOl ooO00O1IiOlI0000O3 = ooIlIoo1oiOo.I0000O(new OoOilO(ZoneOffset.class));
/* 128 */                   O00oI0OO o00oI0OO = new O00oI0OO(1);
/* 131 */                   o00oI0OO.I00000oOI = ooO00O1IiOlI0000O2;
/* 133 */                   o00oI0OO.I0000Il00O = ooO00O1IiOlI0000O3;
/* 135 */                   VarHandle.storeStoreFence();
/* 138 */                   return o00oI0OO.I00000oIO();
                        }
/* 145 */               if (cls == Period.class) {
/* 147 */                   return O00o1ll1I.I0001Ioi1lo;
                        }
/* 152 */               if (cls == Year.class) {
/* 154 */                   return O00o1ll1I.I000II;
                        }
/* 159 */               if (cls == YearMonth.class) {
/* 161 */                   return O00o1ll1I.I000O01llI0;
                        }
/* 166 */               if (cls == ZoneId.class || cls == ZoneOffset.class) {
/* 218 */                   return O00o1ll1I.I000OOo1O;
                        }
/* 173 */               if (cls != ZonedDateTime.class) {
/* 216 */                   return null;
                        }
/* 175 */               OoIooiOoi0i ooIooiOoi0iI00000oOI2 = O00o1ll1I.I00000oOI(ooIlIoo1oiOo);
/* 184 */               OoO00O1IiOl ooO00O1IiOlI0000O4 = ooIlIoo1oiOo.I0000O(new OoOilO(ZoneOffset.class));
/* 193 */               OoO00O1IiOl ooO00O1IiOlI0000O5 = ooIlIoo1oiOo.I0000O(new OoOilO(ZoneId.class));
/* 199 */               O00o1oIoiO o00o1oIoiO = new O00o1oIoiO(0);
/* 202 */               o00o1oIoiO.I00000oOI = ooIooiOoi0iI00000oOI2;
/* 204 */               o00o1oIoiO.I0000Il00O = ooO00O1IiOlI0000O4;
/* 206 */               o00o1oIoiO.I0000O = ooO00O1IiOlI0000O5;
/* 208 */               VarHandle.storeStoreFence();
/* 211 */               return o00o1oIoiO.I00000oIO();
                    }
                }

                public static void I00000oIO(Serializable serializable, String str, O01loll1loll o01loll1loll) {
/* 1 */             if (serializable != null) {
/* 3 */                 return;
                    }
/* 10 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Missing ", str, " field; at path ");
/* 19 */            sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 215 */           throw new O01Oo001(sbI001IIilI0O.toString());
                }

                public static OoIooiOoi0i I00000oOI(OoIlIoo1oiOo ooIlIoo1oiOo) {
/* 1 */             ooIlIoo1oiOo.getClass();
/* 11 */            OoO00O1IiOl ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(new OoOilO(LocalDate.class));
/* 22 */            OoO00O1IiOl ooO00O1IiOlI0000O2 = ooIlIoo1oiOo.I0000O(new OoOilO(LocalTime.class));
/* 29 */            O00oI0OO o00oI0OO = new O00oI0OO(0);
/* 32 */            o00oI0OO.I00000oOI = ooO00O1IiOlI0000O;
/* 34 */            o00oI0OO.I0000Il00O = ooO00O1IiOlI0000O2;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            return o00oI0OO.I00000oIO();
                }
            }
