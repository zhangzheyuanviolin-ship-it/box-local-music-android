            package p000;

            import android.os.SystemClock;
            import android.view.MotionEvent;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.HashSet;
            import java.util.List;
            
/* 27 */    public final class I1o1il extends O1ooOo implements O0iOoioOoI, Iillo1il11l, OiiooOl, OO1iloII0lOo, O1oolIO0, OO0101O11i, O0iOIlio1O, Io0Illo, Ili0l001o1Io, Ili1l10, Ili1oii1llI, OIlO0l10o01, IIIO0OI {
                public O1ooIoIolOli I00o0iI0io1;
                public I1o1iOOiol I00o0l1o1o0;
                public HashSet I00o101lO;

                @Override
                public final IiIooOOOI I00000oIO() {
/* 5 */             return il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 5 */             return ((O0iOliloIli) this.I00o0iI0io1).I0000Il00O(o1iOIoOiO0, o1iIo0ll, j);
                }

                @Override
                public final void I0000O() {
/* 5 */             if (this.I00o0iI0io1 instanceof OO1ioi) {
/* 7 */                 I00IO1oi11O();
                    }
                }

                @Override
                public final long I0000oI00() {
/* 9 */             return l000O1l.I00000oOI(il0lI1i1olii.I0000oI00(this, Barcode.FORMAT_ITF).I00iiO);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 34 */            return ((O0iOliloIli) this.I00o0iI0io1).I0000Il00O(new O000i0Il0o(o1IiO0l, o1IiO0l.getLayoutDirection()), new Ii1olOII0O(o1iIo0ll, O1iOlli.I00iiI, O1iOo0o1i.I00iOIl, 1), IOo0olo.I00000oOI(0, 0, 0, i, 7)).I0001Ioi1lo();
                }

                @Override
                public final boolean I001IIilI0O() {
/* 1 */             return this.I00lll10;
                }

                @Override
                public final Object I001iOo1i0O(IiIooOOOI iiIooOOOI, Object obj) {
/* 5 */             return ((OO00oIlloIl) this.I00o0iI0io1).I0000oI00();
                }

                @Override
                public final void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
                    boolean z;
                    boolean z2;
                    boolean z3;
/* 5 */             OillOo0 oillOo0 = ((OO1ioi) this.I00o0iI0io1).I0000O;
/* 9 */             OO1ioi oO1ioi = (OO1ioi) oillOo0.I00ilI0I1;
/* 11 */            List list = oO1Oooio101.I00000oIO;
/* 14 */            List list2 = list;
/* 16 */            int size = list2.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 29 */                OO1il00lI oO1il00lI = (OO1il00lI) list.get(i);
/* 35 */                if (lI1Ol11OOlll.I00000oOI(oO1il00lI) || lI1Ol11OOlll.I0000O(oO1il00lI)) {
/* 46 */                    z = false;
                            break;
                        }
                    }
/* 48 */            z = true;
/* 49 */            if (!z) {
/* 76 */                z2 = false;
                        break;
                    }
/* 51 */            int size2 = list2.size();
/* 56 */            for (int i2 = 0; i2 < size2; i2++) {
/* 68 */                if (((OO1il00lI) list.get(i2)).I0000Il00O()) {
/* 76 */                    z2 = false;
                            break;
                        }
                    }
/* 74 */            z2 = true;
/* 79 */            if (oO1ioi.I0000Il00O) {
/* 115 */               z3 = true;
                    } else {
/* 81 */                int size3 = list2.size();
/* 85 */                int i3 = 0;
                        while (true) {
/* 86 */                    if (i3 < size3) {
/* 92 */                        OO1il00lI oO1il00lI2 = (OO1il00lI) list.get(i3);
/* 98 */                        if (lI1Ol11OOlll.I00000oOI(oO1il00lI2) || lI1Ol11OOlll.I0000O(oO1il00lI2)) {
                                    break;
                                } else {
/* 107 */                           i3++;
                                }
                            } else if (z2) {
                                break;
                            } else {
/* 113 */                       z3 = false;
                            }
                        }
/* 115 */               z3 = true;
                    }
