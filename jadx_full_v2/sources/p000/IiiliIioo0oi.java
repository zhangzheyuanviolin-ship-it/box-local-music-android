            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Pattern;
            
            public final class IiiliIioo0oi {
                public static final LinkedHashSet I0010I0i = new LinkedHashSet(Arrays.asList(II0oi10Io0I.class, Io1OOOi1Iolo.class, IlIIio0l.class, IoIIOIlOliO.class, Oo0oOI.class, O1011010Ii.class, Iol0O1Oo.class));
                public static final Map I0010o;
                public OlII0Io1 I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public boolean I000OOo1O;
                public ArrayList I000OiO;
                public IIIOlol I000iOII;
                public List I000l1;
                public int I000lI;
                public IiilOOioIoo I000o00OoI0I;
                public O100010Iili I000oI1ioi;
                public ArrayList I00100l0;
                public ArrayList I00100o1O0lo;

                static {
/* 32 */            HashMap map = new HashMap();
/* 41 */            map.put(II0oi10Io0I.class, new II100ii(0));
/* 50 */            map.put(Io1OOOi1Iolo.class, new II100ii(2));
/* 59 */            map.put(IlIIio0l.class, new II100ii(1));
/* 68 */            map.put(IoIIOIlOliO.class, new II100ii(3));
/* 77 */            map.put(Oo0oOI.class, new II100ii(7));
/* 86 */            map.put(O1011010Ii.class, new II100ii(5));
/* 95 */            map.put(Iol0O1Oo.class, new II100ii(4));
/* 102 */           I0010o = Collections.unmodifiableMap(map);
                }

                public final void I00000oIO(Iiili1Illo iiili1Illo) {
/* 1 */             I00io1l i00io1l = iiili1Illo.I00000oIO;
/* 15 */            while (!I000O01llI0().I0000Il00O(i00io1l.I0001Ioi1lo())) {
/* 18 */                I0001Ioi1lo(1);
                    }
/* 34 */            I000O01llI0().I0001Ioi1lo().I0000Il00O(i00io1l.I0001Ioi1lo());
/* 39 */            this.I00100l0.add(iiili1Illo);
                }

                public final void I00000oOI(OIoiiI oIoiiI) {
/* 1 */             O0ooo1Oo o0ooo1Oo = oIoiiI.I00000oOI;
/* 3 */             o0ooo1Oo.I00000oIO();
/* 8 */             Iterator it = o0ooo1Oo.I0000Il00O.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                O0ool1I00 o0ool1I00 = (O0ool1I00) it.next();
/* 24 */                OIoi1lo00I00 oIoi1lo00I00 = oIoiiI.I00000oIO;
/* 26 */                oIoi1lo00I00.getClass();
/* 29 */                o0ool1I00.I000OOo1O();
/* 32 */                OIIl1OIol oIIl1OIol = oIoi1lo00I00.I0000O;
/* 34 */                o0ool1I00.I0000O = oIIl1OIol;
/* 36 */                if (oIIl1OIol != null) {
/* 38 */                    oIIl1OIol.I0000oI00 = o0ool1I00;
                        }
/* 40 */                o0ool1I00.I0000oI00 = oIoi1lo00I00;
/* 42 */                oIoi1lo00I00.I0000O = o0ool1I00;
/* 44 */                OIIl1OIol oIIl1OIol2 = oIoi1lo00I00.I00000oIO;
/* 46 */                o0ool1I00.I00000oIO = oIIl1OIol2;
/* 50 */                if (o0ool1I00.I0000O == null) {
/* 52 */                    oIIl1OIol2.I00000oOI = o0ool1I00;
                        }
/* 54 */                O100010Iili o100010Iili = this.I000oI1ioi;
/* 56 */                o100010Iili.getClass();
/* 61 */                String strI00000oIO = Il0oolIl0.I00000oIO(o0ool1I00.I000II);
/* 65 */                LinkedHashMap linkedHashMap = o100010Iili.I00000oIO;
/* 71 */                if (!linkedHashMap.containsKey(strI00000oIO)) {
/* 73 */                    linkedHashMap.put(strI00000oIO, o0ool1I00);
                        }
                    }
                }

                public final void I0000Il00O() {
                    CharSequence charSequenceSubSequence;
/* 1 */             boolean z = this.I0000oI00;
/* 3 */             int i = this.I0000Il00O;
/* 5 */             OlII0Io1 olII0Io1 = this.I00000oIO;
/* 7 */             if (z) {
/* 11 */                CharSequence charSequence = olII0Io1.I00000oIO;
/* 17 */                CharSequence charSequenceSubSequence2 = charSequence.subSequence(i + 1, charSequence.length());
/* 25 */                int i2 = 4 - (this.I0000O % 4);
/* 34 */                StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
/* 38 */                for (int i3 = 0; i3 < i2; i3++) {
/* 42 */                    sb.append(' ');
                        }
/* 48 */                sb.append(charSequenceSubSequence2);
/* 51 */                charSequenceSubSequence = sb.toString();
                    } else if (i == 0) {
/* 58 */                charSequenceSubSequence = olII0Io1.I00000oIO;
                    } else {
/* 61 */                CharSequence charSequence2 = olII0Io1.I00000oIO;
/* 67 */                charSequenceSubSequence = charSequence2.subSequence(i, charSequence2.length());
                    }
/* 98 */            I000O01llI0().I00000oIO(OlII0Io1.I00000oIO(charSequenceSubSequence, this.I000lI == 3 ? OlIIOI0o.I00000oIO(this.I00000oOI, this.I0000Il00O, charSequenceSubSequence.length()) : null));
/* 101 */           I0000O();
                }

                public final void I0000O() {
/* 1 */             ArrayList arrayList = this.I00100l0;
/* 6 */             if (this.I000lI != 1) {
/* 12 */                for (int i = 1; i < arrayList.size(); i++) {
/* 18 */                    Iiili1Illo iiili1Illo = (Iiili1Illo) arrayList.get(i);
/* 20 */                    int i2 = iiili1Illo.I00000oOI;
/* 30 */                    int length = this.I00000oIO.I00000oIO.length() - i2;
/* 31 */                    if (length != 0) {
/* 41 */                        iiili1Illo.I00000oIO.I00000oOI(OlIIOI0o.I00000oIO(this.I00000oOI, i2, length));
                            }
                        }
                    }
                }

                public final void I0000oI00() {
/* 7 */             char cCharAt = this.I00000oIO.I00000oIO.charAt(this.I0000Il00O);
                    this.I0000Il00O++;
/* 17 */            int i = this.I0000O;
/* 21 */            if (cCharAt == '\t') {
/* 28 */                this.I0000O = (4 - (i % 4)) + i;
                    } else {
/* 33 */                this.I0000O = i + 1;
                    }
                }

                public final void I0001Ioi1lo(int i) {
/* 2 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                I00io1l i00io1l = ((Iiili1Illo) IIlIOloOOO.I000o00OoI0I(1, this.I00100l0)).I00000oIO;
/* 17 */                if (i00io1l instanceof OIoiiI) {
/* 22 */                    I00000oOI((OIoiiI) i00io1l);
                        }
/* 25 */                i00io1l.I0000oI00();
/* 30 */                this.I00100o1O0lo.add(i00io1l);
                    }
                }

                public final void I000II() {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             int i2 = this.I0000O;
/* 6 */             this.I000OOo1O = true;
/* 12 */            int length = this.I00000oIO.I00000oIO.length();
                    while (true) {
/* 16 */                if (i >= length) {
                            break;
                        }
/* 22 */                char cCharAt = this.I00000oIO.I00000oIO.charAt(i);
/* 28 */                if (cCharAt == '\t') {
/* 43 */                    i++;
/* 49 */                    i2 += 4 - (i2 % 4);
                        } else if (cCharAt != ' ') {
/* 35 */                    this.I000OOo1O = false;
                            break;
                        } else {
/* 38 */                    i++;
/* 40 */                    i2++;
                        }
                    }
/* 51 */            this.I0001Ioi1lo = i;
/* 53 */            this.I000II = i2;
/* 58 */            this.I000O01llI0 = i2 - this.I0000O;
                }

                public final I00io1l I000O01llI0() {
/* 10 */            return ((Iiili1Illo) IIl001iO0Io.I000OiO(1, this.I00100l0)).I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:177:0x0315, code lost:
                
                    if (r14 < 1) goto L187;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:178:0x0317, code lost:
                
                    r6 = r15 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:179:0x031d, code lost:
                
                    if (r6 >= r8.length()) goto L185;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:180:0x031f, code lost:
                
                    r12 = r8.charAt(r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:181:0x0325, code lost:
                
                    if (r12 == '\t') goto L185;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:183:0x0329, code lost:
                
                    if (r12 == ' ') goto L185;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:185:0x032c, code lost:
                
                    r12 = r8.subSequence(r5, r15).toString();
                    r14 = new p000.OIil11Ol();
                    r14.I000II = java.lang.Integer.parseInt(r12);
                    r14.I000O01llI0 = r4;
                    r4 = new p000.O1011O1i000i(r14, r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:413:0x0809, code lost:
                
                    I000iOII(r25.I0001Ioi1lo);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
                
                    r23 = r5;
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:170:0x0302. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:153:0x02b7 A[PHI: r23
                  0x02b7: PHI (r23v13 I00io1l) = 
                  (r23v8 I00io1l)
                  (r23v8 I00io1l)
                  (r23v9 I00io1l)
                  (r23v9 I00io1l)
                  (r23v9 I00io1l)
                  (r23v10 I00io1l)
                  (r23v10 I00io1l)
                  (r23v10 I00io1l)
                  (r23v11 I00io1l)
                  (r23v11 I00io1l)
                  (r23v11 I00io1l)
                  (r23v12 I00io1l)
                  (r23v12 I00io1l)
                  (r23v14 I00io1l)
                  (r23v16 I00io1l)
                  (r23v16 I00io1l)
                  (r23v16 I00io1l)
                 binds: [B:344:0x06bf, B:366:0x070e, B:266:0x052d, B:339:0x0692, B:341:0x069e, B:249:0x04a8, B:251:0x04b0, B:478:0x02b7, B:242:0x0460, B:244:0x0464, B:246:0x0470, B:155:0x02c3, B:222:0x03ca, B:152:0x02b5, B:146:0x0268, B:148:0x026e, B:150:0x0283] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:197:0x0373  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x0375  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x042e  */
                /* JADX WARN: Removed duplicated region for block: B:315:0x063c  */
                /* JADX WARN: Removed duplicated region for block: B:329:0x066c  */
                /* JADX WARN: Removed duplicated region for block: B:338:0x0691  */
                /* JADX WARN: Removed duplicated region for block: B:340:0x0694  */
                /* JADX WARN: Removed duplicated region for block: B:361:0x06fb  */
                /* JADX WARN: Removed duplicated region for block: B:367:0x0710  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OOo1O(String str) {
                    I00io1l i00io1l;
                    II1011i iI1011iI00000oOI;
                    List listI0000O;
                    int i;
                    char cCharAt;
                    int i2;
                    IlIIll1ollo0 ilIIll1ollo0;
                    int i3;
                    Io1Oill10II io1Oill10II;
                    char c;
                    char c2;
                    boolean z;
                    int i4;
                    O1011O1i000i o1011O1i000i;
                    char cCharAt2;
                    boolean z2;
                    O1011O1i000i o1011O1i000i2;
                    boolean z3;
                    boolean z4;
                    int i5;
/* 3 */             String string = str;
/* 5 */             ArrayList arrayList = this.I00100l0;
                    this.I00000oOI++;
/* 13 */            int i6 = 0;
/* 14 */            this.I0000Il00O = 0;
/* 16 */            this.I0000O = 0;
/* 18 */            this.I0000oI00 = false;
/* 20 */            int length = string.length();
/* 25 */            StringBuilder sb = null;
/* 26 */            for (int i7 = 0; i7 < length; i7++) {
/* 28 */                char cCharAt3 = string.charAt(i7);
/* 32 */                if (cCharAt3 == 0) {
/* 34 */                    if (sb == null) {
/* 38 */                        sb = new StringBuilder(length);
/* 41 */                        sb.append((CharSequence) string, 0, i7);
                            }
/* 47 */                    sb.append((char) 65533);
                        } else if (sb != null) {
/* 53 */                    sb.append(cCharAt3);
                        }
                    }
/* 59 */            if (sb != null) {
/* 61 */                string = sb.toString();
                    }
/* 85 */            this.I00000oIO = OlII0Io1.I00000oIO(string, this.I000lI != 1 ? OlIIOI0o.I00000oIO(this.I00000oOI, 0, string.length()) : null);
/* 88 */            int i8 = 1;
/* 94 */            for (int i9 = 1; i9 < arrayList.size(); i9++) {
/* 100 */               Iiili1Illo iiili1Illo = (Iiili1Illo) arrayList.get(i9);
/* 102 */               I00io1l i00io1l2 = iiili1Illo.I00000oIO;
/* 104 */               I000II();
/* 107 */               II0oOO1 iI0oOO1I000OOo1O = i00io1l2.I000OOo1O(this);
/* 111 */               if (iI0oOO1I000OOo1O == null) {
                            break;
                        }
/* 115 */               iiili1Illo.I00000oOI = this.I0000Il00O;
/* 119 */               if (iI0oOO1I000OOo1O.I0000Il00O) {
/* 121 */                   I0000O();
/* 129 */                   I0001Ioi1lo(arrayList.size() - i9);
/* 132 */                   return;
                        }
/* 133 */               int i10 = iI0oOO1I000OOo1O.I00000oIO;
/* 135 */               if (i10 != -1) {
/* 137 */                   I000iOII(i10);
                        } else {
/* 141 */                   int i11 = iI0oOO1I000OOo1O.I00000oOI;
/* 143 */                   if (i11 != -1) {
/* 145 */                       I000OiO(i11);
                            }
                        }
/* 148 */               i8++;
                    }
/* 157 */           int size = arrayList.size() - i8;
/* 165 */           I00io1l i00io1l3 = ((Iiili1Illo) arrayList.get(i8 - 1)).I00000oIO;
/* 167 */           int i12 = this.I0000Il00O;
/* 186 */           boolean z5 = (i00io1l3.I0001Ioi1lo() instanceof OIoi1lo00I00) || i00io1l3.I000II();
/* 187 */           boolean z6 = false;
                    while (true) {
/* 188 */               if (z5) {
/* 190 */                   i12 = this.I0000Il00O;
/* 192 */                   I000II();
/* 197 */                   if (!this.I000OOo1O) {
/* 201 */                       int i13 = 4;
/* 202 */                       if (this.I000O01llI0 >= 4 || !Character.isLetter(Character.codePointAt(this.I00000oIO.I00000oIO, this.I0001Ioi1lo))) {
/* 226 */                           Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 229 */                           oi00IilOloo0.I00iOIl = i00io1l3;
/* 231 */                           VarHandle.storeStoreFence();
/* 236 */                           Iterator it = this.I000OiO.iterator();
                                    while (true) {
/* 244 */                               if (it.hasNext()) {
/* 254 */                                   char c3 = '*';
/* 256 */                                   int i14 = i6;
/* 258 */                                   char c4 = ' ';
/* 260 */                                   char c5 = '\t';
                                            switch (((II100ii) it.next()).I00000oIO) {
                                                case 0:
/* 1830 */                                          i00io1l = i00io1l3;
/* 1832 */                                          int i15 = this.I0001Ioi1lo;
/* 1836 */                                          CharSequence charSequence = this.I00000oIO.I00000oIO;
/* 1840 */                                          i = 4;
/* 1841 */                                          if (this.I000O01llI0 >= 4 || i15 >= charSequence.length() || charSequence.charAt(i15) != '>') {
/* 1920 */                                              iI1011iI00000oOI = null;
                                                        break;
                                                    } else {
/* 1861 */                                              int i16 = this.I0000O + this.I000O01llI0;
/* 1862 */                                              int i17 = i16 + 1;
/* 1866 */                                              CharSequence charSequence2 = this.I00000oIO.I00000oIO;
/* 1868 */                                              int i18 = i15 + 1;
/* 1874 */                                              if (i18 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i18)) == '\t' || cCharAt == ' ')) {
/* 1889 */                                                  i17 = i16 + 2;
                                                        }
/* 1893 */                                              II100o iI100o = new II100o();
/* 1901 */                                              iI100o.I00000oIO = new II0oi10Io0I();
/* 1903 */                                              VarHandle.storeStoreFence();
/* 1913 */                                              iI1011iI00000oOI = II1011i.I00000oOI(iI100o);
/* 1917 */                                              iI1011iI00000oOI.I00000oOI = i17;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
/* 1723 */                                          i00io1l = i00io1l3;
/* 1725 */                                          int i19 = this.I000O01llI0;
/* 1728 */                                          if (i19 >= 4) {
/* 696 */                                               iI1011iI00000oOI = null;
/* 410 */                                               i = 4;
                                                        break;
                                                    } else {
/* 1732 */                                              int i20 = this.I0001Ioi1lo;
/* 1736 */                                              CharSequence charSequence3 = this.I00000oIO.I00000oIO;
/* 1738 */                                              int length2 = charSequence3.length();
/* 1742 */                                              int i21 = i20;
/* 1743 */                                              int i22 = 0;
/* 1744 */                                              int i23 = 0;
                                                        while (true) {
/* 1747 */                                                  i2 = i20;
/* 1749 */                                                  if (i21 < length2) {
/* 1751 */                                                      char cCharAt4 = charSequence3.charAt(i21);
/* 1755 */                                                      if (cCharAt4 == '`') {
/* 1766 */                                                          i22++;
                                                                } else if (cCharAt4 == '~') {
/* 1763 */                                                          i23++;
                                                                }
/* 1768 */                                                      i21++;
/* 1770 */                                                      i20 = i2;
                                                            }
                                                        }
/* 1773 */                                              if (i22 < 3 || i23 != 0) {
/* 1804 */                                                  ilIIll1ollo0 = (i23 < 3 || i22 != 0) ? null : new IlIIll1ollo0(i23, i19, '~');
/* 1807 */                                                  if (ilIIll1ollo0 == null) {
/* 1816 */                                                      iI1011iI00000oOI = II1011i.I00000oOI(ilIIll1ollo0);
/* 1826 */                                                      iI1011iI00000oOI.I00000oIO = i2 + ilIIll1ollo0.I00000oIO.I000O01llI0;
                                                            }
/* 410 */                                                   i = 4;
                                                        } else {
/* 1786 */                                                  if (l1oOoi1ooIi.I00000oIO('`', charSequence3, i2 + i22) == -1) {
/* 1792 */                                                      ilIIll1ollo0 = new IlIIll1ollo0(i22, i19, '`');
                                                            }
/* 1807 */                                                  if (ilIIll1ollo0 == null) {
                                                            }
/* 410 */                                                   i = 4;
                                                        }
                                                    }
                                                case 2:
/* 1320 */                                          i00io1l = i00io1l3;
/* 1326 */                                          if (this.I000O01llI0 < 4) {
/* 1330 */                                              OlII0Io1 olII0Io1 = this.I00000oIO;
/* 1332 */                                              int i24 = this.I0001Ioi1lo;
/* 1334 */                                              CharSequence charSequence4 = olII0Io1.I00000oIO;
/* 1342 */                                              if (charSequence4.charAt(i24) == '#') {
/* 1348 */                                                  OlII0Io1 olII0Io1I00000oOI = olII0Io1.I00000oOI(i24, charSequence4.length());
/* 1354 */                                                  ArrayList arrayList2 = new ArrayList();
/* 1357 */                                                  arrayList2.add(olII0Io1I00000oOI);
/* 1362 */                                                  iOlI10l ioli10l = new iOlI10l();
/* 1372 */                                                  ioli10l.I0000O = OlII0Io1.I00000oIO("", null);
/* 1375 */                                                  ioli10l.I0000oI00 = 0;
/* 1377 */                                                  ioli10l.I0000Il00O = arrayList2;
/* 1379 */                                                  ioli10l.I00000oIO = 0;
/* 1381 */                                                  ioli10l.I00000oOI = 0;
/* 1387 */                                                  if (!arrayList2.isEmpty()) {
/* 1389 */                                                      ioli10l.I00000oIO(0, 0);
/* 1396 */                                                      OlII0Io1 olII0Io12 = (OlII0Io1) arrayList2.get(0);
/* 1398 */                                                      ioli10l.I0000O = olII0Io12;
/* 1406 */                                                      ioli10l.I0000oI00 = olII0Io12.I00000oIO.length();
                                                            }
/* 1408 */                                                  VarHandle.storeStoreFence();
/* 1411 */                                                  int iI0001Ioi1lo = ioli10l.I0001Ioi1lo('#');
/* 1415 */                                                  if (iI0001Ioi1lo == 0 || iI0001Ioi1lo > 6) {
/* 1575 */                                                      io1Oill10II = null;
                                                            } else if (ioli10l.I0000O()) {
/* 1440 */                                                      char cI000OiO = ioli10l.I000OiO();
/* 1446 */                                                      if (cI000OiO != ' ') {
/* 1448 */                                                          c = '\t';
/* 1450 */                                                          if (cI000OiO != '\t') {
/* 1452 */                                                              io1Oill10II = null;
                                                                    }
                                                                } else {
/* 1455 */                                                          c = '\t';
                                                                }
/* 1457 */                                                      ioli10l.I000lI();
/* 1460 */                                                      IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 1464 */                                                      IIOOoI iIOOoII000iOII2 = iIOOoII000iOII;
/* 1465 */                                                      boolean z7 = true;
/* 1471 */                                                      while (ioli10l.I0000O()) {
/* 1473 */                                                          char cI000OiO2 = ioli10l.I000OiO();
/* 1477 */                                                          if (cI000OiO2 == c || cI000OiO2 == ' ') {
/* 1532 */                                                              c2 = '#';
/* 1534 */                                                              ioli10l.I000II();
/* 1537 */                                                              z7 = true;
                                                                    } else {
/* 1483 */                                                              c2 = '#';
/* 1485 */                                                              if (cI000OiO2 != '#') {
/* 1487 */                                                                  ioli10l.I000II();
/* 1490 */                                                                  iIOOoII000iOII2 = ioli10l.I000iOII();
/* 1494 */                                                                  z7 = false;
                                                                        } else if (z7) {
/* 1499 */                                                                  ioli10l.I0001Ioi1lo('#');
/* 1502 */                                                                  int iI000lI = ioli10l.I000lI();
/* 1510 */                                                                  if (ioli10l.I0000O()) {
/* 1512 */                                                                      iIOOoII000iOII2 = ioli10l.I000iOII();
                                                                            }
/* 1520 */                                                                  z7 = iI000lI > 0;
                                                                        } else {
/* 1524 */                                                                  ioli10l.I000II();
/* 1527 */                                                                  iIOOoII000iOII2 = ioli10l.I000iOII();
                                                                        }
                                                                    }
/* 1540 */                                                          c = '\t';
                                                                }
/* 1543 */                                                      OlII11110Iol olII11110IolI0000Il00O = ioli10l.I0000Il00O(iIOOoII000iOII, iIOOoII000iOII2);
/* 1570 */                                                      io1Oill10II = olII11110IolI0000Il00O.I00000oIO().isEmpty() ? new Io1Oill10II(iI0001Ioi1lo, new OlII11110Iol()) : new Io1Oill10II(iI0001Ioi1lo, olII11110IolI0000Il00O);
                                                            } else {
/* 1435 */                                                      io1Oill10II = new Io1Oill10II(iI0001Ioi1lo, new OlII11110Iol());
                                                            }
/* 1576 */                                                  if (io1Oill10II != null) {
/* 1585 */                                                      iI1011iI00000oOI = II1011i.I00000oOI(io1Oill10II);
/* 1593 */                                                      iI1011iI00000oOI.I00000oIO = charSequence4.length();
                                                            } else {
/* 1597 */                                                      char cCharAt5 = charSequence4.charAt(i24);
/* 1603 */                                                      if (cCharAt5 == '-') {
/* 1645 */                                                          int i25 = i24 + 1;
/* 1647 */                                                          int length3 = charSequence4.length();
                                                                    while (true) {
/* 1651 */                                                              if (i25 < length3) {
/* 1659 */                                                                  if (charSequence4.charAt(i25) != '-') {
/* 1661 */                                                                      length3 = i25;
                                                                            } else {
/* 1663 */                                                                      i25++;
                                                                            }
                                                                        }
                                                                    }
/* 1682 */                                                          i3 = l1oOoi1ooIi.I0000O(charSequence4, length3, charSequence4.length()) >= charSequence4.length() ? 2 : 0;
/* 1683 */                                                          if (i3 <= 0) {
/* 1685 */                                                              OlII11110Iol olII11110IolI001i1O0Ol = oi00IilOloo0.I001i1O0Ol();
/* 1695 */                                                              if (!olII11110IolI001i1O0Ol.I00iOIl.isEmpty()) {
/* 1709 */                                                                  iI1011iI00000oOI = II1011i.I00000oOI(new Io1Oill10II(i3, olII11110IolI001i1O0Ol));
/* 1717 */                                                                  iI1011iI00000oOI.I00000oIO = charSequence4.length();
/* 1719 */                                                                  iI1011iI00000oOI.I0000Il00O = true;
                                                                        }
                                                                    }
                                                                } else {
/* 1607 */                                                          if (cCharAt5 == '=') {
/* 1610 */                                                              int i26 = i24 + 1;
/* 1612 */                                                              int length4 = charSequence4.length();
                                                                        while (true) {
/* 1616 */                                                                  if (i26 < length4) {
/* 1622 */                                                                      if (charSequence4.charAt(i26) != '=') {
/* 1624 */                                                                          length4 = i26;
                                                                                } else {
/* 1626 */                                                                          i26++;
                                                                                }
                                                                            }
                                                                        }
/* 1641 */                                                              if (l1oOoi1ooIi.I0000O(charSequence4, length4, charSequence4.length()) >= charSequence4.length()) {
/* 1643 */                                                                  i3 = 1;
                                                                        }
                                                                    }
/* 1683 */                                                          if (i3 <= 0) {
                                                                    }
                                                                }
                                                            }
/* 410 */                                                   i = 4;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 3:
/* 1182 */                                          i00io1l = i00io1l3;
/* 1184 */                                          int i27 = this.I0001Ioi1lo;
/* 1188 */                                          CharSequence charSequence5 = this.I00000oIO.I00000oIO;
/* 1193 */                                          if (this.I000O01llI0 < 4 && charSequence5.charAt(i27) == '<') {
/* 1205 */                                              for (int i28 = 1; i28 <= 7; i28++) {
/* 1207 */                                                  if (i28 != 7 || (!(((I00io1l) oi00IilOloo0.I00iOIl).I0001Ioi1lo() instanceof OIoi1lo00I00) && !I000O01llI0().I0000O())) {
/* 1234 */                                                      Pattern[] patternArr = IoIIOiIOll.I0000oI00[i28];
/* 1238 */                                                      Pattern pattern = patternArr[0];
/* 1242 */                                                      Pattern pattern2 = patternArr[1];
/* 1260 */                                                      if (pattern.matcher(charSequence5.subSequence(i27, charSequence5.length())).find()) {
/* 1264 */                                                          IoIIOiIOll ioIIOiIOll = new IoIIOiIOll();
/* 1272 */                                                          ioIIOiIOll.I00000oIO = new IoIIOIlOliO();
/* 1275 */                                                          ioIIOiIOll.I0000Il00O = false;
/* 1280 */                                                          O1I1OO o1i1oo = new O1I1OO(3, (byte) 0);
/* 1283 */                                                          o1i1oo.I00iiI = 0;
/* 1290 */                                                          o1i1oo.I00iiO = new StringBuilder();
/* 1292 */                                                          VarHandle.storeStoreFence();
/* 1295 */                                                          ioIIOiIOll.I0000O = o1i1oo;
/* 1297 */                                                          ioIIOiIOll.I00000oOI = pattern2;
/* 1299 */                                                          VarHandle.storeStoreFence();
/* 1307 */                                                          iI1011iI00000oOI = II1011i.I00000oOI(ioIIOiIOll);
/* 1313 */                                                          iI1011iI00000oOI.I00000oIO = this.I0000Il00O;
/* 410 */                                                           i = 4;
                                                                    break;
                                                                }
                                                            }
                                                        }
/* 696 */                                               iI1011iI00000oOI = null;
/* 410 */                                               i = 4;
                                                    }
                                                    break;
                                                case 4:
/* 1116 */                                          i00io1l = i00io1l3;
/* 1121 */                                          if (this.I000O01llI0 >= 4 && !this.I000OOo1O && !(I000O01llI0().I0001Ioi1lo() instanceof OIoi1lo00I00)) {
/* 1141 */                                              Io1Oill10II io1Oill10II2 = new Io1Oill10II();
/* 1149 */                                              io1Oill10II2.I00000oOI = new Iol0O1Oo();
/* 1156 */                                              io1Oill10II2.I0000Il00O = new ArrayList();
/* 1158 */                                              VarHandle.storeStoreFence();
/* 1168 */                                              iI1011iI00000oOI = II1011i.I00000oOI(io1Oill10II2);
/* 1178 */                                              iI1011iI00000oOI.I00000oOI = this.I0000O + 4;
                                                    }
/* 410 */                                           i = 4;
                                                    break;
                                                case 5:
/* 699 */                                           i00io1l = i00io1l3;
/* 703 */                                           I00io1l i00io1l4 = (I00io1l) oi00IilOloo0.I00iOIl;
/* 705 */                                           int i29 = this.I000O01llI0;
/* 708 */                                           if (i29 < 4) {
/* 712 */                                               int i30 = this.I0001Ioi1lo;
/* 716 */                                               int i31 = this.I0000O + i29;
/* 723 */                                               boolean zIsEmpty = oi00IilOloo0.I001i1O0Ol().I00iOIl.isEmpty();
/* 729 */                                               CharSequence charSequence6 = this.I00000oIO.I00000oIO;
/* 731 */                                               char cCharAt6 = charSequence6.charAt(i30);
/* 737 */                                               if (cCharAt6 == '*' || cCharAt6 == '+' || cCharAt6 == '-') {
/* 844 */                                                   z = zIsEmpty;
/* 846 */                                                   i4 = i31;
/* 848 */                                                   int i32 = i30 + 1;
/* 854 */                                                   if (i32 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i32)) == '\t' || cCharAt2 == ' ') {
/* 871 */                                                       IIIi011OIoI iIIi011OIoI = new IIIi011OIoI();
/* 874 */                                                       iIIi011OIoI.I000II = cCharAt6;
/* 878 */                                                       o1011O1i000i = new O1011O1i000i(iIIi011OIoI, i32);
                                                            } else {
/* 842 */                                                       o1011O1i000i = null;
                                                            }
/* 882 */                                                   if (o1011O1i000i == null) {
/* 884 */                                                       o1011O1i000i2 = null;
/* 971 */                                                       if (o1011O1i000i2 == null) {
/* 975 */                                                           O1011010Ii o1011010Ii = o1011O1i000i2.I00000oIO;
/* 977 */                                                           int i33 = o1011O1i000i2.I00000oOI;
/* 983 */                                                           int i34 = i33 - this.I0000O;
/* 985 */                                                           O10IIlII01 o10IIlII01 = new O10IIlII01();
/* 993 */                                                           o10IIlII01.I00000oIO = new O10IIl();
/* 995 */                                                           o10IIlII01.I00000oOI = i34;
/* 997 */                                                           VarHandle.storeStoreFence();
/* 1002 */                                                          if (i00io1l4 instanceof O101iIO) {
/* 1006 */                                                              O1011010Ii o1011010Ii2 = ((O101iIO) i00io1l4).I00000oIO;
/* 1069 */                                                              if (((o1011010Ii2 instanceof IIIi011OIoI) && (o1011010Ii instanceof IIIi011OIoI)) ? Character.valueOf(((IIIi011OIoI) o1011010Ii2).I000II).equals(Character.valueOf(((IIIi011OIoI) o1011010Ii).I000II)) : ((o1011010Ii2 instanceof OIil11Ol) && (o1011010Ii instanceof OIil11Ol)) ? Character.valueOf(((OIil11Ol) o1011010Ii2).I000O01llI0).equals(Character.valueOf(((OIil11Ol) o1011010Ii).I000O01llI0)) : false) {
/* 1081 */                                                                  iI1011iI00000oOI = II1011i.I00000oOI(o10IIlII01);
/* 1085 */                                                                  iI1011iI00000oOI.I00000oOI = i33;
                                                                        } else {
/* 1091 */                                                                  O101iIO o101iIO = new O101iIO();
/* 1094 */                                                                  o101iIO.I00000oIO = o1011010Ii;
/* 1096 */                                                                  VarHandle.storeStoreFence();
/* 1108 */                                                                  iI1011iI00000oOI = II1011i.I00000oOI(o101iIO, o10IIlII01);
/* 1112 */                                                                  iI1011iI00000oOI.I00000oOI = i33;
                                                                        }
                                                                    }
                                                                }
/* 410 */                                                       i = 4;
                                                                break;
                                                            } else {
/* 886 */                                                       O1011010Ii o1011010Ii3 = o1011O1i000i.I00000oIO;
/* 888 */                                                       int i35 = o1011O1i000i.I00000oOI;
/* 892 */                                                       int i36 = (i35 - i30) + i4;
/* 894 */                                                       int length5 = charSequence6.length();
/* 898 */                                                       int i37 = i36;
                                                                while (true) {
/* 899 */                                                           if (i35 < length5) {
/* 901 */                                                               char cCharAt7 = charSequence6.charAt(i35);
/* 905 */                                                               int i38 = i35;
/* 909 */                                                               if (cCharAt7 == '\t') {
/* 917 */                                                                   i37 = (4 - (i37 % 4)) + i37;
                                                                        } else if (cCharAt7 == ' ') {
/* 924 */                                                                   i37++;
                                                                        } else {
/* 929 */                                                                   z2 = true;
                                                                        }
/* 926 */                                                               i35 = i38 + 1;
                                                                    } else {
/* 931 */                                                               z2 = false;
                                                                    }
                                                                }
/* 932 */                                                       if (z || ((!(o1011010Ii3 instanceof OIil11Ol) || ((OIil11Ol) o1011010Ii3).I000II == 1) && z2)) {
/* 950 */                                                           if (!z2 || i37 - i36 > 4) {
/* 957 */                                                               i37 = i36 + 1;
                                                                    }
/* 961 */                                                           o1011O1i000i2 = new O1011O1i000i();
/* 964 */                                                           o1011O1i000i2.I00000oIO = o1011010Ii3;
/* 966 */                                                           o1011O1i000i2.I00000oOI = i37;
/* 968 */                                                           VarHandle.storeStoreFence();
                                                                }
/* 971 */                                                       if (o1011O1i000i2 == null) {
                                                                }
/* 410 */                                                       i = 4;
                                                            }
                                                        } else {
/* 747 */                                                   int length6 = charSequence6.length();
/* 751 */                                                   int i39 = i30;
/* 752 */                                                   int i40 = 0;
                                                            while (true) {
/* 753 */                                                       z = zIsEmpty;
/* 755 */                                                       if (i39 < length6) {
/* 757 */                                                           char cCharAt8 = charSequence6.charAt(i39);
/* 761 */                                                           i4 = i31;
/* 765 */                                                           if (cCharAt8 == ')' || cCharAt8 == '.') {
                                                                        break;
                                                                    } else {
                                                                        switch (cCharAt8) {
                                                                            case '0':
                                                                            case '1':
                                                                            case '2':
                                                                            case '3':
                                                                            case '4':
                                                                            case '5':
                                                                            case '6':
                                                                            case '7':
                                                                            case '8':
                                                                            case '9':
/* 775 */                                                                       i40++;
/* 779 */                                                                       if (i40 > 9) {
                                                                                    break;
                                                                                } else {
/* 782 */                                                                           i39++;
/* 784 */                                                                           zIsEmpty = z;
/* 786 */                                                                           i31 = i4;
                                                                                }
                                                                        }
/* 882 */                                                               if (o1011O1i000i == null) {
                                                                        }
                                                                    }
                                                                } else {
/* 840 */                                                           i4 = i31;
                                                                }
                                                            }
/* 842 */                                                   o1011O1i000i = null;
/* 882 */                                                   if (o1011O1i000i == null) {
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 6:
/* 417 */                                           ArrayList arrayList3 = oi00IilOloo0.I001i1O0Ol().I00iOIl;
/* 424 */                                           if (arrayList3.size() == 1 && l1oOoi1ooIi.I00000oIO('|', ((OlII0Io1) arrayList3.get(i14)).I00000oIO, i14) != -1) {
/* 445 */                                               OlII0Io1 olII0Io13 = this.I00000oIO;
/* 459 */                                               CharSequence charSequence7 = olII0Io13.I00000oOI(this.I0000Il00O, olII0Io13.I00000oIO.length()).I00000oIO;
/* 463 */                                               ArrayList arrayList4 = new ArrayList();
/* 466 */                                               int i41 = 0;
/* 467 */                                               boolean z8 = false;
/* 468 */                                               int i42 = 0;
                                                        while (true) {
/* 474 */                                                   if (i41 < charSequence7.length()) {
/* 476 */                                                       char cCharAt9 = charSequence7.charAt(i41);
/* 480 */                                                       if (cCharAt9 == c5 || cCharAt9 == ' ') {
/* 602 */                                                           i00io1l = i00io1l3;
/* 604 */                                                           i41++;
                                                                } else {
/* 488 */                                                           i00io1l = i00io1l3;
/* 492 */                                                           if (cCharAt9 == '-' || cCharAt9 == ':') {
/* 517 */                                                               if (i42 != 0 || arrayList4.isEmpty()) {
/* 526 */                                                                   if (cCharAt9 == ':') {
/* 528 */                                                                       i41++;
/* 530 */                                                                       z3 = true;
                                                                            } else {
/* 532 */                                                                       z3 = false;
                                                                            }
/* 533 */                                                                   boolean z9 = false;
/* 539 */                                                                   while (i41 < charSequence7.length() && charSequence7.charAt(i41) == '-') {
/* 549 */                                                                       i41++;
/* 553 */                                                                       z9 = true;
                                                                            }
/* 556 */                                                                   if (z9) {
/* 563 */                                                                       if (i41 >= charSequence7.length() || charSequence7.charAt(i41) != ':') {
/* 577 */                                                                           z4 = false;
                                                                                } else {
/* 573 */                                                                           i41++;
/* 575 */                                                                           z4 = true;
                                                                                }
/* 596 */                                                                       arrayList4.add((z3 && z4) ? OllolO0olOOO.I00iiI : z3 ? OllolO0olOOO.I00iOIl : z4 ? OllolO0olOOO.I00iiO : null);
/* 599 */                                                                       i42 = 0;
                                                                            }
                                                                        }
                                                                    } else if (cCharAt9 == '|') {
/* 503 */                                                               i41++;
/* 505 */                                                               int i43 = i42 + 1;
/* 508 */                                                               if (i43 <= 1) {
/* 511 */                                                                   i42 = i43;
/* 513 */                                                                   z8 = true;
                                                                        }
                                                                    }
                                                                }
/* 606 */                                                       i00io1l3 = i00io1l;
/* 608 */                                                       c5 = '\t';
                                                            } else {
/* 612 */                                                       i00io1l = i00io1l3;
/* 614 */                                                       if (!z8) {
                                                                }
                                                            }
                                                        }
/* 500 */                                               arrayList4 = null;
/* 617 */                                               if (arrayList4 != null && !arrayList4.isEmpty()) {
/* 630 */                                                   OlII0Io1 olII0Io14 = (OlII0Io1) arrayList3.get(0);
/* 644 */                                                   if (arrayList4.size() >= OlloIi1Ilil.I000iOII(olII0Io14).size()) {
/* 648 */                                                       OlloIi1Ilil olloIi1Ilil = new OlloIi1Ilil();
/* 656 */                                                       olloIi1Ilil.I00000oIO = new OlloIi1();
/* 660 */                                                       ArrayList arrayList5 = new ArrayList();
/* 663 */                                                       olloIi1Ilil.I00000oOI = arrayList5;
/* 666 */                                                       olloIi1Ilil.I0000O = true;
/* 668 */                                                       olloIi1Ilil.I0000Il00O = arrayList4;
/* 670 */                                                       arrayList5.add(olII0Io14);
/* 673 */                                                       VarHandle.storeStoreFence();
/* 682 */                                                       iI1011iI00000oOI = II1011i.I00000oOI(olloIi1Ilil);
/* 688 */                                                       iI1011iI00000oOI.I00000oIO = this.I0000Il00O;
/* 690 */                                                       iI1011iI00000oOI.I0000Il00O = true;
                                                            }
/* 410 */                                                   i = 4;
                                                            break;
                                                        }
                                                    } else {
/* 694 */                                               i00io1l = i00io1l3;
                                                    }
/* 696 */                                           iI1011iI00000oOI = null;
/* 410 */                                           i = 4;
                                                    break;
                                                default:
/* 267 */                                           if (this.I000O01llI0 >= i13) {
/* 407 */                                               iI1011iI00000oOI = null;
/* 408 */                                               i00io1l = i00io1l3;
/* 410 */                                               i = 4;
                                                        break;
                                                    } else {
/* 271 */                                               int i44 = this.I0001Ioi1lo;
/* 275 */                                               CharSequence charSequence8 = this.I00000oIO.I00000oIO;
/* 277 */                                               int length7 = charSequence8.length();
/* 281 */                                               int i45 = i14;
/* 283 */                                               int i46 = i45;
/* 285 */                                               int i47 = i46;
                                                        while (true) {
/* 287 */                                                   if (i44 >= length7) {
/* 351 */                                                       int i48 = i45;
/* 353 */                                                       int i49 = i46;
/* 355 */                                                       int i50 = i47;
/* 358 */                                                       if ((i48 >= 3 && i49 == 0 && i50 == 0) || ((i49 >= 3 && i48 == 0 && i50 == 0) || (i50 >= 3 && i48 == 0 && i49 == 0))) {
/* 379 */                                                           IiilOOioIoo iiilOOioIoo = new IiilOOioIoo(1);
/* 387 */                                                           iiilOOioIoo.I00000oOI = new Oo0oOI();
/* 389 */                                                           VarHandle.storeStoreFence();
/* 392 */                                                           I00io1l[] i00io1lArr = new I00io1l[1];
/* 394 */                                                           i00io1lArr[i14] = iiilOOioIoo;
/* 396 */                                                           iI1011iI00000oOI = II1011i.I00000oOI(i00io1lArr);
/* 404 */                                                           iI1011iI00000oOI.I00000oIO = charSequence8.length();
                                                                }
                                                            } else {
/* 289 */                                                       char cCharAt10 = charSequence8.charAt(i44);
/* 293 */                                                       if (cCharAt10 == '\t' || cCharAt10 == c4) {
/* 332 */                                                           i5 = i45;
/* 338 */                                                           i47 = i47;
/* 340 */                                                           i46 = i46;
                                                                } else if (cCharAt10 != c3) {
/* 301 */                                                           if (cCharAt10 == '-') {
/* 320 */                                                               i45++;
                                                                    } else if (cCharAt10 == '_') {
/* 311 */                                                               i46++;
                                                                    }
/* 313 */                                                           i5 = i45;
                                                                } else {
/* 323 */                                                           i5 = i45;
/* 329 */                                                           i47++;
                                                                }
/* 342 */                                                       i44++;
/* 344 */                                                       i45 = i5;
/* 346 */                                                       c4 = ' ';
/* 348 */                                                       c3 = '*';
                                                            }
                                                        }
/* 407 */                                               iI1011iI00000oOI = null;
/* 408 */                                               i00io1l = i00io1l3;
/* 410 */                                               i = 4;
                                                    }
                                            }
/* 1921 */                                  if (iI1011iI00000oOI == null) {
/* 1924 */                                      i13 = i;
/* 1925 */                                      i00io1l3 = i00io1l;
/* 1927 */                                      i6 = 0;
                                            }
                                        } else {
/* 1932 */                                  i00io1l = i00io1l3;
/* 1934 */                                  iI1011iI00000oOI = null;
                                        }
                                    }
/* 1935 */                          if (iI1011iI00000oOI == null) {
/* 1939 */                              I000iOII(this.I0001Ioi1lo);
                                    } else {
/* 1944 */                              int i51 = this.I0000Il00O;
/* 1946 */                              if (size > 0) {
/* 1948 */                                  I0001Ioi1lo(size);
/* 1951 */                                  size = 0;
                                        }
/* 1952 */                              int i52 = iI1011iI00000oOI.I00000oIO;
/* 1955 */                              if (i52 != -1) {
/* 1957 */                                  I000iOII(i52);
                                        } else {
/* 1961 */                                  int i53 = iI1011iI00000oOI.I00000oOI;
/* 1963 */                                  if (i53 != -1) {
/* 1965 */                                      I000OiO(i53);
                                            }
                                        }
/* 1970 */                              if (iI1011iI00000oOI.I0000Il00O) {
/* 1979 */                                  I00io1l i00io1l5 = ((Iiili1Illo) IIlIOloOOO.I000o00OoI0I(1, arrayList)).I00000oIO;
/* 1983 */                                  if (i00io1l5 instanceof OIoiiI) {
/* 1988 */                                      I00000oOI((OIoiiI) i00io1l5);
                                            }
/* 1991 */                                  i00io1l5.I0000oI00();
/* 1998 */                                  i00io1l5.I0001Ioi1lo().I000OOo1O();
/* 2005 */                                  listI0000O = i00io1l5.I0001Ioi1lo().I0000O();
                                        } else {
/* 2010 */                                  listI0000O = null;
                                        }
/* 2013 */                              I00io1l[] i00io1lArr2 = (I00io1l[]) iI1011iI00000oOI.I0000O;
/* 2015 */                              int length8 = i00io1lArr2.length;
/* 2016 */                              boolean zI000II = z5;
/* 2017 */                              int i54 = 0;
/* 2018 */                              while (i54 < length8) {
/* 2020 */                                  I00io1l i00io1l6 = i00io1lArr2[i54];
/* 2027 */                                  I00000oIO(new Iiili1Illo(i00io1l6, i51));
/* 2030 */                                  if (listI0000O != null) {
/* 2036 */                                      i00io1l6.I0001Ioi1lo().I000II(listI0000O);
                                            }
/* 2043 */                                  i54++;
/* 2045 */                                  i00io1l = i00io1l6;
/* 2039 */                                  zI000II = i00io1l6.I000II();
                                        }
/* 2050 */                              z5 = zI000II;
/* 2051 */                              i00io1l3 = i00io1l;
/* 2053 */                              i6 = 0;
/* 2055 */                              z6 = true;
                                    }
                                }
                            }
                        } else {
/* 2064 */                  i00io1l = i00io1l3;
                        }
                    }
/* 2066 */          if (!z6 && !this.I000OOo1O && I000O01llI0().I0000O()) {
/* 2089 */              ((Iiili1Illo) IIl001iO0Io.I000OiO(1, arrayList)).I00000oOI = i12;
/* 2091 */              I0000Il00O();
/* 2094 */              return;
                    }
/* 2095 */          if (size > 0) {
/* 2097 */              I0001Ioi1lo(size);
                    }
/* 2104 */          if (!i00io1l.I000II()) {
/* 2106 */              I0000Il00O();
/* 2109 */              return;
                    }
/* 2112 */          if (this.I000OOo1O) {
/* 2178 */              I0000O();
/* 2181 */              return;
                    }
/* 2116 */          OIoiiI oIoiiI = new OIoiiI();
/* 2124 */          oIoiiI.I00000oIO = new OIoi1lo00I00();
/* 2128 */          O0ooo1Oo o0ooo1Oo = new O0ooo1Oo();
/* 2132 */          o0ooo1Oo.I00000oIO = 1;
/* 2139 */          o0ooo1Oo.I00000oOI = new ArrayList();
/* 2146 */          o0ooo1Oo.I0000Il00O = new ArrayList();
/* 2153 */          o0ooo1Oo.I0000O = new ArrayList();
/* 2156 */          o0ooo1Oo.I000OOo1O = false;
/* 2158 */          VarHandle.storeStoreFence();
/* 2161 */          oIoiiI.I00000oOI = o0ooo1Oo;
/* 2163 */          VarHandle.storeStoreFence();
/* 2171 */          I00000oIO(new Iiili1Illo(oIoiiI, i12));
/* 2174 */          I0000Il00O();
                }

                public final void I000OiO(int i) {
                    int i2;
/* 1 */             int i3 = this.I000II;
/* 3 */             if (i >= i3) {
/* 7 */                 this.I0000Il00O = this.I0001Ioi1lo;
/* 9 */                 this.I0000O = i3;
                    }
/* 15 */            int length = this.I00000oIO.I00000oIO.length();
                    while (true) {
/* 19 */                i2 = this.I0000O;
/* 21 */                if (i2 >= i || this.I0000Il00O == length) {
                            break;
                        } else {
/* 27 */                    I0000oI00();
                        }
                    }
/* 31 */            if (i2 <= i) {
/* 45 */                this.I0000oI00 = false;
/* 49 */                return;
                    }
                    this.I0000Il00O--;
/* 39 */            this.I0000O = i;
/* 41 */            this.I0000oI00 = true;
                }

                public final void I000iOII(int i) {
/* 1 */             int i2 = this.I0001Ioi1lo;
/* 3 */             if (i >= i2) {
/* 5 */                 this.I0000Il00O = i2;
/* 9 */                 this.I0000O = this.I000II;
                    }
/* 15 */            int length = this.I00000oIO.I00000oIO.length();
                    while (true) {
/* 19 */                int i3 = this.I0000Il00O;
/* 21 */                if (i3 >= i || i3 == length) {
                            break;
                        } else {
/* 25 */                    I0000oI00();
                        }
                    }
/* 30 */            this.I0000oI00 = false;
                }
            }
