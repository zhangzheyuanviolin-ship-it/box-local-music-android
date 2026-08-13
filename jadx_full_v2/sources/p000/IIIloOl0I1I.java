            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
            public final class IIIloOl0I1I implements IIIoloiiI1, IIOIlI01 {
                public static final long I0001Ioi1lo;
                public static final long I000II;
                public static final long I000O01llI0;
                private volatile int flushBufferSize;
                public final III1oo00i1li I00000oOI = new III1oo00i1li();
                public final Object I0000Il00O = new Object();
                volatile Object suspensionSlot = IIIl110o.I00000oOI;
                public final III1oo00i1li I0000O = new III1oo00i1li();
                public final III1oo00i1li I0000oI00 = new III1oo00i1li();
                volatile Object _closedCause = null;
                private volatile Object closeHandler = null;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I000O01llI0 = unsafe.objectFieldOffset(IIIloOl0I1I.class.getDeclaredField("suspensionSlot"));
/* 27 */            I0001Ioi1lo = unsafe.objectFieldOffset(IIIloOl0I1I.class.getDeclaredField("_closedCause"));
/* 39 */            I000II = unsafe.objectFieldOffset(IIIloOl0I1I.class.getDeclaredField("closeHandler"));
                }

                public final void I00000oIO(Throwable th) {
                    IIIioo iIIioo;
/* 1 */             if (th != null) {
/* 5 */                 iIIioo = new IIIioo(th);
                    } else {
/* 11 */                IIIlOi1ooii.I00000oIO.getClass();
/* 14 */                iIIioo = lo1iloiI1.I00iio;
                    }
/* 24 */            IIIlOi1ooii iIIlOi1ooii = (IIIlOi1ooii) I1Ioolli0l0o.I00000oIO.getAndSetObject(this, I000O01llI0, iIIioo);
/* 28 */            if (iIIlOi1ooii instanceof IIIlO1101li1) {
/* 32 */                ((IIIlO1101li1) iIIlOi1ooii).I00000oIO(th);
                    }
/* 44 */            Function1 function1 = (Function1) I1Ioolli0l0o.I00000oIO.getAndSetObject(this, I000II, (Object) null);
/* 46 */            if (function1 != null) {
/* 48 */                function1.invoke(th);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0124 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:0: B:20:0x0054->B:70:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    IIIli0o iIIli0o;
                    IIIloOl0I1I iIIloOl0I1I;
                    int i;
                    IIIli0o iIIli0o2;
                    IIIlOi1ooii iIIlOi1ooii;
                    IIIlOO iIIlOO;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    Object objI0010I0i;
/* 5 */             IIIl110o iIIl110o = IIIl110o.I00000oOI;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            if (iOoilo instanceof IIIli0o) {
/* 14 */                iIIli0o = (IIIli0o) iOoilo;
/* 16 */                int i2 = iIIli0o.I00ilI0I1;
/* 22 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 25 */                    iIIli0o.I00ilI0I1 = i2 - Integer.MIN_VALUE;
                        } else {
/* 30 */                    iIIli0o = new IIIli0o(this, iOoilo);
                        }
                    }
/* 33 */            Object obj = iIIli0o.I00iiO;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i3 = iIIli0o.I00ilI0I1;
/* 43 */            if (i3 == 0) {
/* 64 */                lIoii1l01l0i.I00000oOI(obj);
/* 67 */                Throwable thI0000oI00 = I0000oI00();
/* 71 */                if (thI0000oI00 != null) {
/* 966 */                   throw thI0000oI00;
                        }
/* 73 */                I000OOo1O();
/* 78 */                if (this.flushBufferSize < 1048576) {
/* 80 */                    return ooiIlOl1iI;
                        }
/* 82 */                iIIloOl0I1I = this;
/* 83 */                i = 0;
/* 84 */                iIIli0o2 = iIIli0o;
                    } else {
/* 45 */                if (i3 != 1) {
/* 60 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 47 */                int i4 = iIIli0o.I00iiI;
/* 49 */                IIIloOl0I1I iIIloOl0I1I2 = iIIli0o.I00iOIl;
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                iIIli0o2 = iIIli0o;
/* 55 */                i = i4;
/* 56 */                iIIloOl0I1I = iIIloOl0I1I2;
                    }
/* 87 */            while (this.flushBufferSize >= 1048576) {
/* 92 */                if (this._closedCause != null) {
/* 298 */                   return ooiIlOl1iI;
                        }
/* 94 */                iIIli0o2.I00iOIl = iIIloOl0I1I;
/* 96 */                iIIli0o2.I00iiI = i;
/* 98 */                iIIli0o2.I00ilI0I1 = 1;
/* 106 */               IIoOoIol0Io0 iIoOoIol0Io02 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iIIli0o2));
/* 109 */               iIoOoIol0Io02.I00111O();
/* 114 */               IIIlOO iIIlOO2 = new IIIlOO();
/* 117 */               iIIlOO2.I00000oOI = iIoOoIol0Io02;
/* 121 */               String property = System.getProperty("io.ktor.development");
/* 125 */               if (property != null && Boolean.parseBoolean(property)) {
/* 135 */                   int iHashCode = iIoOoIol0Io02.hashCode();
/* 141 */                   iOlI1lIi0.I00000oIO(16);
/* 154 */                   Throwable th = new Throwable("WriteTask 0x".concat(Integer.toString(iHashCode, 16)));
/* 157 */                   ilIilolOlIoO.I00000oOI(th);
/* 160 */                   iIIlOO2.I0000Il00O = th;
                        }
/* 162 */               VarHandle.storeStoreFence();
/* 167 */               IIIlOi1ooii iIIlOi1ooii2 = (IIIlOi1ooii) iIIloOl0I1I.suspensionSlot;
/* 169 */               boolean z = iIIlOi1ooii2 instanceof IIIioo;
/* 171 */               if (z) {
/* 196 */                   iIIlOi1ooii = iIIlOi1ooii2;
/* 197 */                   iIIlOO = iIIlOO2;
                        } else {
/* 181 */                   boolean zCompareAndSwapObject = I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I, I000O01llI0, iIIlOi1ooii2, iIIlOO2);
/* 185 */                   iIIlOi1ooii = iIIlOi1ooii2;
/* 187 */                   iIIlOO = iIIlOO2;
/* 189 */                   if (!zCompareAndSwapObject) {
/* 191 */                       iIIlOO.I00000oOI();
                            }
/* 194 */                   iIoOoIol0Io0 = iIoOoIol0Io02;
/* 285 */                   objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 289 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 291 */                   if (objI0010I0i == ii0111o) {
/* 293 */                       return ii0111o;
                            }
                        }
