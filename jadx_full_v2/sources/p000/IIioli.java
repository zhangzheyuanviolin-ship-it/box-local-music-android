            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.util.ArrayMap;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class IIioli implements IIlo0i0ll {
                public final String I00iOIl;
                public final CameraCharacteristics I00iiI;
                public final IIl0oO I00iiO;
                public final Set I00iio;
                public final ArrayMap I00ilI0I1 = new ArrayMap();
                public final ArrayMap I00ilO0 = new ArrayMap();
                public final O0ioIllo0i1 I00io1l;
                public final O0ioIllo0i1 I00ioIO;

                public IIioli(String str, CameraCharacteristics cameraCharacteristics, IIl0oO iIl0oO, Set set) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = cameraCharacteristics;
/* 8 */             this.I00iiO = iIl0oO;
/* 10 */            this.I00iio = set;
/* 26 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 31 */            IIioiIi iIioiIi = new IIioiIi(0);
/* 34 */            iIioiIi.I00iiI = this;
/* 36 */            VarHandle.storeStoreFence();
/* 43 */            this.I00io1l = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi);
/* 48 */            IIioiIi iIioiIi2 = new IIioiIi(1);
/* 51 */            iIioiIi2.I00iiI = this;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi2);
/* 62 */            IIioiIi iIioiIi3 = new IIioiIi(2);
/* 65 */            iIioiIi3.I00iiI = this;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi3);
/* 76 */            IIioiIi iIioiIi4 = new IIioiIi(3);
/* 79 */            iIioiIi4.I00iiI = this;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi4);
/* 90 */            IIioiIi iIioiIi5 = new IIioiIi(4);
/* 93 */            iIioiIi5.I00iiI = this;
/* 95 */            VarHandle.storeStoreFence();
/* 98 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi5);
/* 104 */           IIioiIi iIioiIi6 = new IIioiIi(5);
/* 107 */           iIioiIi6.I00iiI = this;
/* 109 */           VarHandle.storeStoreFence();
/* 112 */           l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi6);
/* 118 */           IIioiIi iIioiIi7 = new IIioiIi(6);
/* 121 */           iIioiIi7.I00iiI = this;
/* 123 */           VarHandle.storeStoreFence();
/* 126 */           l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi7);
/* 132 */           IIioiIi iIioiIi8 = new IIioiIi(7);
/* 135 */           iIioiIi8.I00iiI = this;
/* 137 */           VarHandle.storeStoreFence();
/* 144 */           this.I00ioIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioiIi8);
                }

                public final Object I0000O(CameraCharacteristics.Key key) {
                    Object obj;
/* 8 */             if (this.I00iio.contains(key)) {
                        try {
/* 12 */                    return this.I00iiI.get(key);
                        } catch (AssertionError unused) {
/* 21 */                    IioIoO10iOiI.I000O01llI0(key, "Failed to get characteristic for ", ": Framework throw an AssertionError");
/* 7 */                     return null;
                        }
                    }
                    synchronized (this.I00ilI0I1) {
/* 30 */                obj = this.I00ilI0I1.get(key);
                    }
/* 35 */            if (obj != null) {
/* 67 */                return obj;
                    }
                    try {
/* 39 */                Object obj2 = this.I00iiI.get(key);
/* 43 */                if (obj2 == null) {
/* 58 */                    return obj2;
                        }
                        synchronized (this.I00ilI0I1) {
/* 50 */                    this.I00ilI0I1.put(key, obj2);
                        }
/* 54 */                return obj2;
                    } catch (AssertionError unused2) {
/* 63 */                IioIoO10iOiI.I000O01llI0(key, "Failed to get characteristic for ", ": Framework throw an AssertionError");
/* 7 */                 return null;
                    }
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(CameraCharacteristics.class))) {
/* 15 */                return this.I00iiI;
                    }
/* 18 */            return null;
                }
            }
