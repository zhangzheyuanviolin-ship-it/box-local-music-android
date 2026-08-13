            package p000;

            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import java.util.Set;
            
            public final class Ii1iOil1o implements IiiO1li1 {
                public Set I00000oIO;
                public Object I00000oOI;
                public Set I0000Il00O;
                public OI10i0Il I0000O;

                @Override
                public final void I00000oOI() {
/* 1 */             Set set = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
/* 5 */             boolean zRemove = set.remove(obj);
/* 15 */            if (this.I0000Il00O.contains(obj) || !zRemove) {
/* 110 */               return;
                    }
/* 25 */            List list = (List) this.I0000O.getValue();
/* 29 */            if (!(list instanceof RandomAccess)) {
/* 68 */                Iterator it = IOOi0Ool1i.I00OIo(list).iterator();
/* 76 */                while (it.hasNext()) {
/* 86 */                    ((OI1llilol0) it.next()).I00000oIO.invoke(obj);
                        }
/* 110 */               return;
                    }
                    int size = list.size() - 1;
/* 40 */            if (size < 0) {
/* 110 */               return;
                    }
                    while (true) {
                        int i = size - 1;
/* 52 */                ((OI1llilol0) list.get(size)).I00000oIO.invoke(obj);
/* 55 */                if (i < 0) {
/* 110 */                   return;
                        } else {
/* 58 */                    size = i;
                        }
                    }
                }
            }
