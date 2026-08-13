            package p000;

            import android.net.Uri;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.regex.Pattern;
            
            public final class OI1i1I implements IllOOo00lI {
                public final int I00iOIl;
                public OI1iiIoI0OOi I00iiI;

                public OI1i1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    List list;
/* 1 */             int i = this.I00iOIl;
/* 5 */             OI1iiIoI0OOi oI1iiIoI0OOi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 329 */                   String str = oI1iiIoI0OOi.I0000Il00O;
/* 331 */                   if (str == null) {
/* 4 */                         return null;
                            }
/* 335 */                   OOoilolI10I[] oOoilolI10IArr = OOoilolI10I.I00iOIl;
/* 337 */                   return new OOoiliiIoloI(str, 0);
                        case 1:
/* 324 */                   return Boolean.valueOf(OI1iiIoI0OOi.I0010I0i.I0000O(oI1iiIoI0OOi.I00000oIO));
                        case 2:
/* 110 */                   String str2 = oI1iiIoI0OOi.I00000oIO;
/* 114 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 129 */                   if (((Boolean) oI1iiIoI0OOi.I0000oI00.getValue()).booleanValue()) {
/* 133 */                       Uri uri = Uri.parse(str2);
/* 149 */                       for (String str3 : uri.getQueryParameterNames()) {
/* 159 */                           StringBuilder sb = new StringBuilder();
/* 162 */                           List<String> queryParameters = uri.getQueryParameters(str3);
/* 171 */                           if (queryParameters.size() > 1) {
/* 310 */                               I000II.I0010I0i(Oi010OO0.I001IO000("Query parameter ", str3, " must only be present once in ", str2, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
/* 4 */                                 return null;
                                    }
/* 177 */                           String str4 = (String) IOOi0Ool1i.I00II0Ol1O0l(queryParameters);
/* 179 */                           if (str4 == null) {
/* 181 */                               oI1iiIoI0OOi.I000II = true;
/* 183 */                               str4 = str3;
                                    }
/* 192 */                           OI1iOO oI1iOO = new OI1iOO();
/* 200 */                           oI1iOO.I00000oOI = new ArrayList();
/* 202 */                           VarHandle.storeStoreFence();
/* 205 */                           int i2 = 0;
/* 206 */                           for (O1OlOOioiI o1OlOOioiII00000oIO = OOoiliiIoloI.I00000oIO(OI1iiIoI0OOi.I000o00OoI0I, str4); o1OlOOioiII00000oIO != null; o1OlOOioiII00000oIO = o1OlOOioiII00000oIO.I0000Il00O()) {
/* 218 */                               oI1iOO.I00000oOI.add(o1OlOOioiII00000oIO.I0000Il00O.I0000O(1).I00000oIO);
/* 227 */                               if (o1OlOOioiII00000oIO.I00000oOI().I00iOIl > i2) {
/* 243 */                                   sb.append(Pattern.quote(str4.substring(i2, o1OlOOioiII00000oIO.I00000oOI().I00iOIl)));
                                        }
/* 248 */                               sb.append("([\\s\\S]+?)?");
/* 257 */                               i2 = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
                                    }
/* 267 */                           if (i2 < str4.length()) {
/* 277 */                               sb.append(Pattern.quote(str4.substring(i2)));
                                    }
/* 282 */                           sb.append("$");
/* 293 */                           oI1iOO.I00000oIO = OI1iiIoI0OOi.I0001Ioi1lo(sb.toString());
/* 295 */                           linkedHashMap.put(str3, oI1iOO);
                                }
                            }
/* 314 */                   return linkedHashMap;
                        case 3:
/* 66 */                    String str5 = oI1iiIoI0OOi.I00000oIO;
/* 76 */                    if (Uri.parse(str5).getFragment() == null) {
/* 4 */                         return null;
                            }
/* 81 */                    ArrayList arrayList = new ArrayList();
/* 88 */                    String fragment = Uri.parse(str5).getFragment();
/* 94 */                    StringBuilder sb2 = new StringBuilder();
/* 97 */                    OI1iiIoI0OOi.I00000oIO(fragment, arrayList, sb2);
/* 106 */                   return new OIoi0IIoi(arrayList, sb2.toString());
                        case 4:
/* 50 */                    OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) oI1iiIoI0OOi.I000O01llI0.getValue();
                            return (oIoi0IIoi == null || (list = (List) oIoi0IIoi.I00iOIl) == null) ? new ArrayList() : list;
                        case 5:
/* 34 */                    OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) oI1iiIoI0OOi.I000O01llI0.getValue();
/* 36 */                    if (oIoi0IIoi2 != null) {
/* 41 */                        return (String) oIoi0IIoi2.I00iiI;
                            }
/* 4 */                     return null;
                        default:
/* 16 */                    String str6 = (String) oI1iiIoI0OOi.I000OiO.getValue();
/* 18 */                    if (str6 == null) {
/* 4 */                         return null;
                            }
/* 22 */                    OOoilolI10I[] oOoilolI10IArr2 = OOoilolI10I.I00iOIl;
/* 24 */                    return new OOoiliiIoloI(str6, 0);
                    }
                }
            }
