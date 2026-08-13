            package p000;

            import java.io.IOException;
            import java.sql.Time;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.TimeZone;
            
/* 12 */    public final class OlIOlOiioI extends OoO00O1IiOl {
                public static final I00000oIO I00000oOI = new I00000oIO();
                public final SimpleDateFormat I00000oIO;

                public class I00000oIO implements OoO00iO0OOl0 {
                    @Override
                    public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 5 */                 if (ooOilO.I00000oIO == Time.class) {
/* 10 */                    return new OlIOlOiioI(0);
                        }
/* 14 */                return null;
                    }
                }

                private OlIOlOiioI() {
/* 11 */            this.I00000oIO = new SimpleDateFormat("hh:mm:ss a");
                }

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
                    Time time;
/* 9 */             if (o01loll1loll.peek() == 9) {
/* 11 */                o01loll1loll.I00ioIO();
/* 14 */                return null;
                    }
/* 16 */            String strI00lli11 = o01loll1loll.I00lli11();
                    synchronized (this) {
/* 23 */                TimeZone timeZone = this.I00000oIO.getTimeZone();
                        try {
                            try {
/* 39 */                        time = new Time(this.I00000oIO.parse(strI00lli11).getTime());
                            } catch (ParseException e) {
/* 84 */                        throw new O01Oo001("Failed parsing '" + strI00lli11 + "' as SQL Time; at path " + o01loll1loll.I001l0I00(true), e);
                            }
                        } finally {
/* 87 */                    this.I00000oIO.setTimeZone(timeZone);
                        }
                    }
/* 48 */            return time;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
                    String str;
/* 1 */             Time time = (Time) obj;
/* 3 */             if (time == null) {
/* 5 */                 o01ooi1IIiiO.I00IOO();
/* 8 */                 return;
                    }
                    synchronized (this) {
/* 12 */                str = this.I00000oIO.format((Date) time);
                    }
/* 17 */            o01ooi1IIiiO.I00Ol00(str);
                }

/* 13 */        public OlIOlOiioI(int i) {
/* 14 */            this();
                }
            }
