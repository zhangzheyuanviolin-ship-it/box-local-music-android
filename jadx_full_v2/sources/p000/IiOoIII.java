            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IiOoIII extends I01I01Oolii {
                public IiOili0lOO1 I00li1OI;
                public OOi0O1i1lOi I00ll1;
                public IiOillIi I00lli11;

                @Override
                public final List I010ioo() {
/* 1 */             OOi0O1i1lOi oOi0O1i1lOi = this.I00ll1;
/* 3 */             IiOili0lOO1 iiOili0lOO1 = this.I00li1OI;
/* 9 */             List listI000iOII = lIOOli.I000iOII(oOi0O1i1lOi, (Oi0Oooi) iiOili0lOO1.I00ilI0I1);
/* 17 */            if (listI000iOII.isEmpty()) {
/* 27 */                return Collections.singletonList(IiOiOOIo.I0000oI00(this).I000oI1ioi());
                    }
/* 32 */            List list = listI000iOII;
/* 36 */            IOiOol0 iOiOol0 = (IOiOol0) iiOili0lOO1.I00l0I0l0lO1;
/* 46 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 49 */            Iterator it = list.iterator();
/* 57 */            while (it.hasNext()) {
/* 69 */                arrayList.add(iOiOol0.I00Io1lO((OOi001oo1OOI) it.next()));
                    }
/* 113 */           return arrayList;
                }

                @Override
                public final I11IlOOO getAnnotations() {
/* 1 */             return this.I00lli11;
                }
            }
