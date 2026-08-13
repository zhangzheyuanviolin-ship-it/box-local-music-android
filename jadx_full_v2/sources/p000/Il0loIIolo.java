            package p000;

            import java.io.IOException;
            import java.util.HashMap;
            
            public final class Il0loIIolo extends OoO00O1IiOl {
                public static final Il0lo10Ii I0000O = new Il0lo10Ii();
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;

                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 7 */             if (o01loll1loll.peek() == 9) {
/* 9 */                 o01loll1loll.I00ioIO();
/* 12 */                return null;
                    }
/* 14 */            String strI00lli11 = o01loll1loll.I00lli11();
/* 24 */            Enum r0 = (Enum) this.I00000oIO.get(strI00lli11);
                    return r0 == null ? (Enum) this.I00000oOI.get(strI00lli11) : r0;
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             Enum r2 = (Enum) obj;
/* 15 */            o01ooi1IIiiO.I00Ol00(r2 == null ? null : (String) this.I0000Il00O.get(r2));
                }
            }
