            package p000;

            import android.net.Uri;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class ll10Ii1io1I implements I1Oll0OOO {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public ll10Ii1io1I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) throws IOException {
                    switch (this.I00000oIO) {
                        case 0:
/* 241 */                   ll1i0O ll1i0o = (ll1i0O) this.I00000oOI;
/* 262 */                   return ((lOIiI0) ll1i0o.I0000O.get()).I00000oIO(new ll1IoiliI(ll1i0o, (llIOoOoIi) this.I0000Il00O));
                        case 1:
/* 108 */                   OOol0l1I1 oOol0l1I1 = (OOol0l1I1) this.I00000oOI;
/* 110 */                   loooIloil loooiloil = (loooIloil) obj;
/* 112 */                   int i = oOol0l1I1.I00iio;
/* 116 */                   ArrayList arrayList = new ArrayList(i);
/* 119 */                   int i2 = 0;
/* 120 */                   IoilOOi ioilOOiListIterator = oOol0l1I1.listIterator(0);
/* 128 */                   if (ioilOOiListIterator.hasNext()) {
/* 231 */                       ioilOOiListIterator.next().getClass();
/* 234 */                       OIiilo1Ool0o.I00000oIO();
/* 237 */                       return null;
                            }
/* 133 */                   loi1l0Io1I loi1l0io1i = new loi1l0Io1I(1);
/* 136 */                   loi1l0io1i.I00000oOI = this;
/* 138 */                   loi1l0io1i.I0000Il00O = arrayList;
/* 140 */                   loi1l0io1i.I0000O = i;
/* 142 */                   VarHandle.storeStoreFence();
/* 145 */                   ll10Ii1io1I ll10ii1io1iI00000oOI = o0iOII1liI.I00000oOI(loi1l0io1i);
/* 149 */                   Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
/* 159 */                   ListenableFuture listenableFutureI0000O = IlloOoiiO.I0000O(loooiloil.I00000oIO.I0000oI00.I00O0i0ii());
/* 166 */                   ll10Ii1io1I ll10ii1io1i = new ll10Ii1io1I(3);
/* 169 */                   ll10ii1io1i.I00000oOI = loooiloil;
/* 171 */                   ll10ii1io1i.I0000Il00O = ll10ii1io1iI00000oOI;
/* 173 */                   VarHandle.storeStoreFence();
/* 180 */                   I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(listenableFutureI0000O, o0iOII1liI.I00000oOI(ll10ii1io1i), iii11Ooi);
/* 186 */                   Illo11010 illo11010 = new Illo11010();
/* 189 */                   VarHandle.storeStoreFence();
/* 194 */                   I01iI0l00O i01iI0l00O = new I01iI0l00O(i01i1oII00100l0, illo11010);
/* 201 */                   i01i1oII00100l0.addListener(i01iI0l00O, l1i0oIO0.I00000oOI(iii11Ooi, i01iI0l00O));
/* 206 */                   loi1l0Io1I loi1l0io1i2 = new loi1l0Io1I(i2);
/* 209 */                   loi1l0io1i2.I00000oOI = this;
/* 211 */                   loi1l0io1i2.I0000O = i;
/* 213 */                   loi1l0io1i2.I0000Il00O = arrayList;
/* 215 */                   VarHandle.storeStoreFence();
/* 222 */                   return I01iIIO.I00100l0(i01iI0l00O, o0iOII1liI.I00000oOI(loi1l0io1i2), iii11Ooi);
                        case 2:
/* 73 */                    IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00000oOI;
/* 77 */                    I01i1oI i01i1oI = (I01i1oI) this.I0000Il00O;
/* 89 */                    iIlOoolol0ll.I001IO000((Uri) IlloOoiiO.I00000oIO((ListenableFuture) iIlOoolol0ll.I00iiO), obj);
                            synchronized (iIlOoolol0ll.I00l0OO0IO) {
/* 95 */                        iIlOoolol0ll.I00li1OI = i01i1oI;
                            }
/* 98 */                    return IlloOoiiO.I0000Il00O(obj);
                        case 3:
/* 66 */                    return ((loooIloil) this.I00000oOI).I00000oIO.I0000Il00O.I00111O((ll10Ii1io1I) this.I0000Il00O, Iii11Ooi.I00iOIl);
                        default:
/* 8 */                     o0OllIoI o0ollioi = (o0OllIoI) this.I00000oOI;
/* 10 */                    o0Ol1IO o0ol1ioI0000Il00O = o0IOOIili01o.I0000Il00O();
/* 14 */                    o0OllIoI o0ollioiI00000oOI = o0IOOIili01o.I00000oOI(o0ol1ioI0000Il00O, o0ollioi);
                            try {
/* 22 */                        ListenableFuture listenableFutureApply = ((I1Oll0OOO) this.I0000Il00O).apply(obj);
/* 26 */                        if (listenableFutureApply != null) {
/* 31 */                            return listenableFutureApply;
                                }
/* 39 */                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                            } catch (Throwable th) {
                                try {
/* 41 */                            o0I0o10l0Oo1.I00000oIO(th);
/* 44 */                            throw th;
                                } finally {
/* 46 */                            o0IOOIili01o.I00000oOI(o0ol1ioI0000Il00O, o0ollioiI00000oOI);
                                }
                            }
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 4:
/* 13 */                    I1Oll0OOO i1Oll0OOO = (I1Oll0OOO) this.I0000Il00O;
/* 27 */                    StringBuilder sb = new StringBuilder(i1Oll0OOO.toString().length() + 14);
/* 32 */                    sb.append("propagating=[");
/* 35 */                    sb.append(i1Oll0OOO);
/* 40 */                    sb.append("]");
/* 43 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
