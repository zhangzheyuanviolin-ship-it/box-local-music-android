            package p000;

            import android.os.SystemClock;
            import com.google.mlkit.vision.barcode.internal.zzk;
            import com.google.mlkit.vision.text.internal.zzr;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.concurrent.Executors;
            import java.util.concurrent.TimeUnit;
            
            public final class ll1lI01ilI1 implements Runnable {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public ll1lI01ilI1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 229 */                   ((lOii1o) this.I00iiO).run();
/* 232 */                   long j = this.I00iiI;
/* 236 */                   TimeUnit timeUnit = (TimeUnit) this.I00ilI0I1;
/* 240 */                   OI011o1 oI011o1 = (OI011o1) this.I00iio;
/* 242 */                   oI011o1.getClass();
/* 251 */                   OoIlol ooIlol = new OoIlol(Executors.callable(this, null));
/* 262 */                   OI011Ol0looI oI011Ol0looI = new OI011Ol0looI(ooIlol, oI011o1.I00iiI.schedule(ooIlol, j, timeUnit));
/* 267 */                   IlloO1 illoO1 = new IlloO1(1);
/* 270 */                   illoO1.I00iiI = oI011Ol0looI;
/* 272 */                   VarHandle.storeStoreFence();
/* 277 */                   oI011Ol0looI.addListener(illoO1, Iii11Ooi.I00iOIl);
/* 280 */                   return;
                        case 1:
/* 93 */                    loloOlli1l0 loloolli1l0 = (loloOlli1l0) this.I00iiO;
/* 95 */                    liOll1O lioll1o = liOll1O.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
/* 99 */                    ilooIOio ilooioio = (ilooIOio) this.I00iio;
/* 101 */                   long j2 = this.I00iiI;
/* 105 */                   zzr zzrVar = (zzr) this.I00ilI0I1;
/* 107 */                   HashMap map = loloolli1l0.I000OiO;
/* 113 */                   if (!map.containsKey(lioll1o)) {
/* 120 */                       iI0iIIo ii0iiio = new iI0iIIo(4);
/* 123 */                       iO0OOlIoo00 io0oolioo00 = new iO0OOlIoo00();
/* 130 */                       if (!ii0iiio.isEmpty()) {
/* 138 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 141 */                           throw null;
                                }
/* 132 */                       io0oolioo00.I00iiO = ii0iiio;
/* 134 */                       map.put(lioll1o, io0oolioo00);
                            }
/* 146 */                   iO0OOlIoo00 io0oolioo002 = (iO0OOlIoo00) map.get(lioll1o);
/* 148 */                   Long lValueOf = Long.valueOf(j2);
/* 152 */                   iI0iIIo ii0iiio2 = io0oolioo002.I00iiO;
/* 158 */                   Collection collection = (Collection) ii0iiio2.get(ilooioio);
/* 160 */                   if (collection == null) {
/* 165 */                       ArrayList arrayList = new ArrayList(3);
/* 172 */                       if (!arrayList.add(lValueOf)) {
/* 180 */                           I000II.I000O01llI0("New Collection violated the Collection spec");
/* 224 */                           return;
                                }
/* 174 */                       ii0iiio2.put(ilooioio, arrayList);
                            } else {
/* 184 */                       collection.add(lValueOf);
                            }
/* 187 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 195 */                   if (loloolli1l0.I0000oI00(lioll1o, jElapsedRealtime)) {
/* 204 */                       loloolli1l0.I000OOo1O.put(lioll1o, Long.valueOf(jElapsedRealtime));
/* 211 */                       l0iOoII1Il l0iooii1il = new l0iOoII1Il(13);
/* 214 */                       l0iooii1il.I00iiI = loloolli1l0;
/* 216 */                       l0iooii1il.I00iiO = zzrVar;
/* 218 */                       VarHandle.storeStoreFence();
/* 221 */                       io1OllI.I00000oIO(1, l0iooii1il);
/* 224 */                       return;
                            }
/* 224 */                   return;
                        default:
/* 10 */                    o0OiOio o0oioio = (o0OiOio) this.I00iiO;
/* 12 */                    lliOo1oo llioo1oo = lliOo1oo.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
/* 16 */                    ioi1lOIlO1 ioi1loilo1 = (ioi1lOIlO1) this.I00iio;
/* 18 */                    long j3 = this.I00iiI;
/* 22 */                    zzk zzkVar = (zzk) this.I00ilI0I1;
/* 24 */                    HashMap map2 = o0oioio.I000OiO;
/* 30 */                    if (!map2.containsKey(llioo1oo)) {
/* 37 */                        map2.put(llioo1oo, new iii1IlooII());
                            }
/* 50 */                    ((iii1IlooII) map2.get(llioo1oo)).I0000O(ioi1loilo1, Long.valueOf(j3));
/* 53 */                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 61 */                    if (o0oioio.I0000oI00(llioo1oo, jElapsedRealtime2)) {
/* 70 */                        o0oioio.I000OOo1O.put(llioo1oo, Long.valueOf(jElapsedRealtime2));
/* 77 */                        IlloOIoilIl illoOIoilIl = new IlloOIoilIl(14);
/* 80 */                        illoOIoilIl.I00iiI = o0oioio;
/* 82 */                        illoOIoilIl.I00iiO = zzkVar;
/* 84 */                        VarHandle.storeStoreFence();
/* 87 */                        io1OllI.I00000oIO(1, illoOIoilIl);
/* 90 */                        return;
                            }
/* 90 */                    return;
                    }
                }
            }