/* 200 */               if (iIIlOi1ooii instanceof IIIlOO) {
/* 203 */                   IIIlO1101li1 iIIlO1101li1 = (IIIlO1101li1) iIIlOi1ooii;
/* 216 */                   iIIlO1101li1.I00000oIO(new IOIoIlIlO("write", iIIlO1101li1.I0000Il00O()));
                        } else if (iIIlOi1ooii instanceof IIIlO1101li1) {
/* 227 */                   ((IIIlO1101li1) iIIlOi1ooii).I00000oOI();
                        } else if (z) {
/* 238 */                   iIIlOO.I00000oIO(((IIIioo) iIIlOi1ooii).I00000oOI);
/* 194 */                   iIoOoIol0Io0 = iIoOoIol0Io02;
/* 285 */                   objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 289 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 291 */                   if (objI0010I0i == ii0111o) {
                            }
                        } else if (!O0000Ioio00.I0000O(iIIlOi1ooii, iIIl110o)) {
/* 294 */                   I000II.I00000oIO();
/* 39 */                    return null;
                        }
/* 250 */               if (this.flushBufferSize >= 1048576 && this._closedCause == null) {
/* 194 */                   iIoOoIol0Io0 = iIoOoIol0Io02;
                        } else {
/* 261 */                   IIIlOi1ooii iIIlOi1ooii3 = (IIIlOi1ooii) iIIloOl0I1I.suspensionSlot;
/* 265 */                   if (iIIlOi1ooii3 instanceof IIIlOO) {
/* 272 */                       iIoOoIol0Io0 = iIoOoIol0Io02;
/* 278 */                       if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I, I000O01llI0, iIIlOi1ooii3, iIIl110o)) {
/* 282 */                           ((IIIlO1101li1) iIIlOi1ooii3).I00000oOI();
                                }
                            }
                        }
