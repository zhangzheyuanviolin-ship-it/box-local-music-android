            package p000;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class l00i1l00OlIO {
                public static final AtomicReference I00000oOI = new AtomicReference();
                public static final AtomicReference I0000Il00O = new AtomicReference();
                public static final AtomicReference I0000O = new AtomicReference();
                public Oi1ol0llI I00000oIO;

                public static final String I000II(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
                    String str2;
/* 1 */             lII0I0I000I.I000II(atomicReference);
/* 12 */            lII0I0I000I.I00000oOI(strArr.length == strArr2.length);
/* 16 */            for (int i = 0; i < strArr.length; i++) {
/* 24 */                if (Objects.equals(str, strArr[i])) {
                            synchronized (atomicReference) {
                                try {
/* 31 */                            String[] strArr3 = (String[]) atomicReference.get();
/* 33 */                            if (strArr3 == null) {
/* 36 */                                strArr3 = new String[strArr2.length];
/* 38 */                                atomicReference.set(strArr3);
                                    }
/* 44 */                            str2 = strArr3[i];
/* 46 */                            if (str2 == null) {
/* 73 */                                str2 = strArr2[i] + "(" + strArr[i] + ")";
/* 77 */                                strArr3[i] = str2;
                                    }
                                } catch (Throwable th) {
/* 82 */                            throw th;
                                }
                            }
/* 80 */                    return str2;
                        }
                    }
/* 204 */           return str;
                }

                public final String I00000oIO(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (!this.I00000oIO.I00100o1O0lo()) {
/* 13 */                return str;
                    }
/* 20 */            return I000II(str, iO1l1II0O0.I0001Ioi1lo, iO1l1II0O0.I00000oIO, I00000oOI);
                }

                public final String I00000oOI(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (!this.I00000oIO.I00100o1O0lo()) {
/* 13 */                return str;
                    }
/* 20 */            return I000II(str, iO1l1oi.I00000oOI, iO1l1oi.I00000oIO, I0000Il00O);
                }

                public final String I0000Il00O(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (!this.I00000oIO.I00100o1O0lo()) {
/* 13 */                return str;
                    }
/* 20 */            if (str.startsWith("_exp_")) {
/* 26 */                return IlIi0I0.I000lI("experiment_id(", str, ")");
                    }
/* 37 */            return I000II(str, iO1lI0lo110.I00000oOI, iO1lI0lo110.I00000oIO, I0000O);
                }

                public final String I0000O(ii0oooi0IO0l ii0oooi0io0l) {
/* 1 */             Oi1ol0llI oi1ol0llI = this.I00000oIO;
/* 7 */             if (!oi1ol0llI.I00100o1O0lo()) {
/* 9 */                 return ii0oooi0io0l.toString();
                    }
/* 18 */            StringBuilder sb = new StringBuilder("origin=");
/* 23 */            sb.append(ii0oooi0io0l.I00iiO);
/* 28 */            sb.append(",name=");
/* 37 */            sb.append(I00000oIO(ii0oooi0io0l.I00iOIl));
/* 42 */            sb.append(",params=");
/* 45 */            ii0il0lOolIo ii0il0loolio = ii0oooi0io0l.I00iiI;
/* 72 */            sb.append(ii0il0loolio == null ? null : !oi1ol0llI.I00100o1O0lo() ? ii0il0loolio.I00iOIl.toString() : I0000oI00(ii0il0loolio.I0001Ioi1lo()));
/* 75 */            return sb.toString();
                }

                public final String I0000oI00(Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (!this.I00000oIO.I00100o1O0lo()) {
/* 13 */                return bundle.toString();
                    }
/* 20 */            StringBuilder sb = new StringBuilder();
/* 25 */            sb.append("Bundle[{");
/* 40 */            for (String str : bundle.keySet()) {
/* 54 */                if (sb.length() != 8) {
/* 58 */                    sb.append(", ");
                        }
/* 65 */                sb.append(I00000oOI(str));
/* 70 */                sb.append("=");
/* 73 */                Object obj = bundle.get(str);
/* 120 */               sb.append(obj instanceof Bundle ? I0001Ioi1lo(new Object[]{obj}) : obj instanceof Object[] ? I0001Ioi1lo((Object[]) obj) : obj instanceof ArrayList ? I0001Ioi1lo(((ArrayList) obj).toArray()) : String.valueOf(obj));
                    }
/* 126 */           sb.append("}]");
/* 129 */           return sb.toString();
                }

                public final String I0001Ioi1lo(Object[] objArr) {
/* 1 */             if (objArr == null) {
/* 3 */                 return "[]";
                    }
/* 8 */             StringBuilder sb = new StringBuilder();
/* 13 */            sb.append("[");
/* 18 */            for (Object obj : objArr) {
/* 33 */                String strI0000oI00 = obj instanceof Bundle ? I0000oI00((Bundle) obj) : String.valueOf(obj);
/* 37 */                if (strI0000oI00 != null) {
/* 44 */                    if (sb.length() != 1) {
/* 48 */                        sb.append(", ");
                            }
/* 51 */                    sb.append(strI0000oI00);
                        }
                    }
/* 59 */            sb.append("]");
/* 62 */            return sb.toString();
                }
            }
