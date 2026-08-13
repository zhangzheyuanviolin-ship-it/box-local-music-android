            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
            public final class Oi1oO0Iooi1o extends O110lI {
                public Oi1oIiOiIi0 I000l1;
                public IIlio101Io I000lI;
                public boolean I000o00OoI0I;
                public Oi1oO1 I000oI1ioi;
                public AtomicBoolean I00100l0;
                public AtomicBoolean I00100o1O0lo;
                public AtomicBoolean I0010I0i;
                public Ii00l101O I0010o;
                public Function1 I00111O;

                @Override
                public final void I000II() {
/* 7 */             ((Set) this.I000lI.I00iiO).add(this);
/* 12 */            IIOlO1ii iIOlO1ii = this.I000l1.I00000oIO;
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 15 */            if (iIOlO1ii != null) {
/* 26 */                iOi1II01i0.I0000O(iIOlO1ii, this.I0010o, null, new Oi1oO0lIlO(this, iOoil1iiIilo, 1), 2);
                    } else {
/* 32 */                O0000Ioio00.I000OOo1O("coroutineScope");
/* 55 */                throw null;
                    }
                }

                @Override
                public final void I000O01llI0() {
/* 7 */             ((Set) this.I000lI.I00iiO).remove(this);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[Catch: all -> 0x003b, Exception -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0031, B:53:0x00f0), top: B:70:0x0031, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0031, B:51:0x00ea, B:53:0x00f0, B:60:0x010c, B:57:0x0102, B:58:0x0109), top: B:70:0x0031, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e8 -> B:51:0x00ea). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0117 -> B:65:0x0118). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000l1(IOoilo iOoilo) throws Throwable {
                    Oi1oO1iII1o oi1oO1iII1o;
                    boolean z;
                    boolean z2;
/* 5 */             AtomicBoolean atomicBoolean = this.I00100l0;
/* 7 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I000l1;
/* 9 */             AtomicBoolean atomicBoolean2 = this.I00100o1O0lo;
/* 13 */            if (iOoilo instanceof Oi1oO1iII1o) {
/* 16 */                oi1oO1iII1o = (Oi1oO1iII1o) iOoilo;
/* 18 */                int i = oi1oO1iII1o.I00iio;
/* 24 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 27 */                    oi1oO1iII1o.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 32 */                    oi1oO1iII1o = new Oi1oO1iII1o(this, iOoilo);
                        }
                    }
