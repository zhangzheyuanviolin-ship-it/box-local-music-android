            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.EnumSet;
            import java.util.HashSet;
            
            public final class I1lOli implements OO011Oooil {
                @Override
                public final void I00000oIO(I0oiil10Ili i0oiil10Ili) {
/* 3 */             I1lOollOi1o i1lOollOi1o = new I1lOollOi1o();
/* 8 */             EnumSet.allOf(O1001oo.class);
/* 11 */            O1001oo o1001oo = O1001oo.I00iOIl;
/* 13 */            O1001oo o1001oo2 = O1001oo.I00iiI;
/* 15 */            EnumSet enumSetOf = EnumSet.of(o1001oo, o1001oo2);
/* 19 */            if (enumSetOf == null) {
/* 103 */               IOOlIIilOl0.I000II("linkTypes must not be null");
/* 186 */               return;
                    }
/* 23 */            HashSet hashSet = new HashSet(enumSetOf);
/* 30 */            Iioi0lilII iioi0lilII = null;
/* 41 */            iolOOiI iolooii = hashSet.contains(o1001oo) ? new iolOOiI(16) : null;
/* 58 */            IIIOlol iIIOlol = hashSet.contains(O1001oo.I00iiO) ? new IIIOlol(17) : null;
/* 63 */            if (hashSet.contains(o1001oo2)) {
/* 69 */                iioi0lilII = new Iioi0lilII(11);
/* 72 */                VarHandle.storeStoreFence();
                    }
/* 79 */            IOO000ilo iOO000ilo = new IOO000ilo(18);
/* 82 */            iOO000ilo.I00iiI = iolooii;
/* 84 */            iOO000ilo.I00iiO = iIIOlol;
/* 86 */            iOO000ilo.I00iio = iioi0lilII;
/* 88 */            VarHandle.storeStoreFence();
/* 91 */            i1lOollOi1o.I00000oIO = iOO000ilo;
/* 97 */            ((ArrayList) i0oiil10Ili.I00ilI0I1).add(i1lOollOi1o);
                }
            }