/* 285 */               objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 289 */               Ii0111o ii0111o222 = Ii0111o.I00iOIl;
/* 291 */               if (objI0010I0i == ii0111o) {
                        }
                    }
/* 89 */            return ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IIIli1ol1OO iIIli1ol1OO;
/* 3 */             if (iOoil1iiIilo instanceof IIIli1ol1OO) {
/* 6 */                 iIIli1ol1OO = (IIIli1ol1OO) iOoil1iiIilo;
/* 8 */                 int i = iIIli1ol1OO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIIli1ol1OO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIIli1ol1OO = new IIIli1ol1OO(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = iIIli1ol1OO.I00iOIl;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIIli1ol1OO.I00iiO;
                    try {
/* 33 */                if (i2 == 0) {
/* 50 */                    lIoii1l01l0i.I00000oOI(obj);
/* 53 */                    iIIli1ol1OO.I00iiO = 1;
/* 59 */                    if (I00000oOI(iIIli1ol1OO) == obj2) {
/* 61 */                        return obj2;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 46 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (Throwable th) {
/* 62 */                lIoii1l01l0i.I00000oIO(th);
                    }
/* 73 */            boolean zCompareAndSwapObject = I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I0001Ioi1lo, (Object) null, i1O01I0iIiiI.I00000oIO);
/* 77 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 79 */            if (!zCompareAndSwapObject) {
/* 81 */                return ooiIlOl1iI;
                    }
/* 82 */            I00000oIO(null);
/* 186 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I0000O(Throwable th) {
/* 3 */             if (this._closedCause != null) {
/* 5 */                 return;
                    }
/* 17 */            I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I0001Ioi1lo, (Object) null, new IOO100(th));
/* 56 */            I00000oIO(th == 0 ? null : th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), th) : new IOO1IOl1O10(th));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Throwable I0000oI00() {
                    Throwable th;
/* 3 */             IOO100 ioo100 = (IOO100) this._closedCause;
/* 5 */             if (ioo100 == null || (th = ioo100.I00000oIO) == 0) {
/* 46 */                return null;
                    }
                    return th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), ioo100.I00000oIO) : new IOO1IOl1O10(th);
                }

                /* JADX WARN: Path cross not found for [B:54:0x0124, B:37:0x00d9], limit reached: 74 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0145 -> B:62:0x0148). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(int i, IOoilo iOoilo) throws Throwable {
                    IIIli01o1 iIIli01o1;
                    IIIloOl0I1I iIIloOl0I1I;
                    int i2;
                    IIIli01o1 iIIli01o12;
                    int i3;
                    long j;
                    IIIlOi1ooii iIIlOi1ooii;
                    IIIl1iii iIIl1iii;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    Object objI0010I0i;
/* 5 */             IIIl110o iIIl110o = IIIl110o.I00000oOI;
/* 9 */             if (iOoilo instanceof IIIli01o1) {
/* 12 */                iIIli01o1 = (IIIli01o1) iOoilo;
/* 14 */                int i4 = iIIli01o1.I00ilO0;
/* 20 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 23 */                    iIIli01o1.I00ilO0 = i4 - Integer.MIN_VALUE;
                        } else {
/* 28 */                    iIIli01o1 = new IIIli01o1(this, iOoilo);
                        }
                    }
