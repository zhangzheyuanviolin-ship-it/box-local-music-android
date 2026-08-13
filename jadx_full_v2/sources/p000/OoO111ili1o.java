            package p000;

            import java.io.IOException;
            import java.util.Locale;
            import java.util.StringTokenizer;
            
            public class OoO111ili1o extends OoO00O1IiOl {
                @Override
                public final Object I00000oOI(O01loll1loll o01loll1loll) throws IOException {
/* 8 */             if (o01loll1loll.peek() == 9) {
/* 10 */                o01loll1loll.I00ioIO();
/* 7 */                 return null;
                    }
/* 22 */            StringTokenizer stringTokenizer = new StringTokenizer(o01loll1loll.I00lli11(), "_");
/* 36 */            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 48 */            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 55 */            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
                }

                @Override
                public final void I0000Il00O(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IOException {
/* 1 */             Locale locale = (Locale) obj;
/* 11 */            o01ooi1IIiiO.I00Ol00(locale == null ? null : locale.toString());
                }
            }
