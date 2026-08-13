            package p000;

            import android.util.Log;
            import android.view.Surface;
            import java.util.List;
            
            public final class IIoI1Ill11oi implements AutoCloseable {
                public Surface I00iOIl;
                public int I00iiI;
                public I1Ool1IoO110 I00iiO;
                public IIoI1li1o1l I00iio;

                @Override
                public final void close() {
                    Surface surface;
                    List<OolOOl0> listI00iIi0i1o;
/* 7 */             if (this.I00iiO.I00000oIO()) {
/* 9 */                 IIoI1li1o1l iIoI1li1o1l = this.I00iio;
                        synchronized (iIoI1li1o1l.I00000oIO) {
/* 16 */                    surface = this.I00iOIl;
/* 24 */                    Integer num = (Integer) iIoI1li1o1l.I00000oOI.get(surface);
/* 26 */                    if (num == null) {
/* 194 */                       throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                            }
                            int iIntValue = num.intValue() - 1;
/* 40 */                    iIoI1li1o1l.I00000oOI.put(surface, Integer.valueOf(iIntValue));
/* 43 */                    if (iIntValue == 0) {
/* 47 */                        listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(iIoI1li1o1l.I0000Il00O);
/* 53 */                        iIoI1li1o1l.I00000oOI.remove(surface);
                            } else {
/* 60 */                        listI00iIi0i1o = null;
                            }
                        }
/* 62 */                if (listI00iIi0i1o != null) {
/* 74 */                    for (OolOOl0 oolOOl0 : listI00iIi0i1o) {
                                synchronized (oolOOl0.I0000oI00) {
                                    try {
/* 93 */                                IiIO1ol1i1o0 iiIO1ol1i1o0 = (IiIO1ol1i1o0) oolOOl0.I000II.remove(surface);
/* 95 */                                if (iiIO1ol1i1o0 != null) {
/* 104 */                                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 106 */                                       iiIO1ol1i1o0.toString();
                                            }
/* 114 */                                   oolOOl0.I0000Il00O.I0000oI00(iiIO1ol1i1o0);
                                            try {
/* 117 */                                       iiIO1ol1i1o0.I00000oOI();
                                            } catch (IllegalStateException e) {
/* 129 */                                       if (l11I11lO.I0000O(5, "CXCP")) {
/* 150 */                                           Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                                }
                                            }
/* 153 */                                   oolOOl0.I0000oI00();
                                        }
                                    } catch (Throwable th) {
/* 159 */                               throw th;
                                    }
                                }
                            }
                        }
                    }
                }

                public final String toString() {
/* 13 */            return "SurfaceToken-" + this.I00iiI;
                }
            }