/* 31 */            Object obj = iIIli01o1.I00iio;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i5 = iIIli01o1.I00ilO0;
/* 37 */            Object obj2 = null;
/* 38 */            int i6 = 1;
/* 39 */            if (i5 == 0) {
/* 66 */                lIoii1l01l0i.I00000oOI(obj);
/* 69 */                Throwable thI0000oI00 = I0000oI00();
/* 73 */                if (thI0000oI00 != null) {
/* 551 */                   throw thI0000oI00;
                        }
/* 84 */                if (this.I0000O.I00iiO >= i) {
/* 86 */                    return Boolean.TRUE;
                        }
/* 89 */                iIIloOl0I1I = this;
/* 90 */                i2 = i;
/* 91 */                iIIli01o12 = iIIli01o1;
/* 92 */                i3 = 0;
                        j = i2;
/* 104 */               if (this.flushBufferSize + this.I0000O.I00iiO < j) {
                        }
/* 347 */               if (this.I0000O.I00iiO < 1048576) {
                        }
/* 363 */               return Boolean.valueOf(this.I0000O.I00iiO < j);
                    }
/* 41 */            if (i5 != 1) {
/* 62 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                return null;
                    }
/* 43 */            int i7 = iIIli01o1.I00iiI;
/* 45 */            int i8 = iIIli01o1.I00iOIl;
/* 47 */            IIIloOl0I1I iIIloOl0I1I2 = iIIli01o1.I00iiO;
/* 49 */            lIoii1l01l0i.I00000oOI(obj);
/* 52 */            iIIli01o12 = iIIli01o1;
/* 53 */            i3 = i7;
/* 54 */            i2 = i8;
/* 55 */            iIIloOl0I1I = iIIloOl0I1I2;
/* 56 */            Object obj3 = null;
/* 329 */           obj2 = obj3;
/* 331 */           i6 = 1;
                    j = i2;
/* 104 */           if (this.flushBufferSize + this.I0000O.I00iiO < j || this._closedCause != null) {
/* 347 */               if (this.I0000O.I00iiO < 1048576) {
/* 349 */                   I000iOII();
                        }
/* 363 */               return Boolean.valueOf(this.I0000O.I00iiO < j);
                    }
/* 110 */           iIIli01o12.I00iiO = iIIloOl0I1I;
/* 112 */           iIIli01o12.I00iOIl = i2;
/* 114 */           iIIli01o12.I00iiI = i3;
/* 116 */           iIIli01o12.I00ilO0 = i6;
/* 124 */           IIoOoIol0Io0 iIoOoIol0Io02 = new IIoOoIol0Io0(i6, l00iIoI.I0000Il00O(iIIli01o12));
/* 127 */           iIoOoIol0Io02.I00111O();
/* 132 */           IIIl1iii iIIl1iii2 = new IIIl1iii();
/* 135 */           iIIl1iii2.I00000oOI = iIoOoIol0Io02;
/* 139 */           String property = System.getProperty("io.ktor.development");
/* 143 */           if (property == null || Boolean.parseBoolean(property) != i6) {
/* 186 */               obj3 = obj2;
                    } else {
/* 153 */               int iHashCode = iIoOoIol0Io02.hashCode();
/* 157 */               obj3 = obj2;
/* 161 */               iOlI1lIi0.I00000oIO(16);
/* 174 */               Throwable th = new Throwable("ReadTask 0x".concat(Integer.toString(iHashCode, 16)));
/* 177 */               ilIilolOlIoO.I00000oOI(th);
/* 180 */               iIIl1iii2.I0000Il00O = th;
                    }
/* 182 */           VarHandle.storeStoreFence();
/* 191 */           IIIlOi1ooii iIIlOi1ooii2 = (IIIlOi1ooii) iIIloOl0I1I.suspensionSlot;
/* 193 */           boolean z = iIIlOi1ooii2 instanceof IIIioo;
/* 195 */           if (!z) {
/* 205 */               boolean zCompareAndSwapObject = I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I, I000O01llI0, iIIlOi1ooii2, iIIl1iii2);
/* 209 */               iIIlOi1ooii = iIIlOi1ooii2;
/* 211 */               iIIl1iii = iIIl1iii2;
/* 213 */               if (!zCompareAndSwapObject) {
/* 215 */                   iIIl1iii.I00000oOI();
                        }
/* 218 */               iIoOoIol0Io0 = iIoOoIol0Io02;
/* 320 */               objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 324 */               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 326 */               if (objI0010I0i == ii0111o) {
/* 328 */                   return ii0111o;
                        }
/* 329 */               obj2 = obj3;
/* 331 */               i6 = 1;
                        j = i2;
/* 104 */               if (this.flushBufferSize + this.I0000O.I00iiO < j) {
                        }
/* 347 */               if (this.I0000O.I00iiO < 1048576) {
                        }
/* 363 */               return Boolean.valueOf(this.I0000O.I00iiO < j);
                    }
