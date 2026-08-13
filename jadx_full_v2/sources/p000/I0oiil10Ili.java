            package p000;

            import android.graphics.Paint;
            import android.graphics.Shader;
            import android.hardware.camera2.CameraAccessException;
            import android.os.Trace;
            import android.util.ArrayMap;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
/* 41 */    public final class I0oiil10Ili implements OoOOol {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public I0oiil10Ili() {
/* 2 */             this.I00iOIl = 1;
/* 12 */            this.I00iiO = new HashSet();
/* 18 */            this.I00iio = OI0oiliol10O.I000OOo1O();
/* 21 */            this.I00iiI = -1;
/* 28 */            this.I00ilI0I1 = new ArrayList();
/* 40 */            this.I00ilO0 = new OI10ooIio(new ArrayMap());
                }

                @Override
                public OoOOiO I00000oIO(OOoO0OoIIO oOoO0OoIIO) {
/* 9 */             O0lO1101 o0lO1101 = (O0lO1101) ((I1ooIoloo0) this.I00ilO0).invoke(oOoO0OoIIO);
                    return o0lO1101 != null ? o0lO1101 : ((OoOOol) ((o01l1ioOo0) this.I00iiO).I00iiI).I00000oIO(oOoO0OoIIO);
                }

                public void I00000oOI() {
                    List<IIl0001i1o01> listI00iIi0i1o;
                    synchronized (((ArrayList) this.I00ilI0I1)) {
/* 10 */                listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o((ArrayList) this.I00ilI0I1);
/* 18 */                ((ArrayList) this.I00ilI0I1).clear();
                    }
/* 30 */            for (IIl0001i1o01 iIl0001i1o01 : listI00iIi0i1o) {
/* 40 */                Trace.beginSection("InvokeInternalListeners");
/* 45 */                int size = iIl0001i1o01.I0000O.size();
/* 51 */                for (int i = 0; i < size; i++) {
/* 59 */                    Oi0Iil oi0Iil = (Oi0Iil) iIl0001i1o01.I0000O.get(i);
/* 65 */                    int size2 = iIl0001i1o01.I0000oI00.size();
/* 70 */                    for (int i2 = 0; i2 < size2; i2++) {
/* 84 */                        ((Oi01Ooii1Ol) iIl0001i1o01.I0000oI00.get(i2)).I00OOll1(oi0Iil.I00lli11());
                            }
                        }
/* 93 */                Trace.endSection();
/* 98 */                Trace.beginSection("InvokeRequestListeners");
/* 103 */               int size3 = iIl0001i1o01.I0000O.size();
/* 108 */               for (int i3 = 0; i3 < size3; i3++) {
/* 116 */                   Oi0Iil oi0Iil2 = (Oi0Iil) iIl0001i1o01.I0000O.get(i3);
/* 126 */                   int size4 = oi0Iil2.I00lli11().I0000O.size();
/* 131 */                   for (int i4 = 0; i4 < size4; i4++) {
/* 149 */                       ((Oi01Ooii1Ol) oi0Iil2.I00lli11().I0000O.get(i4)).I00OOll1(oi0Iil2.I00lli11());
                            }
                        }
/* 158 */               Trace.endSection();
                    }
/* 165 */           IIl00O iIl00O = (IIl00O) this.I00iiO;
                    synchronized (iIl00O.I000OiO) {
/* 170 */               iIl00O.toString();
/* 175 */               iIl00O.I00000oIO.I00OIo();
                    }
                }

                public void I0000Il00O(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                I0000O((IIl1Ol) it.next());
                    }
                }

                public void I0000O(IIl1Ol iIl1Ol) {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00ilI0I1;
/* 9 */             if (arrayList.contains(iIl1Ol)) {
/* 11 */                return;
                    }
/* 12 */            arrayList.add(iIl1Ol);
                }

                public void I0000oI00(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 13 */            for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 26 */                ((OI0oiliol10O) this.I00iio).I00000oOI(i1ioiI, null);
/* 41 */                ((OI0oiliol10O) this.I00iio).I000lI(i1ioiI, iOlOo1ll1l1.I000OiO(i1ioiI), iOlOo1ll1l1.I0000O(i1ioiI));
                    }
                }

                public IIoo00iOol0 I0001Ioi1lo() {
/* 9 */             ArrayList arrayList = new ArrayList((HashSet) this.I00iiO);
/* 16 */            OIil0iio0 oIil0iio0I0001Ioi1lo = OIil0iio0.I0001Ioi1lo((OI0oiliol10O) this.I00iio);
/* 20 */            int i = this.I00iiI;
/* 28 */            ArrayList arrayList2 = new ArrayList((ArrayList) this.I00ilI0I1);
/* 33 */            OI10ooIio oI10ooIio = (OI10ooIio) this.I00ilO0;
/* 35 */            Olo0o1II0 olo0o1II0 = Olo0o1II0.I00000oOI;
/* 39 */            ArrayMap arrayMap = new ArrayMap();
/* 42 */            ArrayMap arrayMap2 = oI10ooIio.I00000oIO;
/* 56 */            for (String str : arrayMap2.keySet()) {
/* 68 */                arrayMap.put(str, arrayMap2.get(str));
                    }
/* 74 */            Olo0o1II0 olo0o1II02 = new Olo0o1II0(arrayMap);
/* 77 */            IIoo00iOol0 iIoo00iOol0 = new IIoo00iOol0();
/* 80 */            iIoo00iOol0.I00000oIO = arrayList;
/* 82 */            iIoo00iOol0.I00000oOI = oIil0iio0I0001Ioi1lo;
/* 84 */            iIoo00iOol0.I0000Il00O = i;
/* 90 */            iIoo00iOol0.I0000O = Collections.unmodifiableList(arrayList2);
/* 92 */            iIoo00iOol0.I0000oI00 = olo0o1II02;
/* 94 */            VarHandle.storeStoreFence();
/* 110 */           return iIoo00iOol0;
                }

                public OI1ilOI1ioo0 I000II(int i) {
/* 7 */             return I000OOo1O(i, (OI1lo1liOO) this.I00iiO, null, false);
                }

                public OI1ilOI1ioo0 I000O01llI0(String str, boolean z) {
                    Object next;
                    OI1lo1liOO oI1lo1liOO;
/* 3 */             OlIIioolI olIIioolI = (OlIIioolI) this.I00iio;
/* 8 */             I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(3);
/* 11 */            i01I0Iioooo0.I00iiO = olIIioolI;
/* 13 */            VarHandle.storeStoreFence();
/* 22 */            Iterator it = ((IOo0i10) OilO1oiooiII.I0000Il00O(i01I0Iioooo0)).iterator();
                    while (true) {
/* 31 */                if (!it.hasNext()) {
/* 62 */                    next = null;
                            break;
                        }
/* 33 */                next = it.next();
/* 38 */                OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) next;
/* 51 */                if (OlOolloIIOl0.I000O01llI0((String) oI1ilOI1ioo0.I00iiI.I0001Ioi1lo, str, false) || oI1ilOI1ioo0.I00iiI.I001lllioOl(str) != null) {
                            break;
                        }
                    }