/* 35 */            Object obj = oi1oO1iII1o.I00iiI;
/* 37 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 39 */            int i2 = oi1oO1iII1o.I00iio;
/* 41 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 42 */            boolean z3 = false;
/* 42 */            Object[] objArr = 0;
/* 44 */            if (i2 != 0) {
/* 46 */                if (i2 != 1) {
/* 68 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return null;
                        }
/* 48 */                int i3 = oi1oO1iII1o.I00iOIl;
                        try {
                            try {
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
/* 55 */                        Object obj2 = obj;
/* 56 */                        z = true;
/* 239 */                       while (atomicBoolean.compareAndSet(z, false)) {
/* 241 */                           oi1oO1iII1o.I00iOIl = z ? 1 : 0;
/* 243 */                           oi1oO1iII1o.I00iio = z ? 1 : 0;
/* 249 */                           Object objI0000Il00O = il01ioIoI.I0000Il00O(oi1oO1iII1o, oi1oIiOiIi0, z, this.I000o00OoI0I, this.I00111O);
/* 253 */                           if (objI0000Il00O == ii0111o) {
/* 255 */                               return ii0111o;
                                    }
/* 256 */                           obj2 = objI0000Il00O;
/* 257 */                           i3 = z ? 1 : 0;
                                }
/* 267 */                       if (i3 != 0) {
/* 269 */                           I000OOo1O(obj2);
                                }
/* 281 */                       if (i3 != 0 || !atomicBoolean.get()) {
/* 289 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 231 */                       if (atomicBoolean2.compareAndSet(false, z)) {
/* 280 */                           i3 = 0;
/* 281 */                           if (i3 != 0) {
                                    }
/* 289 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 233 */                       obj2 = iOoil1iiIilo;
/* 234 */                       i3 = 0;
/* 239 */                       while (atomicBoolean.compareAndSet(z, false)) {
                                }
/* 267 */                       if (i3 != 0) {
                                }
/* 281 */                       if (i3 != 0) {
                                }
/* 289 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Exception e) {
/* 266 */                       throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
/* 276 */                   atomicBoolean2.set(false);
                        }
                    }
/* 72 */            lIoii1l01l0i.I00000oOI(obj);
/* 81 */            if (this.I0010I0i.compareAndSet(false, true)) {
/* 83 */                O00IOI11 o00ioi11I0001Ioi1lo = oi1oIiOiIi0.I0001Ioi1lo();
/* 87 */                Oi1oO1 oi1oO1 = this.I000oI1ioi;
/* 93 */                i000iI1 i000ii1 = new i000iI1(oi1oO1.I00000oIO);
/* 96 */                i000ii1.I00000oOI = o00ioi11I0001Ioi1lo;
/* 103 */               i000ii1.I0000Il00O = new WeakReference(oi1oO1);
/* 105 */               VarHandle.storeStoreFence();
/* 108 */               LinkedHashMap linkedHashMap = o00ioi11I0001Ioi1lo.I0000Il00O;
/* 110 */               OoIlIoo1oiOo ooIlIoo1oiOo = o00ioi11I0001Ioi1lo.I00000oOI;
/* 114 */               OIoi0IIoi oIoi0IIoiI00100l0 = ooIlIoo1oiOo.I00100l0(i000ii1.I00000oIO);
/* 120 */               String[] strArr = (String[]) oIoi0IIoiI00100l0.I00iOIl;
/* 124 */               int[] iArr = (int[]) oIoi0IIoiI00100l0.I00iiI;
/* 128 */               OIOio0O1O oIOio0O1O = new OIOio0O1O();
/* 131 */               oIOio0O1O.I00000oIO = i000ii1;
/* 133 */               oIOio0O1O.I00000oOI = iArr;
/* 135 */               oIOio0O1O.I0000Il00O = strArr;
/* 139 */               if (iArr.length == strArr.length) {
/* 153 */                   oIOio0O1O.I0000O = strArr.length == 0 ? Il01llIol0.I00iOIl : Collections.singleton(strArr[0]);
/* 155 */                   VarHandle.storeStoreFence();
/* 158 */                   ReentrantLock reentrantLock = o00ioi11I0001Ioi1lo.I0000O;
/* 160 */                   reentrantLock.lock();
                            try {
/* 182 */                       OIOio0O1O oIOio0O1O2 = linkedHashMap.containsKey(i000ii1) ? (OIOio0O1O) O1Oii0O0loo.I00000oOI(i000ii1, linkedHashMap) : (OIOio0O1O) linkedHashMap.put(i000ii1, oIOio0O1O);
/* 184 */                       reentrantLock.unlock();
/* 187 */                       if (oIOio0O1O2 == null && ((OIOiiiloOio) ooIlIoo1oiOo.I00ioIO).I00000oIO(iArr)) {
/* 199 */                           z2 = true;
                                }
/* 213 */                       if (z2) {
/* 225 */                           iOoil1iiIilo = null;
                                } else {
/* 217 */                           iOoil1iiIilo = null;
/* 221 */                           lO00OiilOI0l.I00000oIO(new O00IIolO0(o00ioi11I0001Ioi1lo, iOoil1iiIilo, objArr == true ? 1 : 0));
                                }
                            } catch (Throwable th) {
/* 203 */                       reentrantLock.unlock();
/* 206 */                       throw th;
                            }
                        } else {
/* 209 */                   I000II.I001IO000("Check failed.");
                        }
/* 201 */               z2 = false;
/* 213 */               if (z2) {
                        }
                    }
/* 226 */           z = true;
/* 231 */           if (atomicBoolean2.compareAndSet(false, z)) {
                    }
                }
            }
