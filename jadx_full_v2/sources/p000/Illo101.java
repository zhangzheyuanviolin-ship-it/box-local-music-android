            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class Illo101 {
                public static final Illo101 I0000Il00O;
                public List I00000oIO;
                public LinkedHashMap I00000oOI;

                static {
/* 26 */            List listI000O01llI0 = IOOi1I.I000O01llI0(Illo01lli.I0000Il00O, Illo0liIIii.I0000Il00O, Illo01ol1.I0000Il00O, Illo0I.I0000Il00O);
/* 30 */            Illo101 illo101 = new Illo101();
/* 33 */            illo101.I00000oIO = listI000O01llI0;
/* 39 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 50 */            for (Object obj : listI000O01llI0) {
/* 59 */                Ill0IO ill0IO = ((Illo0o) obj).I00000oIO;
/* 61 */                Object arrayList = linkedHashMap.get(ill0IO);
/* 65 */                if (arrayList == null) {
/* 69 */                    arrayList = new ArrayList();
/* 72 */                    linkedHashMap.put(ill0IO, arrayList);
                        }
/* 77 */                ((List) arrayList).add(obj);
                    }
/* 81 */            illo101.I00000oOI = linkedHashMap;
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            I0000Il00O = illo101;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0010 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Illo0olo0 I00000oIO(Ill0IO ill0IO, String str) {
                    Integer numValueOf;
/* 7 */             List<Illo0o> list = (List) this.I00000oOI.get(ill0IO);
/* 10 */            if (list == null) {
/* 9 */                 return null;
                    }
/* 21 */            for (Illo0o illo0o : list) {
/* 36 */                if (OlOolloIIOl0.I000l1(str, illo0o.I00000oOI, false)) {
/* 44 */                    String strSubstring = str.substring(illo0o.I00000oOI.length());
/* 52 */                    if (strSubstring.length() == 0) {
/* 54 */                        numValueOf = null;
/* 85 */                        if (numValueOf == null) {
/* 87 */                            int iIntValue = numValueOf.intValue();
/* 93 */                            Illo0olo0 illo0olo0 = new Illo0olo0();
/* 96 */                            illo0olo0.I00000oIO = illo0o;
/* 98 */                            illo0olo0.I00000oOI = iIntValue;
/* 100 */                           VarHandle.storeStoreFence();
/* 551 */                           return illo0olo0;
                                }
                            } else {
/* 56 */                        int length = strSubstring.length();
/* 60 */                        int i = 0;
/* 61 */                        for (int i2 = 0; i2 < length; i2++) {
                                    int iCharAt = strSubstring.charAt(i2) - '0';
/* 69 */                            if (iCharAt < 0 || iCharAt >= 10) {
/* 54 */                                numValueOf = null;
                                        break;
                                    }
/* 77 */                            i = (i * 10) + iCharAt;
                                }
/* 81 */                        numValueOf = Integer.valueOf(i);
/* 85 */                        if (numValueOf == null) {
                                }
                            }
                        }
                    }
/* 9 */             return null;
                }
            }
