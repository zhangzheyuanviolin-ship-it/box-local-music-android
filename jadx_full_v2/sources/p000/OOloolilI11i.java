            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            
/* 27 */    public final class OOloolilI11i extends IOl1ool0 {
                public static final OlO0OIIl1 I001l0I00 = OlO0iOl0il.I00000oIO(OO0oo1.I00iio);
                public static final AtomicReference I001lIiIIo1O = new AtomicReference(Boolean.FALSE);
                public I101iI1i I00000oIO;
                public IoIlOo1o0IIl I00000oOI;
                public Object I0000Il00O;
                public O010OIi I0000O;
                public Throwable I0000oI00;
                public ArrayList I0001Ioi1lo;
                public List I000II;
                public OI10IIO I000O01llI0;
                public OI110O0 I000OOo1O;
                public ArrayList I000OiO;
                public ArrayList I000iOII;
                public OI10I1IoI0Ol I000l1;
                public IIlio101Io I000lI;
                public OI10I1IoI0Ol I000o00OoI0I;
                public OI10I1IoI0Ol I000oI1ioi;
                public ArrayList I00100l0;
                public OI10IIO I00100o1O0lo;
                public IIoOoIol0Io0 I0010I0i;
                public OlO0OIIl1 I0010o;
                public boolean I00111O;
                public OlO0OIIl1 I001IIilI0O;
                public IOO000ilo I001IO000;
                public O010loOOi0Oo I001i1O0Ol;
                public Ii00l101O I001i1lo1io;
                public l1I0oI I001iOo1i0O;

                public static void I001l0I00(OI10OloOOoi oI10OloOOoi) {
                    try {
/* 7 */                 if (oI10OloOOoi.I001i1O0Ol() instanceof Ol1ilI) {
/* 20 */                    throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
                        }
                    } finally {
/* 22 */                oI10OloOOoi.I0000Il00O();
                    }
                }

                public static final void I001lllioOl(OOloolilI11i oOloolilI11i, OI0Iol1O oI0Iol1O, OI0Iol1O oI0Iol1O2) {
/* 1 */             List list = oI0Iol1O2.I000O01llI0;
/* 3 */             if (list != null) {
/* 8 */                 int size = list.size();
/* 13 */                for (int i = 0; i < size; i++) {
/* 19 */                    OI0Iol1O oI0Iol1O3 = (OI0Iol1O) list.get(i);
/* 21 */                    IIlio101Io iIlio101Io = oOloolilI11i.I000lI;
/* 23 */                    OI0IlliOIlO oI0IlliOIlO = oI0Iol1O3.I00000oIO;
/* 27 */                    OII1OIO oii1oio = new OII1OIO();
/* 30 */                    oii1oio.I00000oIO = oI0Iol1O3;
/* 32 */                    oii1oio.I00000oOI = oI0Iol1O;
/* 34 */                    VarHandle.storeStoreFence();
/* 41 */                    OI0i0OIO.I00000oIO((OI10I1IoI0Ol) iIlio101Io.I00iiI, oI0IlliOIlO, oii1oio);
/* 48 */                    OI0i0OIO.I00000oIO((OI10I1IoI0Ol) iIlio101Io.I00iiO, oI0Iol1O, oI0IlliOIlO);
/* 51 */                    I001lllioOl(oOloolilI11i, oI0Iol1O, oI0Iol1O3);
                        }
                    }
                }

                public static final void I00Io1lO(ArrayList arrayList, OOloolilI11i oOloolilI11i, IOlIOiI0iiI1 iOlIOiI0iiI1) {
/* 1 */             arrayList.clear();
                    synchronized (oOloolilI11i.I0000Il00O) {
/* 9 */                 Iterator it = oOloolilI11i.I000iOII.iterator();
/* 17 */                while (it.hasNext()) {
/* 23 */                    OI0Iol1O oI0Iol1O = (OI0Iol1O) it.next();
/* 31 */                    if (oI0Iol1O.I0000Il00O.equals(iOlIOiI0iiI1)) {
/* 33 */                        arrayList.add(oI0Iol1O);
/* 36 */                        it.remove();
                            }
                        }
                    }
                }

                @Override
                public final void I00000oIO(IOlIOiI0iiI1 iOlIOiI0iiI1, IlliIl1l11O illiIl1l11O) throws Throwable {
                    OOloloOII0ol oOloloOII0ol;
                    boolean zContains;
                    OI10OloOOoi oI10OloOOoiI001lloI;
/* 3 */             boolean z = iOlIOiI0iiI1.I00oOio10iI1.I00IO1;
                    synchronized (this.I0000Il00O) {
/* 14 */                OOloloOII0ol oOloloOII0ol2 = (OOloloOII0ol) this.I001IIilI0O.getValue();
/* 16 */                oOloloOII0ol = OOloloOII0ol.I00iiI;
/* 33 */                zContains = oOloloOII0ol2.compareTo(oOloloOII0ol) > 0 ? true ^ I00IOO().contains(iOlIOiI0iiI1) : true;
                    }
                    try {
/* 43 */                OIoO1Ol oIoO1Ol = new OIoO1Ol(13);
/* 46 */                oIoO1Ol.I00iiI = iOlIOiI0iiI1;
/* 48 */                VarHandle.storeStoreFence();
/* 55 */                O1lIIi o1lIIi = new O1lIIi(26);
/* 58 */                o1lIIi.I00iiI = iOlIOiI0iiI1;
/* 61 */                o1lIIi.I00iiO = null;
/* 63 */                VarHandle.storeStoreFence();
/* 66 */                Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 77 */                OI10OloOOoi oI10OloOOoi = ol1il1o1I000O01llI0 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1I000O01llI0 : null;
/* 78 */                if (oI10OloOOoi == null || (oI10OloOOoiI001lloI = oI10OloOOoi.I001lloI(oIoO1Ol, o1lIIi)) == null) {
/* 197 */                   throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
/* 86 */                    Ol1il1o1 ol1il1o1I000OiO = oI10OloOOoiI001lloI.I000OiO();
                            try {
/* 90 */                        iOlIOiI0iiI1.I000lI(illiIl1l11O);
                                synchronized (this.I0000Il00O) {
/* 114 */                           if (((OOloloOII0ol) this.I001IIilI0O.getValue()).compareTo(oOloloOII0ol) > 0 && !I00IOO().contains(iOlIOiI0iiI1)) {
/* 128 */                               this.I0001Ioi1lo.add(iOlIOiI0iiI1);
/* 131 */                               this.I000II = null;
                                    }
                                }
/* 137 */                       if (!z) {
/* 143 */                           Ol1l1lI1Ili.I000O01llI0().I000lI();
                                }
                                try {
/* 146 */                           I00IlilI0i0i(iOlIOiI0iiI1);
                                    try {
/* 149 */                               iOlIOiI0iiI1.I000II();
/* 152 */                               iOlIOiI0iiI1.I000OOo1O();
/* 155 */                               if (z) {
/* 164 */                                   return;
                                        }
/* 161 */                               Ol1l1lI1Ili.I000O01llI0().I000lI();
                                    } catch (Throwable th) {
/* 166 */                               I00IoO0(th, null);
                                    }
                                } catch (Throwable th2) {
/* 171 */                           I00IoO0(th2, iOlIOiI0iiI1);
                                }
                            } finally {
/* 182 */                       Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                            }
                        } finally {
/* 186 */                   I001l0I00(oI10OloOOoiI001lloI);
                        }
                    } catch (Throwable th3) {
/* 198 */               if (zContains) {
                            synchronized (this.I0000Il00O) {
                            }
                        }
/* 204 */               I00IoO0(th3, iOlIOiI0iiI1);
                    }
                }

                @Override
                public final OI10IIO I00000oOI(IOlIOiI0iiI1 iOlIOiI0iiI1, Ol01IliO ol01IliO, IlliIl1l11O illiIl1l11O) {
/* 1 */             IOO000ilo iOO000ilo = this.I001IO000;
                    try {
/* 4 */                 Ol01IliO ol01IliO2 = iOlIOiI0iiI1.I00o0l1o1o0;
/* 6 */                 iOlIOiI0iiI1.I00o0l1o1o0 = ol01IliO;
                        try {
/* 8 */                     I00000oIO(iOlIOiI0iiI1, illiIl1l11O);
/* 15 */                    OI10IIO oi10iio = (OI10IIO) iOO000ilo.I0010I0i();
/* 17 */                    if (oi10iio == null) {
/* 20 */                        oi10iio = OiO11lliO.I00000oIO;
                            }
/* 27 */                    return oi10iio;
                        } finally {
/* 31 */                    iOlIOiI0iiI1.I00o0l1o1o0 = ol01IliO2;
                        }
                    } finally {
/* 34 */                iOO000ilo.I00IO1(null);
                    }
                }

                @Override
                public final void I0000Il00O(OI0Iol1O oI0Iol1O) {
                    IIoOo1iIio1l iIoOo1iIio1lI001lloI;
                    synchronized (this.I0000Il00O) {
                        try {
/* 8 */                     OI0i0OIO.I00000oIO(this.I000l1, oI0Iol1O.I00000oIO, oI0Iol1O);
/* 13 */                    if (oI0Iol1O.I000O01llI0 != null) {
/* 15 */                        I001lllioOl(this, oI0Iol1O, oI0Iol1O);
                            }
/* 21 */                    iIoOo1iIio1lI001lloI = I001lloI();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 26 */            if (iIoOo1iIio1lI001lloI != null) {
/* 32 */                ((IIoOoIol0Io0) iIoOo1iIio1lI001lloI).resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                @Override
                public final boolean I0000oI00() {
/* 9 */             return ((Boolean) I001lIiIIo1O.get()).booleanValue();
                }

                @Override
                public final boolean I0001Ioi1lo() {
/* 1 */             return false;
                }

                @Override
                public final boolean I000II() {
/* 1 */             return false;
                }

                @Override
                public final long I000O01llI0() {
/* 1 */             return 1000L;
                }

                @Override
                public final IOl1o0Io1o I000OOo1O() {
/* 1 */             return null;
                }

                @Override
                public final Ii00l101O I000iOII() {
/* 1 */             return this.I001i1lo1io;
                }

                @Override
                public final boolean I000l1() {
/* 1 */             return false;
                }

                @Override
                public final void I000lI(OI0Iol1O oI0Iol1O) {
                    IIoOo1iIio1l iIoOo1iIio1lI001lloI;
                    synchronized (this.I0000Il00O) {
/* 6 */                 this.I000iOII.add(oI0Iol1O);
/* 9 */                 iIoOo1iIio1lI001lloI = I001lloI();
                    }
/* 14 */            if (iIoOo1iIio1lI001lloI != null) {
/* 20 */                ((IIoOoIol0Io0) iIoOo1iIio1lI001lloI).resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                @Override
                public final void I000o00OoI0I(IOlIOiI0iiI1 iOlIOiI0iiI1) {
                    IIoOo1iIio1l iIoOo1iIio1lI001lloI;
                    synchronized (this.I0000Il00O) {
/* 10 */                if (this.I000OOo1O.I000OOo1O(iOlIOiI0iiI1)) {
/* 24 */                    iIoOo1iIio1lI001lloI = null;
                        } else {
/* 14 */                    this.I000OOo1O.I00000oOI(iOlIOiI0iiI1);
/* 17 */                    iIoOo1iIio1lI001lloI = I001lloI();
                        }
                    }
/* 26 */            if (iIoOo1iIio1lI001lloI != null) {
/* 32 */                ((IIoOoIol0Io0) iIoOo1iIio1lI001lloI).resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000oI1ioi(OI0Iol1O oI0Iol1O, OI0Iloloi oI0Iloloi, I1IOO010 i1ioo010) {
                    OI0oiiIO0 oI0oiiIO0;
                    synchronized (this.I0000Il00O) {
/* 12 */                this.I000o00OoI0I.I000lI(oI0Iol1O, oI0Iloloi);
/* 17 */                Object objI000II = this.I000oI1ioi.I000II(oI0Iol1O);
/* 21 */                if (objI000II == null) {
/* 23 */                    oI0oiiIO0 = OIOi1o0101.I00000oOI;
                        } else if (objI000II instanceof OI0oiiIO0) {
/* 30 */                    oI0oiiIO0 = (OI0oiiIO0) objI000II;
                        } else {
/* 33 */                    Object[] objArr = OIOi1o0101.I00000oIO;
/* 38 */                    OI0oiiIO0 oI0oiiIO02 = new OI0oiiIO0(1);
/* 41 */                    oI0oiiIO02.I00000oOI(objI000II);
/* 44 */                    oI0oiiIO0 = oI0oiiIO02;
                        }
/* 49 */                if (oI0oiiIO0.I000OiO()) {
/* 55 */                    OI10I1IoI0Ol oI10I1IoI0OlI000OOo1O = oI0Iloloi.I00000oIO.I000OOo1O(i1ioo010, oI0oiiIO0);
/* 59 */                    Object[] objArr2 = oI10I1IoI0OlI000OOo1O.I00000oOI;
/* 61 */                    Object[] objArr3 = oI10I1IoI0OlI000OOo1O.I0000Il00O;
/* 63 */                    long[] jArr = oI10I1IoI0OlI000OOo1O.I00000oIO;
                            int length = jArr.length - 2;
/* 68 */                    if (length >= 0) {
/* 71 */                        int i = 0;
                                while (true) {
/* 72 */                            long j = jArr[i];
/* 86 */                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 95 */                                int i2 = 8 - ((~(i - length)) >>> 31);
/* 98 */                                for (int i3 = 0; i3 < i2; i3++) {
/* 107 */                                   if ((255 & j) < 128) {
/* 111 */                                       int i4 = (i << 3) + i3;
/* 112 */                                       Object obj = objArr2[i4];
/* 122 */                                       this.I000o00OoI0I.I000lI((OI0Iol1O) obj, (OI0Iloloi) objArr3[i4]);
                                            }
/* 128 */                                   j >>= 8;
                                        }
/* 132 */                               if (i2 != 8) {
                                            break;
                                        } else if (i == length) {
                                            break;
                                        } else {
/* 136 */                                   i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override
                public final OI0Iloloi I00100l0(OI0Iol1O oI0Iol1O) {
                    OI0Iloloi oI0Iloloi;
                    synchronized (this.I0000Il00O) {
/* 10 */                oI0Iloloi = (OI0Iloloi) this.I000o00OoI0I.I000iOII(oI0Iol1O);
                    }
/* 13 */            return oI0Iloloi;
                }

                @Override
                public final OI10IIO I00100o1O0lo(IOlIOiI0iiI1 iOlIOiI0iiI1, Ol01IliO ol01IliO, OI10IIO oi10iio) {
/* 1 */             IOO000ilo iOO000ilo = this.I001IO000;
                    try {
/* 4 */                 I00IoiI();
/* 11 */                iOlIOiI0iiI1.I001lIiIIo1O(lO0o01OilO.I00000oIO(oi10iio));
/* 14 */                Ol01IliO ol01IliO2 = iOlIOiI0iiI1.I00o0l1o1o0;
/* 16 */                iOlIOiI0iiI1.I00o0l1o1o0 = ol01IliO;
                        try {
/* 18 */                    IOlIOiI0iiI1 iOlIOiI0iiI1I00IoIO0lI = I00IoIO0lI(iOlIOiI0iiI1, null);
/* 22 */                    if (iOlIOiI0iiI1I00IoIO0lI != null) {
/* 24 */                        I00IlilI0i0i(iOlIOiI0iiI1);
/* 27 */                        iOlIOiI0iiI1I00IoIO0lI.I000II();
/* 30 */                        iOlIOiI0iiI1I00IoIO0lI.I000OOo1O();
                            }
/* 40 */                    OI10IIO oi10iio2 = (OI10IIO) iOO000ilo.I0010I0i();
/* 42 */                    if (oi10iio2 == null) {
/* 45 */                        oi10iio2 = OiO11lliO.I00000oIO;
                            }
/* 52 */                    return oi10iio2;
                        } finally {
/* 55 */                    iOlIOiI0iiI1.I00o0l1o1o0 = ol01IliO2;
                        }
                    } finally {
/* 58 */                iOO000ilo.I00IO1(null);
                    }
                }

                @Override
                public final void I00111O(OOloioIl oOloioIl) {
/* 1 */             IOO000ilo iOO000ilo = this.I001IO000;
/* 7 */             OI10IIO oi10iio = (OI10IIO) iOO000ilo.I0010I0i();
/* 9 */             if (oi10iio == null) {
/* 11 */                OI10IIO oi10iio2 = OiO11lliO.I00000oIO;
/* 15 */                oi10iio = new OI10IIO();
/* 18 */                iOO000ilo.I00IO1(oi10iio);
                    }
/* 21 */            oi10iio.I00000oIO(oOloioIl);
                }

                @Override
                public final void I001IIilI0O(IOlIOiI0iiI1 iOlIOiI0iiI1) {
                    synchronized (this.I0000Il00O) {
                        try {
/* 4 */                     OI10IIO oi10iio = this.I00100o1O0lo;
/* 6 */                     if (oi10iio == null) {
/* 8 */                         OI10IIO oi10iio2 = OiO11lliO.I00000oIO;
/* 12 */                        oi10iio = new OI10IIO();
/* 15 */                        this.I00100o1O0lo = oi10iio;
                            }
/* 20 */                    oi10iio.I00000oIO(iOlIOiI0iiI1);
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                @Override
                public final IIoi0i I001IO000(IlIi0Il ilIi0Il) {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oOI;
/* 5 */             I1ii1o0 i1ii1o0 = (I1ii1o0) ioIlOo1o0IIl.I00iiO;
/* 9 */             OIIilO10ooi oIIilO10ooi = new OIIilO10ooi();
/* 12 */            oIIilO10ooi.I00000oIO = ilIi0Il;
/* 18 */            return i1ii1o0.I00100l0(oIIilO10ooi, (O1l110o) ioIlOo1o0IIl.I00iio);
                }

                @Override
                public final void I001iOo1i0O(IOlIOiI0iiI1 iOlIOiI0iiI1) {
                    synchronized (this.I0000Il00O) {
/* 10 */                if (this.I0001Ioi1lo.remove(iOlIOiI0iiI1)) {
/* 13 */                    this.I000II = null;
                        }
/* 17 */                this.I000OOo1O.I000iOII(iOlIOiI0iiI1);
/* 22 */                this.I000OiO.remove(iOlIOiI0iiI1);
                    }
                }

                public final void I001lIiIIo1O() {
                    synchronized (this.I0000Il00O) {
/* 19 */                if (((OOloloOII0ol) this.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00ilI0I1) >= 0) {
/* 21 */                    OlO0OIIl1 olO0OIIl1 = this.I001IIilI0O;
/* 23 */                    OOloloOII0ol oOloloOII0ol = OOloloOII0ol.I00iiI;
/* 25 */                    olO0OIIl1.getClass();
/* 28 */                    olO0OIIl1.I000lI(null, oOloloOII0ol);
                        }
                    }
/* 37 */            this.I001i1O0Ol.I000II(null);
                }

                public final IIoOo1iIio1l I001lloI() {
                    OOloloOII0ol oOloloOII0ol;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0010o;
/* 3 */             ArrayList arrayList = this.I000iOII;
/* 5 */             ArrayList arrayList2 = this.I000OiO;
/* 7 */             OI110O0 oi110o0 = this.I000OOo1O;
/* 9 */             OlO0OIIl1 olO0OIIl12 = this.I001IIilI0O;
/* 24 */            if (((OOloloOII0ol) olO0OIIl12.getValue()).compareTo(OOloloOII0ol.I00iiI) > 0) {
/* 93 */                if (olO0OIIl1.getValue() != null) {
/* 95 */                    oOloloOII0ol = OOloloOII0ol.I00iiO;
                        } else if (this.I0000O == null) {
/* 107 */                   this.I000O01llI0 = new OI10IIO();
/* 109 */                   oi110o0.I000II();
/* 128 */                   oOloloOII0ol = (I00II0Ol1O0l() || I00IO1()) ? OOloloOII0ol.I00iio : OOloloOII0ol.I00iiO;
                        } else {
/* 180 */                   oOloloOII0ol = (oi110o0.I00iiO != 0 || this.I000O01llI0.I000O01llI0() || !arrayList2.isEmpty() || !arrayList.isEmpty() || I00II0Ol1O0l() || I00IO1() || this.I000l1.I000OiO()) ? OOloloOII0ol.I00ilO0 : OOloloOII0ol.I00ilI0I1;
                        }
/* 182 */               olO0OIIl12.I000lI(null, oOloloOII0ol);
/* 187 */               if (oOloloOII0ol != OOloloOII0ol.I00ilO0) {
/* 23 */                    return null;
                        }
/* 189 */               IIoOoIol0Io0 iIoOoIol0Io0 = this.I0010I0i;
/* 191 */               this.I0010I0i = null;
/* 193 */               return iIoOoIol0Io0;
                    }
/* 26 */            List listI00IOO = I00IOO();
/* 33 */            int size = listI00IOO.size();
/* 38 */            for (int i = 0; i < size; i++) {
                    }
/* 51 */            this.I0001Ioi1lo.clear();
/* 56 */            this.I000II = Il01100l.I00iOIl;
/* 63 */            this.I000O01llI0 = new OI10IIO();
/* 65 */            oi110o0.I000II();
/* 68 */            arrayList2.clear();
/* 71 */            arrayList.clear();
/* 74 */            this.I00100l0 = null;
/* 76 */            IIoOoIol0Io0 iIoOoIol0Io02 = this.I0010I0i;
/* 78 */            if (iIoOoIol0Io02 != null) {
/* 80 */                iIoOoIol0Io02.I0000O(null);
                    }
/* 83 */            this.I0010I0i = null;
/* 85 */            olO0OIIl1.I000l1(null);
/* 23 */            return null;
                }

                public final boolean I00II0Ol1O0l() {
                    return !this.I00111O && (((I1Ooo1ii0l) ((I1ii1o0) this.I00000oIO.I00iiO).I00iio).get() & 134217727) > 0;
                }

                public final boolean I00II0oii1o() {
                    return this.I000OOo1O.I00iiO != 0 || I00II0Ol1O0l() || I00IO1() || this.I000l1.I000OiO();
                }

                public final boolean I00IO1() {
                    return !this.I00111O && (((I1Ooo1ii0l) ((I1ii1o0) this.I00000oOI.I00iiO).I00iio).get() & 134217727) > 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00IO1oi11O() {
                    boolean z;
                    synchronized (this.I0000Il00O) {
/* 10 */                if (this.I000O01llI0.I000O01llI0() || this.I000OOo1O.I00iiO != 0 || I00II0Ol1O0l()) {
/* 36 */                    z = true;
                        } else if (!I00IO1()) {
/* 32 */                    z = false;
                        }
                    }
/* 38 */            return z;
                }

                public final List I00IOO() {
/* 1 */             List list = this.I000II;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 6 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 19 */            List arrayList2 = arrayList.isEmpty() ? Il01100l.I00iOIl : new ArrayList(arrayList);
/* 23 */            this.I000II = arrayList2;
/* 55 */            return arrayList2;
                }

                public final void I00IioO0OiOi() {
                    IIoOo1iIio1l iIoOo1iIio1lI001lloI;
                    synchronized (this.I0000Il00O) {
/* 4 */                 iIoOo1iIio1lI001lloI = I001lloI();
/* 22 */                if (((OOloloOII0ol) this.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI) <= 0) {
/* 43 */                    throw ilIiOIi0I.I00000oIO("Recomposer shutdown; frame clock awaiter will never resume", this.I0000oI00);
                        }
                    }
/* 25 */            if (iIoOo1iIio1lI001lloI != null) {
/* 31 */                ((IIoOoIol0Io0) iIoOo1iIio1lI001lloI).resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                public final void I00IlilI0i0i(IOlIOiI0iiI1 iOlIOiI0iiI1) {
                    synchronized (this.I0000Il00O) {
/* 4 */                 ArrayList arrayList = this.I000iOII;
/* 6 */                 int size = arrayList.size();
/* 11 */                for (int i = 0; i < size; i++) {
/* 25 */                    if (((OI0Iol1O) arrayList.get(i)).I0000Il00O.equals(iOlIOiI0iiI1)) {
/* 30 */                        ArrayList arrayList2 = new ArrayList();
/* 33 */                        I00Io1lO(arrayList2, this, iOlIOiI0iiI1);
/* 40 */                        while (!arrayList2.isEmpty()) {
/* 43 */                            I00Io1o110i(arrayList2, null);
/* 46 */                            I00Io1lO(arrayList2, this, iOlIOiI0iiI1);
                                }
/* 50 */                        return;
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
                
                    r3 = r10.size();
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
                
                    if (r4 >= r3) goto L126;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
                
                    if (((p000.OIoi0IIoi) r10.get(r4)).I00iiI == null) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
                
                    r4 = r4 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
                
                    r3 = new java.util.ArrayList(r10.size());
                    r4 = r10.size();
                    r9 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
                
                    if (r9 >= r4) goto L128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x018c, code lost:
                
                    r11 = (p000.OIoi0IIoi) r10.get(r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
                
                    if (r11.I00iiI != null) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0196, code lost:
                
                    r11 = (p000.OI0Iol1O) r11.I00iOIl;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
                
                    r11 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
                
                    if (r11 == null) goto L130;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x01a1, code lost:
                
                    r3.add(r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x01a4, code lost:
                
                    r9 = r9 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x01a7, code lost:
                
                    r4 = r16.I0000Il00O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x01a9, code lost:
                
                    monitor-enter(r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
                
                    p000.IOOii0O10Io0.I00100l0(r16.I000iOII, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
                
                    monitor-exit(r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x01b0, code lost:
                
                    r3 = new java.util.ArrayList(r10.size());
                    r4 = r10.size();
                    r9 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x01be, code lost:
                
                    if (r9 >= r4) goto L131;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x01c0, code lost:
                
                    r11 = r10.get(r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x01c9, code lost:
                
                    if (((p000.OIoi0IIoi) r11).I00iiI == null) goto L133;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x01cb, code lost:
                
                    r3.add(r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x01ce, code lost:
                
                    r9 = r9 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x01d1, code lost:
                
                    r10 = r3;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final List I00Io1o110i(List list, OI10IIO oi10iio) {
                    OI10OloOOoi oI10OloOOoiI001lloI;
                    ArrayList arrayList;
/* 11 */            HashMap map = new HashMap(list.size());
/* 17 */            int size = list.size();
/* 22 */            for (int i = 0; i < size; i++) {
/* 24 */                Object obj = list.get(i);
/* 31 */                IOlIOiI0iiI1 iOlIOiI0iiI1 = ((OI0Iol1O) obj).I0000Il00O;
/* 33 */                Object arrayList2 = map.get(iOlIOiI0iiI1);
/* 37 */                if (arrayList2 == null) {
/* 41 */                    arrayList2 = new ArrayList();
/* 44 */                    map.put(iOlIOiI0iiI1, arrayList2);
                        }
/* 49 */                ((ArrayList) arrayList2).add(obj);
                    }
/* 67 */            for (Map.Entry entry : map.entrySet()) {
/* 79 */                IOlIOiI0iiI1 iOlIOiI0iiI12 = (IOlIOiI0iiI1) entry.getKey();
/* 85 */                List list2 = (List) entry.getValue();
/* 91 */                if (iOlIOiI0iiI12.I00oOio10iI1.I00IO1) {
/* 95 */                    IOl1II00.I00000oIO("Check failed");
                        }
/* 102 */               OIoO1Ol oIoO1Ol = new OIoO1Ol(13);
/* 105 */               oIoO1Ol.I00iiI = iOlIOiI0iiI12;
/* 107 */               VarHandle.storeStoreFence();
/* 114 */               O1lIIi o1lIIi = new O1lIIi(26);
/* 117 */               o1lIIi.I00iiI = iOlIOiI0iiI12;
/* 121 */               o1lIIi.I00iiO = oi10iio;
/* 123 */               VarHandle.storeStoreFence();
/* 126 */               Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 137 */               OI10OloOOoi oI10OloOOoi = ol1il1o1I000O01llI0 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1I000O01llI0 : null;
/* 138 */               if (oI10OloOOoi == null || (oI10OloOOoiI001lloI = oI10OloOOoi.I001lloI(oIoO1Ol, o1lIIi)) == null) {
/* 498 */                   I000II.I001IO000("Cannot create a mutable snapshot of an read-only snapshot");
/* 494 */                   return null;
                        }
                        try {
/* 146 */                   Ol1il1o1 ol1il1o1I000OiO = oI10OloOOoiI001lloI.I000OiO();
                            try {
                                synchronized (this.I0000Il00O) {
                                    try {
/* 159 */                               arrayList = new ArrayList(list2.size());
/* 165 */                               int size2 = list2.size();
/* 170 */                               for (int i2 = 0; i2 < size2; i2++) {
/* 176 */                                   OI0Iol1O oI0Iol1O = (OI0Iol1O) list2.get(i2);
/* 182 */                                   Object objI00000oOI = OI0i0OIO.I00000oOI(this.I000l1, oI0Iol1O.I00000oIO);
/* 187 */                                   OI0Iol1O oI0Iol1O2 = (OI0Iol1O) objI00000oOI;
/* 189 */                                   if (oI0Iol1O2 != null) {
/* 195 */                                       this.I000lI.I010II(oI0Iol1O2);
                                            }
/* 209 */                                   arrayList.add(new OIoi0IIoi(oI0Iol1O, objI00000oOI));
                                        }
/* 217 */                               int size3 = arrayList.size();
/* 221 */                               int i3 = 0;
                                        while (true) {
/* 222 */                                   if (i3 >= size3) {
                                                break;
                                            }
/* 228 */                                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) arrayList.get(i3);
/* 232 */                                   if (oIoi0IIoi.I00iiI == null) {
/* 250 */                                       if (((OI10I1IoI0Ol) this.I000lI.I00iiI).I00000oOI(((OI0Iol1O) oIoi0IIoi.I00iOIl).I00000oIO)) {
/* 258 */                                           ArrayList arrayList3 = new ArrayList(arrayList.size());
/* 261 */                                           int size4 = arrayList.size();
/* 266 */                                           for (int i4 = 0; i4 < size4; i4++) {
/* 272 */                                               OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) arrayList.get(i4);
/* 276 */                                               if (oIoi0IIoi2.I00iiI == null) {
/* 278 */                                                   IIlio101Io iIlio101Io = this.I000lI;
/* 284 */                                                   OI0IlliOIlO oI0IlliOIlO = ((OI0Iol1O) oIoi0IIoi2.I00iOIl).I00000oIO;
/* 288 */                                                   OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) iIlio101Io.I00iiI;
/* 294 */                                                   OII1OIO oii1oio = (OII1OIO) OI0i0OIO.I00000oOI(oI10I1IoI0Ol, oI0IlliOIlO);
/* 300 */                                                   if (oI10I1IoI0Ol.I000OOo1O()) {
/* 306 */                                                       ((OI10I1IoI0Ol) iIlio101Io.I00iiO).I00000oIO();
                                                            }
/* 309 */                                                   if (oii1oio != null) {
/* 312 */                                                       OI0Iol1O oI0Iol1O3 = oii1oio.I00000oIO;
/* 318 */                                                       OI0i0OIO.I00000oIO(this.I000oI1ioi, oii1oio.I00000oOI, oI0Iol1O3);
/* 325 */                                                       oIoi0IIoi2 = new OIoi0IIoi(oIoi0IIoi2.I00iOIl, oI0Iol1O3);
                                                            }
                                                        }
/* 329 */                                               arrayList3.add(oIoi0IIoi2);
                                                    }
/* 335 */                                           arrayList = arrayList3;
                                                }
                                            }
/* 337 */                                   i3++;
                                        }
                                    } finally {
                                    }
                                }
/* 341 */                       int size5 = arrayList.size();
/* 345 */                       int i5 = 0;
                                while (true) {
/* 346 */                           if (i5 >= size5) {
                                        break;
                                    }
/* 356 */                           if (((OIoi0IIoi) arrayList.get(i5)).I00iiI != null) {
                                        break;
                                    }
/* 358 */                           i5++;
                                }
/* 471 */                       iOlIOiI0iiI12.I001IIilI0O(arrayList);
/* 474 */                       Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                            } catch (Throwable th) {
/* 486 */                       Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 489 */                       throw th;
                            }
                        } finally {
/* 490 */                   I001l0I00(oI10OloOOoiI001lloI);
                        }
                    }
/* 508 */           return IOOi0Ool1i.I00iIi0i1o(map.keySet());
                }

                public final IOlIOiI0iiI1 I00IoIO0lI(IOlIOiI0iiI1 iOlIOiI0iiI1, OI10IIO oi10iio) {
                    OI10IIO oi10iio2;
                    OI10OloOOoi oI10OloOOoiI001lloI;
/* 6 */             if (!iOlIOiI0iiI1.I00oOio10iI1.I00IO1 && !iOlIOiI0iiI1.I001i1lo1io() && ((oi10iio2 = this.I00100o1O0lo) == null || !oi10iio2.I0000Il00O(iOlIOiI0iiI1))) {
/* 29 */                int i = 13;
/* 31 */                OIoO1Ol oIoO1Ol = new OIoO1Ol(i);
/* 34 */                oIoO1Ol.I00iiI = iOlIOiI0iiI1;
/* 36 */                VarHandle.storeStoreFence();
/* 43 */                O1lIIi o1lIIi = new O1lIIi(26);
/* 46 */                o1lIIi.I00iiI = iOlIOiI0iiI1;
/* 48 */                o1lIIi.I00iiO = oi10iio;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 64 */                OI10OloOOoi oI10OloOOoi = ol1il1o1I000O01llI0 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1I000O01llI0 : null;
/* 65 */                if (oI10OloOOoi == null || (oI10OloOOoiI001lloI = oI10OloOOoi.I001lloI(oIoO1Ol, o1lIIi)) == null) {
/* 148 */                   I000II.I001IO000("Cannot create a mutable snapshot of an read-only snapshot");
                        } else {
                            try {
/* 73 */                        Ol1il1o1 ol1il1o1I000OiO = oI10OloOOoiI001lloI.I000OiO();
/* 77 */                        if (oi10iio != null) {
                                    try {
/* 83 */                                if (oi10iio.I000O01llI0()) {
/* 87 */                                    O1l110o o1l110o = new O1l110o(i);
/* 90 */                                    o1l110o.I00iiI = oi10iio;
/* 92 */                                    o1l110o.I00iiO = iOlIOiI0iiI1;
/* 94 */                                    VarHandle.storeStoreFence();
/* 97 */                                    IloI0lOlll1 iloI0lOlll1 = iOlIOiI0iiI1.I00oOio10iI1;
/* 101 */                                   if (iloI0lOlll1.I00IO1) {
/* 105 */                                       IOl1II00.I00000oIO("Preparing a composition while composing is not supported");
                                            }
/* 108 */                                   iloI0lOlll1.I00IO1 = true;
                                            try {
/* 111 */                                       o1l110o.invoke();
/* 114 */                                       iloI0lOlll1.I00IO1 = false;
                                            } catch (Throwable th) {
/* 118 */                                       iloI0lOlll1.I00IO1 = false;
/* 120 */                                       throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
/* 138 */                               Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 141 */                               throw th2;
                                    }
                                }
/* 123 */                       boolean zI001l0I00 = iOlIOiI0iiI1.I001l0I00();
/* 127 */                       Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
/* 133 */                       if (zI001l0I00) {
/* 135 */                           return iOlIOiI0iiI1;
                                }
                            } finally {
/* 142 */                       I001l0I00(oI10OloOOoiI001lloI);
                            }
                        }
                    }
/* 5 */             return null;
                }

                public final void I00IoO0(Throwable th, IOlIOiI0iiI1 iOlIOiI0iiI1) throws Throwable {
/* 14 */            if (!((Boolean) I001lIiIIo1O.get()).booleanValue() || (th instanceof IOl0iO0)) {
                        synchronized (this.I0000Il00O) {
/* 105 */                   Log.e("ComposeInternal", "Error was captured in composition.", th);
/* 114 */                   OOlolo0 oOlolo0 = (OOlolo0) this.I0010o.getValue();
/* 116 */                   if (oOlolo0 != null) {
/* 137 */                       throw oOlolo0.I00000oIO;
                            }
/* 118 */                   OlO0OIIl1 olO0OIIl1 = this.I0010o;
/* 122 */                   OOlolo0 oOlolo02 = new OOlolo0(th);
/* 125 */                   olO0OIIl1.getClass();
/* 128 */                   olO0OIIl1.I000lI(null, oOlolo02);
                        }
/* 132 */               throw th;
                    }
                    synchronized (this.I0000Il00O) {
                        try {
/* 27 */                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
/* 32 */                    this.I000OiO.clear();
/* 37 */                    this.I000OOo1O.I000II();
/* 45 */                    this.I000O01llI0 = new OI10IIO();
/* 49 */                    this.I000iOII.clear();
/* 54 */                    this.I000l1.I00000oIO();
/* 59 */                    this.I000o00OoI0I.I00000oIO();
/* 62 */                    OlO0OIIl1 olO0OIIl12 = this.I0010o;
/* 66 */                    OOlolo0 oOlolo03 = new OOlolo0(th);
/* 69 */                    olO0OIIl12.getClass();
/* 72 */                    olO0OIIl12.I000lI(null, oOlolo03);
/* 75 */                    if (iOlIOiI0iiI1 != null) {
/* 77 */                        I00Iooi00oi(iOlIOiI0iiI1);
                            }
/* 87 */                    if (I001lloI() != null) {
/* 91 */                        IOl1II00.I00000oIO("expected to go to inactive state due to composition error");
                            }
                        } catch (Throwable th2) {
/* 97 */                    throw th2;
                        }
                    }
                }

                public final boolean I00IoiI() {
                    boolean zI00II0oii1o;
                    synchronized (this.I0000Il00O) {
/* 10 */                if (this.I000O01llI0.I000II()) {
/* 12 */                    return I00II0oii1o();
                        }
/* 21 */                List listI00IOO = I00IOO();
/* 27 */                OiO1IO0000l oiO1IO0000lI00000oIO = lO0o01OilO.I00000oIO(this.I000O01llI0);
/* 36 */                this.I000O01llI0 = new OI10IIO();
                        try {
/* 42 */                    int size = listI00IOO.size();
/* 47 */                    for (int i = 0; i < size; i++) {
/* 55 */                        ((IOlIOiI0iiI1) listI00IOO.get(i)).I001lIiIIo1O(oiO1IO0000lI00000oIO);
/* 72 */                        if (((OOloloOII0ol) this.I001IIilI0O.getValue()).compareTo(OOloloOII0ol.I00iiI) <= 0) {
                                    break;
                                }
                            }
                            synchronized (this.I0000Il00O) {
/* 86 */                        if (I001lloI() != null) {
/* 103 */                           throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                                }
/* 88 */                        zI00II0oii1o = I00II0oii1o();
                            }
/* 93 */                    return zI00II0oii1o;
                        } catch (Throwable th) {
                            synchronized (this.I0000Il00O) {
/* 109 */                       OI10IIO oi10iio = this.I000O01llI0;
/* 111 */                       int i2 = oi10iio.I0000O;
/* 113 */                       Iterator<E> it = oiO1IO0000lI00000oIO.iterator();
/* 121 */                       while (it.hasNext()) {
/* 127 */                           oi10iio.I000iOII(it.next());
                                }
/* 132 */                       throw th;
                            }
                        }
                    }
                }

                public final void I00Iooi00oi(IOlIOiI0iiI1 iOlIOiI0iiI1) {
/* 1 */             ArrayList arrayList = this.I00100l0;
/* 3 */             if (arrayList == null) {
/* 7 */                 arrayList = new ArrayList();
/* 10 */                this.I00100l0 = arrayList;
                    }
/* 16 */            if (!arrayList.contains(iOlIOiI0iiI1)) {
/* 18 */                arrayList.add(iOlIOiI0iiI1);
                    }
/* 27 */            if (this.I0001Ioi1lo.remove(iOlIOiI0iiI1)) {
/* 30 */                this.I000II = null;
                    }
                }

                @Override
/* 28 */        public final void I0010I0i(Set set) {
                }
            }
