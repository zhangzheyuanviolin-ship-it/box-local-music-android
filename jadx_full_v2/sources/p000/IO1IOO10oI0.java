            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IO1IOO10oI0 implements Function1 {
                public final int I00iOIl;
                public List I00iiI;

                public IO1IOO10oI0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            List list = this.I00iiI;
                    switch (i) {
                        case 0:
/* 112 */                   int size = list.size();
/* 119 */                   I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(5);
/* 122 */                   i0O11IOOo0OI.I00iiI = list;
/* 124 */                   VarHandle.storeStoreFence();
/* 130 */                   IO1O0O io1o0o = new IO1O0O(0);
/* 133 */                   io1o0o.I00iiI = list;
/* 135 */                   VarHandle.storeStoreFence();
/* 143 */                   ((O0lolo) obj).I0000oI00(size, null, i0O11IOOo0OI, new IOii1l(802480018, io1o0o, true));
/* 146 */                   return ooiIlOl1iI;
                        case 1:
/* 59 */                    O0lolo o0lolo = (O0lolo) obj;
/* 65 */                    if (list.isEmpty()) {
/* 70 */                        O0lolo.I0000O(o0lolo, null, i1iI1IiII.I0000oI00, 3);
                            } else {
/* 74 */                        int size2 = list.size();
/* 82 */                        I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(18);
/* 85 */                        i0O11IOOo0OI2.I00iiI = list;
/* 87 */                        VarHandle.storeStoreFence();
/* 93 */                        IO1O0O io1o0o2 = new IO1O0O(2);
/* 96 */                        io1o0o2.I00iiI = list;
/* 98 */                        VarHandle.storeStoreFence();
/* 106 */                       o0lolo.I0000oI00(size2, null, i0O11IOOo0OI2, new IOii1l(802480018, io1o0o2, true));
                            }
/* 109 */                   return ooiIlOl1iI;
                        case 2:
/* 40 */                    int iIntValue = ((Integer) obj).intValue();
/* 50 */                    if (list.get(iIntValue) instanceof Oii11i01O) {
/* 54 */                        return Oi010OO0.I000oI1ioi(iIntValue, "m");
                            }
/* 7 */                     return null;
                        default:
/* 17 */                    Iterator it = list.iterator();
/* 25 */                    while (it.hasNext()) {
/* 33 */                        ((IiIO1ol1i1o0) it.next()).I00000oOI();
                            }
/* 37 */                    return ooiIlOl1iI;
                    }
                }
            }