/* 63 */            OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) next;
/* 65 */            if (oI1ilOI1ioo02 != null) {
/* 106 */               return oI1ilOI1ioo02;
                    }
/* 67 */            if (!z || (oI1lo1liOO = ((OI1lo1liOO) this.I00iiO).I00iiO) == null) {
/* 30 */                return null;
                    }
/* 77 */            I0oiil10Ili i0oiil10Ili = oI1lo1liOO.I00ilO0;
/* 79 */            i0oiil10Ili.getClass();
/* 86 */            if (OlOoOIi0o.I001l0I00(str)) {
/* 30 */                return null;
                    }
/* 90 */            return i0oiil10Ili.I000O01llI0(str, true);
                }

                public OI1ilOI1ioo0 I000OOo1O(int i, OI1ilOI1ioo0 oI1ilOI1ioo0, OI1ilOI1ioo0 oI1ilOI1ioo02, boolean z) {
/* 3 */             OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) this.I00iiO;
/* 7 */             OlIIioolI olIIioolI = (OlIIioolI) this.I00iio;
/* 9 */             olIIioolI.getClass();
/* 16 */            OI1ilOI1ioo0 oI1ilOI1ioo0I000OOo1O = (OI1ilOI1ioo0) iO10Oii01l.I00000oIO(olIIioolI, i);
/* 19 */            if (oI1ilOI1ioo02 != null) {
/* 25 */                if (O0000Ioio00.I0000O(oI1ilOI1ioo0I000OOo1O, oI1ilOI1ioo02) && O0000Ioio00.I0000O(oI1ilOI1ioo0I000OOo1O.I00iiO, oI1ilOI1ioo02.I00iiO)) {
/* 37 */                    return oI1ilOI1ioo0I000OOo1O;
                        }
/* 38 */                oI1ilOI1ioo0I000OOo1O = null;
                    } else if (oI1ilOI1ioo0I000OOo1O != null) {
/* 42 */                return oI1ilOI1ioo0I000OOo1O;
                    }
