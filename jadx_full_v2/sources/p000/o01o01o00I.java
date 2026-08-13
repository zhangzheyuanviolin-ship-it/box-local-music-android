            package p000;

            import java.sql.Date;
            import java.sql.Time;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.GregorianCalendar;
            import java.util.List;
            import java.util.TimeZone;
            
            public final class o01o01o00I extends llOl001olOi {
                public static final loIiOOlI0oI1 I0000Il00O = new loIiOOlI0oI1(4);
                public static final loIiOOlI0oI1 I0000O = new loIiOOlI0oI1(5);
                public final int I00000oIO;
                public Object I00000oOI;

                public o01o01o00I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
                    TimeZone timeZone;
                    Date date;
                    Time time;
                    switch (this.I00000oIO) {
                        case 0:
/* 234 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 236 */                       o0iloioo.I00lli11();
/* 6 */                         return null;
                            }
/* 240 */                   String strI00ioIO = o0iloioo.I00ioIO();
                            synchronized (this) {
/* 247 */                       SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.I00000oOI;
/* 249 */                       timeZone = simpleDateFormat.getTimeZone();
                                try {
                                    try {
/* 263 */                               date = new Date(simpleDateFormat.parse(strI00ioIO).getTime());
/* 270 */                               ((SimpleDateFormat) this.I00000oOI).setTimeZone(timeZone);
                                    } finally {
                                    }
                                } catch (ParseException e) {
/* 285 */                           String strI00100l0 = o0iloioo.I00100l0(true);
/* 306 */                           StringBuilder sb = new StringBuilder(String.valueOf(strI00ioIO).length() + 39 + strI00100l0.length());
/* 309 */                           sb.append("Failed parsing '");
/* 312 */                           sb.append(strI00ioIO);
/* 315 */                           sb.append("' as SQL Date; at path ");
/* 318 */                           sb.append(strI00100l0);
/* 328 */                           throw new llO11IolIO(sb.toString(), e, 25);
                                }
                            }
/* 274 */                   return date;
                        case 1:
/* 121 */                   if (o0iloioo.I00ooIo0() == 9) {
/* 123 */                       o0iloioo.I00lli11();
/* 6 */                         return null;
                            }
/* 127 */                   String strI00ioIO2 = o0iloioo.I00ioIO();
                            synchronized (this) {
/* 134 */                       SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) this.I00000oOI;
/* 136 */                       timeZone = simpleDateFormat2.getTimeZone();
                                try {
                                    try {
/* 150 */                               time = new Time(simpleDateFormat2.parse(strI00ioIO2).getTime());
/* 157 */                               ((SimpleDateFormat) this.I00000oOI).setTimeZone(timeZone);
                                    } finally {
                                    }
                                } catch (ParseException e2) {
/* 172 */                           String strI00100l02 = o0iloioo.I00100l0(true);
/* 193 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(strI00ioIO2).length() + 39 + strI00100l02.length());
/* 196 */                           sb2.append("Failed parsing '");
/* 199 */                           sb2.append(strI00ioIO2);
/* 202 */                           sb2.append("' as SQL Time; at path ");
/* 205 */                           sb2.append(strI00100l02);
/* 215 */                           throw new llO11IolIO(sb2.toString(), e2, 25);
                                }
                            }
/* 161 */                   return time;
                        default:
/* 16 */                    if (o0iloioo.I00ooIo0() == 9) {
/* 18 */                        o0iloioo.I00lli11();
/* 6 */                         return null;
                            }
/* 22 */                    o0iloioo.I00OIl();
/* 27 */                    List list = (List) this.I00000oOI;
/* 33 */                    long[] jArr = new long[list.size()];
/* 40 */                    while (o0iloioo.I00ooIo0() != 4) {
/* 46 */                        int iIndexOf = list.indexOf(o0iloioo.I00iiI());
/* 50 */                        if (iIndexOf >= 0) {
/* 56 */                            jArr[iIndexOf] = o0iloioo.I00o0iI0io1();
                                } else {
/* 59 */                            o0iloioo.I00oliIiO01i();
                                }
                            }
/* 63 */                    o0iloioo.I00OOll1();
/* 108 */                   return new GregorianCalendar(o01IIliilo.I00000oIO(jArr[0]), o01IIliilo.I00000oIO(jArr[1]), o01IIliilo.I00000oIO(jArr[2]), o01IIliilo.I00000oIO(jArr[3]), o01IIliilo.I00000oIO(jArr[4]), o01IIliilo.I00000oIO(jArr[5]));
                    }
                }
            }