/* 221 */           iIIlOi1ooii = iIIlOi1ooii2;
/* 222 */           iIIl1iii = iIIl1iii2;
/* 225 */           if (iIIlOi1ooii instanceof IIIl1iii) {
/* 228 */               IIIlO1101li1 iIIlO1101li1 = (IIIlO1101li1) iIIlOi1ooii;
/* 241 */               iIIlO1101li1.I00000oIO(new IOIoIlIlO("read", iIIlO1101li1.I0000Il00O()));
                    } else if (iIIlOi1ooii instanceof IIIlO1101li1) {
/* 252 */               ((IIIlO1101li1) iIIlOi1ooii).I00000oOI();
                    } else {
/* 256 */               if (z) {
/* 263 */                   iIIl1iii.I00000oIO(((IIIioo) iIIlOi1ooii).I00000oOI);
/* 218 */                   iIoOoIol0Io0 = iIoOoIol0Io02;
/* 320 */                   objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 324 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 326 */                   if (objI0010I0i == ii0111o) {
                            }
/* 329 */                   obj2 = obj3;
/* 331 */                   i6 = 1;
                            j = i2;
/* 104 */                   if (this.flushBufferSize + this.I0000O.I00iiO < j) {
                            }
/* 347 */                   if (this.I0000O.I00iiO < 1048576) {
                            }
/* 363 */                   return Boolean.valueOf(this.I0000O.I00iiO < j);
                        }
/* 271 */               if (!O0000Ioio00.I0000O(iIIlOi1ooii, iIIl110o)) {
/* 334 */                   I000II.I00000oIO();
/* 337 */                   return obj3;
                        }
                    }
/* 286 */           if (this.flushBufferSize + this.I0000O.I00iiO >= j || this._closedCause != null) {
/* 296 */               IIIlOi1ooii iIIlOi1ooii3 = (IIIlOi1ooii) iIIloOl0I1I.suspensionSlot;
/* 300 */               if (iIIlOi1ooii3 instanceof IIIl1iii) {
/* 307 */                   iIoOoIol0Io0 = iIoOoIol0Io02;
/* 313 */                   if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iIIloOl0I1I, I000O01llI0, iIIlOi1ooii3, iIIl110o)) {
/* 317 */                       ((IIIlO1101li1) iIIlOi1ooii3).I00000oOI();
                            }
                        }
/* 320 */               objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 324 */               Ii0111o ii0111o222 = Ii0111o.I00iOIl;
/* 326 */               if (objI0010I0i == ii0111o) {
                        }
/* 329 */               obj2 = obj3;
/* 331 */               i6 = 1;
                        j = i2;
/* 104 */               if (this.flushBufferSize + this.I0000O.I00iiO < j) {
                        }
/* 347 */               if (this.I0000O.I00iiO < 1048576) {
                        }
/* 363 */               return Boolean.valueOf(this.I0000O.I00iiO < j);
                    }
