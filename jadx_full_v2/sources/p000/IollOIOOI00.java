            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            
            public final class IollOIOOI00 {
                public BitSet I00000oIO;
                public HashMap I00000oOI;
                public IoloOio0I I0000Il00O;
                public HashMap I0000O;
                public iOlI10l I0000oI00;
                public boolean I0001Ioi1lo;
                public int I000II;
                public IiIoiiOoIi I000O01llI0;
                public II1oo0l11IOI I000OOo1O;

                public static void I00000oIO(char c, IiIolo iiIolo, HashMap map) {
/* 11 */            if (((IiIolo) map.put(Character.valueOf(c), iiIolo)) == null) {
/* 13 */                return;
                    }
/* 22 */            I000II.I000iOII(IIlIOloOOO.I000oI1ioi(c, "Delimiter processor conflict with delimiter char '", "'"));
                }

                public static void I00000oOI(Iterable iterable, HashMap map) {
                    OlIl01 olIl01;
/* 1 */             Iterator it = iterable.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                IiIolo iiIolo = (IiIolo) it.next();
/* 17 */                char cI0000O = iiIolo.I0000O();
/* 21 */                char cI00000oOI = iiIolo.I00000oOI();
/* 25 */                if (cI0000O == cI00000oOI) {
/* 35 */                    IiIolo iiIolo2 = (IiIolo) map.get(Character.valueOf(cI0000O));
/* 37 */                    if (iiIolo2 == null || iiIolo2.I0000O() != iiIolo2.I00000oOI()) {
/* 91 */                        I00000oIO(cI0000O, iiIolo, map);
                            } else {
/* 51 */                        if (iiIolo2 instanceof OlIl01) {
/* 53 */                            olIl01 = (OlIl01) iiIolo2;
                                } else {
/* 58 */                            OlIl01 olIl012 = new OlIl01();
/* 62 */                            olIl012.I00000oOI = 0;
/* 69 */                            olIl012.I0000Il00O = new LinkedList();
/* 71 */                            olIl012.I00000oIO = cI0000O;
/* 73 */                            VarHandle.storeStoreFence();
/* 76 */                            olIl012.I0000oI00(iiIolo2);
/* 79 */                            olIl01 = olIl012;
                                }
/* 80 */                        olIl01.I0000oI00(iiIolo);
/* 87 */                        map.put(Character.valueOf(cI0000O), olIl01);
                            }
                        } else {
/* 95 */                    I00000oIO(cI0000O, iiIolo, map);
/* 98 */                    I00000oIO(cI00000oOI, iiIolo, map);
                        }
                    }
                }

                public static OloOO10o I000OOo1O(OlII11110Iol olII11110Iol) {
/* 7 */             OloOO10o oloOO10o = new OloOO10o(olII11110Iol.I00000oIO());
/* 14 */            oloOO10o.I000II(olII11110Iol.I00000oOI());
/* 49 */            return oloOO10o;
                }

                public final void I0000Il00O(OIIl1OIol oIIl1OIol) {
/* 1 */             OIIl1OIol oIIl1OIol2 = oIIl1OIol.I00000oOI;
/* 3 */             if (oIIl1OIol2 == null) {
/* 5 */                 return;
                    }
/* 6 */             OIIl1OIol oIIl1OIol3 = oIIl1OIol.I0000Il00O;
/* 10 */            OloOO10o oloOO10o = null;
/* 11 */            OloOO10o oloOO10o2 = null;
/* 12 */            int length = 0;
/* 13 */            while (oIIl1OIol2 != null) {
/* 17 */                if (oIIl1OIol2 instanceof OloOO10o) {
/* 20 */                    oloOO10o2 = oIIl1OIol2;
/* 22 */                    if (oloOO10o == null) {
/* 24 */                        oloOO10o = oloOO10o2;
                            }
/* 31 */                    length = oloOO10o2.I000II.length() + length;
                        } else {
/* 34 */                    I0000O(oloOO10o, oloOO10o2, length);
/* 37 */                    I0000Il00O(oIIl1OIol2);
/* 40 */                    oloOO10o = null;
/* 41 */                    oloOO10o2 = null;
/* 42 */                    length = 0;
                        }
/* 43 */                if (oIIl1OIol2 == oIIl1OIol3) {
                            break;
                        } else {
/* 46 */                    oIIl1OIol2 = oIIl1OIol2.I0000oI00;
                        }
                    }
/* 49 */            I0000O(oloOO10o, oloOO10o2, length);
                }

                public final void I0000O(OloOO10o oloOO10o, OloOO10o oloOO10o2, int i) {
                    OO0Ii1 oO0Ii1;
/* 1 */             if (oloOO10o == null || oloOO10o2 == null || oloOO10o == oloOO10o2) {
/* 215 */               return;
                    }
/* 9 */             StringBuilder sb = new StringBuilder(i);
/* 14 */            sb.append(oloOO10o.I000II);
/* 19 */            if (this.I0001Ioi1lo) {
/* 23 */                oO0Ii1 = new OO0Ii1();
/* 30 */                oO0Ii1.I00000oIO(oloOO10o.I0000O());
                    } else {
/* 34 */                oO0Ii1 = null;
                    }
/* 35 */            OIIl1OIol oIIl1OIol = oloOO10o.I0000oI00;
/* 37 */            OIIl1OIol oIIl1OIol2 = oloOO10o2.I0000oI00;
/* 39 */            while (oIIl1OIol != oIIl1OIol2) {
/* 46 */                sb.append(((OloOO10o) oIIl1OIol).I000II);
/* 49 */                if (oO0Ii1 != null) {
/* 55 */                    oO0Ii1.I00000oIO(oIIl1OIol.I0000O());
                        }
/* 58 */                OIIl1OIol oIIl1OIol3 = oIIl1OIol.I0000oI00;
/* 60 */                oIIl1OIol.I000OOo1O();
/* 63 */                oIIl1OIol = oIIl1OIol3;
                    }
/* 69 */            oloOO10o.I000II = sb.toString();
/* 71 */            if (oO0Ii1 != null) {
/* 73 */                List list = oO0Ii1.I00000oIO;
/* 75 */                if (list == null) {
/* 78 */                    list = Collections.EMPTY_LIST;
                        }
/* 80 */                oloOO10o.I000II(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0259  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0319 A[PHI: r7
                  0x0319: PHI (r7v20 char) = (r7v19 char), (r7v23 char), (r7v24 char) binds: [B:160:0x030f, B:162:0x0313, B:165:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:171:0x0329  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x035f  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0367  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x0394  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x03b5  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x03d2  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x0430  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
                /* JADX WARN: Type inference failed for: r11v15 */
                /* JADX WARN: Type inference failed for: r11v16 */
                /* JADX WARN: Type inference failed for: r11v17 */
                /* JADX WARN: Type inference failed for: r11v18 */
                /* JADX WARN: Type inference failed for: r11v3 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v5, types: [int] */
                /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v37, types: [IoOolO11O10, OIIl1OIol] */
                /* JADX WARN: Type inference failed for: r2v41, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v48 */
                /* JADX WARN: Type inference failed for: r2v49 */
                /* JADX WARN: Type inference failed for: r2v50 */
                /* JADX WARN: Type inference failed for: r2v53, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v55, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v6 */
                /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v25 */
                /* JADX WARN: Type inference failed for: r4v26, types: [int] */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r4v59 */
                /* JADX WARN: Type inference failed for: r4v60 */
                /* JADX WARN: Type inference failed for: r4v61 */
                /* JADX WARN: Type inference failed for: r4v62 */
                /* JADX WARN: Type inference failed for: r8v40, types: [IollO11] */
                /* JADX WARN: Type inference failed for: r8v42 */
                /* JADX WARN: Type inference failed for: r8v49 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(OlII11110Iol olII11110Iol, OIIl1OIol oIIl1OIol) {
                    ?? SingletonList;
                    OloOO10o oloOO10oI000OOo1O;
                    String strI00000oOI;
                    O0ooOoi1Oo1 o0ooOoi1Oo1;
                    String strI00000oIO;
                    String strI00000oIO2;
                    OIIl1OIol oIIl1OIolI000OOo1O;
                    IiIolo iiIolo;
                    ?? codePoint;
                    iOlI10l ioli10l;
                    boolean z;
                    boolean z2;
                    ?? r8;
/* 9 */             ArrayList arrayList = olII11110Iol.I00iOIl;
/* 11 */            iOlI10l ioli10l2 = new iOlI10l();
/* 16 */            String strI00000oOI2 = null;
/* 21 */            ioli10l2.I0000O = OlII0Io1.I00000oIO("", null);
/* 23 */            boolean z3 = false;
/* 24 */            ioli10l2.I0000oI00 = 0;
/* 26 */            ioli10l2.I0000Il00O = arrayList;
/* 28 */            ioli10l2.I00000oIO = 0;
/* 30 */            ioli10l2.I00000oOI = 0;
/* 36 */            if (!arrayList.isEmpty()) {
/* 38 */                ioli10l2.I00000oIO(0, 0);
/* 45 */                OlII0Io1 olII0Io1 = (OlII0Io1) arrayList.get(0);
/* 47 */                ioli10l2.I0000O = olII0Io1;
/* 55 */                ioli10l2.I0000oI00 = olII0Io1.I00000oIO.length();
                    }
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            this.I0000oI00 = ioli10l2;
/* 72 */            this.I0001Ioi1lo = !olII11110Iol.I00000oOI().isEmpty();
/* 74 */            this.I000II = 0;
/* 76 */            this.I000O01llI0 = null;
/* 78 */            this.I000OOo1O = null;
                    while (true) {
/* 82 */                char cI000OiO = this.I0000oI00.I000OiO();
/* 86 */                if (cI000OiO != 0) {
/* 88 */                    ?? codePoint2 = 10;
/* 90 */                    if (cI000OiO == '\n') {
/* 1222 */                      this.I0000oI00.I000II();
/* 1241 */                      SingletonList = Collections.singletonList(this.I000II >= 2 ? new Io1I1OI0Ool() : new Ol1oolOiiiii());
                            } else if (cI000OiO == '!') {
/* 1153 */                      IIOOoI iIOOoII000iOII = this.I0000oI00.I000iOII();
/* 1159 */                      this.I0000oI00.I000II();
/* 1164 */                      boolean zI000O01llI0 = this.I0000oI00.I000O01llI0('[');
/* 1168 */                      iOlI10l ioli10l3 = this.I0000oI00;
/* 1170 */                      if (zI000O01llI0) {
/* 1172 */                          IIOOoI iIOOoII000iOII2 = ioli10l3.I000iOII();
/* 1182 */                          oloOO10oI000OOo1O = I000OOo1O(this.I0000oI00.I0000Il00O(iIOOoII000iOII, iIOOoII000iOII2));
/* 1186 */                          II1oo0l11IOI iI1oo0l11IOI = this.I000OOo1O;
/* 1193 */                          II1oo0l11IOI iI1oo0l11IOI2 = new II1oo0l11IOI(oloOO10oI000OOo1O, iIOOoII000iOII, iIOOoII000iOII2, iI1oo0l11IOI, this.I000O01llI0, true);
/* 1196 */                          if (iI1oo0l11IOI != null) {
/* 1198 */                              iI1oo0l11IOI.I0000Il00O = true;
                                    }
/* 1200 */                          this.I000OOo1O = iI1oo0l11IOI2;
                                } else {
/* 1211 */                          oloOO10oI000OOo1O = I000OOo1O(ioli10l3.I0000Il00O(iIOOoII000iOII, ioli10l3.I000iOII()));
                                }
/* 1215 */                      SingletonList = Collections.singletonList(oloOO10oI000OOo1O);
                            } else if (cI000OiO == '[') {
/* 1105 */                      IIOOoI iIOOoII000iOII3 = this.I0000oI00.I000iOII();
/* 1111 */                      this.I0000oI00.I000II();
/* 1116 */                      IIOOoI iIOOoII000iOII4 = this.I0000oI00.I000iOII();
/* 1126 */                      OloOO10o oloOO10oI000OOo1O2 = I000OOo1O(this.I0000oI00.I0000Il00O(iIOOoII000iOII3, iIOOoII000iOII4));
/* 1130 */                      II1oo0l11IOI iI1oo0l11IOI3 = this.I000OOo1O;
/* 1137 */                      II1oo0l11IOI iI1oo0l11IOI4 = new II1oo0l11IOI(oloOO10oI000OOo1O2, iIOOoII000iOII3, iIOOoII000iOII4, iI1oo0l11IOI3, this.I000O01llI0, false);
/* 1140 */                      if (iI1oo0l11IOI3 != null) {
/* 1142 */                          iI1oo0l11IOI3.I0000Il00O = true;
                                }
/* 1144 */                      this.I000OOo1O = iI1oo0l11IOI4;
/* 1146 */                      SingletonList = Collections.singletonList(oloOO10oI000OOo1O2);
                            } else if (cI000OiO == ']') {
/* 614 */                       IIOOoI iIOOoII000iOII5 = this.I0000oI00.I000iOII();
/* 620 */                       this.I0000oI00.I000II();
/* 625 */                       IIOOoI iIOOoII000iOII6 = this.I0000oI00.I000iOII();
/* 629 */                       II1oo0l11IOI iI1oo0l11IOI5 = this.I000OOo1O;
/* 631 */                       if (iI1oo0l11IOI5 == null) {
/* 639 */                           oIIl1OIolI000OOo1O = I000OOo1O(this.I0000oI00.I0000Il00O(iIOOoII000iOII5, iIOOoII000iOII6));
                                } else {
/* 647 */                           OloOO10o oloOO10o = (OloOO10o) iI1oo0l11IOI5.I0000O;
/* 649 */                           boolean z4 = iI1oo0l11IOI5.I00000oIO;
/* 653 */                           if (!iI1oo0l11IOI5.I00000oOI) {
/* 659 */                               this.I000OOo1O = (II1oo0l11IOI) iI1oo0l11IOI5.I000II;
/* 667 */                               oIIl1OIolI000OOo1O = I000OOo1O(this.I0000oI00.I0000Il00O(iIOOoII000iOII5, iIOOoII000iOII6));
                                    } else if (this.I0000oI00.I000O01llI0('(')) {
/* 685 */                               this.I0000oI00.I000lI();
/* 688 */                               iOlI10l ioli10l4 = this.I0000oI00;
/* 690 */                               char cI000OiO2 = ioli10l4.I000OiO();
/* 694 */                               IIOOoI iIOOoII000iOII7 = ioli10l4.I000iOII();
/* 702 */                               if (l10i0Ooi.I00000oIO(ioli10l4)) {
/* 707 */                                   if (cI000OiO2 == '<') {
/* 717 */                                       String strI00000oIO3 = ioli10l4.I0000Il00O(iIOOoII000iOII7, ioli10l4.I000iOII()).I00000oIO();
/* 726 */                                       strI00000oIO2 = strI00000oIO3.substring(1, strI00000oIO3.length() - 1);
                                            } else {
/* 739 */                                       strI00000oIO2 = ioli10l4.I0000Il00O(iIOOoII000iOII7, ioli10l4.I000iOII()).I00000oIO();
                                            }
/* 743 */                                   strI00000oOI2 = Il0oolIl0.I00000oOI(strI00000oIO2);
                                        }
/* 747 */                               iOlI10l ioli10l5 = this.I0000oI00;
/* 749 */                               if (strI00000oOI2 == null) {
/* 751 */                                   ioli10l5.I000l1(iIOOoII000iOII6);
/* 754 */                                   strI00000oOI = null;
                                        } else {
/* 763 */                                   if (ioli10l5.I000lI() >= 1) {
/* 765 */                                       iOlI10l ioli10l6 = this.I0000oI00;
/* 767 */                                       IIOOoI iIOOoII000iOII8 = ioli10l6.I000iOII();
/* 775 */                                       if (ioli10l6.I0000O()) {
/* 778 */                                           char cI000OiO3 = ioli10l6.I000OiO();
/* 782 */                                           char c = '\"';
/* 784 */                                           if (cI000OiO3 != '\"') {
/* 786 */                                               c = '\'';
/* 788 */                                               if (cI000OiO3 == '\'') {
/* 794 */                                                   ioli10l6.I000II();
/* 801 */                                                   if (l10i0Ooi.I0000Il00O(ioli10l6, c) && ioli10l6.I0000O()) {
/* 812 */                                                       ioli10l6.I000II();
/* 823 */                                                       String strI00000oIO4 = ioli10l6.I0000Il00O(iIOOoII000iOII8, ioli10l6.I000iOII()).I00000oIO();
/* 836 */                                                       strI00000oOI = Il0oolIl0.I00000oOI(strI00000oIO4.substring(1, strI00000oIO4.length() - 1));
                                                            }
/* 842 */                                                   this.I0000oI00.I000lI();
                                                        } else {
/* 790 */                                                   if (cI000OiO3 == '(') {
/* 793 */                                                       c = ')';
/* 794 */                                                       ioli10l6.I000II();
/* 801 */                                                       if (l10i0Ooi.I0000Il00O(ioli10l6, c)) {
/* 812 */                                                           ioli10l6.I000II();
/* 823 */                                                           String strI00000oIO42 = ioli10l6.I0000Il00O(iIOOoII000iOII8, ioli10l6.I000iOII()).I00000oIO();
/* 836 */                                                           strI00000oOI = Il0oolIl0.I00000oOI(strI00000oIO42.substring(1, strI00000oIO42.length() - 1));
/* 842 */                                                           this.I0000oI00.I000lI();
                                                                }
                                                            }
/* 810 */                                                   strI00000oOI = null;
/* 842 */                                                   this.I0000oI00.I000lI();
                                                        }
                                                    }
                                                } else {
/* 810 */                                           strI00000oOI = null;
/* 842 */                                           this.I0000oI00.I000lI();
                                                }
                                            } else {
/* 846 */                                       strI00000oOI = null;
                                            }
/* 853 */                                   if (!this.I0000oI00.I000O01llI0(')')) {
/* 857 */                                       this.I0000oI00.I000l1(iIOOoII000iOII6);
/* 860 */                                       strI00000oOI = null;
/* 861 */                                       strI00000oOI2 = null;
                                            }
                                        }
/* 862 */                               if (strI00000oOI2 == null) {
/* 864 */                                   iOlI10l ioli10l7 = this.I0000oI00;
/* 870 */                                   if (ioli10l7.I000O01llI0('[')) {
/* 874 */                                       IIOOoI iIOOoII000iOII9 = ioli10l7.I000iOII();
/* 882 */                                       if (l10i0Ooi.I00000oOI(ioli10l7)) {
/* 885 */                                           IIOOoI iIOOoII000iOII10 = ioli10l7.I000iOII();
/* 895 */                                           if (ioli10l7.I000O01llI0(']')) {
/* 902 */                                               strI00000oIO = ioli10l7.I0000Il00O(iIOOoII000iOII9, iIOOoII000iOII10).I00000oIO();
/* 912 */                                               if (strI00000oIO.length() > 999) {
                                                        }
/* 915 */                                               if (strI00000oIO == null) {
                                                        }
/* 922 */                                               if (strI00000oIO != null) {
/* 944 */                                                   strI00000oIO = this.I0000oI00.I0000Il00O((IIOOoI) iI1oo0l11IOI5.I0001Ioi1lo, iIOOoII000iOII5).I00000oIO();
/* 948 */                                                   if (strI00000oIO != null) {
                                                            }
                                                        } else {
/* 944 */                                                   strI00000oIO = this.I0000oI00.I0000Il00O((IIOOoI) iI1oo0l11IOI5.I0001Ioi1lo, iIOOoII000iOII5).I00000oIO();
/* 948 */                                                   if (strI00000oIO != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
/* 872 */                                       strI00000oIO = null;
/* 915 */                                       if (strI00000oIO == null) {
/* 919 */                                           this.I0000oI00.I000l1(iIOOoII000iOII6);
                                                }
/* 922 */                                       if ((strI00000oIO != null || strI00000oIO.isEmpty()) && !iI1oo0l11IOI5.I0000Il00O) {
/* 944 */                                           strI00000oIO = this.I0000oI00.I0000Il00O((IIOOoI) iI1oo0l11IOI5.I0001Ioi1lo, iIOOoII000iOII5).I00000oIO();
                                                }
/* 948 */                                       if (strI00000oIO != null) {
/* 954 */                                           O100010Iili o100010Iili = (O100010Iili) this.I0000Il00O.I00iiO;
/* 956 */                                           o100010Iili.getClass();
/* 969 */                                           O0ool1I00 o0ool1I00 = (O0ool1I00) o100010Iili.I00000oIO.get(Il0oolIl0.I00000oIO(strI00000oIO));
/* 971 */                                           if (o0ool1I00 != null) {
/* 973 */                                               strI00000oOI2 = o0ool1I00.I000O01llI0;
/* 975 */                                               strI00000oOI = o0ool1I00.I000OOo1O;
                                                    }
                                                }
                                            }
                                        }
/* 977 */                               if (strI00000oOI2 == null) {
/* 979 */                                   if (z4) {
/* 983 */                                       ?? ioOolO11O10 = new IoOolO11O10();
/* 986 */                                       ioOolO11O10.I000II = strI00000oOI2;
/* 988 */                                       ioOolO11O10.I000O01llI0 = strI00000oOI;
                                                o0ooOoi1Oo1 = ioOolO11O10;
                                            } else {
/* 993 */                                       o0ooOoi1Oo1 = new O0ooOoi1Oo1(strI00000oOI2, strI00000oOI);
                                            }
/* 996 */                                   OIIl1OIol oIIl1OIol2 = oloOO10o.I0000oI00;
/* 998 */                                   while (oIIl1OIol2 != null) {
/* 1000 */                                      OIIl1OIol oIIl1OIol3 = oIIl1OIol2.I0000oI00;
/* 1002 */                                      o0ooOoi1Oo1.I0000Il00O(oIIl1OIol2);
/* 1005 */                                      oIIl1OIol2 = oIIl1OIol3;
                                            }
/* 1009 */                                  if (this.I0001Ioi1lo) {
/* 1011 */                                      iOlI10l ioli10l8 = this.I0000oI00;
/* 1029 */                                      o0ooOoi1Oo1.I000II(ioli10l8.I0000Il00O((IIOOoI) iI1oo0l11IOI5.I0000oI00, ioli10l8.I000iOII()).I00000oOI());
                                            }
/* 1036 */                                  I000II((IiIoiiOoIi) iI1oo0l11IOI5.I000O01llI0);
/* 1039 */                                  I0000Il00O(o0ooOoi1Oo1);
/* 1042 */                                  oloOO10o.I000OOo1O();
/* 1049 */                                  II1oo0l11IOI iI1oo0l11IOI6 = (II1oo0l11IOI) this.I000OOo1O.I000II;
/* 1051 */                                  this.I000OOo1O = iI1oo0l11IOI6;
/* 1053 */                                  if (!z4) {
/* 1055 */                                      while (iI1oo0l11IOI6 != null) {
/* 1059 */                                          if (!iI1oo0l11IOI6.I00000oIO) {
/* 1062 */                                              iI1oo0l11IOI6.I00000oOI = false;
                                                    }
/* 1068 */                                          iI1oo0l11IOI6 = (II1oo0l11IOI) iI1oo0l11IOI6.I000II;
                                                }
                                            }
/* 1071 */                                  z3 = false;
                                            oIIl1OIolI000OOo1O = o0ooOoi1Oo1;
                                        } else {
/* 1073 */                                  z3 = false;
/* 1080 */                                  this.I000OOo1O = (II1oo0l11IOI) this.I000OOo1O.I000II;
/* 1084 */                                  this.I0000oI00.I000l1(iIOOoII000iOII6);
/* 1093 */                                  oIIl1OIolI000OOo1O = I000OOo1O(this.I0000oI00.I0000Il00O(iIOOoII000iOII5, iIOOoII000iOII6));
                                        }
                                    } else {
/* 860 */                               strI00000oOI = null;
/* 861 */                               strI00000oOI2 = null;
/* 862 */                               if (strI00000oOI2 == null) {
                                        }
/* 977 */                               if (strI00000oOI2 == null) {
                                        }
                                    }
                                }
/* 1097 */                      SingletonList = Collections.singletonList(oIIl1OIolI000OOo1O);
                            } else if (this.I00000oIO.get(cI000OiO)) {
/* 132 */                       List list = (List) this.I0000O.get(Character.valueOf(cI000OiO));
/* 134 */                       if (list != null) {
/* 138 */                           IIOOoI iIOOoII000iOII11 = this.I0000oI00.I000iOII();
/* 142 */                           Iterator it = list.iterator();
/* 150 */                           while (it.hasNext()) {
/* 158 */                               OlOO1i11110 olOO1i11110I00000oIO = ((IollO0) it.next()).I00000oIO(this);
/* 162 */                               if (olOO1i11110I00000oIO != null) {
/* 166 */                                   OIIl1OIol oIIl1OIol4 = (OIIl1OIol) olOO1i11110I00000oIO.I00iiI;
/* 174 */                                   this.I0000oI00.I000l1((IIOOoI) olOO1i11110I00000oIO.I00iiO);
/* 179 */                                   if (this.I0001Ioi1lo && oIIl1OIol4.I0000O().isEmpty()) {
/* 191 */                                       iOlI10l ioli10l9 = this.I0000oI00;
/* 205 */                                       oIIl1OIol4.I000II(ioli10l9.I0000Il00O(iIOOoII000iOII11, ioli10l9.I000iOII()).I00000oOI());
                                            }
/* 208 */                                   SingletonList = Collections.singletonList(oIIl1OIol4);
                                        } else {
/* 216 */                                   this.I0000oI00.I000l1(iIOOoII000iOII11);
                                        }
                                    }
/* 230 */                           iiIolo = (IiIolo) this.I00000oOI.get(Character.valueOf(cI000OiO));
/* 232 */                           if (iiIolo == null) {
/* 606 */                               SingletonList = Collections.singletonList(I0001Ioi1lo());
                                    } else {
/* 234 */                               iOlI10l ioli10l10 = this.I0000oI00;
/* 236 */                               int i = ioli10l10.I00000oOI;
/* 238 */                               if (i > 0) {
                                            int i2 = i - 1;
/* 248 */                                   char cCharAt = ((OlII0Io1) ioli10l10.I0000O).I00000oIO.charAt(i2);
/* 252 */                                   boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
                                            codePoint = cCharAt;
                                            codePoint = cCharAt;
/* 256 */                                   if (zIsLowSurrogate && i2 > 0) {
/* 268 */                                       char cCharAt2 = ((OlII0Io1) ioli10l10.I0000O).I00000oIO.charAt(i - 2);
                                                codePoint = cCharAt;
/* 276 */                                       if (Character.isHighSurrogate(cCharAt2)) {
/* 278 */                                           codePoint = Character.toCodePoint(cCharAt2, cCharAt);
                                                }
                                            }
                                        } else {
/* 289 */                                   codePoint = ioli10l10.I00000oIO > 0 ? 10 : z3;
                                        }
/* 292 */                               IIOOoI iIOOoII000iOII12 = this.I0000oI00.I000iOII();
/* 306 */                               if (this.I0000oI00.I0001Ioi1lo(cI000OiO) < iiIolo.I0000Il00O()) {
/* 310 */                                   this.I0000oI00.I000l1(iIOOoII000iOII12);
/* 313 */                                   r8 = strI00000oOI2;
                                        } else {
/* 318 */                                   ArrayList arrayList2 = new ArrayList();
/* 323 */                                   this.I0000oI00.I000l1(iIOOoII000iOII12);
                                            while (true) {
/* 328 */                                       boolean zI000O01llI02 = this.I0000oI00.I000O01llI0(cI000OiO);
/* 332 */                                       ioli10l = this.I0000oI00;
/* 334 */                                       if (!zI000O01llI02) {
                                                    break;
                                                }
/* 348 */                                       arrayList2.add(I000OOo1O(ioli10l.I0000Il00O(iIOOoII000iOII12, ioli10l.I000iOII())));
/* 353 */                                       iIOOoII000iOII12 = this.I0000oI00.I000iOII();
                                            }
/* 358 */                                   int i3 = ioli10l.I00000oOI;
/* 362 */                                   if (i3 < ioli10l.I0000oI00) {
/* 370 */                                       char cCharAt3 = ((OlII0Io1) ioli10l.I0000O).I00000oIO.charAt(i3);
/* 374 */                                       boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt3);
                                                codePoint2 = cCharAt3;
/* 378 */                                       if (zIsHighSurrogate) {
/* 382 */                                           int i4 = ioli10l.I00000oOI + 1;
                                                    codePoint2 = cCharAt3;
/* 385 */                                           if (i4 < ioli10l.I0000oI00) {
/* 393 */                                               char cCharAt4 = ((OlII0Io1) ioli10l.I0000O).I00000oIO.charAt(i4);
                                                        codePoint2 = cCharAt3;
/* 401 */                                               if (Character.isLowSurrogate(cCharAt4)) {
/* 403 */                                                   codePoint2 = Character.toCodePoint(cCharAt3, cCharAt4);
                                                        }
                                                    }
                                                }
                                            } else if (ioli10l.I00000oIO >= ((ArrayList) ioli10l.I0000Il00O).size() - 1) {
/* 422 */                                       codePoint2 = z3;
                                            }
/* 434 */                                   boolean z5 = (codePoint == 0 || l1oOoi1ooIi.I00000oOI(codePoint)) ? true : z3;
/* 446 */                                   boolean z6 = (codePoint == 0 || l1oOoi1ooIi.I0000Il00O(codePoint)) ? true : z3;
/* 458 */                                   boolean z7 = (codePoint2 == 0 || l1oOoi1ooIi.I00000oOI(codePoint2)) ? true : z3;
/* 470 */                                   boolean z8 = (codePoint2 == 0 || l1oOoi1ooIi.I0000Il00O(codePoint2)) ? true : z3;
/* 481 */                                   boolean z9 = (z8 || !(!z7 || z6 || z5)) ? z3 : true;
/* 492 */                                   boolean z10 = (z6 || !(!z5 || z8 || z7)) ? z3 : true;
/* 495 */                                   if (cI000OiO == '_') {
/* 505 */                                       z2 = (!z9 || (z10 && !z5)) ? z3 : true;
/* 514 */                                       z = (!z10 || (z9 && !z7)) ? z3 : true;
                                            } else {
/* 526 */                                       boolean z11 = (z9 && cI000OiO == iiIolo.I0000O()) ? true : z3;
/* 537 */                                       z = (z10 && cI000OiO == iiIolo.I00000oOI()) ? true : z3;
/* 538 */                                       z2 = z11;
                                            }
/* 541 */                                   IollO11 iollO11 = new IollO11();
/* 544 */                                   iollO11.I00000oIO = arrayList2;
/* 546 */                                   iollO11.I0000Il00O = z2;
/* 548 */                                   iollO11.I00000oOI = z;
/* 550 */                                   VarHandle.storeStoreFence();
                                            r8 = iollO11;
                                        }
/* 553 */                               if (r8 == 0) {
/* 555 */                                   SingletonList = strI00000oOI2;
                                        } else {
/* 557 */                                   ArrayList arrayList3 = r8.I00000oIO;
/* 561 */                                   boolean z12 = r8.I0000Il00O;
/* 563 */                                   boolean z13 = r8.I00000oOI;
/* 565 */                                   IiIoiiOoIi iiIoiiOoIi = this.I000O01llI0;
/* 567 */                                   IiIoiiOoIi iiIoiiOoIi2 = new IiIoiiOoIi();
/* 570 */                                   iiIoiiOoIi2.I00000oIO = arrayList3;
/* 572 */                                   iiIoiiOoIi2.I00000oOI = cI000OiO;
/* 574 */                                   iiIoiiOoIi2.I0000O = z12;
/* 576 */                                   iiIoiiOoIi2.I0000oI00 = z13;
/* 578 */                                   iiIoiiOoIi2.I0001Ioi1lo = iiIoiiOoIi;
/* 584 */                                   iiIoiiOoIi2.I0000Il00O = arrayList3.size();
/* 586 */                                   VarHandle.storeStoreFence();
/* 589 */                                   this.I000O01llI0 = iiIoiiOoIi2;
/* 591 */                                   IiIoiiOoIi iiIoiiOoIi3 = iiIoiiOoIi2.I0001Ioi1lo;
/* 593 */                                   if (iiIoiiOoIi3 != null) {
/* 595 */                                       iiIoiiOoIi3.I000II = iiIoiiOoIi2;
                                            }
/* 597 */                                   SingletonList = arrayList3;
                                        }
/* 598 */                               if (SingletonList == 0) {
                                        }
                                    }
                                } else {
/* 230 */                           iiIolo = (IiIolo) this.I00000oOI.get(Character.valueOf(cI000OiO));
/* 232 */                           if (iiIolo == null) {
                                    }
                                }
                            } else {
/* 116 */                       SingletonList = Collections.singletonList(I0001Ioi1lo());
                            }
                        } else {
/* 1246 */                  SingletonList = 0;
                        }
/* 1247 */              if (SingletonList == 0) {
/* 1273 */                  I000II(null);
/* 1276 */                  I0000Il00O(oIIl1OIol);
/* 2988 */                  return;
                        } else {
/* 1249 */                  Iterator it2 = SingletonList.iterator();
/* 1257 */                  while (it2.hasNext()) {
/* 1265 */                      oIIl1OIol.I0000Il00O((OIIl1OIol) it2.next());
                            }
/* 1269 */                  strI00000oOI2 = null;
                        }
                    }
                }

                public final OloOO10o I0001Ioi1lo() {
                    char cI000OiO;
/* 3 */             IIOOoI iIOOoII000iOII = this.I0000oI00.I000iOII();
/* 9 */             this.I0000oI00.I000II();
                    while (true) {
/* 14 */                cI000OiO = this.I0000oI00.I000OiO();
/* 18 */                if (cI000OiO == 0 || this.I00000oIO.get(cI000OiO)) {
                            break;
                        }
/* 31 */                this.I0000oI00.I000II();
                    }
/* 35 */            iOlI10l ioli10l = this.I0000oI00;
/* 41 */            OlII11110Iol olII11110IolI0000Il00O = ioli10l.I0000Il00O(iIOOoII000iOII, ioli10l.I000iOII());
/* 45 */            String strI00000oIO = olII11110IolI0000Il00O.I00000oIO();
/* 52 */            if (cI000OiO == '\n') {
                        int length = strI00000oIO.length() - 1;
                        while (true) {
/* 60 */                    if (length < 0) {
/* 74 */                        length = -1;
                                break;
                            }
/* 68 */                    if (strI00000oIO.charAt(length) != ' ') {
                                break;
                            }
                            length--;
                        }
/* 75 */                int i = length + 1;
/* 82 */                this.I000II = strI00000oIO.length() - i;
/* 84 */                strI00000oIO = strI00000oIO.substring(0, i);
                    } else if (cI000OiO == 0) {
/* 103 */               strI00000oIO = strI00000oIO.substring(0, l1oOoi1ooIi.I0000oI00(strI00000oIO, strI00000oIO.length() - 1, 0) + 1);
                    }
/* 109 */           OloOO10o oloOO10o = new OloOO10o(strI00000oIO);
/* 116 */           oloOO10o.I000II(olII11110IolI0000Il00O.I00000oOI());
/* 541 */           return oloOO10o;
                }

                public final void I000II(IiIoiiOoIi iiIoiiOoIi) {
                    boolean z;
/* 3 */             HashMap map = new HashMap();
/* 6 */             IiIoiiOoIi iiIoiiOoIi2 = this.I000O01llI0;
/* 8 */             while (iiIoiiOoIi2 != null) {
/* 10 */                IiIoiiOoIi iiIoiiOoIi3 = iiIoiiOoIi2.I0001Ioi1lo;
/* 12 */                if (iiIoiiOoIi3 == iiIoiiOoIi) {
                            break;
                        } else {
/* 14 */                    iiIoiiOoIi2 = iiIoiiOoIi3;
                        }
                    }
/* 16 */            while (iiIoiiOoIi2 != null) {
/* 18 */                ArrayList arrayList = iiIoiiOoIi2.I00000oIO;
/* 20 */                char c = iiIoiiOoIi2.I00000oOI;
/* 32 */                IiIolo iiIolo = (IiIolo) this.I00000oOI.get(Character.valueOf(c));
/* 36 */                if (!iiIoiiOoIi2.I0000oI00 || iiIolo == null) {
/* 181 */                   iiIoiiOoIi2 = iiIoiiOoIi2.I000II;
                        } else {
/* 42 */                    char cI0000O = iiIolo.I0000O();
/* 46 */                    IiIoiiOoIi iiIoiiOoIi4 = iiIoiiOoIi2.I0001Ioi1lo;
/* 49 */                    int iI00000oIO = 0;
/* 50 */                    boolean z2 = false;
/* 52 */                    while (iiIoiiOoIi4 != null && iiIoiiOoIi4 != iiIoiiOoIi && iiIoiiOoIi4 != map.get(Character.valueOf(c))) {
/* 68 */                        if (iiIoiiOoIi4.I0000O && iiIoiiOoIi4.I00000oOI == cI0000O) {
/* 74 */                            iI00000oIO = iiIolo.I00000oIO(iiIoiiOoIi4, iiIoiiOoIi2);
/* 78 */                            if (iI00000oIO > 0) {
/* 80 */                                z = true;
/* 81 */                                z2 = true;
                                        break;
                                    }
/* 83 */                            z2 = true;
                                }
/* 84 */                        iiIoiiOoIi4 = iiIoiiOoIi4.I0001Ioi1lo;
                            }
/* 87 */                    z = false;
/* 88 */                    if (z) {
/* 112 */                       for (int i = 0; i < iI00000oIO; i++) {
/* 122 */                           ((OloOO10o) IIlIOloOOO.I000o00OoI0I(1, iiIoiiOoIi4.I00000oIO)).I000OOo1O();
                                }
/* 129 */                       for (int i2 = 0; i2 < iI00000oIO; i2++) {
/* 137 */                           ((OloOO10o) arrayList.remove(0)).I000OOo1O();
                                }
/* 143 */                       IiIoiiOoIi iiIoiiOoIi5 = iiIoiiOoIi2.I0001Ioi1lo;
/* 145 */                       while (iiIoiiOoIi5 != null && iiIoiiOoIi5 != iiIoiiOoIi4) {
/* 149 */                           IiIoiiOoIi iiIoiiOoIi6 = iiIoiiOoIi5.I0001Ioi1lo;
/* 151 */                           I000O01llI0(iiIoiiOoIi5);
/* 154 */                           iiIoiiOoIi5 = iiIoiiOoIi6;
                                }
/* 162 */                       if (iiIoiiOoIi4.I00000oIO.size() == 0) {
/* 164 */                           I000O01llI0(iiIoiiOoIi4);
                                }
/* 171 */                       if (arrayList.size() == 0) {
/* 173 */                           IiIoiiOoIi iiIoiiOoIi7 = iiIoiiOoIi2.I000II;
/* 175 */                           I000O01llI0(iiIoiiOoIi2);
/* 178 */                           iiIoiiOoIi2 = iiIoiiOoIi7;
                                }
                            } else {
/* 90 */                        if (!z2) {
/* 98 */                            map.put(Character.valueOf(c), iiIoiiOoIi2.I0001Ioi1lo);
/* 103 */                           if (!iiIoiiOoIi2.I0000O) {
/* 105 */                               I000O01llI0(iiIoiiOoIi2);
                                    }
                                }
/* 108 */                       iiIoiiOoIi2 = iiIoiiOoIi2.I000II;
                            }
                        }
                    }
                    while (true) {
/* 185 */               IiIoiiOoIi iiIoiiOoIi8 = this.I000O01llI0;
/* 187 */               if (iiIoiiOoIi8 == null || iiIoiiOoIi8 == iiIoiiOoIi) {
/* 966 */                   return;
                        } else {
/* 191 */                   I000O01llI0(iiIoiiOoIi8);
                        }
                    }
                }

                public final void I000O01llI0(IiIoiiOoIi iiIoiiOoIi) {
/* 1 */             IiIoiiOoIi iiIoiiOoIi2 = iiIoiiOoIi.I0001Ioi1lo;
/* 3 */             if (iiIoiiOoIi2 != null) {
/* 7 */                 iiIoiiOoIi2.I000II = iiIoiiOoIi.I000II;
                    }
/* 9 */             IiIoiiOoIi iiIoiiOoIi3 = iiIoiiOoIi.I000II;
/* 11 */            if (iiIoiiOoIi3 == null) {
/* 13 */                this.I000O01llI0 = iiIoiiOoIi2;
                    } else {
/* 16 */                iiIoiiOoIi3.I0001Ioi1lo = iiIoiiOoIi2;
                    }
                }
            }
