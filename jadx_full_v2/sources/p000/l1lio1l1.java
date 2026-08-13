            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedList;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1lio1l1 {
                public static final Collection I00000oIO(Collection collection, Function1 function1) {
/* 6 */             if (collection.size() <= 1) {
/* 8 */                 return collection;
                    }
/* 11 */            LinkedList linkedList = new LinkedList(collection);
/* 16 */            Ol1OI1II0ll ol1OI1II0ll = new Ol1OI1II0ll();
/* 23 */            while (!linkedList.isEmpty()) {
/* 25 */                Object objI001lllioOl = IOOi0Ool1i.I001lllioOl(linkedList);
/* 31 */                Ol1OI1II0ll ol1OI1II0ll2 = new Ol1OI1II0ll();
/* 38 */                I00iiI i00iiI = new I00iiI(27);
/* 41 */                i00iiI.I00iiI = ol1OI1II0ll2;
/* 43 */                VarHandle.storeStoreFence();
/* 46 */                ArrayList arrayListI000II = OIlIlOllioi.I000II(objI001lllioOl, linkedList, function1, i00iiI);
/* 54 */                if (arrayListI000II.size() == 1 && ol1OI1II0ll2.isEmpty()) {
/* 66 */                    ol1OI1II0ll.add(IOOi0Ool1i.I00OOll1(arrayListI000II));
                        } else {
/* 70 */                    Object objI0010o = OIlIlOllioi.I0010o(arrayListI000II, function1);
/* 78 */                    IIiIoIl11IO iIiIoIl11IO = (IIiIoIl11IO) function1.invoke(objI0010o);
/* 80 */                    Iterator it = arrayListI000II.iterator();
/* 88 */                    while (it.hasNext()) {
/* 90 */                        Object next = it.next();
/* 104 */                       if (!OIlIlOllioi.I000iOII(iIiIoIl11IO, (IIiIoIl11IO) function1.invoke(next))) {
/* 106 */                           ol1OI1II0ll2.add(next);
                                }
                            }
/* 114 */                   if (!ol1OI1II0ll2.isEmpty()) {
/* 116 */                       ol1OI1II0ll.addAll(ol1OI1II0ll2);
                            }
/* 119 */                   ol1OI1II0ll.add(objI0010o);
                        }
                    }
/* 551 */           return ol1OI1II0ll;
                }
            }
