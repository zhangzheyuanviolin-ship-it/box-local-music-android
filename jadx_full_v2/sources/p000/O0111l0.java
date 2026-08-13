            package p000;

            import java.util.ArrayList;
            import sun.misc.Unsafe;
            
            public final class O0111l0 implements Iol0IO {
                public static final long I00iiI;
                public static final long I00iiO;
                public static final long I00iio;
                public final OIIliOii0OoI I00iOIl;
                private volatile Object _exceptionsHolder$volatile;
                private volatile int _isCompleting$volatile = 0;
                private volatile Object _rootCause$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00iiO = unsafe.objectFieldOffset(O0111l0.class.getDeclaredField("_isCompleting$volatile"));
/* 27 */            I00iio = unsafe.objectFieldOffset(O0111l0.class.getDeclaredField("_rootCause$volatile"));
/* 39 */            I00iiI = unsafe.objectFieldOffset(O0111l0.class.getDeclaredField("_exceptionsHolder$volatile"));
                }

                public O0111l0(OIIliOii0OoI oIIliOii0OoI, Throwable th) {
/* 4 */             this.I00iOIl = oIIliOii0OoI;
/* 9 */             this._rootCause$volatile = th;
                }

                public final void I00000oIO(Throwable th) {
/* 1 */             Throwable thI00000oOI = I00000oOI();
/* 5 */             if (thI00000oOI == null) {
/* 11 */                I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, I00iio, th);
/* 14 */                return;
                    }
/* 15 */            if (th == thI00000oOI) {
/* 38 */                return;
                    }
/* 18 */            Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 20 */            long j = I00iiI;
/* 22 */            Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 26 */            if (objectVolatile == null) {
/* 28 */                unsafe.putObjectVolatile(this, j, th);
/* 31 */                return;
                    }
/* 34 */            if (!(objectVolatile instanceof Throwable)) {
/* 57 */                if (objectVolatile instanceof ArrayList) {
/* 61 */                    ((ArrayList) objectVolatile).add(th);
/* 64 */                    return;
                        } else {
/* 67 */                    IOOlIIilOl0.I000lI("State is ", objectVolatile);
/* 186 */                   return;
                        }
                    }
/* 36 */            if (th == objectVolatile) {
/* 38 */                return;
                    }
/* 42 */            ArrayList arrayList = new ArrayList(4);
/* 45 */            arrayList.add(objectVolatile);
/* 48 */            arrayList.add(th);
/* 51 */            unsafe.putObjectVolatile(this, j, arrayList);
                }

                public final Throwable I00000oOI() {
/* 9 */             return (Throwable) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iio);
                }

                @Override
                public final boolean I0000Il00O() {
                    return I00000oOI() == null;
                }

                @Override
                public final OIIliOii0OoI I0000O() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean I0000oI00() {
                    return I00000oOI() != null;
                }

                public final boolean I0001Ioi1lo() {
                    return I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00iiO) == 1;
                }

                public final ArrayList I000II(Throwable th) {
                    ArrayList arrayList;
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */             long j = I00iiI;
/* 5 */             Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 10 */            if (objectVolatile == null) {
/* 14 */                arrayList = new ArrayList(4);
                    } else if (objectVolatile instanceof Throwable) {
/* 24 */                ArrayList arrayList2 = new ArrayList(4);
/* 27 */                arrayList2.add(objectVolatile);
/* 30 */                arrayList = arrayList2;
                    } else {
/* 34 */                if (!(objectVolatile instanceof ArrayList)) {
/* 67 */                    IOOlIIilOl0.I000lI("State is ", objectVolatile);
/* 70 */                    return null;
                        }
/* 36 */                arrayList = (ArrayList) objectVolatile;
                    }
/* 38 */            Throwable thI00000oOI = I00000oOI();
/* 42 */            if (thI00000oOI != null) {
/* 45 */                arrayList.add(0, thI00000oOI);
                    }
/* 48 */            if (th != null && !th.equals(thI00000oOI)) {
/* 56 */                arrayList.add(th);
                    }
/* 61 */            unsafe.putObjectVolatile(this, j, O011OiI01.I0000oI00);
/* 64 */            return arrayList;
                }

                public final String toString() {
/* 70 */            return "Finishing[cancelling=" + I0000oI00() + ", completing=" + I0001Ioi1lo() + ", rootCause=" + I00000oOI() + ", exceptions=" + I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iiI) + ", list=" + this.I00iOIl + ']';
                }
            }
