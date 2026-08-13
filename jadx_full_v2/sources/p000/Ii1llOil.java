            package p000;

            import java.io.IOException;
            import java.text.DateFormat;
            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.TimeZone;
            
            public final class Ii1llOil extends OoO00O1IiOl {
                public static final Ii1liilIOl I0000Il00O = new Ii1liilIOl();
                public Ii1ll01O1i I00000oIO;
                public ArrayList I00000oOI;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    Date dateI00000oOI;
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            String strI00lli11 = o01loll1loll.I00lli11();
                    synchronized (this.I00000oOI) {
                        try {
/* 23 */                    Iterator it = this.I00000oOI.iterator();
                            while (true) {
/* 31 */                        if (!it.hasNext()) {
                                    try {
/* 70 */                                dateI00000oOI = IoOll01o.I00000oOI(strI00lli11, new ParsePosition(0));
                                        break;
                                    } catch (ParseException e) {
/* 88 */                                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Failed parsing '", strI00lli11, "' as Date; at path ");
/* 97 */                                sbI001IIilI0O.append(o01loll1loll.I001l0I00(true));
/* 107 */                               throw new O01Oo001(sbI001IIilI0O.toString(), e);
                                    }
                                }
/* 37 */                        DateFormat dateFormat = (DateFormat) it.next();
/* 39 */                        TimeZone timeZone = dateFormat.getTimeZone();
                                try {
                                    try {
/* 43 */                                dateI00000oOI = dateFormat.parse(strI00lli11);
                                        break;
                                    } finally {
/* 55 */                                dateFormat.setTimeZone(timeZone);
                                    }
                                } catch (ParseException unused) {
/* 59 */                            dateFormat.setTimeZone(timeZone);
                                }
                            }
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
/* 76 */            return this.I00000oIO.I00000oIO(dateI00000oOI);
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    String str;
/* 1 */             Date date = (Date) obj;
/* 3 */             if (date == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
/* 8 */                 return;
                    }
/* 16 */            DateFormat dateFormat = (DateFormat) this.I00000oOI.get(0);
                    synchronized (this.I00000oOI) {
/* 21 */                str = dateFormat.format(date);
                    }
/* 26 */            o01ooi1IIiiO.I00Ol00(str);
                }

                public final String toString() {
/* 8 */             DateFormat dateFormat = (DateFormat) this.I00000oOI.get(0);
/* 16 */            if (dateFormat instanceof SimpleDateFormat) {
/* 35 */                return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                    }
/* 59 */            return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
                }
            }