/* 122 */           if (((OO1io1OOl) oillOo0.I00iiO) != OO1io1OOl.I00iiO) {
/* 126 */               if (oO1i0l == OO1i0l.I00iOIl && z3) {
/* 130 */                   oillOo0.I00iio = oO1Oooio101;
/* 142 */                   oillOo0.I000OiO(oO1Oooio101, !z || oO1ioi.I0000Il00O);
                        }
/* 147 */               if (oO1i0l == OO1i0l.I00iiI && z && oO1Oooio101 == ((OO1Oooio101) oillOo0.I00iio) && oO1ioi.I0000Il00O) {
/* 162 */                   int size4 = list2.size();
/* 167 */                   for (int i4 = 0; i4 < size4; i4++) {
/* 175 */                       ((OO1il00lI) list.get(i4)).I00000oIO();
                            }
                        }
/* 183 */               if (oO1i0l == OO1i0l.I00iiO && !z3 && oO1Oooio101 != ((OO1Oooio101) oillOo0.I00iio)) {
/* 193 */                   oillOo0.I000OiO(oO1Oooio101, true);
                        }
                    }
/* 198 */           if (oO1i0l == OO1i0l.I00iiO) {
/* 200 */               int size5 = list2.size();
/* 204 */               int i5 = 0;
                        while (true) {
/* 205 */                   if (i5 >= size5) {
/* 225 */                       oillOo0.I00iiO = OO1io1OOl.I00iOIl;
/* 231 */                       ((OO1ioi) oillOo0.I00ilI0I1).I0000Il00O = false;
/* 234 */                       oillOo0.I00iio = null;
                                break;
                            } else if (!lI1Ol11OOlll.I0000O((OO1il00lI) list.get(i5))) {
                                break;
                            } else {
/* 220 */                       i5++;
                            }
                        }
/* 240 */               if (oO1Oooio101 == ((OO1Oooio101) oillOo0.I00iio) && z) {
/* 245 */                   int size6 = list2.size();
/* 249 */                   int i6 = 0;
                            while (true) {
/* 250 */                       if (i6 >= size6) {
                                    break;
                                }
/* 262 */                       if (!((OO1il00lI) list.get(i6)).I0000Il00O()) {
/* 272 */                           i6++;
                                } else if (!oO1ioi.I0000Il00O) {
/* 268 */                           oillOo0.I0010I0i(oO1Oooio101);
/* 271 */                           return;
                                }
                            }
/* 275 */                   int size7 = list2.size();
/* 279 */                   for (int i7 = 0; i7 < size7; i7++) {
/* 287 */                       ((OO1il00lI) list.get(i7)).I00000oIO();
                            }
                        }
                    }
                }

                @Override
                public final void I001lloI(Ili1l0 ili1l0) {
/* 1 */             O1ooIoIolOli o1ooIoIolOli = this.I00o0iI0io1;
/* 5 */             IolioOO1.I0000Il00O("applyFocusProperties called on wrong node");
/* 8 */             o1ooIoIolOli.getClass();
/* 29 */            throw new ClassCastException();
                }

                @Override
                public final void I00IO1(IliI0101O0Oi iliI0101O0Oi) {
/* 1 */             O1ooIoIolOli o1ooIoIolOli = this.I00o0iI0io1;
/* 5 */             IolioOO1.I0000Il00O("onFocusEvent called on wrong node");
/* 8 */             o1ooIoIolOli.getClass();
/* 29 */            throw new ClassCastException();
                }

                @Override
                public final void I00IO1oi11O() {
/* 5 */             OillOo0 oillOo0 = ((OO1ioi) this.I00o0iI0io1).I0000O;
/* 9 */             OO1io1OOl oO1io1OOl = (OO1io1OOl) oillOo0.I00iiO;
/* 13 */            OO1ioi oO1ioi = (OO1ioi) oillOo0.I00ilI0I1;
/* 17 */            if (oO1io1OOl == OO1io1OOl.I00iiI) {
/* 19 */                long jUptimeMillis = SystemClock.uptimeMillis();
/* 28 */                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 33 */                motionEventObtain.setSource(0);
/* 42 */                ((I10I00IO) oO1ioi.I000II()).invoke(motionEventObtain);
/* 45 */                motionEventObtain.recycle();
/* 50 */                oillOo0.I00iiO = OO1io1OOl.I00iOIl;
/* 52 */                oO1ioi.I0000Il00O = false;
/* 55 */                oillOo0.I00iio = null;
                    }
                }

                @Override
                public final void I00IoO0() {
/* 1 */             il1ollIO0I.I00000oIO(this);
                }

                @Override
                public final void I00IoiI() {
/* 7 */             ((OO1ioi) this.I00o0iI0io1).I0000O.getClass();
                }

                @Override
                public final l1i0Io1 I00OilO00Il() {
/* 1 */             I1o1iOOiol i1o1iOOiol = this.I00o0l1o1o0;
                    return i1o1iOOiol != null ? i1o1iOOiol : Il011o0OIOI.I00000oIO;
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 35 */            return ((O0iOliloIli) this.I00o0iI0io1).I0000Il00O(new O000i0Il0o(o1IiO0l, o1IiO0l.getLayoutDirection()), new Ii1olOII0O(o1iIo0ll, O1iOlli.I00iiI, O1iOo0o1i.I00iiI, 1), IOo0olo.I00000oOI(0, i, 0, 0, 13)).I0000O();
                }

                @Override
                public final void I00i01iIIliI(OIIlIII0Ili oIIlIII0Ili) {
/* 29 */            throw new ClassCastException();
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 35 */            return ((O0iOliloIli) this.I00o0iI0io1).I0000Il00O(new O000i0Il0o(o1IiO0l, o1IiO0l.getLayoutDirection()), new Ii1olOII0O(o1iIo0ll, O1iOlli.I00iOIl, O1iOo0o1i.I00iiI, 1), IOo0olo.I00000oOI(0, i, 0, 0, 13)).I0000O();
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
/* 29 */            throw null;
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 34 */            return ((O0iOliloIli) this.I00o0iI0io1).I0000Il00O(new O000i0Il0o(o1IiO0l, o1IiO0l.getLayoutDirection()), new Ii1olOII0O(o1iIo0ll, O1iOlli.I00iOIl, O1iOo0o1i.I00iOIl, 1), IOo0olo.I00000oOI(0, 0, 0, i, 7)).I0001Ioi1lo();
                }

                @Override
                public final boolean I00o0iI0io1() {
/* 7 */             ((OO1ioi) this.I00o0iI0io1).I0000O.getClass();
/* 10 */            return true;
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
/* 7 */             OiioiIIlooo oiioiIIloooI0001Ioi1lo = ((OiioloI0I0oO) this.I00o0iI0io1).I0001Ioi1lo();
/* 13 */            OiioiIIlooo oiioiIIlooo = (OiioiIIlooo) oil0O0I;
/* 15 */            OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 20 */            if (oiioiIIloooI0001Ioi1lo.I00iiO) {
/* 22 */                oiioiIIlooo.I00iiO = true;
                    }
/* 26 */            if (oiioiIIloooI0001Ioi1lo.I00iio) {
/* 28 */                oiioiIIlooo.I00iio = true;
                    }
/* 30 */            OI10I1IoI0Ol oI10I1IoI0Ol2 = oiioiIIloooI0001Ioi1lo.I00iOIl;
/* 32 */            Object[] objArr = oI10I1IoI0Ol2.I00000oOI;
/* 34 */            Object[] objArr2 = oI10I1IoI0Ol2.I0000Il00O;
/* 36 */            long[] jArr = oI10I1IoI0Ol2.I00000oIO;
                    int length = jArr.length - 2;
/* 41 */            if (length < 0) {
/* 168 */               return;
                    }
/* 43 */            int i = 0;
                    while (true) {
/* 44 */                long j = jArr[i];
/* 58 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 67 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 70 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 79 */                        if ((255 & j) < 128) {
/* 83 */                            int i4 = (i << 3) + i3;
/* 84 */                            Object obj = objArr[i4];
/* 86 */                            Object obj2 = objArr2[i4];
/* 88 */                            Oil0IoooOio oil0IoooOio = (Oil0IoooOio) obj;
/* 94 */                            if (!oI10I1IoI0Ol.I00000oOI(oil0IoooOio)) {
/* 96 */                                oI10I1IoI0Ol.I000lI(oil0IoooOio, obj2);
                                    } else if (obj2 instanceof I01lOOlO0o) {
/* 108 */                               I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) oI10I1IoI0Ol.I000II(oil0IoooOio);
/* 112 */                               String str = i01lOOlO0o.I00000oIO;
/* 114 */                               if (str == null) {
/* 119 */                                   str = ((I01lOOlO0o) obj2).I00000oIO;
                                        }
/* 121 */                               IlliIlI illiIlI = i01lOOlO0o.I00000oOI;
/* 123 */                               if (illiIlI == null) {
/* 127 */                                   illiIlI = ((I01lOOlO0o) obj2).I00000oOI;
                                        }
/* 132 */                               oI10I1IoI0Ol.I000lI(oil0IoooOio, new I01lOOlO0o(str, illiIlI));
                                    }
                                }
/* 135 */                       j >>= 8;
                            }
