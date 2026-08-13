            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class lOoii1 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [O1iil1I01o] */
                /* JADX WARN: Type inference failed for: r0v6, types: [IO0ol0, java.lang.Object] */
                public static O1iil1I01o I00000oIO(String str, Collection collection) {
                    O1iii1olO o1iii1olO;
/* 1 */             Collection collection2 = collection;
/* 11 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collection2, 10));
/* 14 */            Iterator it = collection2.iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                arrayList.add(((O0iIl1) it.next()).I00IoiI());
                    }
/* 38 */            Ol1O1o01 ol1O1o01I00000oOI = lO0oioOO.I00000oOI(arrayList);
/* 42 */            int i = ol1O1o01I00000oOI.I00iOIl;
/* 45 */            if (i == 0) {
/* 79 */                o1iii1olO = O1iii1olO.I00000oOI;
                    } else if (i != 1) {
/* 58 */                O1iil1I01o[] o1iil1I01oArr = (O1iil1I01o[]) ol1O1o01I00000oOI.toArray(new O1iil1I01o[0]);
/* 60 */                ?? iO0ol0 = new IO0ol0();
/* 63 */                iO0ol0.I00000oOI = str;
/* 65 */                iO0ol0.I0000Il00O = o1iil1I01oArr;
/* 67 */                VarHandle.storeStoreFence();
                        o1iii1olO = iO0ol0;
                    } else {
/* 76 */                o1iii1olO = (O1iil1I01o) ol1O1o01I00000oOI.get(0);
                    }
/* 83 */            if (ol1O1o01I00000oOI.I00iOIl <= 1) {
/* 85 */                return o1iii1olO;
                    }
/* 88 */            O0o101l o0o101l = new O0o101l();
/* 91 */            o0o101l.I0000Il00O = o1iii1olO;
/* 93 */            VarHandle.storeStoreFence();
/* 551 */           return o0o101l;
                }
            }
