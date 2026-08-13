            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class l11o1O1 {
                public static final OlIo1o0I0iIo I00000oIO(OI000ilOol oI000ilOol, OI000ilOol oI000ilOol2) {
/* 5 */             oI000ilOol.I00io1l().size();
/* 12 */            oI000ilOol2.I00io1l().size();
/* 15 */            List listI00io1l = oI000ilOol.I00io1l();
/* 29 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00io1l, 10));
/* 32 */            Iterator it = listI00io1l.iterator();
/* 40 */            while (it.hasNext()) {
/* 52 */                arrayList.add(((OoOOiO) it.next()).I000OOo1O());
                    }
/* 56 */            List listI00io1l2 = oI000ilOol2.I00io1l();
/* 68 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00io1l2, 10));
/* 71 */            Iterator it2 = listI00io1l2.iterator();
/* 79 */            while (it2.hasNext()) {
/* 96 */                arrayList2.add(new OlIo1I(((OoOOiO) it2.next()).I00Ol10()));
                    }
/* 104 */           Map mapI000OiO = O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList, arrayList2));
/* 111 */           OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(1);
/* 114 */           olIo1o0I0iIo.I0000O = mapI000OiO;
/* 116 */           VarHandle.storeStoreFence();
/* 551 */           return olIo1o0I0iIo;
                }
            }