/* 139 */                   if (i2 != 8) {
/* 168 */                       return;
                            }
                        }
/* 141 */               if (i == length) {
/* 168 */                   return;
                        } else {
/* 143 */                   i++;
                        }
                    }
                }

                @Override
                public final void I010101Oo1lO() {
/* 2 */             I010l1O(true);
                }

                @Override
                public final void I010I0() {
/* 1 */             I010l1ol111();
                }

                public final void I010l1O(boolean z) {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("initializeModifier called on unattached node");
                    }
/* 10 */            O1ooIoIolOli o1ooIoIolOli = this.I00o0iI0io1;
/* 16 */            if ((this.I00iiO & 32) != 0 && (o1ooIoIolOli instanceof O1ooll)) {
/* 23 */                O1ooll o1ooll = (O1ooll) o1ooIoIolOli;
/* 25 */                OOiIii oOiIii = o1ooll.I00000oIO;
/* 27 */                I1o1iOOiol i1o1iOOiol = this.I00o0l1o1o0;
/* 29 */                if (i1o1iOOiol == null || !i1o1iOOiol.I00000oIO(oOiIii)) {
/* 83 */                    I1o1iOOiol i1o1iOOiol2 = new I1o1iOOiol();
/* 86 */                    i1o1iOOiol2.I00000oIO = o1ooll;
/* 88 */                    this.I00o0l1o1o0 = i1o1iOOiol2;
/* 102 */                   if (((Olo11IOO) il0lI1i1olii.I000O01llI0(this).I010101Oo1lO.I00ilO0).I00o0iI0io1) {
/* 110 */                       O1ooilI0 modifierLocalManager = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getModifierLocalManager();
/* 114 */                       OI0oiiIO0 oI0oiiIO0 = modifierLocalManager.I00000oOI;
/* 116 */                       if (oI0oiiIO0 == null) {
/* 120 */                           oI0oiiIO0 = new OI0oiiIO0();
/* 123 */                           modifierLocalManager.I00000oOI = oI0oiiIO0;
                                }
/* 125 */                       oI0oiiIO0.I00000oOI(this);
/* 128 */                       OI0oiiIO0 oI0oiiIO02 = modifierLocalManager.I0000Il00O;
/* 130 */                       if (oI0oiiIO02 == null) {
/* 134 */                           oI0oiiIO02 = new OI0oiiIO0();
/* 137 */                           modifierLocalManager.I0000Il00O = oI0oiiIO02;
                                }
/* 139 */                       oI0oiiIO02.I00000oOI(oOiIii);
/* 142 */                       modifierLocalManager.I00000oIO();
                            }
                        } else {
/* 37 */                    i1o1iOOiol.I00000oIO = o1ooll;
/* 45 */                    O1ooilI0 modifierLocalManager2 = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getModifierLocalManager();
/* 49 */                    OI0oiiIO0 oI0oiiIO03 = modifierLocalManager2.I00000oOI;
/* 51 */                    if (oI0oiiIO03 == null) {
/* 55 */                        oI0oiiIO03 = new OI0oiiIO0();
/* 58 */                        modifierLocalManager2.I00000oOI = oI0oiiIO03;
                            }
/* 60 */                    oI0oiiIO03.I00000oOI(this);
/* 63 */                    OI0oiiIO0 oI0oiiIO04 = modifierLocalManager2.I0000Il00O;
/* 65 */                    if (oI0oiiIO04 == null) {
/* 69 */                        oI0oiiIO04 = new OI0oiiIO0();
/* 72 */                        modifierLocalManager2.I0000Il00O = oI0oiiIO04;
                            }
/* 74 */                    oI0oiiIO04.I00000oOI(oOiIii);
/* 77 */                    modifierLocalManager2.I00000oIO();
                        }
                    }
