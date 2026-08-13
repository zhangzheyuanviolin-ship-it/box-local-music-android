            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.Set;
            
            public final class Ii1iOiI01 implements IiiO1li1 {
                public Object I00000oIO;
                public Set I00000oOI;
                public Set I0000Il00O;
                public OI10i0Il I0000O;
                public OI10i0Il I0000oI00;

                @Override
                public final void I00000oOI() {
                    ArrayList arrayList;
/* 1 */             Object obj = this.I00000oIO;
/* 9 */             List list = (List) this.I0000O.getValue();
/* 14 */            if (list instanceof RandomAccess) {
/* 22 */                arrayList = new ArrayList(list.size());
/* 28 */                int size = list.size();
/* 33 */                for (int i = 0; i < size; i++) {
/* 43 */                    arrayList.add(((OI1llOooOl1) list.get(i)).I00000oOI);
                        }
                    } else {
/* 49 */                List list2 = list;
/* 59 */                arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 62 */                Iterator it = list2.iterator();
/* 70 */                while (it.hasNext()) {
/* 80 */                    arrayList.add(((OI1llOooOl1) it.next()).I00000oOI);
                        }
                    }
/* 96 */            if (!(arrayList.contains(obj) ? false : this.I00000oOI.remove(obj)) || this.I0000Il00O.contains(obj)) {
/* 245 */               return;
                    }
/* 112 */           List list3 = (List) this.I0000oI00.getValue();
/* 116 */           if (!(list3 instanceof RandomAccess)) {
/* 155 */               Iterator it2 = IOOi0Ool1i.I00OIo(list3).iterator();
/* 163 */               while (it2.hasNext()) {
/* 173 */                   ((OI1llilol0) it2.next()).I00000oIO.invoke(obj);
                        }
/* 245 */               return;
                    }
                    int size2 = list3.size() - 1;
/* 127 */           if (size2 < 0) {
/* 245 */               return;
                    }
                    while (true) {
                        int i2 = size2 - 1;
/* 139 */               ((OI1llilol0) list3.get(size2)).I00000oIO.invoke(obj);
/* 142 */               if (i2 < 0) {
/* 245 */                   return;
                        } else {
/* 145 */                   size2 = i2;
                        }
                    }
                }
            }