/* 218 */           iIoOoIol0Io0 = iIoOoIol0Io02;
/* 320 */           objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 324 */           Ii0111o ii0111o2222 = Ii0111o.I00iOIl;
/* 326 */           if (objI0010I0i == ii0111o) {
                    }
/* 329 */           obj2 = obj3;
/* 331 */           i6 = 1;
                    j = i2;
/* 104 */           if (this.flushBufferSize + this.I0000O.I00iiO < j) {
                    }
/* 347 */           if (this.I0000O.I00iiO < 1048576) {
                    }
/* 363 */           return Boolean.valueOf(this.I0000O.I00iiO < j);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final III1oo00i1li I000II() throws Throwable {
/* 3 */             IOO100 ioo100 = (IOO100) this._closedCause;
/* 5 */             if (ioo100 != null) {
/* 7 */                 Throwable th = ioo100.I00000oIO;
/* 43 */                Throwable thI00000oIO = th == 0 ? null : th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), ioo100.I00000oIO) : new IOO1ilI1(th);
/* 46 */                if (thI00000oIO != null) {
/* 49 */                    throw thI00000oIO;
                        }
                    }
/* 56 */            if (this.I0000O.I00II0Ol1O0l()) {
/* 58 */                I000iOII();
                    }
/* 61 */            return this.I0000O;
                }

                @Override
                public final boolean I000O01llI0() {
/* 5 */             if (I0000oI00() == null) {
                        return this._closedCause != null && this.flushBufferSize == 0 && this.I0000O.I00II0Ol1O0l();
                    }
/* 26 */            return true;
                }

                public final void I000OOo1O() {
/* 7 */             if (this.I0000oI00.I00II0Ol1O0l()) {
/* 56 */                return;
                    }
                    synchronized (this.I0000Il00O) {
/* 13 */                III1oo00i1li iII1oo00i1li = this.I0000oI00;
/* 17 */                int i = (int) iII1oo00i1li.I00iiO;
/* 20 */                this.I00000oOI.I000l1(iII1oo00i1li);
                        this.flushBufferSize += i;
                    }
/* 32 */            IIIlOi1ooii iIIlOi1ooii = (IIIlOi1ooii) this.suspensionSlot;
/* 36 */            if (iIIlOi1ooii instanceof IIIl1iii) {
/* 49 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I000O01llI0, iIIlOi1ooii, IIIl110o.I00000oOI)) {
/* 53 */                    ((IIIlO1101li1) iIIlOi1ooii).I00000oOI();
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final III1oo00i1li I000OiO() {
/* 3 */             if (this._closedCause == null) {
/* 61 */                return this.I0000oI00;
                    }
/* 7 */             IOO100 ioo100 = (IOO100) this._closedCause;
/* 10 */            if (ioo100 != null) {
/* 12 */                Throwable th = ioo100.I00000oIO;
/* 48 */                Throwable thI00000oIO = th == 0 ? null : th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), ioo100.I00000oIO) : new IOO1ilI1(th);
/* 51 */                if (thI00000oIO != null) {
/* 54 */                    throw thI00000oIO;
                        }
                    }
/* 60 */            throw new IOO1ilI1(null, null);
                }

                public final void I000iOII() {
                    synchronized (this.I0000Il00O) {
/* 8 */                 this.I00000oOI.I00100l0(this.I0000O);
/* 12 */                this.flushBufferSize = 0;
                    }
/* 18 */            IIIlOi1ooii iIIlOi1ooii = (IIIlOi1ooii) this.suspensionSlot;
/* 22 */            if (iIIlOi1ooii instanceof IIIlOO) {
/* 35 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I000O01llI0, iIIlOi1ooii, IIIl110o.I00000oOI)) {
/* 39 */                    ((IIIlO1101li1) iIIlOi1ooii).I00000oOI();
                        }
                    }
                }

                public final String toString() {
/* 20 */            return "ByteChannel[" + hashCode() + ']';
                }
            }