/* 149 */           if ((this.I00iiO & 4) != 0 && !z) {
/* 153 */               l0o11Oi.I00000oIO(this);
                    }
/* 160 */           if ((this.I00iiO & 2) != 0) {
/* 174 */               if (((Olo11IOO) il0lI1i1olii.I000O01llI0(this).I010101Oo1lO.I00ilO0).I00o0iI0io1) {
/* 176 */                   OIIlIII0Ili oIIlIII0Ili = this.I00ioIO;
/* 181 */                   ((O0iiIiio01I0) oIIlIII0Ili).I01Io1(this);
/* 184 */                   OIlIooO oIlIooO = oIIlIII0Ili.I01101olii;
/* 186 */                   if (oIlIooO != null) {
/* 190 */                       ((Io10OIiiOll) oIlIooO).I0000Il00O();
                            }
                        }
/* 193 */               if (!z) {
/* 195 */                   l0o11Oi.I00000oIO(this);
/* 202 */                   il0lI1i1olii.I000O01llI0(this).I00IOO();
                        }
                    }
/* 207 */           if (o1ooIoIolOli instanceof O0l0o0I) {
/* 210 */               O0l0o0I o0l0o0I = (O0l0o0I) o1ooIoIolOli;
/* 212 */               O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(this);
                        switch (o0l0o0I.I00000oIO) {
                            case 0:
/* 242 */                       ((O0l101IIlOI0) o0l0o0I.I00000oOI).I000OiO = o0iiOioolIiI000O01llI0;
                                break;
                            case 1:
/* 235 */                       ((O0o0I1i0O) o0l0o0I.I00000oOI).I000l1 = o0iiOioolIiI000O01llI0;
                                break;
                            default:
/* 227 */                       ((IiI0O1Io) o0l0o0I.I00000oOI).I001i1lo1io.setValue(o0iiOioolIiI000O01llI0);
                                break;
                        }
                    }
