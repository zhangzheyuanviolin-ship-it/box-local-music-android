            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class lOoo111010 {
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public static final void I00000oIO(Ooi11l0lI ooi11l0lI, StringBuilder sb) {
                    List listSingletonList;
/* 7 */             sb.append(ooi11l0lI.I0000O().I00iOIl);
/* 14 */            String str = ooi11l0lI.I0000O().I00iOIl;
                    switch (str.hashCode()) {
                        case -1081572750:
/* 124 */                   if (str.equals("mailto")) {
/* 322 */                       StringBuilder sb2 = new StringBuilder();
/* 325 */                       String str2 = ooi11l0lI.I0000oI00;
/* 327 */                       String str3 = ooi11l0lI.I0001Ioi1lo;
/* 329 */                       if (str2 != null) {
/* 332 */                           sb2.append(str2);
/* 335 */                           if (str3 != null) {
/* 339 */                               sb2.append(':');
/* 342 */                               sb2.append(str3);
                                    }
/* 347 */                           sb2.append("@");
                                }
/* 350 */                       CharSequence string = sb2.toString();
/* 354 */                       CharSequence charSequence = ooi11l0lI.I00000oIO;
/* 356 */                       sb.append(":");
/* 359 */                       sb.append(string);
/* 362 */                       sb.append(charSequence);
/* 365 */                       return;
                            }
                            break;
                        case 114715:
/* 106 */                   if (str.equals("tel")) {
/* 109 */                       CharSequence charSequence2 = ooi11l0lI.I00000oIO;
/* 111 */                       sb.append(":");
/* 114 */                       sb.append(charSequence2);
/* 117 */                       return;
                            }
                            break;
                        case 3076010:
/* 88 */                    if (str.equals("data")) {
/* 91 */                        CharSequence charSequence3 = ooi11l0lI.I00000oIO;
/* 93 */                        sb.append(":");
/* 96 */                        sb.append(charSequence3);
/* 99 */                        return;
                            }
                            break;
                        case 3143036:
/* 54 */                    if (str.equals("file")) {
/* 57 */                        CharSequence charSequence4 = ooi11l0lI.I00000oIO;
/* 59 */                        String strI0000Il00O = I0000Il00O(ooi11l0lI);
/* 63 */                        sb.append("://");
/* 66 */                        sb.append(charSequence4);
/* 73 */                        if (!OlOoOIi0o.I00IoiI(strI0000Il00O, '/')) {
/* 75 */                            sb.append('/');
                                }
/* 78 */                        sb.append((CharSequence) strI0000Il00O);
/* 81 */                        return;
                            }
                            break;
                        case 92611469:
/* 36 */                    if (str.equals("about")) {
/* 39 */                        CharSequence charSequence5 = ooi11l0lI.I00000oIO;
/* 41 */                        sb.append(":");
/* 44 */                        sb.append(charSequence5);
/* 47 */                        return;
                            }
                            break;
                    }
/* 126 */           sb.append("://");
/* 133 */           sb.append(I00000oOI(ooi11l0lI));
/* 136 */           String strI0000Il00O2 = I0000Il00O(ooi11l0lI);
/* 140 */           Io1O0I1i io1O0I1i = ooi11l0lI.I000OOo1O;
/* 142 */           boolean z = ooi11l0lI.I00000oOI;
/* 148 */           if (!OlOoOIi0o.I001l0I00(strI0000Il00O2) && !OlOolloIIOl0.I000l1(strI0000Il00O2, "/", false)) {
/* 159 */               sb.append('/');
                    }
/* 162 */           sb.append((CharSequence) strI0000Il00O2);
/* 173 */           if (!((Map) io1O0I1i.I00iOIl).isEmpty() || z) {
/* 179 */               sb.append("?");
                    }
/* 182 */           Set<Map.Entry> setI000II = io1O0I1i.I000II();
/* 190 */           ArrayList arrayList = new ArrayList();
/* 201 */           for (Map.Entry entry : setI000II) {
/* 213 */               String str4 = (String) entry.getKey();
/* 219 */               List list = (List) entry.getValue();
/* 225 */               if (list.isEmpty()) {
/* 233 */                   listSingletonList = Collections.singletonList(new OIoi0IIoi(str4, null));
                        } else {
/* 238 */                   List list2 = list;
/* 248 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 251 */                   Iterator it = list2.iterator();
/* 259 */                   while (it.hasNext()) {
/* 272 */                       arrayList2.add(new OIoi0IIoi(str4, (String) it.next()));
                            }
/* 276 */                   listSingletonList = arrayList2;
                        }
/* 279 */               IOOii0O10Io0.I00100l0(arrayList, listSingletonList);
                    }
/* 297 */           IOOi0Ool1i.I00IioO0OiOi(arrayList, sb, "&", null, null, new Oo011oIOO1(22), 60);
/* 306 */           if (ooi11l0lI.I000II.length() > 0) {
/* 310 */               sb.append('#');
/* 315 */               sb.append(ooi11l0lI.I000II);
                    }
                }

                public static final String I00000oOI(Ooi11l0lI ooi11l0lI) {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             String str = ooi11l0lI.I0000oI00;
/* 10 */            String str2 = ooi11l0lI.I0001Ioi1lo;
/* 12 */            if (str != null) {
/* 15 */                sb.append(str);
/* 18 */                if (str2 != null) {
/* 22 */                    sb.append(':');
/* 25 */                    sb.append(str2);
                        }
/* 30 */                sb.append("@");
                    }
/* 37 */            StringBuilder sb2 = new StringBuilder(sb.toString());
/* 42 */            sb2.append(ooi11l0lI.I00000oIO);
/* 45 */            int i = ooi11l0lI.I0000Il00O;
/* 47 */            if (i != 0 && i != ooi11l0lI.I0000O().I00iiI) {
/* 59 */                sb2.append(":");
/* 68 */                sb2.append(String.valueOf(ooi11l0lI.I0000Il00O));
                    }
/* 71 */            return sb2.toString();
                }

                public static final String I0000Il00O(Ooi11l0lI ooi11l0lI) {
/* 1 */             List list = ooi11l0lI.I000O01llI0;
                    return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) IOOi0Ool1i.I001lllioOl(list)).length() == 0 ? "/" : (String) IOOi0Ool1i.I001lllioOl(list) : IOOi0Ool1i.I00IlilI0i0i(list, "/", null, null, null, 62);
                }

                public static final void I0000O(Ooi11l0lI ooi11l0lI, String str) {
/* 41 */            ooi11l0lI.I000O01llI0 = OlOoOIi0o.I001l0I00(str) ? Il01100l.I00iOIl : str.equals("/") ? Ooi11lI0l0.I00000oIO : new ArrayList(OlOoOIi0o.I00Io1o110i(str, new char[]{'/'}));
                }
            }
