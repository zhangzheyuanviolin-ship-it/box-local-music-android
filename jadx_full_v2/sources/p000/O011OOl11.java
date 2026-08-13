            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import sun.misc.Unsafe;
            
/* 27 */    public abstract class O011OOl11 implements O010OIi {
                public static final long I00iOIl;
                public static final long I00iiI;
                public static final int I00iiO = 0;
                private volatile Object _parentHandle$volatile;
                private volatile Object _state$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00iiI = unsafe.objectFieldOffset(O011OOl11.class.getDeclaredField("_state$volatile"));
/* 27 */            I00iOIl = unsafe.objectFieldOffset(O011OOl11.class.getDeclaredField("_parentHandle$volatile"));
                }

                public O011OOl11(boolean z) {
/* 11 */            this._state$volatile = z ? O011OiI01.I000II : O011OiI01.I0001Ioi1lo;
                }

                public static IOI0oi1110il I00OIo(O1I0iI o1I0iI) {
/* 5 */             while (o1I0iI.I000l1()) {
/* 7 */                 o1I0iI = o1I0iI.I000iOII();
                    }
                    while (true) {
/* 12 */                o1I0iI = o1I0iI.I000OiO();
/* 20 */                if (!o1I0iI.I000l1()) {
/* 24 */                    if (o1I0iI instanceof IOI0oi1110il) {
/* 26 */                        return (IOI0oi1110il) o1I0iI;
                            }
/* 31 */                    if (o1I0iI instanceof OIIliOii0OoI) {
/* 33 */                        return null;
                            }
                        }
                    }
                }

                public static String I00i0O(Object obj) {
/* 3 */             if (!(obj instanceof O0111l0)) {
                        return obj instanceof Iol0IO ? ((Iol0IO) obj).I0000Il00O() ? "Active" : "New" : obj instanceof IOiIII1I ? "Cancelled" : "Completed";
                    }
/* 5 */             O0111l0 o0111l0 = (O0111l0) obj;
                    return o0111l0.I0000oI00() ? "Cancelling" : o0111l0.I0001Ioi1lo() ? "Completing" : "Active";
                }

                @Override
                public boolean I0000Il00O() {
/* 1 */             Object objI00Io1o110i = I00Io1o110i();
                    return (objI00Io1o110i instanceof Iol0IO) && ((Iol0IO) objI00Io1o110i).I0000Il00O();
                }

                @Override
                public void I000II(CancellationException cancellationException) {
/* 1 */             if (cancellationException == null) {
/* 10 */                cancellationException = new O010il(I001i1O0Ol(), null, this);
                    }
/* 13 */            I001IIilI0O(cancellationException);
                }

                public Object I000O01llI0() {
/* 1 */             return I00II0Ol1O0l();
                }

                public void I0010I0i(Object obj) {
/* 1 */             I00100o1O0lo(obj);
                }

                public final Object I0010o(IOoil1iiIilo iOoil1iiIilo) {
                    Object objI00Io1o110i;
/* 27 */            do {
/* 1 */                 objI00Io1o110i = I00Io1o110i();
/* 7 */                 if (!(objI00Io1o110i instanceof Iol0IO)) {
/* 11 */                    if (objI00Io1o110i instanceof IOiIII1I) {
/* 22 */                        throw ((IOiIII1I) objI00Io1o110i).I00000oIO;
                            }
/* 13 */                    return O011OiI01.I00000oIO(objI00Io1o110i);
                        }
/* 27 */            } while (I00i01iIIliI(objI00Io1o110i) < 0);
/* 36 */            O0111101oI o0111101oI = new O0111101oI(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 39 */            o0111101oI.I00l0I0l0lO1 = this;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            o0111101oI.I00111O();
/* 49 */            Oi10l0IIII1 oi10l0IIII1 = new Oi10l0IIII1();
/* 52 */            oi10l0IIII1.I00ilI0I1 = o0111101oI;
/* 54 */            VarHandle.storeStoreFence();
/* 61 */            iOl0iOoIl.I00000oIO(o0111101oI, l01oO1iOo.I0001Ioi1lo(this, true, oi10l0IIII1));
/* 64 */            Object objI0010I0i = o0111101oI.I0010I0i();
/* 68 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 186 */           return objI0010I0i;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
                  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00111O(Object obj) {
                    O011OOl11 o011OOl11;
                    I0OooiI1I i0OooiI1I;
                    Object objI00i0ilIl0i;
/* 1 */             Object objI00i0ilIl0i2 = O011OiI01.I00000oIO;
/* 9 */             if (I00IO1oi11O()) {
/* 48 */                do {
/* 11 */                    Object objI00Io1o110i = I00Io1o110i();
/* 17 */                    if (!(objI00Io1o110i instanceof Iol0IO) || ((objI00Io1o110i instanceof O0111l0) && ((O0111l0) objI00Io1o110i).I0001Ioi1lo())) {
/* 51 */                        objI00i0ilIl0i2 = O011OiI01.I00000oIO;
                                break;
                            }
/* 42 */                    objI00i0ilIl0i2 = I00i0ilIl0i(objI00Io1o110i, new IOiIII1I(false, I001lllioOl(obj)));
/* 48 */                } while (objI00i0ilIl0i2 == O011OiI01.I0000Il00O);
/* 55 */                if (objI00i0ilIl0i2 != O011OiI01.I00000oOI) {
/* 61 */                    if (objI00i0ilIl0i2 == O011OiI01.I00000oIO) {
/* 64 */                        Throwable thI001lllioOl = null;
                                while (true) {
/* 65 */                            Object objI00Io1o110i2 = this.I00Io1o110i();
/* 71 */                            if (!(objI00Io1o110i2 instanceof O0111l0)) {
/* 149 */                               if (!(objI00Io1o110i2 instanceof Iol0IO)) {
/* 226 */                                   o011OOl11 = this;
/* 227 */                                   objI00i0ilIl0i = O011OiI01.I0000O;
                                            break;
                                        }
/* 151 */                               if (thI001lllioOl == null) {
/* 153 */                                   thI001lllioOl = this.I001lllioOl(obj);
                                        }
/* 158 */                               Iol0IO iol0IO = (Iol0IO) objI00Io1o110i2;
/* 164 */                               if (iol0IO.I0000Il00O()) {
/* 166 */                                   OIIliOii0OoI oIIliOii0OoII00IlilI0i0i = this.I00IlilI0i0i(iol0IO);
/* 170 */                                   if (oIIliOii0OoII00IlilI0i0i != null) {
/* 183 */                                       o011OOl11 = this;
/* 188 */                                       if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(o011OOl11, I00iiI, iol0IO, new O0111l0(oIIliOii0OoII00IlilI0i0i, thI001lllioOl))) {
/* 191 */                                           o011OOl11.I00OilO00Il(oIIliOii0OoII00IlilI0i0i, thI001lllioOl);
/* 194 */                                           objI00i0ilIl0i = O011OiI01.I00000oIO;
                                                    break;
                                                }
                                            } else {
/* 172 */                                       o011OOl11 = this;
                                            }
/* 217 */                                   this = o011OOl11;
                                        } else {
/* 198 */                                   o011OOl11 = this;
/* 204 */                                   objI00i0ilIl0i = o011OOl11.I00i0ilIl0i(objI00Io1o110i2, new IOiIII1I(false, thI001lllioOl));
/* 210 */                                   if (objI00i0ilIl0i == O011OiI01.I00000oIO) {
/* 222 */                                       IOOlIIilOl0.I000lI("Cannot happen in ", objI00Io1o110i2);
/* 7 */                                         return false;
                                            }
/* 214 */                                   if (objI00i0ilIl0i != O011OiI01.I0000Il00O) {
                                                break;
                                            }
/* 217 */                                   this = o011OOl11;
                                        }
                                    } else {
                                        synchronized (objI00Io1o110i2) {
/* 87 */                                    if (I1Ioolli0l0o.I00000oIO.getObjectVolatile((O0111l0) objI00Io1o110i2, O0111l0.I00iiI) == O011OiI01.I0000oI00) {
/* 89 */                                        i0OooiI1I = O011OiI01.I0000O;
                                            } else {
/* 102 */                                       boolean zI0000oI00 = ((O0111l0) objI00Io1o110i2).I0000oI00();
/* 106 */                                       if (obj != null || !zI0000oI00) {
/* 110 */                                           if (thI001lllioOl == null) {
/* 112 */                                               thI001lllioOl = this.I001lllioOl(obj);
                                                    }
/* 119 */                                           ((O0111l0) objI00Io1o110i2).I00000oIO(thI001lllioOl);
                                                }
/* 129 */                                       Throwable thI00000oOI = zI0000oI00 ? null : ((O0111l0) objI00Io1o110i2).I00000oOI();
/* 133 */                                       if (thI00000oOI != null) {
/* 139 */                                           this.I00OilO00Il(((O0111l0) objI00Io1o110i2).I00iOIl, thI00000oOI);
                                                }
/* 142 */                                       i0OooiI1I = O011OiI01.I00000oIO;
                                            }
                                        }
/* 92 */                                o011OOl11 = this;
/* 93 */                                objI00i0ilIl0i2 = i0OooiI1I;
                                    }
                                }
/* 196 */                       objI00i0ilIl0i2 = objI00i0ilIl0i;
                            } else {
/* 230 */                       o011OOl11 = this;
                            }
/* 233 */                   if (objI00i0ilIl0i2 != O011OiI01.I00000oIO && objI00i0ilIl0i2 != O011OiI01.I00000oOI) {
/* 243 */                       if (objI00i0ilIl0i2 == O011OiI01.I0000O) {
/* 7 */                             return false;
                                }
/* 246 */                       o011OOl11.I00100o1O0lo(objI00i0ilIl0i2);
/* 8 */                         return true;
                            }
                        }
                    }
/* 8 */             return true;
                }

                public void I001IIilI0O(Throwable th) {
/* 1 */             I00111O(th);
                }

                public final boolean I001IO000(Throwable th) {
/* 5 */             if (I00O0o1oo()) {
/* 38 */                return true;
                    }
/* 8 */             boolean z = th instanceof CancellationException;
/* 18 */            IOI0oIliI0 iOI0oIliI0 = (IOI0oIliI0) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iOIl);
                    return (iOI0oIliI0 == null || iOI0oIliI0 == OIIo00iiOi.I00iOIl) ? z : iOI0oIliI0.I00000oIO(th) || z;
                }

                public String I001i1O0Ol() {
/* 1 */             return "Job was cancelled";
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
                
                    return r5;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IOI0oIliI0 I001i1lo1io(O011OOl11 o011OOl11) {
                    O011OOl11 o011OOl112;
/* 3 */             IOI0oi1110il iOI0oi1110il = new IOI0oi1110il();
/* 6 */             iOI0oi1110il.I00ilI0I1 = o011OOl11;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            iOI0oi1110il.I00iio = this;
                    while (true) {
/* 13 */                Object objI00Io1o110i = this.I00Io1o110i();
/* 19 */                if (objI00Io1o110i instanceof Il001oi1i) {
/* 22 */                    Il001oi1i il001oi1i = (Il001oi1i) objI00Io1o110i;
/* 26 */                    if (il001oi1i.I00iOIl) {
/* 32 */                        o011OOl112 = this;
/* 37 */                        if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(o011OOl112, I00iiI, objI00Io1o110i, iOI0oi1110il)) {
                                    break;
                                }
                            } else {
/* 40 */                        o011OOl112 = this;
/* 41 */                        o011OOl112.I00Ol1ll1(il001oi1i);
                            }
/* 67 */                    this = o011OOl112;
                        } else {
/* 45 */                    o011OOl112 = this;
/* 46 */                    boolean z = objI00Io1o110i instanceof Iol0IO;
/* 48 */                    OIIo00iiOi oIIo00iiOi = OIIo00iiOi.I00iOIl;
/* 51 */                    if (!z) {
/* 116 */                       Object objI00Io1o110i2 = o011OOl112.I00Io1o110i();
/* 127 */                       IOiIII1I iOiIII1I = objI00Io1o110i2 instanceof IOiIII1I ? (IOiIII1I) objI00Io1o110i2 : null;
/* 132 */                       iOI0oi1110il.I000oI1ioi(iOiIII1I != null ? iOiIII1I.I00000oIO : null);
/* 186 */                       return oIIo00iiOi;
                            }
/* 56 */                    OIIliOii0OoI oIIliOii0OoII0000O = ((Iol0IO) objI00Io1o110i).I0000O();
/* 60 */                    if (oIIliOii0OoII0000O == null) {
/* 64 */                        o011OOl112.I00OloOo((O010olO) objI00Io1o110i);
/* 67 */                        this = o011OOl112;
                            } else if (!oIIliOii0OoII0000O.I0000oI00(iOI0oi1110il, 7)) {
/* 78 */                        boolean zI0000oI00 = oIIliOii0OoII0000O.I0000oI00(iOI0oi1110il, 3);
/* 82 */                        Object objI00Io1o110i3 = o011OOl112.I00Io1o110i();
/* 88 */                        if (objI00Io1o110i3 instanceof O0111l0) {
/* 92 */                            thI00000oOI = ((O0111l0) objI00Io1o110i3).I00000oOI();
                                } else {
/* 104 */                           IOiIII1I iOiIII1I2 = objI00Io1o110i3 instanceof IOiIII1I ? (IOiIII1I) objI00Io1o110i3 : null;
/* 105 */                           if (iOiIII1I2 != null) {
/* 107 */                               thI00000oOI = iOiIII1I2.I00000oIO;
                                    }
                                }
/* 109 */                       iOI0oi1110il.I000oI1ioi(thI00000oOI);
/* 112 */                       if (zI0000oI00) {
                                    break;
                                }
/* 115 */                       return oIIo00iiOi;
                            }
                        }
                    }
                }

                public boolean I001iOo1i0O(Throwable th) {
/* 3 */             if (th instanceof CancellationException) {
/* 18 */                return true;
                    }
                    return I00111O(th) && I00IO1();
                }

                @Override
                public final Object I001l0I00(IOoil1iiIilo iOoil1iiIilo) {
                    Object objI00Io1o110i;
                    OoiIlOl1iI ooiIlOl1iI;
/* 23 */            do {
/* 1 */                 objI00Io1o110i = I00Io1o110i();
/* 5 */                 boolean z = objI00Io1o110i instanceof Iol0IO;
/* 7 */                 ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */                 if (!z) {
/* 15 */                    l01oO1iOo.I0000O(iOoil1iiIilo.getContext());
/* 18 */                    return ooiIlOl1iI;
                        }
/* 23 */            } while (I00i01iIIliI(objI00Io1o110i) < 0);
/* 32 */            IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 35 */            iIoOoIol0Io0.I00111O();
/* 40 */            Oi10l0ii0 oi10l0ii0 = new Oi10l0ii0();
/* 43 */            oi10l0ii0.I00ilI0I1 = iIoOoIol0Io0;
/* 45 */            VarHandle.storeStoreFence();
/* 52 */            iOl0iOoIl.I00000oIO(iIoOoIol0Io0, l01oO1iOo.I0001Ioi1lo(this, true, oi10l0ii0));
/* 55 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 59 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 61 */            if (objI0010I0i != ii0111o) {
/* 64 */                objI0010I0i = ooiIlOl1iI;
                    }
                    return objI0010I0i == ii0111o ? objI0010I0i : ooiIlOl1iI;
                }

                public final void I001lIiIIo1O(Iol0IO iol0IO, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */             long j = I00iOIl;
/* 9 */             IOI0oIliI0 iOI0oIliI0 = (IOI0oIliI0) unsafe.getObjectVolatile(this, j);
/* 11 */            if (iOI0oIliI0 != null) {
/* 13 */                iOI0oIliI0.I00000oOI();
/* 18 */                unsafe.putObjectVolatile(this, j, OIIo00iiOi.I00iOIl);
                    }
/* 23 */            IOiIIo1l iOiIIo1l = null;
/* 29 */            IOiIII1I iOiIII1I = obj instanceof IOiIII1I ? (IOiIII1I) obj : null;
/* 35 */            Throwable th = iOiIII1I != null ? iOiIII1I.I00000oIO : null;
/* 43 */            if (iol0IO instanceof O010olO) {
                        try {
/* 48 */                    ((O010olO) iol0IO).I000oI1ioi(th);
/* 51 */                    return;
                        } catch (Throwable th2) {
/* 76 */                    I00IoO0(new IOiIIo1l("Exception in completion handler " + iol0IO + " for " + this, th2, 0));
/* 551 */                   return;
                        }
                    }
/* 80 */            OIIliOii0OoI oIIliOii0OoII0000O = iol0IO.I0000O();
/* 84 */            if (oIIliOii0OoII0000O != null) {
/* 87 */                oIIliOii0OoII0000O.I0001Ioi1lo(1);
/* 100 */               for (O1I0iI o1I0iII000OiO = (O1I0iI) oIIliOii0OoII0000O.I000OOo1O(); !o1I0iII000OiO.equals(oIIliOii0OoII0000O); o1I0iII000OiO = o1I0iII000OiO.I000OiO()) {
/* 104 */                   if (o1I0iII000OiO instanceof O010olO) {
                                try {
/* 109 */                           ((O010olO) o1I0iII000OiO).I000oI1ioi(th);
                                } catch (Throwable th3) {
/* 114 */                           if (iOiIIo1l != null) {
/* 116 */                               ilIilolOlIoO.I00000oIO(iOiIIo1l, th3);
                                    } else {
/* 140 */                               iOiIIo1l = new IOiIIo1l("Exception in completion handler " + o1I0iII000OiO + " for " + this, th3, 0);
                                    }
                                }
                            }
                        }
/* 148 */               if (iOiIIo1l != null) {
/* 150 */                   I00IoO0(iOiIIo1l);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
                public final Throwable I001lllioOl(Object obj) {
                    CancellationException cancellationExceptionI00000oOI;
/* 8 */             if (obj == null ? true : obj instanceof Throwable) {
/* 10 */                Throwable th = (Throwable) obj;
                        return th == null ? new O010il(I001i1O0Ol(), null, this) : th;
                    }
/* 24 */            O011OOl11 o011OOl11 = (O011OOl11) obj;
/* 26 */            Object objI00Io1o110i = o011OOl11.I00Io1o110i();
/* 32 */            if (objI00Io1o110i instanceof O0111l0) {
/* 37 */                cancellationExceptionI00000oOI = ((O0111l0) objI00Io1o110i).I00000oOI();
                    } else if (objI00Io1o110i instanceof IOiIII1I) {
/* 49 */                cancellationExceptionI00000oOI = ((IOiIII1I) objI00Io1o110i).I00000oIO;
                    } else {
/* 54 */                if (objI00Io1o110i instanceof Iol0IO) {
/* 84 */                    IOOlIIilOl0.I000lI("Cannot be cancelling child in this state: ", objI00Io1o110i);
/* 7 */                     return null;
                        }
/* 56 */                cancellationExceptionI00000oOI = null;
                    }
/* 59 */            CancellationException cancellationException = cancellationExceptionI00000oOI instanceof CancellationException ? cancellationExceptionI00000oOI : null;
                    return cancellationException == null ? new O010il("Parent job is ".concat(I00i0O(objI00Io1o110i)), cancellationExceptionI00000oOI, o011OOl11) : cancellationException;
                }

                public final Object I001lloI(O0111l0 o0111l0, Object obj) throws Throwable {
                    O0111l0 o0111l02;
                    Throwable th;
                    Throwable thI00II0oii1o;
                    Object obj2;
/* 10 */            IOiIII1I iOiIII1I = obj instanceof IOiIII1I ? (IOiIII1I) obj : null;
/* 13 */            Throwable th2 = iOiIII1I != null ? iOiIII1I.I00000oIO : null;
                    synchronized (o0111l0) {
                        try {
/* 16 */                    o0111l0.I0000oI00();
/* 19 */                    ArrayList<Throwable> arrayListI000II = o0111l0.I000II(th2);
/* 23 */                    thI00II0oii1o = I00II0oii1o(o0111l0, arrayListI000II);
/* 27 */                    if (thI00II0oii1o != null) {
                                try {
/* 34 */                            if (arrayListI000II.size() > 1) {
/* 46 */                                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListI000II.size()));
/* 58 */                                for (Throwable th3 : arrayListI000II) {
/* 66 */                                    if (th3 != thI00II0oii1o && th3 != thI00II0oii1o && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
/* 80 */                                        ilIilolOlIoO.I00000oIO(thI00II0oii1o, th3);
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
/* 85 */                            th = th4;
/* 86 */                            o0111l02 = o0111l0;
/* 551 */                           throw th;
                                }
                            }
                        } catch (Throwable th5) {
/* 164 */                   o0111l02 = o0111l0;
/* 165 */                   th = th5;
                        }
                    }
/* 89 */            if (thI00II0oii1o != null && thI00II0oii1o != th2) {
/* 98 */                obj = new IOiIII1I(false, thI00II0oii1o);
                    }
/* 101 */           if (thI00II0oii1o != null && (I001IO000(thI00II0oii1o) || I00IoIO0lI(thI00II0oii1o))) {
/* 124 */               I1Ioolli0l0o.I00000oIO.compareAndSwapInt((IOiIII1I) obj, IOiIII1I.I00000oOI, 0, 1);
                    }
/* 127 */           I00Oio(obj);
/* 132 */           if (obj instanceof Iol0IO) {
/* 139 */               Iol0IO1io1 iol0IO1io1 = new Iol0IO1io1();
/* 142 */               iol0IO1io1.I00000oIO = (Iol0IO) obj;
/* 144 */               VarHandle.storeStoreFence();
/* 147 */               obj2 = iol0IO1io1;
                    } else {
/* 149 */               obj2 = obj;
                    }
/* 156 */           I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, o0111l0, obj2);
/* 159 */           I001lIiIIo1O(o0111l0, obj);
/* 162 */           return obj;
                }

                public final Object I00II0Ol1O0l() throws Throwable {
/* 1 */             Object objI00Io1o110i = I00Io1o110i();
/* 7 */             if (objI00Io1o110i instanceof Iol0IO) {
/* 25 */                I000II.I001IO000("This job has not completed yet");
/* 28 */                return null;
                    }
/* 11 */            if (objI00Io1o110i instanceof IOiIII1I) {
/* 22 */                throw ((IOiIII1I) objI00Io1o110i).I00000oIO;
                    }
/* 13 */            return O011OiI01.I00000oIO(objI00Io1o110i);
                }

                public final Throwable I00II0oii1o(O0111l0 o0111l0, ArrayList arrayList) {
                    Object next;
/* 5 */             Object obj = null;
/* 6 */             if (arrayList.isEmpty()) {
/* 12 */                if (o0111l0.I0000oI00()) {
/* 20 */                    return new O010il(I001i1O0Ol(), null, this);
                        }
/* 5 */                 return null;
                    }
/* 25 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 33 */                if (!it.hasNext()) {
/* 47 */                    next = null;
                            break;
                        }
/* 35 */                next = it.next();
/* 44 */                if (!(((Throwable) next) instanceof CancellationException)) {
                            break;
                        }
                    }
/* 48 */            Throwable th = (Throwable) next;
/* 50 */            if (th != null) {
/* 52 */                return th;
                    }
/* 58 */            Throwable th2 = (Throwable) arrayList.get(0);
/* 62 */            if (th2 instanceof Oo11Oo) {
/* 64 */                Iterator it2 = arrayList.iterator();
                        while (true) {
/* 72 */                    if (!it2.hasNext()) {
                                break;
                            }
/* 74 */                    Object next2 = it2.next();
/* 79 */                    Throwable th3 = (Throwable) next2;
/* 81 */                    if (th3 != th2 && (th3 instanceof Oo11Oo)) {
/* 87 */                        obj = next2;
                                break;
                            }
                        }
/* 88 */                Throwable th4 = (Throwable) obj;
/* 90 */                if (th4 != null) {
/* 92 */                    return th4;
                        }
                    }
/* 551 */           return th2;
                }

                public boolean I00IO1() {
/* 1 */             return true;
                }

                public boolean I00IO1oi11O() {
/* 1 */             return this instanceof IOi10loi;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final IiiOlIiio I00IioO0OiOi(boolean z, boolean z2, Function1 function1) {
                    O00IOlo0IoO o00IOlo0IoO;
/* 1 */             if (z) {
/* 5 */                 O00IOl o00IOl = new O00IOl();
/* 8 */                 o00IOl.I00ilI0I1 = function1;
/* 10 */                VarHandle.storeStoreFence();
                        o00IOlo0IoO = o00IOl;
                    } else {
/* 16 */                o00IOlo0IoO = new O00IOlo0IoO(function1);
                    }
/* 19 */            return I00O0i0ii(z2, o00IOlo0IoO);
                }

                public final OIIliOii0OoI I00IlilI0i0i(Iol0IO iol0IO) {
/* 1 */             OIIliOii0OoI oIIliOii0OoII0000O = iol0IO.I0000O();
/* 5 */             if (oIIliOii0OoII0000O != null) {
/* 49 */                return oIIliOii0OoII0000O;
                    }
/* 9 */             if (iol0IO instanceof Il001oi1i) {
/* 13 */                return new OIIliOii0OoI();
                    }
/* 20 */            if (iol0IO instanceof O010olO) {
/* 24 */                I00OloOo((O010olO) iol0IO);
/* 19 */                return null;
                    }
/* 30 */            IOOlIIilOl0.I000lI("State should have list: ", iol0IO);
/* 19 */            return null;
                }

                @Override
                public final CancellationException I00Io1lO() {
                    CancellationException cancellationException;
/* 1 */             Object objI00Io1o110i = I00Io1o110i();
/* 10 */            if (objI00Io1o110i instanceof O0111l0) {
/* 14 */                Throwable thI00000oOI = ((O0111l0) objI00Io1o110i).I00000oOI();
/* 18 */                if (thI00000oOI == null) {
/* 50 */                    IOOlIIilOl0.I000lI("Job is still new or active: ", this);
/* 9 */                     return null;
                        }
/* 30 */                String strConcat = getClass().getSimpleName().concat(" is cancelling");
/* 39 */                cancellationException = thI00000oOI instanceof CancellationException ? (CancellationException) thI00000oOI : null;
                        return cancellationException == null ? new O010il(strConcat, thI00000oOI, this) : cancellationException;
                    }
/* 56 */            if (objI00Io1o110i instanceof Iol0IO) {
/* 106 */               IOOlIIilOl0.I000lI("Job is still new or active: ", this);
/* 9 */                 return null;
                    }
/* 60 */            if (!(objI00Io1o110i instanceof IOiIII1I)) {
/* 102 */               return new O010il(getClass().getSimpleName().concat(" has completed normally"), null, this);
                    }
/* 64 */            Throwable th = ((IOiIII1I) objI00Io1o110i).I00000oIO;
/* 71 */            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                    return cancellationException == null ? new O010il(I001i1O0Ol(), th, this) : cancellationException;
                }

                public final Object I00Io1o110i() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iiI);
                }

                public boolean I00IoIO0lI(Throwable th) {
/* 1 */             return false;
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                public final void I00Iooi00oi(O010OIi o010OIi) {
/* 1 */             long j = I00iOIl;
/* 3 */             OIIo00iiOi oIIo00iiOi = OIIo00iiOi.I00iOIl;
/* 5 */             if (o010OIi == null) {
/* 9 */                 I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, j, oIIo00iiOi);
/* 12 */                return;
                    }
/* 13 */            o010OIi.start();
/* 16 */            IOI0oIliI0 iOI0oIliI0I001i1lo1io = o010OIi.I001i1lo1io(this);
/* 20 */            Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 22 */            unsafe.putObjectVolatile(this, j, iOI0oIliI0I001i1lo1io);
/* 29 */            if (I00oII()) {
/* 31 */                iOI0oIliI0I001i1lo1io.I00000oOI();
/* 34 */                unsafe.putObjectVolatile(this, j, oIIo00iiOi);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
                
                    return r8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IiiOlIiio I00O0i0ii(boolean z, O010olO o010olO) {
                    O011OOl11 o011OOl11;
                    O010olO o010olO2;
                    boolean zI0000oI00;
/* 1 */             o010olO.I00iio = this;
                    while (true) {
/* 3 */                 Object objI00Io1o110i = this.I00Io1o110i();
/* 9 */                 if (objI00Io1o110i instanceof Il001oi1i) {
/* 12 */                    Il001oi1i il001oi1i = (Il001oi1i) objI00Io1o110i;
/* 16 */                    if (il001oi1i.I00iOIl) {
/* 22 */                        o011OOl11 = this;
/* 23 */                        o010olO2 = o010olO;
/* 28 */                        if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(o011OOl11, I00iiI, objI00Io1o110i, o010olO2)) {
                                    break;
                                }
                            } else {
/* 31 */                        o011OOl11 = this;
/* 32 */                        o010olO2 = o010olO;
/* 33 */                        o011OOl11.I00Ol1ll1(il001oi1i);
                            }
/* 103 */                   this = o011OOl11;
/* 104 */                   o010olO = o010olO2;
                        } else {
/* 37 */                    o011OOl11 = this;
/* 38 */                    o010olO2 = o010olO;
/* 39 */                    boolean z2 = objI00Io1o110i instanceof Iol0IO;
/* 41 */                    OIIo00iiOi oIIo00iiOi = OIIo00iiOi.I00iOIl;
/* 44 */                    if (z2) {
/* 47 */                        Iol0IO iol0IO = (Iol0IO) objI00Io1o110i;
/* 49 */                        OIIliOii0OoI oIIliOii0OoII0000O = iol0IO.I0000O();
/* 53 */                        if (oIIliOii0OoII0000O == null) {
/* 57 */                            o011OOl11.I00OloOo((O010olO) objI00Io1o110i);
                                } else {
/* 65 */                            if (o010olO2.I000o00OoI0I()) {
/* 74 */                                O0111l0 o0111l0 = iol0IO instanceof O0111l0 ? (O0111l0) iol0IO : null;
/* 77 */                                Throwable thI00000oOI = o0111l0 != null ? o0111l0.I00000oOI() : null;
/* 81 */                                if (thI00000oOI == null) {
/* 84 */                                    zI0000oI00 = oIIliOii0OoII0000O.I0000oI00(o010olO2, 5);
                                        } else if (z) {
/* 91 */                                    o010olO2.I000oI1ioi(thI00000oOI);
/* 94 */                                    return oIIo00iiOi;
                                        }
                                    } else {
/* 96 */                                zI0000oI00 = oIIliOii0OoII0000O.I0000oI00(o010olO2, 1);
                                    }
/* 100 */                           if (zI0000oI00) {
                                        break;
                                    }
                                }
/* 103 */                       this = o011OOl11;
/* 104 */                       o010olO = o010olO2;
                            } else if (z) {
/* 108 */                       Object objI00Io1o110i2 = o011OOl11.I00Io1o110i();
/* 119 */                       IOiIII1I iOiIII1I = objI00Io1o110i2 instanceof IOiIII1I ? (IOiIII1I) objI00Io1o110i2 : null;
/* 124 */                       o010olO2.I000oI1ioi(iOiIII1I != null ? iOiIII1I.I00000oIO : null);
                            }
                        }
                    }
/* 102 */           return o010olO2;
                }

                public boolean I00O0o1oo() {
/* 1 */             return this instanceof II101I11;
                }

                public final boolean I00O10llo(Object obj) {
                    Object objI00i0ilIl0i;
/* 23 */            do {
/* 5 */                 objI00i0ilIl0i = I00i0ilIl0i(I00Io1o110i(), obj);
/* 11 */                if (objI00i0ilIl0i == O011OiI01.I00000oIO) {
/* 13 */                    return false;
                        }
/* 18 */                if (objI00i0ilIl0i == O011OiI01.I00000oOI) {
/* 17 */                    return true;
                        }
/* 23 */            } while (objI00i0ilIl0i == O011OiI01.I0000Il00O);
/* 25 */            I00100o1O0lo(objI00i0ilIl0i);
/* 17 */            return true;
                }

                public final Object I00OI1(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objI00i0ilIl0i;
/* 56 */            do {
/* 5 */                 objI00i0ilIl0i = I00i0ilIl0i(I00Io1o110i(), obj);
/* 11 */                if (objI00i0ilIl0i == O011OiI01.I00000oIO) {
/* 33 */                    String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
/* 45 */                    IOiIII1I iOiIII1I = obj instanceof IOiIII1I ? (IOiIII1I) obj : null;
/* 53 */                    throw new IllegalStateException(str, iOiIII1I != null ? iOiIII1I.I00000oIO : null);
                        }
/* 56 */            } while (objI00i0ilIl0i == O011OiI01.I0000Il00O);
/* 186 */           return objI00i0ilIl0i;
                }

                public String I00OIO1() {
/* 5 */             return getClass().getSimpleName();
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                public final void I00OilO00Il(OIIliOii0OoI oIIliOii0OoI, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 2 */             oIIliOii0OoI.I0001Ioi1lo(4);
/* 11 */            IOiIIo1l iOiIIo1l = null;
/* 16 */            for (O1I0iI o1I0iII000OiO = (O1I0iI) oIIliOii0OoI.I000OOo1O(); !o1I0iII000OiO.equals(oIIliOii0OoI); o1I0iII000OiO = o1I0iII000OiO.I000OiO()) {
/* 20 */                if ((o1I0iII000OiO instanceof O010olO) && ((O010olO) o1I0iII000OiO).I000o00OoI0I()) {
                            try {
/* 34 */                        ((O010olO) o1I0iII000OiO).I000oI1ioi(th);
                            } catch (Throwable th2) {
/* 39 */                        if (iOiIIo1l != null) {
/* 41 */                            ilIilolOlIoO.I00000oIO(iOiIIo1l, th2);
                                } else {
/* 70 */                            iOiIIo1l = new IOiIIo1l("Exception in completion handler " + o1I0iII000OiO + " for " + this, th2, 0);
                                }
                            }
                        }
                    }
/* 78 */            if (iOiIIo1l != null) {
/* 80 */                I00IoO0(iOiIIo1l);
                    }
/* 83 */            I001IO000(th);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00Ol1ll1(Il001oi1i il001oi1i) {
                    OIIliOii0OoI oIIliOii0OoI;
/* 3 */             OIIliOii0OoI oIIliOii0OoI2 = new OIIliOii0OoI();
/* 8 */             if (il001oi1i.I00iOIl) {
/* 10 */                oIIliOii0OoI = oIIliOii0OoI2;
                    } else {
/* 14 */                Ioiooo0o1 ioiooo0o1 = new Ioiooo0o1();
/* 17 */                ioiooo0o1.I00iOIl = oIIliOii0OoI2;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                oIIliOii0OoI = ioiooo0o1;
                    }
/* 29 */            I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, il001oi1i, oIIliOii0OoI);
                }

                public final void I00OloOo(O010olO o010olO) {
                    O010olO o010olO2;
/* 3 */             OIIliOii0OoI oIIliOii0OoI = new OIIliOii0OoI();
/* 6 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 10 */            unsafe.putObjectVolatile(oIIliOii0OoI, O1I0iI.I00iiI, o010olO);
/* 15 */            unsafe.putObjectVolatile(oIIliOii0OoI, O1I0iI.I00iOIl, o010olO);
                    while (true) {
/* 22 */                if (o010olO.I000OOo1O() != o010olO) {
/* 24 */                    o010olO2 = o010olO;
                            break;
                        }
/* 31 */                o010olO2 = o010olO;
/* 36 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(o010olO2, O1I0iI.I00iOIl, o010olO, oIIliOii0OoI)) {
/* 38 */                    oIIliOii0OoI.I000O01llI0(o010olO2);
                            break;
                        }
/* 55 */                o010olO = o010olO2;
                    }
/* 51 */            I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, o010olO2, o010olO2.I000OiO());
                }

                public final int I00i01iIIliI(Object obj) {
/* 4 */             if (obj instanceof Il001oi1i) {
/* 11 */                if (((Il001oi1i) obj).I00iOIl) {
/* 60 */                    return 0;
                        }
/* 26 */                if (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, obj, O011OiI01.I000II)) {
/* 54 */                    return -1;
                        }
/* 29 */                I00Ol10();
/* 3 */                 return 1;
                    }
/* 37 */            if (!(obj instanceof Ioiooo0o1)) {
/* 60 */                return 0;
                    }
/* 52 */            if (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, obj, ((Ioiooo0o1) obj).I00iOIl)) {
/* 54 */                return -1;
                    }
