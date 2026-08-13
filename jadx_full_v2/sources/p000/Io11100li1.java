            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicLongArray;
            import p000.O00o1ll1I;
            
            public final class Io11100li1 {
                public static final IIlio101Io I000O01llI0;
                public static final O011oOIoO00O I000OOo1O;
                public static final Io11100li1 I000OiO;
                public static final List I000iOII;
                public Il11i1 I00000oIO;
                public HashMap I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;
                public boolean I0000oI00;
                public IlioO1 I0001Ioi1lo;
                public ArrayDeque I000II;

                static {
/* 1 */             IlioO1 ilioO1 = IlioO1.I0000O;
/* 5 */             Map map = Collections.EMPTY_MAP;
/* 7 */             List list = Collections.EMPTY_LIST;
/* 11 */            IIlio101Io iIlio101Io = new IIlio101Io(8);
/* 14 */            iIlio101Io.I00iiI = map;
/* 16 */            iIlio101Io.I00iiO = list;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            I000O01llI0 = iIlio101Io;
/* 25 */            O011oOIoO00O o011oOIoO00O = new O011oOIoO00O();
/* 28 */            o011oOIoO00O.I00iOIl = iIlio101Io;
/* 35 */            o011oOIoO00O.I00iiI = new ConcurrentHashMap();
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            I000OOo1O = o011oOIoO00O;
/* 44 */            Io11100li1 io11100li1 = new Io11100li1();
/* 47 */            Il11i1 il11i1 = Il11i1.I00iiO;
/* 49 */            io11100li1.I00000oIO = il11i1;
/* 56 */            io11100li1.I00000oOI = new HashMap();
/* 60 */            ArrayList arrayList = new ArrayList();
/* 63 */            io11100li1.I0000Il00O = arrayList;
/* 67 */            ArrayList arrayList2 = new ArrayList();
/* 70 */            io11100li1.I0000O = arrayList2;
/* 72 */            int i = 1;
/* 73 */            io11100li1.I0000oI00 = true;
/* 75 */            io11100li1.I0001Ioi1lo = ilioO1;
/* 79 */            ArrayDeque arrayDeque = new ArrayDeque();
/* 82 */            io11100li1.I000II = arrayDeque;
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            I000OiO = io11100li1;
/* 91 */            ArrayList arrayList3 = new ArrayList();
/* 96 */            arrayList3.add(OoOI01I0lI0.I001lllioOl);
/* 101 */           arrayList3.add(OIOiOOI.I0000Il00O);
/* 104 */           arrayList3.add(il11i1);
/* 111 */           if (!arrayList.isEmpty()) {
/* 115 */               ArrayList arrayList4 = new ArrayList(arrayList);
/* 118 */               Collections.reverse(arrayList4);
/* 121 */               arrayList3.addAll(arrayList4);
                    }
/* 128 */           if (!arrayList2.isEmpty()) {
/* 132 */               ArrayList arrayList5 = new ArrayList(arrayList2);
/* 135 */               Collections.reverse(arrayList5);
/* 138 */               arrayList3.addAll(arrayList5);
                    }
/* 141 */           List list2 = OlIi0i.I00000oIO;
/* 145 */           arrayList3.add(OoOI01I0lI0.I0010I0i);
/* 150 */           arrayList3.add(OoOI01I0lI0.I000II);
/* 155 */           arrayList3.add(OoOI01I0lI0.I0000O);
/* 160 */           arrayList3.add(OoOI01I0lI0.I0000oI00);
/* 165 */           arrayList3.add(OoOI01I0lI0.I0001Ioi1lo);
/* 168 */           OoO01OIiliI ooO01OIiliI = OoOI01I0lI0.I000iOII;
/* 178 */           arrayList3.add(OoOI01I0lI0.I0000Il00O(Long.TYPE, Long.class, ooO01OIiliI));
/* 191 */           arrayList3.add(OoOI01I0lI0.I0000Il00O(Double.TYPE, Double.class, OoOI01I0lI0.I000lI));
/* 204 */           arrayList3.add(OoOI01I0lI0.I0000Il00O(Float.TYPE, Float.class, OoOI01I0lI0.I000l1));
/* 209 */           arrayList3.add(OIOi01I.I00000oOI);
/* 214 */           arrayList3.add(OoOI01I0lI0.I000O01llI0);
/* 219 */           arrayList3.add(OoOI01I0lI0.I000OOo1O);
/* 222 */           Objects.requireNonNull(ooO01OIiliI);
/* 227 */           OoO011I0 ooO011I0 = new OoO011I0(1);
/* 230 */           ooO011I0.I00000oOI = ooO01OIiliI;
/* 232 */           VarHandle.storeStoreFence();
/* 245 */           arrayList3.add(OoOI01I0lI0.I00000oOI(AtomicLong.class, ooO011I0.I00000oIO()));
/* 250 */           int i2 = 0;
/* 251 */           OoO011I0 ooO011I02 = new OoO011I0(0);
/* 254 */           ooO011I02.I00000oOI = ooO01OIiliI;
/* 256 */           VarHandle.storeStoreFence();
/* 269 */           arrayList3.add(OoOI01I0lI0.I00000oOI(AtomicLongArray.class, ooO011I02.I00000oIO()));
/* 274 */           arrayList3.add(OoOI01I0lI0.I000OiO);
/* 279 */           arrayList3.add(OoOI01I0lI0.I000o00OoI0I);
/* 284 */           arrayList3.add(OoOI01I0lI0.I0010o);
/* 289 */           arrayList3.add(OoOI01I0lI0.I00111O);
/* 294 */           arrayList3.add(OoOI01I0lI0.I000oI1ioi);
/* 299 */           arrayList3.add(OoOI01I0lI0.I00100l0);
/* 304 */           arrayList3.add(OoOI01I0lI0.I00100o1O0lo);
/* 309 */           arrayList3.add(OoOI01I0lI0.I001IIilI0O);
/* 314 */           arrayList3.add(OoOI01I0lI0.I001IO000);
/* 319 */           arrayList3.add(OoOI01I0lI0.I001i1lo1io);
/* 324 */           arrayList3.add(OoOI01I0lI0.I001iOo1i0O);
/* 329 */           arrayList3.add(OoOI01I0lI0.I001lIiIIo1O);
/* 334 */           arrayList3.add(OoOI01I0lI0.I001i1O0Ol);
/* 339 */           arrayList3.add(OoOI01I0lI0.I00000oOI);
/* 344 */           arrayList3.add(Ii1llOil.I0000Il00O);
/* 349 */           arrayList3.add(OoOI01I0lI0.I001l0I00);
/* 352 */           O00o1ll1I.I00000oOI i00000oOI = null;
                    try {
/* 355 */               O00o1O0I01II o00o1O0I01II = O00o1ll1I.I00000oIO;
/* 369 */               ((O00o1ll1I) ((OoO1oO) O00o1ll1I.class.getDeclaredConstructor(null).newInstance(null))).getClass();
/* 372 */               i00000oOI = O00o1ll1I.I000OiO;
                    } catch (LinkageError | ReflectiveOperationException unused) {
                    }
/* 374 */           if (i00000oOI != null) {
/* 376 */               arrayList3.add(i00000oOI);
                    }
/* 381 */           arrayList3.addAll(OlIi0i.I00000oIO);
/* 386 */           arrayList3.add(I1IoI0o1.I0000Il00O);
/* 391 */           arrayList3.add(OoOI01I0lI0.I00000oIO);
/* 396 */           IOOi0I0 iOOi0I0 = new IOOi0I0(i2);
/* 399 */           iOOi0I0.I00iiI = iIlio101Io;
/* 401 */           VarHandle.storeStoreFence();
/* 404 */           arrayList3.add(iOOi0I0);
/* 409 */           IOOi0I0 iOOi0I02 = new IOOi0I0(i);
/* 412 */           iOOi0I02.I00iiI = iIlio101Io;
/* 414 */           VarHandle.storeStoreFence();
/* 417 */           arrayList3.add(iOOi0I02);
/* 420 */           arrayList3.add(o011oOIoO00O);
/* 425 */           arrayList3.add(OoOI01I0lI0.I001lloI);
/* 430 */           List listI00000oIO = I00000oIO(arrayDeque);
/* 434 */           OOoilIIoIo oOoilIIoIo = new OOoilIIoIo();
/* 437 */           oOoilIIoIo.I00iOIl = iIlio101Io;
/* 439 */           oOoilIIoIo.I00iiI = 1;
/* 441 */           oOoilIIoIo.I00iiO = il11i1;
/* 443 */           oOoilIIoIo.I00iio = o011oOIoO00O;
/* 445 */           oOoilIIoIo.I00ilI0I1 = listI00000oIO;
/* 447 */           VarHandle.storeStoreFence();
/* 450 */           arrayList3.add(oOoilIIoIo);
/* 453 */           arrayList3.trimToSize();
/* 460 */           I000iOII = Collections.unmodifiableList(arrayList3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static List I00000oIO(AbstractCollection abstractCollection) {
/* 5 */             if (abstractCollection.isEmpty()) {
/* 7 */                 return Collections.EMPTY_LIST;
                    }
/* 15 */            if (abstractCollection.size() == 1) {
/* 37 */                return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
                    }
/* 50 */            return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
                }
            }
