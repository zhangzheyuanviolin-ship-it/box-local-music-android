            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IOl1o0IioiI0 implements OIo0loI111I1 {
                public final List I00000oIO;
                public final String I00000oOI;

                public IOl1o0IioiI0(List list, String str) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = str;
/* 8 */             list.size();
/* 17 */            IOOi0Ool1i.I00iio(list).size();
                }

                @Override
                public final boolean I00000oIO(Ill0IO ill0IO) {
/* 1 */             List list = this.I00000oIO;
/* 7 */             if ((list instanceof Collection) && list.isEmpty()) {
/* 43 */                return true;
                    }
/* 19 */            Iterator it = list.iterator();
/* 27 */            while (it.hasNext()) {
/* 39 */                if (!((OIo0loI111I1) it.next()).I00000oIO(ill0IO)) {
/* 41 */                    return false;
                        }
                    }
/* 43 */            return true;
                }

                @Override
                public final void I00000oOI(Ill0IO ill0IO, ArrayList arrayList) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((OIo0loI111I1) it.next()).I00000oOI(ill0IO, arrayList);
                    }
                }

                @Override
                public final Collection I000O01llI0(Ill0IO ill0IO, Function1 function1) {
/* 3 */             HashSet hashSet = new HashSet();
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                hashSet.addAll(((OIo0loI111I1) it.next()).I000O01llI0(ill0IO, function1));
                    }
/* 89 */            return hashSet;
                }

                public final String toString() {
/* 1 */             return this.I00000oOI;
                }
            }