/* 43 */            if (z) {
/* 48 */                I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(3);
/* 51 */                i01I0Iioooo0.I00iiO = olIIioolI;
/* 53 */                VarHandle.storeStoreFence();
/* 62 */                Iterator it = ((IOo0i10) OilO1oiooiII.I0000Il00O(i01I0Iioooo0)).iterator();
                        while (true) {
/* 70 */                    if (!it.hasNext()) {
/* 102 */                       oI1ilOI1ioo0I000OOo1O = null;
                                break;
                            }
/* 76 */                    OI1ilOI1ioo0 oI1ilOI1ioo03 = (OI1ilOI1ioo0) it.next();
/* 98 */                    oI1ilOI1ioo0I000OOo1O = (!(oI1ilOI1ioo03 instanceof OI1lo1liOO) || oI1ilOI1ioo03.equals(oI1ilOI1ioo0)) ? null : ((OI1lo1liOO) oI1ilOI1ioo03).I00ilO0.I000OOo1O(i, oI1lo1liOO, oI1ilOI1ioo02, true);
/* 99 */                    if (oI1ilOI1ioo0I000OOo1O != null) {
                                break;
                            }
                        }
                    }
/* 103 */           if (oI1ilOI1ioo0I000OOo1O != null) {
/* 204 */               return oI1ilOI1ioo0I000OOo1O;
                    }
/* 105 */           OI1lo1liOO oI1lo1liOO2 = oI1lo1liOO.I00iiO;
/* 107 */           if (oI1lo1liOO2 == null || oI1lo1liOO2.equals(oI1ilOI1ioo0)) {
/* 18 */                return null;
                    }
