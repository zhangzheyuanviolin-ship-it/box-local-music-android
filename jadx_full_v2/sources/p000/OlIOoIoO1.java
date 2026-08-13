            package p000;

            import java.sql.Timestamp;
            import java.util.Date;
            
            public final class OlIOoIoO1 extends OoO00O1IiOl {
                public static final OlIOo1o I00000oOI = new OlIOo1o();
                public OoO00O1IiOl I00000oIO;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) {
/* 7 */             Date date = (Date) this.I00000oIO.I00000oOI(o01loll1loll);
/* 9 */             if (date != null) {
/* 17 */                return new Timestamp(date.getTime());
                    }
/* 21 */            return null;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) {
/* 5 */             this.I00000oIO.I0000Il00O(o01ooi1IIiiO, (Timestamp) obj);
                }
            }