/* 56 */            I00Ol10();
/* 3 */             return 1;
                }

                public final Object I00i0ilIl0i(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object obj3;
/* 3 */             if (!(obj instanceof Iol0IO)) {
/* 5 */                 return O011OiI01.I00000oIO;
                    }
/* 10 */            if (((obj instanceof Il001oi1i) || (obj instanceof O010olO)) && !(obj instanceof IOI0oi1110il) && !(obj2 instanceof IOiIII1I)) {
/* 28 */                Iol0IO iol0IO = (Iol0IO) obj;
/* 32 */                if (obj2 instanceof Iol0IO) {
/* 39 */                    Iol0IO1io1 iol0IO1io1 = new Iol0IO1io1();
/* 42 */                    iol0IO1io1.I00000oIO = (Iol0IO) obj2;
/* 44 */                    VarHandle.storeStoreFence();
/* 47 */                    obj3 = iol0IO1io1;
                        } else {
/* 49 */                    obj3 = obj2;
                        }
/* 59 */                if (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00iiI, iol0IO, obj3)) {
/* 61 */                    return O011OiI01.I0000Il00O;
                        }
/* 64 */                I00Oio(obj2);
/* 67 */                I001lIiIIo1O(iol0IO, obj2);
/* 70 */                return obj2;
                    }