/* 119 */           return oI1lo1liOO.I00iiO.I00ilO0.I000OOo1O(i, oI1lo1liOO, oI1ilOI1ioo02, z);
                }

                public IlilOiIoo I000OiO(int i) {
                    List list;
/* 1 */             int i2 = this.I00iiI;
/* 3 */             int i3 = i * i2;
/* 10 */            int iI000o00OoI0I = I000o00OoI0I() - i3;
/* 11 */            if (i2 > iI000o00OoI0I) {
/* 13 */                i2 = iI000o00OoI0I;
                    }
/* 15 */            if (i2 < 0) {
/* 17 */                i2 = 0;
                    }
/* 26 */            if (i2 == ((List) this.I00ilO0).size()) {
/* 30 */                list = (List) this.I00ilO0;
                    } else {
/* 35 */                ArrayList arrayList = new ArrayList(i2);
/* 38 */                for (int i4 = 0; i4 < i2; i4++) {
/* 42 */                    Io10ioOo1 io10ioOo1 = new Io10ioOo1();
/* 47 */                    io10ioOo1.I00000oIO = 1L;
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    arrayList.add(io10ioOo1);
                        }
/* 58 */                this.I00ilO0 = arrayList;
/* 60 */                list = arrayList;
                    }
/* 61 */            IlilOiIoo ililOiIoo = new IlilOiIoo();
/* 64 */            ililOiIoo.I00000oIO = i3;
/* 66 */            ililOiIoo.I00000oOI = list;
/* 77 */            return ililOiIoo;
                }

                public int I000iOII(int i) {
/* 5 */             if (I000o00OoI0I() <= 0) {
/* 7 */                 return 0;
                    }
/* 13 */            if (i >= I000o00OoI0I()) {
/* 18 */                Ioll0IliO1l.I00000oIO("ItemIndex > total count");
                    }
/* 23 */            return i / this.I00iiI;
                }

                public int I000l1() {
/* 5 */             Paint.Cap strokeCap = ((Paint) this.I00iiO).getStrokeCap();
/* 19 */            int i = strokeCap == null ? -1 : I0oilIli01I.I00000oIO[strokeCap.ordinal()];
/* 22 */            if (i == 1) {
/* 33 */                return 0;
                    }
/* 25 */            if (i != 2) {
                        return i != 3 ? 0 : 2;
                    }
/* 21 */            return 1;
                }

                public int I000lI() {
/* 5 */             Paint.Join strokeJoin = ((Paint) this.I00iiO).getStrokeJoin();
/* 19 */            int i = strokeJoin == null ? -1 : I0oilIli01I.I00000oOI[strokeJoin.ordinal()];
/* 22 */            if (i == 1) {
/* 33 */                return 0;
                    }
/* 25 */            if (i != 2) {
                        return i != 3 ? 0 : 1;
                    }
/* 24 */            return 2;
                }

                public int I000o00OoI0I() {
/* 7 */             return ((O0l0I1) this.I00iiO).I00000oOI.I00000oOI;
                }

                public OI1il00IOO I000oI1ioi(OI1il00IOO oI1il00IOO, IOO000ilo iOO000ilo, boolean z, OI1ilOI1ioo0 oI1ilOI1ioo0) {
                    OI1il00IOO oI1il00IOOI000iOII;
/* 3 */             OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) this.I00iiO;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = oI1lo1liOO.iterator();
                    while (true) {
/* 15 */                OI1o11OI oI1o11OI = (OI1o11OI) it;
/* 22 */                if (!oI1o11OI.hasNext()) {
                            break;
                        }
/* 28 */                OI1ilOI1ioo0 oI1ilOI1ioo02 = (OI1ilOI1ioo0) oI1o11OI.next();
/* 36 */                oI1il00IOOI000iOII = O0000Ioio00.I0000O(oI1ilOI1ioo02, oI1ilOI1ioo0) ? null : oI1ilOI1ioo02.I000OiO(iOO000ilo);
/* 40 */                if (oI1il00IOOI000iOII != null) {
/* 42 */                    arrayList.add(oI1il00IOOI000iOII);
                        }
                    }
/* 50 */            OI1il00IOO oI1il00IOO2 = (OI1il00IOO) IOOi0Ool1i.I00IoO0(arrayList);
/* 52 */            OI1lo1liOO oI1lo1liOO2 = oI1lo1liOO.I00iiO;
/* 54 */            if (oI1lo1liOO2 != null && z && !oI1lo1liOO2.equals(oI1ilOI1ioo0)) {
/* 64 */                oI1il00IOOI000iOII = oI1lo1liOO2.I000iOII(iOO000ilo, oI1lo1liOO);
                    }
