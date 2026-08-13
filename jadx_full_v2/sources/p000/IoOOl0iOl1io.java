            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.security.GeneralSecurityException;
            import java.util.NoSuchElementException;
            
            public final class IoOOl0iOl1io implements Illill0o, Ol01IliO, IIiOOIoi0, OoI0o0oiol0l {
                public final int I00iOIl;

                public IoOOl0iOl1io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static void I00000oOI() {
/* 29 */            throw new NoSuchElementException();
                }

                public static void I0000Il00O(int i, Object obj) {
/* 89 */            throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
                }

                public static void I0000O(Object obj, Object obj2) {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(obj);
/* 11 */            sb.append(obj2);
/* 89 */            throw new IllegalArgumentException(sb.toString());
                }

                public static void I0000oI00(Object obj, String str, Object obj2) {
/* 215 */           throw new O01IiOo11l1o(str + obj + ((Object) " at path ") + obj2);
                }

                public static void I0001Ioi1lo(Object obj, StringBuilder sb) {
/* 1 */             sb.append(obj);
/* 89 */            throw new RuntimeException(sb.toString());
                }

                public static void I000II(String str, double d) {
/* 89 */            throw new IllegalArgumentException(str + d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I000O01llI0(String str, int i, Object obj) {
/* 215 */           throw new IllegalArgumentException((str + obj + ((char) i)).toString());
                }

                public static void I000OOo1O(String str, Object obj) {
/* 89 */            throw new IllegalStateException(str + obj);
                }

                public static void I000OiO(String str, Object obj, Object obj2, Object obj3) throws IOException {
/* 483 */           throw new IOException(str + obj + obj2 + obj3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I000iOII(String str, Object obj, Object obj2, Object obj3, int i) {
/* 966 */           throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
                }

                public static void I000l1(String str, Throwable th) {
/* 89 */            throw new IllegalStateException(str, th);
                }

                public static void I000lI(StringBuilder sb, Object obj, Object obj2) {
/* 1 */             sb.append(obj);
/* 4 */             sb.append(obj2);
/* 215 */           throw new IllegalStateException(sb.toString());
                }

                public static void I000o00OoI0I(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalArgumentException(str + obj + obj2);
                }

                public static void I000oI1ioi(String str, Object obj) {
/* 89 */            throw new O01IiOo11l1o(str + obj);
                }

                public static void I00100l0(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new Ii01OOool(str + obj + obj2 + obj3);
                }

                public static void I00100o1O0lo(StringBuilder sb, Object obj, Object obj2) {
/* 1 */             sb.append(obj);
/* 4 */             sb.append(obj2);
/* 215 */           throw new O01IiOo11l1o(sb.toString());
                }

                public static void I0010I0i(String str, Object obj) {
/* 89 */            throw new IllegalStateException(str + obj);
                }

                public static void I0010o(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new IllegalStateException(str + obj + obj2 + obj3);
                }

                public static void I00111O(StringBuilder sb, Object obj, Object obj2) {
/* 1 */             sb.append(obj);
/* 4 */             sb.append(obj2);
/* 215 */           throw new IllegalArgumentException(sb.toString().toString());
                }

                public static void I001IIilI0O(String str, Object obj) {
/* 89 */            throw new Ii01OOool(str + obj);
                }

                public static void I001IO000(String str, Object obj, Object obj2, Object obj3) {
/* 483 */           throw new IllegalStateException((str + obj + obj2 + obj3).toString());
                }

                public static void I001i1O0Ol(String str, Object obj) throws GeneralSecurityException {
/* 89 */            throw new GeneralSecurityException(str + obj);
                }

                public static void I001i1lo1io(String str, Object obj) {
/* 89 */            throw new AssertionError(str + obj);
                }

                public static void I001iOo1i0O(String str, Object obj) throws O1Ooo1IIioo {
/* 89 */            throw new O1Ooo1IIioo(str + obj);
                }

                public static void I001l0I00(String str, Object obj) {
/* 89 */            throw new IllegalArgumentException(str + obj);
                }

                public static void I001lIiIIo1O(String str, Object obj) {
/* 89 */            throw new IllegalStateException((str + obj).toString());
                }

                @Override
                public boolean I00000oIO() {
/* 1 */             return false;
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 1:
/* 31 */                    return null;
                        default:
/* 6 */                     O1lOll o1lOll = (O1lOll) obj;
/* 8 */                     o1lOll.getClass();
/* 11 */                    OOiI0liIo1ii oOiI0liIo1ii = OOi1I1iiOii.I00000oIO;
/* 13 */                    oOiI0liIo1ii.getClass();
/* 18 */                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
/* 21 */                        oOiI0liIo1ii.I00000oIO(o1lOll, byteArrayOutputStream);
                            } catch (IOException unused) {
                            }
/* 24 */                    return byteArrayOutputStream.toByteArray();
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 8 */             iIiOOI.I0000O(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
/* 11 */            return "default failing getForegroundInfoAsync";
                }
            }
