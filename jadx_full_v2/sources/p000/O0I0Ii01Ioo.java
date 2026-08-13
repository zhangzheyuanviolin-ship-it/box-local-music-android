            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O0I0Ii01Ioo implements IllOOo00lI {
                public final int I00iOIl;
                public OI0011 I00iiI;

                public O0I0Ii01Ioo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI0011 oi0011 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 136 */                   O0I0OI o0i0oi = new O0I0OI();
/* 139 */                   o0i0oi.I00000oIO = oi0011;
/* 141 */                   VarHandle.storeStoreFence();
/* 144 */                   return o0i0oi;
                        case 1:
/* 17 */                    O1OIll00i o1OIll00i = oi0011.I00io1l;
/* 19 */                    if (o1OIll00i == null) {
/* 129 */                       I000II.I000O01llI0(IIl001iO0Io.I00100l0(new StringBuilder("Dependencies of module "), oi0011.getName().I00iOIl, " were not set before querying module content"));
/* 132 */                       return null;
                            }
/* 23 */                    List list = (List) o1OIll00i.I00iiI;
/* 25 */                    oi0011.I010i10l();
/* 28 */                    list.contains(oi0011);
/* 31 */                    List list2 = list;
/* 33 */                    Iterator it = list2.iterator();
/* 41 */                    while (it.hasNext()) {
/* 49 */                        ((OI0011) it.next()).getClass();
                            }
/* 61 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 64 */                    Iterator it2 = list2.iterator();
/* 72 */                    while (it2.hasNext()) {
/* 82 */                        arrayList.add(((OI0011) it2.next()).I00ioIO);
                            }
/* 106 */                   return new IOl1o0IioiI0(arrayList, "CompositeProvider@ModuleDescriptor for " + oi0011.getName());
                        default:
/* 14 */                    return oi0011.I00i0ilIl0i(OlIlllOI1.I000OOo1O).I00io1l;
                    }
                }
            }
