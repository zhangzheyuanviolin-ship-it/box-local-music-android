            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iO1oo0Ilo {
                public static void I00000oIO(OI1o0olI oI1o0olI, String str, List list, Function1 function1, Function1 function12, IOii1l iOii1l, int i) {
/* 1 */             int i2 = i & 2;
/* 3 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 5 */             if (i2 != 0) {
/* 7 */                 list = il01100l;
                    }
/* 11 */            if ((i & 8) != 0) {
/* 13 */                function1 = null;
                    }
/* 16 */            if ((i & 16) != 0) {
/* 18 */                function12 = null;
                    }
/* 21 */            OII1IlOi0 oII1IlOi0 = oI1o0olI.I0001Ioi1lo;
/* 23 */            oII1IlOi0.getClass();
/* 36 */            IOl00O1iI1Oo iOl00O1iI1Oo = (IOl00O1iI1Oo) oII1IlOi0.I00000oOI(l1iOoIO.I00000oIO(IOl00O1iI1Oo.class));
/* 38 */            IOl00OI iOl00OI = new IOl00OI(iOl00O1iI1Oo, str);
/* 41 */            iOl00OI.I0001Ioi1lo = iOl00O1iI1Oo;
/* 43 */            iOl00OI.I000II = iOii1l;
/* 45 */            VarHandle.storeStoreFence();
/* 58 */            for (OI1Iooo1I oI1Iooo1I : list) {
/* 72 */                iOl00OI.I0000Il00O.put(oI1Iooo1I.I00000oIO, oI1Iooo1I.I00000oOI);
                    }
/* 76 */            Iterator<E> it = il01100l.iterator();
/* 84 */            while (it.hasNext()) {
/* 94 */                iOl00OI.I0000O.add((OI1iiIoI0OOi) it.next());
                    }
/* 98 */            iOl00OI.I000O01llI0 = function1;
/* 100 */           iOl00OI.I000OOo1O = function12;
/* 102 */           iOl00OI.I000OiO = function1;
/* 104 */           iOl00OI.I000iOII = function12;
/* 112 */           oI1o0olI.I000O01llI0.add(iOl00OI.I00000oIO());
                }
            }
