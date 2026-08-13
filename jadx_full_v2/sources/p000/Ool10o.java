            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Range;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
            import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeMap;
            
/* 18 */    public abstract class Ool10o {
                public OolIl0ii1 I0001Ioi1lo;
                public final OolIl0ii1 I000II;
                public HashSet I000O01llI0;
                public OolIl0ii1 I000OOo1O;
                public I1lIoOIi I000OiO;
                public OolIl0ii1 I000iOII;
                public Rect I000l1;
                public IIllOo0 I000o00OoI0I;
                public IIllOo0 I000oI1ioi;
                public boolean I00000oIO = false;
                public final HashSet I00000oOI = new HashSet();
                public final Object I0000Il00O = new Object();
                public final Object I0000O = new Object();
                public int I0000oI00 = 2;
                public Matrix I000lI = new Matrix();
                public OillooOlI I00100l0 = OillooOlI.I00000oIO();
                public OillooOlI I00100o1O0lo = OillooOlI.I00000oIO();

                public Ool10o(OolIl0ii1 oolIl0ii1) {
/* 50 */            this.I000II = oolIl0ii1;
/* 52 */            this.I000OOo1O = oolIl0ii1;
                }

                public final void I00000oIO(OilliIo0l0OI oilliIo0l0OI, I1lIoOIi i1lIoOIi) {
/* 1 */             Range range = I1lIoOIi.I000O01llI0;
/* 9 */             if (!range.equals(i1lIoOIi.I0000oI00)) {
/* 21 */                ((OI0oiliol10O) oilliIo0l0OI.I00000oOI.I00iio).I0010I0i(IIoo00iOol0.I000O01llI0, i1lIoOIi.I0000oI00);
/* 24 */                return;
                    }
                    synchronized (this.I0000Il00O) {
                        try {
/* 28 */                    IIllOo0 iIllOo0 = this.I000o00OoI0I;
/* 30 */                    iIllOo0.getClass();
/* 43 */                    ArrayList arrayListI0000Il00O = iIllOo0.I0010o().I0010o().I0000Il00O(AeFpsRangeQuirk.class);
/* 52 */                    boolean z = true;
/* 53 */                    if (arrayListI0000Il00O.size() > 1) {
/* 56 */                        z = false;
                            }
/* 59 */                    lII1OI11o1I.I00000oIO("There should not have more than one AeFpsRangeQuirk.", z);
/* 66 */                    if (!arrayListI0000Il00O.isEmpty()) {
/* 82 */                        Range range2 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListI0000Il00O.get(0))).I00000oIO.getValue();
/* 84 */                        if (range2 != null) {
/* 87 */                            range = range2;
                                }
/* 96 */                        ((OI0oiliol10O) oilliIo0l0OI.I00000oOI.I00iio).I0010I0i(IIoo00iOol0.I000O01llI0, range);
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                public final void I00000oOI(IIllOo0 iIllOo0, IIllOo0 iIllOo02, OolIl0ii1 oolIl0ii1, OolIl0ii1 oolIl0ii12) {
                    synchronized (this.I0000Il00O) {
/* 4 */                 this.I000o00OoI0I = iIllOo0;
/* 6 */                 this.I000oI1ioi = iIllOo02;
/* 10 */                this.I00000oOI.add(iIllOo0);
/* 13 */                if (iIllOo02 != null) {
/* 17 */                    this.I00000oOI.add(iIllOo02);
                        }
                    }
/* 21 */            this.I0001Ioi1lo = oolIl0ii1;
/* 23 */            this.I000iOII = oolIl0ii12;
/* 37 */            this.I000OOo1O = I000oI1ioi(iIllOo0.I0010o(), this.I0001Ioi1lo, this.I000iOII);
                    synchronized (this.I0000O) {
                    }
/* 43 */            I0010o();
                }

                public final Size I0000Il00O() {
/* 1 */             I1lIoOIi i1lIoOIi = this.I000OiO;
/* 3 */             if (i1lIoOIi != null) {
/* 5 */                 return i1lIoOIi.I00000oIO;
                    }
/* 8 */             return null;
                }

                public final IIllOo0 I0000O() {
                    IIllOo0 iIllOo0;
                    synchronized (this.I0000Il00O) {
/* 4 */                 iIllOo0 = this.I000o00OoI0I;
                    }
/* 7 */             return iIllOo0;
                }

                public final IIlO1O0lOl I0000oI00() {
                    synchronized (this.I0000Il00O) {
                        try {
/* 4 */                     IIllOo0 iIllOo0 = this.I000o00OoI0I;
/* 6 */                     if (iIllOo0 == null) {
/* 8 */                         return IIlO1O0lOl.I00000oIO;
                            }
/* 14 */                    return iIllOo0.I000O01llI0();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final String I0001Ioi1lo() {
/* 1 */             IIllOo0 iIllOo0I0000O = I0000O();
/* 19 */            lII1OI11o1I.I0000O("No camera attached to use case: " + this, iIllOo0I0000O);
/* 26 */            return iIllOo0I0000O.I0010o().I0001Ioi1lo();
                }

                public abstract OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I);

                public final String I000O01llI0() {
/* 32 */            String str = (String) this.I000OOo1O.I00000oOI(OloIIlI1o10.I00IOO, "<UnknownUseCase-" + hashCode() + ">");
/* 34 */            Objects.requireNonNull(str);
/* 55 */            return str;
                }

                public final int I000OOo1O(IIllOo0 iIllOo0, boolean z) {
/* 14 */            int iI000o00OoI0I = iIllOo0.I0010o().I000o00OoI0I(((IoiIli1i0Oil) this.I000OOo1O).I001lloI(0));
                    return (iIllOo0.I00100o1O0lo() || !z) ? iI000o00OoI0I : OoI0lIiO.I000OOo1O(-iI000o00OoI0I);
                }

                public final IIllOo0 I000OiO() {
                    IIllOo0 iIllOo0;
                    synchronized (this.I0000Il00O) {
/* 4 */                 iIllOo0 = this.I000oI1ioi;
                    }
/* 7 */             return iIllOo0;
                }

                public Set I000iOII() {
/* 1 */             return Collections.EMPTY_SET;
                }

                public abstract OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1);

                public boolean I000lI() {
/* 1 */             return this instanceof Ioi01I0;
                }

                public final boolean I000o00OoI0I(IIllOo0 iIllOo0) {
/* 18 */            int iIntValue = ((Integer) ((IoiIli1i0Oil) this.I000OOo1O).I00000oOI(IoiIli1i0Oil.I001i1O0Ol, -1)).intValue();
/* 23 */            if (iIntValue == -1 || iIntValue == 0) {
/* 22 */                return false;
                    }
/* 28 */            if (iIntValue == 1) {
/* 27 */                return true;
                    }
/* 31 */            if (iIntValue == 2) {
/* 33 */                return iIllOo0.I0001Ioi1lo();
                    }
/* 44 */            I000II.I000O01llI0(Oi010OO0.I000oI1ioi(iIntValue, "Unknown mirrorMode: "));
/* 22 */            return false;
                }

                public final OolIl0ii1 I000oI1ioi(IIllOioOlolI iIllOioOlolI, OolIl0ii1 oolIl0ii1, OolIl0ii1 oolIl0ii12) {
                    OI0oiliol10O oI0oiliol10OI000OOo1O;
/* 6 */             if (oolIl0ii12 != null) {
/* 8 */                 oI0oiliol10OI000OOo1O = OI0oiliol10O.I000iOII(oolIl0ii12);
/* 14 */                oI0oiliol10OI000OOo1O.I001IO000(OloIIlI1o10.I00IOO);
                    } else {
/* 18 */                oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
                    }
/* 22 */            TreeMap treeMap = oI0oiliol10OI000OOo1O.I00iOIl;
/* 24 */            I1ioiI i1ioiI = IoiIli1i0Oil.I00111O;
/* 26 */            OolIl0ii1 oolIl0ii13 = this.I000II;
/* 32 */            if (oolIl0ii13.I000O01llI0(i1ioiI) || oolIl0ii13.I000O01llI0(IoiIli1i0Oil.I001i1lo1io)) {
/* 42 */                I1ioiI i1ioiI2 = IoiIli1i0Oil.I001lllioOl;
/* 48 */                if (treeMap.containsKey(i1ioiI2)) {
/* 50 */                    oI0oiliol10OI000OOo1O.I001IO000(i1ioiI2);
                        }
                    }
/* 53 */            I1ioiI i1ioiI3 = IoiIli1i0Oil.I001lllioOl;
/* 59 */            if (oolIl0ii13.I000O01llI0(i1ioiI3)) {
/* 61 */                I1ioiI i1ioiI4 = IoiIli1i0Oil.I001l0I00;
/* 67 */                if (treeMap.containsKey(i1ioiI4) && ((Oi0Oliol) oolIl0ii13.I0000O(i1ioiI3)).I00000oOI != null) {
/* 79 */                    oI0oiliol10OI000OOo1O.I001IO000(i1ioiI4);
                        }
                    }
/* 86 */            Iterator it = oolIl0ii13.I0000Il00O().iterator();
/* 94 */            while (it.hasNext()) {
/* 102 */               IOlOo1ll1l1.I000oI1ioi(oI0oiliol10OI000OOo1O, oI0oiliol10OI000OOo1O, oolIl0ii13, (I1ioiI) it.next());
                    }
/* 106 */           if (oolIl0ii1 != null) {
/* 120 */               for (I1ioiI i1ioiI5 : oolIl0ii1.I0000Il00O()) {
/* 138 */                   if (!i1ioiI5.I00000oIO.equals(OloIIlI1o10.I00IOO.I00000oIO)) {
/* 141 */                       IOlOo1ll1l1.I000oI1ioi(oI0oiliol10OI000OOo1O, oI0oiliol10OI000OOo1O, oolIl0ii1, i1ioiI5);
                            }
                        }
                    }
/* 151 */           if (treeMap.containsKey(IoiIli1i0Oil.I001i1lo1io)) {
/* 153 */               I1ioiI i1ioiI6 = IoiIli1i0Oil.I00111O;
/* 159 */               if (treeMap.containsKey(i1ioiI6)) {
/* 161 */                   oI0oiliol10OI000OOo1O.I001IO000(i1ioiI6);
                        }
                    }
/* 164 */           I1ioiI i1ioiI7 = IoiIli1i0Oil.I001lllioOl;
/* 170 */           if (treeMap.containsKey(i1ioiI7)) {
/* 178 */               ((Oi0Oliol) oI0oiliol10OI000OOo1O.I0000O(i1ioiI7)).getClass();
                    }
/* 193 */           Objects.toString(this.I000O01llI0);
/* 196 */           toString();
/* 202 */           l11I11lO.I0000O(3, "UseCase");
/* 205 */           HashSet<Io1100oIo> hashSet = this.I000O01llI0;
/* 207 */           if (hashSet != null) {
/* 211 */               int i = IioI0l0IOIO1.I00000oIO;
/* 213 */               Range range = I1lIoOIi.I000O01llI0;
/* 215 */               Oooi0I oooi0I = Oooi0O111OII.I00000oIO;
/* 221 */               Iio1oiI iio1oiI = Iio1oiI.I0000O;
/* 227 */               for (Io1100oIo io1100oIo : hashSet) {
/* 238 */                   if (io1100oIo instanceof IioI0l0IOIO1) {
/* 240 */                       iio1oiI = null;
                            } else if (io1100oIo instanceof Ill01oIIO0) {
/* 248 */                       range = new Range(0, 0);
                            } else if (io1100oIo instanceof Oooi0O111OII) {
/* 256 */                       oooi0I = null;
                            }
                        }
/* 260 */               if ((this instanceof OOIIOiolI) || li0IooIlo10.I00000oOI(this)) {
/* 270 */                   oI0oiliol10OI000OOo1O.I0010I0i(IoiIOIliOIi1.I0010o, iio1oiI);
                        }
/* 275 */               oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00O0i0ii, range);
/* 278 */               int iOrdinal = oooi0I.ordinal();
/* 282 */               if (iOrdinal == 0) {
/* 326 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OIo, 0);
/* 331 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OOll1, 0);
                        } else if (iOrdinal == 1) {
/* 315 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OIo, 1);
/* 320 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OOll1, 1);
                        } else if (iOrdinal == 2) {
/* 304 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OIo, 0);
/* 309 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OOll1, 2);
                        } else if (iOrdinal == 3) {
/* 293 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OIo, 2);
/* 298 */                   oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00OOll1, 0);
                        }
                    }
/* 338 */           return I001IIilI0O(iIllOioOlolI, I000l1(oI0oiliol10OI000OOo1O));
                }

                public final void I00100l0() {
/* 2 */             this.I0000oI00 = 1;
/* 4 */             I0010I0i();
                }

                public final void I00100o1O0lo() {
/* 3 */             Iterator it = this.I00000oOI.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((Ool10ll) it.next()).I0000oI00(this);
                    }
                }

                public final void I0010I0i() {
/* 3 */             int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(this.I0000oI00);
/* 7 */             HashSet hashSet = this.I00000oOI;
/* 9 */             if (iI001lIiIIo1O == 0) {
/* 35 */                Iterator it = hashSet.iterator();
/* 43 */                while (it.hasNext()) {
/* 51 */                    ((Ool10ll) it.next()).I000II(this);
                        }
                    } else {
/* 12 */                if (iI001lIiIIo1O != 1) {
/* 55 */                    return;
                        }
/* 15 */                Iterator it2 = hashSet.iterator();
/* 23 */                while (it2.hasNext()) {
/* 31 */                    ((Ool10ll) it2.next()).I00111O(this);
                        }
                    }
                }

                public OolIl0ii1 I001IIilI0O(IIllOioOlolI iIllOioOlolI, OolIii00oi1 oolIii00oi1) {
/* 1 */             return oolIii00oi1.I00100o1O0lo();
                }

                public void I001IO000() {
/* 2 */             this.I00000oIO = true;
                }

                public void I001i1O0Ol() {
/* 2 */             this.I00000oIO = false;
                }

                public I1lIoOIi I001i1lo1io(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 1 */             I1lIoOIi i1lIoOIi = this.I000OiO;
/* 3 */             if (i1lIoOIi == null) {
/* 18 */                OoOil11Ol1o.I000OiO("Attempt to update the implementation options for a use case without attached stream specifications.");
/* 21 */                return null;
                    }
/* 5 */             IOiOol0 iOiOol0I00000oOI = i1lIoOIi.I00000oOI();
/* 9 */             iOiOol0I00000oOI.I00io1l = iOlOo1ll1l1;
/* 11 */            return iOiOol0I00000oOI.I0000O();
                }

                public abstract I1lIoOIi I001iOo1i0O(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2);

                public abstract void I001l0I00();

                public void I001lIiIIo1O(Matrix matrix) {
/* 6 */             this.I000lI = new Matrix(matrix);
                }

                public void I001lllioOl(Rect rect) {
/* 1 */             this.I000l1 = rect;
                }

                public final void I001lloI(IIllOo0 iIllOo0) {
/* 1 */             I001l0I00();
                    synchronized (this.I0000Il00O) {
                        try {
/* 7 */                     IIllOo0 iIllOo02 = this.I000o00OoI0I;
/* 10 */                    if (iIllOo0 == iIllOo02) {
/* 14 */                        this.I00000oOI.remove(iIllOo02);
/* 17 */                        this.I000o00OoI0I = null;
                            }
/* 22 */                    IIllOo0 iIllOo03 = this.I000oI1ioi;
/* 24 */                    if (iIllOo0 == iIllOo03) {
/* 28 */                        this.I00000oOI.remove(iIllOo03);
/* 31 */                        this.I000oI1ioi = null;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                    synchronized (this.I0000O) {
                    }
/* 38 */            this.I000OiO = null;
/* 40 */            this.I000l1 = null;
/* 44 */            this.I000OOo1O = this.I000II;
/* 46 */            this.I0001Ioi1lo = null;
/* 48 */            this.I000iOII = null;
                }

                public final void I00II0Ol1O0l(List list) {
/* 5 */             if (list.isEmpty()) {
/* 168 */               return;
                    }
/* 15 */            this.I00100l0 = (OillooOlI) list.get(0);
/* 22 */            if (list.size() > 1) {
/* 30 */                this.I00100o1O0lo = (OillooOlI) list.get(1);
                    }
/* 32 */            Iterator it = list.iterator();
/* 40 */            while (it.hasNext()) {
/* 60 */                for (IiIO1ol1i1o0 iiIO1ol1i1o0 : ((OillooOlI) it.next()).I00000oOI()) {
/* 70 */                    if (iiIO1ol1i1o0.I000OiO == null) {
/* 76 */                        iiIO1ol1i1o0.I000OiO = getClass();
                            }
                        }
                    }
                }

                public final void I00II0oii1o(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 5 */             this.I000OiO = I001iOo1i0O(i1lIoOIi, i1lIoOIi2);
                }

/* 19 */        public void I0010o() {
                }

/* 19 */        public void I00111O() {
                }
            }
