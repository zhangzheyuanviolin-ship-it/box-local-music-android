            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public final class iOO00I0O implements Iterable, iO0iIIoO11 {
                public final String I00iOIl;

                public iOO00I0O(String str) {
/* 4 */             if (str != null) {
/* 6 */                 this.I00iOIl = str;
                    } else {
/* 11 */                I000II.I000iOII("StringValue cannot be null.");
/* 29 */                throw null;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:104:0x02e4 A[PHI: r8
                  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:107:0x02ea  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x02ee A[LOOP:0: B:108:0x02ec->B:109:0x02ee, LOOP_END] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
                    String str2;
                    String str3;
                    String strZzc;
                    int i;
                    int i2;
                    int i3;
                    OillOo0 oillOo02;
/* 49 */            if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
/* 43 */                str2 = "hasOwnProperty";
/* 9 */                 str3 = "trim";
                    } else {
/* 43 */                str2 = "hasOwnProperty";
/* 9 */                 str3 = "trim";
/* 149 */               if (!str3.equals(str)) {
/* 158 */                   I000II.I000iOII(str.concat(" is not a String function"));
/* 27 */                    return null;
                        }
                    }
/* 166 */           int iHashCode = str.hashCode();
/* 170 */           strZzc = "undefined";
/* 180 */           String str4 = this.I00iOIl;
/* 184 */           z = false;
/* 184 */           boolean z = false;
                    switch (iHashCode) {
                        case -1789698943:
/* 1461 */                  String str5 = str2;
/* 1467 */                  if (str.equals(str5)) {
/* 1470 */                      ll00I0ii.I00000oIO(str5, 1, arrayList);
/* 1483 */                      iO0iIIoO11 io0iiioo11I000OiO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 1493 */                      boolean zEquals = "length".equals(io0iiioo11I000OiO.zzc());
/* 1497 */                      iI0io0OI1IOo ii0io0oi1ioo = iO0iIIoO11.I00i0oil;
/* 1499 */                      if (zEquals) {
/* 1501 */                          return ii0io0oi1ioo;
                                }
/* 1506 */                      double dDoubleValue = io0iiioo11I000OiO.zzd().doubleValue();
                                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str4.length()) ? iO0iIIoO11.I00iIO : ii0io0oi1ioo;
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -1776922004:
/* 1451 */                  if (str.equals("toString")) {
/* 1453 */                      ll00I0ii.I00000oIO("toString", 0, arrayList);
/* 178 */                       return this;
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -1464939364:
/* 1428 */                  if (str.equals("toLocaleLowerCase")) {
/* 1430 */                      ll00I0ii.I00000oIO("toLocaleLowerCase", 0, arrayList);
/* 1439 */                      return new iOO00I0O(str4.toLowerCase());
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -1361633751:
/* 1355 */                  if (str.equals("charAt")) {
/* 1358 */                      ll00I0ii.I0000Il00O("charAt", 1, arrayList);
/* 1393 */                      int iI000O01llI0 = arrayList.isEmpty() ? 0 : (int) ll00I0ii.I000O01llI0(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue());
                                return (iI000O01llI0 < 0 || iI000O01llI0 >= str4.length()) ? iO0iIIoO11.I00iIi0i1o : new iOO00I0O(String.valueOf(str4.charAt(iI000O01llI0)));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -1354795244:
/* 1291 */                  if (str.equals("concat")) {
/* 1297 */                      if (!arrayList.isEmpty()) {
/* 1301 */                          StringBuilder sb = new StringBuilder(str4);
/* 1308 */                          for (int i4 = 0; i4 < arrayList.size(); i4++) {
/* 1328 */                              sb.append(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(i4)).zzc());
                                    }
/* 1340 */                          return new iOO00I0O(sb.toString());
                                }
/* 178 */                       return this;
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -1137582698:
/* 1264 */                  if (str.equals("toLowerCase")) {
/* 1266 */                      ll00I0ii.I00000oIO("toLowerCase", 0, arrayList);
/* 1277 */                      return new iOO00I0O(str4.toLowerCase(Locale.ENGLISH));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -906336856:
/* 1187 */                  if (str.equals("search")) {
/* 1190 */                      ll00I0ii.I0000Il00O("search", 1, arrayList);
                                return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc()).matcher(str4).find() ? new iII01l(Double.valueOf(r0.start())) : new iII01l(Double.valueOf(-1.0d));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -726908483:
/* 1164 */                  if (str.equals("toLocaleUpperCase")) {
/* 1166 */                      ll00I0ii.I00000oIO("toLocaleUpperCase", 0, arrayList);
/* 1175 */                      return new iOO00I0O(str4.toUpperCase());
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -467511597:
/* 1062 */                  if (str.equals("lastIndexOf")) {
/* 1065 */                      ll00I0ii.I0000Il00O("lastIndexOf", 2, arrayList);
/* 1091 */                      String strZzc2 = arrayList.size() > 0 ? ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc() : "undefined";
/* 1154 */                      return new iII01l(Double.valueOf(str4.lastIndexOf(strZzc2, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : ll00I0ii.I000O01llI0(r1)))));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case -399551817:
/* 1037 */                  if (str.equals("toUpperCase")) {
/* 1039 */                      ll00I0ii.I00000oIO("toUpperCase", 0, arrayList);
/* 1050 */                      return new iOO00I0O(str4.toUpperCase(Locale.ENGLISH));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 3568674:
/* 1016 */                  if (str.equals(str3)) {
/* 1018 */                      ll00I0ii.I00000oIO("toUpperCase", 0, arrayList);
/* 1027 */                      return new iOO00I0O(str4.trim());
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 103668165:
/* 936 */                   if (str.equals("match")) {
/* 939 */                       ll00I0ii.I0000Il00O("match", 1, arrayList);
/* 973 */                       Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc()).matcher(str4);
                                return matcher.find() ? new i1ollIol0I0(Arrays.asList(new iOO00I0O(matcher.group()))) : iO0iIIoO11.I00OloOo;
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 109526418:
/* 778 */                   if (str.equals("slice")) {
/* 781 */                       ll00I0ii.I0000Il00O("slice", 2, arrayList);
/* 815 */                       double dI000O01llI0 = ll00I0ii.I000O01llI0(!arrayList.isEmpty() ? ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue() : 0.0d);
/* 841 */                       double dMax = dI000O01llI0 < 0.0d ? Math.max(str4.length() + dI000O01llI0, 0.0d) : Math.min(dI000O01llI0, str4.length());
/* 880 */                       double dI000O01llI02 = ll00I0ii.I000O01llI0(arrayList.size() > 1 ? ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue() : str4.length());
/* 910 */                       int i5 = (int) dMax;
/* 924 */                       return new iOO00I0O(str4.substring(i5, Math.max(0, ((int) (dI000O01llI02 < 0.0d ? Math.max(str4.length() + dI000O01llI02, 0.0d) : Math.min(dI000O01llI02, str4.length()))) - i5) + i5));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 109648666:
/* 586 */                   if (str.equals("split")) {
/* 589 */                       ll00I0ii.I0000Il00O("split", 2, arrayList);
/* 596 */                       if (str4.length() == 0) {
/* 609 */                           return new i1ollIol0I0(Arrays.asList(this));
                                }
/* 615 */                       ArrayList arrayList2 = new ArrayList();
/* 622 */                       if (arrayList.isEmpty()) {
/* 624 */                           arrayList2.add(this);
                                } else {
/* 643 */                           String strZzc3 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc();
/* 688 */                           long jI000II = arrayList.size() > 1 ? ll00I0ii.I000II(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) & 4294967295L : 2147483647L;
/* 695 */                           if (jI000II == 0) {
/* 699 */                               return new i1ollIol0I0();
                                    }
/* 712 */                           String[] strArrSplit = str4.split(Pattern.quote(strZzc3), ((int) jI000II) + 1);
/* 716 */                           int length = strArrSplit.length;
/* 721 */                           if (!strZzc3.isEmpty() || length <= 0) {
/* 741 */                               i2 = length;
                                        i3 = z;
/* 745 */                               if (length > jI000II) {
                                            i2--;
                                        }
/* 749 */                               while (i3 < i2) {
/* 758 */                                   arrayList2.add(new iOO00I0O(strArrSplit[i3]));
/* 761 */                                   i3++;
                                        }
                                    } else {
/* 727 */                               boolean zIsEmpty = strArrSplit[0].isEmpty();
                                        i2 = length - 1;
                                        i3 = zIsEmpty;
                                        z = zIsEmpty;
/* 739 */                               if (!strArrSplit[i2].isEmpty()) {
                                        }
/* 745 */                               if (length > jI000II) {
                                        }
/* 749 */                               while (i3 < i2) {
                                        }
                                    }
                                }
/* 766 */                       return new i1ollIol0I0(arrayList2);
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 530542161:
/* 456 */                   if (str.equals("substring")) {
/* 459 */                       ll00I0ii.I0000Il00O("substring", 2, arrayList);
/* 496 */                       int iI000O01llI02 = !arrayList.isEmpty() ? (int) ll00I0ii.I000O01llI0(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzd().doubleValue()) : 0;
/* 532 */                       int iI000O01llI03 = arrayList.size() > 1 ? (int) ll00I0ii.I000O01llI0(((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()) : str4.length();
/* 544 */                       int iMin = Math.min(Math.max(iI000O01llI02, 0), str4.length());
/* 556 */                       int iMin2 = Math.min(Math.max(iI000O01llI03, 0), str4.length());
/* 574 */                       return new iOO00I0O(str4.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 1094496948:
/* 295 */                   if (str.equals("replace")) {
/* 298 */                       ll00I0ii.I0000Il00O("replace", 2, arrayList);
/* 301 */                       boolean zIsEmpty2 = arrayList.isEmpty();
/* 305 */                       iO0iIIoO11 io0iiioo11I00000oIO = iO0iIIoO11.I00Ol1ll1;
/* 307 */                       if (!zIsEmpty2) {
/* 323 */                           strZzc = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc();
/* 332 */                           if (arrayList.size() > 1) {
/* 344 */                               io0iiioo11I00000oIO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
                                    }
                                }
/* 348 */                       String str6 = strZzc;
/* 350 */                       int iIndexOf = str4.indexOf(str6);
/* 354 */                       if (iIndexOf >= 0) {
/* 358 */                           if (io0iiioo11I00000oIO instanceof iIIoIiOoOoiO) {
/* 394 */                               io0iiioo11I00000oIO = ((iIIoIiOoOoiO) io0iiioo11I00000oIO).I00000oIO(oillOo0, Arrays.asList(new iOO00I0O(str6), new iII01l(Double.valueOf(iIndexOf)), this));
                                    }
/* 400 */                           String strSubstring = str4.substring(0, iIndexOf);
/* 404 */                           String strZzc4 = io0iiioo11I00000oIO.zzc();
/* 413 */                           String strSubstring2 = str4.substring(str6.length() + iIndexOf);
/* 444 */                           return new iOO00I0O(IIlIOloOOO.I0010I0i(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                                }
/* 178 */                       return this;
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        case 1943291465:
/* 194 */                   if (str.equals("indexOf")) {
/* 199 */                       ll00I0ii.I0000Il00O("indexOf", 2, arrayList);
/* 206 */                       if (arrayList.size() <= 0) {
/* 208 */                           oillOo02 = oillOo0;
                                } else {
/* 219 */                           oillOo02 = oillOo0;
/* 229 */                           strZzc = ((OoOlO1O0o) oillOo02.I00iiO).I000OiO(oillOo02, (iO0iIIoO11) arrayList.get(0)).zzc();
                                }
/* 283 */                       return new iII01l(Double.valueOf(str4.indexOf(strZzc, (int) ll00I0ii.I000O01llI0(arrayList.size() < 2 ? 0.0d : ((OoOlO1O0o) oillOo02.I00iiO).I000OiO(oillOo02, (iO0iIIoO11) arrayList.get(1)).zzd().doubleValue()))));
                            }
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                        default:
/* 1533 */                  I000II.I000iOII("Command not supported");
/* 27 */                    return null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iOO00I0O) {
/* 17 */                return this.I00iOIl.equals(((iOO00I0O) obj).I00iOIl);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 4 */             iO1iOoi1O io1iooi1o = new iO1iOoi1O(1);
/* 7 */             io1iooi1o.I00iiO = this;
/* 10 */            io1iooi1o.I00iiI = 0;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            return io1iooi1o;
                }

                public final String toString() {
/* 3 */             String str = this.I00iOIl;
/* 16 */            return IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + 2), "\"", str, "\"");
                }

                @Override
                public final String zzc() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final Double zzd() {
/* 1 */             String str = this.I00iOIl;
/* 7 */             if (str.isEmpty()) {
/* 23 */                return Double.valueOf(0.0d);
                    }
                    try {
/* 9 */                 return Double.valueOf(str);
                    } catch (NumberFormatException unused) {
/* 16 */                return Double.valueOf(Double.NaN);
                    }
                }

                @Override
                public final Boolean zze() {
/* 9 */             return Boolean.valueOf(!this.I00iOIl.isEmpty());
                }

                @Override
                public final Iterator zzf() {
/* 4 */             iO1iOoi1O io1iooi1o = new iO1iOoi1O(0);
/* 7 */             io1iooi1o.I00iiO = this;
/* 9 */             io1iooi1o.I00iiI = 0;
/* 11 */            VarHandle.storeStoreFence();
/* 20 */            return io1iooi1o;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 5 */             return new iOO00I0O(this.I00iOIl);
                }
            }