/* 80 */            return (OI1il00IOO) IOOi0Ool1i.I00IoO0(I1IoiO1l.I001IIilI0O(new OI1il00IOO[]{oI1il00IOO, oI1il00IOO2, oI1il00IOOI000iOII}));
                }

                public void I00100l0(float f) {
/* 15 */            ((Paint) this.I00iiO).setAlpha((int) Math.rint(f * 255.0f));
                }

                public void I00100o1O0lo() {
/* 6 */             ((Paint) this.I00iiO).setAntiAlias(true);
                }

                public void I0010I0i(int i) {
/* 3 */             if (this.I00iiI == i) {
/* 5 */                 return;
                    }
/* 6 */             this.I00iiI = i;
/* 14 */            i01l0lil1O0.I00000oIO.I00000oOI((Paint) this.I00iiO, i);
                }

                public void I0010o(long j) {
/* 7 */             i01l0lil1O0.I00000oIO.I0000Il00O((Paint) this.I00iiO, j);
                }

                public void I00111O(IOOil0 iOOil0) {
/* 1 */             this.I00ilI0I1 = iOOil0;
/* 13 */            ((Paint) this.I00iiO).setColorFilter(iOOil0 != null ? iOOil0.I00000oIO : null);
                }

                public void I001IIilI0O(int i) {
/* 12 */            ((Paint) this.I00iiO).setFilterBitmap(!(i == 0));
                }

                public void I001IO000(I0ol1Ioloo i0ol1Ioloo) {
/* 11 */            ((Paint) this.I00iiO).setPathEffect(i0ol1Ioloo != null ? i0ol1Ioloo.I00000oIO : null);
/* 14 */            this.I00ilO0 = i0ol1Ioloo;
                }

                public void I001i1O0Ol(Shader shader) {
/* 1 */             this.I00iio = shader;
/* 7 */             ((Paint) this.I00iiO).setShader(shader);
                }

                public void I001i1lo1io(int i) {
/* 24 */            ((Paint) this.I00iiO).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
                }

                public void I001iOo1i0O(int i) {
/* 24 */            ((Paint) this.I00iiO).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
                }

                public void I001l0I00(float f) {
/* 5 */             ((Paint) this.I00iiO).setStrokeWidth(f);
                }

                public void I001lIiIIo1O(int i) {
/* 13 */            ((Paint) this.I00iiO).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
                }

                public OoiIlOl1iI I001lllioOl() {
/* 1 */             toString();
/* 8 */             boolean zI00000oIO = ((I1Ool1IoO110) this.I00iio).I00000oIO();
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 14 */            if (zI00000oIO) {
/* 20 */                ((IIl00O) this.I00iiO).I0000Il00O();
/* 23 */                Ii0111o ii0111o = Ii0111o.I00iOIl;
                    }
/* 55 */            return ooiIlOl1iI;
                }

                public int I001lloI(int i) {
/* 7 */             Iooo1oIo iooo1oIoI0001Ioi1lo = ((O0l0I1) this.I00iiO).I00000oOI.I0001Ioi1lo(i);
/* 13 */            int i2 = i - iooo1oIoI0001Ioi1lo.I00000oIO;
/* 34 */            return (int) ((Io10ioOo1) ((O0l011oOII) iooo1oIoI0001Ioi1lo.I0000Il00O).I00000oIO.invoke(O0l0lIioool.I00000oIO, Integer.valueOf(i2))).I00000oIO;
                }

                public boolean I00II0Ol1O0l(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Throwable {
                    Throwable th;
                    boolean z2;
                    boolean zIsTerminated;
/* 10 */            if (((I1Ool1IoO110) this.I00iio).I00000oOI()) {
/* 41 */                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
/* 9 */                 return false;
                    }
                    try {
/* 47 */                Trace.beginSection("CXCP#buildCaptureSequence");
/* 67 */                IIl0001i1o01 iIl0001i1o01I00000oOI = ((IIl00O) this.I00iiO).I00000oOI(z, list, map, map2, map3, (O1OIll00i) this.I00ilO0, list2);
/* 71 */                Trace.endSection();
/* 74 */                boolean z3 = true;
/* 75 */                if (iIl0001i1o01I00000oOI == null) {
/* 78 */                    List list3 = list;
/* 82 */                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
/* 95 */                        Iterator it = list3.iterator();
/* 103 */                       while (it.hasNext()) {
/* 113 */                           if (((Oi01iIoI) it.next()).I0001Ioi1lo != null) {
/* 115 */                               Iterator it2 = list.iterator();
/* 123 */                               while (it2.hasNext()) {
/* 129 */                                   Oi01iIoI oi01iIoI = (Oi01iIoI) it2.next();
/* 131 */                                   Ioloo0I1O0l0 ioloo0I1O0l0 = oi01iIoI.I0001Ioi1lo;
/* 133 */                                   if (ioloo0I1O0l0 != null) {
/* 135 */                                       AutoCloseable autoCloseable = ioloo0I1O0l0.I00000oIO;
/* 139 */                                       if (autoCloseable instanceof AutoCloseable) {
/* 141 */                                           autoCloseable.close();
                                                } else {
/* 147 */                                           if (!(autoCloseable instanceof ExecutorService)) {
/* 196 */                                               OIiilo1Ool0o.I00100o1O0lo();
/* 9 */                                                 return false;
                                                    }
/* 149 */                                           ExecutorService executorService = (ExecutorService) autoCloseable;
/* 155 */                                           if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 164 */                                               executorService.shutdown();
/* 167 */                                               boolean z4 = false;
/* 168 */                                               while (!zIsTerminated) {
                                                            try {
/* 174 */                                                       zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                            } catch (InterruptedException unused) {
/* 179 */                                                       if (!z4) {
/* 181 */                                                           executorService.shutdownNow();
/* 184 */                                                           z4 = true;
                                                                }
                                                            }
                                                        }
/* 186 */                                               if (z4) {
/* 192 */                                                   Thread.currentThread().interrupt();
                                                        }
                                                    }
                                                }
                                            }
/* 202 */                                   Iterator it3 = oi01iIoI.I0000O.iterator();
/* 210 */                                   while (it3.hasNext()) {
/* 218 */                                       ((Oi01Ooii1Ol) it3.next()).I00OOll1(oi01iIoI);
                                            }
                                        }
/* 74 */                                return true;
                                    }
                                }
                            }
/* 252 */                   Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
/* 9 */                     return false;
                        }
/* 264 */               if (((I1Ool1IoO110) this.I00iio).I00000oOI()) {
/* 295 */                   Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
/* 9 */                     return false;
                        }
/* 301 */               if (!iIl0001i1o01I00000oOI.I00000oOI) {
                            synchronized (((ArrayList) this.I00ilI0I1)) {
/* 312 */                       ((ArrayList) this.I00ilI0I1).add(iIl0001i1o01I00000oOI);
                            }
                        }
                        try {
/* 321 */                   toString();
/* 324 */                   iIl0001i1o01I00000oOI.toString();
/* 329 */                   Trace.beginSection("InvokeInternalListeners");
/* 334 */                   int size = iIl0001i1o01I00000oOI.I0000O.size();
/* 339 */                   for (int i = 0; i < size; i++) {
/* 347 */                       Oi0Iil oi0Iil = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i);
/* 353 */                       int size2 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 358 */                       for (int i2 = 0; i2 < size2; i2++) {
/* 368 */                           ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i2)).I000O01llI0(oi0Iil);
                                }
                            }
