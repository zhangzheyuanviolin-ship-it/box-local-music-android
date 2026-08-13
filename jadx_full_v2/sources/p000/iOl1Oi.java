            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public abstract class iOl1Oi {
                public static O1iil1I01o I00000oIO(String str, Iterable iterable) {
                    O1iii1olO o1iii1olO;
/* 3 */             Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 6 */             Iterator it = iterable.iterator();
                    while (true) {
/* 10 */                boolean zHasNext = it.hasNext();
/* 14 */                o1iii1olO = O1iii1olO.I00000oOI;
/* 16 */                if (!zHasNext) {
                            break;
                        }
/* 22 */                O1iil1I01o o1iil1I01o = (O1iil1I01o) it.next();
/* 24 */                if (o1iil1I01o != o1iii1olO) {
/* 28 */                    if (o1iil1I01o instanceof IO0ol0) {
/* 34 */                        IOOii0O10Io0.I00100o1O0lo(ol1O1o01, ((IO0ol0) o1iil1I01o).I0000Il00O);
                            } else {
/* 38 */                        ol1O1o01.add(o1iil1I01o);
                            }
                        }
                    }
/* 42 */            int i = ol1O1o01.I00iOIl;
/* 44 */            if (i == 0) {
/* 89 */                return o1iii1olO;
                    }
/* 48 */            if (i == 1) {
/* 75 */                return (O1iil1I01o) ol1O1o01.get(0);
                    }
/* 58 */            O1iil1I01o[] o1iil1I01oArr = (O1iil1I01o[]) ol1O1o01.toArray(new O1iil1I01o[0]);
/* 60 */            IO0ol0 iO0ol0 = new IO0ol0();
/* 63 */            iO0ol0.I00000oOI = str;
/* 65 */            iO0ol0.I0000Il00O = o1iil1I01oArr;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            return iO0ol0;
                }
            }
