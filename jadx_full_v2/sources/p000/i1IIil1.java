            package p000;

            import android.util.Log;
            import java.math.BigDecimal;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.regex.Pattern;
            import java.util.regex.PatternSyntaxException;
            
            public final class i1IIil1 {
                public final String I00000oIO;
                public final int I00000oOI;
                public Boolean I0000Il00O;
                public Boolean I0000O;
                public Long I0000oI00;
                public Long I0001Ioi1lo;
                public final int I000II;
                public final i1lioiII I000O01llI0;
                public final i1oi01OllI I000OOo1O;

                public i1IIil1(i1lioiII i1lioiii, String str, int i, i1oi01OllI i1oi01olli, int i2) {
/* 1 */             this.I000II = i2;
/* 3 */             this.I000O01llI0 = i1lioiii;
/* 8 */             this.I00000oIO = str;
/* 10 */            this.I00000oOI = i;
/* 12 */            this.I000OOo1O = i1oi01olli;
                }

                public static Boolean I0000Il00O(Boolean bool, boolean z) {
/* 1 */             if (bool == null) {
/* 3 */                 return null;
                    }
/* 14 */            return Boolean.valueOf(bool.booleanValue() != z);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public static Boolean I0000O(String str, ioi0O0o ioi0o0o, l01O0IO1ooO0 l01o0io1ooo0) {
                    List listI001iOo1i0O;
/* 1 */             lII0I0I000I.I000II(ioi0o0o);
/* 5 */             if (str != null && ioi0o0o.I00111O() && ioi0o0o.I001lllioOl() != 1 && (ioi0o0o.I001lllioOl() != 7 ? ioi0o0o.I001IIilI0O() : ioi0o0o.I001l0I00() != 0)) {
/* 44 */                int iI001lllioOl = ioi0o0o.I001lllioOl();
/* 48 */                boolean zI001i1lo1io = ioi0o0o.I001i1lo1io();
/* 71 */                String strI001IO000 = (zI001i1lo1io || iI001lllioOl == 2 || iI001lllioOl == 7) ? ioi0o0o.I001IO000() : ioi0o0o.I001IO000().toUpperCase(Locale.ENGLISH);
/* 79 */                if (ioi0o0o.I001l0I00() == 0) {
/* 81 */                    listI001iOo1i0O = null;
                        } else {
/* 83 */                    listI001iOo1i0O = ioi0o0o.I001iOo1i0O();
/* 87 */                    if (!zI001i1lo1io) {
/* 95 */                        ArrayList arrayList = new ArrayList(listI001iOo1i0O.size());
/* 98 */                        Iterator it = listI001iOo1i0O.iterator();
/* 106 */                       while (it.hasNext()) {
/* 120 */                           arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                                }
/* 124 */                       listI001iOo1i0O = Collections.unmodifiableList(arrayList);
                            }
                        }
/* 132 */               String str2 = iI001lllioOl == 2 ? strI001IO000 : null;
/* 133 */               if (iI001lllioOl != 7 ? strI001IO000 != null : listI001iOo1i0O != null && !listI001iOo1i0O.isEmpty()) {
/* 147 */                   if (!zI001i1lo1io && iI001lllioOl != 2) {
/* 153 */                       str = str.toUpperCase(Locale.ENGLISH);
                            }
                            switch (iI001lllioOl - 1) {
                                case 1:
/* 211 */                           if (str2 != null) {
                                        try {
/* 232 */                                   return Boolean.valueOf(Pattern.compile(str2, true != zI001i1lo1io ? 66 : 0).matcher(str).matches());
                                        } catch (PatternSyntaxException unused) {
/* 237 */                                   if (l01o0io1ooo0 != null) {
/* 243 */                                       l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Invalid regular expression in REGEXP audience filter. expression", str2);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
/* 206 */                           return Boolean.valueOf(str.startsWith(strI001IO000));
                                case 3:
/* 197 */                           return Boolean.valueOf(str.endsWith(strI001IO000));
                                case 4:
/* 188 */                           return Boolean.valueOf(str.contains(strI001IO000));
                                case 5:
/* 179 */                           return Boolean.valueOf(str.equals(strI001IO000));
                                case 6:
/* 163 */                           if (listI001iOo1i0O != null) {
/* 170 */                               return Boolean.valueOf(listI001iOo1i0O.contains(str));
                                    }
                                    break;
                            }
                        }
                    }
/* 4 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Boolean I0000oI00(BigDecimal bigDecimal, ioIoo01l0o ioioo01l0o, double d) {
                    BigDecimal bigDecimal2;
                    BigDecimal bigDecimal3;
                    BigDecimal bigDecimal4;
                    int i;
/* 1 */             lII0I0I000I.I000II(ioioo01l0o);
/* 9 */             if (ioioo01l0o.I00111O()) {
/* 16 */                if (ioioo01l0o.I00II0Ol1O0l() != 1 && (ioioo01l0o.I00II0Ol1O0l() != 5 ? ioioo01l0o.I001i1O0Ol() : ioioo01l0o.I001iOo1i0O() && ioioo01l0o.I001lIiIIo1O())) {
/* 49 */                    int iI00II0Ol1O0l = ioioo01l0o.I00II0Ol1O0l();
                            try {
/* 57 */                        if (ioioo01l0o.I00II0Ol1O0l() == 5) {
/* 67 */                            if (lio010i.I01I1Oo0oll(ioioo01l0o.I001l0I00()) && lio010i.I01I1Oo0oll(ioioo01l0o.I001lllioOl())) {
/* 87 */                                BigDecimal bigDecimal5 = new BigDecimal(ioioo01l0o.I001l0I00());
/* 96 */                                bigDecimal4 = new BigDecimal(ioioo01l0o.I001lllioOl());
/* 99 */                                bigDecimal3 = bigDecimal5;
/* 100 */                               bigDecimal2 = null;
/* 125 */                               if (iI00II0Ol1O0l == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                            i = iI00II0Ol1O0l - 1;
/* 137 */                                   if (i != 1) {
/* 140 */                                       if (i != 2) {
/* 143 */                                           if (i != 3) {
/* 146 */                                               if (i == 4 && bigDecimal3 != null) {
/* 166 */                                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                                        }
                                                    } else if (bigDecimal2 != null) {
/* 179 */                                               if (d != 0.0d) {
/* 231 */                                                   return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                                        }
/* 244 */                                               return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                                    }
                                                } else if (bigDecimal2 != null) {
/* 260 */                                           return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                                }
                                            } else if (bigDecimal2 != null) {
/* 276 */                                       return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                            }
                                        }
                                    }
                                } else if (lio010i.I01I1Oo0oll(ioioo01l0o.I001i1lo1io())) {
/* 120 */                           bigDecimal2 = new BigDecimal(ioioo01l0o.I001i1lo1io());
/* 123 */                           bigDecimal3 = null;
/* 124 */                           bigDecimal4 = null;
/* 125 */                           if (iI00II0Ol1O0l == 5) {
                                        i = iI00II0Ol1O0l - 1;
/* 137 */                               if (i != 1) {
                                        }
                                    } else {
                                        i = iI00II0Ol1O0l - 1;
/* 137 */                               if (i != 1) {
                                        }
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
/* 8 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x03d1  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x03da A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:169:0x03dc  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean I00000oIO(Long l, Long l2, l0l1iIIOl l0l1iiiol, long j, ii01Ioio01i ii01ioio01i, boolean z) {
                    boolean z2;
                    l01O0IO1ooO0 l01o0io1ooo0;
                    Boolean boolI0000oI00;
                    Boolean boolI0000oI002;
                    long j2;
                    Boolean boolI0000oI003;
                    Boolean boolI0000oI004;
                    int i;
/* 3 */             iIIOllOi.I00000oIO();
/* 6 */             i1lioiII i1lioiii = this.I000O01llI0;
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) i1lioiii.I00iOIl;
/* 12 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 14 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 16 */            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 18 */            iol01I0001 iol01i0001 = iol1II1ii1i.I00oOio10iI1;
/* 20 */            String str = this.I00000oIO;
/* 22 */            boolean zI01101IOlO = iil1iil.I01101IOlO(str, iol01i0001);
/* 28 */            ioI0OO10 ioi0oo10 = (ioI0OO10) this.I000OOo1O;
/* 41 */            long j3 = ioi0oo10.I00II0oii1o() ? ii01ioio01i.I0000oI00 : j;
/* 43 */            l0olllO1i.I000II(l01o0io1ooo02);
/* 46 */            IOloiOI1 iOloiOI1 = l01o0io1ooo02.I00lll10;
/* 48 */            IOloiOI1 iOloiOI12 = l01o0io1ooo02.I00l0I0l0lO1;
/* 55 */            boolean zIsLoggable = Log.isLoggable(l01o0io1ooo02.I010l1O(), 2);
/* 59 */            int i2 = this.I00000oOI;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            bool = null;
/* 61 */            Boolean bool = null;
/* 63 */            if (zIsLoggable) {
/* 65 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 101 */               iOloiOI1.I0000oI00("Evaluating filter. audience, filter, event", Integer.valueOf(i2), ioi0oo10.I00111O() ? Integer.valueOf(ioi0oo10.I001IIilI0O()) : null, l00i1l00olio.I00000oIO(ioi0oo10.I001IO000()));
/* 104 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 109 */               lio010i lio010iVar = i1lioiii.I00iiI.I00io1l;
/* 111 */               lilOOl0.I00O0o1oo(lio010iVar);
/* 116 */               StringBuilder sb = new StringBuilder();
/* 121 */               sb.append("\nevent_filter {\n");
/* 128 */               if (ioi0oo10.I00111O()) {
/* 140 */                   i = 0;
/* 141 */                   lio010i.I011iIOio(sb, 0, "filter_id", Integer.valueOf(ioi0oo10.I001IIilI0O()));
                        } else {
/* 145 */                   i = 0;
                        }
/* 162 */               lio010i.I011iIOio(sb, i, "event_name", ((l0olllO1i) lio010iVar.I00iOIl).I00l0OO0IO.I00000oIO(ioi0oo10.I001IO000()));
/* 177 */               String strI011IOil = lio010i.I011IOil(ioi0oo10.I001lllioOl(), ioi0oo10.I001lloI(), ioi0oo10.I00II0oii1o());
/* 185 */               if (!strI011IOil.isEmpty()) {
/* 190 */                   lio010i.I011iIOio(sb, 0, "filter_type", strI011IOil);
                        }
/* 197 */               if (ioi0oo10.I001l0I00()) {
/* 206 */                   lio010i.I011iO(sb, 1, "event_count_filter", ioi0oo10.I001lIiIIo1O());
                        }
/* 213 */               if (ioi0oo10.I001i1lo1io() > 0) {
/* 217 */                   sb.append("  filters {\n");
/* 224 */                   Iterator it = ioi0oo10.I001i1O0Ol().iterator();
/* 232 */                   while (it.hasNext()) {
/* 241 */                       lio010iVar.I0110o(sb, 2, (ioIO1Io0o) it.next());
                            }
                        }
/* 246 */               lio010i.I0111i(1, sb);
/* 251 */               sb.append("}\n}\n");
/* 260 */               iOloiOI1.I0000Il00O("Filter definition", sb.toString());
                    }
/* 267 */           if (!ioi0oo10.I00111O() || ioi0oo10.I001IIilI0O() > 256) {
/* 1054 */              l0olllO1i.I000II(l01o0io1ooo02);
/* 1081 */              iOloiOI12.I0000O(l01O0IO1ooO0.I010ioo(str), "Invalid event filter ID. appId, id", String.valueOf(ioi0oo10.I00111O() ? Integer.valueOf(ioi0oo10.I001IIilI0O()) : null));
/* 1084 */              return false;
                    }
/* 301 */           boolean z3 = ioi0oo10.I001lllioOl() || ioi0oo10.I001lloI() || ioi0oo10.I00II0oii1o();
/* 302 */           if (z && !z3) {
/* 306 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 331 */               iOloiOI1.I0000O(Integer.valueOf(i2), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", ioi0oo10.I00111O() ? Integer.valueOf(ioi0oo10.I001IIilI0O()) : null);
/* 334 */               return true;
                    }
/* 336 */           String strI001iOo1i0O = l0l1iiiol.I001iOo1i0O();
/* 346 */           if (ioi0oo10.I001l0I00()) {
                        try {
/* 357 */                   boolI0000oI004 = I0000oI00(new BigDecimal(j3), ioi0oo10.I001lIiIIo1O(), 0.0d);
                        } catch (NumberFormatException unused) {
/* 362 */                   boolI0000oI004 = null;
                        }
/* 364 */               if (boolI0000oI004 != null) {
/* 376 */                   if (boolI0000oI004.booleanValue()) {
/* 383 */                       HashSet hashSet = new HashSet();
/* 390 */                       Iterator it2 = ioi0oo10.I001i1O0Ol().iterator();
                                while (true) {
/* 398 */                           if (!it2.hasNext()) {
/* 440 */                               I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 447 */                               Iterator it3 = l0l1iiiol.I001IO000().iterator();
                                        while (true) {
/* 455 */                                   if (!it3.hasNext()) {
/* 579 */                                       Iterator it4 = ioi0oo10.I001i1O0Ol().iterator();
                                                while (true) {
/* 587 */                                           if (!it4.hasNext()) {
/* 964 */                                               z2 = zI01101IOlO;
/* 966 */                                               l01o0io1ooo0 = l01o0io1ooo02;
/* 968 */                                               bool = Boolean.TRUE;
                                                        break;
                                                    }
/* 593 */                                           ioIO1Io0o ioio1io0o = (ioIO1Io0o) it4.next();
/* 609 */                                           boolean z4 = ioio1io0o.I001i1lo1io() && ioio1io0o.I001iOo1i0O();
/* 610 */                                           String strI001lIiIIo1O = ioio1io0o.I001lIiIIo1O();
/* 618 */                                           if (strI001lIiIIo1O.isEmpty()) {
/* 620 */                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 629 */                                               iOloiOI12.I0000Il00O("Event has empty param name. event", l00i1l00olio.I00000oIO(strI001iOo1i0O));
                                                        break;
                                                    }
/* 634 */                                           Object obj = i1Io0i0II.get(strI001lIiIIo1O);
/* 640 */                                           if (obj instanceof Long) {
/* 646 */                                               if (!ioio1io0o.I001IO000()) {
/* 648 */                                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 661 */                                                   iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "No number filter for long param. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
                                                            break;
                                                        }
                                                        try {
/* 683 */                                                   boolI0000oI00 = I0000oI00(new BigDecimal(((Long) obj).longValue()), ioio1io0o.I001i1O0Ol(), 0.0d);
                                                        } catch (NumberFormatException unused2) {
/* 688 */                                                   boolI0000oI00 = null;
                                                        }
/* 690 */                                               if (boolI0000oI00 == null) {
                                                            break;
                                                        }
/* 698 */                                               if (boolI0000oI00.booleanValue() == z4) {
/* 700 */                                                   bool = Boolean.FALSE;
                                                            break;
                                                        }
                                                    } else if (obj instanceof Double) {
/* 715 */                                               if (!ioio1io0o.I001IO000()) {
/* 717 */                                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 730 */                                                   iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "No number filter for double param. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
                                                            break;
                                                        }
/* 737 */                                               double dDoubleValue = ((Double) obj).doubleValue();
                                                        try {
/* 754 */                                                   boolI0000oI002 = I0000oI00(new BigDecimal(dDoubleValue), ioio1io0o.I001i1O0Ol(), Math.ulp(dDoubleValue));
                                                        } catch (NumberFormatException unused3) {
/* 759 */                                                   boolI0000oI002 = null;
                                                        }
/* 761 */                                               if (boolI0000oI002 == null) {
                                                            break;
                                                        }
/* 769 */                                               if (boolI0000oI002.booleanValue() == z4) {
/* 771 */                                                   bool = Boolean.FALSE;
                                                            break;
                                                        }
                                                    } else if (obj instanceof String) {
/* 783 */                                               if (!ioio1io0o.I00111O()) {
/* 809 */                                                   if (!ioio1io0o.I001IO000()) {
/* 901 */                                                       z2 = zI01101IOlO;
/* 903 */                                                       l01o0io1ooo0 = l01o0io1ooo02;
/* 905 */                                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 918 */                                                       iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "No filter for String param. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
                                                                break;
                                                            }
/* 811 */                                                   String str2 = (String) obj;
/* 817 */                                                   if (!lio010i.I01I1Oo0oll(str2)) {
/* 880 */                                                       z2 = zI01101IOlO;
/* 882 */                                                       l01o0io1ooo0 = l01o0io1ooo02;
/* 884 */                                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 897 */                                                       iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "Invalid param value for number filter. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
                                                                break;
                                                            }
/* 819 */                                                   ioIoo01l0o ioioo01l0oI001i1O0Ol = ioio1io0o.I001i1O0Ol();
/* 827 */                                                   if (lio010i.I01I1Oo0oll(str2)) {
                                                                try {
/* 841 */                                                           z2 = zI01101IOlO;
/* 843 */                                                           l01o0io1ooo0 = l01o0io1ooo02;
/* 845 */                                                           j2 = 0;
                                                                } catch (NumberFormatException unused4) {
/* 852 */                                                           z2 = zI01101IOlO;
/* 854 */                                                           l01o0io1ooo0 = l01o0io1ooo02;
/* 856 */                                                           j2 = 0;
                                                                }
                                                                try {
/* 847 */                                                           boolI0000oI003 = I0000oI00(new BigDecimal(str2), ioioo01l0oI001i1O0Ol, 0.0d);
                                                                } catch (NumberFormatException unused5) {
/* 858 */                                                           boolI0000oI003 = null;
/* 860 */                                                           if (boolI0000oI003 == null) {
                                                                    }
/* 970 */                                                           l0olllO1i.I000II(l01o0io1ooo0);
/* 982 */                                                           iOloiOI1.I0000Il00O("Event filter result", bool != null ? "null" : bool);
/* 985 */                                                           if (bool != null) {
                                                                    }
                                                                }
/* 860 */                                                       if (boolI0000oI003 == null) {
                                                                    break;
                                                                }
/* 868 */                                                       if (boolI0000oI003.booleanValue() == z4) {
/* 870 */                                                           bool = Boolean.FALSE;
                                                                    break;
                                                                }
/* 874 */                                                       l01o0io1ooo02 = l01o0io1ooo0;
/* 876 */                                                       zI01101IOlO = z2;
                                                            } else {
/* 829 */                                                       z2 = zI01101IOlO;
/* 831 */                                                       l01o0io1ooo0 = l01o0io1ooo02;
/* 833 */                                                       boolI0000oI003 = null;
                                                            }
                                                        } else {
/* 787 */                                                   ioi0O0o ioi0o0oI001IIilI0O = ioio1io0o.I001IIilI0O();
/* 791 */                                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 794 */                                                   boolI0000oI003 = I0000O((String) obj, ioi0o0oI001IIilI0O, l01o0io1ooo02);
/* 798 */                                                   z2 = zI01101IOlO;
/* 800 */                                                   l01o0io1ooo0 = l01o0io1ooo02;
                                                        }
/* 802 */                                               j2 = 0;
/* 860 */                                               if (boolI0000oI003 == null) {
                                                        }
                                                    } else {
/* 922 */                                               z2 = zI01101IOlO;
/* 924 */                                               l01o0io1ooo0 = l01o0io1ooo02;
/* 926 */                                               if (obj == null) {
/* 928 */                                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 941 */                                                   iOloiOI1.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "Missing param for filter. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
/* 944 */                                                   bool = Boolean.FALSE;
                                                        } else {
/* 947 */                                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 960 */                                                   iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "Unknown param type. event, param", l00i1l00olio.I00000oOI(strI001lIiIIo1O));
                                                        }
                                                    }
                                                }
                                            } else {
/* 461 */                                       l0lliIlIO l0lliilio = (l0lliIlIO) it3.next();
/* 471 */                                       if (hashSet.contains(l0lliilio.I001IIilI0O())) {
/* 477 */                                           if (!l0lliilio.I001i1lo1io()) {
/* 508 */                                               if (!l0lliilio.I001lllioOl()) {
/* 539 */                                                   if (!l0lliilio.I001IO000()) {
/* 553 */                                                       l0olllO1i.I000II(l01o0io1ooo02);
/* 570 */                                                       iOloiOI12.I0000O(l00i1l00olio.I00000oIO(strI001iOo1i0O), "Unknown value for param. event, param", l00i1l00olio.I00000oOI(l0lliilio.I001IIilI0O()));
                                                                break;
                                                            }
/* 549 */                                                   i1Io0i0II.put(l0lliilio.I001IIilI0O(), l0lliilio.I001i1O0Ol());
                                                        } else {
/* 531 */                                                   i1Io0i0II.put(l0lliilio.I001IIilI0O(), l0lliilio.I001lllioOl() ? Double.valueOf(l0lliilio.I001lloI()) : null);
                                                        }
                                                    } else {
/* 500 */                                               i1Io0i0II.put(l0lliilio.I001IIilI0O(), l0lliilio.I001i1lo1io() ? Long.valueOf(l0lliilio.I001iOo1i0O()) : null);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
/* 404 */                               ioIO1Io0o ioio1io0o2 = (ioIO1Io0o) it2.next();
/* 414 */                               if (ioio1io0o2.I001lIiIIo1O().isEmpty()) {
/* 416 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 425 */                                   iOloiOI12.I0000Il00O("null or empty param name in filter. event", l00i1l00olio.I00000oIO(strI001iOo1i0O));
                                            break;
                                        }
/* 433 */                               hashSet.add(ioio1io0o2.I001lIiIIo1O());
                                    }
                                }
                            } else {
/* 378 */                       bool = Boolean.FALSE;
                            }
                        }
/* 366 */               z2 = zI01101IOlO;
/* 368 */               l01o0io1ooo0 = l01o0io1ooo02;
                    }
/* 970 */           l0olllO1i.I000II(l01o0io1ooo0);
/* 982 */           iOloiOI1.I0000Il00O("Event filter result", bool != null ? "null" : bool);
/* 985 */           if (bool != null) {
/* 987 */               return false;
                    }
/* 989 */           Boolean bool2 = Boolean.TRUE;
/* 991 */           this.I0000Il00O = bool2;
/* 997 */           if (!bool.booleanValue()) {
/* 999 */               return true;
                    }
/* 1001 */          this.I0000O = bool2;
/* 1003 */          if (!z3 || !l0l1iiiol.I001l0I00()) {
/* 999 */               return true;
                    }
/* 1015 */          Long lValueOf = Long.valueOf(l0l1iiiol.I001lIiIIo1O());
/* 1023 */          if (ioi0oo10.I001lloI()) {
/* 1025 */              if (z2 && ioi0oo10.I001l0I00()) {
/* 1034 */                  lValueOf = l;
                        }
/* 1036 */              this.I0001Ioi1lo = lValueOf;
/* 999 */               return true;
                    }
/* 1039 */          if (z2 && ioi0oo10.I001l0I00()) {
/* 1048 */              lValueOf = l2;
                    }
/* 1050 */          this.I0000oI00 = lValueOf;
/* 999 */           return true;
                }

                public boolean I00000oOI(Long l, Long l2, l1IOl1iI00l l1iol1ii00l, boolean z) {
                    boolean z2;
                    Boolean boolI0000Il00O;
                    Boolean boolI0000oI00;
                    Boolean boolI0000oI002;
                    Boolean boolI0000oI003;
/* 1 */             iIIOllOi.I00000oIO();
/* 8 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I000O01llI0.I00iOIl;
/* 10 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 12 */            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 14 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 20 */            boolean zI01101IOlO = iil1iil.I01101IOlO(this.I00000oIO, iol1II1ii1i.I00oIiI10);
/* 26 */            ioOIO1il0i iooio1il0i = (ioOIO1il0i) this.I000OOo1O;
/* 28 */            boolean zI001i1lo1io = iooio1il0i.I001i1lo1io();
/* 32 */            boolean zI001iOo1i0O = iooio1il0i.I001iOo1i0O();
/* 36 */            boolean zI001lIiIIo1O = iooio1il0i.I001lIiIIo1O();
/* 50 */            boolean z3 = zI001i1lo1io || zI001iOo1i0O || zI001lIiIIo1O;
/* 51 */            if (z && !z3) {
/* 55 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 84 */                l01o0io1ooo0.I00lll10.I0000O(Integer.valueOf(this.I00000oOI), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", iooio1il0i.I00111O() ? Integer.valueOf(iooio1il0i.I001IIilI0O()) : null);
/* 41 */                return true;
                    }
/* 88 */            ioIO1Io0o ioio1io0oI001i1O0Ol = iooio1il0i.I001i1O0Ol();
/* 92 */            boolean zI001iOo1i0O2 = ioio1io0oI001i1O0Ol.I001iOo1i0O();
/* 102 */           if (!l1iol1ii00l.I001iOo1i0O()) {
/* 158 */               z2 = zI001lIiIIo1O;
/* 163 */               if (!l1iol1ii00l.I001lloI()) {
/* 223 */                   if (!l1iol1ii00l.I001i1O0Ol()) {
/* 340 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 355 */                       l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("User property has no value, property", l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()));
                            } else if (ioio1io0oI001i1O0Ol.I00111O()) {
/* 320 */                       String strI001i1lo1io = l1iol1ii00l.I001i1lo1io();
/* 324 */                       ioi0O0o ioi0o0oI001IIilI0O = ioio1io0oI001i1O0Ol.I001IIilI0O();
/* 328 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 335 */                       boolI0000Il00O = I0000Il00O(I0000O(strI001i1lo1io, ioi0o0oI001IIilI0O, l01o0io1ooo0), zI001iOo1i0O2);
                            } else if (!ioio1io0oI001i1O0Ol.I001IO000()) {
/* 237 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 252 */                       l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("No string or number filter defined. property", l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()));
                            } else if (lio010i.I01I1Oo0oll(l1iol1ii00l.I001i1lo1io())) {
/* 266 */                       String strI001i1lo1io2 = l1iol1ii00l.I001i1lo1io();
/* 270 */                       ioIoo01l0o ioioo01l0oI001i1O0Ol = ioio1io0oI001i1O0Ol.I001i1O0Ol();
/* 278 */                       if (lio010i.I01I1Oo0oll(strI001i1lo1io2)) {
                                    try {
/* 287 */                               boolI0000oI00 = I0000oI00(new BigDecimal(strI001i1lo1io2), ioioo01l0oI001i1O0Ol, 0.0d);
                                    } catch (NumberFormatException unused) {
                                    }
/* 291 */                           boolI0000Il00O = I0000Il00O(boolI0000oI00, zI001iOo1i0O2);
                                } else {
/* 280 */                           boolI0000oI00 = null;
/* 291 */                           boolI0000Il00O = I0000Il00O(boolI0000oI00, zI001iOo1i0O2);
                                }
                            } else {
/* 296 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 315 */                       l01o0io1ooo0.I00l0I0l0lO1.I0000O(l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()), "Invalid user property value for Numeric number filter. property, value", l1iol1ii00l.I001i1lo1io());
                            }
/* 129 */                   boolI0000Il00O = null;
                        } else if (ioio1io0oI001i1O0Ol.I001IO000()) {
/* 190 */                   double dI00II0Ol1O0l = l1iol1ii00l.I00II0Ol1O0l();
                            try {
/* 207 */                       boolI0000oI002 = I0000oI00(new BigDecimal(dI00II0Ol1O0l), ioio1io0oI001i1O0Ol.I001i1O0Ol(), Math.ulp(dI00II0Ol1O0l));
                            } catch (NumberFormatException unused2) {
/* 212 */                       boolI0000oI002 = null;
                            }
/* 213 */                   boolI0000Il00O = I0000Il00O(boolI0000oI002, zI001iOo1i0O2);
                        } else {
/* 171 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 186 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("No number filter for double property. property", l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()));
/* 129 */                   boolI0000Il00O = null;
                        }
                    } else if (ioio1io0oI001i1O0Ol.I001IO000()) {
/* 132 */               z2 = zI001lIiIIo1O;
                        try {
/* 146 */                   boolI0000oI003 = I0000oI00(new BigDecimal(l1iol1ii00l.I001l0I00()), ioio1io0oI001i1O0Ol.I001i1O0Ol(), 0.0d);
                        } catch (NumberFormatException unused3) {
/* 151 */                   boolI0000oI003 = null;
                        }
/* 152 */               boolI0000Il00O = I0000Il00O(boolI0000oI003, zI001iOo1i0O2);
                    } else {
/* 110 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 125 */               l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("No number filter for long property. property", l00i1l00olio.I0000Il00O(l1iol1ii00l.I001IO000()));
/* 128 */               z2 = zI001lIiIIo1O;
/* 129 */               boolI0000Il00O = null;
                    }
/* 360 */           l0olllO1i.I000II(l01o0io1ooo0);
/* 373 */           l01o0io1ooo0.I00lll10.I0000Il00O("Property filter result", boolI0000Il00O == null ? "null" : boolI0000Il00O);
/* 376 */           if (boolI0000Il00O == null) {
/* 40 */                return false;
                    }
/* 381 */           this.I0000Il00O = Boolean.TRUE;
/* 383 */           if (!z2 || boolI0000Il00O.booleanValue()) {
/* 392 */               if (!z || iooio1il0i.I001i1lo1io()) {
/* 400 */                   this.I0000O = boolI0000Il00O;
                        }
/* 406 */               if (boolI0000Il00O.booleanValue() && z3 && l1iol1ii00l.I00111O()) {
/* 416 */                   long jI001IIilI0O = l1iol1ii00l.I001IIilI0O();
/* 420 */                   if (l != null) {
/* 422 */                       jI001IIilI0O = l.longValue();
                            }
/* 426 */                   if (zI01101IOlO && iooio1il0i.I001i1lo1io() && !iooio1il0i.I001iOo1i0O() && l2 != null) {
/* 442 */                       jI001IIilI0O = l2.longValue();
                            }
/* 450 */                   if (iooio1il0i.I001iOo1i0O()) {
/* 456 */                       this.I0001Ioi1lo = Long.valueOf(jI001IIilI0O);
                            } else {
/* 463 */                       this.I0000oI00 = Long.valueOf(jI001IIilI0O);
                            }
                        }
                    }
/* 41 */            return true;
                }
            }
