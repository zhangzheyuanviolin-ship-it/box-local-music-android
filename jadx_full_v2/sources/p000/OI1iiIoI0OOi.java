            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public final class OI1iiIoI0OOi {
                public static final OOoiliiIoloI I000lI = new OOoiliiIoloI("^[a-zA-Z]+[+\\w\\-.]*:");
                public static final OOoiliiIoloI I000o00OoI0I = new OOoiliiIoloI("\\{(.+?)\\}");
                public static final OOoiliiIoloI I000oI1ioi = new OOoiliiIoloI("http[s]?://");
                public static final OOoiliiIoloI I00100l0 = new OOoiliiIoloI(".*");
                public static final OOoiliiIoloI I00100o1O0lo = new OOoiliiIoloI("([^/]*?|)");
                public static final OOoiliiIoloI I0010I0i = new OOoiliiIoloI("^[^?#]+\\?([^#]*).*");
                public String I00000oIO;
                public ArrayList I00000oOI;
                public String I0000Il00O;
                public OllO00oiil I0000O;
                public OllO00oiil I0000oI00;
                public O0ioIllo0i1 I0001Ioi1lo;
                public boolean I000II;
                public O0ioIllo0i1 I000O01llI0;
                public O0ioIllo0i1 I000OOo1O;
                public O0ioIllo0i1 I000OiO;
                public OllO00oiil I000iOII;
                public boolean I000l1;

                public static void I00000oIO(String str, ArrayList arrayList, StringBuilder sb) {
/* 7 */             int i = 0;
/* 8 */             for (O1OlOOioiI o1OlOOioiII00000oIO = OOoiliiIoloI.I00000oIO(I000o00OoI0I, str); o1OlOOioiII00000oIO != null; o1OlOOioiII00000oIO = o1OlOOioiII00000oIO.I0000Il00O()) {
/* 19 */                arrayList.add(o1OlOOioiII00000oIO.I0000Il00O.I0000O(1).I00000oIO);
/* 28 */                if (o1OlOOioiII00000oIO.I00000oOI().I00iOIl > i) {
/* 44 */                    sb.append(Pattern.quote(str.substring(i, o1OlOOioiII00000oIO.I00000oOI().I00iOIl)));
                        }
/* 55 */                sb.append(I00100o1O0lo.I00iOIl.pattern());
/* 64 */                i = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
                    }
/* 74 */            if (i < str.length()) {
/* 84 */                sb.append(Pattern.quote(str.substring(i)));
                    }
                }

                public static String I0001Ioi1lo(String str) {
                    return (OlOoOIi0o.I000oI1ioi(str, "\\Q", false) && OlOoOIi0o.I000oI1ioi(str, "\\E", false)) ? OlOolloIIOl0.I000iOII(str, ".*", "\\E.*\\Q") : OlOoOIi0o.I000oI1ioi(str, "\\.\\*", false) ? OlOolloIIOl0.I000iOII(str, "\\.\\*", ".*") : str;
                }

                public final ArrayList I00000oOI() {
/* 1 */             ArrayList arrayList = this.I00000oOI;
/* 11 */            Collection collectionValues = ((Map) this.I0001Ioi1lo.getValue()).values();
/* 19 */            ArrayList arrayList2 = new ArrayList();
/* 22 */            Iterator it = collectionValues.iterator();
/* 30 */            while (it.hasNext()) {
/* 40 */                IOOii0O10Io0.I00100l0(arrayList2, ((OI1iOO) it.next()).I00000oOI);
                    }
/* 58 */            return IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00O10llo(arrayList, arrayList2), (List) this.I000OOo1O.getValue());
                }

                public final Bundle I0000Il00O(Uri uri, LinkedHashMap linkedHashMap) {
                    O1OlOOioiI o1OlOOioiII0000Il00O;
                    O1OlOOioiI o1OlOOioiII0000Il00O2;
/* 7 */             OOoiliiIoloI oOoiliiIoloI = (OOoiliiIoloI) this.I0000O.getValue();
/* 10 */            if (oOoiliiIoloI != null && (o1OlOOioiII0000Il00O = oOoiliiIoloI.I0000Il00O(uri.toString())) != null) {
/* 33 */                Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 41 */                if (I0000O(o1OlOOioiII0000Il00O, bundleI00000oIO, linkedHashMap) && (!((Boolean) this.I0000oI00.getValue()).booleanValue() || I0000oI00(uri, bundleI00000oIO, linkedHashMap))) {
/* 67 */                    String fragment = uri.getFragment();
/* 77 */                    OOoiliiIoloI oOoiliiIoloI2 = (OOoiliiIoloI) this.I000iOII.getValue();
/* 79 */                    if (oOoiliiIoloI2 != null && (o1OlOOioiII0000Il00O2 = oOoiliiIoloI2.I0000Il00O(String.valueOf(fragment))) != null) {
/* 98 */                        List list = (List) this.I000OOo1O.getValue();
/* 110 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 117 */                       int i = 0;
/* 122 */                       for (Object obj : list) {
/* 128 */                           int i2 = i + 1;
/* 130 */                           if (i < 0) {
/* 182 */                               IOOi1I.I000lI();
/* 185 */                               throw null;
                                    }
/* 132 */                           String str = (String) obj;
/* 136 */                           O1OlIIi1OII1 o1OlIIi1OII1I0000O = o1OlOOioiII0000Il00O2.I0000Il00O.I0000O(i2);
/* 149 */                           String strDecode = o1OlIIi1OII1I0000O != null ? Uri.decode(o1OlIIi1OII1I0000O.I00000oIO) : null;
/* 150 */                           if (strDecode == null) {
/* 152 */                               strDecode = "";
                                    }
/* 158 */                           OI1Oi1 oI1Oi1 = (OI1Oi1) linkedHashMap.get(str);
/* 160 */                           if (oI1Oi1 != null) {
                                        try {
/* 162 */                                   OII0I1ii oII0I1ii = oI1Oi1.I00000oIO;
/* 168 */                                   oII0I1ii.I0000oI00(bundleI00000oIO, str, oII0I1ii.I0000Il00O(strDecode));
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    } else {
/* 172 */                               bundleI00000oIO.putString(str, strDecode);
                                    }
/* 177 */                           arrayList.add(OoiIlOl1iI.I00000oIO);
/* 180 */                           i = i2;
                                }
                            }
/* 188 */                   OI1iIi011i oI1iIi011i = new OI1iIi011i(0);
/* 191 */                   oI1iIi011i.I00iiI = bundleI00000oIO;
/* 193 */                   VarHandle.storeStoreFence();
/* 204 */                   if (l1iIIII1.I00000oIO(linkedHashMap, oI1iIi011i).isEmpty()) {
/* 207 */                       return bundleI00000oIO;
                            }
                        }
                    }
/* 9 */             return null;
                }

                public final boolean I0000O(O1OlOOioiI o1OlOOioiI, Bundle bundle, Map map) {
/* 1 */             ArrayList arrayList = this.I00000oOI;
/* 11 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 14 */            Iterator it = arrayList.iterator();
/* 19 */            int i = 0;
/* 24 */            while (it.hasNext()) {
/* 26 */                Object next = it.next();
/* 30 */                int i2 = i + 1;
/* 33 */                if (i < 0) {
/* 84 */                    IOOi1I.I000lI();
/* 87 */                    throw null;
                        }
/* 35 */                String str = (String) next;
/* 39 */                O1OlIIi1OII1 o1OlIIi1OII1I0000O = o1OlOOioiI.I0000Il00O.I0000O(i2);
/* 47 */                String strDecode = o1OlIIi1OII1I0000O != null ? Uri.decode(o1OlIIi1OII1I0000O.I00000oIO) : null;
/* 51 */                if (strDecode == null) {
/* 53 */                    strDecode = "";
                        }
/* 59 */                OI1Oi1 oI1Oi1 = (OI1Oi1) map.get(str);
/* 61 */                if (oI1Oi1 != null) {
                            try {
/* 63 */                        OII0I1ii oII0I1ii = oI1Oi1.I00000oIO;
/* 69 */                        oII0I1ii.I0000oI00(bundle, str, oII0I1ii.I0000Il00O(strDecode));
                            } catch (IllegalArgumentException unused) {
/* 18 */                        return false;
                            }
                        } else {
/* 73 */                    bundle.putString(str, strDecode);
                        }
/* 78 */                arrayList2.add(OoiIlOl1iI.I00000oIO);
/* 81 */                i = i2;
                    }
/* 88 */            return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
                /* JADX WARN: Type inference failed for: r14v2 */
                /* JADX WARN: Type inference failed for: r14v3, types: [int] */
                /* JADX WARN: Type inference failed for: r14v9 */
                /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000oI00(Uri uri, Bundle bundle, Map map) {
                    O1OlOOioiI o1OlOOioiI;
                    Object objValueOf;
                    boolean z;
                    Object obj;
                    String query;
/* 25 */            for (Map.Entry entry : ((Map) this.I0001Ioi1lo.getValue()).entrySet()) {
/* 37 */                String str = (String) entry.getKey();
/* 43 */                OI1iOO oI1iOO = (OI1iOO) entry.getValue();
/* 47 */                List<String> queryParameters = uri.getQueryParameters(str);
/* 53 */                if (this.I000II && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
/* 71 */                    queryParameters = Collections.singletonList(query);
                        }
/* 75 */                Object obj2 = OoiIlOl1iI.I00000oIO;
/* 77 */                boolean z2 = false;
/* 86 */                Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 92 */                Iterator it = oI1iOO.I00000oOI.iterator();
/* 100 */               while (it.hasNext()) {
/* 106 */                   String str2 = (String) it.next();
/* 112 */                   OI1Oi1 oI1Oi1 = (OI1Oi1) map.get(str2);
/* 119 */                   OII0I1ii oII0I1ii = oI1Oi1 != null ? oI1Oi1.I00000oIO : null;
/* 122 */                   if ((oII0I1ii instanceof II110I) && !oI1Oi1.I0000Il00O) {
/* 128 */                       II110I ii110i = (II110I) oII0I1ii;
                                switch (ii110i.I000l1) {
                                    case 0:
/* 147 */                               obj = new boolean[0];
                                        break;
                                    case 1:
/* 144 */                               obj = new float[0];
                                        break;
                                    case 2:
/* 141 */                               obj = new int[0];
                                        break;
                                    case 3:
/* 138 */                               obj = new long[0];
                                        break;
                                    default:
/* 135 */                               obj = new String[0];
                                        break;
                                }
/* 149 */                       ii110i.I0000oI00(bundleI00000oIO, str2, obj);
                            }
                        }
/* 163 */               for (String str3 : queryParameters) {
/* 171 */                   String str4 = oI1iOO.I00000oIO;
/* 173 */                   if (str4 != null) {
/* 179 */                       Matcher matcher = Pattern.compile(str4).matcher(str3);
/* 196 */                       o1OlOOioiI = !matcher.matches() ? null : new O1OlOOioiI(matcher, str3);
                            }
/* 197 */                   if (o1OlOOioiI == null) {
/* 199 */                       return z2;
                            }
/* 200 */                   ArrayList arrayList = oI1iOO.I00000oOI;
/* 210 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 213 */                   Iterator it2 = arrayList.iterator();
/* 217 */                   ?? r14 = z2;
/* 222 */                   while (it2.hasNext()) {
/* 224 */                       Object next = it2.next();
/* 230 */                       int i = r14 + 1;
/* 232 */                       if (r14 < 0) {
/* 348 */                           IOOi1I.I000lI();
/* 351 */                           throw null;
                                }
/* 234 */                       String str5 = (String) next;
/* 238 */                       O1OlIIi1OII1 o1OlIIi1OII1I0000O = o1OlOOioiI.I0000Il00O.I0000O(i);
/* 247 */                       String str6 = o1OlIIi1OII1I0000O != null ? o1OlIIi1OII1I0000O.I00000oIO : null;
/* 248 */                       if (str6 == null) {
/* 250 */                           str6 = "";
                                }
/* 258 */                       OI1Oi1 oI1Oi12 = (OI1Oi1) map.get(str5);
                                try {
/* 264 */                           if (bundleI00000oIO.containsKey(str5)) {
/* 292 */                               if (bundleI00000oIO.containsKey(str5)) {
/* 299 */                                   if (oI1Oi12 != null) {
/* 301 */                                       OII0I1ii oII0I1ii2 = oI1Oi12.I00000oIO;
/* 305 */                                       Object objI00000oIO = oII0I1ii2.I00000oIO(str5, bundleI00000oIO);
/* 313 */                                       if (!bundleI00000oIO.containsKey(str5)) {
/* 330 */                                           throw new IllegalArgumentException("There is no previous value in this savedState.");
                                                }
/* 319 */                                       oII0I1ii2.I0000oI00(bundleI00000oIO, str5, oII0I1ii2.I0000O(str6, objI00000oIO));
                                            }
/* 333 */                                   z = false;
                                        } else {
/* 294 */                                   z = true;
                                        }
                                        try {
/* 334 */                                   objValueOf = Boolean.valueOf(z);
                                        } catch (IllegalArgumentException unused) {
/* 339 */                                   objValueOf = obj2;
/* 340 */                                   arrayList2.add(objValueOf);
/* 343 */                                   r14 = i;
/* 344 */                                   z2 = false;
                                        }
                                    } else {
/* 266 */                               if (oI1Oi12 != null) {
/* 268 */                                   OII0I1ii oII0I1ii3 = oI1Oi12.I00000oIO;
/* 274 */                                   oII0I1ii3.I0000oI00(bundleI00000oIO, str5, oII0I1ii3.I0000Il00O(str6));
                                        } else {
/* 278 */                                   bundleI00000oIO.putString(str5, str6);
                                        }
/* 281 */                               objValueOf = obj2;
                                    }
                                } catch (IllegalArgumentException unused2) {
                                }
/* 340 */                       arrayList2.add(objValueOf);
/* 343 */                       r14 = i;
/* 344 */                       z2 = false;
                            }
                        }
/* 354 */               bundle.putAll(bundleI00000oIO);
                    }
/* 359 */           return true;
                }

                public final boolean equals(Object obj) {
                    return obj != null && (obj instanceof OI1iiIoI0OOi) && this.I00000oIO.equals(((OI1iiIoI0OOi) obj).I00000oIO);
                }

                public final int hashCode() {
/* 7 */             return this.I00000oIO.hashCode() * 961;
                }
            }
