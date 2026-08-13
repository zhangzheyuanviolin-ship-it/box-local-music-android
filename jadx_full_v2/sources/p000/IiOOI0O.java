            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IiOOI0O implements Function1 {
                public final int I00iOIl;
                public OI000ilOol I00iiI;

                public IiOOI0O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OI000ilOol oI000ilOol = this.I00iiI;
                    switch (i) {
                        case 0:
/* 64 */                    OI0l0000lOo oI0l0000lOo = (OI0l0000lOo) obj;
/* 66 */                    List listI00io1l = oI000ilOol.I00io1l();
/* 78 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00io1l, 10));
/* 81 */                    Iterator it = listI00io1l.iterator();
/* 89 */                    while (it.hasNext()) {
/* 102 */                       arrayList.add(new O0O0iO(oI0l0000lOo, (OoOOiO) it.next()));
                            }
/* 106 */                   return arrayList;
                        case 1:
/* 23 */                    Collection collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
/* 35 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(collectionI0000oI00, 10));
/* 38 */                    Iterator it2 = collectionI0000oI00.iterator();
/* 46 */                    while (it2.hasNext()) {
/* 59 */                        arrayList2.add(new IiOOIlll((O0iIl1) it2.next()));
                            }
/* 63 */                    return arrayList2;
                        default:
/* 12 */                    IiOiOOIo.I0001Ioi1lo(oI000ilOol);
/* 15 */                    return null;
                    }
                }
            }
