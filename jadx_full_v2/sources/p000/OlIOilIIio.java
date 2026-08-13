            package p000;

            import java.io.IOException;
            import java.sql.Date;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.TimeZone;
            
/* 12 */    public final class OlIOilIIio extends OoO00O1IiOl {
                public static final I00000oIO I00000oOI = new I00000oIO();
                public final SimpleDateFormat I00000oIO;

                public class I00000oIO implements OoO00iO0OOl0 {
                    @Override
                    public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 5 */                 if (ooOilO.I00000oIO == Date.class) {
/* 10 */                    return new OlIOilIIio(0);
                        }
/* 14 */                return null;
                    }
                }

                private OlIOilIIio() {
/* 11 */            this.I00000oIO = new SimpleDateFormat("MMM d, yyyy");
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    Date date;
/* 9 */             if (o01loll1loll.peek() == 9) {
/* 11 */                o01loll1loll.I00ioIO();
/* 14 */                return null;
                    }
/* 16 */            String strI00lli11 = o01loll1loll.I00lli11();
                    synchronized (this) {
/* 23 */                TimeZone timeZone = this.I00000oIO.getTimeZone();
                        try {
                            try {
/* 39 */                        date = new Date(this.I00000oIO.parse(strI00lli11).getTime());
                            } catch (ParseException e) {
/* 84 */                        throw new O01Oo001("Failed parsing '" + strI00lli11 + "' as SQL Date; at path " + o01loll1loll.I001l0I00(true), e);
                            }
                        } finally {
/* 87 */                    this.I00000oIO.setTimeZone(timeZone);
                        }
                    }
/* 48 */            return date;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    String str;
/* 1 */             Date date = (Date) obj;
/* 3 */             if (date == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
/* 8 */                 return;
                    }
                    synchronized (this) {
/* 12 */                str = this.I00000oIO.format((java.util.Date) date);
                    }
/* 17 */            o01ooi1IIiiO.I00Ol00(str);
                }

/* 13 */        public OlIOilIIio(int i) {
/* 14 */            this();
                }
            }
