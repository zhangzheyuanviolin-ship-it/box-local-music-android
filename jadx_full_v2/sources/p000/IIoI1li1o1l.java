            package p000;

            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class IIoI1li1o1l {
                public static final I1OollilIo I0000O = iOOOIOoiIlII.I00000oOI(0);
                public Object I00000oIO;
                public LinkedHashMap I00000oOI;
                public LinkedHashSet I0000Il00O;

                public final IIoI1Ill11oi I00000oIO(Surface surface) {
                    IIoI1Ill11oi iIoI1Ill11oi;
                    List listI00iIi0i1o;
/* 5 */             if (!surface.isValid()) {
/* 28 */                Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
                    }
                    synchronized (this.I00000oIO) {
                        try {
/* 36 */                    iIoI1Ill11oi = new IIoI1Ill11oi();
/* 39 */                    iIoI1Ill11oi.I00iio = this;
/* 41 */                    iIoI1Ill11oi.I00iOIl = surface;
/* 43 */                    I1OollilIo i1OollilIo = I0000O;
/* 45 */                    i1OollilIo.getClass();
/* 54 */                    iIoI1Ill11oi.I00iiI = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 61 */                    iIoI1Ill11oi.I00iiO = iOOOIOoiIlII.I00000oIO(false);
/* 63 */                    VarHandle.storeStoreFence();
/* 72 */                    Integer num = (Integer) this.I00000oOI.get(surface);
/* 84 */                    int iIntValue = (num != null ? num.intValue() : 0) + 1;
/* 91 */                    this.I00000oOI.put(surface, Integer.valueOf(iIntValue));
/* 103 */                   listI00iIi0i1o = iIntValue == 1 ? IOOi0Ool1i.I00iIi0i1o(this.I0000Il00O) : null;
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 105 */           if (listI00iIi0i1o != null) {
/* 109 */               Iterator it = listI00iIi0i1o.iterator();
/* 117 */               while (it.hasNext()) {
/* 125 */                   ((OolOOl0) it.next()).I0000Il00O(surface);
                        }
                    }
/* 129 */           return iIoI1Ill11oi;
                }
            }
