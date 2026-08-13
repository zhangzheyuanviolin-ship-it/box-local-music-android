            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OilO1oiooiII extends OilOIIlI {
                public static OilO0iOl I0000Il00O(Iterator it) {
/* 4 */             I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(4);
/* 7 */             i1Iolliil0i.I00000oOI = it;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            return I0000O(i1Iolliil0i);
                }

                public static OilO0iOl I0000O(OilO0iOl oilO0iOl) {
/* 3 */             if (oilO0iOl instanceof IOo0i10) {
/* 5 */                 return oilO0iOl;
                    }
/* 8 */             IOo0i10 iOo0i10 = new IOo0i10();
/* 16 */            iOo0i10.I00000oIO = new AtomicReference(oilO0iOl);
/* 18 */            VarHandle.storeStoreFence();
/* 49 */            return iOo0i10;
                }

                public static OilO0iOl I0000oI00(OilO0iOl oilO0iOl, int i) {
/* 1 */             if (i >= 0) {
                        return i == 0 ? oilO0iOl : oilO0iOl instanceof Iio0iiOlIOil ? ((Iio0iiOlIOil) oilO0iOl).I00000oOI(i) : new Iio0IO(oilO0iOl, i, 0);
                    }
/* 32 */            I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 35 */            return null;
                }

                public static IlIo0o I0001Ioi1lo(OilO0iOl oilO0iOl, Function1 function1) {
/* 4 */             return new IlIo0o(oilO0iOl, true, function1);
                }

                public static Object I000II(IlIo0o ilIo0o) {
/* 5 */             IlIloII10O ilIloII10O = (IlIloII10O) ilIo0o.iterator();
/* 11 */            if (ilIloII10O.hasNext()) {
/* 15 */                return ilIloII10O.next();
                    }
/* 13 */            return null;
                }

                public static final IlOIIioI1 I000O01llI0(OilO0iOl oilO0iOl) {
/* 4 */             OiioI1Io0o oiioI1Io0o = new OiioI1Io0o(2);
/* 9 */             if (!(oilO0iOl instanceof OoI10o0iO11O)) {
/* 31 */                return new IlOIIioI1(oilO0iOl, new OiioI1Io0o(3), oiioI1Io0o);
                    }
/* 11 */            OoI10o0iO11O ooI10o0iO11O = (OoI10o0iO11O) oilO0iOl;
/* 19 */            return new IlOIIioI1(ooI10o0iO11O.I00000oIO, ooI10o0iO11O.I00000oOI, oiioI1Io0o);
                }

                public static OilO0iOl I000OOo1O(IllOOo00lI illOOo00lI) {
/* 7 */             I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(14);
/* 10 */            i11i0ol0l0.I00iiI = illOOo00lI;
/* 12 */            VarHandle.storeStoreFence();
/* 18 */            return I0000O(new IlIl0l(illOOo00lI, i11i0ol0l0));
                }

                public static OilO0iOl I000OiO(Object obj, Function1 function1) {
/* 1 */             if (obj == null) {
/* 3 */                 return Il01lilOo00I.I00000oIO;
                    }
/* 12 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(25);
/* 15 */            oIOo1iiI.I00iiI = obj;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return new IlIl0l(oIOo1iiI, function1);
                }

                public static String I000iOII(OilO0iOl oilO0iOl, String str) throws IOException {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append((CharSequence) "");
/* 15 */            int i = 0;
/* 20 */            for (Object obj : oilO0iOl) {
/* 27 */                i++;
/* 28 */                if (i > 1) {
/* 30 */                    sb.append((CharSequence) str);
                        }
/* 34 */                OlOoOOooiIll.I00000oIO(sb, obj, null);
                    }
/* 38 */            sb.append((CharSequence) "");
/* 41 */            return sb.toString();
                }

                public static Object I000l1(OilO0iOl oilO0iOl) {
/* 1 */             Iterator it = oilO0iOl.iterator();
/* 9 */             if (!it.hasNext()) {
/* 29 */                OIiilo1Ool0o.I000II("Sequence is empty.");
/* 32 */                return null;
                    }
/* 11 */            Object next = it.next();
/* 19 */            while (it.hasNext()) {
/* 21 */                next = it.next();
                    }
/* 26 */            return next;
                }

                public static List I000lI(OilO0iOl oilO0iOl) {
/* 1 */             Iterator it = oilO0iOl.iterator();
/* 9 */             if (!it.hasNext()) {
/* 11 */                return Il01100l.I00iOIl;
                    }
/* 14 */            Object next = it.next();
/* 22 */            if (!it.hasNext()) {
/* 24 */                return Collections.singletonList(next);
                    }
/* 31 */            ArrayList arrayList = new ArrayList();
/* 34 */            arrayList.add(next);
/* 41 */            while (it.hasNext()) {
/* 47 */                arrayList.add(it.next());
                    }
/* 186 */           return arrayList;
                }
            }