/* 244 */           int i = this.I00iiO;
/* 248 */           if ((i & 16) != 0 && (o1ooIoIolOli instanceof OO1ioi)) {
/* 260 */               ((OO1ioi) o1ooIoIolOli).I0000O.I00iiI = this.I00ioIO;
                    }
/* 264 */           if ((i & 8) != 0) {
/* 272 */               ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).I001iOo1i0O();
                    }
                }

                public final void I010l1ol111() {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("unInitializeModifier called on unattached node");
                    }
/* 10 */            O1ooIoIolOli o1ooIoIolOli = this.I00o0iI0io1;
/* 16 */            if ((this.I00iiO & 32) != 0 && (o1ooIoIolOli instanceof O1ooll)) {
/* 28 */                O1ooilI0 modifierLocalManager = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getModifierLocalManager();
/* 34 */                OOiIii oOiIii = ((O1ooll) o1ooIoIolOli).I00000oIO;
/* 36 */                OI0oiiIO0 oI0oiiIO0 = modifierLocalManager.I0000O;
/* 38 */                if (oI0oiiIO0 == null) {
/* 42 */                    oI0oiiIO0 = new OI0oiiIO0();
/* 45 */                    modifierLocalManager.I0000O = oI0oiiIO0;
                        }
/* 51 */                oI0oiiIO0.I00000oOI(il0lI1i1olii.I000O01llI0(this));
/* 54 */                OI0oiiIO0 oI0oiiIO02 = modifierLocalManager.I0000oI00;
/* 56 */                if (oI0oiiIO02 == null) {
/* 60 */                    oI0oiiIO02 = new OI0oiiIO0();
/* 63 */                    modifierLocalManager.I0000oI00 = oI0oiiIO02;
                        }
/* 65 */                oI0oiiIO02.I00000oOI(oOiIii);
/* 68 */                modifierLocalManager.I00000oIO();
                    }
/* 75 */            if ((this.I00iiO & 8) != 0) {
/* 83 */                ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).I001iOo1i0O();
                    }
                }

                public final void I010lI0oi() {
/* 3 */             if (this.I00lll10) {
/* 7 */                 this.I00o101lO.clear();
/* 16 */                OIlOIi0 snapshotObserver = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getSnapshotObserver();
/* 24 */                I01iOOoiOI i01iOOoiOI = new I01iOOoiOI(22);
/* 27 */                VarHandle.storeStoreFence();
/* 34 */                snapshotObserver.I00000oIO.I0000oI00(this, i11Iio0OOOI.I00000oIO, i01iOOoiOI);
                    }
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 5 */             return il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll;
                }

                public final String toString() {
/* 3 */             return this.I00o0iI0io1.toString();
                }

                @Override
/* 28 */        public final void I00000oOI(long j) {
                }

                @Override
/* 28 */        public final void I000iOII(O0iOOo0Ii o0iOOo0Ii) {
                }
            }
