            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol1olI0o1I01 {
                public final Function1 I00000oIO;
                public final AtomicReference I00000oOI = new AtomicReference(null);
                public boolean I0000Il00O;
                public final Ol0Oo0 I0000O;
                public final Ol1OiIli00Ii I0000oI00;
                public final OI110O0 I0001Ioi1lo;
                public final Object I000II;
                public I0IOIlIOIII I000O01llI0;
                public Ol1oi0lO0I I000OOo1O;
                public long I000OiO;

                public Ol1olI0o1I01(Function1 function1) {
/* 4 */             this.I00000oIO = function1;
/* 16 */            int i = 1;
/* 17 */            Ol0Oo0 ol0Oo0 = new Ol0Oo0(i);
/* 20 */            ol0Oo0.I00iiI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            this.I0000O = ol0Oo0;
/* 29 */            Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(i);
/* 32 */            ol1OiIli00Ii.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            this.I0000oI00 = ol1OiIli00Ii;
/* 48 */            this.I0001Ioi1lo = new OI110O0(new Ol1oi0lO0I[16]);
/* 55 */            this.I000II = new Object();
/* 59 */            this.I000OiO = -1L;
                }

                public final void I00000oIO() {
                    synchronized (this.I000II) {
/* 4 */                 OI110O0 oi110o0 = this.I0001Ioi1lo;
/* 6 */                 Object[] objArr = oi110o0.I00iOIl;
/* 8 */                 int i = oi110o0.I00iiO;
/* 11 */                for (int i2 = 0; i2 < i; i2++) {
/* 15 */                    Ol1oi0lO0I ol1oi0lO0I = (Ol1oi0lO0I) objArr[i2];
/* 19 */                    ol1oi0lO0I.I0000oI00.I00000oIO();
/* 24 */                    ol1oi0lO0I.I0001Ioi1lo.I00000oIO();
/* 29 */                    ol1oi0lO0I.I000l1.I00000oIO();
/* 34 */                    ol1oi0lO0I.I000lI.clear();
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj) {
                    int i;
                    int i2;
                    synchronized (this.I000II) {
                        try {
/* 8 */                     OI110O0 oi110o0 = this.I0001Ioi1lo;
/* 10 */                    int i3 = oi110o0.I00iiO;
/* 12 */                    int i4 = 0;
/* 13 */                    int i5 = 0;
                            while (true) {
/* 14 */                        Object[] objArr = oi110o0.I00iOIl;
/* 16 */                        if (i4 < i3) {
/* 20 */                            Ol1oi0lO0I ol1oi0lO0I = (Ol1oi0lO0I) objArr[i4];
/* 28 */                            OI0o11I1 oI0o11I1 = (OI0o11I1) ol1oi0lO0I.I0001Ioi1lo.I000iOII(obj);
/* 30 */                            if (oI0o11I1 == null) {
/* 32 */                                i = i4;
                                    } else {
/* 34 */                                Object[] objArr2 = oI0o11I1.I00000oOI;
/* 36 */                                int[] iArr = oI0o11I1.I0000Il00O;
/* 38 */                                long[] jArr = oI0o11I1.I00000oIO;
                                        int length = jArr.length - 2;
/* 43 */                                if (length >= 0) {
/* 45 */                                    int i6 = 0;
                                            while (true) {
/* 46 */                                        long j = jArr[i6];
/* 48 */                                        i = i4;
/* 64 */                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 73 */                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
/* 77 */                                            int i8 = 0;
/* 78 */                                            while (i8 < i7) {
/* 88 */                                                if ((j & 255) < 128) {
/* 92 */                                                    int i9 = (i6 << 3) + i8;
/* 94 */                                                    i2 = i8;
/* 96 */                                                    Object obj2 = objArr2[i9];
/* 98 */                                                    int i10 = iArr[i9];
/* 100 */                                                   ol1oi0lO0I.I0000Il00O(obj, obj2);
                                                        } else {
/* 104 */                                                   i2 = i8;
                                                        }
/* 106 */                                               j >>= 8;
/* 108 */                                               i8 = i2 + 1;
                                                    }
/* 113 */                                           if (i7 != 8) {
                                                        break;
                                                    }
/* 115 */                                           if (i6 == length) {
                                                        break;
                                                    }
/* 117 */                                           i6++;
/* 119 */                                           i4 = i;
                                                }
                                            }
                                        }
                                    }
/* 127 */                           if (!ol1oi0lO0I.I0001Ioi1lo.I000OiO()) {
/* 129 */                               i5++;
                                    } else if (i5 > 0) {
/* 134 */                               Object[] objArr3 = oi110o0.I00iOIl;
/* 140 */                               objArr3[i - i5] = objArr3[i];
                                    }
/* 145 */                           i4 = i + 1;
                                } else {
/* 149 */                           int i11 = i3 - i5;
/* 152 */                           Arrays.fill(objArr, i11, i3, (Object) null);
/* 155 */                           oi110o0.I00iiO = i11;
                                }
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final boolean I0000Il00O() {
                    boolean z;
                    Set set;
                    Set set2;
                    synchronized (this.I000II) {
/* 4 */                 z = this.I0000Il00O;
                    }
/* 8 */             if (z) {
/* 7 */                 return false;
                    }
/* 11 */            boolean z2 = false;
                    while (true) {
/* 12 */                AtomicReference atomicReference = this.I00000oOI;
                        while (true) {
/* 14 */                    Object obj = atomicReference.get();
/* 18 */                    set = null;
/* 18 */                    List list = null;
/* 18 */                    List listSubList = null;
/* 20 */                    if (obj == null) {
                                break;
                            }
/* 25 */                    if (obj instanceof Set) {
/* 28 */                        set2 = (Set) obj;
                            } else {
/* 33 */                        if (!(obj instanceof List)) {
/* 120 */                           IOl1II00.I00000oOI("Unexpected notification");
/* 123 */                           IOOlIIilOl0.I0000Il00O();
/* 7 */                             return false;
                                }
/* 36 */                        List list2 = (List) obj;
/* 42 */                        Set set3 = (Set) list2.get(0);
/* 49 */                        if (list2.size() == 2) {
/* 51 */                            listSubList = list2.get(1);
                                } else if (list2.size() > 2) {
/* 66 */                            listSubList = list2.subList(1, list2.size());
                                }
/* 70 */                        set2 = set3;
                                list = listSubList;
                            }
/* 75 */                    if (atomicReference.compareAndSet(obj, list)) {
/* 77 */                        set = set2;
                                break;
                            }
                        }
/* 78 */                if (set == null) {
/* 80 */                    return z2;
                        }
                        synchronized (this.I000II) {
/* 84 */                    OI110O0 oi110o0 = this.I0001Ioi1lo;
/* 86 */                    Object[] objArr = oi110o0.I00iOIl;
/* 88 */                    int i = oi110o0.I00iiO;
/* 91 */                    for (int i2 = 0; i2 < i; i2++) {
/* 108 */                       z2 = ((Ol1oi0lO0I) objArr[i2]).I00000oIO(set) || z2;
                            }
                        }
                    }
                }

                public final Ol1oi0lO0I I0000O(Function1 function1) {
                    Object obj;
/* 1 */             OI110O0 oi110o0 = this.I0001Ioi1lo;
/* 3 */             Object[] objArr = oi110o0.I00iOIl;
/* 5 */             int i = oi110o0.I00iiO;
/* 7 */             int i2 = 0;
                    while (true) {
/* 8 */                 if (i2 >= i) {
/* 23 */                    obj = null;
                            break;
                        }
/* 10 */                obj = objArr[i2];
/* 17 */                if (((Ol1oi0lO0I) obj).I00000oIO == function1) {
                            break;
                        }
/* 20 */                i2++;
                    }
/* 24 */            Ol1oi0lO0I ol1oi0lO0I = (Ol1oi0lO0I) obj;
/* 26 */            if (ol1oi0lO0I != null) {
/* 168 */               return ol1oi0lO0I;
                    }
/* 31 */            OoOOI1100oI0.I0000Il00O(1, function1);
/* 34 */            Ol1oi0lO0I ol1oi0lO0I2 = new Ol1oi0lO0I();
/* 37 */            ol1oi0lO0I2.I00000oIO = function1;
/* 40 */            ol1oi0lO0I2.I0000O = -1;
/* 46 */            ol1oi0lO0I2.I0000oI00 = lO0oOIoolo.I00000oOI();
/* 53 */            ol1oi0lO0I2.I0001Ioi1lo = new OI10I1IoI0Ol();
/* 60 */            ol1oi0lO0I2.I000II = new OI10IIO();
/* 71 */            ol1oi0lO0I2.I000O01llI0 = new OI110O0(new IiO0o1I[16]);
/* 75 */            Ilo1olo ilo1olo = new Ilo1olo(1);
/* 78 */            ilo1olo.I00000oOI = ol1oi0lO0I2;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            ol1oi0lO0I2.I000OOo1O = ilo1olo;
/* 89 */            ol1oi0lO0I2.I000l1 = lO0oOIoolo.I00000oOI();
/* 96 */            ol1oi0lO0I2.I000lI = new HashMap();
/* 98 */            VarHandle.storeStoreFence();
/* 101 */           oi110o0.I00000oOI(ol1oi0lO0I2);
/* 104 */           return ol1oi0lO0I2;
                }

                /* JADX WARN: Removed duplicated region for block: B:130:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:140:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:145:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0199  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(Object obj, Function1 function1, IllOOo00lI illOOo00lI) {
                    Ol1oi0lO0I ol1oi0lO0II0000O;
                    Ol1oi0lO0I ol1oi0lO0I;
                    long j;
                    Ol1il1o1 ooIOO1001;
                    boolean z;
                    OI0o11I1 oI0o11I1;
                    long j2;
                    long[] jArr;
                    int i;
                    long[] jArr2;
                    long j3;
/* 5 */             long jI00000oIO = lOllI0.I00000oIO();
                    synchronized (this.I000II) {
/* 14 */                ol1oi0lO0II0000O = I0000O(function1);
/* 18 */                ol1oi0lO0I = this.I000OOo1O;
/* 20 */                j = this.I000OiO;
                    }
/* 27 */            if (j != -1 && j != jI00000oIO) {
/* 38 */                String name = Thread.currentThread().getName();
/* 46 */                StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
/* 50 */                sbI001iOo1i0O.append(jI00000oIO);
/* 55 */                sbI001iOo1i0O.append(", name=");
/* 58 */                sbI001iOo1i0O.append(name);
/* 63 */                sbI001iOo1i0O.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
/* 70 */                OO1oio00IO.I00000oIO(sbI001iOo1i0O.toString());
                    }
                    try {
                        synchronized (this.I000II) {
/* 76 */                    this.I000OOo1O = ol1oi0lO0II0000O;
/* 78 */                    this.I000OiO = jI00000oIO;
                        }
/* 81 */                Ol1OiIli00Ii ol1OiIli00Ii = this.I0000oI00;
/* 83 */                Object obj2 = ol1oi0lO0II0000O.I00000oOI;
/* 85 */                OI0o11I1 oI0o11I12 = ol1oi0lO0II0000O.I0000Il00O;
/* 87 */                int i2 = ol1oi0lO0II0000O.I0000O;
/* 89 */                ol1oi0lO0II0000O.I00000oOI = obj;
/* 99 */                ol1oi0lO0II0000O.I0000Il00O = (OI0o11I1) ol1oi0lO0II0000O.I0001Ioi1lo.I000II(obj);
/* 104 */               if (ol1oi0lO0II0000O.I0000O == -1) {
/* 118 */                   ol1oi0lO0II0000O.I0000O = Long.hashCode(Ol1l1lI1Ili.I000O01llI0().I000II());
                        }
/* 124 */               Ilo1olo ilo1olo = ol1oi0lO0II0000O.I000OOo1O;
/* 126 */               OI110O0 oi110o0I00000oIO = Ol1llolil.I00000oIO();
                        try {
/* 131 */                   oi110o0I00000oIO.I00000oOI(ilo1olo);
/* 134 */                   if (ol1OiIli00Ii == null) {
/* 136 */                       illOOo00lI.invoke();
                            } else {
/* 155 */                       Ol1il1o1 ol1il1o1 = (Ol1il1o1) Ol1l1lI1Ili.I00000oOI.I0010I0i();
/* 159 */                       if (!(ol1il1o1 instanceof OoIOO1001) || ((OoIOO1001) ol1il1o1).I00111O != lOllI0.I00000oIO()) {
/* 222 */                           if (ol1il1o1 == null || (ol1il1o1 instanceof OI10OloOOoi)) {
                                        try {
/* 255 */                                   z = true;
                                        } catch (Throwable th) {
/* 247 */                                   th = th;
/* 458 */                                   oi110o0I00000oIO.I000l1(oi110o0I00000oIO.I00iiO - 1);
/* 461 */                                   throw th;
                                        }
                                        try {
/* 258 */                                   ooIOO1001 = new OoIOO1001(ol1il1o1 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1 : null, ol1OiIli00Ii, null, true, false);
                                        } catch (Throwable th2) {
/* 441 */                                   th = th2;
/* 458 */                                   oi110o0I00000oIO.I000l1(oi110o0I00000oIO.I00iiO - 1);
/* 461 */                                   throw th;
                                        }
                                    } else {
/* 234 */                               z = true;
/* 230 */                               ooIOO1001 = ol1il1o1.I001IIilI0O(ol1OiIli00Ii);
                                    }
                                    try {
/* 261 */                               Ol1il1o1 ol1il1o1I000OiO = ooIOO1001.I000OiO();
                                        try {
/* 265 */                                   illOOo00lI.invoke();
/* 278 */                                   oi110o0I00000oIO.I000l1(oi110o0I00000oIO.I00iiO - 1);
/* 281 */                                   Object obj3 = ol1oi0lO0II0000O.I00000oOI;
/* 283 */                                   int i3 = ol1oi0lO0II0000O.I0000O;
/* 285 */                                   oI0o11I1 = ol1oi0lO0II0000O.I0000Il00O;
/* 287 */                                   if (oI0o11I1 == null) {
                                                try {
/* 289 */                                           long[] jArr3 = oI0o11I1.I00000oIO;
                                                    int length = jArr3.length - 2;
/* 294 */                                           if (length >= 0) {
/* 296 */                                               int i4 = 0;
                                                        while (true) {
/* 298 */                                                   long j4 = jArr3[i4];
/* 300 */                                                   j2 = j;
/* 315 */                                                   if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 322 */                                                       int i5 = 8;
/* 324 */                                                       int i6 = 8 - ((~(i4 - length)) >>> 31);
/* 326 */                                                       int i7 = 0;
/* 327 */                                                       while (i7 < i6) {
/* 337 */                                                           if ((j4 & 255) < 128) {
/* 341 */                                                               i = i5;
/* 343 */                                                               int i8 = (i4 << 3) + i7;
/* 345 */                                                               jArr2 = jArr3;
                                                                        try {
/* 349 */                                                                   Object obj4 = oI0o11I1.I00000oOI[i8];
/* 351 */                                                                   j3 = j4;
/* 362 */                                                                   boolean z2 = oI0o11I1.I0000Il00O[i8] != i3 ? z : false;
/* 363 */                                                                   if (z2) {
/* 365 */                                                                       ol1oi0lO0II0000O.I0000Il00O(obj3, obj4);
                                                                            }
/* 368 */                                                                   if (z2) {
/* 370 */                                                                       oI0o11I1.I0001Ioi1lo(i8);
                                                                            }
                                                                        } catch (Throwable th3) {
/* 437 */                                                                   th = th3;
/* 438 */                                                                   j = j2;
                                                                            synchronized (this.I000II) {
/* 468 */                                                                       this.I000OOo1O = ol1oi0lO0I;
/* 470 */                                                                       this.I000OiO = j;
                                                                            }
/* 473 */                                                                   throw th;
                                                                        }
                                                                    } else {
/* 374 */                                                               i = i5;
/* 376 */                                                               jArr2 = jArr3;
/* 378 */                                                               j3 = j4;
                                                                    }
/* 380 */                                                           j4 = j3 >> i;
/* 382 */                                                           i7++;
/* 384 */                                                           i5 = i;
/* 386 */                                                           jArr3 = jArr2;
                                                                }
/* 389 */                                                       jArr = jArr3;
/* 391 */                                                       if (i6 != i5) {
                                                                    break;
                                                                }
                                                            } else {
/* 396 */                                                       jArr = jArr3;
                                                            }
/* 393 */                                                   int i9 = i4;
/* 399 */                                                   if (i9 == length) {
                                                                break;
                                                            }
/* 401 */                                                   i4 = i9 + 1;
/* 405 */                                                   jArr3 = jArr;
/* 407 */                                                   j = j2;
                                                        }
                                                    } else {
/* 410 */                                               j2 = j;
                                                    }
                                                } catch (Throwable th4) {
/* 413 */                                           th = th4;
/* 414 */                                           j2 = j;
/* 438 */                                           j = j2;
                                                    synchronized (this.I000II) {
                                                    }
                                                }
                                            }
/* 417 */                                   ol1oi0lO0II0000O.I00000oOI = obj2;
/* 419 */                                   ol1oi0lO0II0000O.I0000Il00O = oI0o11I12;
/* 421 */                                   ol1oi0lO0II0000O.I0000O = i2;
                                            synchronized (this.I000II) {
/* 426 */                                       this.I000OOo1O = ol1oi0lO0I;
/* 430 */                                       this.I000OiO = j2;
                                            }
/* 433 */                                   return;
                                        } finally {
/* 446 */                                   Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                                        }
                                    } finally {
/* 450 */                               ooIOO1001.I0000Il00O();
                                    }
                                }
/* 177 */                       Function1 function12 = ((OoIOO1001) ol1il1o1).I0010I0i;
/* 182 */                       Function1 function13 = ((OoIOO1001) ol1il1o1).I0010o;
                                try {
/* 191 */                           ((OoIOO1001) ol1il1o1).I0010I0i = Ol1l1lI1Ili.I000OOo1O(ol1OiIli00Ii, function12, true);
/* 196 */                           ((OoIOO1001) ol1il1o1).I0010o = function13;
/* 198 */                           illOOo00lI.invoke();
/* 204 */                           ((OoIOO1001) ol1il1o1).I0010I0i = function12;
/* 208 */                           ((OoIOO1001) ol1il1o1).I0010o = function13;
                                } catch (Throwable th5) {
/* 215 */                           ((OoIOO1001) ol1il1o1).I0010I0i = function12;
/* 219 */                           ((OoIOO1001) ol1il1o1).I0010o = function13;
/* 221 */                           throw th5;
                                }
                            }
/* 139 */                   z = true;
/* 278 */                   oi110o0I00000oIO.I000l1(oi110o0I00000oIO.I00iiO - 1);
/* 281 */                   Object obj32 = ol1oi0lO0II0000O.I00000oOI;
/* 283 */                   int i32 = ol1oi0lO0II0000O.I0000O;
/* 285 */                   oI0o11I1 = ol1oi0lO0II0000O.I0000Il00O;
/* 287 */                   if (oI0o11I1 == null) {
                            }
/* 417 */                   ol1oi0lO0II0000O.I00000oOI = obj2;
/* 419 */                   ol1oi0lO0II0000O.I0000Il00O = oI0o11I12;
/* 421 */                   ol1oi0lO0II0000O.I0000O = i2;
                            synchronized (this.I000II) {
                            }
                        } catch (Throwable th6) {
/* 143 */                   th = th6;
                        }
                    } catch (Throwable th7) {
/* 121 */               th = th7;
                    }
                }

                public final void I0001Ioi1lo() {
/* 1 */             Ol0Oo0 ol0Oo0 = this.I0000O;
/* 5 */             Ol1l1lI1Ili.I00000oOI(Ol1l1lI1Ili.I00000oIO);
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 19 */                Ol1l1lI1Ili.I000O01llI0 = IOOi0Ool1i.I00OI1(Ol1l1lI1Ili.I000O01llI0, ol0Oo0);
                    }
/* 26 */            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(27);
/* 29 */            i0IOIlIOIII.I00iiI = ol0Oo0;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            this.I000O01llI0 = i0IOIlIOIII;
                }
            }