/* 382 */                   Trace.endSection();
/* 387 */                   Trace.beginSection("InvokeRequestListeners");
/* 392 */                   int size3 = iIl0001i1o01I00000oOI.I0000O.size();
/* 397 */                   for (int i3 = 0; i3 < size3; i3++) {
/* 405 */                       Oi0Iil oi0Iil2 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i3);
/* 415 */                       int size4 = oi0Iil2.I00lli11().I0000O.size();
/* 420 */                       for (int i4 = 0; i4 < size4; i4++) {
/* 434 */                           ((Oi01Ooii1Ol) oi0Iil2.I00lli11().I0000O.get(i4)).I000O01llI0(oi0Iil2);
                                }
                            }
                        } catch (CameraAccessException unused2) {
/* 1140 */                  if (!iIl0001i1o01I00000oOI.I00000oOI) {
                                synchronized (((ArrayList) this.I00ilI0I1)) {
/* 1151 */                          ((ArrayList) this.I00ilI0I1).remove(iIl0001i1o01I00000oOI);
/* 1157 */                          Trace.beginSection("InvokeInternalListeners");
/* 1162 */                          int size5 = iIl0001i1o01I00000oOI.I0000O.size();
/* 1167 */                          for (int i5 = 0; i5 < size5; i5++) {
/* 1175 */                              Oi0Iil oi0Iil3 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i5);
/* 1181 */                              int size6 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 1186 */                              for (int i6 = 0; i6 < size6; i6++) {
/* 1200 */                                  ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i6)).I00OOll1(oi0Iil3.I00lli11());
                                        }
                                    }
