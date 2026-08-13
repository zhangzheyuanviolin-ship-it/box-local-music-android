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
            
            public final class ll1lol0i {
                public static final i0O1lIi1O0IO I000II;
                public static final o00010OI0o I000O01llI0;
                public static final ll1lol0i I000OOo1O;
                public static final List I000OiO;
                public lloI11II0o0 I00000oIO;
                public HashMap I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;
                public ArrayDeque I0000oI00;
                public int I0001Ioi1lo;

                static {
/* 1 */             ll1OilIOill ll1oilioill = ll1OilIOill.I0000O;
/* 5 */             Map map = Collections.EMPTY_MAP;
/* 7 */             List list = Collections.EMPTY_LIST;
/* 11 */            i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(12);
/* 14 */            i0o1lii1o0io.I00iiI = list;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I000II = i0o1lii1o0io;
/* 23 */            o00010OI0o o00010oi0o = new o00010OI0o();
/* 26 */            o00010oi0o.I00iiI = i0o1lii1o0io;
/* 33 */            o00010oi0o.I00iiO = new ConcurrentHashMap();
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            I000O01llI0 = o00010oi0o;
/* 42 */            ll1lol0i ll1lol0iVar = new ll1lol0i();
/* 45 */            lloI11II0o0 lloi11ii0o0 = lloI11II0o0.I00iiO;
/* 47 */            ll1lol0iVar.I00000oIO = lloi11ii0o0;
/* 50 */            ll1lol0iVar.I0001Ioi1lo = 1;
/* 57 */            ll1lol0iVar.I00000oOI = new HashMap();
/* 61 */            ArrayList arrayList = new ArrayList();
/* 64 */            ll1lol0iVar.I0000Il00O = arrayList;
/* 68 */            ArrayList arrayList2 = new ArrayList();
/* 71 */            ll1lol0iVar.I0000O = arrayList2;
/* 78 */            ll1lol0iVar.I0000oI00 = new ArrayDeque();
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            I000OOo1O = ll1lol0iVar;
/* 87 */            ArrayList arrayList3 = new ArrayList();
/* 92 */            arrayList3.add(o01IIliilo.I001lllioOl);
/* 97 */            arrayList3.add(loiiO1l.I00000oOI);
/* 100 */           arrayList3.add(lloi11ii0o0);
/* 107 */           if (!arrayList.isEmpty()) {
/* 111 */               ArrayList arrayList4 = new ArrayList(arrayList);
/* 114 */               Collections.reverse(arrayList4);
/* 117 */               arrayList3.addAll(arrayList4);
                    }
/* 124 */           if (!arrayList2.isEmpty()) {
/* 128 */               ArrayList arrayList5 = new ArrayList(arrayList2);
/* 131 */               Collections.reverse(arrayList5);
/* 134 */               arrayList3.addAll(arrayList5);
                    }
/* 137 */           List list2 = o0IIlili.I00000oIO;
/* 141 */           arrayList3.add(o01IIliilo.I0010I0i);
/* 146 */           arrayList3.add(o01IIliilo.I000II);
/* 151 */           arrayList3.add(o01IIliilo.I0000O);
/* 156 */           arrayList3.add(o01IIliilo.I0000oI00);
/* 161 */           arrayList3.add(o01IIliilo.I0001Ioi1lo);
/* 164 */           loi0OO1oo1o loi0oo1oo1o = o01IIliilo.I000iOII;
/* 175 */           arrayList3.add(new o000OlilI01O(Long.TYPE, Long.class, loi0oo1oo1o));
/* 189 */           arrayList3.add(new o000OlilI01O(Double.TYPE, Double.class, o01IIliilo.I000lI));
/* 203 */           arrayList3.add(new o000OlilI01O(Float.TYPE, Float.class, o01IIliilo.I000l1));
/* 208 */           arrayList3.add(loiIi00o0I0.I00000oIO);
/* 213 */           arrayList3.add(o01IIliilo.I000O01llI0);
/* 218 */           arrayList3.add(o01IIliilo.I000OOo1O);
/* 221 */           Objects.requireNonNull(loi0oo1oo1o);
/* 227 */           o0I100l0o0O o0i100l0o0o = new o0I100l0o0O(4);
/* 230 */           o0i100l0o0o.I00000oOI = loi0oo1oo1o;
/* 232 */           VarHandle.storeStoreFence();
/* 247 */           arrayList3.add(new o00010OI0o(AtomicLong.class, o0i100l0o0o.I00000oOI(), 0));
/* 253 */           o0I100l0o0O o0i100l0o0o2 = new o0I100l0o0O(3);
/* 256 */           o0i100l0o0o2.I00000oOI = loi0oo1oo1o;
/* 258 */           VarHandle.storeStoreFence();
/* 272 */           arrayList3.add(new o00010OI0o(AtomicLongArray.class, o0i100l0o0o2.I00000oOI(), 0));
/* 277 */           arrayList3.add(o01IIliilo.I000OiO);
/* 282 */           arrayList3.add(o01IIliilo.I000o00OoI0I);
/* 287 */           arrayList3.add(o01IIliilo.I0010o);
/* 292 */           arrayList3.add(o01IIliilo.I00111O);
/* 297 */           arrayList3.add(o01IIliilo.I000oI1ioi);
/* 302 */           arrayList3.add(o01IIliilo.I00100l0);
/* 307 */           arrayList3.add(o01IIliilo.I00100o1O0lo);
/* 312 */           arrayList3.add(o01IIliilo.I001IIilI0O);
/* 317 */           arrayList3.add(o01IIliilo.I001IO000);
/* 322 */           arrayList3.add(o01IIliilo.I001i1lo1io);
/* 327 */           arrayList3.add(o01IIliilo.I001iOo1i0O);
/* 332 */           arrayList3.add(o01IIliilo.I001lIiIIo1O);
/* 337 */           arrayList3.add(o01IIliilo.I001i1O0Ol);
/* 342 */           arrayList3.add(o01IIliilo.I00000oOI);
/* 347 */           arrayList3.add(loIlOiOii.I0000oI00);
/* 352 */           arrayList3.add(o01IIliilo.I001l0I00);
                    try {
/* 370 */               if (Class.forName("O00o1ll1I").getDeclaredConstructor(null).newInstance(null) == null) {
/* 372 */                   throw null;
                        }
/* 378 */               throw new ClassCastException();
                    } catch (LinkageError | ReflectiveOperationException unused) {
/* 381 */               arrayList3.addAll(o0IIlili.I00000oIO);
/* 386 */               arrayList3.add(loIlOiOii.I0000O);
/* 391 */               arrayList3.add(o01IIliilo.I00000oIO);
/* 396 */               i0O1lIi1O0IO i0o1lii1o0io2 = I000II;
/* 398 */               loO01lio0 loo01lio0 = new loO01lio0(0);
/* 401 */               loo01lio0.I00iiI = i0o1lii1o0io2;
/* 403 */               VarHandle.storeStoreFence();
/* 406 */               arrayList3.add(loo01lio0);
/* 411 */               loO01lio0 loo01lio02 = new loO01lio0(1);
/* 414 */               loo01lio02.I00iiI = i0o1lii1o0io2;
/* 416 */               VarHandle.storeStoreFence();
/* 419 */               arrayList3.add(loo01lio02);
/* 422 */               o00010OI0o o00010oi0o2 = I000O01llI0;
/* 424 */               arrayList3.add(o00010oi0o2);
/* 429 */               arrayList3.add(o01IIliilo.I001lloI);
/* 432 */               int i = ll1lol0iVar.I0001Ioi1lo;
/* 438 */               List listI00000oIO = I00000oIO(ll1lol0iVar.I0000oI00);
/* 442 */               lolIOiliI lolioilii = new lolIOiliI();
/* 445 */               lolioilii.I00iOIl = i0o1lii1o0io2;
/* 447 */               lolioilii.I00ilI0I1 = i;
/* 449 */               lolioilii.I00iiI = lloi11ii0o0;
/* 451 */               lolioilii.I00iiO = o00010oi0o2;
/* 453 */               lolioilii.I00iio = listI00000oIO;
/* 455 */               VarHandle.storeStoreFence();
/* 458 */               arrayList3.add(lolioilii);
/* 461 */               arrayList3.trimToSize();
/* 468 */               I000OiO = Collections.unmodifiableList(arrayList3);
                    }
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
