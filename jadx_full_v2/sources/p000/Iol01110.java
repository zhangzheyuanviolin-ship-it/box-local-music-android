            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class Iol01110 implements Iol001OOI {
                public final int I00iOIl;
                public ArrayList I00iiI;
                public Object I00iiO;

                public Iol01110(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public void I00000oIO() {
                    synchronized (this.I00iiO) {
                        try {
/* 6 */                     Iterator it = this.I00iiI.iterator();
/* 14 */                    while (it.hasNext()) {
/* 20 */                        Iol00ooo iol00ooo = (Iol00ooo) it.next();
/* 27 */                        iol00ooo.I0000Il00O.I000II(iol00ooo.I00000oIO, null);
/* 32 */                        iol00ooo.I00000oOI.I00000oIO();
                            }
/* 40 */                    this.I00iiI.clear();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public void I00000oOI(int i, IiIO1ol1i1o0 iiIO1ol1i1o0, IIll0oO iIll0oO) {
                    synchronized (this.I00iiO) {
/* 4 */                 ArrayList arrayList = this.I00iiI;
/* 8 */                 Iol00ooo iol00ooo = new Iol00ooo();
/* 11 */                iol00ooo.I00000oIO = i;
/* 13 */                iol00ooo.I00000oOI = iiIO1ol1i1o0;
/* 15 */                iol00ooo.I0000Il00O = iIll0oO;
/* 17 */                VarHandle.storeStoreFence();
/* 20 */                arrayList.add(iol00ooo);
                    }
                }

                public void I0000Il00O(String str, Object obj) {
/* 1 */             int length = str.length();
/* 5 */             String strValueOf = String.valueOf(obj);
/* 29 */            this.I00iiI.add(IIlIOloOOO.I0010I0i(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
                }

                @Override
                public void I0000oI00(IiIO1ol1i1o0 iiIO1ol1i1o0) {
                    synchronized (this.I00iiO) {
/* 6 */                 Iterator it = this.I00iiI.iterator();
/* 14 */                while (it.hasNext()) {
/* 28 */                    if (O0000Ioio00.I0000O(((Iol00ooo) it.next()).I00000oOI, iiIO1ol1i1o0)) {
/* 30 */                        iiIO1ol1i1o0.I00000oIO();
                            }
                        }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 15 */                    StringBuilder sb = new StringBuilder(100);
/* 28 */                    sb.append(this.I00iiO.getClass().getSimpleName());
/* 33 */                    sb.append('{');
/* 36 */                    ArrayList arrayList = this.I00iiI;
/* 38 */                    int size = arrayList.size();
/* 43 */                    for (int i = 0; i < size; i++) {
/* 51 */                        sb.append((String) arrayList.get(i));
/* 56 */                        if (i < size - 1) {
/* 60 */                            sb.append(", ");
                                }
                            }
/* 68 */                    sb.append('}');
/* 71 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