/* 1209 */                          Trace.endSection();
/* 1214 */                          Trace.beginSection("InvokeRequestListeners");
/* 1219 */                          int size7 = iIl0001i1o01I00000oOI.I0000O.size();
/* 1224 */                          for (int i7 = 0; i7 < size7; i7++) {
/* 1232 */                              Oi0Iil oi0Iil4 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i7);
/* 1242 */                              int size8 = oi0Iil4.I00lli11().I0000O.size();
/* 1247 */                              for (int i8 = 0; i8 < size8; i8++) {
/* 1265 */                                  ((Oi01Ooii1Ol) oi0Iil4.I00lli11().I0000O.get(i8)).I00OOll1(oi0Iil4.I00lli11());
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
/* 375 */                   th = th2;
/* 376 */                   z3 = false;
                        }
                        synchronized (iIl0001i1o01I00000oOI) {
/* 455 */                   if (!((I1Ool1IoO110) this.I00iio).I00000oOI()) {
                                try {
/* 639 */                           Trace.beginSection("CXCP#submit(CaptureSequence)");
/* 646 */                           Integer numI0000O = ((IIl00O) this.I00iiO).I0000O(iIl0001i1o01I00000oOI);
/* 662 */                           int iIntValue = numI0000O != null ? numI0000O.intValue() : -1;
/* 667 */                           iIl0001i1o01I00000oOI.I000lI = Integer.valueOf(iIntValue);
/* 673 */                           if (iIntValue != -1) {
/* 677 */                               Trace.beginSection("InvokeInternalListeners");
/* 682 */                               int size9 = iIl0001i1o01I00000oOI.I0000O.size();
/* 687 */                               for (int i9 = 0; i9 < size9; i9++) {
/* 695 */                                   Oi0Iil oi0Iil5 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i9);
/* 701 */                                   int size10 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 706 */                                   for (int i10 = 0; i10 < size10; i10++) {
/* 716 */                                       ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i10)).I00IioO0OiOi(oi0Iil5);
                                            }
                                        }
/* 725 */                               Trace.endSection();
/* 730 */                               Trace.beginSection("InvokeRequestListeners");
/* 735 */                               int size11 = iIl0001i1o01I00000oOI.I0000O.size();
/* 740 */                               for (int i11 = 0; i11 < size11; i11++) {
/* 748 */                                   Oi0Iil oi0Iil6 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i11);
/* 758 */                                   int size12 = oi0Iil6.I00lli11().I0000O.size();
/* 763 */                                   for (int i12 = 0; i12 < size12; i12++) {
/* 777 */                                       ((Oi01Ooii1Ol) oi0Iil6.I00lli11().I0000O.get(i12)).I00IioO0OiOi(oi0Iil6);
                                            }
                                        }
                                        try {
/* 789 */                                   toString();
/* 792 */                                   iIl0001i1o01I00000oOI.toString();
/* 795 */                                   z2 = true;
                                        } catch (CameraAccessException unused3) {
                                        } catch (Throwable th3) {
/* 798 */                                   th = th3;
/* 991 */                                   if (z3 || iIl0001i1o01I00000oOI.I00000oOI) {
/* 1137 */                                      throw th;
                                            }
                                            synchronized (((ArrayList) this.I00ilI0I1)) {
/* 1006 */                                      ((ArrayList) this.I00ilI0I1).remove(iIl0001i1o01I00000oOI);
                                            }
/* 1012 */                                  Trace.beginSection("InvokeInternalListeners");
/* 1017 */                                  int size13 = iIl0001i1o01I00000oOI.I0000O.size();
/* 1022 */                                  for (int i13 = 0; i13 < size13; i13++) {
/* 1030 */                                      Oi0Iil oi0Iil7 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i13);
/* 1036 */                                      int size14 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 1041 */                                      for (int i14 = 0; i14 < size14; i14++) {
/* 1055 */                                          ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i14)).I00OOll1(oi0Iil7.I00lli11());
                                                }
                                            }
/* 1064 */                                  Trace.endSection();
/* 1069 */                                  Trace.beginSection("InvokeRequestListeners");
/* 1074 */                                  int size15 = iIl0001i1o01I00000oOI.I0000O.size();
/* 1079 */                                  for (int i15 = 0; i15 < size15; i15++) {
/* 1087 */                                      Oi0Iil oi0Iil8 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i15);
/* 1097 */                                      int size16 = oi0Iil8.I00lli11().I0000O.size();
/* 1102 */                                      for (int i16 = 0; i16 < size16; i16++) {
/* 1120 */                                          ((Oi01Ooii1Ol) oi0Iil8.I00lli11().I0000O.get(i16)).I00OOll1(oi0Iil8.I00lli11());
                                                }
                                            }
/* 1137 */                                  throw th;
                                        }
                                    } else {
/* 833 */                               Log.w("CXCP", "Failed to submit " + iIl0001i1o01I00000oOI + ": " + this + " received -1 from submit.");
/* 836 */                               z2 = false;
/* 837 */                               z3 = false;
                                    }