/* 17 */            O011OOl11 o011OOl11 = this;
/* 72 */            Iol0IO iol0IO2 = (Iol0IO) obj;
/* 74 */            OIIliOii0OoI oIIliOii0OoII00IlilI0i0i = o011OOl11.I00IlilI0i0i(iol0IO2);
/* 78 */            if (oIIliOii0OoII00IlilI0i0i == null) {
/* 80 */                return O011OiI01.I0000Il00O;
                    }
/* 92 */            O0111l0 o0111l0 = iol0IO2 instanceof O0111l0 ? (O0111l0) iol0IO2 : null;
/* 93 */            if (o0111l0 == null) {
/* 97 */                o0111l0 = new O0111l0(oIIliOii0OoII00IlilI0i0i, null);
                    }
/* 100 */           O0111l0 o0111l02 = o0111l0;
                    synchronized (o0111l02) {
/* 106 */               if (o0111l02.I0001Ioi1lo()) {
/* 108 */                   return O011OiI01.I00000oIO;
                        }
/* 115 */               Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 120 */               unsafe.putIntVolatile(o0111l02, O0111l0.I00iiO, 1);
/* 123 */               if (o0111l02 != iol0IO2) {
/* 128 */                   boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(o011OOl11, I00iiI, iol0IO2, o0111l02);
/* 132 */                   o011OOl11 = o011OOl11;
/* 133 */                   if (!zCompareAndSwapObject) {
/* 135 */                       return O011OiI01.I0000Il00O;
                            }
                        }
/* 139 */               boolean zI0000oI00 = o0111l02.I0000oI00();
/* 151 */               IOiIII1I iOiIII1I = obj2 instanceof IOiIII1I ? (IOiIII1I) obj2 : null;
/* 152 */               if (iOiIII1I != null) {
/* 156 */                   o0111l02.I00000oIO(iOiIII1I.I00000oIO);
                        }
/* 163 */               Throwable thI00000oOI = zI0000oI00 ? null : o0111l02.I00000oOI();
/* 167 */               if (thI00000oOI != null) {
/* 169 */                   o011OOl11.I00OilO00Il(oIIliOii0OoII00IlilI0i0i, thI00000oOI);
                        }
/* 172 */               IOI0oi1110il iOI0oi1110ilI00OIo = I00OIo(oIIliOii0OoII00IlilI0i0i);
/* 176 */               if (iOI0oi1110ilI00OIo != null && o011OOl11.I00i0oil(o0111l02, iOI0oi1110ilI00OIo, obj2)) {
/* 184 */                   return O011OiI01.I00000oOI;
                        }
/* 188 */               oIIliOii0OoII00IlilI0i0i.I0001Ioi1lo(2);
/* 191 */               IOI0oi1110il iOI0oi1110ilI00OIo2 = I00OIo(oIIliOii0OoII00IlilI0i0i);
                        return (iOI0oi1110ilI00OIo2 == null || !o011OOl11.I00i0oil(o0111l02, iOI0oi1110ilI00OIo2, obj2)) ? o011OOl11.I001lloI(o0111l02, obj2) : O011OiI01.I00000oOI;
                    }
                }

                public final boolean I00i0oil(O0111l0 o0111l0, IOI0oi1110il iOI0oi1110il, Object obj) {
/* 34 */            do {
/* 1 */                 O011OOl11 o011OOl11 = iOI0oi1110il.I00ilI0I1;
/* 5 */                 O0111OI1IlIO o0111OI1IlIO = new O0111OI1IlIO();
/* 8 */                 o0111OI1IlIO.I00ilI0I1 = this;
/* 10 */                o0111OI1IlIO.I00ilO0 = o0111l0;
/* 12 */                o0111OI1IlIO.I00io1l = iOI0oi1110il;
/* 14 */                o0111OI1IlIO.I00ioIO = obj;
/* 16 */                VarHandle.storeStoreFence();
/* 26 */                if (l01oO1iOo.I0001Ioi1lo(o011OOl11, false, o0111OI1IlIO) != OIIo00iiOi.I00iOIl) {
/* 28 */                    return true;
                        }
/* 30 */                iOI0oi1110il = I00OIo(iOI0oi1110il);
/* 34 */            } while (iOI0oi1110il != null);
/* 19 */            return false;
                }

                @Override
                public final IiiOlIiio I00iiI(Function1 function1) {
/* 7 */             return I00O0i0ii(true, new O00IOlo0IoO(function1));
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final OlOO1i11110 I00l0I0l0lO1() {
/* 6 */             OoOOI1100oI0.I0000Il00O(3, O011OO.I00ioIO);
/* 11 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(26);
/* 14 */            olOO1i11110.I00iiI = this;
/* 18 */            olOO1i11110.I00iiO = IOilI1lIII1.I00ilO0;
/* 20 */            VarHandle.storeStoreFence();
/* 29 */            return olOO1i11110;
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public final boolean I00oII() {
/* 7 */             return !(I00Io1o110i() instanceof Iol0IO);
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return Iioi0lilII.I00iio;
                }

                @Override
                public final boolean isCancelled() {
/* 1 */             Object objI00Io1o110i = I00Io1o110i();
/* 7 */             if (objI00Io1o110i instanceof IOiIII1I) {
/* 24 */                return true;
                    }
                    return (objI00Io1o110i instanceof O0111l0) && ((O0111l0) objI00Io1o110i).I0000oI00();
                }

                @Override
                public final boolean start() {
                    int iI00i01iIIliI;
/* 12 */            do {
/* 5 */                 iI00i01iIIliI = I00i01iIIliI(I00Io1o110i());
/* 9 */                 if (iI00i01iIIliI == 0) {
/* 16 */                    return false;
                        }
/* 12 */            } while (iI00i01iIIliI != 1);
/* 11 */            return true;
                }

                public final String toString() {
/* 52 */            return (I00OIO1() + '{' + I00i0O(I00Io1o110i()) + '}') + '@' + Ii1Oo1l.I00000oIO(this);
                }

/* 28 */        public void I00Ol10() {
                }

/* 48 */        public void I00100o1O0lo(Object obj) {
                }

/* 48 */        public void I00IoO0(IOiIIo1l iOiIIo1l) {
/* 49 */            throw iOiIIo1l;
                }

/* 48 */        public void I00Oio(Object obj) {
                }
            }