/* 838 */                           if (z2 || iIl0001i1o01I00000oOI.I00000oOI) {
/* 984 */                               return z3;
                                    }
                                    synchronized (((ArrayList) this.I00ilI0I1)) {
/* 853 */                               ((ArrayList) this.I00ilI0I1).remove(iIl0001i1o01I00000oOI);
                                    }
/* 859 */                           Trace.beginSection("InvokeInternalListeners");
/* 864 */                           int size17 = iIl0001i1o01I00000oOI.I0000O.size();
/* 869 */                           for (int i17 = 0; i17 < size17; i17++) {
/* 877 */                               Oi0Iil oi0Iil9 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i17);
/* 883 */                               int size18 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 888 */                               for (int i18 = 0; i18 < size18; i18++) {
/* 902 */                                   ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i18)).I00OOll1(oi0Iil9.I00lli11());
                                        }
                                    }
/* 911 */                           Trace.endSection();
/* 916 */                           Trace.beginSection("InvokeRequestListeners");
/* 921 */                           int size19 = iIl0001i1o01I00000oOI.I0000O.size();
/* 926 */                           for (int i19 = 0; i19 < size19; i19++) {
/* 934 */                               Oi0Iil oi0Iil10 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i19);
/* 944 */                               int size20 = oi0Iil10.I00lli11().I0000O.size();
/* 949 */                               for (int i20 = 0; i20 < size20; i20++) {
/* 967 */                                   ((Oi01Ooii1Ol) oi0Iil10.I00lli11().I0000O.get(i20)).I00OOll1(oi0Iil10.I00lli11());
                                        }
                                    }
/* 979 */                           return z3;
                                } finally {
                                }
                            }
/* 489 */                   Log.w("CXCP", "Failed to submit " + iIl0001i1o01I00000oOI + ": " + this + " is closed.");
/* 495 */                   if (!iIl0001i1o01I00000oOI.I00000oOI) {
                                synchronized (((ArrayList) this.I00ilI0I1)) {
/* 506 */                           ((ArrayList) this.I00ilI0I1).remove(iIl0001i1o01I00000oOI);
                                }
/* 512 */                       Trace.beginSection("InvokeInternalListeners");
/* 517 */                       int size21 = iIl0001i1o01I00000oOI.I0000O.size();
/* 522 */                       for (int i21 = 0; i21 < size21; i21++) {
/* 530 */                           Oi0Iil oi0Iil11 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i21);
/* 536 */                           int size22 = iIl0001i1o01I00000oOI.I0000oI00.size();
/* 541 */                           for (int i22 = 0; i22 < size22; i22++) {
/* 555 */                               ((Oi01Ooii1Ol) iIl0001i1o01I00000oOI.I0000oI00.get(i22)).I00OOll1(oi0Iil11.I00lli11());
                                    }
                                }
/* 564 */                       Trace.endSection();
/* 569 */                       Trace.beginSection("InvokeRequestListeners");
/* 574 */                       int size23 = iIl0001i1o01I00000oOI.I0000O.size();
/* 579 */                       for (int i23 = 0; i23 < size23; i23++) {
/* 587 */                           Oi0Iil oi0Iil12 = (Oi0Iil) iIl0001i1o01I00000oOI.I0000O.get(i23);
/* 597 */                           int size24 = oi0Iil12.I00lli11().I0000O.size();
/* 602 */                           for (int i24 = 0; i24 < size24; i24++) {
/* 620 */                               ((Oi01Ooii1Ol) oi0Iil12.I00lli11().I0000O.get(i24)).I00OOll1(oi0Iil12.I00lli11());
                                    }
                                }
/* 9 */                         return false;
                            }
/* 9 */                     return false;
                        }
                    } finally {
/* 1285 */              Trace.endSection();
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 2:
/* 23 */                    return "GraphRequestProcessor-" + this.I00iiI;
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 42 */        public I0oiil10Ili(Paint paint) {
                    this.I00iOIl = 0;
                    this.I00iiO = paint;
/* 44 */            this.I00iiI = 3;
                }

/* 44 */        public I0oiil10Ili(int i) {
/* 45 */            this.I00iOIl = i;
                }
            }
